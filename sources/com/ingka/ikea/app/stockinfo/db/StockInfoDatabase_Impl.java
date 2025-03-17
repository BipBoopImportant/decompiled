package com.ingka.ikea.app.stockinfo.db;

import O4.f;
import Q4.g;
import Q4.h;
import Tk.b;
import Tk.c;
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

public final class StockInfoDatabase_Impl extends StockInfoDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile b f92539b;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `StockInfo` (`DateCreated` INTEGER NOT NULL, `StoreId` TEXT NOT NULL, `itemNo` TEXT NOT NULL, `itemType` TEXT NOT NULL, `ProductLocation` TEXT, `StockStatus` INTEGER NOT NULL, `StockText` TEXT NOT NULL, `Label` TEXT NOT NULL, `Heading` TEXT, `Title` TEXT, `Description` TEXT, `Aisle` TEXT, `Bin` TEXT, `SalePoint` INTEGER NOT NULL, `StockQuantityDetails` TEXT NOT NULL, `StockQuantityChecked` TEXT NOT NULL, PRIMARY KEY(`StoreId`, `itemNo`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '00c9f0e1883d9ddd64d92cd96fc2e4fd')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `StockInfo`");
            List<x.b> b10 = StockInfoDatabase_Impl.this.mCallbacks;
            if (b10 != null) {
                for (x.b b11 : b10) {
                    b11.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> c10 = StockInfoDatabase_Impl.this.mCallbacks;
            if (c10 != null) {
                for (x.b a10 : c10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = StockInfoDatabase_Impl.this.mDatabase = gVar;
            StockInfoDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> f10 = StockInfoDatabase_Impl.this.mCallbacks;
            if (f10 != null) {
                for (x.b c10 : f10) {
                    c10.c(gVar);
                }
            }
        }

        public void onPostMigrate(g gVar) {
        }

        public void onPreMigrate(g gVar) {
            O4.b.b(gVar);
        }

        public A.c onValidateSchema(g gVar) {
            HashMap hashMap = new HashMap(16);
            hashMap.put("DateCreated", new f.a("DateCreated", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("StoreId", new f.a("StoreId", "TEXT", true, 1, (String) null, 1));
            hashMap.put("itemNo", new f.a("itemNo", "TEXT", true, 2, (String) null, 1));
            hashMap.put("itemType", new f.a("itemType", "TEXT", true, 0, (String) null, 1));
            hashMap.put("ProductLocation", new f.a("ProductLocation", "TEXT", false, 0, (String) null, 1));
            hashMap.put("StockStatus", new f.a("StockStatus", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("StockText", new f.a("StockText", "TEXT", true, 0, (String) null, 1));
            hashMap.put("Label", new f.a("Label", "TEXT", true, 0, (String) null, 1));
            hashMap.put("Heading", new f.a("Heading", "TEXT", false, 0, (String) null, 1));
            hashMap.put("Title", new f.a("Title", "TEXT", false, 0, (String) null, 1));
            hashMap.put("Description", new f.a("Description", "TEXT", false, 0, (String) null, 1));
            hashMap.put("Aisle", new f.a("Aisle", "TEXT", false, 0, (String) null, 1));
            hashMap.put("Bin", new f.a("Bin", "TEXT", false, 0, (String) null, 1));
            hashMap.put("SalePoint", new f.a("SalePoint", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("StockQuantityDetails", new f.a("StockQuantityDetails", "TEXT", true, 0, (String) null, 1));
            hashMap.put("StockQuantityChecked", new f.a("StockQuantityChecked", "TEXT", true, 0, (String) null, 1));
            f fVar = new f("StockInfo", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "StockInfo");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "StockInfo(com.ingka.ikea.app.stockinfo.repo.StockAvailabilityEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public b a() {
        b bVar;
        if (this.f92539b != null) {
            return this.f92539b;
        }
        synchronized (this) {
            try {
                if (this.f92539b == null) {
                    this.f92539b = new c(this);
                }
                bVar = this.f92539b;
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
            writableDatabase.T("DELETE FROM `StockInfo`");
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
        return new r(this, new HashMap(0), new HashMap(0), "StockInfo");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(8), "00c9f0e1883d9ddd64d92cd96fc2e4fd", "c8d8a24c9b9060f48d0be9118e31e845")).b());
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
        hashMap.put(b.class, c.j());
        return hashMap;
    }
}
