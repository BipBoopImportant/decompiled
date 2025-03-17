package QJ;

import XH.C16820k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0004¨\u0006\""}, d2 = {"LQJ/j1;", "LQJ/K0;", "<init>", "()V", "", "state", "", "B", "(I)Ljava/lang/Void;", "LQJ/F0;", "job", "LXH/N;", "C", "(LQJ/F0;)V", "z", "", "cause", "x", "(Ljava/lang/Throwable;)V", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "e", "Ljava/lang/Thread;", "targetThread", "LQJ/k0;", "f", "LQJ/k0;", "cancelHandle", "", "w", "()Z", "onCancelling", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j1 extends K0 {
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137641g = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e  reason: collision with root package name */
    private final Thread f137642e = Thread.currentThread();

    /* renamed from: f  reason: collision with root package name */
    private C16315k0 f137643f;

    private final Void B(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void C(F0 f02) {
        int i10;
        this.f137643f = J0.o(f02, false, this, 1, (Object) null);
        AtomicIntegerFieldUpdater A10 = f137641g;
        do {
            i10 = A10.get(this);
            if (i10 != 0) {
                if (i10 != 2 && i10 != 3) {
                    B(i10);
                    throw new C16820k();
                }
                return;
            }
        } while (!f137641g.compareAndSet(this, i10, 0));
    }

    public boolean w() {
        return true;
    }

    public void x(Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater A10 = f137641g;
        do {
            i10 = A10.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    B(i10);
                    throw new C16820k();
                }
                return;
            }
        } while (!f137641g.compareAndSet(this, i10, 2));
        this.f137642e.interrupt();
        f137641g.set(this, 3);
    }

    public final void z() {
        AtomicIntegerFieldUpdater A10 = f137641g;
        while (true) {
            int i10 = A10.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        B(i10);
                        throw new C16820k();
                    }
                }
            } else if (f137641g.compareAndSet(this, i10, 1)) {
                C16315k0 k0Var = this.f137643f;
                if (k0Var != null) {
                    k0Var.b();
                    return;
                }
                return;
            }
        }
    }
}
