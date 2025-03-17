package com.ingka.ikea.shoppinglist.datalayer.impl.db;

import O4.b;
import O4.f;
import Q4.g;
import Q4.h;
import VA.C13737a;
import VA.C13740d;
import VA.C13741e;
import VA.C13747k;
import VA.C13750l;
import VA.C13751m;
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

public final class ShoppingListDatabase_Impl extends ShoppingListDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile C13750l f120289b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C13741e f120290c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C13737a f120291d;

    class a extends A.b {
        a(int i10) {
            super(i10);
        }

        public void createAllTables(g gVar) {
            gVar.T("CREATE TABLE IF NOT EXISTS `ShoppingListEvents` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `list_id` TEXT NOT NULL, `event` TEXT NOT NULL, FOREIGN KEY(`list_id`) REFERENCES `ShoppingLists`(`list_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.T("CREATE INDEX IF NOT EXISTS `index_ShoppingListEvents_list_id` ON `ShoppingListEvents` (`list_id`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `ShoppingLists` (`list_id` TEXT NOT NULL, `name` TEXT NOT NULL, `updated_at` TEXT NOT NULL, PRIMARY KEY(`list_id`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `SalesPrices` (`parent_item_no` TEXT NOT NULL, `type` TEXT NOT NULL, `price` REAL NOT NULL, `tax` REAL NOT NULL, `comparison_price` TEXT, `valid_until` TEXT, `previous_price` REAL, `lowest_previous_price` REAL, PRIMARY KEY(`parent_item_no`, `type`))");
            gVar.T("CREATE TABLE IF NOT EXISTS `ShoppingListItems` (`list_id` TEXT NOT NULL, `item_no` TEXT NOT NULL, `item_type` TEXT NOT NULL, `quantity` INTEGER NOT NULL, `updated_at` TEXT NOT NULL, `total_packages` INTEGER NOT NULL, `online_sellable` INTEGER NOT NULL, `is_communicated_online` INTEGER NOT NULL, `is_breathtaking_item` INTEGER NOT NULL, `is_new_item` INTEGER NOT NULL, `environmental_fees` TEXT NOT NULL, `name` TEXT, `description` TEXT, `measurement` TEXT, `price_unit_text` TEXT, `unit_type` TEXT, `image_url` TEXT, `contextual_image_url` TEXT, `energy_label_url` TEXT, PRIMARY KEY(`item_no`, `list_id`), FOREIGN KEY(`list_id`) REFERENCES `ShoppingLists`(`list_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
            gVar.T("CREATE UNIQUE INDEX IF NOT EXISTS `index_ShoppingListItems_list_id_item_no` ON `ShoppingListItems` (`list_id`, `item_no`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `ArticleItems` (`item_no` TEXT NOT NULL, `parent_item_no` TEXT NOT NULL, `list_id` TEXT NOT NULL, PRIMARY KEY(`item_no`, `list_id`, `parent_item_no`))");
            gVar.T("CREATE UNIQUE INDEX IF NOT EXISTS `index_ArticleItems_item_no_list_id_parent_item_no` ON `ArticleItems` (`item_no`, `list_id`, `parent_item_no`)");
            gVar.T("CREATE TABLE IF NOT EXISTS `ArticleDetails` (`parent_item_no` TEXT NOT NULL, `parent_article_item_no` TEXT NOT NULL, `number_of_packages` INTEGER NOT NULL, `quantity_per_item` INTEGER NOT NULL, `name` TEXT, `description` TEXT, `measurement` TEXT, `price_unit_text` TEXT, `unit_type` TEXT, `image_url` TEXT, `contextual_image_url` TEXT, `energy_label_url` TEXT, PRIMARY KEY(`parent_item_no`, `parent_article_item_no`))");
            gVar.T("CREATE UNIQUE INDEX IF NOT EXISTS `index_ArticleDetails_parent_item_no_parent_article_item_no` ON `ArticleDetails` (`parent_item_no`, `parent_article_item_no`)");
            gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.T("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b150de0311e724de94a3429799f2e677')");
        }

        public void dropAllTables(g gVar) {
            gVar.T("DROP TABLE IF EXISTS `ShoppingListEvents`");
            gVar.T("DROP TABLE IF EXISTS `ShoppingLists`");
            gVar.T("DROP TABLE IF EXISTS `SalesPrices`");
            gVar.T("DROP TABLE IF EXISTS `ShoppingListItems`");
            gVar.T("DROP TABLE IF EXISTS `ArticleItems`");
            gVar.T("DROP TABLE IF EXISTS `ArticleDetails`");
            List<x.b> d10 = ShoppingListDatabase_Impl.this.mCallbacks;
            if (d10 != null) {
                for (x.b b10 : d10) {
                    b10.b(gVar);
                }
            }
        }

        public void onCreate(g gVar) {
            List<x.b> e10 = ShoppingListDatabase_Impl.this.mCallbacks;
            if (e10 != null) {
                for (x.b a10 : e10) {
                    a10.a(gVar);
                }
            }
        }

        public void onOpen(g gVar) {
            g unused = ShoppingListDatabase_Impl.this.mDatabase = gVar;
            gVar.T("PRAGMA foreign_keys = ON");
            ShoppingListDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            List<x.b> h10 = ShoppingListDatabase_Impl.this.mCallbacks;
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
            HashMap hashMap = new HashMap(3);
            hashMap.put("id", new f.a("id", "INTEGER", true, 1, (String) null, 1));
            hashMap.put("list_id", new f.a("list_id", "TEXT", true, 0, (String) null, 1));
            hashMap.put("event", new f.a("event", "TEXT", true, 0, (String) null, 1));
            HashSet hashSet = new HashSet(1);
            hashSet.add(new f.c("ShoppingLists", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"list_id"}), Arrays.asList(new String[]{"list_id"})));
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new f.e("index_ShoppingListEvents_list_id", false, Arrays.asList(new String[]{"list_id"}), Arrays.asList(new String[]{"ASC"})));
            f fVar = new f("ShoppingListEvents", hashMap, hashSet, hashSet2);
            f a10 = f.a(gVar2, "ShoppingListEvents");
            if (!fVar.equals(a10)) {
                return new A.c(false, "ShoppingListEvents(com.ingka.ikea.shoppinglist.datalayer.impl.db.entity.ShoppingListEventEntity).\n Expected:\n" + fVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("list_id", new f.a("list_id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("name", new f.a("name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("updated_at", new f.a("updated_at", "TEXT", true, 0, (String) null, 1));
            f fVar2 = new f("ShoppingLists", hashMap2, new HashSet(0), new HashSet(0));
            f a11 = f.a(gVar2, "ShoppingLists");
            if (!fVar2.equals(a11)) {
                return new A.c(false, "ShoppingLists(com.ingka.ikea.shoppinglist.datalayer.impl.db.entity.ShoppingListEntity).\n Expected:\n" + fVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(8);
            hashMap3.put("parent_item_no", new f.a("parent_item_no", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("type", new f.a("type", "TEXT", true, 2, (String) null, 1));
            hashMap3.put("price", new f.a("price", "REAL", true, 0, (String) null, 1));
            hashMap3.put("tax", new f.a("tax", "REAL", true, 0, (String) null, 1));
            hashMap3.put("comparison_price", new f.a("comparison_price", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("valid_until", new f.a("valid_until", "TEXT", false, 0, (String) null, 1));
            hashMap3.put("previous_price", new f.a("previous_price", "REAL", false, 0, (String) null, 1));
            hashMap3.put("lowest_previous_price", new f.a("lowest_previous_price", "REAL", false, 0, (String) null, 1));
            f fVar3 = new f("SalesPrices", hashMap3, new HashSet(0), new HashSet(0));
            f a12 = f.a(gVar2, "SalesPrices");
            if (!fVar3.equals(a12)) {
                return new A.c(false, "SalesPrices(com.ingka.ikea.shoppinglist.datalayer.impl.db.entity.SalesPricesEntity).\n Expected:\n" + fVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(19);
            hashMap4.put("list_id", new f.a("list_id", "TEXT", true, 2, (String) null, 1));
            hashMap4.put("item_no", new f.a("item_no", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("item_type", new f.a("item_type", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("quantity", new f.a("quantity", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("updated_at", new f.a("updated_at", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("total_packages", new f.a("total_packages", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("online_sellable", new f.a("online_sellable", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("is_communicated_online", new f.a("is_communicated_online", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("is_breathtaking_item", new f.a("is_breathtaking_item", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("is_new_item", new f.a("is_new_item", "INTEGER", true, 0, (String) null, 1));
            hashMap4.put("environmental_fees", new f.a("environmental_fees", "TEXT", true, 0, (String) null, 1));
            hashMap4.put("name", new f.a("name", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("description", new f.a("description", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("measurement", new f.a("measurement", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("price_unit_text", new f.a("price_unit_text", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("unit_type", new f.a("unit_type", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("image_url", new f.a("image_url", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("contextual_image_url", new f.a("contextual_image_url", "TEXT", false, 0, (String) null, 1));
            hashMap4.put("energy_label_url", new f.a("energy_label_url", "TEXT", false, 0, (String) null, 1));
            Object obj = "energy_label_url";
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new f.c("ShoppingLists", "CASCADE", "NO ACTION", Arrays.asList(new String[]{"list_id"}), Arrays.asList(new String[]{"list_id"})));
            Object obj2 = "contextual_image_url";
            HashSet hashSet4 = new HashSet(1);
            Object obj3 = "image_url";
            Object obj4 = "unit_type";
            Object obj5 = "price_unit_text";
            Object obj6 = "measurement";
            hashSet4.add(new f.e("index_ShoppingListItems_list_id_item_no", true, Arrays.asList(new String[]{"list_id", "item_no"}), Arrays.asList(new String[]{"ASC", "ASC"})));
            f fVar4 = new f("ShoppingListItems", hashMap4, hashSet3, hashSet4);
            f a13 = f.a(gVar2, "ShoppingListItems");
            if (!fVar4.equals(a13)) {
                return new A.c(false, "ShoppingListItems(com.ingka.ikea.shoppinglist.datalayer.impl.db.entity.ShoppingListItemEntity).\n Expected:\n" + fVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(3);
            hashMap5.put("item_no", new f.a("item_no", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("parent_item_no", new f.a("parent_item_no", "TEXT", true, 3, (String) null, 1));
            hashMap5.put("list_id", new f.a("list_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.e("index_ArticleItems_item_no_list_id_parent_item_no", true, Arrays.asList(new String[]{"item_no", "list_id", "parent_item_no"}), Arrays.asList(new String[]{"ASC", "ASC", "ASC"})));
            f fVar5 = new f("ArticleItems", hashMap5, hashSet5, hashSet6);
            f a14 = f.a(gVar2, "ArticleItems");
            if (!fVar5.equals(a14)) {
                return new A.c(false, "ArticleItems(com.ingka.ikea.shoppinglist.datalayer.impl.db.entity.ArticleItemEntity).\n Expected:\n" + fVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(12);
            hashMap6.put("parent_item_no", new f.a("parent_item_no", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("parent_article_item_no", new f.a("parent_article_item_no", "TEXT", true, 2, (String) null, 1));
            hashMap6.put("number_of_packages", new f.a("number_of_packages", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("quantity_per_item", new f.a("quantity_per_item", "INTEGER", true, 0, (String) null, 1));
            hashMap6.put("name", new f.a("name", "TEXT", false, 0, (String) null, 1));
            hashMap6.put("description", new f.a("description", "TEXT", false, 0, (String) null, 1));
            hashMap6.put(obj6, new f.a("measurement", "TEXT", false, 0, (String) null, 1));
            hashMap6.put(obj5, new f.a("price_unit_text", "TEXT", false, 0, (String) null, 1));
            hashMap6.put(obj4, new f.a("unit_type", "TEXT", false, 0, (String) null, 1));
            hashMap6.put(obj3, new f.a("image_url", "TEXT", false, 0, (String) null, 1));
            hashMap6.put(obj2, new f.a("contextual_image_url", "TEXT", false, 0, (String) null, 1));
            hashMap6.put(obj, new f.a("energy_label_url", "TEXT", false, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.e("index_ArticleDetails_parent_item_no_parent_article_item_no", true, Arrays.asList(new String[]{"parent_item_no", "parent_article_item_no"}), Arrays.asList(new String[]{"ASC", "ASC"})));
            f fVar6 = new f("ArticleDetails", hashMap6, hashSet7, hashSet8);
            f a15 = f.a(gVar2, "ArticleDetails");
            if (fVar6.equals(a15)) {
                return new A.c(true, (String) null);
            }
            return new A.c(false, "ArticleDetails(com.ingka.ikea.shoppinglist.datalayer.impl.db.entity.ArticleDetailsEntity).\n Expected:\n" + fVar6 + "\n Found:\n" + a15);
        }
    }

    public C13737a a() {
        C13737a aVar;
        if (this.f120291d != null) {
            return this.f120291d;
        }
        synchronized (this) {
            try {
                if (this.f120291d == null) {
                    this.f120291d = new C13740d(this);
                }
                aVar = this.f120291d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public C13741e b() {
        C13741e eVar;
        if (this.f120290c != null) {
            return this.f120290c;
        }
        synchronized (this) {
            try {
                if (this.f120290c == null) {
                    this.f120290c = new C13747k(this);
                }
                eVar = this.f120290c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public C13750l c() {
        C13750l lVar;
        if (this.f120289b != null) {
            return this.f120289b;
        }
        synchronized (this) {
            try {
                if (this.f120289b == null) {
                    this.f120289b = new C13751m(this);
                }
                lVar = this.f120289b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        g writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.T("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.T("DELETE FROM `ShoppingListEvents`");
            writableDatabase.T("DELETE FROM `ShoppingLists`");
            writableDatabase.T("DELETE FROM `SalesPrices`");
            writableDatabase.T("DELETE FROM `ShoppingListItems`");
            writableDatabase.T("DELETE FROM `ArticleItems`");
            writableDatabase.T("DELETE FROM `ArticleDetails`");
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
        return new r(this, new HashMap(0), new HashMap(0), "ShoppingListEvents", "ShoppingLists", "SalesPrices", "ShoppingListItems", "ArticleItems", "ArticleDetails");
    }

    /* access modifiers changed from: protected */
    public h createOpenHelper(C7011h hVar) {
        return hVar.f44336c.a(h.b.a(hVar.f44334a).d(hVar.f44335b).c(new A(hVar, new a(9), "b150de0311e724de94a3429799f2e677", "a2010e6e03a17b1528b9a83e22ca8d2d")).b());
    }

    public List<N4.b> getAutoMigrations(Map<Class<? extends N4.a>, N4.a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a());
        arrayList.add(new b());
        return arrayList;
    }

    public Set<Class<? extends N4.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(C13750l.class, C13751m.j());
        hashMap.put(C13741e.class, C13747k.O());
        hashMap.put(C13737a.class, C13740d.w());
        return hashMap;
    }
}
