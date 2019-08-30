/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db;


import com.ethvm.db.tables.AddDimension;
import com.ethvm.db.tables.AddressTransactionCount;
import com.ethvm.db.tables.AddressTransactionCountDelta;
import com.ethvm.db.tables.AlterJobSchedule;
import com.ethvm.db.tables.Balance;
import com.ethvm.db.tables.BalanceDelta;
import com.ethvm.db.tables.BlockHeader;
import com.ethvm.db.tables.BlockMetric;
import com.ethvm.db.tables.BlockMetricsHeader;
import com.ethvm.db.tables.BlockMetricsTrace;
import com.ethvm.db.tables.BlockReward;
import com.ethvm.db.tables.CanonicalCount;
import com.ethvm.db.tables.CanonicalTokenExchangeRate;
import com.ethvm.db.tables.CoinExchangeRate;
import com.ethvm.db.tables.Contract;
import com.ethvm.db.tables.ContractMetadata;
import com.ethvm.db.tables.CreateHypertable;
import com.ethvm.db.tables.EthListContractMetadata;
import com.ethvm.db.tables.FlywaySchemaHistory;
import com.ethvm.db.tables.ForkBalanceDelta;
import com.ethvm.db.tables.ForkBlockHeader;
import com.ethvm.db.tables.ForkTrace;
import com.ethvm.db.tables.ForkTransaction;
import com.ethvm.db.tables.ForkTransactionReceipt;
import com.ethvm.db.tables.ForkUncleBalanceDelta;
import com.ethvm.db.tables.HypertableApproximateRowCount;
import com.ethvm.db.tables.HypertableRelationSize;
import com.ethvm.db.tables.HypertableRelationSizePretty;
import com.ethvm.db.tables.IndexesRelationSize;
import com.ethvm.db.tables.IndexesRelationSizePretty;
import com.ethvm.db.tables.MinerBlockCount;
import com.ethvm.db.tables.ProcessorHashLog;
import com.ethvm.db.tables.SyncStatus;
import com.ethvm.db.tables.SyncStatusHistory;
import com.ethvm.db.tables.TokenDetail;
import com.ethvm.db.tables.TokenExchangeRate;
import com.ethvm.db.tables.TokenMetadata;
import com.ethvm.db.tables.Trace;
import com.ethvm.db.tables.Transaction;
import com.ethvm.db.tables.TransactionReceipt;
import com.ethvm.db.tables.Uncle;
import com.ethvm.db.tables.records.AddDimensionRecord;
import com.ethvm.db.tables.records.AlterJobScheduleRecord;
import com.ethvm.db.tables.records.CreateHypertableRecord;
import com.ethvm.db.tables.records.HypertableApproximateRowCountRecord;
import com.ethvm.db.tables.records.HypertableRelationSizePrettyRecord;
import com.ethvm.db.tables.records.HypertableRelationSizeRecord;
import com.ethvm.db.tables.records.IndexesRelationSizePrettyRecord;
import com.ethvm.db.tables.records.IndexesRelationSizeRecord;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.add_dimension</code>.
     */
    public static final AddDimension ADD_DIMENSION = com.ethvm.db.tables.AddDimension.ADD_DIMENSION;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<AddDimensionRecord> ADD_DIMENSION(Configuration configuration, Object mainTable, String columnName, Integer numberPartitions, Object chunkTimeInterval, String partitioningFunc, Boolean ifNotExists) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.AddDimension.ADD_DIMENSION.call(mainTable, columnName, numberPartitions, chunkTimeInterval, partitioningFunc, ifNotExists)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static AddDimension ADD_DIMENSION(Object mainTable, String columnName, Integer numberPartitions, Object chunkTimeInterval, String partitioningFunc, Boolean ifNotExists) {
        return com.ethvm.db.tables.AddDimension.ADD_DIMENSION.call(mainTable, columnName, numberPartitions, chunkTimeInterval, partitioningFunc, ifNotExists);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static AddDimension ADD_DIMENSION(Field<Object> mainTable, Field<String> columnName, Field<Integer> numberPartitions, Field<Object> chunkTimeInterval, Field<String> partitioningFunc, Field<Boolean> ifNotExists) {
        return com.ethvm.db.tables.AddDimension.ADD_DIMENSION.call(mainTable, columnName, numberPartitions, chunkTimeInterval, partitioningFunc, ifNotExists);
    }

    /**
     * The table <code>public.address_transaction_count</code>.
     */
    public static final AddressTransactionCount ADDRESS_TRANSACTION_COUNT = com.ethvm.db.tables.AddressTransactionCount.ADDRESS_TRANSACTION_COUNT;

    /**
     * The table <code>public.address_transaction_count_delta</code>.
     */
    public static final AddressTransactionCountDelta ADDRESS_TRANSACTION_COUNT_DELTA = com.ethvm.db.tables.AddressTransactionCountDelta.ADDRESS_TRANSACTION_COUNT_DELTA;

    /**
     * The table <code>public.alter_job_schedule</code>.
     */
    public static final AlterJobSchedule ALTER_JOB_SCHEDULE = com.ethvm.db.tables.AlterJobSchedule.ALTER_JOB_SCHEDULE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<AlterJobScheduleRecord> ALTER_JOB_SCHEDULE(Configuration configuration, Integer jobId, Object scheduleInterval, Object maxRuntime, Integer maxRetries, Object retryPeriod, Boolean ifExists) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.AlterJobSchedule.ALTER_JOB_SCHEDULE.call(jobId, scheduleInterval, maxRuntime, maxRetries, retryPeriod, ifExists)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static AlterJobSchedule ALTER_JOB_SCHEDULE(Integer jobId, Object scheduleInterval, Object maxRuntime, Integer maxRetries, Object retryPeriod, Boolean ifExists) {
        return com.ethvm.db.tables.AlterJobSchedule.ALTER_JOB_SCHEDULE.call(jobId, scheduleInterval, maxRuntime, maxRetries, retryPeriod, ifExists);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static AlterJobSchedule ALTER_JOB_SCHEDULE(Field<Integer> jobId, Field<Object> scheduleInterval, Field<Object> maxRuntime, Field<Integer> maxRetries, Field<Object> retryPeriod, Field<Boolean> ifExists) {
        return com.ethvm.db.tables.AlterJobSchedule.ALTER_JOB_SCHEDULE.call(jobId, scheduleInterval, maxRuntime, maxRetries, retryPeriod, ifExists);
    }

    /**
     * The table <code>public.balance</code>.
     */
    public static final Balance BALANCE = com.ethvm.db.tables.Balance.BALANCE;

    /**
     * The table <code>public.balance_delta</code>.
     */
    public static final BalanceDelta BALANCE_DELTA = com.ethvm.db.tables.BalanceDelta.BALANCE_DELTA;

    /**
     * The table <code>public.block_header</code>.
     */
    public static final BlockHeader BLOCK_HEADER = com.ethvm.db.tables.BlockHeader.BLOCK_HEADER;

    /**
     * The table <code>public.block_metric</code>.
     */
    public static final BlockMetric BLOCK_METRIC = com.ethvm.db.tables.BlockMetric.BLOCK_METRIC;

    /**
     * The table <code>public.block_metrics_header</code>.
     */
    public static final BlockMetricsHeader BLOCK_METRICS_HEADER = com.ethvm.db.tables.BlockMetricsHeader.BLOCK_METRICS_HEADER;

    /**
     * The table <code>public.block_metrics_trace</code>.
     */
    public static final BlockMetricsTrace BLOCK_METRICS_TRACE = com.ethvm.db.tables.BlockMetricsTrace.BLOCK_METRICS_TRACE;

    /**
     * The table <code>public.block_reward</code>.
     */
    public static final BlockReward BLOCK_REWARD = com.ethvm.db.tables.BlockReward.BLOCK_REWARD;

    /**
     * The table <code>public.canonical_count</code>.
     */
    public static final CanonicalCount CANONICAL_COUNT = com.ethvm.db.tables.CanonicalCount.CANONICAL_COUNT;

    /**
     * The table <code>public.canonical_token_exchange_rate</code>.
     */
    public static final CanonicalTokenExchangeRate CANONICAL_TOKEN_EXCHANGE_RATE = com.ethvm.db.tables.CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE;

    /**
     * The table <code>public.coin_exchange_rate</code>.
     */
    public static final CoinExchangeRate COIN_EXCHANGE_RATE = com.ethvm.db.tables.CoinExchangeRate.COIN_EXCHANGE_RATE;

    /**
     * The table <code>public.contract</code>.
     */
    public static final Contract CONTRACT = com.ethvm.db.tables.Contract.CONTRACT;

    /**
     * The table <code>public.contract_metadata</code>.
     */
    public static final ContractMetadata CONTRACT_METADATA = com.ethvm.db.tables.ContractMetadata.CONTRACT_METADATA;

    /**
     * The table <code>public.create_hypertable</code>.
     */
    public static final CreateHypertable CREATE_HYPERTABLE = com.ethvm.db.tables.CreateHypertable.CREATE_HYPERTABLE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<CreateHypertableRecord> CREATE_HYPERTABLE(Configuration configuration, Object mainTable, String timeColumnName, String partitioningColumn, Integer numberPartitions, String associatedSchemaName, String associatedTablePrefix, Object chunkTimeInterval, Boolean createDefaultIndexes, Boolean ifNotExists, String partitioningFunc, Boolean migrateData, String chunkTargetSize, String chunkSizingFunc, String timePartitioningFunc) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.CreateHypertable.CREATE_HYPERTABLE.call(mainTable, timeColumnName, partitioningColumn, numberPartitions, associatedSchemaName, associatedTablePrefix, chunkTimeInterval, createDefaultIndexes, ifNotExists, partitioningFunc, migrateData, chunkTargetSize, chunkSizingFunc, timePartitioningFunc)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static CreateHypertable CREATE_HYPERTABLE(Object mainTable, String timeColumnName, String partitioningColumn, Integer numberPartitions, String associatedSchemaName, String associatedTablePrefix, Object chunkTimeInterval, Boolean createDefaultIndexes, Boolean ifNotExists, String partitioningFunc, Boolean migrateData, String chunkTargetSize, String chunkSizingFunc, String timePartitioningFunc) {
        return com.ethvm.db.tables.CreateHypertable.CREATE_HYPERTABLE.call(mainTable, timeColumnName, partitioningColumn, numberPartitions, associatedSchemaName, associatedTablePrefix, chunkTimeInterval, createDefaultIndexes, ifNotExists, partitioningFunc, migrateData, chunkTargetSize, chunkSizingFunc, timePartitioningFunc);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static CreateHypertable CREATE_HYPERTABLE(Field<Object> mainTable, Field<String> timeColumnName, Field<String> partitioningColumn, Field<Integer> numberPartitions, Field<String> associatedSchemaName, Field<String> associatedTablePrefix, Field<Object> chunkTimeInterval, Field<Boolean> createDefaultIndexes, Field<Boolean> ifNotExists, Field<String> partitioningFunc, Field<Boolean> migrateData, Field<String> chunkTargetSize, Field<String> chunkSizingFunc, Field<String> timePartitioningFunc) {
        return com.ethvm.db.tables.CreateHypertable.CREATE_HYPERTABLE.call(mainTable, timeColumnName, partitioningColumn, numberPartitions, associatedSchemaName, associatedTablePrefix, chunkTimeInterval, createDefaultIndexes, ifNotExists, partitioningFunc, migrateData, chunkTargetSize, chunkSizingFunc, timePartitioningFunc);
    }

    /**
     * The table <code>public.eth_list_contract_metadata</code>.
     */
    public static final EthListContractMetadata ETH_LIST_CONTRACT_METADATA = com.ethvm.db.tables.EthListContractMetadata.ETH_LIST_CONTRACT_METADATA;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = com.ethvm.db.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.fork_balance_delta</code>.
     */
    public static final ForkBalanceDelta FORK_BALANCE_DELTA = com.ethvm.db.tables.ForkBalanceDelta.FORK_BALANCE_DELTA;

    /**
     * The table <code>public.fork_block_header</code>.
     */
    public static final ForkBlockHeader FORK_BLOCK_HEADER = com.ethvm.db.tables.ForkBlockHeader.FORK_BLOCK_HEADER;

    /**
     * The table <code>public.fork_trace</code>.
     */
    public static final ForkTrace FORK_TRACE = com.ethvm.db.tables.ForkTrace.FORK_TRACE;

    /**
     * The table <code>public.fork_transaction</code>.
     */
    public static final ForkTransaction FORK_TRANSACTION = com.ethvm.db.tables.ForkTransaction.FORK_TRANSACTION;

    /**
     * The table <code>public.fork_transaction_receipt</code>.
     */
    public static final ForkTransactionReceipt FORK_TRANSACTION_RECEIPT = com.ethvm.db.tables.ForkTransactionReceipt.FORK_TRANSACTION_RECEIPT;

    /**
     * The table <code>public.fork_uncle_balance_delta</code>.
     */
    public static final ForkUncleBalanceDelta FORK_UNCLE_BALANCE_DELTA = com.ethvm.db.tables.ForkUncleBalanceDelta.FORK_UNCLE_BALANCE_DELTA;

    /**
     * The table <code>public.hypertable_approximate_row_count</code>.
     */
    public static final HypertableApproximateRowCount HYPERTABLE_APPROXIMATE_ROW_COUNT = com.ethvm.db.tables.HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<HypertableApproximateRowCountRecord> HYPERTABLE_APPROXIMATE_ROW_COUNT(Configuration configuration, Object mainTable) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT.call(mainTable)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static HypertableApproximateRowCount HYPERTABLE_APPROXIMATE_ROW_COUNT(Object mainTable) {
        return com.ethvm.db.tables.HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT.call(mainTable);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static HypertableApproximateRowCount HYPERTABLE_APPROXIMATE_ROW_COUNT(Field<Object> mainTable) {
        return com.ethvm.db.tables.HypertableApproximateRowCount.HYPERTABLE_APPROXIMATE_ROW_COUNT.call(mainTable);
    }

    /**
     * The table <code>public.hypertable_relation_size</code>.
     */
    public static final HypertableRelationSize HYPERTABLE_RELATION_SIZE = com.ethvm.db.tables.HypertableRelationSize.HYPERTABLE_RELATION_SIZE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<HypertableRelationSizeRecord> HYPERTABLE_RELATION_SIZE(Configuration configuration, Object mainTable) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.HypertableRelationSize.HYPERTABLE_RELATION_SIZE.call(mainTable)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static HypertableRelationSize HYPERTABLE_RELATION_SIZE(Object mainTable) {
        return com.ethvm.db.tables.HypertableRelationSize.HYPERTABLE_RELATION_SIZE.call(mainTable);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static HypertableRelationSize HYPERTABLE_RELATION_SIZE(Field<Object> mainTable) {
        return com.ethvm.db.tables.HypertableRelationSize.HYPERTABLE_RELATION_SIZE.call(mainTable);
    }

    /**
     * The table <code>public.hypertable_relation_size_pretty</code>.
     */
    public static final HypertableRelationSizePretty HYPERTABLE_RELATION_SIZE_PRETTY = com.ethvm.db.tables.HypertableRelationSizePretty.HYPERTABLE_RELATION_SIZE_PRETTY;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<HypertableRelationSizePrettyRecord> HYPERTABLE_RELATION_SIZE_PRETTY(Configuration configuration, Object mainTable) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.HypertableRelationSizePretty.HYPERTABLE_RELATION_SIZE_PRETTY.call(mainTable)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static HypertableRelationSizePretty HYPERTABLE_RELATION_SIZE_PRETTY(Object mainTable) {
        return com.ethvm.db.tables.HypertableRelationSizePretty.HYPERTABLE_RELATION_SIZE_PRETTY.call(mainTable);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static HypertableRelationSizePretty HYPERTABLE_RELATION_SIZE_PRETTY(Field<Object> mainTable) {
        return com.ethvm.db.tables.HypertableRelationSizePretty.HYPERTABLE_RELATION_SIZE_PRETTY.call(mainTable);
    }

    /**
     * The table <code>public.indexes_relation_size</code>.
     */
    public static final IndexesRelationSize INDEXES_RELATION_SIZE = com.ethvm.db.tables.IndexesRelationSize.INDEXES_RELATION_SIZE;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<IndexesRelationSizeRecord> INDEXES_RELATION_SIZE(Configuration configuration, Object mainTable) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.IndexesRelationSize.INDEXES_RELATION_SIZE.call(mainTable)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static IndexesRelationSize INDEXES_RELATION_SIZE(Object mainTable) {
        return com.ethvm.db.tables.IndexesRelationSize.INDEXES_RELATION_SIZE.call(mainTable);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static IndexesRelationSize INDEXES_RELATION_SIZE(Field<Object> mainTable) {
        return com.ethvm.db.tables.IndexesRelationSize.INDEXES_RELATION_SIZE.call(mainTable);
    }

    /**
     * The table <code>public.indexes_relation_size_pretty</code>.
     */
    public static final IndexesRelationSizePretty INDEXES_RELATION_SIZE_PRETTY = com.ethvm.db.tables.IndexesRelationSizePretty.INDEXES_RELATION_SIZE_PRETTY;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<IndexesRelationSizePrettyRecord> INDEXES_RELATION_SIZE_PRETTY(Configuration configuration, Object mainTable) {
        return configuration.dsl().selectFrom(com.ethvm.db.tables.IndexesRelationSizePretty.INDEXES_RELATION_SIZE_PRETTY.call(mainTable)).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static IndexesRelationSizePretty INDEXES_RELATION_SIZE_PRETTY(Object mainTable) {
        return com.ethvm.db.tables.IndexesRelationSizePretty.INDEXES_RELATION_SIZE_PRETTY.call(mainTable);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static IndexesRelationSizePretty INDEXES_RELATION_SIZE_PRETTY(Field<Object> mainTable) {
        return com.ethvm.db.tables.IndexesRelationSizePretty.INDEXES_RELATION_SIZE_PRETTY.call(mainTable);
    }

    /**
     * The table <code>public.miner_block_count</code>.
     */
    public static final MinerBlockCount MINER_BLOCK_COUNT = com.ethvm.db.tables.MinerBlockCount.MINER_BLOCK_COUNT;

    /**
     * The table <code>public.processor_hash_log</code>.
     */
    public static final ProcessorHashLog PROCESSOR_HASH_LOG = com.ethvm.db.tables.ProcessorHashLog.PROCESSOR_HASH_LOG;

    /**
     * The table <code>public.sync_status</code>.
     */
    public static final SyncStatus SYNC_STATUS = com.ethvm.db.tables.SyncStatus.SYNC_STATUS;

    /**
     * The table <code>public.sync_status_history</code>.
     */
    public static final SyncStatusHistory SYNC_STATUS_HISTORY = com.ethvm.db.tables.SyncStatusHistory.SYNC_STATUS_HISTORY;

    /**
     * The table <code>public.token_detail</code>.
     */
    public static final TokenDetail TOKEN_DETAIL = com.ethvm.db.tables.TokenDetail.TOKEN_DETAIL;

    /**
     * The table <code>public.token_exchange_rate</code>.
     */
    public static final TokenExchangeRate TOKEN_EXCHANGE_RATE = com.ethvm.db.tables.TokenExchangeRate.TOKEN_EXCHANGE_RATE;

    /**
     * The table <code>public.token_metadata</code>.
     */
    public static final TokenMetadata TOKEN_METADATA = com.ethvm.db.tables.TokenMetadata.TOKEN_METADATA;

    /**
     * The table <code>public.trace</code>.
     */
    public static final Trace TRACE = com.ethvm.db.tables.Trace.TRACE;

    /**
     * The table <code>public.transaction</code>.
     */
    public static final Transaction TRANSACTION = com.ethvm.db.tables.Transaction.TRANSACTION;

    /**
     * The table <code>public.transaction_receipt</code>.
     */
    public static final TransactionReceipt TRANSACTION_RECEIPT = com.ethvm.db.tables.TransactionReceipt.TRANSACTION_RECEIPT;

    /**
     * The table <code>public.uncle</code>.
     */
    public static final Uncle UNCLE = com.ethvm.db.tables.Uncle.UNCLE;
}
