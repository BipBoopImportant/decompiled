package U0;

import XH.C16807N;
import c1.h;
import c1.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"LU0/v1;", "T", "", "<init>", "()V", "a", "()Ljava/lang/Object;", "value", "LXH/N;", "b", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lc1/h;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Ljava/lang/Object;", "writeMutex", "c", "mainThreadValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<h> f14173a = new AtomicReference<>(i.a());

    /* renamed from: b  reason: collision with root package name */
    private final Object f14174b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private T f14175c;

    public final T a() {
        long id2 = Thread.currentThread().getId();
        return id2 == C4860b.e() ? this.f14175c : this.f14173a.get().b(id2);
    }

    public final void b(T t10) {
        long id2 = Thread.currentThread().getId();
        if (id2 == C4860b.e()) {
            this.f14175c = t10;
            return;
        }
        synchronized (this.f14174b) {
            h hVar = this.f14173a.get();
            if (!hVar.d(id2, t10)) {
                this.f14173a.set(hVar.c(id2, t10));
                C16807N n10 = C16807N.f139792a;
            }
        }
    }
}
