package QJ;

import XH.C16807N;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000b\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¨\u0006\u0014"}, d2 = {"LQJ/D0;", "LQJ/K0;", "Lkotlin/Function1;", "", "LXH/N;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "<init>", "(LnI/l;)V", "cause", "x", "(Ljava/lang/Throwable;)V", "e", "LnI/l;", "", "w", "()Z", "onCancelling", "", "_invoked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class D0 extends K0 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f137559f = AtomicIntegerFieldUpdater.newUpdater(D0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<Throwable, C16807N> f137560e;

    public D0(C17642l<? super Throwable, C16807N> lVar) {
        this.f137560e = lVar;
    }

    public boolean w() {
        return true;
    }

    public void x(Throwable th2) {
        if (f137559f.compareAndSet(this, 0, 1)) {
            this.f137560e.invoke(th2);
        }
    }
}
