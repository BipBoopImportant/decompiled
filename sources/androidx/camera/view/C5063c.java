package androidx.camera.view;

import C.B;
import C.C;
import C.C4391e0;
import C.C4397h0;
import C.C4399i0;
import C.C4400j;
import C.C4402k;
import C.C4404l;
import C.C4409q;
import C.C4417z;
import C.I0;
import C.J0;
import C.K0;
import C.U;
import C.p0;
import G.e;
import G.p;
import I.n;
import R.c;
import T.g;
import V.B;
import V.C4930o;
import V.W;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.c1;
import androidx.camera.view.u;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import d0.C5269a;
import d0.C5270b;
import d0.C5271c;
import d0.C5272d;
import f0.C5298a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import ob.C10101e;

/* renamed from: androidx.camera.view.c  reason: case insensitive filesystem */
public abstract class C5063c {

    /* renamed from: L  reason: collision with root package name */
    private static final U.i f17133L = new a();

    /* renamed from: A  reason: collision with root package name */
    private boolean f17134A;

    /* renamed from: B  reason: collision with root package name */
    private final C5065e<K0> f17135B;

    /* renamed from: C  reason: collision with root package name */
    private final C5065e<Integer> f17136C;

    /* renamed from: D  reason: collision with root package name */
    final K<Integer> f17137D;

    /* renamed from: E  reason: collision with root package name */
    private final h<Boolean> f17138E;

    /* renamed from: F  reason: collision with root package name */
    private final h<Float> f17139F;

    /* renamed from: G  reason: collision with root package name */
    private final h<Float> f17140G;

    /* renamed from: H  reason: collision with root package name */
    private final Set<C4404l> f17141H;

    /* renamed from: I  reason: collision with root package name */
    private final Context f17142I;

    /* renamed from: J  reason: collision with root package name */
    private final C10101e<Void> f17143J;

    /* renamed from: K  reason: collision with root package name */
    private final Map<C5298a.C0372a, C5298a> f17144K;

    /* renamed from: a  reason: collision with root package name */
    C4409q f17145a;

    /* renamed from: b  reason: collision with root package name */
    private int f17146b;

    /* renamed from: c  reason: collision with root package name */
    p0 f17147c;

    /* renamed from: d  reason: collision with root package name */
    c f17148d;

    /* renamed from: e  reason: collision with root package name */
    U f17149e;

    /* renamed from: f  reason: collision with root package name */
    c f17150f;

    /* renamed from: g  reason: collision with root package name */
    Executor f17151g;

    /* renamed from: h  reason: collision with root package name */
    private Executor f17152h;

    /* renamed from: i  reason: collision with root package name */
    private Executor f17153i;

    /* renamed from: j  reason: collision with root package name */
    private f.a f17154j;

    /* renamed from: k  reason: collision with root package name */
    f f17155k;

    /* renamed from: l  reason: collision with root package name */
    c f17156l;

    /* renamed from: m  reason: collision with root package name */
    W<B> f17157m;

    /* renamed from: n  reason: collision with root package name */
    Map<H2.a<Object>, Object> f17158n;

    /* renamed from: o  reason: collision with root package name */
    C4930o f17159o;

    /* renamed from: p  reason: collision with root package name */
    private int f17160p;

    /* renamed from: q  reason: collision with root package name */
    private C4417z f17161q;

    /* renamed from: r  reason: collision with root package name */
    private C4417z f17162r;

    /* renamed from: s  reason: collision with root package name */
    private Range<Integer> f17163s;

    /* renamed from: t  reason: collision with root package name */
    C4400j f17164t;

    /* renamed from: u  reason: collision with root package name */
    s f17165u;

    /* renamed from: v  reason: collision with root package name */
    J0 f17166v;

    /* renamed from: w  reason: collision with root package name */
    p0.c f17167w;

    /* renamed from: x  reason: collision with root package name */
    private final u f17168x;

    /* renamed from: y  reason: collision with root package name */
    final u.b f17169y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f17170z;

    /* renamed from: androidx.camera.view.c$a */
    class a implements U.i {
        a() {
        }

        public void a(long j10, U.j jVar) {
            jVar.a();
        }

        public void clear() {
        }
    }

    /* renamed from: androidx.camera.view.c$b */
    class b implements I.c<C> {
        b() {
        }

        public void b(Throwable th2) {
            if (th2 instanceof C4402k.a) {
                C4391e0.a("CameraController", "Tap-to-focus is canceled by new action.");
                return;
            }
            C4391e0.b("CameraController", "Tap to focus failed.", th2);
            C5063c.this.f17137D.postValue(4);
        }

