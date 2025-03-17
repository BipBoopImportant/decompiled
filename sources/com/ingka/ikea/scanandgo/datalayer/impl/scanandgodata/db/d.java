package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.a;
import N4.b;
import Q4.g;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f119918a = new ScanAndGoRoomDatabase.g();

    public d() {
        super(17, 18);
    }

    public void migrate(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS `scan_and_go_coupon` (`coupon` TEXT NOT NULL, `validated` INTEGER NOT NULL, `couponEnum` TEXT, `message` TEXT, PRIMARY KEY(`coupon`))");
        this.f119918a.a(gVar);
    }
}
