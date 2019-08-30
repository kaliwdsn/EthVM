/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Public;
import com.ethvm.db.tables.records.BlockRewardRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class BlockReward extends TableImpl<BlockRewardRecord> {

    private static final long serialVersionUID = 229732711;

    /**
     * The reference instance of <code>public.block_reward</code>
     */
    public static final BlockReward BLOCK_REWARD = new BlockReward();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlockRewardRecord> getRecordType() {
        return BlockRewardRecord.class;
    }

    /**
     * The column <code>public.block_reward.address</code>.
     */
    public final TableField<BlockRewardRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CHAR(42), this, "");

    /**
     * The column <code>public.block_reward.block_hash</code>.
     */
    public final TableField<BlockRewardRecord, String> BLOCK_HASH = createField("block_hash", org.jooq.impl.SQLDataType.CHAR(66), this, "");

    /**
     * The column <code>public.block_reward.amount</code>.
     */
    public final TableField<BlockRewardRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.block_reward.delta_type</code>.
     */
    public final TableField<BlockRewardRecord, String> DELTA_TYPE = createField("delta_type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * Create a <code>public.block_reward</code> table reference
     */
    public BlockReward() {
        this(DSL.name("block_reward"), null);
    }

    /**
     * Create an aliased <code>public.block_reward</code> table reference
     */
    public BlockReward(String alias) {
        this(DSL.name(alias), BLOCK_REWARD);
    }

    /**
     * Create an aliased <code>public.block_reward</code> table reference
     */
    public BlockReward(Name alias) {
        this(alias, BLOCK_REWARD);
    }

    private BlockReward(Name alias, Table<BlockRewardRecord> aliased) {
        this(alias, aliased, null);
    }

    private BlockReward(Name alias, Table<BlockRewardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BlockReward(Table<O> child, ForeignKey<O, BlockRewardRecord> key) {
        super(child, key, BLOCK_REWARD);
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
    public BlockReward as(String alias) {
        return new BlockReward(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockReward as(Name alias) {
        return new BlockReward(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockReward rename(String name) {
        return new BlockReward(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BlockReward rename(Name name) {
        return new BlockReward(name, null);
    }
}
