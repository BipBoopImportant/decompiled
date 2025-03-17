package androidx.work.impl;

import N4.b;
import Q4.g;

final class i extends b {
    public i() {
        super(22, 23);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
