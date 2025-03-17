package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.a;
import N4.b;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db.ScanAndGoRoomDatabase;

final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    private final a f119921a = new ScanAndGoRoomDatabase.a();

    public g() {
        super(20, 21);
    }

    public void migrate(Q4.g gVar) {
        gVar.T("ALTER TABLE `scan_and_go_cart_products` ADD COLUMN `exclTax` REAL NOT NULL DEFAULT 0.0");
        this.f119921a.a(gVar);
    }
}
