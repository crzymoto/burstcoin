/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables.records;


import brs.schema.tables.Version;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VersionRecord extends TableRecordImpl<VersionRecord> implements Record1<Integer> {

    private static final long serialVersionUID = -460151050;

    /**
     * Setter for <code>DB.version.next_update</code>.
     */
    public void setNextUpdate(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.version.next_update</code>.
     */
    public Integer getNextUpdate() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Version.VERSION.NEXT_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getNextUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNextUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VersionRecord value1(Integer value) {
        setNextUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VersionRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached VersionRecord
     */
    public VersionRecord() {
        super(Version.VERSION);
    }

    /**
     * Create a detached, initialised VersionRecord
     */
    public VersionRecord(Integer nextUpdate) {
        super(Version.VERSION);

        set(0, nextUpdate);
    }
}