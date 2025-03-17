package l5;

import N4.b;
import Q4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll5/k;", "LN4/b;", "<init>", "()V", "LQ4/g;", "db", "LXH/N;", "migrate", "(LQ4/g;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.k  reason: case insensitive filesystem */
public final class C8515k extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final C8515k f54721a = new C8515k();

    private C8515k() {
        super(1, 2);
    }

    public void migrate(g gVar) {
        C17542s.j(gVar, "db");
        gVar.T("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        gVar.T("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        gVar.T("DROP TABLE IF EXISTS alarmInfo");
        gVar.T("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
