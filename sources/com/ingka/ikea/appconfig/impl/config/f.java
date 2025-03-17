package com.ingka.ikea.appconfig.impl.config;

import N4.b;
import Q4.g;

final class f extends b {
    public f() {
        super(24, 25);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `analyticsConversionRate` REAL DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_analyticsConversionRate` REAL DEFAULT NULL");
    }
}
