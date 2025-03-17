package Uc;

import U0.C4857a;
import XH.C16807N;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oa.C8619c;
import qa.d;
import qa.e;
import qa.h;
import qa.k;
import qa.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"LUc/L;", "LU0/a;", "LUc/a0;", "Loa/c;", "map", "Lcom/google/android/gms/maps/MapView;", "mapView", "LUc/N;", "mapClickListeners", "<init>", "(Loa/c;Lcom/google/android/gms/maps/MapView;LUc/N;)V", "LXH/N;", "l", "()V", "", "index", "instance", "L", "(ILUc/a0;)V", "M", "from", "to", "count", "c", "(III)V", "b", "(II)V", "H", "d", "Loa/c;", "I", "()Loa/c;", "e", "Lcom/google/android/gms/maps/MapView;", "K", "()Lcom/google/android/gms/maps/MapView;", "f", "LUc/N;", "J", "()LUc/N;", "", "g", "Ljava/util/List;", "decorations", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class L extends C4857a<C9288a0> {

    /* renamed from: d  reason: collision with root package name */
    private final C8619c f64168d;

    /* renamed from: e  reason: collision with root package name */
    private final MapView f64169e;

    /* renamed from: f  reason: collision with root package name */
    private final N f64170f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final List<C9288a0> f64171g = new ArrayList();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Uc/L$a", "Loa/c$q;", "Lqa/h;", "marker", "LXH/N;", "c", "(Lqa/h;)V", "b", "a", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements C8619c.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L f64172a;

        a(L l10) {
            this.f64172a = l10;
        }

        /* access modifiers changed from: private */
        public static final C16807N g(w1 w1Var, h hVar) {
            C17542s.j(hVar, "it");
            LatLng a10 = hVar.a();
            C17542s.i(a10, "getPosition(...)");
            w1Var.h().h(true);
            w1Var.h().j(a10);
            w1Var.h().g(C9317n.DRAG);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(w1 w1Var, h hVar) {
            C17542s.j(hVar, "it");
            LatLng a10 = hVar.a();
            C17542s.i(a10, "getPosition(...)");
            w1Var.h().h(true);
            w1Var.h().j(a10);
            w1Var.h().h(false);
            w1Var.h().g(C9317n.END);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(w1 w1Var, h hVar) {
            C17542s.j(hVar, "it");
            LatLng a10 = hVar.a();
            C17542s.i(a10, "getPosition(...)");
            w1Var.h().h(true);
            w1Var.h().j(a10);
            w1Var.h().g(C9317n.START);
            return C16807N.f139792a;
        }

        public void a(h hVar) {
            C17542s.j(hVar, "marker");
            for (C9288a0 a0Var : this.f64172a.f64171g) {
                if (a0Var instanceof w1) {
                    w1 w1Var = (w1) a0Var;
                    if (C17542s.e(w1Var.g(), hVar)) {
                        if (C17542s.e(new J(w1Var).invoke(hVar), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (!(a0Var instanceof C9338y)) {
                    continue;
                } else {
                    C17642l<h, C16807N> k10 = ((C9338y) a0Var).k();
                    if (k10 != null ? C17542s.e(k10.invoke(hVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
        }

        public void b(h hVar) {
            C17542s.j(hVar, "marker");
            for (C9288a0 a0Var : this.f64172a.f64171g) {
                if (a0Var instanceof w1) {
                    w1 w1Var = (w1) a0Var;
                    if (C17542s.e(w1Var.g(), hVar)) {
                        if (C17542s.e(new I(w1Var).invoke(hVar), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (!(a0Var instanceof C9338y)) {
                    continue;
                } else {
                    C17642l<h, C16807N> j10 = ((C9338y) a0Var).j();
                    if (j10 != null ? C17542s.e(j10.invoke(hVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
        }

        public void c(h hVar) {
            C17542s.j(hVar, "marker");
            for (C9288a0 a0Var : this.f64172a.f64171g) {
                if (a0Var instanceof w1) {
                    w1 w1Var = (w1) a0Var;
                    if (C17542s.e(w1Var.g(), hVar)) {
                        if (C17542s.e(new K(w1Var).invoke(hVar), Boolean.TRUE)) {
                            return;
                        }
                    }
                }
                if (!(a0Var instanceof C9338y)) {
                    continue;
                } else {
                    C17642l<h, C16807N> l10 = ((C9338y) a0Var).l();
                    if (l10 != null ? C17542s.e(l10.invoke(hVar), Boolean.TRUE) : false) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(C8619c cVar, MapView mapView, N n10) {
        super(C9291b0.f64219a);
        C17542s.j(cVar, "map");
        C17542s.j(mapView, "mapView");
        C17542s.j(n10, "mapClickListeners");
        this.f64168d = cVar;
        this.f64169e = mapView;
        this.f64170f = n10;
        H();
    }

    /* access modifiers changed from: private */
    public static final boolean A(L l10, h hVar) {
        C17542s.j(hVar, "marker");
        Iterator it = l10.f64171g.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            C9288a0 a0Var = (C9288a0) it.next();
            if (a0Var instanceof w1) {
                w1 w1Var = (w1) a0Var;
                if (C17542s.e(w1Var.g(), hVar)) {
                    C17642l<h, Boolean> l11 = w1Var.l();
                    if (l11 != null) {
                        z10 = C17542s.e(l11.invoke(hVar), Boolean.TRUE);
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<h, Boolean> i10 = ((C9338y) a0Var).i();
                if (i10 != null) {
                    z10 = C17542s.e(i10.invoke(hVar), Boolean.TRUE);
                }
                if (z10) {
                    break;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void B(L l10, h hVar) {
        C17542s.j(hVar, "marker");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof w1) {
                w1 w1Var = (w1) a0Var;
                if (C17542s.e(w1Var.g(), hVar)) {
                    C17642l<h, C16807N> i10 = w1Var.i();
                    if (i10 != null) {
                        z10 = C17542s.e(i10.invoke(hVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<h, C16807N> f10 = ((C9338y) a0Var).f();
                if (f10 != null) {
                    z10 = C17542s.e(f10.invoke(hVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void C(L l10, h hVar) {
        C17542s.j(hVar, "marker");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof w1) {
                w1 w1Var = (w1) a0Var;
                if (C17542s.e(w1Var.g(), hVar)) {
                    C17642l<h, C16807N> j10 = w1Var.j();
                    if (j10 != null) {
                        z10 = C17542s.e(j10.invoke(hVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<h, C16807N> g10 = ((C9338y) a0Var).g();
                if (g10 != null) {
                    z10 = C17542s.e(g10.invoke(hVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void D(L l10, h hVar) {
        C17542s.j(hVar, "marker");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof w1) {
                w1 w1Var = (w1) a0Var;
                if (C17542s.e(w1Var.g(), hVar)) {
                    C17642l<h, C16807N> k10 = w1Var.k();
                    if (k10 != null) {
                        z10 = C17542s.e(k10.invoke(hVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<h, C16807N> h10 = ((C9338y) a0Var).h();
                if (h10 != null) {
                    z10 = C17542s.e(h10.invoke(hVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final w1 E(L l10, h hVar) {
        Object obj;
        C17542s.j(hVar, "marker");
        Iterator it = l10.f64171g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C9288a0 a0Var = (C9288a0) obj;
            if ((a0Var instanceof w1) && C17542s.e(((w1) a0Var).g(), hVar)) {
                break;
            }
        }
        return (w1) obj;
    }

    /* access modifiers changed from: private */
    public static final void F(L l10, d dVar) {
        C17542s.j(dVar, "circle");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof C9307i) {
                C9307i iVar = (C9307i) a0Var;
                if (C17542s.e(iVar.d(), dVar)) {
                    C17642l<d, C16807N> e10 = iVar.e();
                    if (e10 != null) {
                        z10 = C17542s.e(e10.invoke(dVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<d, C16807N> d10 = ((C9338y) a0Var).d();
                if (d10 != null) {
                    z10 = C17542s.e(d10.invoke(dVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void G(L l10, e eVar) {
        C17542s.j(eVar, "groundOverlay");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof C9334w) {
                C9334w wVar = (C9334w) a0Var;
                if (C17542s.e(wVar.d(), eVar)) {
                    C17642l<e, C16807N> e10 = wVar.e();
                    if (e10 != null) {
                        z10 = C17542s.e(e10.invoke(eVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<e, C16807N> e11 = ((C9338y) a0Var).e();
                if (e11 != null) {
                    z10 = C17542s.e(e11.invoke(eVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void y(L l10, k kVar) {
        C17542s.j(kVar, "polygon");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof A1) {
                A1 a12 = (A1) a0Var;
                if (C17542s.e(a12.e(), kVar)) {
                    C17642l<k, C16807N> d10 = a12.d();
                    if (d10 != null) {
                        z10 = C17542s.e(d10.invoke(kVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<k, C16807N> m10 = ((C9338y) a0Var).m();
                if (m10 != null) {
                    z10 = C17542s.e(m10.invoke(kVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void z(L l10, l lVar) {
        C17542s.j(lVar, "polyline");
        for (C9288a0 a0Var : l10.f64171g) {
            boolean z10 = false;
            if (a0Var instanceof B1) {
                B1 b12 = (B1) a0Var;
                if (C17542s.e(b12.e(), lVar)) {
                    C17642l<l, C16807N> d10 = b12.d();
                    if (d10 != null) {
                        z10 = C17542s.e(d10.invoke(lVar), Boolean.TRUE);
                    }
                    if (z10) {
                        return;
                    }
                }
            }
            if (!(a0Var instanceof C9338y)) {
                continue;
            } else {
                C17642l<l, C16807N> n10 = ((C9338y) a0Var).n();
                if (n10 != null) {
                    z10 = C17542s.e(n10.invoke(lVar), Boolean.TRUE);
                }
                if (z10) {
                    return;
                }
            }
        }
    }

    public final void H() {
        this.f64168d.y(new C9340z(this));
        this.f64168d.z(new A(this));
        this.f64168d.M(new B(this));
        this.f64168d.N(new C(this));
        this.f64168d.H(new D(this));
        this.f64168d.B(new E(this));
        this.f64168d.C(new F(this));
        this.f64168d.D(new G(this));
        this.f64168d.I(new a(this));
        this.f64168d.l(new C9311k(this.f64169e, new H(this)));
    }

    public final C8619c I() {
        return this.f64168d;
    }

    public final N J() {
        return this.f64170f;
    }

    public final MapView K() {
        return this.f64169e;
    }

    /* renamed from: L */
    public void f(int i10, C9288a0 a0Var) {
        C17542s.j(a0Var, "instance");
        this.f64171g.add(i10, a0Var);
        a0Var.b();
    }

    /* renamed from: M */
    public void d(int i10, C9288a0 a0Var) {
        C17542s.j(a0Var, "instance");
    }

    public void b(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            this.f64171g.get(i10 + i12).c();
        }
        m(this.f64171g, i10, i11);
    }

    public void c(int i10, int i11, int i12) {
        k(this.f64171g, i10, i11, i12);
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.f64168d.e();
        for (C9288a0 a10 : this.f64171g) {
            a10.a();
        }
        this.f64171g.clear();
    }
}
