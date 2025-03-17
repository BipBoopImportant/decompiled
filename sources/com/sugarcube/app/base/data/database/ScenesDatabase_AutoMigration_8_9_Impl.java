package com.sugarcube.app.base.data.database;

import N4.b;
import Q4.g;

final class ScenesDatabase_AutoMigration_8_9_Impl extends b {
    public ScenesDatabase_AutoMigration_8_9_Impl() {
        super(8, 9);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `DatabaseScene` ADD COLUMN `pipelineType` TEXT DEFAULT NULL");
    }
}
