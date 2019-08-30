/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.CoinExchangeRateRecord;

import java.math.BigDecimal;
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
public class CoinExchangeRate extends TableImpl<CoinExchangeRateRecord> {

    private static final long serialVersionUID = 663675299;

    /**
     * The reference instance of <code>public.coin_exchange_rate</code>
     */
    public static final CoinExchangeRate COIN_EXCHANGE_RATE = new CoinExchangeRate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoinExchangeRateRecord> getRecordType() {
        return CoinExchangeRateRecord.class;
    }

    /**
     * The column <code>public.coin_exchange_rate.id</code>.
     */
    public final TableField<CoinExchangeRateRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR(24).nullable(false), this, "");

    /**
     * The column <code>public.coin_exchange_rate.currency</code>.
     */
    public final TableField<CoinExchangeRateRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>public.coin_exchange_rate.price</code>.
     */
    public final TableField<CoinExchangeRateRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.coin_exchange_rate.market_cap</code>.
     */
    public final TableField<CoinExchangeRateRecord, BigDecimal> MARKET_CAP = createField("market_cap", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.coin_exchange_rate.vol24h</code>.
     */
    public final TableField<CoinExchangeRateRecord, BigDecimal> VOL24H = createField("vol24h", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.coin_exchange_rate.change24h</code>.
     */
    public final TableField<CoinExchangeRateRecord, BigDecimal> CHANGE24H = createField("change24h", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.coin_exchange_rate.last_updated</code>.
     */
    public final TableField<CoinExchangeRateRecord, Long> LAST_UPDATED = createField("last_updated", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.coin_exchange_rate</code> table reference
     */
    public CoinExchangeRate() {
        this(DSL.name("coin_exchange_rate"), null);
    }

    /**
     * Create an aliased <code>public.coin_exchange_rate</code> table reference
     */
    public CoinExchangeRate(String alias) {
        this(DSL.name(alias), COIN_EXCHANGE_RATE);
    }

    /**
     * Create an aliased <code>public.coin_exchange_rate</code> table reference
     */
    public CoinExchangeRate(Name alias) {
        this(alias, COIN_EXCHANGE_RATE);
    }

    private CoinExchangeRate(Name alias, Table<CoinExchangeRateRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoinExchangeRate(Name alias, Table<CoinExchangeRateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CoinExchangeRate(Table<O> child, ForeignKey<O, CoinExchangeRateRecord> key) {
        super(child, key, COIN_EXCHANGE_RATE);
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
        return Arrays.<Index>asList(Indexes.COIN_EXCHANGE_RATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CoinExchangeRateRecord> getPrimaryKey() {
        return Keys.COIN_EXCHANGE_RATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CoinExchangeRateRecord>> getKeys() {
        return Arrays.<UniqueKey<CoinExchangeRateRecord>>asList(Keys.COIN_EXCHANGE_RATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoinExchangeRate as(String alias) {
        return new CoinExchangeRate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CoinExchangeRate as(Name alias) {
        return new CoinExchangeRate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoinExchangeRate rename(String name) {
        return new CoinExchangeRate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoinExchangeRate rename(Name name) {
        return new CoinExchangeRate(name, null);
    }
}