        /* renamed from: c */
        public void a(C c10) {
            if (c10 != null) {
                C4391e0.a("CameraController", "Tap to focus onSuccess: " + c10.c());
                C5063c.this.f17137D.postValue(Integer.valueOf(c10.c() ? 2 : 3));
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.camera.view.c$c  reason: collision with other inner class name */
    public static final class C0233c {
    }

    C5063c(Context context) {
        this(context, n.G(g.t(context), new C5061a(), H.a.a()));
    }

    private boolean A(int i10) {
        return (i10 & this.f17146b) != 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void C(s sVar) {
        this.f17165u = sVar;
        X();
        S();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(int i10) {
        this.f17155k.s0(i10);
        this.f17149e.J0(i10);
        this.f17157m.W0(i10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(C4409q qVar) {
        this.f17145a = qVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(int i10) {
        this.f17146b = i10;
    }

    private void I(f.a aVar, f.a aVar2) {
        Size size = null;
        Size a10 = aVar == null ? null : aVar.a();
        if (aVar2 != null) {
            size = aVar2.a();
        }
        if (!Objects.equals(a10, size)) {
            Y(Integer.valueOf(this.f17155k.h0()), Integer.valueOf(this.f17155k.i0()), Integer.valueOf(this.f17155k.k0()));
            S();
        }
    }

    private float Q(float f10) {
        return f10 > 1.0f ? ((f10 - 1.0f) * 2.0f) + 1.0f : 1.0f - ((1.0f - f10) * 2.0f);
    }

    private void U() {
        this.f17168x.a(H.a.d(), this.f17169y);
    }

    private void V() {
        this.f17168x.c(this.f17169y);
    }

    private void W() {
        p.a();
    }

    private void X() {
        a0();
        Z(Integer.valueOf(p()));
        Y(Integer.valueOf(this.f17155k.h0()), Integer.valueOf(this.f17155k.i0()), Integer.valueOf(this.f17155k.k0()));
        b0();
    }

    private void Y(Integer num, Integer num2, Integer num3) {
        f.a aVar;
        p.a();
        if (v()) {
            this.f17165u.c(this.f17155k);
        }
        f i10 = i(num, num2, num3);
        this.f17155k = i10;
        Executor executor = this.f17152h;
        if (executor != null && (aVar = this.f17154j) != null) {
            i10.r0(executor, aVar);
        }
    }

    private void Z(Integer num) {
        if (v()) {
            this.f17165u.c(this.f17149e);
        }
        int n02 = this.f17149e.n0();
        this.f17149e = j(num);
        M(n02);
    }

    private void a0() {
        if (v()) {
            this.f17165u.c(this.f17147c);
        }
        p0 k10 = k();
        this.f17147c = k10;
        p0.c cVar = this.f17167w;
        if (cVar != null) {
            k10.o0(cVar);
        }
    }

    private void b0() {
        if (v()) {
            this.f17165u.c(this.f17157m);
        }
        this.f17157m = m();
    }

    private void h(C5046s0.a<?> aVar, c cVar, C0233c cVar2) {
        R.a s10;
        if (cVar != null) {
            aVar.c(cVar);
            return;
        }
        J0 j02 = this.f17166v;
        if (j02 != null && (s10 = s(j02)) != null) {
            aVar.c(new c.a().d(s10).a());
        }
    }

    private f i(Integer num, Integer num2, Integer num3) {
        f.c cVar = new f.c();
        if (num != null) {
            cVar.j(num.intValue());
        }
        if (num2 != null) {
            cVar.n(num2.intValue());
        }
        if (num3 != null) {
            cVar.o(num3.intValue());
        }
        h(cVar, this.f17156l, (C0233c) null);
        Executor executor = this.f17153i;
        if (executor != null) {
            cVar.i(executor);
        }
        return cVar.f();
    }

    private U j(Integer num) {
        U.b bVar = new U.b();
        if (num != null) {
            bVar.i(num.intValue());
        }
        h(bVar, this.f17150f, (C0233c) null);
        Executor executor = this.f17151g;
        if (executor != null) {
            bVar.l(executor);
        }
        return bVar.f();
    }

    private p0 k() {
        p0.a aVar = new p0.a();
        h(aVar, this.f17148d, (C0233c) null);
        aVar.j(this.f17162r);
        return aVar.f();
    }

    private W<B> m() {
        int r10;
        B.f g10 = new B.f().g(this.f17159o);
        J0 j02 = this.f17166v;
        if (!(j02 == null || this.f17159o != B.f14237h0 || (r10 = r(j02)) == -1)) {
            g10.f(r10);
        }
        return new W.d(g10.c()).p(this.f17163s).l(this.f17160p).k(this.f17161q).f();
    }

    private int r(J0 j02) {
        int b10 = j02 == null ? 0 : G.c.b(j02.c());
        s sVar = this.f17165u;
        int c10 = sVar == null ? 0 : sVar.a(this.f17145a).c();
        s sVar2 = this.f17165u;
        int a10 = G.c.a(b10, c10, sVar2 == null || sVar2.a(this.f17145a).f() == 1);
        Rational a11 = j02.a();
        if (a10 == 90 || a10 == 270) {
            a11 = new Rational(a11.getDenominator(), a11.getNumerator());
        }
        if (a11.equals(new Rational(4, 3))) {
            return 0;
        }
        return a11.equals(new Rational(16, 9)) ? 1 : -1;
    }

    private R.a s(J0 j02) {
        int r10 = r(j02);
        if (r10 != -1) {
            return new R.a(r10, 1);
        }
        return null;
    }

    private boolean u() {
        return this.f17164t != null;
    }

    private boolean v() {
        return this.f17165u != null;
    }

    private boolean y() {
        return (this.f17167w == null || this.f17166v == null) ? false : true;
    }

    public boolean B() {
        p.a();
        return A(4);
    }

    /* access modifiers changed from: package-private */
    public void G(float f10) {
        if (!u()) {
            C4391e0.l("CameraController", "Use cases not attached to camera.");
        } else if (!this.f17170z) {
            C4391e0.a("CameraController", "Pinch to zoom disabled.");
        } else {
            C4391e0.a("CameraController", "Pinch to zoom with scale: " + f10);
            K0 value = t().getValue();
            if (value != null) {
                P(Math.min(Math.max(value.d() * Q(f10), value.c()), value.a()));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H(C4399i0 i0Var, float f10, float f11) {
        if (!u()) {
            C4391e0.l("CameraController", "Use cases not attached to camera.");
        } else if (!this.f17134A) {
            C4391e0.a("CameraController", "Tap to focus disabled. ");
        } else {
            C4391e0.a("CameraController", "Tap to focus started: " + f10 + ", " + f11);
            this.f17137D.postValue(1);
            C4397h0 b10 = i0Var.b(f10, f11, 0.16666667f);
            n.j(this.f17164t.a().k(new B.a(b10, 1).a(i0Var.b(f10, f11, 0.25f), 2).b()), new b(), H.a.a());
        }
    }

    public void J(C4409q qVar) {
        p.a();
        if (this.f17145a != qVar) {
            Integer d10 = qVar.d();
            if (this.f17149e.n0() != 3 || d10 == null || d10.intValue() == 0) {
                C4409q qVar2 = this.f17145a;
                this.f17145a = qVar;
                s sVar = this.f17165u;
                if (sVar != null) {
                    sVar.c(this.f17147c, this.f17149e, this.f17155k, this.f17157m);
                    T(new C5272d(this, qVar2));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
    }

    public void K(int i10) {
        p.a();
        int i11 = this.f17146b;
        if (i10 != i11) {
            this.f17146b = i10;
            if (!B() && z()) {
                W();
            }
            T(new d0.f(this, i11));
        }
    }

    public void L(Executor executor, f.a aVar) {
        p.a();
        f.a aVar2 = this.f17154j;
        if (aVar2 != aVar || this.f17152h != executor) {
            this.f17152h = executor;
            this.f17154j = aVar;
            this.f17155k.r0(executor, aVar);
            I(aVar2, aVar);
        }
    }

    public void M(int i10) {
        p.a();
        if (i10 == 3) {
            Integer d10 = this.f17145a.d();
            if (d10 == null || d10.intValue() == 0) {
                d0();
            } else {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        this.f17149e.F0(i10);
    }

    public C10101e<Void> N(float f10) {
        p.a();
        return !u() ? this.f17139F.d(Float.valueOf(f10)) : this.f17164t.a().d(f10);
    }

    public void O(C5298a aVar) {
        C5298a q10 = q();
        this.f17144K.put(aVar.a(), aVar);
        C5298a q11 = q();
        if (q11 != null && !q11.equals(q10)) {
            d0();
        }
    }

    public C10101e<Void> P(float f10) {
        p.a();
        return !u() ? this.f17140G.d(Float.valueOf(f10)) : this.f17164t.a().f(f10);
    }

    /* access modifiers changed from: package-private */
    public abstract C4400j R();

    /* access modifiers changed from: package-private */
    public void S() {
        T((Runnable) null);
    }

    /* access modifiers changed from: package-private */
    public void T(Runnable runnable) {
        try {
            this.f17164t = R();
            if (!u()) {
                C4391e0.a("CameraController", "Use cases not attached to camera.");
                return;
            }
            this.f17135B.d(this.f17164t.b().q());
            this.f17136C.d(this.f17164t.b().l());
            this.f17138E.c(new C5269a(this));
            this.f17139F.c(new C5270b(this));
            this.f17140G.c(new C5271c(this));
        } catch (RuntimeException e10) {
            if (runnable != null) {
                runnable.run();
            }
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public void c0(Matrix matrix) {
        p.a();
        f.a aVar = this.f17154j;
        if (aVar != null && aVar.b() == 1) {
            this.f17154j.c(matrix);
        }
    }

    public void d0() {
        C5298a q10 = q();
        if (q10 == null) {
            C4391e0.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            this.f17149e.G0(f17133L);
            return;
        }
        this.f17149e.G0(q10.b());
        C4391e0.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + q10.a().name());
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission", "WrongConstant"})
    public void e(p0.c cVar, J0 j02) {
        p.a();
        if (this.f17167w != cVar) {
            this.f17167w = cVar;
            this.f17147c.o0(cVar);
        }
        boolean z10 = this.f17166v == null || s(j02) != s(this.f17166v);
        this.f17166v = j02;
        U();
        if (z10) {
            X();
        }
        S();
    }

    public void f() {
        p.a();
        f.a aVar = this.f17154j;
        this.f17152h = null;
        this.f17154j = null;
        this.f17155k.e0();
        I(aVar, (f.a) null);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        p.a();
        s sVar = this.f17165u;
        if (sVar != null) {
            sVar.c(this.f17147c, this.f17149e, this.f17155k, this.f17157m);
        }
        this.f17147c.o0((p0.c) null);
        this.f17164t = null;
        this.f17167w = null;
        this.f17166v = null;
        V();
    }

    /* access modifiers changed from: protected */
    public I0 l() {
        if (!v()) {
            C4391e0.a("CameraController", "Camera not initialized.");
            return null;
        } else if (!y()) {
            C4391e0.a("CameraController", "PreviewView not attached to CameraController.");
            return null;
        } else {
            I0.a b10 = new I0.a().b(this.f17147c);
            if (x()) {
                b10.b(this.f17149e);
            } else {
                this.f17165u.c(this.f17149e);
            }
            if (w()) {
                b10.b(this.f17155k);
            } else {
                this.f17165u.c(this.f17155k);
            }
            if (B()) {
                b10.b(this.f17157m);
            } else {
                this.f17165u.c(this.f17157m);
            }
            b10.e(this.f17166v);
            for (C4404l a10 : this.f17141H) {
                b10.a(a10);
            }
            return b10.c();
        }
    }

    public C10101e<Void> n(boolean z10) {
        p.a();
        return !u() ? this.f17138E.d(Boolean.valueOf(z10)) : this.f17164t.a().i(z10);
    }

    public int o() {
        p.a();
        return this.f17149e.n0();
    }

    public int p() {
        p.a();
        return this.f17149e.m0();
    }

    public C5298a q() {
        Map<C5298a.C0372a, C5298a> map = this.f17144K;
        C5298a.C0372a aVar = C5298a.C0372a.SCREEN_FLASH_VIEW;
        if (map.get(aVar) != null) {
            return this.f17144K.get(aVar);
        }
        Map<C5298a.C0372a, C5298a> map2 = this.f17144K;
        C5298a.C0372a aVar2 = C5298a.C0372a.PREVIEW_VIEW;
        if (map2.get(aVar2) != null) {
            return this.f17144K.get(aVar2);
        }
        return null;
    }

    public F<K0> t() {
        p.a();
        return this.f17135B;
    }

    public boolean w() {
        p.a();
        return A(2);
    }

    public boolean x() {
        p.a();
        return A(1);
    }

    public boolean z() {
        p.a();
        return false;
    }

    C5063c(Context context, C10101e<s> eVar) {
        this.f17145a = C4409q.f5395d;
        this.f17146b = 3;
        this.f17158n = new HashMap();
        this.f17159o = V.B.f14237h0;
        this.f17160p = 0;
        C4417z zVar = C4417z.f5464c;
        this.f17161q = zVar;
        this.f17162r = zVar;
        this.f17163s = c1.f16864a;
        this.f17170z = true;
        this.f17134A = true;
        this.f17135B = new C5065e<>();
        this.f17136C = new C5065e<>();
        this.f17137D = new K<>(0);
        this.f17138E = new h<>();
        this.f17139F = new h<>();
        this.f17140G = new h<>();
        this.f17141H = new HashSet();
        this.f17144K = new HashMap();
        Context a10 = e.a(context);
        this.f17142I = a10;
        this.f17147c = k();
        this.f17149e = j((Integer) null);
        this.f17155k = i((Integer) null, (Integer) null, (Integer) null);
        this.f17157m = m();
        this.f17143J = n.G(eVar, new C5062b(this), H.a.d());
        this.f17168x = new u(a10);
        this.f17169y = new d0.e(this);
    }
}
