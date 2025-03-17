package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.a;
import N4.b;
import Q4.g;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f119919a = new ScanAndGoRoomDatabase.e();

    public e() {
        super(18, 19);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_scan_and_go_cart_discounts` (`title` TEXT NOT NULL, `coupon` TEXT, `rawValue` REAL NOT NULL, PRIMARY KEY(`title`))");
        gVar.T("INSERT INTO `_new_scan_and_go_cart_discounts` (`title`,`coupon`,`rawValue`) SELECT `title`,`coupon`,`rawValue` FROM `scan_and_go_cart_discounts`");
        gVar.T("DROP TABLE `scan_and_go_cart_discounts`");
        gVar.T("ALTER TABLE `_new_scan_and_go_cart_discounts` RENAME TO `scan_and_go_cart_discounts`");
        this.f119919a.a(gVar);
    }
}
