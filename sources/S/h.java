package S;

import C.C4389d0;
import C.C4404l;
import C.F;
import C.H0;
import G.p;
import G.q;
import H2.i;
import I.n;
import O.C4709t;
import O.N;
import O.W;
import P.d;
import P.o;
import P.r;
import Q.f;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ob.C10101e;

public class h extends H0 {

    /* renamed from: A  reason: collision with root package name */
    private N f12527A;

    /* renamed from: B  reason: collision with root package name */
    X0.b f12528B;

    /* renamed from: C  reason: collision with root package name */
    X0.b f12529C;

    /* renamed from: D  reason: collision with root package name */
    private X0.c f12530D;

    /* renamed from: q  reason: collision with root package name */
    private final j f12531q;

    /* renamed from: r  reason: collision with root package name */
    private final l f12532r;

    /* renamed from: s  reason: collision with root package name */
    private final C4389d0 f12533s;

    /* renamed from: t  reason: collision with root package name */
    private final C4389d0 f12534t;

    /* renamed from: u  reason: collision with root package name */
    private W f12535u;

    /* renamed from: v  reason: collision with root package name */
    private W f12536v;

    /* renamed from: w  reason: collision with root package name */
    private r f12537w;

    /* renamed from: x  reason: collision with root package name */
    private N f12538x;

    /* renamed from: y  reason: collision with root package name */
    private N f12539y;

    /* renamed from: z  reason: collision with root package name */
    private N f12540z;

    interface a {
        C10101e<Void> a(int i10, int i11);
    }

    public h(J j10, J j11, C4389d0 d0Var, C4389d0 d0Var2, Set<H0> set, p1 p1Var) {
        super(n0(set));
        this.f12531q = n0(set);
        this.f12533s = d0Var;
        this.f12534t = d0Var2;
        this.f12532r = new l(j10, j11, set, p1Var, new f(this));
    }

    private void c0(X0.b bVar, String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        X0.c cVar = this.f12530D;
        if (cVar != null) {
            cVar.b();
        }
        X0.c cVar2 = new X0.c(new g(this, str, str2, o1Var, c1Var, c1Var2));
        this.f12530D = cVar2;
        bVar.t(cVar2);
    }

    private void d0() {
        X0.c cVar = this.f12530D;
        if (cVar != null) {
            cVar.b();
            this.f12530D = null;
        }
        N n10 = this.f12538x;
        if (n10 != null) {
            n10.i();
            this.f12538x = null;
        }
        N n11 = this.f12539y;
        if (n11 != null) {
            n11.i();
            this.f12539y = null;
        }
        N n12 = this.f12540z;
        if (n12 != null) {
            n12.i();
            this.f12540z = null;
        }
        N n13 = this.f12527A;
        if (n13 != null) {
            n13.i();
            this.f12527A = null;
        }
        W w10 = this.f12536v;
        if (w10 != null) {
            w10.i();
            this.f12536v = null;
        }
        r rVar = this.f12537w;
        if (rVar != null) {
            rVar.f();
            this.f12537w = null;
        }
        W w11 = this.f12535u;
        if (w11 != null) {
            w11.i();
            this.f12535u = null;
        }
    }

