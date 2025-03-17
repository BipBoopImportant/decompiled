package androidx.work.impl;

import N4.b;
import Q4.g;

final class e extends b {
    public e() {
        super(17, 18);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        gVar.T("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
