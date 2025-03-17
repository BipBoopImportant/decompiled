package com.ingka.ikea.app.localhistory;

import Ng.c;
import Ng.d;
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

public final class LocalHistoryDatabase_Impl extends LocalHistoryDatabase {

    /* renamed from: e  reason: collision with root package name */
    private volatile Ng.a f72024e;

    /* renamed from: f  reason: collision with root package name */
    private volatile c f72025f;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `localRecentItems` (`itemNo` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `productName` TEXT NOT NULL, PRIMARY KEY(`itemNo`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `localRecentSearch` (`searchPhrase` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, PRIMARY KEY(`searchPhrase`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6727a84477414bdcb15340e7c36e38df')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `localRecentItems`");
            gVar.T("DROP TABLE IF EXISTS `localRecentSearch`");
            List<x.b> f10 = LocalHistoryDatabase_Impl.this.mCallbacks;
            if (f10 != null) {
                for (x.b b10 : f10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> g10 = LocalHistoryDatabase_Impl.this.mCallbacks;
            if (g10 != null) {
                for (x.b a10 : g10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = LocalHistoryDatabase_Impl.this.mDatabase = gVar;
            LocalHistoryDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> j10 = LocalHistoryDatabase_Impl.this.mCallbacks;
            if (j10 != null) {
                for (x.b c10 : j10) {
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
            hashMap.put("itemNo", new f.a("itemNo", "TEXT", true, 1, (String) null, 1));
            hashMap.put("imageUrl", new f.a("imageUrl", "TEXT", true, 0, (String) null, 1));
            hashMap.put("timestamp", new f.a("timestamp", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("productName", new f.a("productName", "TEXT", true, 0, (String) null, 1));
            f fVar = new f("localRecentItems", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "localRecentItems");
            if (!fVar.equals(a10)) {
                return new A.c(false, "localRecentItems(com.ingka.ikea.app.localhistory.entities.LocalRecentProductEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("searchPhrase", new f.a("searchPhrase", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("timeStamp", new f.a("timeStamp", "INTEGER", true, 0, (String) null, 1));
            f fVar2 = new f("localRecentSearch", hashMap2, new HashSet(0), new HashSet(0));
            f a11 = f.a(gVar, "localRecentSearch");
            if (fVar2.equals(a11)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "localRecentSearch(com.ingka.ikea.app.localhistory.entities.LocalRecentSearchEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
        }
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `localRecentItems`");
            writableDatabase.T("DELETE FROM `localRecentSearch`");
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
        return new r(this, new HashMap(0), new HashMap(0), "localRecentItems", "localRecentSearch");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(4), "6727a84477414bdcb15340e7c36e38df", "de673653e6577747dc7464152daa8401")).b());
    }

    public Ng.a d() {
        Ng.a aVar;
        if (this.f72024e != null) {
            return this.f72024e;
        }
        synchronized (this) {
            try {
                if (this.f72024e == null) {
                    this.f72024e = new Ng.b(this);
                }
                aVar = this.f72024e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public c e() {
        c cVar;
        if (this.f72025f != null) {
            return this.f72025f;
        }
        synchronized (this) {
            try {
                if (this.f72025f == null) {
                    this.f72025f = new d(this);
                }
                cVar = this.f72025f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
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
        hashMap.put(Ng.a.class, Ng.b.j());
        hashMap.put(c.class, d.k());
        return hashMap;
    }
}
