package com.sugarcube.app.base.data.database;

import N4.a;
import O4.b;
import O4.f;
import Q4.g;
import Q4.h;
import androidx.room.A;
import androidx.room.C7011h;
import androidx.room.r;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ScenesDatabase_Impl extends ScenesDatabase {
    private volatile DatabaseMediaDao _databaseMediaDao;
    private volatile DatabaseMetadataDao _databaseMetadataDao;
    private volatile DatabaseSceneDao _databaseSceneDao;

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.T("DELETE FROM `DatabaseScene`");
            writableDatabase.T("DELETE FROM `DatabaseMedia`");
            writableDatabase.T("DELETE FROM `DatabaseMetadata`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.u2("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.N2()) {
                writableDatabase.T("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public r createInvalidationTracker() {
        return new r(this, new HashMap(0), new HashMap(0), "DatabaseScene", "DatabaseMedia", "DatabaseMetadata");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new A.b(10) {
            public void createAllTables(g gVar) {
                gVar.T("CREATE TABLE IF NOT EXISTS `DatabaseScene` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uuid` TEXT NOT NULL, `sceneId` INTEGER NOT NULL, `sceneUuid` TEXT NOT NULL, `name` TEXT NOT NULL, `createdTs` INTEGER NOT NULL, `lastModifiedTs` INTEGER NOT NULL, `state` TEXT NOT NULL, `compositionCount` INTEGER NOT NULL, `manifest` TEXT, `glbUrl` TEXT, `isStock` INTEGER NOT NULL, `uploadWorkerId` TEXT, `userAcknowledged` INTEGER NOT NULL, `estimatedFinishTs` INTEGER, `upload` TEXT, `wid` INTEGER NOT NULL, `roomType` TEXT, `jobId` TEXT, `pipelineType` TEXT)");
                gVar.T("CREATE TABLE IF NOT EXISTS `DatabaseMedia` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `databaseSceneId` INTEGER NOT NULL, `name` TEXT NOT NULL, `uri` TEXT NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `type` TEXT NOT NULL, FOREIGN KEY(`databaseSceneId`) REFERENCES `DatabaseScene`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                gVar.T("CREATE INDEX IF NOT EXISTS `index_DatabaseMedia_databaseSceneId` ON `DatabaseMedia` (`databaseSceneId`)");
                gVar.T("CREATE TABLE IF NOT EXISTS `DatabaseMetadata` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `databaseSceneId` INTEGER NOT NULL, `name` TEXT NOT NULL, `uri` TEXT NOT NULL, FOREIGN KEY(`databaseSceneId`) REFERENCES `DatabaseScene`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                gVar.T("CREATE INDEX IF NOT EXISTS `index_DatabaseMetadata_databaseSceneId` ON `DatabaseMetadata` (`databaseSceneId`)");
                gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '47220a98da7c71a34630b9747e1f6ba7')");
            }

            public void dropAllTables(g gVar) {
                gVar.T("DROP TABLE IF EXISTS `DatabaseScene`");
                gVar.T("DROP TABLE IF EXISTS `DatabaseMedia`");
                gVar.T("DROP TABLE IF EXISTS `DatabaseMetadata`");
                List<x.b> access$000 = ScenesDatabase_Impl.this.mCallbacks;
                if (access$000 != null) {
                    for (x.b b10 : access$000) {
                        b10.b(gVar);
                    }
                }
            }

            public void onCreate(g gVar) {
                List<x.b> access$100 = ScenesDatabase_Impl.this.mCallbacks;
                if (access$100 != null) {
                    for (x.b a10 : access$100) {
                        a10.a(gVar);
                    }
                }
            }

            public void onOpen(g gVar) {
                g unused = ScenesDatabase_Impl.this.mDatabase = gVar;
                gVar.T("PRAGMA foreign_keys = ON");
                ScenesDatabase_Impl.this.internalInitInvalidationTracker(gVar);
                List<x.b> access$400 = ScenesDatabase_Impl.this.mCallbacks;
                if (access$400 != null) {
                    for (x.b c10 : access$400) {
                        c10.c(gVar);
                    }
                }
            }

            public void onPostMigrate(g gVar) {
            }

            public void onPreMigrate(g gVar) {
                b.b(gVar);
            }

            public A.c onValidateSchema(g gVar) {
                g gVar2 = gVar;
                HashMap hashMap = new HashMap(20);
                hashMap.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap.put("uuid", new f.a("uuid", "TEXT", true, 0, (String) null, 1));
                hashMap.put("sceneId", new f.a("sceneId", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("sceneUuid", new f.a("sceneUuid", "TEXT", true, 0, (String) null, 1));
                hashMap.put("name", new f.a("name", "TEXT", true, 0, (String) null, 1));
                hashMap.put("createdTs", new f.a("createdTs", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("lastModifiedTs", new f.a("lastModifiedTs", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("state", new f.a("state", "TEXT", true, 0, (String) null, 1));
                hashMap.put("compositionCount", new f.a("compositionCount", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("manifest", new f.a("manifest", "TEXT", false, 0, (String) null, 1));
                hashMap.put("glbUrl", new f.a("glbUrl", "TEXT", false, 0, (String) null, 1));
                hashMap.put("isStock", new f.a("isStock", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("uploadWorkerId", new f.a("uploadWorkerId", "TEXT", false, 0, (String) null, 1));
                hashMap.put("userAcknowledged", new f.a("userAcknowledged", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("estimatedFinishTs", new f.a("estimatedFinishTs", "INTEGER", false, 0, (String) null, 1));
                hashMap.put("upload", new f.a("upload", "TEXT", false, 0, (String) null, 1));
                hashMap.put("wid", new f.a("wid", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("roomType", new f.a("roomType", "TEXT", false, 0, (String) null, 1));
                hashMap.put("jobId", new f.a("jobId", "TEXT", false, 0, (String) null, 1));
                hashMap.put("pipelineType", new f.a("pipelineType", "TEXT", false, 0, (String) null, 1));
                f fVar = new f("DatabaseScene", hashMap, new HashSet(0), new HashSet(0));
                f a10 = f.a(gVar2, "DatabaseScene");
                if (!fVar.equals(a10)) {
                    return new A.c(false, "DatabaseScene(com.sugarcube.app.base.data.database.DatabaseScene).\n Expected:\n" + fVar + "\n Found:\n" + a10);
                }
                HashMap hashMap2 = new HashMap(7);
                hashMap2.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap2.put("databaseSceneId", new f.a("databaseSceneId", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("name", new f.a("name", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("uri", new f.a("uri", "TEXT", true, 0, (String) null, 1));
                hashMap2.put("width", new f.a("width", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("height", new f.a("height", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("type", new f.a("type", "TEXT", true, 0, (String) null, 1));
                HashSet hashSet = new HashSet(1);
                f.c cVar = r10;
                f.c cVar2 = new f.c("DatabaseScene", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"databaseSceneId"}), Arrays.asList(new String[]{"id"}));
                hashSet.add(cVar);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new f.e("index_DatabaseMedia_databaseSceneId", false, Arrays.asList(new String[]{"databaseSceneId"}), Arrays.asList(new String[]{"ASC"})));
                f fVar2 = new f("DatabaseMedia", hashMap2, hashSet, hashSet2);
                f a11 = f.a(gVar2, "DatabaseMedia");
                if (!fVar2.equals(a11)) {
                    return new A.c(false, "DatabaseMedia(com.sugarcube.app.base.data.database.DatabaseMedia).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
                }
                HashMap hashMap3 = new HashMap(4);
                hashMap3.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
                hashMap3.put("databaseSceneId", new f.a("databaseSceneId", "INTEGER", true, 0, (String) null, 1));
                hashMap3.put("name", new f.a("name", "TEXT", true, 0, (String) null, 1));
                hashMap3.put("uri", new f.a("uri", "TEXT", true, 0, (String) null, 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new f.c("DatabaseScene", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"databaseSceneId"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new f.e("index_DatabaseMetadata_databaseSceneId", false, Arrays.asList(new String[]{"databaseSceneId"}), Arrays.asList(new String[]{"ASC"})));
                f fVar3 = new f("DatabaseMetadata", hashMap3, hashSet3, hashSet4);
                f a12 = f.a(gVar2, "DatabaseMetadata");
                if (fVar3.equals(a12)) {
                    return new A.c(true, (String) null);
                }
                return new A.c(false, "DatabaseMetadata(com.sugarcube.app.base.data.database.DatabaseMetadata).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
        }, "47220a98da7c71a34630b9747e1f6ba7", "78a568e7c59b8086cc073bc5b38d6f85")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends a>, a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScenesDatabase_AutoMigration_7_8_Impl());
        arrayList.add(new ScenesDatabase_AutoMigration_8_9_Impl());
        arrayList.add(new ScenesDatabase_AutoMigration_9_10_Impl());
        return arrayList;
    }

    public DatabaseMediaDao getDatabaseMediaDao() {
        DatabaseMediaDao databaseMediaDao;
        if (this._databaseMediaDao != null) {
            return this._databaseMediaDao;
        }
        synchronized (this) {
            try {
                if (this._databaseMediaDao == null) {
                    this._databaseMediaDao = new DatabaseMediaDao_Impl(this);
                }
                databaseMediaDao = this._databaseMediaDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return databaseMediaDao;
    }

    public DatabaseMetadataDao getDatabaseMetadataDao() {
        DatabaseMetadataDao databaseMetadataDao;
        if (this._databaseMetadataDao != null) {
            return this._databaseMetadataDao;
        }
        synchronized (this) {
            try {
                if (this._databaseMetadataDao == null) {
                    this._databaseMetadataDao = new DatabaseMetadataDao_Impl(this);
                }
                databaseMetadataDao = this._databaseMetadataDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return databaseMetadataDao;
    }

    public DatabaseSceneDao getDatabaseSceneDao() {
        DatabaseSceneDao databaseSceneDao;
        if (this._databaseSceneDao != null) {
            return this._databaseSceneDao;
        }
        synchronized (this) {
            try {
                if (this._databaseSceneDao == null) {
                    this._databaseSceneDao = new DatabaseSceneDao_Impl(this);
                }
                databaseSceneDao = this._databaseSceneDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return databaseSceneDao;
    }

    public Set<Class<? extends a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(DatabaseSceneDao.class, DatabaseSceneDao_Impl.getRequiredConverters());
        hashMap.put(DatabaseMetadataDao.class, DatabaseMetadataDao_Impl.getRequiredConverters());
        hashMap.put(DatabaseMediaDao.class, DatabaseMediaDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
