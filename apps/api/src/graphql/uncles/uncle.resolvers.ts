import { UncleService } from '@app/dao/uncle.service'
import { ParseHashPipe } from '@app/shared/pipes/parse-hash.pipe'
import { Args, Query, Resolver } from '@nestjs/graphql'
import BigNumber from 'bignumber.js'
import { UncleDto } from '@app/graphql/uncles/dto/uncle.dto'
import { UnclePageDto } from '@app/graphql/uncles/dto/uncle-page.dto'
import { UseInterceptors } from '@nestjs/common'
import { SyncingInterceptor } from '@app/shared/interceptors/syncing-interceptor'
import {BlockNumberPipe} from '@app/shared/pipes/block-number.pipe';

@Resolver('Uncle')
@UseInterceptors(SyncingInterceptor)
export class UncleResolvers {
  constructor(private readonly uncleService: UncleService) { }

  @Query()
  async uncleByHash(
    @Args('hash', ParseHashPipe) hash: string,
    @Args('blockNumber', BlockNumberPipe) blockNumber: BigNumber,
  ) {
    const entity = await this.uncleService.findUncleByHash(hash, blockNumber)
    return entity ? new UncleDto(entity) : null
  }

  @Query()
  async uncles(
    @Args('offset') offset: number,
    @Args('limit') limit: number,
    @Args('blockNumber', BlockNumberPipe) blockNumber: BigNumber,
  ) {
    const [entities, count] = await this.uncleService.findUncles(offset, limit, blockNumber)
    return new UnclePageDto(entities, count)
  }

  // TODO confirm if this is still necessary
  @Query()
  async latestUncleBlockNumber(@Args('blockNumber', BlockNumberPipe) blockNumber: BigNumber): Promise<BigNumber> {
    return await this.uncleService.findLatestUncleBlockNumber(blockNumber)
  }
}
