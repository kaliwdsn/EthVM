/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.ContractMetadata;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ContractMetadataRecord extends UpdatableRecordImpl<ContractMetadataRecord> implements Record6<String, BigDecimal, String, String, Integer, BigDecimal> {

    private static final long serialVersionUID = -1360508116;

    /**
     * Setter for <code>public.contract_metadata.address</code>.
     */
    public ContractMetadataRecord setAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_metadata.address</code>.
     */
    public String getAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.contract_metadata.block_number</code>.
     */
    public ContractMetadataRecord setBlockNumber(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_metadata.block_number</code>.
     */
    public BigDecimal getBlockNumber() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>public.contract_metadata.name</code>.
     */
    public ContractMetadataRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_metadata.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.contract_metadata.symbol</code>.
     */
    public ContractMetadataRecord setSymbol(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_metadata.symbol</code>.
     */
    public String getSymbol() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.contract_metadata.decimals</code>.
     */
    public ContractMetadataRecord setDecimals(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_metadata.decimals</code>.
     */
    public Integer getDecimals() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.contract_metadata.total_supply</code>.
     */
    public ContractMetadataRecord setTotalSupply(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_metadata.total_supply</code>.
     */
    public BigDecimal getTotalSupply() {
        return (BigDecimal) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, BigDecimal, String, String, Integer, BigDecimal> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<String, BigDecimal, String, String, Integer, BigDecimal> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ContractMetadata.CONTRACT_METADATA.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return ContractMetadata.CONTRACT_METADATA.BLOCK_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ContractMetadata.CONTRACT_METADATA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ContractMetadata.CONTRACT_METADATA.SYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return ContractMetadata.CONTRACT_METADATA.DECIMALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return ContractMetadata.CONTRACT_METADATA.TOTAL_SUPPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDecimals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getTotalSupply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDecimals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getTotalSupply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord value1(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord value2(BigDecimal value) {
        setBlockNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord value4(String value) {
        setSymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord value5(Integer value) {
        setDecimals(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord value6(BigDecimal value) {
        setTotalSupply(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractMetadataRecord values(String value1, BigDecimal value2, String value3, String value4, Integer value5, BigDecimal value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractMetadataRecord
     */
    public ContractMetadataRecord() {
        super(ContractMetadata.CONTRACT_METADATA);
    }

    /**
     * Create a detached, initialised ContractMetadataRecord
     */
    public ContractMetadataRecord(String address, BigDecimal blockNumber, String name, String symbol, Integer decimals, BigDecimal totalSupply) {
        super(ContractMetadata.CONTRACT_METADATA);

        set(0, address);
        set(1, blockNumber);
        set(2, name);
        set(3, symbol);
        set(4, decimals);
        set(5, totalSupply);
    }
}
