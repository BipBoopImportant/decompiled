package S;

import C.C4417z;
import C.H0;
import C.U;
import C.p0;
import G.p;
import G.q;
import H2.i;
import O.N;
import P.d;
import Q.f;
import S.h;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.C5019e0;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5044r0;
import androidx.camera.core.impl.C5046s0;
import androidx.camera.core.impl.C5059z;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class l implements H0.b {

    /* renamed from: a  reason: collision with root package name */
    final Set<H0> f12548a;

    /* renamed from: b  reason: collision with root package name */
    final Map<H0, N> f12549b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<H0, k> f12550c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Map<H0, Boolean> f12551d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final p1 f12552e;

    /* renamed from: f  reason: collision with root package name */
    private final J f12553f;

    /* renamed from: g  reason: collision with root package name */
    private final J f12554g;

    /* renamed from: h  reason: collision with root package name */
    private final C5040p f12555h = t();

    /* renamed from: i  reason: collision with root package name */
    private final Set<o1<?>> f12556i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<H0, o1<?>> f12557j;

    /* renamed from: k  reason: collision with root package name */
    private final b f12558k;

    /* renamed from: l  reason: collision with root package name */
    private b f12559l;

    class a extends C5040p {
        a() {
        }

        public void b(int i10, C5059z zVar) {
            super.b(i10, zVar);
            for (H0 w10 : l.this.f12548a) {
                l.K(zVar, w10.w(), i10);
            }
        }
    }

    l(J j10, J j11, Set<H0> set, p1 p1Var, h.a aVar) {
        this.f12553f = j10;
        this.f12554g = j11;
        this.f12552e = p1Var;
        this.f12548a = set;
        Map<H0, o1<?>> M10 = M(j10, set, p1Var);
        this.f12557j = M10;
        HashSet hashSet = new HashSet(M10.values());
        this.f12556i = hashSet;
        this.f12558k = new b(j10, hashSet);
        if (j11 != null) {
            this.f12559l = new b(j11, hashSet);
        }
        for (H0 next : set) {
            this.f12551d.put(next, Boolean.FALSE);
            this.f12550c.put(next, new k(j10, this, aVar));
        }
    }

    private static int C(Set<o1<?>> set) {
        int i10 = 0;
        for (o1<?> A10 : set) {
            i10 = Math.max(i10, A10.A(0));
        }
        return i10;
    }

    private N E(H0 h02) {
        N n10 = this.f12549b.get(h02);
        Objects.requireNonNull(n10);
        return n10;
    }

    private boolean F(H0 h02) {
        Boolean bool = this.f12551d.get(h02);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    static void K(C5059z zVar, X0 x02, int i10) {
        for (C5040p b10 : x02.j()) {
            b10.b(i10, new m(x02.k().j(), zVar));
        }
    }

    private static Map<H0, o1<?>> M(J j10, Set<H0> set, p1 p1Var) {
        HashMap hashMap = new HashMap();
        for (H0 next : set) {
            hashMap.put(next, next.D(j10.j(), (o1<?>) null, next.k(true, p1Var)));
        }
        return hashMap;
    }

    private f s(H0 h02, b bVar, J j10, N n10, int i10, boolean z10) {
        int o10 = j10.b().o(i10);
        boolean l10 = q.l(n10.r());
        o1 o1Var = this.f12557j.get(h02);
        Objects.requireNonNull(o1Var);
        Pair<Rect, Size> s10 = bVar.s(o1Var, n10.n(), q.g(n10.r()), z10);
        int w10 = w(h02, this.f12553f);
        k kVar = this.f12550c.get(h02);
        Objects.requireNonNull(kVar);
        kVar.n(w10);
        int w11 = q.w((n10.q() + w10) - o10);
        return f.h(y(h02), v(h02), (Rect) s10.first, q.q((Size) s10.second, w11), w11, h02.C(j10) ^ l10);
    }

    private static void u(N n10, C5019e0 e0Var, X0 x02) {
        n10.v();
        try {
            n10.C(e0Var);
        } catch (C5019e0.a unused) {
            if (x02.d() != null) {
                x02.d().a(x02, X0.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    private static int v(H0 h02) {
        return h02 instanceof U ? 256 : 34;
    }

    private int w(H0 h02, J j10) {
        return j10.b().o(((C5046s0) h02.j()).E(0));
    }

    static C5019e0 x(H0 h02) {
        List<C5019e0> o10 = h02 instanceof U ? h02.w().o() : h02.w().k().i();
        i.i(o10.size() <= 1);
        if (o10.size() == 1) {
            return o10.get(0);
        }
        return null;
    }

    private static int y(H0 h02) {
        if (h02 instanceof p0) {
            return 1;
        }
        return h02 instanceof U ? 4 : 2;
    }

    /* access modifiers changed from: package-private */
    public Map<H0, f> A(N n10, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        for (H0 next : this.f12548a) {
            hashMap.put(next, s(next, this.f12558k, this.f12553f, n10, i10, z10));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public Map<H0, d> B(N n10, N n11, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        for (H0 next : this.f12548a) {
            H0 h02 = next;
            int i11 = i10;
            boolean z11 = z10;
            f s10 = s(h02, this.f12558k, this.f12553f, n10, i11, z11);
            b bVar = this.f12559l;
            J j10 = this.f12554g;
            Objects.requireNonNull(j10);
            hashMap.put(next, d.c(s10, s(h02, bVar, j10, n11, i11, z11)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public C5040p D() {
        return this.f12555h;
    }

    /* access modifiers changed from: package-private */
    public void G(D0 d02) {
        d02.q(C5046s0.f17019w, this.f12558k.o(d02));
        d02.q(o1.f16974B, Integer.valueOf(C(this.f12556i)));
        C4417z d10 = a.d(this.f12556i);
        if (d10 != null) {
            d02.q(C5044r0.f17009m, d10);
            for (H0 next : this.f12548a) {
                if (next.j().w() != 0) {
                    d02.q(o1.f16980H, Integer.valueOf(next.j().w()));
                }
                if (next.j().D() != 0) {
                    d02.q(o1.f16979G, Integer.valueOf(next.j().D()));
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
    }

    /* access modifiers changed from: package-private */
    public void H() {
        for (H0 next : this.f12548a) {
            next.M();
            next.K();
        }
    }

    /* access modifiers changed from: package-private */
    public void I() {
        for (H0 N10 : this.f12548a) {
            N10.N();
        }
    }

    /* access modifiers changed from: package-private */
    public void J() {
        p.a();
        for (H0 c10 : this.f12548a) {
            c(c10);
        }
    }

    /* access modifiers changed from: package-private */
    public void L(Map<H0, N> map) {
        this.f12549b.clear();
        this.f12549b.putAll(map);
        for (Map.Entry next : this.f12549b.entrySet()) {
            H0 h02 = (H0) next.getKey();
            N n10 = (N) next.getValue();
            h02.V(n10.n());
            h02.T(n10.r());
            h02.Y(n10.s(), (c1) null);
            h02.H();
        }
    }

    /* access modifiers changed from: package-private */
    public void N() {
        for (H0 next : this.f12548a) {
            k kVar = this.f12550c.get(next);
            Objects.requireNonNull(kVar);
            next.W(kVar);
        }
    }

    public void c(H0 h02) {
        C5019e0 x10;
        p.a();
        N E10 = E(h02);
        if (F(h02) && (x10 = x(h02)) != null) {
            u(E10, x10, h02.w());
        }
    }

    public void e(H0 h02) {
        p.a();
        if (F(h02)) {
            this.f12551d.put(h02, Boolean.FALSE);
            E(h02).m();
        }
    }

    public void k(H0 h02) {
        p.a();
        if (!F(h02)) {
            this.f12551d.put(h02, Boolean.TRUE);
            C5019e0 x10 = x(h02);
            if (x10 != null) {
                u(E(h02), x10, h02.w());
            }
        }
    }

    public void l(H0 h02) {
        p.a();
        if (F(h02)) {
            N E10 = E(h02);
            C5019e0 x10 = x(h02);
            if (x10 != null) {
                u(E10, x10, h02.w());
            } else {
                E10.m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        for (H0 next : this.f12548a) {
            k kVar = this.f12550c.get(next);
            Objects.requireNonNull(kVar);
            next.b(kVar, (J) null, (o1<?>) null, next.k(true, this.f12552e));
        }
    }

    /* access modifiers changed from: package-private */
    public C5040p t() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public Set<H0> z() {
        return this.f12548a;
    }
}
