package V5;

import QJ.C16311i0;
import QJ.M;
import dI.C17168i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078F@FX\u0002¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000b\u0010%\u001a\u00020$8\u0002X\u0004¨\u0006&"}, d2 = {"LV5/f;", "LQJ/M;", "delegate", "<init>", "(LQJ/M;)V", "LdI/i;", "context", "", "I0", "(LdI/i;)Z", "", "parallelism", "", "name", "N0", "(ILjava/lang/String;)LQJ/M;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "E0", "(LdI/i;Ljava/lang/Runnable;)V", "F0", "toString", "()Ljava/lang/String;", "b", "LQJ/M;", "P0", "()LQJ/M;", "currentDispatcher", "<set-?>", "getUnconfined", "()Z", "R0", "(Z)V", "unconfined", "", "_unconfined", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends M {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40440d = AtomicIntegerFieldUpdater.newUpdater(f.class, "c");

    /* renamed from: b  reason: collision with root package name */
    private final M f40441b;

    /* renamed from: c  reason: collision with root package name */
    private volatile /* synthetic */ int f40442c = 1;

    public f(M m10) {
        this.f40441b = m10;
    }

    private final M P0() {
        return f40440d.get(this) == 1 ? C16311i0.d() : this.f40441b;
    }

    public void E0(C17168i iVar, Runnable runnable) {
        P0().E0(iVar, runnable);
    }

    public void F0(C17168i iVar, Runnable runnable) {
        P0().F0(iVar, runnable);
    }

    public boolean I0(C17168i iVar) {
        return P0().I0(iVar);
    }

    public M N0(int i10, String str) {
        return P0().N0(i10, str);
    }

    public final void R0(boolean z10) {
        this.f40442c = z10 ? 1 : 0;
    }

    public String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f40441b + ')';
    }
}
