/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.BlockHeaderRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlockHeader extends TableImpl<BlockHeaderRecord> {

    private static final long serialVersionUID = 1164999456;

    /**
     * The reference instance of <code>public.block_header</code>
     */
    public static final BlockHeader BLOCK_HEADER = new BlockHeader();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlockHeaderRecord> getRecordType() {
        return BlockHeaderRecord.class;
    }

    /**
     * The column <code>public.block_header.number</code>.
     */
    public final TableField<BlockHeaderRecord, BigDecimal> NUMBER = createField("number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.block_header.hash</code>.
     */
    public final TableField<BlockHeaderRecord, String> HASH = createField("hash", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.block_header.parent_hash</code>.
     */
    public final TableField<BlockHeaderRecord, String> PARENT_HASH = createField("parent_hash", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.block_header.nonce</code>.
     */
    public final TableField<BlockHeaderRecord, BigDecimal> NONCE = createField("nonce", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_header.sha3_uncles</code>.
     */
    public final TableField<BlockHeaderRecord, String> SHA3_UNCLES = createField("sha3_uncles", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.block_header.logs_bloom</code>.
     */
    public final TableField<BlockHeaderRecord, String> LOGS_BLOOM = createField("logs_bloom", org.jooq.impl.SQLDataType.CHAR(514).nullable(false), this, "");

    /**
     * The column <code>public.block_header.transactions_root</code>.
     */
    public final TableField<BlockHeaderRecord, String> TRANSACTIONS_ROOT = createField("transactions_root", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.block_header.state_root</code>.
     */
    public final TableField<BlockHeaderRecord, String> STATE_ROOT = createField("state_root", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.block_header.receipts_root</code>.
     */
    public final TableField<BlockHeaderRecord, String> RECEIPTS_ROOT = createField("receipts_root", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.block_header.author</code>.
     */
    public final TableField<BlockHeaderRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.block_header.difficulty</code>.
     */
    public final TableField<BlockHeaderRecord, BigDecimal> DIFFICULTY = createField("difficulty", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.block_header.total_difficulty</code>.
     */
    public final TableField<BlockHeaderRecord, BigDecimal> TOTAL_DIFFICULTY = createField("total_difficulty", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.block_header.extra_data</code>.
     */
    public final TableField<BlockHeaderRecord, String> EXTRA_DATA = createField("extra_data", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.block_header.gas_limit</code>.
     */
    public final TableField<BlockHeaderRecord, BigDecimal> GAS_LIMIT = createField("gas_limit", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.block_header.gas_used</code>.
     */
    public final TableField<BlockHeaderRecord, BigDecimal> GAS_USED = createField("gas_used", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.block_header.timestamp</code>.
     */
    public final TableField<BlockHeaderRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.block_header.block_time</code>.
     */
    public final TableField<BlockHeaderRecord, Integer> BLOCK_TIME = createField("block_time", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.block_header.size</code>.
     */
    public final TableField<BlockHeaderRecord, Integer> SIZE = createField("size", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.block_header.uncle_count</code>.
     */
    public final TableField<BlockHeaderRecord, Integer> UNCLE_COUNT = createField("uncle_count", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.block_header.uncle_hashes</code>.
     */
    public final TableField<BlockHeaderRecord, String> UNCLE_HASHES = createField("uncle_hashes", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.block_header.transaction_count</code>.
     */
    public final TableField<BlockHeaderRecord, Integer> TRANSACTION_COUNT = createField("transaction_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.block_header.transaction_hashes</code>.
     */
    public final TableField<BlockHeaderRecord, String> TRANSACTION_HASHES = createField("transaction_hashes", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.block_header</code> table reference
     */
    public BlockHeader() {
        this(DSL.name("block_header"), null);
    }

    /**
     * Create an aliased <code>public.block_header</code> table reference
     */
    public BlockHeader(String alias) {
        this(DSL.name(alias), BLOCK_HEADER);
    }

    /**
     * Create an aliased <code>public.block_header</code> table reference
     */
    public BlockHeader(Name alias) {
        this(alias, BLOCK_HEADER);
    }

    private BlockHeader(Name alias, Table<BlockHeaderRecord> aliased) {
        this(alias, aliased, null);
    }

    private BlockHeader(Name alias, Table<BlockHeaderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BlockHeader(Table<O> child, ForeignKey<O, BlockHeaderRecord> key) {
        super(child, key, BLOCK_HEADER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BLOCK_HEADER_HASH_KEY, Indexes.BLOCK_HEADER_PARENT_HASH_KEY, Indexes.BLOCK_HEADER_PKEY, Indexes.IDX_BLOCK_HEADER_BY_HASH, Indexes.IDX_IS_MINER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BlockHeaderRecord> getPrimaryKey() {
        return Keys.BLOCK_HEADER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BlockHeaderRecord>> getKeys() {
        return Arrays.<UniqueKey<BlockHeaderRecord>>asList(Keys.BLOCK_HEADER_PKEY, Keys.BLOCK_HEADER_HASH_KEY, Keys.BLOCK_HEADER_PARENT_HASH_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockHeader as(String alias) {
        return new BlockHeader(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockHeader as(Name alias) {
        return new BlockHeader(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockHeader rename(String name) {
        return new BlockHeader(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockHeader rename(Name name) {
        return new BlockHeader(name, null);
    }
}
