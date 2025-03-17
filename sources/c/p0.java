package C;

import G.p;
import H2.i;
import J.m;
import O.N;
import O.W;
import Q.f;
import R.c;
import R.d;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class p0 extends H0 {

    /* renamed from: y  reason: collision with root package name */
    public static final b f5380y = new b();

    /* renamed from: z  reason: collision with root package name */
    private static final Executor f5381z = H.a.d();

    /* renamed from: q  reason: collision with root package name */
    private c f5382q;

    /* renamed from: r  reason: collision with root package name */
    private Executor f5383r = f5381z;

    /* renamed from: s  reason: collision with root package name */
    X0.b f5384s;

    /* renamed from: t  reason: collision with root package name */
    private C5019e0 f5385t;

    /* renamed from: u  reason: collision with root package name */
    private N f5386u;

    /* renamed from: v  reason: collision with root package name */
    G0 f5387v;

    /* renamed from: w  reason: collision with root package name */
    private W f5388w;

    /* renamed from: x  reason: collision with root package name */
    private X0.c f5389x;

    public static final class a implements o1.a<p0, M0, a>, C5046s0.a<a> {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f5390a;

        public a() {
            this(E0.b0());
        }

        static a g(X x10) {
            return new a(E0.c0(x10));
        }

        public D0 a() {
            return this.f5390a;
        }

        public p0 f() {
            M0 h10 = e();
            C5046s0.v(h10);
            return new p0(h10);
        }

        /* renamed from: h */
        public M0 e() {
            return new M0(J0.Z(this.f5390a));
        }

        public a i(p1.b bVar) {
            a().q(o1.f16978F, bVar);
            return this;
        }

        public a j(C4417z zVar) {
            a().q(C5044r0.f17009m, zVar);
            return this;
        }

        /* renamed from: k */
        public a c(R.c cVar) {
            a().q(C5046s0.f17018v, cVar);
            return this;
        }

        public a l(int i10) {
            a().q(o1.f16974B, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public a m(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().q(C5046s0.f17010n, Integer.valueOf(i10));
            return this;
        }

        public a n(Class<p0> cls) {
            a().q(m.f8790c, cls);
            if (a().g(m.f8789b, null) == null) {
                o(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a o(String str) {
            a().q(m.f8789b, str);
            return this;
        }

        @Deprecated
        /* renamed from: p */
        public a d(Size size) {
            a().q(C5046s0.f17014r, size);
            return this;
        }

        /* renamed from: q */
        public a b(int i10) {
            a().q(C5046s0.f17011o, Integer.valueOf(i10));
            a().q(C5046s0.f17012p, Integer.valueOf(i10));
            return this;
        }

        private a(E0 e02) {
            this.f5390a = e02;
            Class cls = (Class) e02.g(m.f8790c, null);
            Class<p0> cls2 = p0.class;
            if (cls == null || cls.equals(cls2)) {
                i(p1.b.PREVIEW);
                n(cls2);
                X.a<Integer> aVar = C5046s0.f17013q;
                if (((Integer) e02.g(aVar, -1)).intValue() == -1) {
                    e02.q(aVar, 2);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private static final R.c f5391a;

        /* renamed from: b  reason: collision with root package name */
        private static final M0 f5392b;

        /* renamed from: c  reason: collision with root package name */
        private static final C4417z f5393c;

        static {
            R.c a10 = new c.a().d(R.a.f12169c).f(d.f12181c).a();
            f5391a = a10;
            C4417z zVar = C4417z.f5464c;
            f5393c = zVar;
            f5392b = new a().l(2).m(0).c(a10).j(zVar).e();
        }

        public M0 a() {
            return f5392b;
        }
    }

    public interface c {
        void a(G0 g02);
    }

    p0(M0 m02) {
        super(m02);
    }

    private void d0(X0.b bVar, c1 c1Var) {
        if (this.f5382q != null) {
            bVar.m(this.f5385t, c1Var.b(), p(), n());
        }
        X0.c cVar = this.f5389x;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new o0(this));
        this.f5389x = cVar2;
        bVar.t(cVar2);
    }

    private void e0() {
        X0.c cVar = this.f5389x;
        if (cVar != null) {
            cVar.b();
            this.f5389x = null;
        }
        C5019e0 e0Var = this.f5385t;
        if (e0Var != null) {
            e0Var.d();
            this.f5385t = null;
        }
        W w10 = this.f5388w;
        if (w10 != null) {
            w10.i();
            this.f5388w = null;
        }
        N n10 = this.f5386u;
        if (n10 != null) {
            n10.i();
            this.f5386u = null;
        }
        this.f5387v = null;
    }

    private X0.b f0(M0 m02, c1 c1Var) {
        p.a();
        J g10 = g();
        Objects.requireNonNull(g10);
        J j10 = g10;
        e0();
        i.i(this.f5386u == null);
        Matrix v10 = v();
        boolean q10 = j10.q();
        Rect g02 = g0(c1Var.e());
        Objects.requireNonNull(g02);
        this.f5386u = new N(1, 34, c1Var, v10, q10, g02, r(j10, C(j10)), d(), q0(j10));
        C4404l l10 = l();
        if (l10 != null) {
            this.f5388w = new W(j10, l10.a());
            this.f5386u.e(new l0(this));
            f j11 = f.j(this.f5386u);
            N n10 = (N) this.f5388w.m(W.b.c(this.f5386u, Collections.singletonList(j11))).get(j11);
            Objects.requireNonNull(n10);
            n10.e(new m0(this, j10));
            this.f5387v = n10.k(j10);
            this.f5385t = this.f5386u.o();
        } else {
            this.f5386u.e(new l0(this));
            G0 k10 = this.f5386u.k(j10);
            this.f5387v = k10;
            this.f5385t = k10.m();
        }
        if (this.f5382q != null) {
            m0();
        }
        X0.b q11 = X0.b.q(m02, c1Var.e());
        q11.u(c1Var.c());
        q11.y(m02.D());
        if (c1Var.d() != null) {
            q11.g(c1Var.d());
        }
        d0(q11, c1Var);
        return q11;
    }

    private Rect g0(Size size) {
        if (A() != null) {
            return A();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i0(X0 x02, X0.g gVar) {
        if (g() != null) {
            r0((M0) j(), e());
            G();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j0(J j10) {
        l0(this.f5386u, j10);
    }

    private void l0(N n10, J j10) {
        p.a();
        if (j10 == g()) {
            n10.v();
        }
    }

    private void m0() {
        n0();
        this.f5383r.execute(new n0((c) i.g(this.f5382q), (G0) i.g(this.f5387v)));
    }

    private void n0() {
        J g10 = g();
        N n10 = this.f5386u;
        if (g10 != null && n10 != null) {
            n10.D(r(g10, C(g10)), d());
        }
    }

    private boolean q0(J j10) {
        return j10.q() && C(j10);
    }

    private void r0(M0 m02, c1 c1Var) {
        X0.b f02 = f0(m02, c1Var);
        this.f5384s = f02;
        X(F.a(new Object[]{f02.o()}));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [C.A, androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.o1<?> L(androidx.camera.core.impl.I r3, androidx.camera.core.impl.o1.a<?, ?, ?> r4) {
        /*
            r2 = this;
            androidx.camera.core.impl.D0 r3 = r4.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r0 = androidx.camera.core.impl.C5044r0.f17008l
            r1 = 34
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.q(r0, r1)
            androidx.camera.core.impl.o1 r3 = r4.e()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C.p0.L(androidx.camera.core.impl.I, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    /* access modifiers changed from: protected */
    public c1 O(X x10) {
        this.f5384s.g(x10);
        X(F.a(new Object[]{this.f5384s.o()}));
        return e().g().d(x10).a();
    }

    /* access modifiers changed from: protected */
    public c1 P(c1 c1Var, c1 c1Var2) {
        r0((M0) j(), c1Var);
        return c1Var;
    }

    public void Q() {
        e0();
    }

    public void V(Rect rect) {
        super.V(rect);
        n0();
    }

    public int h0() {
        return y();
    }

    public o1<?> k(boolean z10, p1 p1Var) {
        b bVar = f5380y;
        X a10 = p1Var.a(bVar.a().getCaptureType(), 1);
        if (z10) {
            a10 = X.O(a10, bVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).e();
    }

    public void o0(c cVar) {
        p0(f5381z, cVar);
    }

    public void p0(Executor executor, c cVar) {
        p.a();
        if (cVar == null) {
            this.f5382q = null;
            F();
            return;
        }
        this.f5382q = cVar;
        this.f5383r = executor;
        if (f() != null) {
            r0((M0) j(), e());
            G();
        }
        E();
    }

    public String toString() {
        return "Preview:" + o();
    }

    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public o1.a<?, ?, ?> z(X x10) {
        return a.g(x10);
    }
}
