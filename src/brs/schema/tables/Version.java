/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.tables.records.VersionRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

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
public class Version extends TableImpl<VersionRecord> {

    private static final long serialVersionUID = -2037520474;

    /**
     * The reference instance of <code>DB.version</code>
     */
    public static final Version VERSION = new Version();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VersionRecord> getRecordType() {
        return VersionRecord.class;
    }

    /**
     * The column <code>DB.version.next_update</code>.
     */
    public final TableField<VersionRecord, Integer> NEXT_UPDATE = createField("next_update", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>DB.version</code> table reference
     */
    public Version() {
        this(DSL.name("version"), null);
    }

    /**
     * Create an aliased <code>DB.version</code> table reference
     */
    public Version(String alias) {
        this(DSL.name(alias), VERSION);
    }

    /**
     * Create an aliased <code>DB.version</code> table reference
     */
    public Version(Name alias) {
        this(alias, VERSION);
    }

    private Version(Name alias, Table<VersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Version(Name alias, Table<VersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Version as(String alias) {
        return new Version(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Version as(Name alias) {
        return new Version(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(String name) {
        return new Version(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Version rename(Name name) {
        return new Version(name, null);
    }
}