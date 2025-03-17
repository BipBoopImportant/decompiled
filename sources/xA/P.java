package xa;

import K9.C6620s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class P<TResult> extends C8971l<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f57769a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final L f57770b = new L();

    /* renamed from: c  reason: collision with root package name */
    private boolean f57771c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f57772d;

    /* renamed from: e  reason: collision with root package name */
    private Object f57773e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f57774f;

    P() {
    }

    private final void A() {
        if (this.f57771c) {
            throw C8963d.a(this);
        }
    }

    private final void B() {
        synchronized (this.f57769a) {
            try {
                if (this.f57771c) {
                    this.f57770b.b(this);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private final void y() {
        C6620s.q(this.f57771c, "Task is not yet complete");
    }

    private final void z() {
        if (this.f57772d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final C8971l<TResult> a(Executor executor, C8964e eVar) {
        this.f57770b.a(new B(executor, eVar));
        B();
        return this;
    }

    public final C8971l<TResult> b(Executor executor, C8965f<TResult> fVar) {
        this.f57770b.a(new D(executor, fVar));
        B();
        return this;
    }

    public final C8971l<TResult> c(C8965f<TResult> fVar) {
        this.f57770b.a(new D(C8973n.f57779a, fVar));
        B();
        return this;
    }

    public final C8971l<TResult> d(Executor executor, C8966g gVar) {
        this.f57770b.a(new F(executor, gVar));
        B();
        return this;
    }

    public final C8971l<TResult> e(C8966g gVar) {
        d(C8973n.f57779a, gVar);
        return this;
    }

    public final C8971l<TResult> f(Executor executor, C8967h<? super TResult> hVar) {
        this.f57770b.a(new H(executor, hVar));
        B();
        return this;
    }

    public final C8971l<TResult> g(C8967h<? super TResult> hVar) {
        f(C8973n.f57779a, hVar);
        return this;
    }

    public final <TContinuationResult> C8971l<TContinuationResult> h(Executor executor, C8962c<TResult, TContinuationResult> cVar) {
        P p10 = new P();
        this.f57770b.a(new x(executor, cVar, p10));
        B();
        return p10;
    }

    public final <TContinuationResult> C8971l<TContinuationResult> i(C8962c<TResult, TContinuationResult> cVar) {
        return h(C8973n.f57779a, cVar);
    }

    public final <TContinuationResult> C8971l<TContinuationResult> j(Executor executor, C8962c<TResult, C8971l<TContinuationResult>> cVar) {
        P p10 = new P();
        this.f57770b.a(new z(executor, cVar, p10));
        B();
        return p10;
    }

    public final <TContinuationResult> C8971l<TContinuationResult> k(C8962c<TResult, C8971l<TContinuationResult>> cVar) {
        return j(C8973n.f57779a, cVar);
    }

    public final Exception l() {
        Exception exc;
        synchronized (this.f57769a) {
            exc = this.f57774f;
        }
        return exc;
    }

    public final TResult m() {
        TResult tresult;
        synchronized (this.f57769a) {
            try {
                y();
                z();
                Exception exc = this.f57774f;
                if (exc == null) {
                    tresult = this.f57773e;
                } else {
                    throw new C8969j(exc);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    public final <X extends Throwable> TResult n(Class<X> cls) {
        TResult tresult;
        synchronized (this.f57769a) {
            try {
                y();
                z();
                if (!cls.isInstance(this.f57774f)) {
                    Exception exc = this.f57774f;
                    if (exc == null) {
                        tresult = this.f57773e;
                    } else {
                        throw new C8969j(exc);
                    }
                } else {
                    throw ((Throwable) cls.cast(this.f57774f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    public final boolean o() {
        return this.f57772d;
    }

    public final boolean p() {
        boolean z10;
        synchronized (this.f57769a) {
            z10 = this.f57771c;
        }
        return z10;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f57769a) {
            try {
                z10 = false;
                if (this.f57771c && !this.f57772d && this.f57774f == null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final <TContinuationResult> C8971l<TContinuationResult> r(Executor executor, C8970k<TResult, TContinuationResult> kVar) {
        P p10 = new P();
        this.f57770b.a(new J(executor, kVar, p10));
        B();
        return p10;
    }

    public final <TContinuationResult> C8971l<TContinuationResult> s(C8970k<TResult, TContinuationResult> kVar) {
        Executor executor = C8973n.f57779a;
        P p10 = new P();
        this.f57770b.a(new J(executor, kVar, p10));
        B();
        return p10;
    }

    public final void t(Exception exc) {
        C6620s.m(exc, "Exception must not be null");
        synchronized (this.f57769a) {
            A();
            this.f57771c = true;
            this.f57774f = exc;
        }
        this.f57770b.b(this);
    }

    public final void u(Object obj) {
        synchronized (this.f57769a) {
            A();
            this.f57771c = true;
            this.f57773e = obj;
        }
        this.f57770b.b(this);
    }

    public final boolean v() {
        synchronized (this.f57769a) {
            try {
                if (this.f57771c) {
                    return false;
                }
                this.f57771c = true;
                this.f57772d = true;
                this.f57770b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final boolean w(Exception exc) {
        C6620s.m(exc, "Exception must not be null");
        synchronized (this.f57769a) {
            try {
                if (this.f57771c) {
                    return false;
                }
                this.f57771c = true;
                this.f57774f = exc;
                this.f57770b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public final boolean x(Object obj) {
        synchronized (this.f57769a) {
            try {
                if (this.f57771c) {
                    return false;
                }
                this.f57771c = true;
                this.f57773e = obj;
                this.f57770b.b(this);
                return true;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
