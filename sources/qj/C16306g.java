package QJ;

import dI.C17168i;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LQJ/g;", "T", "LQJ/a;", "LdI/i;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "LQJ/o0;", "eventLoop", "<init>", "(LdI/i;Ljava/lang/Thread;LQJ/o0;)V", "", "state", "LXH/N;", "L", "(Ljava/lang/Object;)V", "f1", "()Ljava/lang/Object;", "d", "Ljava/lang/Thread;", "e", "LQJ/o0;", "", "z0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.g  reason: case insensitive filesystem */
final class C16306g<T> extends C16294a<T> {

    /* renamed from: d  reason: collision with root package name */
    private final Thread f137630d;

    /* renamed from: e  reason: collision with root package name */
    private final C16323o0 f137631e;

    public C16306g(C17168i iVar, Thread thread, C16323o0 o0Var) {
        super(iVar, true, true);
        this.f137630d = thread;
        this.f137631e = o0Var;
    }

    /* access modifiers changed from: protected */
    public void L(Object obj) {
        if (!C17542s.e(Thread.currentThread(), this.f137630d)) {
            Thread thread = this.f137630d;
            C16298c.a();
            LockSupport.unpark(thread);
        }
    }

    public final T f1() {
        C16298c.a();
        try {
            C16323o0 o0Var = this.f137631e;
            C16285C c10 = null;
            if (o0Var != null) {
                C16323o0.X0(o0Var, false, 1, (Object) null);
            }
            while (!Thread.interrupted()) {
                C16323o0 o0Var2 = this.f137631e;
                long b12 = o0Var2 != null ? o0Var2.b1() : Long.MAX_VALUE;
                if (!h()) {
                    C16298c.a();
                    LockSupport.parkNanos(this, b12);
                } else {
                    C16323o0 o0Var3 = this.f137631e;
                    if (o0Var3 != null) {
                        C16323o0.Q0(o0Var3, false, 1, (Object) null);
                    }
                    C16298c.a();
                    T h10 = M0.h(r0());
                    if (h10 instanceof C16285C) {
                        c10 = (C16285C) h10;
                    }
                    if (c10 == null) {
                        return h10;
                    }
                    throw c10.f137555a;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            Q(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C16298c.a();
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return true;
    }
}
