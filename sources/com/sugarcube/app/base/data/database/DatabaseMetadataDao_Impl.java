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

public final class DatabaseMetadataDao_Impl extends DatabaseMetadataDao {
    /* access modifiers changed from: private */
    public final Converters __converters = new Converters();
    /* access modifiers changed from: private */
    public final x __db;
    private final C7013j<DatabaseMetadata> __deletionAdapterOfDatabaseMetadata;
    private final C7014k<DatabaseMetadata> __insertionAdapterOfDatabaseMetadata;
    private final H __preparedStmtOfDelete;
    private final H __preparedStmtOfDeleteAll;
    private final C7013j<DatabaseMetadata> __updateAdapterOfDatabaseMetadata;

    public DatabaseMetadataDao_Impl(x xVar) {
        this.__db = xVar;
        this.__insertionAdapterOfDatabaseMetadata = new C7014k<DatabaseMetadata>(xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "INSERT OR REPLACE INTO `DatabaseMetadata` (`id`,`databaseSceneId`,`name`,`uri`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseMetadata databaseMetadata) {
                kVar.i2(1, databaseMetadata.getId());
                kVar.i2(2, databaseMetadata.getDatabaseSceneId());
                kVar.H(3, databaseMetadata.getName());
                kVar.H(4, DatabaseMetadataDao_Impl.this.__converters.fromUri(databaseMetadata.getUri()));
            }
        };
        this.__deletionAdapterOfDatabaseMetadata = new C7013j<DatabaseMetadata>(this, xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "DELETE FROM `DatabaseMetadata` WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseMetadata databaseMetadata) {
                kVar.i2(1, databaseMetadata.getId());
            }
        };
        this.__updateAdapterOfDatabaseMetadata = new C7013j<DatabaseMetadata>(xVar) {
            /* access modifiers changed from: protected */
            public String createQuery() {
                return "UPDATE OR REPLACE `DatabaseMetadata` SET `id` = ?,`databaseSceneId` = ?,`name` = ?,`uri` = ? WHERE `id` = ?";
            }

            /* access modifiers changed from: protected */
            public void bind(k kVar, DatabaseMetadata databaseMetadata) {
                kVar.i2(1, databaseMetadata.getId());
                kVar.i2(2, databaseMetadata.getDatabaseSceneId());
                kVar.H(3, databaseMetadata.getName());
                kVar.H(4, DatabaseMetadataDao_Impl.this.__converters.fromUri(databaseMetadata.getUri()));
                kVar.i2(5, databaseMetadata.getId());
            }
        };
        this.__preparedStmtOfDelete = new H(this, xVar) {
            public String createQuery() {
                return "DELETE FROM DatabaseMetadata WHERE databaseSceneId = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new H(this, xVar) {
            public String createQuery() {
                return "DELETE FROM DatabaseMetadata";
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

    public boolean exists(long j10) {
        Cursor e10;
        boolean z10 = true;
        B e11 = B.e("SELECT EXISTS(SELECT * FROM DatabaseMetadata WHERE databaseSceneId = ?)", 1);
        e11.i2(1, j10);
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

    public F<List<DatabaseMetadata>> get(long j10) {
        final B e10 = B.e("SELECT * FROM DatabaseMetadata WHERE databaseSceneId = ?", 1);
        e10.i2(1, j10);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMetadata"}, false, new Callable<List<DatabaseMetadata>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseMetadata> call() {
                Cursor e10 = b.e(DatabaseMetadataDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "databaseSceneId");
                    int d12 = a.d(e10, "name");
                    int d13 = a.d(e10, "uri");
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        arrayList.add(new DatabaseMetadata(e10.getLong(d10), e10.getLong(d11), e10.getString(d12), DatabaseMetadataDao_Impl.this.__converters.toUri(e10.getString(d13))));
                    }
                    return arrayList;
                } finally {
                    e10.close();
                }
            }
        });
    }

    public List<DatabaseMetadata> getNow(long j10) {
        B e10 = B.e("SELECT * FROM DatabaseMetadata WHERE databaseSceneId = ?", 1);
        e10.i2(1, j10);
        this.__db.assertNotSuspendingTransaction();
        Cursor e11 = b.e(this.__db, e10, false, (CancellationSignal) null);
        try {
            int d10 = a.d(e11, "id");
            int d11 = a.d(e11, "databaseSceneId");
            int d12 = a.d(e11, "name");
            int d13 = a.d(e11, "uri");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(new DatabaseMetadata(e11.getLong(d10), e11.getLong(d11), e11.getString(d12), this.__converters.toUri(e11.getString(d13))));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public int delete(DatabaseMetadata... databaseMetadataArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            int handleMultiple = this.__deletionAdapterOfDatabaseMetadata.handleMultiple((T[]) databaseMetadataArr);
            this.__db.setTransactionSuccessful();
            return handleMultiple;
        } finally {
            this.__db.endTransaction();
        }
    }

    public void update(DatabaseMetadata databaseMetadata) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDatabaseMetadata.handle(databaseMetadata);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public long insert(DatabaseMetadata databaseMetadata) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            long insertAndReturnId = this.__insertionAdapterOfDatabaseMetadata.insertAndReturnId(databaseMetadata);
            this.__db.setTransactionSuccessful();
            return insertAndReturnId;
        } finally {
            this.__db.endTransaction();
        }
    }

    public F<List<DatabaseMetadata>> get() {
        final B e10 = B.e("SELECT * FROM DatabaseMetadata", 0);
        return this.__db.getInvalidationTracker().e(new String[]{"DatabaseMetadata"}, false, new Callable<List<DatabaseMetadata>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                e10.h();
            }

            public List<DatabaseMetadata> call() {
                Cursor e10 = b.e(DatabaseMetadataDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int d10 = a.d(e10, "id");
                    int d11 = a.d(e10, "databaseSceneId");
                    int d12 = a.d(e10, "name");
                    int d13 = a.d(e10, "uri");
                    ArrayList arrayList = new ArrayList(e10.getCount());
                    while (e10.moveToNext()) {
                        arrayList.add(new DatabaseMetadata(e10.getLong(d10), e10.getLong(d11), e10.getString(d12), DatabaseMetadataDao_Impl.this.__converters.toUri(e10.getString(d13))));
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

    public void update(List<? extends DatabaseMetadata> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfDatabaseMetadata.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<Long> insert(DatabaseMetadata... databaseMetadataArr) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDatabaseMetadata.insertAndReturnIdsList((T[]) databaseMetadataArr);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }

    public List<Long> insert(List<? extends DatabaseMetadata> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            List<Long> insertAndReturnIdsList = this.__insertionAdapterOfDatabaseMetadata.insertAndReturnIdsList(list);
            this.__db.setTransactionSuccessful();
            return insertAndReturnIdsList;
        } finally {
            this.__db.endTransaction();
        }
    }
}
