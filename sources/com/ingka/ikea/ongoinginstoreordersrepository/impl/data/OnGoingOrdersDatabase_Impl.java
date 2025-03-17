package com.ingka.ikea.ongoinginstoreordersrepository.impl.data;

import Fw.C12909b;
import Fw.C12910c;
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

public final class OnGoingOrdersDatabase_Impl extends OnGoingOrdersDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile C12909b f119226b;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `ongoingorders-table` (`timeSlotId` TEXT NOT NULL, `orderId` TEXT, `startTime` TEXT NOT NULL, `endTime` TEXT NOT NULL, `pickupStatus` TEXT NOT NULL, `updatedAt` INTEGER NOT NULL, `products` TEXT, `totalPrice` REAL, PRIMARY KEY(`timeSlotId`))");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0d793eb67edd86594871647fb19755ff')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `ongoingorders-table`");
            List<x.b> b10 = OnGoingOrdersDatabase_Impl.this.mCallbacks;
            if (b10 != null) {
                for (x.b b11 : b10) {
                    b11.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> c10 = OnGoingOrdersDatabase_Impl.this.mCallbacks;
            if (c10 != null) {
                for (x.b a10 : c10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = OnGoingOrdersDatabase_Impl.this.mDatabase = gVar;
            OnGoingOrdersDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> f10 = OnGoingOrdersDatabase_Impl.this.mCallbacks;
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
            HashMap hashMap = new HashMap(8);
            hashMap.put("timeSlotId", new f.a("timeSlotId", "TEXT", true, 1, (String) null, 1));
            hashMap.put("orderId", new f.a("orderId", "TEXT", false, 0, (String) null, 1));
            hashMap.put("startTime", new f.a("startTime", "TEXT", true, 0, (String) null, 1));
            hashMap.put("endTime", new f.a("endTime", "TEXT", true, 0, (String) null, 1));
            hashMap.put("pickupStatus", new f.a("pickupStatus", "TEXT", true, 0, (String) null, 1));
            hashMap.put("updatedAt", new f.a("updatedAt", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("products", new f.a("products", "TEXT", false, 0, (String) null, 1));
            hashMap.put("totalPrice", new f.a("totalPrice", "REAL", false, 0, (String) null, 1));
            f fVar = new f("ongoingorders-table", hashMap, new HashSet(0), new HashSet(0));
            f a10 = f.a(gVar, "ongoingorders-table");
            if (fVar.equals(a10)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "ongoingorders-table(com.ingka.ikea.ongoinginstoreordersrepository.impl.data.OngoingOrdersEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
        }
    }

    public C12909b a() {
        C12909b bVar;
        if (this.f119226b != null) {
            return this.f119226b;
        }
        synchronized (this) {
            try {
                if (this.f119226b == null) {
                    this.f119226b = new C12910c(this);
                }
                bVar = this.f119226b;
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
            writableDatabase.T("DELETE FROM `ongoingorders-table`");
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
        return new r(this, new HashMap(0), new HashMap(0), "ongoingorders-table");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(2), "0d793eb67edd86594871647fb19755ff", "e18dcde067fe82bd9f7ef3ae9679fcd7")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        return arrayList;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C12909b.class, C12910c.m());
        return hashMap;
    }
}
