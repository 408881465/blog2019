/*
 * This file is generated by jOOQ.
 */
package ch.rasc.stateless.db.tables;


import ch.rasc.stateless.db.DefaultSchema;
import ch.rasc.stateless.db.Indexes;
import ch.rasc.stateless.db.Keys;
import ch.rasc.stateless.db.tables.records.AppSessionRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AppSession extends TableImpl<AppSessionRecord> {

    private static final long serialVersionUID = -241126467;

    /**
     * The reference instance of <code>APP_SESSION</code>
     */
    public static final AppSession APP_SESSION = new AppSession();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AppSessionRecord> getRecordType() {
        return AppSessionRecord.class;
    }

    /**
     * The column <code>APP_SESSION.ID</code>.
     */
    public final TableField<AppSessionRecord, String> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.CHAR(35).nullable(false), this, "");

    /**
     * The column <code>APP_SESSION.APP_USER_ID</code>.
     */
    public final TableField<AppSessionRecord, Long> APP_USER_ID = createField(DSL.name("APP_USER_ID"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>APP_SESSION.VALID_UNTIL</code>.
     */
    public final TableField<AppSessionRecord, LocalDateTime> VALID_UNTIL = createField(DSL.name("VALID_UNTIL"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>APP_SESSION</code> table reference
     */
    public AppSession() {
        this(DSL.name("APP_SESSION"), null);
    }

    /**
     * Create an aliased <code>APP_SESSION</code> table reference
     */
    public AppSession(String alias) {
        this(DSL.name(alias), APP_SESSION);
    }

    /**
     * Create an aliased <code>APP_SESSION</code> table reference
     */
    public AppSession(Name alias) {
        this(alias, APP_SESSION);
    }

    private AppSession(Name alias, Table<AppSessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private AppSession(Name alias, Table<AppSessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AppSession(Table<O> child, ForeignKey<O, AppSessionRecord> key) {
        super(child, key, APP_SESSION);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONSTRAINT_INDEX_A, Indexes.PRIMARY_KEY_A);
    }

    @Override
    public UniqueKey<AppSessionRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_A;
    }

    @Override
    public List<UniqueKey<AppSessionRecord>> getKeys() {
        return Arrays.<UniqueKey<AppSessionRecord>>asList(Keys.CONSTRAINT_A);
    }

    @Override
    public List<ForeignKey<AppSessionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AppSessionRecord, ?>>asList(Keys.CONSTRAINT_A8);
    }

    public AppUser appUser() {
        return new AppUser(this, Keys.CONSTRAINT_A8);
    }

    @Override
    public AppSession as(String alias) {
        return new AppSession(DSL.name(alias), this);
    }

    @Override
    public AppSession as(Name alias) {
        return new AppSession(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AppSession rename(String name) {
        return new AppSession(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AppSession rename(Name name) {
        return new AppSession(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
