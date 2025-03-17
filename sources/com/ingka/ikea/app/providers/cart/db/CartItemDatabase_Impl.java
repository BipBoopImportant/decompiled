package com.ingka.ikea.app.providers.cart.db;

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

public final class CartItemDatabase_Impl extends CartItemDatabase {

    /* renamed from: c  reason: collision with root package name */
    private volatile pi.a f72303c;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `CartItems` (`ProductNumber` TEXT NOT NULL, `ProductType` TEXT NOT NULL, `Quantity` INTEGER NOT NULL, PRIMARY KEY(`ProductNumber`, `ProductType`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2c78dc389fae5cfe214e50f572494d28')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `CartItems`");
            List<x.b> d10 = CartItemDatabase_Impl.this.mCallbacks;
            if (d10 != null) {
                for (x.b b10 : d10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> e10 = CartItemDatabase_Impl.this.mCallbacks;
            if (e10 != null) {
                for (x.b a10 : e10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = CartItemDatabase_Impl.this.mDatabase = gVar;
            CartItemDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> h10 = CartItemDatabase_Impl.this.mCallbacks;
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
            HashMap hashMap = new HashMap(3);
            hashMap.put("ProductNumber", new f.a("ProductNumber", "TEXT", true, 1, (String) null, 1));
            hashMap.put("ProductType", new f.a("ProductType", "TEXT", true, 2, (String) null, 1));
            hashMap.put("Quantity", new f.a("Quantity", "INTEGER", true, 0, (String) null, 1));
            f fVar = new f("CartItems", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "CartItems");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "CartItems(com.ingka.ikea.app.providers.cart.db.CartItemEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public pi.a c() {
        pi.a aVar;
        if (this.f72303c != null) {
            return this.f72303c;
        }
        synchronized (this) {
            try {
                if (this.f72303c == null) {
                    this.f72303c = new pi.b(this);
                }
                aVar = this.f72303c;
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
            writableDatabase.T("DELETE FROM `CartItems`");
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
        return new r(this, new HashMap(0), new HashMap(0), "CartItems");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(1), "2c78dc389fae5cfe214e50f572494d28", "b049a04de1d6dd74d514a981097c7db9")).b());
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
        hashMap.put(pi.a.class, pi.b.h());
        return hashMap;
    }
}
