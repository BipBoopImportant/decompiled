package QJ;

import XH.x;
import XH.y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LQJ/V0;", "T", "LQJ/K0;", "LQJ/p;", "continuation", "<init>", "(LQJ/p;)V", "", "cause", "LXH/N;", "x", "(Ljava/lang/Throwable;)V", "e", "LQJ/p;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class V0<T> extends K0 {

    /* renamed from: e  reason: collision with root package name */
    private final C16324p<T> f137602e;

    public V0(C16324p<? super T> pVar) {
        this.f137602e = pVar;
    }

    public boolean w() {
        return false;
    }

    public void x(Throwable th2) {
        Object r02 = v().r0();
        if (r02 instanceof C16285C) {
            C16324p<T> pVar = this.f137602e;
            x.a aVar = x.f139812b;
            pVar.resumeWith(x.b(y.a(((C16285C) r02).f137555a)));
            return;
        }
        C16324p<T> pVar2 = this.f137602e;
        x.a aVar2 = x.f139812b;
        pVar2.resumeWith(x.b(M0.h(r02)));
    }
}
