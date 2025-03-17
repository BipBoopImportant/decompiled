package com.sugarcube.app.base.data.database;

import O4.a;
import O4.b;
import Q4.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.F;
import androidx.room.B;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class DatabaseMediaDao_Impl extends DatabaseMediaDao {
    /* access modifiers changed from: private */
    public final Converters __converters = new Converters();
    /* access modifiers changed from: private */
    public final x __db;
    private final C7013j<DatabaseMedia> __deletionAdapterOfDatabaseMedia;
    private final C7014k<DatabaseMedia> __insertionAdapterOfDatabaseMedia;
    private final H __preparedStmtOfDelete;
    private final H __preparedStmtOfDeleteAll;
    private final H __preparedStmtOfDeleteByDatabaseSceneId;
    private final C7013j<DatabaseMedia> __updateAdapterOfDatabaseMedia;

    public DatabaseMediaDao_Impl(x xVar) {
        this.__db = xVar;
        this.__insertionAdapterOfDatabaseMedia = new C7014k<DatabaseMedia>(xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "INSERT OR REPLACE INTO `DatabaseMedia` (`id`,`databaseSceneId`,`name`,`uri`,`width`,`height`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseMedia databaseMedia) {
                kVar.i2(1, databaseMedia.getId());
                kVar.i2(2, databaseMedia.getDatabaseSceneId());
                kVar.H(3, databaseMedia.getName());
                kVar.H(4, DatabaseMediaDao_Impl.this.__converters.fromUri(databaseMedia.getUri()));
                kVar.i2(5, (long) databaseMedia.getWidth());
                kVar.i2(6, (long) databaseMedia.getHeight());
                kVar.H(7, DatabaseMediaDao_Impl.this.__converters.fromMediaType(databaseMedia.getType()));
            }
        };
        this.__deletionAdapterOfDatabaseMedia = new C7013j<DatabaseMedia>(this, xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "DELETE FROM `DatabaseMedia` WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseMedia databaseMedia) {
                kVar.i2(1, databaseMedia.getId());
            }
        };
        this.__updateAdapterOfDatabaseMedia = new C7013j<DatabaseMedia>(xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "UPDATE OR REPLACE `DatabaseMedia` SET `id` = ?,`databaseSceneId` = ?,`name` = ?,`uri` = ?,`width` = ?,`height` = ?,`type` = ? WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseMedia databaseMedia) {
                kVar.i2(1, databaseMedia.getId());
                kVar.i2(2, databaseMedia.getDatabaseSceneId());
                kVar.H(3, databaseMedia.getName());
                kVar.H(4, DatabaseMediaDao_Impl.this.__converters.fromUri(databaseMedia.getUri()));
                kVar.i2(5, (long) databaseMedia.getWidth());
                kVar.i2(6, (long) databaseMedia.getHeight());
                kVar.H(7, DatabaseMediaDao_Impl.this.__converters.fromMediaType(databaseMedia.getType()));
                kVar.i2(8, databaseMedia.getId());
            }
        };
        this.__preparedStmtOfDelete = new H(this, xVar) {
            public String createQuery() {
                return "DELETE FROM DatabaseMedia WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteByDatabaseSceneId = new H(this, xVar) {
            public String createQuery() {
                return "DELETE FROM DatabaseMedia WHERE databaseSceneId = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new H(this, xVar) {
            public String createQuery() {
                return "DELETE FROM DatabaseMedia";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public void deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        k acquire = this.__preparedStmtOfDeleteAll.acquire();
        try {
            this.__db.beginTransaction();
            acquire.b0();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(acquire);
        } catch (Throwable th2) {
            this.__preparedStmtOfDeleteAll.release(acquire);
            throw th2;
        }
    }

    public void deleteByDatabaseSceneId(long j10) {
        this.__db.assertNotSuspendingTransaction();
        k acquire = this.__preparedStmtOfDeleteByDatabaseSceneId.acquire();
        acquire.i2(1, j10);
        try {
            this.__db.beginTransaction();
            acquire.b0();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByDatabaseSceneId.release(acquire);
        } catch (Throwable th2) {
            this.__preparedStmtOfDeleteByDatabaseSceneId.release(acquire);
            throw th2;
        }
    }

    public boolean exists(long j10, MediaType mediaType) {
        Cursor e10;
        B e11 = B.e("SELECT EXISTS(SELECT * FROM DatabaseMedia WHERE databaseSceneId = ? and type = ?)", 2);
        boolean z10 = true;
        e11.i2(1, j10);
        e11.H(2, this.__converters.fromMediaType(mediaType));
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            boolean z11 = false;
            e10 = b.e(this.__db, e11, false, (CancellationSignal) null);
            if (e10.moveToFirst()) {
                if (e10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            this.__db.setTransactionSuccessful();
            e10.close();
            e11.h();
            this.__db.endTransaction();
            return z11;
        } catch (Throwable th2) {
            this.__db.endTransaction();
            throw th2;
        }
    }

    public F<List<DatabaseMedia>> get(long j10) {
        final B e10 = B.e("SELECT * FROM DatabaseMedia WHERE databaseSceneId = ?", 1);
        e10.i2(1, j10);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia"}, false, new Callable<List<DatabaseMedia>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseMedia> call() {
                Cursor e10 = b.e(DatabaseMediaDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "databaseSceneId");
                    int d12 = a.d(e10, "name");
                    int d13 = a.d(e10, "uri");
                    int d14 = a.d(e10, "width");
                    int d15 = a.d(e10, "height");
                    int d16 = a.d(e10, "type");
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        arrayList.add(new DatabaseMedia(e10.getLong(d10), e10.getLong(d11), e10.getString(d12), DatabaseMediaDao_Impl.this.__converters.toUri(e10.getString(d13)), e10.getInt(d14), e10.getInt(d15), DatabaseMediaDao_Impl.this.__converters.toMediaType(e10.getString(d16))));
                    }
                    return arrayList;
                } finally {
                    e10.close();
                }
            }
        });
    }

    public List<DatabaseMedia> getNow(long j10, MediaType mediaType) {
        B e10 = B.e("SELECT * FROM DatabaseMedia WHERE databaseSceneId = ? and type = ?", 2);
        e10.i2(1, j10);
        e10.H(2, this.__converters.fromMediaType(mediaType));
        this.__db.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
        try {
            int d10 = a.d(e11, "id");
            int d11 = a.d(e11, "databaseSceneId");
            int d12 = a.d(e11, "name");
            int d13 = a.d(e11, "uri");
            int d14 = a.d(e11, "width");
            int d15 = a.d(e11, "height");
            int d16 = a.d(e11, "type");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(new DatabaseMedia(e11.getLong(d10), e11.getLong(d11), e11.getString(d12), this.__converters.toUri(e11.getString(d13)), e11.getInt(d14), e11.getInt(d15), this.__converters.toMediaType(e11.getString(d16))));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public int delete(DatabaseMedia... databaseMediaArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int handleMultiple = this.__deletionAdapterOfDatabaseMedia.handleMultiple((T[]) databaseMediaArr);
            this.__db.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(DatabaseMedia databaseMedia) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDatabaseMedia.handle(databaseMedia);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public long insert(DatabaseMedia databaseMedia) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfDatabaseMedia.insertAndReturnId(databaseMedia);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<List<DatabaseMedia>> get() {
        final B e10 = B.e("SELECT * FROM DatabaseMedia", 0);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMedia"}, false, new Callable<List<DatabaseMedia>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseMedia> call() {
                Cursor e10 = b.e(DatabaseMediaDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "databaseSceneId");
                    int d12 = a.d(e10, "name");
                    int d13 = a.d(e10, "uri");
                    int d14 = a.d(e10, "width");
                    int d15 = a.d(e10, "height");
                    int d16 = a.d(e10, "type");
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        arrayList.add(new DatabaseMedia(e10.getLong(d10), e10.getLong(d11), e10.getString(d12), DatabaseMediaDao_Impl.this.__converters.toUri(e10.getString(d13)), e10.getInt(d14), e10.getInt(d15), DatabaseMediaDao_Impl.this.__converters.toMediaType(e10.getString(d16))));
                    }
                    return arrayList;
                } finally {
                    e10.close();
                }
            }
        });
    }

    public void delete(long j10) {
        this.__db.assertNotSuspendingTransaction();
        k acquire = this.__preparedStmtOfDelete.acquire();
        acquire.i2(1, j10);
        try {
            this.__db.beginTransaction();
            acquire.b0();
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        } catch (Throwable th2) {
            this.__preparedStmtOfDelete.release(acquire);
            throw th2;
        }
    }

    public void update(List<? extends DatabaseMedia> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDatabaseMedia.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<Long> insert(DatabaseMedia... databaseMediaArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDatabaseMedia.insertAndReturnIdsList((T[]) databaseMediaArr);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<Long> insert(List<? extends DatabaseMedia> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDatabaseMedia.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }
}
