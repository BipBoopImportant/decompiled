package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.a;
import Q4.g;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class b extends N4.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f119917a = new ScanAndGoRoomDatabase.d();

    public b() {
        super(15, 16);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `scan_and_go_cart_products` ADD COLUMN `inclTax` REAL NOT NULL DEFAULT 0.0");
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_scan_and_go_cart_products` (`barcode` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `productLite` TEXT, `inclTax` REAL NOT NULL DEFAULT 0.0, `collected` INTEGER NOT NULL, `type` TEXT NOT NULL, `enabled` INTEGER, `min` INTEGER, `max` INTEGER, `selected` INTEGER, `itemLocation_title` TEXT NOT NULL, `itemLocation_aisle` TEXT NOT NULL, `itemLocation_bin` TEXT NOT NULL, `itemLocation_department` TEXT NOT NULL, PRIMARY KEY(`barcode`))");
        gVar.T("INSERT INTO `_new_scan_and_go_cart_products` (`barcode`,`timeStamp`,`productLite`,`collected`,`type`,`enabled`,`min`,`max`,`selected`,`itemLocation_title`,`itemLocation_aisle`,`itemLocation_bin`,`itemLocation_department`) SELECT `barcode`,`timeStamp`,`productLite`,`collected`,`type`,`enabled`,`min`,`max`,`selected`,`itemLocation_title`,`itemLocation_aisle`,`itemLocation_bin`,`itemLocation_department` FROM `scan_and_go_cart_products`");
        gVar.T("DROP TABLE `scan_and_go_cart_products`");
        gVar.T("ALTER TABLE `_new_scan_and_go_cart_products` RENAME TO `scan_and_go_cart_products`");
        this.f119917a.a(gVar);
    }
}
