/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.ForkUncleBalanceDeltaRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class ForkUncleBalanceDelta extends TableImpl<ForkUncleBalanceDeltaRecord> {

    private static final long serialVersionUID = -1139670006;

    /**
     * The reference instance of <code>public.fork_uncle_balance_delta</code>
     */
    public static final ForkUncleBalanceDelta FORK_UNCLE_BALANCE_DELTA = new ForkUncleBalanceDelta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForkUncleBalanceDeltaRecord> getRecordType() {
        return ForkUncleBalanceDeltaRecord.class;
    }

    /**
     * The column <code>public.fork_uncle_balance_delta.id</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('balance_delta_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.address</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.contract_address</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> CONTRACT_ADDRESS = createField("contract_address", org.jooq.impl.SQLDataType.CHAR(42), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.counterpart_address</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> COUNTERPART_ADDRESS = createField("counterpart_address", org.jooq.impl.SQLDataType.CHAR(42), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.token_type</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> TOKEN_TYPE = createField("token_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.delta_type</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> DELTA_TYPE = createField("delta_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.amount</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.token_id</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, BigDecimal> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.block_hash</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> BLOCK_HASH = createField("block_hash", org.jooq.impl.SQLDataType.CHAR(66), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.block_number</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.transaction_index</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, Integer> TRANSACTION_INDEX = createField("transaction_index", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.transaction_hash</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> TRANSACTION_HASH = createField("transaction_hash", org.jooq.impl.SQLDataType.CHAR(66), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.trace_address</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, String> TRACE_ADDRESS = createField("trace_address", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.timestamp</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.fork_uncle_balance_delta.is_receiving</code>.
     */
    public final TableField<ForkUncleBalanceDeltaRecord, Boolean> IS_RECEIVING = createField("is_receiving", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>public.fork_uncle_balance_delta</code> table reference
     */
    public ForkUncleBalanceDelta() {
        this(DSL.name("fork_uncle_balance_delta"), null);
    }

    /**
     * Create an aliased <code>public.fork_uncle_balance_delta</code> table reference
     */
    public ForkUncleBalanceDelta(String alias) {
        this(DSL.name(alias), FORK_UNCLE_BALANCE_DELTA);
    }

    /**
     * Create an aliased <code>public.fork_uncle_balance_delta</code> table reference
     */
    public ForkUncleBalanceDelta(Name alias) {
        this(alias, FORK_UNCLE_BALANCE_DELTA);
    }

    private ForkUncleBalanceDelta(Name alias, Table<ForkUncleBalanceDeltaRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForkUncleBalanceDelta(Name alias, Table<ForkUncleBalanceDeltaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForkUncleBalanceDelta(Table<O> child, ForeignKey<O, ForkUncleBalanceDeltaRecord> key) {
        super(child, key, FORK_UNCLE_BALANCE_DELTA);
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
    public Identity<ForkUncleBalanceDeltaRecord, Long> getIdentity() {
        return Keys.IDENTITY_FORK_UNCLE_BALANCE_DELTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkUncleBalanceDelta as(String alias) {
        return new ForkUncleBalanceDelta(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForkUncleBalanceDelta as(Name alias) {
        return new ForkUncleBalanceDelta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForkUncleBalanceDelta rename(String name) {
        return new ForkUncleBalanceDelta(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForkUncleBalanceDelta rename(Name name) {
        return new ForkUncleBalanceDelta(name, null);
    }
}