    private List<X0> e0(String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        p.a();
        boolean z10 = false;
        if (c1Var2 == null) {
            f0(str, str2, o1Var, c1Var, (c1) null);
            J g10 = g();
            Objects.requireNonNull(g10);
            this.f12536v = s0(g10, c1Var);
            if (A() != null) {
                z10 = true;
            }
            Map<H0, f> A10 = this.f12532r.A(this.f12540z, y(), z10);
            W.c m10 = this.f12536v.m(W.b.c(this.f12540z, new ArrayList(A10.values())));
            HashMap hashMap = new HashMap();
            for (Map.Entry next : A10.entrySet()) {
                hashMap.put((H0) next.getKey(), (N) m10.get(next.getValue()));
            }
            this.f12532r.L(hashMap);
            return F.a(new Object[]{this.f12528B.o()});
        }
        f0(str, str2, o1Var, c1Var, c1Var2);
        g0(str, str2, o1Var, c1Var, c1Var2);
        this.f12537w = o0(g(), s(), c1Var, this.f12533s, this.f12534t);
        if (A() != null) {
            z10 = true;
        }
        Map<H0, d> B10 = this.f12532r.B(this.f12540z, this.f12527A, y(), z10);
        r.c i10 = this.f12537w.i(r.b.d(this.f12540z, this.f12527A, new ArrayList(B10.values())));
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next2 : B10.entrySet()) {
            hashMap2.put((H0) next2.getKey(), (N) i10.get(next2.getValue()));
        }
        this.f12532r.L(hashMap2);
        return F.a(new Object[]{this.f12528B.o(), this.f12529C.o()});
    }

    private void f0(String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        Matrix v10 = v();
        J g10 = g();
        Objects.requireNonNull(g10);
        boolean q10 = g10.q();
        Rect l02 = l0(c1Var.e());
        Objects.requireNonNull(l02);
        J g11 = g();
        Objects.requireNonNull(g11);
        int q11 = q(g11);
        J g12 = g();
        Objects.requireNonNull(g12);
        N n10 = new N(3, 34, c1Var, v10, q10, l02, q11, -1, C(g12));
        this.f12538x = n10;
        J g13 = g();
        Objects.requireNonNull(g13);
        this.f12540z = r0(n10, g13);
        o1<?> o1Var2 = o1Var;
        c1 c1Var3 = c1Var;
        X0.b h02 = h0(this.f12538x, o1Var2, c1Var3);
        this.f12528B = h02;
        c0(h02, str, str2, o1Var2, c1Var3, c1Var2);
    }

    private void g0(String str, String str2, o1<?> o1Var, c1 c1Var, c1 c1Var2) {
        Matrix v10 = v();
        J s10 = s();
        Objects.requireNonNull(s10);
        boolean q10 = s10.q();
        Rect l02 = l0(c1Var2.e());
        Objects.requireNonNull(l02);
        J s11 = s();
        Objects.requireNonNull(s11);
        int q11 = q(s11);
        J s12 = s();
        Objects.requireNonNull(s12);
        N n10 = new N(3, 34, c1Var2, v10, q10, l02, q11, -1, C(s12));
        this.f12539y = n10;
        J s13 = s();
        Objects.requireNonNull(s13);
        this.f12527A = r0(n10, s13);
        o1<?> o1Var2 = o1Var;
        c1 c1Var3 = c1Var2;
        X0.b h02 = h0(this.f12539y, o1Var2, c1Var3);
        this.f12529C = h02;
        c0(h02, str, str2, o1Var2, c1Var, c1Var3);
    }

    private X0.b h0(N n10, o1<?> o1Var, c1 c1Var) {
        X0.b q10 = X0.b.q(o1Var, c1Var.e());
        x0(q10);
        w0(c1Var.e(), q10);
        q10.m(n10.o(), c1Var.b(), (String) null, -1);
        q10.j(this.f12532r.D());
        if (c1Var.d() != null) {
            q10.g(c1Var.d());
        }
        return q10;
    }

    public static List<p1.b> i0(H0 h02) {
        ArrayList arrayList = new ArrayList();
        if (t0(h02)) {
            for (H0 j10 : ((h) h02).k0()) {
                arrayList.add(j10.j().getCaptureType());
            }
        } else {
            arrayList.add(h02.j().getCaptureType());
        }
        return arrayList;
    }

    private static int j0(H0 h02) {
        return h02.j().K().p();
    }

    private Rect l0(Size size) {
        return A() != null ? A() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    private Rect m0(N n10) {
        return ((C4404l) i.g(l())).h() == 1 ? q.r(n10.s().e()) : n10.n();
    }

    private static j n0(Set<H0> set) {
        D0 a10 = new i().a();
        a10.q(C5044r0.f17008l, 34);
        ArrayList arrayList = new ArrayList();
        for (H0 next : set) {
            if (next.j().b(o1.f16978F)) {
                arrayList.add(next.j().getCaptureType());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        a10.q(j.f12542J, arrayList);
        a10.q(C5046s0.f17013q, 2);
        return new j(J0.Z(a10));
    }

    private r o0(J j10, J j11, c1 c1Var, C4389d0 d0Var, C4389d0 d0Var2) {
        return new r(j10, j11, o.a.a(c1Var.b(), d0Var, d0Var2));
    }

    private boolean p0() {
        if (((C4404l) i.g(l())).h() != 1) {
            return false;
        }
        J j10 = (J) i.g(g());
        return j10.m() && j10.q();
    }

    private int q0() {
        if (((C4404l) i.g(l())).h() == 1) {
            return q((J) i.g(g()));
        }
        return 0;
    }

    private N r0(N n10, J j10) {
        if (l() == null || l().h() == 2 || l().e() == 1) {
            return n10;
        }
        this.f12535u = new W(j10, l().a());
        int q02 = q0();
        Rect m02 = m0(n10);
        f i10 = f.i(n10.t(), n10.p(), m02, q.f(m02, q02), q02, p0(), true);
        N n11 = (N) this.f12535u.m(W.b.c(n10, Collections.singletonList(i10))).get(i10);
        Objects.requireNonNull(n11);
        return n11;
    }

    private W s0(J j10, c1 c1Var) {
        if (l() == null || l().e() != 1) {
            return new W(j10, C4709t.a.a(c1Var.b()));
        }
        W w10 = new W(j10, l().a());
        this.f12535u = w10;
        return w10;
    }

    public static boolean t0(H0 h02) {
        return h02 instanceof h;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u0(String str, String str2, o1 o1Var, c1 c1Var, c1 c1Var2, X0 x02, X0.g gVar) {
        if (g() != null) {
            d0();
            X(e0(str, str2, o1Var, c1Var, c1Var2));
            G();
            this.f12532r.J();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C10101e v0(int i10, int i11) {
        W w10 = this.f12536v;
        return w10 != null ? w10.e().b(i10, i11) : n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void w0(Size size, X0.b bVar) {
        for (H0 j10 : k0()) {
            X0 o10 = X0.b.q(j10.j(), size).o();
            bVar.c(o10.j());
            bVar.a(o10.n());
            bVar.d(o10.l());
            bVar.b(o10.c());
            bVar.g(o10.f());
        }
    }

    private void x0(X0.b bVar) {
        int i10 = -1;
        for (H0 j02 : k0()) {
            i10 = X0.e(i10, j0(j02));
        }
        if (i10 != -1) {
            bVar.z(i10);
        }
    }

    public void J() {
        super.J();
        this.f12532r.n();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [C.A, androidx.camera.core.impl.o1$a<?, ?, ?>, androidx.camera.core.impl.o1$a] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.o1<?> L(androidx.camera.core.impl.I r2, androidx.camera.core.impl.o1.a<?, ?, ?> r3) {
        /*
            r1 = this;
            S.l r2 = r1.f12532r
            androidx.camera.core.impl.D0 r0 = r3.a()
            r2.G(r0)
            androidx.camera.core.impl.o1 r2 = r3.e()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S.h.L(androidx.camera.core.impl.I, androidx.camera.core.impl.o1$a):androidx.camera.core.impl.o1");
    }

    public void M() {
        super.M();
        this.f12532r.H();
    }

    public void N() {
        super.N();
        this.f12532r.I();
    }

    /* access modifiers changed from: protected */
    public c1 O(X x10) {
        this.f12528B.g(x10);
        X(F.a(new Object[]{this.f12528B.o()}));
        return e().g().d(x10).a();
    }

    /* access modifiers changed from: protected */
    public c1 P(c1 c1Var, c1 c1Var2) {
        X(e0(i(), t(), j(), c1Var, c1Var2));
        E();
        return c1Var;
    }

    public void Q() {
        super.Q();
        d0();
        this.f12532r.N();
    }

    public o1<?> k(boolean z10, p1 p1Var) {
        X a10 = p1Var.a(this.f12531q.getCaptureType(), 1);
        if (z10) {
            a10 = X.O(a10, this.f12531q.getConfig());
        }
        if (a10 == null) {
            return null;
        }
        return z(a10).e();
    }

    public Set<H0> k0() {
        return this.f12532r.z();
    }

    public Set<Integer> x() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public o1.a<?, ?, ?> z(X x10) {
        return new i(E0.c0(x10));
    }
}
