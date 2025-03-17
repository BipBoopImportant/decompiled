package com.ingka.ikea.appconfig.impl.config;

import N4.b;
import Q4.g;

final class h extends b {
    public h() {
        super(26, 27);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `MarketConfig` ADD COLUMN `familyAndRegularPriceSameSize` INTEGER NOT NULL DEFAULT false");
    }
}
