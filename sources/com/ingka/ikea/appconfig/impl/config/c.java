package com.ingka.ikea.appconfig.impl.config;

import N4.b;
import Q4.g;

final class c extends b {
    public c() {
        super(21, 22);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `dataConsentUiVersion` TEXT NOT NULL DEFAULT 'V1'");
    }
}
