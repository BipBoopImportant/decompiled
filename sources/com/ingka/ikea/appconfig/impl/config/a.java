package com.ingka.ikea.appconfig.impl.config;

import N4.b;
import Q4.g;

final class a extends b {
    public a() {
        super(19, 20);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `conversionRate` REAL DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_symbol` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_decimalSymbol` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_code` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_negativeFormat` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_positiveFormat` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_digitGroupSymbol` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_integerSymbol` TEXT DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_nbrFractionDigits` INTEGER DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_showFractionDigitsOnInteger` INTEGER DEFAULT NULL");
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `secondary_conversionRate` REAL DEFAULT NULL");
    }
}
