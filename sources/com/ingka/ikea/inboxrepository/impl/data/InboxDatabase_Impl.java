package com.ingka.ikea.inboxrepository.impl.data;

import Is.c;
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

public final class InboxDatabase_Impl extends InboxDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile Is.a f96135b;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `InboxNotification` (`messageId` TEXT NOT NULL, `title` TEXT NOT NULL, `body` TEXT NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `imageAltText` TEXT NOT NULL, `read` INTEGER NOT NULL, `source` TEXT NOT NULL, `purpose` TEXT NOT NULL, `featureName` TEXT NOT NULL, `featureVersion` INTEGER NOT NULL, `data` TEXT NOT NULL, PRIMARY KEY(`messageId`, `featureName`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2922373a34e2c29f9deda4a031e7e5b2')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `InboxNotification`");
            List<x.b> b10 = InboxDatabase_Impl.this.mCallbacks;
            if (b10 != null) {
                for (x.b b11 : b10) {
                    b11.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> c10 = InboxDatabase_Impl.this.mCallbacks;
            if (c10 != null) {
                for (x.b a10 : c10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = InboxDatabase_Impl.this.mDatabase = gVar;
            InboxDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> f10 = InboxDatabase_Impl.this.mCallbacks;
            if (f10 != null) {
                for (x.b c10 : f10) {
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
            HashMap hashMap = new HashMap(13);
            hashMap.put("messageId", new f.a("messageId", "TEXT", true, 1, (String) null, 1));
            hashMap.put("title", new f.a("title", "TEXT", true, 0, (String) null, 1));
            hashMap.put("body", new f.a("body", "TEXT", true, 0, (String) null, 1));
            hashMap.put("createdAt", new f.a("createdAt", "TEXT", true, 0, (String) null, 1));
            hashMap.put("updatedAt", new f.a("updatedAt", "TEXT", true, 0, (String) null, 1));
            hashMap.put("imageUrl", new f.a("imageUrl", "TEXT", true, 0, (String) null, 1));
            hashMap.put("imageAltText", new f.a("imageAltText", "TEXT", true, 0, (String) null, 1));
            hashMap.put("read", new f.a("read", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("source", new f.a("source", "TEXT", true, 0, (String) null, 1));
            hashMap.put("purpose", new f.a("purpose", "TEXT", true, 0, (String) null, 1));
            hashMap.put("featureName", new f.a("featureName", "TEXT", true, 2, (String) null, 1));
            hashMap.put("featureVersion", new f.a("featureVersion", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("data", new f.a("data", "TEXT", true, 0, (String) null, 1));
            f fVar = new f("InboxNotification", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "InboxNotification");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "InboxNotification(com.ingka.ikea.inboxrepository.impl.data.InboxNotificationEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public Is.a a() {
        Is.a aVar;
        if (this.f96135b != null) {
            return this.f96135b;
        }
        synchronized (this) {
            try {
                if (this.f96135b == null) {
                    this.f96135b = new c(this);
                }
                aVar = this.f96135b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `InboxNotification`");
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
        return new r(this, new HashMap(0), new HashMap(0), "InboxNotification");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(4), "2922373a34e2c29f9deda4a031e7e5b2", "aaf92d2abd3f1ca2b8a33bccffbaa1d7")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        return new ArrayList();
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(Is.a.class, c.u());
        return hashMap;
    }
}
