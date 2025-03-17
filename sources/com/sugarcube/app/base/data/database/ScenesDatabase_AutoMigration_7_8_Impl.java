package com.sugarcube.app.base.data.database;

import N4.b;
import Q4.g;

final class ScenesDatabase_AutoMigration_7_8_Impl extends b {
    public ScenesDatabase_AutoMigration_7_8_Impl() {
        super(7, 8);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `DatabaseScene` ADD COLUMN `glbUrl` TEXT DEFAULT NULL");
    }
}
