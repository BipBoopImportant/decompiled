package C;

import G.q;
import H2.i;
import J.m;
import N.e;
import O.a0;
import R.c;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class H0 {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f5228a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Object f5229b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private a f5230c = a.INACTIVE;

    /* renamed from: d  reason: collision with root package name */
    private o1<?> f5231d;

    /* renamed from: e  reason: collision with root package name */
    private o1<?> f5232e;

    /* renamed from: f  reason: collision with root package name */
    private o1<?> f5233f;

    /* renamed from: g  reason: collision with root package name */
    private c1 f5234g;

    /* renamed from: h  reason: collision with root package name */
    private o1<?> f5235h;

    /* renamed from: i  reason: collision with root package name */
    private Rect f5236i;

    /* renamed from: j  reason: collision with root package name */
    private Matrix f5237j = new Matrix();

    /* renamed from: k  reason: collision with root package name */
    private J f5238k;

    /* renamed from: l  reason: collision with root package name */
    private J f5239l;

    /* renamed from: m  reason: collision with root package name */
    private C4404l f5240m;

    /* renamed from: n  reason: collision with root package name */
    private String f5241n;

    /* renamed from: o  reason: collision with root package name */
    private X0 f5242o = X0.b();

    /* renamed from: p  reason: collision with root package name */
    private X0 f5243p = X0.b();

    enum a {
        ACTIVE,
        INACTIVE
    }

    public interface b {
        void c(H0 h02);

        void e(H0 h02);

        void k(H0 h02);

        void l(H0 h02);
    }

    protected H0(o1<?> o1Var) {
        this.f5232e = o1Var;
        this.f5233f = o1Var;
    }

    private void R(b bVar) {
        this.f5228a.remove(bVar);
    }

    private void a(b bVar) {
        this.f5228a.add(bVar);
    }

    public Rect A() {
        return this.f5236i;
    }

    public boolean B(int i10) {
        for (Integer intValue : x()) {
            if (a0.e(i10, intValue.intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean C(J j10) {
        int n10 = n();
        if (n10 == -1 || n10 == 0) {
            return false;
        }
        if (n10 == 1) {
            return true;
        }
        if (n10 == 2) {
            return j10.m();
        }
        throw new AssertionError("Unknown mirrorMode: " + n10);
    }

    public o1<?> D(I i10, o1<?> o1Var, o1<?> o1Var2) {
        E0 e02;
        if (o1Var2 != null) {
            e02 = E0.c0(o1Var2);
            e02.d0(m.f8789b);
        } else {
            e02 = E0.b0();
        }
        if (this.f5232e.b(C5046s0.f17010n) || this.f5232e.b(C5046s0.f17014r)) {
            X.a<c> aVar = C5046s0.f17018v;
            if (e02.b(aVar)) {
                e02.d0(aVar);
            }
        }
        o1<?> o1Var3 = this.f5232e;
        X.a<c> aVar2 = C5046s0.f17018v;
        if (o1Var3.b(aVar2)) {
            X.a<Size> aVar3 = C5046s0.f17016t;
            if (e02.b(aVar3) && ((c) this.f5232e.a(aVar2)).d() != null) {
                e02.d0(aVar3);
            }
        }
        for (X.a<?> F10 : this.f5232e.e()) {
            X.F(e02, e02, this.f5232e, F10);
        }
        if (o1Var != null) {
            for (X.a next : o1Var.e()) {
                if (!next.c().equals(m.f8789b.c())) {
                    X.F(e02, e02, o1Var, next);
                }
            }
        }
        if (e02.b(C5046s0.f17014r)) {
            X.a<Integer> aVar4 = C5046s0.f17010n;
            if (e02.b(aVar4)) {
                e02.d0(aVar4);
            }
        }
        X.a<c> aVar5 = C5046s0.f17018v;
        if (e02.b(aVar5) && ((c) e02.a(aVar5)).a() != 0) {
            e02.q(o1.f16976D, Boolean.TRUE);
        }
        return L(i10, z(e02));
    }

    /* access modifiers changed from: protected */
    public final void E() {
        this.f5230c = a.ACTIVE;
        H();
    }

    /* access modifiers changed from: protected */
    public final void F() {
        this.f5230c = a.INACTIVE;
        H();
    }

    /* access modifiers changed from: protected */
    public final void G() {
        for (b c10 : this.f5228a) {
            c10.c(this);
        }
    }

    public final void H() {
        int ordinal = this.f5230c.ordinal();
        if (ordinal == 0) {
            for (b k10 : this.f5228a) {
                k10.k(this);
            }
        } else if (ordinal == 1) {
            for (b e10 : this.f5228a) {
                e10.e(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void I() {
        for (b l10 : this.f5228a) {
            l10.l(this);
        }
    }

    public void J() {
    }

    public void K() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.o1<?> L(androidx.camera.core.impl.I r1, androidx.camera.core.impl.o1.a<?, ?, ?> r2) {
        /*
            r0 = this;
            androidx.camera.core.impl.o1 r1 = r2.e()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C.H0.L(androidx.camera.core.impl.I, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    public void M() {
    }

    public void N() {
    }

    /* access modifiers changed from: protected */
    public c1 O(X x10) {
        c1 c1Var = this.f5234g;
        if (c1Var != null) {
            return c1Var.g().d(x10).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    /* access modifiers changed from: protected */
    public c1 P(c1 c1Var, c1 c1Var2) {
        return c1Var;
    }

    public void Q() {
    }

    public void S(C4404l lVar) {
        i.a(lVar == null || B(lVar.g()));
        this.f5240m = lVar;
    }

    public void T(Matrix matrix) {
        this.f5237j = new Matrix(matrix);
    }

    /* access modifiers changed from: protected */
    public boolean U(int i10) {
        int E10 = ((C5046s0) j()).E(-1);
        if (E10 != -1 && E10 == i10) {
            return false;
        }
        o1.a z10 = z(this.f5232e);
        e.a(z10, i10);
        this.f5232e = z10.e();
        J g10 = g();
        if (g10 == null) {
            this.f5233f = this.f5232e;
            return true;
        }
        this.f5233f = D(g10.j(), this.f5231d, this.f5235h);
        return true;
    }

    public void V(Rect rect) {
        this.f5236i = rect;
    }

    public final void W(J j10) {
        Q();
        synchronized (this.f5229b) {
            try {
                J j11 = this.f5238k;
                if (j10 == j11) {
                    R(j11);
                    this.f5238k = null;
                }
                J j12 = this.f5239l;
                if (j10 == j12) {
                    R(j12);
                    this.f5239l = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f5234g = null;
        this.f5236i = null;
        this.f5233f = this.f5232e;
        this.f5231d = null;
        this.f5235h = null;
    }

    /* access modifiers changed from: protected */
    public void X(List<X0> list) {
        if (!list.isEmpty()) {
            this.f5242o = list.get(0);
            if (list.size() > 1) {
                this.f5243p = list.get(1);
            }
            for (X0 o10 : list) {
                for (C5019e0 next : o10.o()) {
                    if (next.g() == null) {
                        next.s(getClass());
                    }
                }
            }
        }
    }

    public void Y(c1 c1Var, c1 c1Var2) {
        this.f5234g = P(c1Var, c1Var2);
    }

    public void Z(X x10) {
        this.f5234g = O(x10);
    }

    @SuppressLint({"WrongConstant"})
    public final void b(J j10, J j11, o1<?> o1Var, o1<?> o1Var2) {
        synchronized (this.f5229b) {
            try {
                this.f5238k = j10;
                this.f5239l = j11;
                a(j10);
                if (j11 != null) {
                    a(j11);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f5231d = o1Var;
        this.f5235h = o1Var2;
        this.f5233f = D(j10.j(), this.f5231d, this.f5235h);
        J();
    }

    /* access modifiers changed from: protected */
    public o1<?> c() {
        return this.f5232e;
    }

    /* access modifiers changed from: protected */
    public int d() {
        return ((C5046s0) this.f5233f).s(-1);
    }

    public c1 e() {
        return this.f5234g;
    }

    public Size f() {
        c1 c1Var = this.f5234g;
        if (c1Var != null) {
            return c1Var.e();
        }
        return null;
    }

    public J g() {
        J j10;
        synchronized (this.f5229b) {
            j10 = this.f5238k;
        }
        return j10;
    }

    /* access modifiers changed from: protected */
    public F h() {
        synchronized (this.f5229b) {
            try {
                J j10 = this.f5238k;
                if (j10 == null) {
                    F f10 = F.f16734a;
                    return f10;
                }
                F d10 = j10.d();
                return d10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public String i() {
        J g10 = g();
        return ((J) i.h(g10, "No camera attached to use case: " + this)).j().d();
    }

    public o1<?> j() {
        return this.f5233f;
    }

    public abstract o1<?> k(boolean z10, p1 p1Var);

    public C4404l l() {
        return this.f5240m;
    }

    public int m() {
        return this.f5233f.m();
    }

    /* access modifiers changed from: protected */
    public int n() {
        return ((C5046s0) this.f5233f).V(-1);
    }

    public String o() {
        o1<?> o1Var = this.f5233f;
        String t10 = o1Var.t("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(t10);
        return t10;
    }

    public String p() {
        return this.f5241n;
    }

    /* access modifiers changed from: protected */
    public int q(J j10) {
        return r(j10, false);
    }

    /* access modifiers changed from: protected */
    public int r(J j10, boolean z10) {
        int o10 = j10.j().o(y());
        return (j10.q() || !z10) ? o10 : q.w(-o10);
    }

    public J s() {
        J j10;
        synchronized (this.f5229b) {
            j10 = this.f5239l;
        }
        return j10;
    }

    /* access modifiers changed from: protected */
    public String t() {
        if (s() == null) {
            return null;
        }
        return s().j().d();
    }

    public X0 u() {
        return this.f5243p;
    }

    public Matrix v() {
        return this.f5237j;
    }

    public X0 w() {
        return this.f5242o;
    }

    /* access modifiers changed from: protected */
    public Set<Integer> x() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public int y() {
        return ((C5046s0) this.f5233f).E(0);
    }

    public abstract o1.a<?, ?, ?> z(X x10);
}
