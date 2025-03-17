package O;

import C.G0;
import C.v0;
import G.p;
import H2.i;
import I.n;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.c1;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ob.C10101e;

public class N {

    /* renamed from: a  reason: collision with root package name */
    private final int f9538a;

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f9539b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9540c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f9541d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9542e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9543f;

    /* renamed from: g  reason: collision with root package name */
    private final c1 f9544g;

    /* renamed from: h  reason: collision with root package name */
    private int f9545h;

    /* renamed from: i  reason: collision with root package name */
    private int f9546i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9547j = false;

    /* renamed from: k  reason: collision with root package name */
    private G0 f9548k;

    /* renamed from: l  reason: collision with root package name */
    private a f9549l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Runnable> f9550m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    private boolean f9551n = false;

    /* renamed from: o  reason: collision with root package name */
    private final List<H2.a<G0.h>> f9552o = new ArrayList();

    static class a extends C5019e0 {

        /* renamed from: o  reason: collision with root package name */
        final C10101e<Surface> f9553o = c.a(new L(this));

        /* renamed from: p  reason: collision with root package name */
        c.a<Surface> f9554p;

        /* renamed from: q  reason: collision with root package name */
        private C5019e0 f9555q;

        /* renamed from: r  reason: collision with root package name */
        private Q f9556r;

        a(Size size, int i10) {
            super(size, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object n(c.a aVar) {
            this.f9554p = aVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w() {
            Q q10 = this.f9556r;
            if (q10 != null) {
                q10.l();
            }
            if (this.f9555q == null) {
                this.f9554p.d();
            }
        }

        public void d() {
            super.d();
            p.d(new K(this));
        }

        /* access modifiers changed from: protected */
        public C10101e<Surface> r() {
            return this.f9553o;
        }

        /* access modifiers changed from: package-private */
        public boolean v() {
            p.a();
            return this.f9555q == null && !m();
        }

        public void x(Q q10) {
            i.j(this.f9556r == null, "Consumer can only be linked once.");
            this.f9556r = q10;
        }

        public boolean y(C5019e0 e0Var, Runnable runnable) {
            p.a();
            i.g(e0Var);
            C5019e0 e0Var2 = this.f9555q;
            boolean z10 = false;
            if (e0Var2 == e0Var) {
                return false;
            }
            i.j(e0Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            i.b(h().equals(e0Var.h()), String.format("The provider's size(%s) must match the parent(%s)", new Object[]{h(), e0Var.h()}));
            if (i() == e0Var.i()) {
                z10 = true;
            }
            i.b(z10, String.format("The provider's format(%s) must match the parent(%s)", new Object[]{Integer.valueOf(i()), Integer.valueOf(e0Var.i())}));
            i.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f9555q = e0Var;
            n.C(e0Var.j(), this.f9554p);
            e0Var.l();
            k().a(new M(e0Var), H.a.a());
            e0Var.f().a(runnable, H.a.d());
            return true;
        }
    }

    public N(int i10, int i11, c1 c1Var, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f9543f = i10;
        this.f9538a = i11;
        this.f9544g = c1Var;
        this.f9539b = matrix;
        this.f9540c = z10;
        this.f9541d = rect;
        this.f9546i = i12;
        this.f9545h = i13;
        this.f9542e = z11;
        this.f9549l = new a(c1Var.e(), i11);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (this.f9546i != i10) {
            this.f9546i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9545h != i11) {
            this.f9545h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            B();
        }
    }

    private void B() {
        p.a();
        G0.h g10 = G0.h.g(this.f9541d, this.f9546i, this.f9545h, u(), this.f9539b, this.f9542e);
        G0 g02 = this.f9548k;
        if (g02 != null) {
            g02.F(g10);
        }
        for (H2.a<G0.h> accept : this.f9552o) {
            accept.accept(g10);
        }
    }

    private void g() {
        i.j(!this.f9547j, "Consumer can only be linked once.");
        this.f9547j = true;
    }

    private void h() {
        i.j(!this.f9551n, "Edge is already closed.");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e x(a aVar, int i10, v0.a aVar2, v0.a aVar3, Surface surface) {
        i.g(surface);
        try {
            aVar.l();
            Q q10 = new Q(surface, t(), i10, this.f9544g.e(), aVar2, aVar3, this.f9539b);
            q10.g().a(new J(aVar), H.a.a());
            aVar.x(q10);
            return n.p(q10);
        } catch (C5019e0.a e10) {
            return n.n(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y() {
        if (!this.f9551n) {
            v();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z() {
        H.a.d().execute(new I(this));
    }

    public void C(C5019e0 e0Var) {
        p.a();
        h();
        a aVar = this.f9549l;
        Objects.requireNonNull(aVar);
        aVar.y(e0Var, new E(aVar));
    }

    public void D(int i10, int i11) {
        p.d(new G(this, i10, i11));
    }

    public void e(Runnable runnable) {
        p.a();
        h();
        this.f9550m.add(runnable);
    }

    public void f(H2.a<G0.h> aVar) {
        i.g(aVar);
        this.f9552o.add(aVar);
    }

    public final void i() {
        p.a();
        this.f9549l.d();
        this.f9551n = true;
    }

    public C10101e<v0> j(int i10, v0.a aVar, v0.a aVar2) {
        p.a();
        h();
        g();
        a aVar3 = this.f9549l;
        return n.H(aVar3.j(), new H(this, aVar3, i10, aVar, aVar2), H.a.d());
    }

    public G0 k(J j10) {
        return l(j10, true);
    }

    public G0 l(J j10, boolean z10) {
        p.a();
        h();
        G0 g02 = new G0(this.f9544g.e(), j10, z10, this.f9544g.b(), this.f9544g.c(), new D(this));
        try {
            C5019e0 m10 = g02.m();
            a aVar = this.f9549l;
            Objects.requireNonNull(aVar);
            if (aVar.y(m10, new E(aVar))) {
                C10101e<Void> k10 = aVar.k();
                Objects.requireNonNull(m10);
                k10.a(new F(m10), H.a.a());
            }
            this.f9548k = g02;
            B();
            return g02;
        } catch (C5019e0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            g02.G();
            throw e11;
        }
    }

    public final void m() {
        p.a();
        h();
        this.f9549l.d();
    }

    public Rect n() {
        return this.f9541d;
    }

    public C5019e0 o() {
        p.a();
        h();
        g();
        return this.f9549l;
    }

    public int p() {
        return this.f9538a;
    }

    public int q() {
        return this.f9546i;
    }

    public Matrix r() {
        return this.f9539b;
    }

    public c1 s() {
        return this.f9544g;
    }

    public int t() {
        return this.f9543f;
    }

    public boolean u() {
        return this.f9540c;
    }

    public void v() {
        p.a();
        h();
        if (!this.f9549l.v()) {
            this.f9547j = false;
            this.f9549l.d();
            this.f9549l = new a(this.f9544g.e(), this.f9538a);
            for (Runnable run : this.f9550m) {
                run.run();
            }
        }
    }

    public boolean w() {
        return this.f9542e;
    }
}
