package com.sugarcube.app.base.data.database;

import N4.b;
import Q4.g;

final class ScenesDatabase_AutoMigration_9_10_Impl extends b {
    public ScenesDatabase_AutoMigration_9_10_Impl() {
        super(9, 10);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `DatabaseScene` ADD COLUMN `jobId` TEXT DEFAULT NULL");
    }
}
