package androidx.work.impl;

import N4.b;
import Q4.g;

final class f extends b {
    public f() {
        super(18, 19);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
