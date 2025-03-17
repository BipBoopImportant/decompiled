package l5;

import Q4.g;
import androidx.room.x;
import androidx.work.C7033b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ll5/d;", "Landroidx/room/x$b;", "Landroidx/work/b;", "clock", "<init>", "(Landroidx/work/b;)V", "LQ4/g;", "db", "LXH/N;", "c", "(LQ4/g;)V", "a", "Landroidx/work/b;", "getClock", "()Landroidx/work/b;", "", "e", "()Ljava/lang/String;", "pruneSQL", "", "d", "()J", "pruneDate", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l5.d  reason: case insensitive filesystem */
public final class C8508d extends x.b {

    /* renamed from: a  reason: collision with root package name */
    private final C7033b f54715a;

    public C8508d(C7033b bVar) {
        C17542s.j(bVar, "clock");
        this.f54715a = bVar;
    }

    private final long d() {
        return this.f54715a.a() - C8503H.f54622a;
    }

    private final String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public void c(g gVar) {
        C17542s.j(gVar, "db");
        super.c(gVar);
        gVar.P();
        try {
            gVar.T(e());
            gVar.v0();
        } finally {
            gVar.J0();
        }
    }
}
