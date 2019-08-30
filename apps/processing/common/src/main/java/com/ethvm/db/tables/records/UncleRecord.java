/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.Uncle;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class UncleRecord extends UpdatableRecordImpl<UncleRecord> implements Record20<String, Integer, String, BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, String, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, Timestamp, Long> {

    private static final long serialVersionUID = 1140510849;

    /**
     * Setter for <code>public.uncle.hash</code>.
     */
    public UncleRecord setHash(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.hash</code>.
     */
    public String getHash() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.uncle.index</code>.
     */
    public UncleRecord setIndex(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.index</code>.
     */
    public Integer getIndex() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.uncle.nephew_hash</code>.
     */
    public UncleRecord setNephewHash(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.nephew_hash</code>.
     */
    public String getNephewHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.uncle.number</code>.
     */
    public UncleRecord setNumber(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.number</code>.
     */
    public BigDecimal getNumber() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.uncle.height</code>.
     */
    public UncleRecord setHeight(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.height</code>.
     */
    public BigDecimal getHeight() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.uncle.parent_hash</code>.
     */
    public UncleRecord setParentHash(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.parent_hash</code>.
     */
    public String getParentHash() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.uncle.nonce</code>.
     */
    public UncleRecord setNonce(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.nonce</code>.
     */
    public BigDecimal getNonce() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>public.uncle.sha3_uncles</code>.
     */
    public UncleRecord setSha3Uncles(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.sha3_uncles</code>.
     */
    public String getSha3Uncles() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.uncle.logs_bloom</code>.
     */
    public UncleRecord setLogsBloom(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.logs_bloom</code>.
     */
    public String getLogsBloom() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.uncle.transactions_root</code>.
     */
    public UncleRecord setTransactionsRoot(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.transactions_root</code>.
     */
    public String getTransactionsRoot() {
        return (String) get(9);
    }

    /**
     * Setter for <code>public.uncle.state_root</code>.
     */
    public UncleRecord setStateRoot(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.state_root</code>.
     */
    public String getStateRoot() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.uncle.receipts_root</code>.
     */
    public UncleRecord setReceiptsRoot(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.receipts_root</code>.
     */
    public String getReceiptsRoot() {
        return (String) get(11);
    }

    /**
     * Setter for <code>public.uncle.author</code>.
     */
    public UncleRecord setAuthor(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.author</code>.
     */
    public String getAuthor() {
        return (String) get(12);
    }

    /**
     * Setter for <code>public.uncle.difficulty</code>.
     */
    public UncleRecord setDifficulty(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.difficulty</code>.
     */
    public BigDecimal getDifficulty() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>public.uncle.total_difficulty</code>.
     */
    public UncleRecord setTotalDifficulty(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.total_difficulty</code>.
     */
    public BigDecimal getTotalDifficulty() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.uncle.extra_data</code>.
     */
    public UncleRecord setExtraData(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.extra_data</code>.
     */
    public String getExtraData() {
        return (String) get(15);
    }

    /**
     * Setter for <code>public.uncle.gas_limit</code>.
     */
    public UncleRecord setGasLimit(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.gas_limit</code>.
     */
    public BigDecimal getGasLimit() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>public.uncle.gas_used</code>.
     */
    public UncleRecord setGasUsed(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.gas_used</code>.
     */
    public BigDecimal getGasUsed() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>public.uncle.timestamp</code>.
     */
    public UncleRecord setTimestamp(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>public.uncle.size</code>.
     */
    public UncleRecord setSize(Long value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>public.uncle.size</code>.
     */
    public Long getSize() {
        return (Long) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, Integer, String, BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, String, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, Timestamp, Long> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<String, Integer, String, BigDecimal, BigDecimal, String, BigDecimal, String, String, String, String, String, String, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal, Timestamp, Long> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Uncle.UNCLE.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Uncle.UNCLE.INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Uncle.UNCLE.NEPHEW_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Uncle.UNCLE.NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return Uncle.UNCLE.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Uncle.UNCLE.PARENT_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Uncle.UNCLE.NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Uncle.UNCLE.SHA3_UNCLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Uncle.UNCLE.LOGS_BLOOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Uncle.UNCLE.TRANSACTIONS_ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Uncle.UNCLE.STATE_ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Uncle.UNCLE.RECEIPTS_ROOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Uncle.UNCLE.AUTHOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return Uncle.UNCLE.DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return Uncle.UNCLE.TOTAL_DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Uncle.UNCLE.EXTRA_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return Uncle.UNCLE.GAS_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field18() {
        return Uncle.UNCLE.GAS_USED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field19() {
        return Uncle.UNCLE.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return Uncle.UNCLE.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNephewHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getParentHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSha3Uncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLogsBloom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTransactionsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getStateRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getReceiptsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getExtraData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component17() {
        return getGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component18() {
        return getGasUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component19() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component20() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNephewHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getParentHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSha3Uncles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLogsBloom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTransactionsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getStateRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getReceiptsRoot();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAuthor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getTotalDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getExtraData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getGasLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value18() {
        return getGasUsed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value19() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value1(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value2(Integer value) {
        setIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value3(String value) {
        setNephewHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value4(BigDecimal value) {
        setNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value5(BigDecimal value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value6(String value) {
        setParentHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value7(BigDecimal value) {
        setNonce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value8(String value) {
        setSha3Uncles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value9(String value) {
        setLogsBloom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value10(String value) {
        setTransactionsRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value11(String value) {
        setStateRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value12(String value) {
        setReceiptsRoot(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value13(String value) {
        setAuthor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value14(BigDecimal value) {
        setDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value15(BigDecimal value) {
        setTotalDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value16(String value) {
        setExtraData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value17(BigDecimal value) {
        setGasLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value18(BigDecimal value) {
        setGasUsed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value19(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord value20(Long value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UncleRecord values(String value1, Integer value2, String value3, BigDecimal value4, BigDecimal value5, String value6, BigDecimal value7, String value8, String value9, String value10, String value11, String value12, String value13, BigDecimal value14, BigDecimal value15, String value16, BigDecimal value17, BigDecimal value18, Timestamp value19, Long value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UncleRecord
     */
    public UncleRecord() {
        super(Uncle.UNCLE);
    }

    /**
     * Create a detached, initialised UncleRecord
     */
    public UncleRecord(String hash, Integer index, String nephewHash, BigDecimal number, BigDecimal height, String parentHash, BigDecimal nonce, String sha3Uncles, String logsBloom, String transactionsRoot, String stateRoot, String receiptsRoot, String author, BigDecimal difficulty, BigDecimal totalDifficulty, String extraData, BigDecimal gasLimit, BigDecimal gasUsed, Timestamp timestamp, Long size) {
        super(Uncle.UNCLE);

        set(0, hash);
        set(1, index);
        set(2, nephewHash);
        set(3, number);
        set(4, height);
        set(5, parentHash);
        set(6, nonce);
        set(7, sha3Uncles);
        set(8, logsBloom);
        set(9, transactionsRoot);
        set(10, stateRoot);
        set(11, receiptsRoot);
        set(12, author);
        set(13, difficulty);
        set(14, totalDifficulty);
        set(15, extraData);
        set(16, gasLimit);
        set(17, gasUsed);
        set(18, timestamp);
        set(19, size);
    }
}
