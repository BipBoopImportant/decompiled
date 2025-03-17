package androidx.media3.exoplayer;

import A3.C6298a;
import A3.v1;
import C3.t;
import G3.C6477A;
import G3.C6478B;
import G3.C6479C;
import G3.C6503x;
import G3.C6504y;
import G3.C6505z;
import G3.J;
import G3.c0;
import J3.C6569b;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q3.w;
import t3.C5950a;
import t3.C5962m;
import t3.N;
import t3.q;
import w3.C;
import z3.C6278a;

final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f22820a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f22821b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<C6478B, c> f22822c = new IdentityHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Object, c> f22823d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final d f22824e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<c, b> f22825f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<c> f22826g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C6298a f22827h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C5962m f22828i;

    /* renamed from: j  reason: collision with root package name */
    private c0 f22829j = new c0.a(0);

    /* renamed from: k  reason: collision with root package name */
    private boolean f22830k;

    /* renamed from: l  reason: collision with root package name */
    private C f22831l;

    private final class a implements J, t {

        /* renamed from: a  reason: collision with root package name */
        private final c f22832a;

        public a(c cVar) {
            this.f22832a = cVar;
        }

        private Pair<Integer, C6479C.b> G(int i10, C6479C.b bVar) {
            C6479C.b bVar2 = null;
            if (bVar != null) {
                C6479C.b c10 = q0.n(this.f22832a, bVar);
                if (c10 == null) {
                    return null;
                }
                bVar2 = c10;
            }
            return Pair.create(Integer.valueOf(q0.s(this.f22832a, i10)), bVar2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void I(Pair pair, C6477A a10) {
            q0.this.f22827h.L(((Integer) pair.first).intValue(), (C6479C.b) pair.second, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void N(Pair pair) {
            q0.this.f22827h.j0(((Integer) pair.first).intValue(), (C6479C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void O(Pair pair) {
            q0.this.f22827h.P(((Integer) pair.first).intValue(), (C6479C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Q(Pair pair) {
            q0.this.f22827h.m0(((Integer) pair.first).intValue(), (C6479C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void S(Pair pair, int i10) {
            q0.this.f22827h.k0(((Integer) pair.first).intValue(), (C6479C.b) pair.second, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void T(Pair pair, Exception exc) {
            q0.this.f22827h.h0(((Integer) pair.first).intValue(), (C6479C.b) pair.second, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void V(Pair pair) {
            q0.this.f22827h.i0(((Integer) pair.first).intValue(), (C6479C.b) pair.second);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void W(Pair pair, C6503x xVar, C6477A a10) {
            q0.this.f22827h.U(((Integer) pair.first).intValue(), (C6479C.b) pair.second, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void X(Pair pair, C6503x xVar, C6477A a10) {
            q0.this.f22827h.K(((Integer) pair.first).intValue(), (C6479C.b) pair.second, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Y(Pair pair, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
            q0.this.f22827h.R(((Integer) pair.first).intValue(), (C6479C.b) pair.second, xVar, a10, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Z(Pair pair, C6503x xVar, C6477A a10) {
            q0.this.f22827h.C(((Integer) pair.first).intValue(), (C6479C.b) pair.second, xVar, a10);
        }

        public void C(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new h0(this, G10, xVar, a10));
            }
        }

        public void K(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new j0(this, G10, xVar, a10));
            }
        }

        public void L(int i10, C6479C.b bVar, C6477A a10) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new i0(this, G10, a10));
            }
        }

        public void P(int i10, C6479C.b bVar) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new o0(this, G10));
            }
        }

        public void R(int i10, C6479C.b bVar, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new k0(this, G10, xVar, a10, iOException, z10));
            }
        }

        public void U(int i10, C6479C.b bVar, C6503x xVar, C6477A a10) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new f0(this, G10, xVar, a10));
            }
        }

        public void h0(int i10, C6479C.b bVar, Exception exc) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new l0(this, G10, exc));
            }
        }

        public void i0(int i10, C6479C.b bVar) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new m0(this, G10));
            }
        }

        public void j0(int i10, C6479C.b bVar) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new g0(this, G10));
            }
        }

        public void k0(int i10, C6479C.b bVar, int i11) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new n0(this, G10, i11));
            }
        }

        public void m0(int i10, C6479C.b bVar) {
            Pair<Integer, C6479C.b> G10 = G(i10, bVar);
            if (G10 != null) {
                q0.this.f22828i.h(new p0(this, G10));
            }
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final C6479C f22834a;

        /* renamed from: b  reason: collision with root package name */
        public final C6479C.c f22835b;

        /* renamed from: c  reason: collision with root package name */
        public final a f22836c;

        public b(C6479C c10, C6479C.c cVar, a aVar) {
            this.f22834a = c10;
            this.f22835b = cVar;
            this.f22836c = aVar;
        }
    }

    static final class c implements d0 {

        /* renamed from: a  reason: collision with root package name */
        public final C6505z f22837a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f22838b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<C6479C.b> f22839c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f22840d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22841e;

        public c(C6479C c10, boolean z10) {
            this.f22837a = new C6505z(c10, z10);
        }

        public Object a() {
            return this.f22838b;
        }

        public q3.J b() {
            return this.f22837a.V();
        }

        public void c(int i10) {
            this.f22840d = i10;
            this.f22841e = false;
            this.f22839c.clear();
        }
    }

    public interface d {
        void c();
    }

    public q0(d dVar, C6298a aVar, C5962m mVar, v1 v1Var) {
        this.f22820a = v1Var;
        this.f22824e = dVar;
        this.f22827h = aVar;
        this.f22828i = mVar;
        this.f22825f = new HashMap<>();
        this.f22826g = new HashSet();
    }

    private void C(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f22821b.remove(i12);
            this.f22823d.remove(remove.f22838b);
            g(i12, -remove.f22837a.V().p());
            remove.f22841e = true;
            if (this.f22830k) {
                v(remove);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f22821b.size()) {
            this.f22821b.get(i10).f22840d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f22825f.get(cVar);
        if (bVar != null) {
            bVar.f22834a.d(bVar.f22835b);
        }
    }

    private void k() {
        Iterator<c> it = this.f22826g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f22839c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f22826g.add(cVar);
        b bVar = this.f22825f.get(cVar);
        if (bVar != null) {
            bVar.f22834a.p(bVar.f22835b);
        }
    }

    private static Object m(Object obj) {
        return C6278a.v(obj);
    }

    /* access modifiers changed from: private */
    public static C6479C.b n(c cVar, C6479C.b bVar) {
        for (int i10 = 0; i10 < cVar.f22839c.size(); i10++) {
            if (cVar.f22839c.get(i10).f35623d == bVar.f35623d) {
                return bVar.a(p(cVar, bVar.f35620a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return C6278a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return C6278a.y(cVar.f22838b, obj);
    }

    /* access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f22840d;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(C6479C c10, q3.J j10) {
        this.f22824e.c();
    }

    private void v(c cVar) {
        if (cVar.f22841e && cVar.f22839c.isEmpty()) {
            b bVar = (b) C5950a.e(this.f22825f.remove(cVar));
            bVar.f22834a.b(bVar.f22835b);
            bVar.f22834a.h(bVar.f22836c);
            bVar.f22834a.c(bVar.f22836c);
            this.f22826g.remove(cVar);
        }
    }

    private void y(c cVar) {
        C6505z zVar = cVar.f22837a;
        e0 e0Var = new e0(this);
        a aVar = new a(cVar);
        this.f22825f.put(cVar, new b(zVar, e0Var, aVar));
        zVar.g(N.C(), aVar);
        zVar.n(N.C(), aVar);
        zVar.f(e0Var, this.f22831l, this.f22820a);
    }

    public void A(C6478B b10) {
        c cVar = (c) C5950a.e(this.f22822c.remove(b10));
        cVar.f22837a.o(b10);
        cVar.f22839c.remove(((C6504y) b10).f36007a);
        if (!this.f22822c.isEmpty()) {
            k();
        }
        v(cVar);
    }

    public q3.J B(int i10, int i11, c0 c0Var) {
        C5950a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f22829j = c0Var;
        C(i10, i11);
        return i();
    }

    public q3.J D(List<c> list, c0 c0Var) {
        C(0, this.f22821b.size());
        return f(this.f22821b.size(), list, c0Var);
    }

    public q3.J E(c0 c0Var) {
        int r10 = r();
        if (c0Var.getLength() != r10) {
            c0Var = c0Var.e().g(0, r10);
        }
        this.f22829j = c0Var;
        return i();
    }

    public q3.J F(int i10, int i11, List<w> list) {
        boolean z10 = false;
        C5950a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        if (list.size() == i11 - i10) {
            z10 = true;
        }
        C5950a.a(z10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.f22821b.get(i12).f22837a.l(list.get(i12 - i10));
        }
        return i();
    }

    public q3.J f(int i10, List<c> list, c0 c0Var) {
        if (!list.isEmpty()) {
            this.f22829j = c0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f22821b.get(i11 - 1);
                    cVar.c(cVar2.f22840d + cVar2.f22837a.V().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f22837a.V().p());
                this.f22821b.add(i11, cVar);
                this.f22823d.put(cVar.f22838b, cVar);
                if (this.f22830k) {
                    y(cVar);
                    if (this.f22822c.isEmpty()) {
                        this.f22826g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public C6478B h(C6479C.b bVar, C6569b bVar2, long j10) {
        Object o10 = o(bVar.f35620a);
        C6479C.b a10 = bVar.a(m(bVar.f35620a));
        c cVar = (c) C5950a.e(this.f22823d.get(o10));
        l(cVar);
        cVar.f22839c.add(a10);
        C6504y S10 = cVar.f22837a.a(a10, bVar2, j10);
        this.f22822c.put(S10, cVar);
        k();
        return S10;
    }

    public q3.J i() {
        if (this.f22821b.isEmpty()) {
            return q3.J.f27893a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f22821b.size(); i11++) {
            c cVar = this.f22821b.get(i11);
            cVar.f22840d = i10;
            i10 += cVar.f22837a.V().p();
        }
        return new t0(this.f22821b, this.f22829j);
    }

    public c0 q() {
        return this.f22829j;
    }

    public int r() {
        return this.f22821b.size();
    }

    public boolean t() {
        return this.f22830k;
    }

    public q3.J w(int i10, int i11, int i12, c0 c0Var) {
        C5950a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f22829j = c0Var;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f22821b.get(min).f22840d;
        N.O0(this.f22821b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f22821b.get(min);
            cVar.f22840d = i13;
            i13 += cVar.f22837a.V().p();
            min++;
        }
        return i();
    }

    public void x(C c10) {
        C5950a.g(!this.f22830k);
        this.f22831l = c10;
        for (int i10 = 0; i10 < this.f22821b.size(); i10++) {
            c cVar = this.f22821b.get(i10);
            y(cVar);
            this.f22826g.add(cVar);
        }
        this.f22830k = true;
    }

    public void z() {
        for (b next : this.f22825f.values()) {
            try {
                next.f22834a.b(next.f22835b);
            } catch (RuntimeException e10) {
                q.d("MediaSourceList", "Failed to release child source.", e10);
            }
            next.f22834a.h(next.f22836c);
            next.f22834a.c(next.f22836c);
        }
        this.f22825f.clear();
        this.f22826g.clear();
        this.f22830k = false;
    }
}
