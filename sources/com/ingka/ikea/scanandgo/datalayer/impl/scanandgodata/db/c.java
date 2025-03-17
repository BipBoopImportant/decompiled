package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.db;

import N4.b;
import Q4.g;

final class c extends b {
    public c() {
        super(16, 17);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `scan_and_go_cart_products` ADD COLUMN `isSkipped` INTEGER NOT NULL DEFAULT 0");
    }
}
