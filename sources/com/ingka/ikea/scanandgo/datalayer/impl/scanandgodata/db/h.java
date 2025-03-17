package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.a;
import N4.b;
import Q4.g;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f119922a = new ScanAndGoRoomDatabase.b();

    public h() {
        super(22, 23);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `_new_scan_and_go_scan_type` (`barcode` TEXT NOT NULL, `scanType` TEXT, `productAssortmentSpecialType` TEXT, PRIMARY KEY(`barcode`))");
        gVar.T("INSERT INTO `_new_scan_and_go_scan_type` (`barcode`,`productAssortmentSpecialType`) SELECT `barcode`,`productAssortmentSpecialType` FROM `scan_and_go_scan_type`");
        gVar.T("DROP TABLE `scan_and_go_scan_type`");
        gVar.T("ALTER TABLE `_new_scan_and_go_scan_type` RENAME TO `scan_and_go_scan_type`");
        this.f119922a.a(gVar);
    }
}
