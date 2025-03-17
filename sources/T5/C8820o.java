package t5;

import androidx.work.impl.WorkDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt5/o;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "e", "(II)I", "c", "()I", "a", "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.o  reason: case insensitive filesystem */
public final class C8820o {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f56625a;

    public C8820o(WorkDatabase workDatabase) {
        C17542s.j(workDatabase, "workDatabase");
        this.f56625a = workDatabase;
    }

    /* access modifiers changed from: private */
    public static final Integer d(C8820o oVar) {
        return Integer.valueOf(C8821p.d(oVar.f56625a, "next_alarm_manager_id"));
    }

    /* access modifiers changed from: private */
    public static final Integer f(C8820o oVar, int i10, int i11) {
        int a10 = C8821p.d(oVar.f56625a, "next_job_scheduler_id");
        if (i10 > a10 || a10 > i11) {
            C8821p.e(oVar.f56625a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = a10;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object runInTransaction = this.f56625a.runInTransaction(new C8818m(this));
        C17542s.i(runInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        return ((Number) runInTransaction).intValue();
    }

    public final int e(int i10, int i11) {
        Object runInTransaction = this.f56625a.runInTransaction(new C8819n(this, i10, i11));
        C17542s.i(runInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
        return ((Number) runInTransaction).intValue();
    }
}
