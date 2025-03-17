package com.sugarcube.app.base.upload;

import KF.C13153g;
import KF.C13163q;
import O4.b;
import O4.f;
import Q4.g;
import Q4.h;
import androidx.room.A;
import androidx.room.C7011h;
import androidx.room.r;
import androidx.room.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class UploadTrackerDb_Impl extends UploadTrackerDb {

    /* renamed from: a  reason: collision with root package name */
    private volatile UploadSetDao f125750a;

    /* renamed from: b  reason: collision with root package name */
    private volatile UploadFileDao f125751b;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `UploadSetDBO` (`captureUUID` TEXT NOT NULL, `uploadUUID` TEXT, `uploadUUIDCreatedTs` INTEGER, `state` TEXT NOT NULL, `sceneUUID` TEXT, `uploadAttempts` INTEGER NOT NULL, `roomTitle` TEXT NOT NULL, `roomType` TEXT NOT NULL, `captureType` TEXT NOT NULL, `captureStrategy` TEXT NOT NULL, PRIMARY KEY(`captureUUID`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `UploadFileDBO` (`localPath` TEXT NOT NULL, `fileName` TEXT NOT NULL, `localState` TEXT NOT NULL, `remoteState` TEXT NOT NULL, `captureUUID` TEXT NOT NULL, `remotePath` TEXT NOT NULL, `contentType` TEXT NOT NULL, `contentMd5` TEXT, `uploadUrl` TEXT, `uploadAttempts` INTEGER NOT NULL, PRIMARY KEY(`localPath`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8e7cf8dd40a026574fff143859231816')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `UploadSetDBO`");
            gVar.T("DROP TABLE IF EXISTS `UploadFileDBO`");
            List<x.b> d10 = UploadTrackerDb_Impl.this.mCallbacks;
            if (d10 != null) {
                for (x.b b10 : d10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> e10 = UploadTrackerDb_Impl.this.mCallbacks;
            if (e10 != null) {
                for (x.b a10 : e10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = UploadTrackerDb_Impl.this.mDatabase = gVar;
            UploadTrackerDb_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> h10 = UploadTrackerDb_Impl.this.mCallbacks;
            if (h10 != null) {
                for (x.b c10 : h10) {
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
            HashMap hashMap = new HashMap(10);
            hashMap.put("captureUUID", new f.a("captureUUID", "TEXT", true, 1, (String) null, 1));
            hashMap.put("uploadUUID", new f.a("uploadUUID", "TEXT", false, 0, (String) null, 1));
            hashMap.put("uploadUUIDCreatedTs", new f.a("uploadUUIDCreatedTs", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("state", new f.a("state", "TEXT", true, 0, (String) null, 1));
            hashMap.put("sceneUUID", new f.a("sceneUUID", "TEXT", false, 0, (String) null, 1));
            hashMap.put("uploadAttempts", new f.a("uploadAttempts", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("roomTitle", new f.a("roomTitle", "TEXT", true, 0, (String) null, 1));
            hashMap.put("roomType", new f.a("roomType", "TEXT", true, 0, (String) null, 1));
            hashMap.put("captureType", new f.a("captureType", "TEXT", true, 0, (String) null, 1));
            hashMap.put("captureStrategy", new f.a("captureStrategy", "TEXT", true, 0, (String) null, 1));
            f fVar = new f("UploadSetDBO", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar2, "UploadSetDBO");
            if (!fVar.equals(a10)) {
                return new A.c(false, "UploadSetDBO(com.sugarcube.app.base.upload.models.UploadSetDBO).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(10);
            hashMap2.put("localPath", new f.a("localPath", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("fileName", new f.a("fileName", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("localState", new f.a("localState", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("remoteState", new f.a("remoteState", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("captureUUID", new f.a("captureUUID", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("remotePath", new f.a("remotePath", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("contentType", new f.a("contentType", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("contentMd5", new f.a("contentMd5", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("uploadUrl", new f.a("uploadUrl", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("uploadAttempts", new f.a("uploadAttempts", "INTEGER", true, 0, (String) null, 1));
            f fVar2 = new f("UploadFileDBO", hashMap2, new HashSet(0), new HashSet(0));
            f a11 = f.a(gVar2, "UploadFileDBO");
            if (fVar2.equals(a11)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "UploadFileDBO(com.sugarcube.app.base.upload.models.UploadFileDBO).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
        }
    }

    public UploadFileDao a() {
        UploadFileDao uploadFileDao;
        if (this.f125751b != null) {
            return this.f125751b;
        }
        synchronized (this) {
            try {
                if (this.f125751b == null) {
                    this.f125751b = new C13153g(this);
                }
                uploadFileDao = this.f125751b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uploadFileDao;
    }

    public UploadSetDao b() {
        UploadSetDao uploadSetDao;
        if (this.f125750a != null) {
            return this.f125750a;
        }
        synchronized (this) {
            try {
                if (this.f125750a == null) {
                    this.f125750a = new C13163q(this);
                }
                uploadSetDao = this.f125750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uploadSetDao;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `UploadSetDBO`");
            writableDatabase.T("DELETE FROM `UploadFileDBO`");
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
        return new r(this, new HashMap(0), new HashMap(0), "UploadSetDBO", "UploadFileDBO");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(2), "8e7cf8dd40a026574fff143859231816", "0c467620b3a0e726e5b3a819769a4859")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f());
        return arrayList;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(UploadSetDao.class, C13163q.e());
        hashMap.put(UploadFileDao.class, C13153g.h());
        return hashMap;
    }
}
