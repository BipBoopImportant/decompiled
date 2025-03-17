package androidx.camera.core;

import C.C4417z;
import C.F;
import C.H0;
import C.I;
import C.K;
import G.p;
import H2.i;
import J.m;
import J.n;
import R.c;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5041p0;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.C5050u0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class f extends H0 {

    /* renamed from: w  reason: collision with root package name */
    public static final d f16667w = new d();

    /* renamed from: x  reason: collision with root package name */
    private static final Boolean f16668x = null;

    /* renamed from: q  reason: collision with root package name */
    final i f16669q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f16670r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private a f16671s;

    /* renamed from: t  reason: collision with root package name */
    X0.b f16672t;

    /* renamed from: u  reason: collision with root package name */
    private C5019e0 f16673u;

    /* renamed from: v  reason: collision with root package name */
    private X0.c f16674v;

    public interface a {
        Size a() {
            return null;
        }

        int b() {
            return 0;
        }

        void c(Matrix matrix) {
        }

        void d(n nVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements C5046s0.a<c>, o1.a<f, C5041p0, c> {

        /* renamed from: a  reason: collision with root package name */
        private final E0 f16675a;

        public c() {
            this(E0.b0());
        }

        static c g(X x10) {
            return new c(E0.c0(x10));
        }

        public D0 a() {
            return this.f16675a;
        }

        public f f() {
            C5041p0 h10 = e();
            C5046s0.v(h10);
            return new f(h10);
        }

        /* renamed from: h */
        public C5041p0 e() {
            return new C5041p0(J0.Z(this.f16675a));
        }

        public c i(Executor executor) {
            a().q(n.f8791d, executor);
            return this;
        }

        public c j(int i10) {
            a().q(C5041p0.f16984J, Integer.valueOf(i10));
            return this;
        }

        public c k(p1.b bVar) {
            a().q(o1.f16978F, bVar);
            return this;
        }

        public c l(Size size) {
            a().q(C5046s0.f17015s, size);
            return this;
        }

        public c m(C4417z zVar) {
            if (Objects.equals(C4417z.f5465d, zVar)) {
                a().q(C5044r0.f17009m, zVar);
                return this;
            }
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }

        public c n(int i10) {
            a().q(C5041p0.f16985K, Integer.valueOf(i10));
            return this;
        }

        public c o(int i10) {
            a().q(C5041p0.f16987M, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: p */
        public c c(R.c cVar) {
            a().q(C5046s0.f17018v, cVar);
            return this;
        }

        public c q(int i10) {
            a().q(o1.f16974B, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public c r(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().q(C5046s0.f17010n, Integer.valueOf(i10));
            return this;
        }

        public c s(Class<f> cls) {
            a().q(m.f8790c, cls);
            if (a().g(m.f8789b, null) == null) {
                t(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c t(String str) {
            a().q(m.f8789b, str);
            return this;
        }

        @Deprecated
        /* renamed from: u */
        public c d(Size size) {
            a().q(C5046s0.f17014r, size);
            return this;
        }

        /* renamed from: v */
        public c b(int i10) {
            a().q(C5046s0.f17011o, Integer.valueOf(i10));
            return this;
        }

        private c(E0 e02) {
            this.f16675a = e02;
            Class cls = (Class) e02.g(m.f8790c, null);
            Class<f> cls2 = f.class;
            if (cls == null || cls.equals(cls2)) {
                k(p1.b.IMAGE_ANALYSIS);
                s(cls2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Size f16676a;

        /* renamed from: b  reason: collision with root package name */
        private static final C4417z f16677b;

        /* renamed from: c  reason: collision with root package name */
        private static final R.c f16678c;

        /* renamed from: d  reason: collision with root package name */
        private static final C5041p0 f16679d;

        static {
            Size size = new Size(640, 480);
            f16676a = size;
            C4417z zVar = C4417z.f5465d;
            f16677b = zVar;
            R.c a10 = new c.a().d(R.a.f12169c).f(new R.d(N.d.f9159c, 1)).a();
            f16678c = a10;
            f16679d = new c().l(size).q(1).r(0).c(a10).m(zVar).e();
        }

        public C5041p0 a() {
            return f16679d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    f(C5041p0 p0Var) {
        super(p0Var);
        if (((C5041p0) j()).X(0) == 1) {
            this.f16669q = new j();
        } else {
            this.f16669q = new k(p0Var.T(H.a.b()));
        }
        this.f16669q.t(k0());
        this.f16669q.u(m0());
    }

    private boolean l0(J j10) {
        return m0() && q(j10) % 180 != 0;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n0(q qVar, q qVar2) {
        qVar.l();
        if (qVar2 != null) {
            qVar2.l();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o0(X0 x02, X0.g gVar) {
        if (g() != null) {
            f0();
            this.f16669q.g();
            X0.b g02 = g0(i(), (C5041p0) j(), (c1) i.g(e()));
            this.f16672t = g02;
            X(F.a(new Object[]{g02.o()}));
            G();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List p0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    private void t0() {
        J g10 = g();
        if (g10 != null) {
            this.f16669q.w(q(g10));
        }
    }

    public void J() {
        this.f16669q.f();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [C.A, androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.o1<?> L(androidx.camera.core.impl.I r6, androidx.camera.core.impl.o1.a<?, ?, ?> r7) {
        /*
            r5 = this;
            java.lang.Boolean r0 = r5.j0()
            androidx.camera.core.impl.R0 r1 = r6.h()
            java.lang.Class<androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk> r2 = androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk.class
            boolean r1 = r1.a(r2)
            androidx.camera.core.i r2 = r5.f16669q
            if (r0 != 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            boolean r1 = r0.booleanValue()
        L_0x0017:
            r2.s(r1)
            java.lang.Object r0 = r5.f16670r
            monitor-enter(r0)
            androidx.camera.core.f$a r1 = r5.f16671s     // Catch:{ all -> 0x0027 }
            r2 = 0
            if (r1 == 0) goto L_0x002a
            android.util.Size r1 = r1.a()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r6 = move-exception
            goto L_0x00c0
        L_0x002a:
            r1 = r2
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0033
            androidx.camera.core.impl.o1 r6 = r7.e()
            return r6
        L_0x0033:
            androidx.camera.core.impl.D0 r0 = r7.a()
            androidx.camera.core.impl.X$a<java.lang.Integer> r3 = androidx.camera.core.impl.C5046s0.f17011o
            r4 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.g(r3, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r6 = r6.o(r0)
            int r6 = r6 % 180
            r0 = 90
            if (r6 != r0) goto L_0x0060
            android.util.Size r6 = new android.util.Size
            int r0 = r1.getHeight()
            int r1 = r1.getWidth()
            r6.<init>(r0, r1)
            r1 = r6
        L_0x0060:
            androidx.camera.core.impl.o1 r6 = r7.e()
            androidx.camera.core.impl.X$a<android.util.Size> r0 = androidx.camera.core.impl.C5046s0.f17014r
            boolean r6 = r6.b(r0)
            if (r6 != 0) goto L_0x0073
            androidx.camera.core.impl.D0 r6 = r7.a()
            r6.q(r0, r1)
        L_0x0073:
            androidx.camera.core.impl.o1 r6 = r7.e()
            androidx.camera.core.impl.X$a<R.c> r0 = androidx.camera.core.impl.C5046s0.f17018v
            boolean r6 = r6.b(r0)
            if (r6 == 0) goto L_0x00bb
            androidx.camera.core.impl.o1 r6 = r5.c()
            java.lang.Object r6 = r6.g(r0, r2)
            R.c r6 = (R.c) r6
            if (r6 != 0) goto L_0x0091
            R.c$a r2 = new R.c$a
            r2.<init>()
            goto L_0x0095
        L_0x0091:
            R.c$a r2 = R.c.a.b(r6)
        L_0x0095:
            if (r6 == 0) goto L_0x009d
            R.d r3 = r6.d()
            if (r3 != 0) goto L_0x00a6
        L_0x009d:
            R.d r3 = new R.d
            r4 = 1
            r3.<init>(r1, r4)
            r2.f(r3)
        L_0x00a6:
            if (r6 != 0) goto L_0x00b0
            C.H r6 = new C.H
            r6.<init>(r1)
            r2.e(r6)
        L_0x00b0:
            androidx.camera.core.impl.D0 r6 = r7.a()
            R.c r1 = r2.a()
            r6.q(r0, r1)
        L_0x00bb:
            androidx.camera.core.impl.o1 r6 = r7.e()
            return r6
        L_0x00c0:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.f.L(androidx.camera.core.impl.I, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    /* access modifiers changed from: protected */
    public c1 O(X x10) {
        this.f16672t.g(x10);
        X(F.a(new Object[]{this.f16672t.o()}));
        return e().g().d(x10).a();
    }

    /* access modifiers changed from: protected */
    public c1 P(c1 c1Var, c1 c1Var2) {
        X0.b g02 = g0(i(), (C5041p0) j(), c1Var);
        this.f16672t = g02;
        X(F.a(new Object[]{g02.o()}));
        return c1Var;
    }

    public void Q() {
        f0();
        this.f16669q.j();
    }

    public void T(Matrix matrix) {
        super.T(matrix);
        this.f16669q.x(matrix);
    }

    public void V(Rect rect) {
        super.V(rect);
        this.f16669q.y(rect);
    }

    public void e0() {
        synchronized (this.f16670r) {
            try {
                this.f16669q.r((Executor) null, (a) null);
                if (this.f16671s != null) {
                    F();
                }
                this.f16671s = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        p.a();
        X0.c cVar = this.f16674v;
        if (cVar != null) {
            cVar.b();
            this.f16674v = null;
        }
        C5019e0 e0Var = this.f16673u;
        if (e0Var != null) {
            e0Var.d();
            this.f16673u = null;
        }
    }

    /* access modifiers changed from: package-private */
    public X0.b g0(String str, C5041p0 p0Var, c1 c1Var) {
        p.a();
        Size e10 = c1Var.e();
        Executor executor = (Executor) i.g(p0Var.T(H.a.b()));
        boolean z10 = true;
        int i02 = h0() == 1 ? i0() : 4;
        q qVar = p0Var.Z() != null ? new q(p0Var.Z().a(e10.getWidth(), e10.getHeight(), m(), i02, 0)) : new q(o.a(e10.getWidth(), e10.getHeight(), m(), i02));
        boolean l02 = g() != null ? l0(g()) : false;
        int height = l02 ? e10.getHeight() : e10.getWidth();
        int width = l02 ? e10.getWidth() : e10.getHeight();
        int i10 = k0() == 2 ? 1 : 35;
        boolean z11 = m() == 35 && k0() == 2;
        if (m() != 35 || ((g() == null || q(g()) == 0) && !Boolean.TRUE.equals(j0()))) {
            z10 = false;
        }
        q qVar2 = (z11 || z10) ? new q(o.a(height, width, i10, qVar.e())) : null;
        if (qVar2 != null) {
            this.f16669q.v(qVar2);
        }
        t0();
        qVar.f(this.f16669q, executor);
        X0.b q10 = X0.b.q(p0Var, c1Var.e());
        if (c1Var.d() != null) {
            q10.g(c1Var.d());
        }
        C5019e0 e0Var = this.f16673u;
        if (e0Var != null) {
            e0Var.d();
        }
        C5050u0 u0Var = new C5050u0(qVar.getSurface(), e10, m());
        this.f16673u = u0Var;
        u0Var.k().a(new I(qVar, qVar2), H.a.d());
        q10.u(c1Var.c());
        q10.m(this.f16673u, c1Var.b(), (String) null, -1);
        X0.c cVar = this.f16674v;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new C.J(this));
        this.f16674v = cVar2;
        q10.t(cVar2);
        return q10;
    }

    public int h0() {
        return ((C5041p0) j()).X(0);
    }

    public int i0() {
        return ((C5041p0) j()).Y(6);
    }

    public Boolean j0() {
        return ((C5041p0) j()).a0(f16668x);
    }

    public o1<?> k(boolean z10, p1 p1Var) {
        d dVar = f16667w;
        X a10 = p1Var.a(dVar.a().getCaptureType(), 1);
        if (z10) {
            a10 = X.O(a10, dVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).e();
    }

    public int k0() {
        return ((C5041p0) j()).b0(1);
    }

    public boolean m0() {
        return ((C5041p0) j()).c0(Boolean.FALSE).booleanValue();
    }

    public void r0(Executor executor, a aVar) {
        synchronized (this.f16670r) {
            try {
                this.f16669q.r(executor, new K(aVar));
                if (this.f16671s == null) {
                    E();
                }
                this.f16671s = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s0(int i10) {
        if (U(i10)) {
            t0();
        }
    }

    public String toString() {
        return "ImageAnalysis:" + o();
    }

    public o1.a<?, ?, ?> z(X x10) {
        return c.g(x10);
    }
}
