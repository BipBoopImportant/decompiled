package com.ingka.ikea.appconfig.impl.config;

import N4.b;
import Q4.g;

final class d extends b {
    public d() {
        super(22, 23);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `decimalVerticalAlignment` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `decimalSign` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `currencyVerticalAlignment` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `currencyPosition` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_decimalVerticalAlignment` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_decimalSign` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_currencyVerticalAlignment` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_currencyPosition` TEXT DEFAULT NULL");
    }
}
