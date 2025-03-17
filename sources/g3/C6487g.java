package G3;

import C3.t;
import G3.C6479C;
import G3.J;
import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import t3.C5950a;
import t3.N;
import w3.C;

/* renamed from: G3.g  reason: case insensitive filesystem */
public abstract class C6487g<T> extends C6481a {

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<T, b<T>> f35912h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    private Handler f35913i;

    /* renamed from: j  reason: collision with root package name */
    private C f35914j;

    /* renamed from: G3.g$a */
    private final class a implements J, t {

        /* renamed from: a  reason: collision with root package name */
        private final T f35915a;

        /* renamed from: b  reason: collision with root package name */
        private J.a f35916b;

        /* renamed from: c  reason: collision with root package name */
        private t.a f35917c;

        public a(T t10) {
            this.f35916b = C6487g.this.t((C6479C.b) null);
            this.f35917c = C6487g.this.r((C6479C.b) null);
            this.f35915a = t10;
        }

        private boolean a(int i10, C6479C.b bVar) {
            C6479C.b bVar2;
            if (bVar != null) {
                bVar2 = C6487g.this.C(this.f35915a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int E10 = C6487g.this.E(this.f35915a, i10);
            J.a aVar = this.f35916b;
            if (aVar.f35643a != E10 || !N.d(aVar.f35644b, bVar2)) {
                this.f35916b = C6487g.this.s(E10, bVar2);
            }
            t.a aVar2 = this.f35917c;
            if (aVar2.f33677a == E10 && N.d(aVar2.f33678b, bVar2)) {
                return true;
            }
            this.f35917c = C6487g.this.q(E10, bVar2);
            return true;
        }

        private C6477A e(C6477A a10, C6479C.b bVar) {
            C6477A a11 = a10;
            C6479C.b bVar2 = bVar;
            long D10 = C6487g.this.D(this.f35915a, a11.f35617f, bVar2);
            long D11 = C6487g.this.D(this.f35915a, a11.f35618g, bVar2);
            return (D10 == a11.f35617f && D11 == a11.f35618g) ? a11 : new C6477A(a11.f35612a, a11.f35613b, a11.f35614c, a11.f35615d, a11.f35616e, D10, D11);
        }

        public void C(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
            if (a(i10, bVar)) {
                this.f35916b.x(xVar, e(a10, bVar));
            }
        }

        public void K(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
            if (a(i10, bVar)) {
                this.f35916b.t(xVar, e(a10, bVar));
            }
        }

        public void L(int i10, C6479C.b bVar, C6477A a10) {
            if (a(i10, bVar)) {
                this.f35916b.j(e(a10, bVar));
            }
        }

        public void P(int i10, C6479C.b bVar) {
            if (a(i10, bVar)) {
                this.f35917c.i();
            }
        }

        public void R(int i10, C6479C.b bVar, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f35916b.v(xVar, e(a10, bVar), iOException, z10);
            }
        }

        public void U(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
            if (a(i10, bVar)) {
                this.f35916b.r(xVar, e(a10, bVar));
            }
        }

        public void h0(int i10, C6479C.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f35917c.l(exc);
            }
        }

        public void i0(int i10, C6479C.b bVar) {
            if (a(i10, bVar)) {
                this.f35917c.m();
            }
        }

        public void j0(int i10, C6479C.b bVar) {
            if (a(i10, bVar)) {
                this.f35917c.h();
            }
        }

        public void k0(int i10, C6479C.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f35917c.k(i11);
            }
        }

        public void m0(int i10, C6479C.b bVar) {
            if (a(i10, bVar)) {
                this.f35917c.j();
            }
        }
    }

    /* renamed from: G3.g$b */
    private static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final C6479C f35919a;

        /* renamed from: b  reason: collision with root package name */
        public final C6479C.c f35920b;

        /* renamed from: c  reason: collision with root package name */
        public final C6487g<T>.defpackage.a f35921c;

        public b(C6479C c10, C6479C.c cVar, C6487g<T>.defpackage.a aVar) {
            this.f35919a = c10;
            this.f35920b = cVar;
            this.f35921c = aVar;
        }
    }

    protected C6487g() {
    }

    /* access modifiers changed from: protected */
    public void A() {
        for (b next : this.f35912h.values()) {
            next.f35919a.b(next.f35920b);
            next.f35919a.h(next.f35921c);
            next.f35919a.c(next.f35921c);
        }
        this.f35912h.clear();
    }

    /* access modifiers changed from: protected */
    public abstract C6479C.b C(T t10, C6479C.b bVar);

    /* access modifiers changed from: protected */
    public long D(T t10, long j10, C6479C.b bVar) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public int E(T t10, int i10) {
        return i10;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void F(T t10, C6479C c10, q3.J j10);

    /* access modifiers changed from: protected */
    public final void H(T t10, C6479C c10) {
        C5950a.a(!this.f35912h.containsKey(t10));
        C6486f fVar = new C6486f(this, t10);
        a aVar = new a(t10);
        this.f35912h.put(t10, new b(c10, fVar, aVar));
        c10.g((Handler) C5950a.e(this.f35913i), aVar);
        c10.n((Handler) C5950a.e(this.f35913i), aVar);
        c10.f(fVar, this.f35914j, w());
        if (!x()) {
            c10.d(fVar);
        }
    }

    public void j() {
        for (b<T> bVar : this.f35912h.values()) {
            bVar.f35919a.j();
        }
    }

    /* access modifiers changed from: protected */
    public void u() {
        for (b next : this.f35912h.values()) {
            next.f35919a.d(next.f35920b);
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        for (b next : this.f35912h.values()) {
            next.f35919a.p(next.f35920b);
        }
    }

    /* access modifiers changed from: protected */
    public void y(C c10) {
        this.f35914j = c10;
        this.f35913i = N.A();
    }
}
