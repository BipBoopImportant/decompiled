package Zc;

import K9.C6620s;
import Vc.a;
import ga.E;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xa.C8960a;
import xa.C8961b;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

/* renamed from: Zc.k  reason: case insensitive filesystem */
public abstract class C9402k {

    /* renamed from: a  reason: collision with root package name */
    protected final o f65099a = new o();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f65100b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f65101c = new AtomicBoolean(false);

    public <T> C8971l<T> a(Executor executor, Callable<T> callable, C8960a aVar) {
        C6620s.p(this.f65100b.get() > 0);
        if (aVar.a()) {
            return C8974o.d();
        }
        C8961b bVar = new C8961b();
        C8972m mVar = new C8972m(bVar.b());
        this.f65099a.a(new z(executor, aVar, bVar, mVar), new A(this, aVar, bVar, callable, mVar));
        return mVar.a();
    }

    public abstract void b();

    public void c() {
        this.f65100b.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    public void e(Executor executor) {
        f(executor);
    }

    public C8971l<Void> f(Executor executor) {
        C6620s.p(this.f65100b.get() > 0);
        C8972m mVar = new C8972m();
        this.f65099a.a(executor, new y(this, mVar));
        return mVar.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(C8960a aVar, C8961b bVar, Callable callable, C8972m mVar) {
        if (aVar.a()) {
            bVar.a();
            return;
        }
        try {
            if (!this.f65101c.get()) {
                b();
                this.f65101c.set(true);
            }
            if (aVar.a()) {
                bVar.a();
                return;
            }
            Object call = callable.call();
            if (aVar.a()) {
                bVar.a();
            } else {
                mVar.c(call);
            }
        } catch (RuntimeException e10) {
            throw new a("Internal error has occurred when executing ML Kit tasks", 13, e10);
        } catch (Exception e11) {
            if (aVar.a()) {
                bVar.a();
            } else {
                mVar.b(e11);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(C8972m mVar) {
        int decrementAndGet = this.f65100b.decrementAndGet();
        C6620s.p(decrementAndGet >= 0);
        if (decrementAndGet == 0) {
            d();
            this.f65101c.set(false);
        }
        E.a();
        mVar.c(null);
    }
}
