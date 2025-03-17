package WJ;

import QJ.C16295a0;
import QJ.C16315k0;
import QJ.C16320n;
import QJ.M;
import QJ.X;
import XH.C16807N;
import dI.C17168i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LWJ/v;", "LQJ/M;", "LQJ/a0;", "dispatcher", "", "name", "<init>", "(LQJ/M;Ljava/lang/String;)V", "LdI/i;", "context", "", "I0", "(LdI/i;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "F0", "toString", "()Ljava/lang/String;", "", "timeMillis", "LQJ/n;", "continuation", "h0", "(JLQJ/n;)V", "LQJ/k0;", "u", "(JLjava/lang/Runnable;LdI/i;)LQJ/k0;", "c", "LQJ/M;", "d", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends M implements C16295a0 {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C16295a0 f139582b;

    /* renamed from: c  reason: collision with root package name */
    private final M f139583c;

    /* renamed from: d  reason: collision with root package name */
    private final String f139584d;

    public v(M m10, String str) {
        C16295a0 a0Var = m10 instanceof C16295a0 ? (C16295a0) m10 : null;
        this.f139582b = a0Var == null ? X.a() : a0Var;
        this.f139583c = m10;
        this.f139584d = str;
    }

    public void E0(C17168i iVar, Runnable runnable) {
        this.f139583c.E0(iVar, runnable);
    }

    public void F0(C17168i iVar, Runnable runnable) {
        this.f139583c.F0(iVar, runnable);
    }

    public boolean I0(C17168i iVar) {
        return this.f139583c.I0(iVar);
    }

    public void h0(long j10, C16320n<? super C16807N> nVar) {
        this.f139582b.h0(j10, nVar);
    }

    public String toString() {
        return this.f139584d;
    }

    public C16315k0 u(long j10, Runnable runnable, C17168i iVar) {
        return this.f139582b.u(j10, runnable, iVar);
    }
}
