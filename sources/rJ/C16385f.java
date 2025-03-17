package RJ;

import QJ.C16295a0;
import QJ.C16311i0;
import QJ.C16315k0;
import QJ.C16320n;
import QJ.I0;
import QJ.S0;
import XH.C16807N;
import android.os.Handler;
import android.os.Looper;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LRJ/f;", "LRJ/g;", "LQJ/a0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "LdI/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "LXH/N;", "X0", "(LdI/i;Ljava/lang/Runnable;)V", "I0", "(LdI/i;)Z", "E0", "", "timeMillis", "LQJ/n;", "continuation", "h0", "(JLQJ/n;)V", "LQJ/k0;", "u", "(JLjava/lang/Runnable;LdI/i;)LQJ/k0;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroid/os/Handler;", "c", "Ljava/lang/String;", "d", "Z", "e", "LRJ/f;", "Y0", "()LRJ/f;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RJ.f  reason: case insensitive filesystem */
public final class C16385f extends C16386g implements C16295a0 {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f138022b;

    /* renamed from: c  reason: collision with root package name */
    private final String f138023c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f138024d;

    /* renamed from: e  reason: collision with root package name */
    private final C16385f f138025e;

    private C16385f(Handler handler, String str, boolean z10) {
        super((DefaultConstructorMarker) null);
        C16385f fVar;
        this.f138022b = handler;
        this.f138023c = str;
        this.f138024d = z10;
        if (z10) {
            fVar = this;
        } else {
            fVar = new C16385f(handler, str, true);
        }
        this.f138025e = fVar;
    }

    private final void X0(C17168i iVar, Runnable runnable) {
        I0.d(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C16311i0.b().E0(iVar, runnable);
    }

    /* access modifiers changed from: private */
    public static final void a1(C16385f fVar, Runnable runnable) {
        fVar.f138022b.removeCallbacks(runnable);
    }

    /* access modifiers changed from: private */
    public static final void b1(C16320n nVar, C16385f fVar) {
        nVar.E(fVar, C16807N.f139792a);
    }

    /* access modifiers changed from: private */
    public static final C16807N h1(C16385f fVar, Runnable runnable, Throwable th2) {
        fVar.f138022b.removeCallbacks(runnable);
        return C16807N.f139792a;
    }

    public void E0(C17168i iVar, Runnable runnable) {
        if (!this.f138022b.post(runnable)) {
            X0(iVar, runnable);
        }
    }

    public boolean I0(C17168i iVar) {
        return !this.f138024d || !C17542s.e(Looper.myLooper(), this.f138022b.getLooper());
    }

    /* renamed from: Y0 */
    public C16385f R0() {
        return this.f138025e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C16385f) {
            C16385f fVar = (C16385f) obj;
            return fVar.f138022b == this.f138022b && fVar.f138024d == this.f138024d;
        }
    }

    public void h0(long j10, C16320n<? super C16807N> nVar) {
        C16383d dVar = new C16383d(nVar, this);
        if (this.f138022b.postDelayed(dVar, C17978n.j(j10, 4611686018427387903L))) {
            nVar.K(new C16384e(this, dVar));
        } else {
            X0(nVar.getContext(), dVar);
        }
    }

    public int hashCode() {
        return System.identityHashCode(this.f138022b) ^ (this.f138024d ? 1231 : 1237);
    }

    public String toString() {
        String Q02 = Q0();
        if (Q02 != null) {
            return Q02;
        }
        String str = this.f138023c;
        if (str == null) {
            str = this.f138022b.toString();
        }
        if (!this.f138024d) {
            return str;
        }
        return str + ".immediate";
    }

    public C16315k0 u(long j10, Runnable runnable, C17168i iVar) {
        if (this.f138022b.postDelayed(runnable, C17978n.j(j10, 4611686018427387903L))) {
            return new C16382c(this, runnable);
        }
        X0(iVar, runnable);
        return S0.f137600a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16385f(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public C16385f(Handler handler, String str) {
        this(handler, str, false);
    }
}
