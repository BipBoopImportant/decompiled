package Rb;

import K4.m;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import xa.C8961b;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Executor f63173a = new m();

    /* access modifiers changed from: private */
    public static /* synthetic */ C8971l b(C8972m mVar, AtomicBoolean atomicBoolean, C8961b bVar, C8971l lVar) {
        if (lVar.q()) {
            mVar.e(lVar.m());
        } else if (lVar.l() != null) {
            mVar.d(lVar.l());
        } else if (atomicBoolean.getAndSet(true)) {
            bVar.a();
        }
        return C8974o.f(null);
    }

    public static <T> C8971l<T> c(C8971l<T> lVar, C8971l<T> lVar2) {
        C8961b bVar = new C8961b();
        C8972m mVar = new C8972m(bVar.b());
        a aVar = new a(mVar, new AtomicBoolean(false), bVar);
        Executor executor = f63173a;
        lVar.j(executor, aVar);
        lVar2.j(executor, aVar);
        return mVar.a();
    }
}
