package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import O4.b;
import O4.f;
import Q4.g;
import Q4.h;
import androidx.room.A;
import androidx.room.C7011h;
import androidx.room.r;
import androidx.room.x;
import fz.C14488a;
import fz.C14489b;
import fz.C14490c;
import fz.C14491d;
import fz.C14492e;
import fz.C14493f;
import fz.C14494g;
import fz.C14495h;
import fz.C14496i;
import fz.C14497j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ScanAndGoRoomDatabase_Impl extends ScanAndGoRoomDatabase {

    /* renamed from: a  reason: collision with root package name */
    private volatile C14494g f119910a;

    /* renamed from: b  reason: collision with root package name */
    private volatile C14488a f119911b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C14490c f119912c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C14496i f119913d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C14492e f119914e;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_scanned_products` (`barcode` TEXT NOT NULL, `product` TEXT, PRIMARY KEY(`barcode`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_cart_products` (`barcode` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `productLite` TEXT, `inclTax` REAL NOT NULL DEFAULT 0.0, `exclTax` REAL NOT NULL DEFAULT 0.0, `collected` INTEGER NOT NULL, `type` TEXT NOT NULL, `isSkipped` INTEGER NOT NULL DEFAULT 0, `enabled` INTEGER, `min` INTEGER, `max` INTEGER, `selected` INTEGER, `itemLocation_title` TEXT NOT NULL, `itemLocation_aisle` TEXT NOT NULL, `itemLocation_bin` TEXT NOT NULL, `itemLocation_department` TEXT NOT NULL, PRIMARY KEY(`barcode`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_cart_discounts` (`title` TEXT NOT NULL, `coupon` TEXT, `rawValue` REAL NOT NULL, PRIMARY KEY(`title`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_scan_type` (`barcode` TEXT NOT NULL, `scanType` TEXT, `productAssortmentSpecialType` TEXT, PRIMARY KEY(`barcode`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_coupon` (`coupon` TEXT NOT NULL, `validated` INTEGER NOT NULL, `skippedEnum` TEXT, PRIMARY KEY(`coupon`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_order_pickup_status` (`orderId` TEXT NOT NULL, `storeId` TEXT NOT NULL, `status` TEXT NOT NULL, `changed` INTEGER NOT NULL, PRIMARY KEY(`orderId`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '539cccf8d8aa5e709fb88edf1d67b259')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `scan_and_go_scanned_products`");
            gVar.T("DROP TABLE IF EXISTS `scan_and_go_cart_products`");
            gVar.T("DROP TABLE IF EXISTS `scan_and_go_cart_discounts`");
            gVar.T("DROP TABLE IF EXISTS `scan_and_go_scan_type`");
            gVar.T("DROP TABLE IF EXISTS `scan_and_go_coupon`");
            gVar.T("DROP TABLE IF EXISTS `scan_and_go_order_pickup_status`");
            List<x.b> f10 = ScanAndGoRoomDatabase_Impl.this.mCallbacks;
            if (f10 != null) {
                for (x.b b10 : f10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> g10 = ScanAndGoRoomDatabase_Impl.this.mCallbacks;
            if (g10 != null) {
                for (x.b a10 : g10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = ScanAndGoRoomDatabase_Impl.this.mDatabase = gVar;
            ScanAndGoRoomDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> j10 = ScanAndGoRoomDatabase_Impl.this.mCallbacks;
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
            g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("barcode", new f.a("barcode", "TEXT", true, 1, (String) null, 1));
            hashMap.put("product", new f.a("product", "TEXT", false, 0, (String) null, 1));
            f fVar = new f("scan_and_go_scanned_products", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar2, "scan_and_go_scanned_products");
            if (!fVar.equals(a10)) {
                return new A.c(false, "scan_and_go_scanned_products(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.model.ScanAndGoScannedItemDatabaseModel).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(16);
            hashMap2.put("barcode", new f.a("barcode", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("timeStamp", new f.a("timeStamp", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("productLite", new f.a("productLite", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("inclTax", new f.a("inclTax", "REAL", true, 0, "0.0", 1));
            hashMap2.put("exclTax", new f.a("exclTax", "REAL", true, 0, "0.0", 1));
            hashMap2.put("collected", new f.a("collected", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("type", new f.a("type", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("isSkipped", new f.a("isSkipped", "INTEGER", true, 0, "0", 1));
            hashMap2.put("enabled", new f.a("enabled", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("min", new f.a("min", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("max", new f.a("max", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("selected", new f.a("selected", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("itemLocation_title", new f.a("itemLocation_title", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("itemLocation_aisle", new f.a("itemLocation_aisle", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("itemLocation_bin", new f.a("itemLocation_bin", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("itemLocation_department", new f.a("itemLocation_department", "TEXT", true, 0, (String) null, 1));
            f fVar2 = new f("scan_and_go_cart_products", hashMap2, new HashSet(0), new HashSet(0));
            f a11 = f.a(gVar2, "scan_and_go_cart_products");
            if (!fVar2.equals(a11)) {
                return new A.c(false, "scan_and_go_cart_products(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.model.ScanAndGoCartItemDatabaseModel).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(3);
            hashMap3.put("title", new f.a("title", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("coupon", new f.a("coupon", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("rawValue", new f.a("rawValue", "REAL", true, 0, (String) null, 1));
            f fVar3 = new f("scan_and_go_cart_discounts", hashMap3, new HashSet(0), new HashSet(0));
            f a12 = f.a(gVar2, "scan_and_go_cart_discounts");
            if (!fVar3.equals(a12)) {
                return new A.c(false, "scan_and_go_cart_discounts(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.model.ScanAndGoCartDiscountsEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("barcode", new f.a("barcode", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("scanType", new f.a("scanType", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("productAssortmentSpecialType", new f.a("productAssortmentSpecialType", "TEXT", false, 0, (String) null, 1));
            f fVar4 = new f("scan_and_go_scan_type", hashMap4, new HashSet(0), new HashSet(0));
            f a13 = f.a(gVar2, "scan_and_go_scan_type");
            if (!fVar4.equals(a13)) {
                return new A.c(false, "scan_and_go_scan_type(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.model.ScanTypeDatabaseModel).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(3);
            hashMap5.put("coupon", new f.a("coupon", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("validated", new f.a("validated", "INTEGER", true, 0, (String) null, 1));
            hashMap5.put("skippedEnum", new f.a("skippedEnum", "TEXT", false, 0, (String) null, 1));
            f fVar5 = new f("scan_and_go_coupon", hashMap5, new HashSet(0), new HashSet(0));
            f a14 = f.a(gVar2, "scan_and_go_coupon");
            if (!fVar5.equals(a14)) {
                return new A.c(false, "scan_and_go_coupon(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.model.ScanAndGoCouponEntity).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(4);
            hashMap6.put("orderId", new f.a("orderId", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("storeId", new f.a("storeId", "TEXT", true, 0, (String) null, 1));
            hashMap6.put("status", new f.a("status", "TEXT", true, 0, (String) null, 1));
            hashMap6.put("changed", new f.a("changed", "INTEGER", true, 0, (String) null, 1));
            f fVar6 = new f("scan_and_go_order_pickup_status", hashMap6, new HashSet(0), new HashSet(0));
            f a15 = f.a(gVar2, "scan_and_go_order_pickup_status");
            if (fVar6.equals(a15)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "scan_and_go_order_pickup_status(com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.model.ScanAndGoOrderPickupStatusEntity).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
        }
    }

    public C14488a a() {
        C14488a aVar;
        if (this.f119911b != null) {
            return this.f119911b;
        }
        synchronized (this) {
            try {
                if (this.f119911b == null) {
                    this.f119911b = new C14489b(this);
                }
                aVar = this.f119911b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public C14492e b() {
        C14492e eVar;
        if (this.f119914e != null) {
            return this.f119914e;
        }
        synchronized (this) {
            try {
                if (this.f119914e == null) {
                    this.f119914e = new C14493f(this);
                }
                eVar = this.f119914e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public C14490c c() {
        C14490c cVar;
        if (this.f119912c != null) {
            return this.f119912c;
        }
        synchronized (this) {
            try {
                if (this.f119912c == null) {
                    this.f119912c = new C14491d(this);
                }
                cVar = this.f119912c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("DELETE FROM `scan_and_go_scanned_products`");
            writableDatabase.T("DELETE FROM `scan_and_go_cart_products`");
            writableDatabase.T("DELETE FROM `scan_and_go_cart_discounts`");
            writableDatabase.T("DELETE FROM `scan_and_go_scan_type`");
            writableDatabase.T("DELETE FROM `scan_and_go_coupon`");
            writableDatabase.T("DELETE FROM `scan_and_go_order_pickup_status`");
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
        return new r(this, new HashMap(0), new HashMap(0), "scan_and_go_scanned_products", "scan_and_go_cart_products", "scan_and_go_cart_discounts", "scan_and_go_scan_type", "scan_and_go_coupon", "scan_and_go_order_pickup_status");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(23), "539cccf8d8aa5e709fb88edf1d67b259", "ab7e2c351377d6b43c3d8bc5915c3647")).b());
    }

    public C14494g d() {
        C14494g gVar;
        if (this.f119910a != null) {
            return this.f119910a;
        }
        synchronized (this) {
            try {
                if (this.f119910a == null) {
                    this.f119910a = new C14495h(this);
                }
                gVar = this.f119910a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public C14496i e() {
        C14496i iVar;
        if (this.f119913d != null) {
            return this.f119913d;
        }
        synchronized (this) {
            try {
                if (this.f119913d == null) {
                    this.f119913d = new C14497j(this);
                }
                iVar = this.f119913d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new b());
        arrayList.add(new c());
        arrayList.add(new d());
        arrayList.add(new e());
        arrayList.add(new f());
        arrayList.add(new g());
        arrayList.add(new h());
        return arrayList;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C14494g.class, C14495h.f());
        hashMap.put(C14488a.class, C14489b.B());
        hashMap.put(C14490c.class, C14491d.g());
        hashMap.put(C14496i.class, C14497j.g());
        hashMap.put(C14492e.class, C14493f.m());
        return hashMap;
    }
}
