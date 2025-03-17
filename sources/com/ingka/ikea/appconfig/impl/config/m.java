package com.ingka.ikea.appconfig.impl.config;

import N4.b;
import Q4.g;

final class m extends b {
    public m() {
        super(31, 32);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `assets` TEXT DEFAULT NULL");
    }
}
