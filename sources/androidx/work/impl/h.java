package androidx.work.impl;

import N4.b;
import Q4.g;

final class h extends b {
    public h() {
        super(20, 21);
    }

    public void migrate(g gVar) {
        gVar.T("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
