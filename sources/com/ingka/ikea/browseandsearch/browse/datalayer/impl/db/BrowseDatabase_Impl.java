package com.ingka.ikea.browseandsearch.browse.datalayer.impl.db;

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
import jn.C11431b;
import jn.C11432c;

public final class BrowseDatabase_Impl extends BrowseDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile C11431b f93344b;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `BrowseData` (`id` INTEGER NOT NULL, `categories` TEXT NOT NULL, `rooms` TEXT NOT NULL, `promotion` TEXT, PRIMARY KEY(`id`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e06c1c6921b047269645d661d081aa28')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `BrowseData`");
            List<x.b> b10 = BrowseDatabase_Impl.this.mCallbacks;
            if (b10 != null) {
                for (x.b b11 : b10) {
                    b11.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> c10 = BrowseDatabase_Impl.this.mCallbacks;
            if (c10 != null) {
                for (x.b a10 : c10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = BrowseDatabase_Impl.this.mDatabase = gVar;
            BrowseDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> f10 = BrowseDatabase_Impl.this.mCallbacks;
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
            HashMap hashMap = new HashMap(4);
            hashMap.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("categories", new f.a("categories", "TEXT", true, 0, (String) null, 1));
            hashMap.put("rooms", new f.a("rooms", "TEXT", true, 0, (String) null, 1));
            hashMap.put("promotion", new f.a("promotion", "TEXT", false, 0, (String) null, 1));
            f fVar = new f("BrowseData", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "BrowseData");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "BrowseData(com.ingka.ikea.browseandsearch.browse.datalayer.impl.db.BrowseEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public C11431b a() {
        C11431b bVar;
        if (this.f93344b != null) {
            return this.f93344b;
        }
        synchronized (this) {
            try {
                if (this.f93344b == null) {
                    this.f93344b = new C11432c(this);
                }
                bVar = this.f93344b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `BrowseData`");
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
        return new r(this, new HashMap(0), new HashMap(0), "BrowseData");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(11), "e06c1c6921b047269645d661d081aa28", "99baf66a32791b5a3a75e35a79c5b0c5")).b());
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
        hashMap.put(C11431b.class, C11432c.g());
        return hashMap;
    }
}
