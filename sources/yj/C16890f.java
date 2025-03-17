package YJ;

import QJ.C16336v0;
import dI.C17168i;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001a\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\u0010\u000f\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"LYJ/f;", "LQJ/v0;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "LYJ/a;", "Q0", "()LYJ/a;", "LdI/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "F0", "", "Lkotlinx/coroutines/scheduling/TaskContext;", "fair", "R0", "(Ljava/lang/Runnable;ZZ)V", "c", "I", "d", "e", "J", "f", "Ljava/lang/String;", "g", "LYJ/a;", "coroutineScheduler", "Ljava/util/concurrent/Executor;", "P0", "()Ljava/util/concurrent/Executor;", "executor", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YJ.f  reason: case insensitive filesystem */
public class C16890f extends C16336v0 {

    /* renamed from: c  reason: collision with root package name */
    private final int f140514c;

    /* renamed from: d  reason: collision with root package name */
    private final int f140515d;

    /* renamed from: e  reason: collision with root package name */
    private final long f140516e;

    /* renamed from: f  reason: collision with root package name */
    private final String f140517f;

    /* renamed from: g  reason: collision with root package name */
    private C16885a f140518g = Q0();

    public C16890f(int i10, int i11, long j10, String str) {
        this.f140514c = i10;
        this.f140515d = i11;
        this.f140516e = j10;
        this.f140517f = str;
    }

    private final C16885a Q0() {
        return new C16885a(this.f140514c, this.f140515d, this.f140516e, this.f140517f);
    }

    public void E0(C17168i iVar, Runnable runnable) {
        C16885a.i(this.f140518g, runnable, false, false, 6, (Object) null);
    }

    public void F0(C17168i iVar, Runnable runnable) {
        C16885a.i(this.f140518g, runnable, false, true, 2, (Object) null);
    }

    public Executor P0() {
        return this.f140518g;
    }

    public final void R0(Runnable runnable, boolean z10, boolean z11) {
        this.f140518g.h(runnable, z10, z11);
    }
}
