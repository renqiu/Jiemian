package com.tyq.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.tyq.greendao.HaveRead;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table HAVE_READ.
*/
public class HaveReadDao extends AbstractDao<HaveRead, Long> {

    public static final String TABLENAME = "HAVE_READ";

    /**
     * Properties of entity HaveRead.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property ImageUrl = new Property(2, String.class, "imageUrl", false, "IMAGE_URL");
        public final static Property Url = new Property(3, String.class, "url", false, "URL");
    };


    public HaveReadDao(DaoConfig config) {
        super(config);
    }
    
    public HaveReadDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'HAVE_READ' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'TITLE' TEXT," + // 1: title
                "'IMAGE_URL' TEXT," + // 2: imageUrl
                "'URL' TEXT);"); // 3: url
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'HAVE_READ'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HaveRead entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(3, imageUrl);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(4, url);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HaveRead readEntity(Cursor cursor, int offset) {
        HaveRead entity = new HaveRead( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // imageUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // url
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HaveRead entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImageUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HaveRead entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HaveRead entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}