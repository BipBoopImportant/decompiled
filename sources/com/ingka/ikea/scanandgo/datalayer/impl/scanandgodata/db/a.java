package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.b;
import Q4.g;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final N4.a f119916a = new ScanAndGoRoomDatabase.c();

    public a() {
        super(14, 15);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_scan_and_go_cart_products` (`barcode` TEXT NOT NULL, `timeStamp` INTEGER NOT NULL, `productLite` TEXT, `price` TEXT NOT NULL, `collected` INTEGER NOT NULL, `type` TEXT NOT NULL, `enabled` INTEGER, `min` INTEGER, `max` INTEGER, `selected` INTEGER, `itemLocation_title` TEXT NOT NULL, `itemLocation_aisle` TEXT NOT NULL, `itemLocation_bin` TEXT NOT NULL, `itemLocation_department` TEXT NOT NULL, PRIMARY KEY(`barcode`))");
        gVar.T("INSERT INTO `_new_scan_and_go_cart_products` (`barcode`,`timeStamp`,`productLite`,`price`,`collected`,`type`,`enabled`,`min`,`max`,`selected`,`itemLocation_title`,`itemLocation_aisle`,`itemLocation_bin`,`itemLocation_department`) SELECT `barcode`,`timeStamp`,`productLite`,`price`,`collected`,`type`,`enabled`,`min`,`max`,`selected`,`itemLocation_title`,`itemLocation_aisle`,`itemLocation_bin`,`itemLocation_department` FROM `scan_and_go_cart_products`");
        gVar.T("DROP TABLE `scan_and_go_cart_products`");
        gVar.T("ALTER TABLE `_new_scan_and_go_cart_products` RENAME TO `scan_and_go_cart_products`");
        this.f119916a.a(gVar);
    }
}
