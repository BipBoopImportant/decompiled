package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.a;
import N4.b;
import Q4.g;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f119920a = new ScanAndGoRoomDatabase.f();

    public f() {
        super(19, 20);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_scan_and_go_coupon` (`coupon` TEXT NOT NULL, `validated` INTEGER NOT NULL, `skippedEnum` TEXT, PRIMARY KEY(`coupon`))");
        gVar.T("INSERT INTO `_new_scan_and_go_coupon` (`coupon`,`validated`,`skippedEnum`) SELECT `coupon`,`validated`,`couponEnum` FROM `scan_and_go_coupon`");
        gVar.T("DROP TABLE `scan_and_go_coupon`");
        gVar.T("ALTER TABLE `_new_scan_and_go_coupon` RENAME TO `scan_and_go_coupon`");
        this.f119920a.a(gVar);
    }
}
