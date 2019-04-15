import { Config } from '@app/config'
import { ConnectionFactory } from '@app/db'
import { Connection } from 'typeorm'
import Web3 from 'web3'
import { WebsocketProvider } from 'web3-providers'
import { Erc20BalanceView } from '@app/db/entities/erc20-balance.view'
import { AbiItem } from 'web3-utils'
import ora = require('ora')
import BN = require('bn.js')

const erc20Abi: AbiItem[] = [
  // balanceOf
  {
    'constant': true,
    'inputs': [{ 'name': '_owner', 'type': 'address' }],
    'name': 'balanceOf',
    'outputs': [{ 'name': 'balance', 'type': 'uint256' }],
    'type': 'function',
    'payable': false,
    'stateMutability': 'view'
  },
  // decimals
  {
    'constant': true,
    'inputs': [],
    'name': 'decimals',
    'outputs': [{ 'name': '', 'type': 'uint8' }],
    'type': 'function',
    'payable': false,
    'stateMutability': 'view'
  }
]

export async function Erc20Balances(config: Config, blockNumber: number = undefined) {

  const spinner = ora('Checking erc20 balances').start()

  const web3 = new Web3(new WebsocketProvider(config.web3.wsUrl))
  const connection = await ConnectionFactory(config)

  let offset = 0
  const limit = 200
  let progress = 0

  let [balances, count] = [[], 0]

  let matched = 0
  const differences = []
  const errors = [];

  do {
    [balances, count] = await fetchBalances(connection, offset, limit)

    const comparisons = balances.map(async actual => {

      const { address, amount } = actual

      const contract = new web3.eth.Contract(erc20Abi, actual.contract)

      try {

        const balance = await contract.methods
              .balanceOf(address)
              .call({ from: '0xde0B295669a9FD93d5F28D9Ec85E40f4cb697BAe' }) as BN

        const expected = balance ? balance.toString() : undefined;

        if (expected === amount) {
          matched += 1
        } else {
          differences.push(`[Diff] Contract: '${contract.address}', address = '${address}' \texpected = ${expected} \tactual = ${amount}`)
        }

      } catch (e) {
        errors.push(`[Error] Contract: '${contract.address}', address = '${address}', \terror = ${e.message}`)
      }

    })

    await Promise.all(comparisons)

    offset += limit
    progress += comparisons.length

    spinner.text = `Checking ether balances: matched = ${matched}, failed = ${differences.length}`

  } while (offset < count)

  if (differences.length > 0) {
    differences.forEach(diff => spinner.fail(diff))
    errors.forEach(err => spinner.fail(err))
    spinner.fail(`${matched} matches, ${differences.length} differences, ${errors.length} errors found`)
    process.exit(1)
  } else {
    spinner.succeed('No discrepancies found')
    process.exit(0)
  }

}

async function fetchBalances(connection: Connection, offset: number = 0, limit: number = 20): Promise<[Erc20BalanceView[], number]> {
  return connection
    .getRepository(Erc20BalanceView)
    .createQueryBuilder('balance')
    .orderBy('amount', 'DESC')
    .skip(offset)
    .take(limit)
    .getManyAndCount()
}
