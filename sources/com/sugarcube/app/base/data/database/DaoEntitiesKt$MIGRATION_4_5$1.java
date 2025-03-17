package com.sugarcube.app.base.data.database;

import N4.b;
import Q4.g;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/sugarcube/app/base/data/database/DaoEntitiesKt$MIGRATION_4_5$1", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DaoEntitiesKt$MIGRATION_4_5$1 extends b {
    DaoEntitiesKt$MIGRATION_4_5$1() {
        super(4, 5);
    }

    public void migrate(g gVar) {
        C17542s.j(gVar, "database");
        UUID randomUUID = UUID.randomUUID();
        gVar.T("ALTER TABLE DatabaseScene ADD COLUMN sceneUuid TEXT NOT NULL DEFAULT \"" + randomUUID + "\";");
    }
}
