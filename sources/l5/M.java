package l5;

import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t5.C8796G;
import u5.C8878b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ll5/M;", "Ll5/K;", "Ll5/t;", "processor", "Lu5/b;", "workTaskExecutor", "<init>", "(Ll5/t;Lu5/b;)V", "Ll5/y;", "workSpecId", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "LXH/N;", "c", "(Ll5/y;Landroidx/work/WorkerParameters$a;)V", "", "reason", "d", "(Ll5/y;I)V", "a", "Ll5/t;", "getProcessor", "()Ll5/t;", "b", "Lu5/b;", "getWorkTaskExecutor", "()Lu5/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class M implements K {

    /* renamed from: a  reason: collision with root package name */
    private final C8523t f54629a;

    /* renamed from: b  reason: collision with root package name */
    private final C8878b f54630b;

    public M(C8523t tVar, C8878b bVar) {
        C17542s.j(tVar, "processor");
        C17542s.j(bVar, "workTaskExecutor");
        this.f54629a = tVar;
        this.f54630b = bVar;
    }

    /* access modifiers changed from: private */
    public static final void g(M m10, C8528y yVar, WorkerParameters.a aVar) {
        m10.f54629a.s(yVar, aVar);
    }

    public void c(C8528y yVar, WorkerParameters.a aVar) {
        C17542s.j(yVar, "workSpecId");
        this.f54630b.d(new L(this, yVar, aVar));
    }

    public void d(C8528y yVar, int i10) {
        C17542s.j(yVar, "workSpecId");
        this.f54630b.d(new C8796G(this.f54629a, yVar, false, i10));
    }
}
