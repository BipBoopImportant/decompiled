package org.maplibre.android.maps;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.NativeMapView;
import org.maplibre.android.tile.TileOperation;

class k implements NativeMapView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<MapView.l> f145853a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final List<MapView.k> f145854b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<MapView.j> f145855c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<MapView.F> f145856d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List<MapView.p> f145857e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<MapView.o> f145858f = new CopyOnWriteArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<MapView.G> f145859g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<MapView.r> f145860h = new CopyOnWriteArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final List<MapView.H> f145861i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final List<MapView.s> f145862j = new CopyOnWriteArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final List<MapView.n> f145863k = new CopyOnWriteArrayList();

    /* renamed from: l  reason: collision with root package name */
    private final List<MapView.q> f145864l = new CopyOnWriteArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final List<MapView.z> f145865m = new CopyOnWriteArrayList();

    /* renamed from: n  reason: collision with root package name */
    private final List<MapView.D> f145866n = new CopyOnWriteArrayList();

    /* renamed from: o  reason: collision with root package name */
    private final List<MapView.m> f145867o = new CopyOnWriteArrayList();

    /* renamed from: p  reason: collision with root package name */
    private final List<MapView.x> f145868p = new CopyOnWriteArrayList();

    /* renamed from: q  reason: collision with root package name */
    private final List<MapView.w> f145869q = new CopyOnWriteArrayList();

    /* renamed from: r  reason: collision with root package name */
    private final List<MapView.y> f145870r = new CopyOnWriteArrayList();

    /* renamed from: s  reason: collision with root package name */
    private final List<MapView.u> f145871s = new CopyOnWriteArrayList();

    /* renamed from: t  reason: collision with root package name */
    private final List<MapView.t> f145872t = new CopyOnWriteArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final List<MapView.v> f145873u = new CopyOnWriteArrayList();

    /* renamed from: v  reason: collision with root package name */
    private final List<MapView.E> f145874v = new CopyOnWriteArrayList();

    /* renamed from: w  reason: collision with root package name */
    private final List<MapView.B> f145875w = new CopyOnWriteArrayList();

    /* renamed from: x  reason: collision with root package name */
    private final List<MapView.A> f145876x = new CopyOnWriteArrayList();

    /* renamed from: y  reason: collision with root package name */
    private final List<MapView.C> f145877y = new CopyOnWriteArrayList();

    k() {
    }

    /* access modifiers changed from: package-private */
    public void A(MapView.k kVar) {
        this.f145854b.add(kVar);
    }

    /* access modifiers changed from: package-private */
    public void B(MapView.o oVar) {
        this.f145858f.add(oVar);
    }

    /* access modifiers changed from: package-private */
    public void C(MapView.p pVar) {
        this.f145857e.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public void D(MapView.q qVar) {
        this.f145864l.add(qVar);
    }

    /* access modifiers changed from: package-private */
    public void E(MapView.r rVar) {
        this.f145860h.add(rVar);
    }

    /* access modifiers changed from: package-private */
    public void F(MapView.j jVar) {
        this.f145855c.remove(jVar);
    }

    /* access modifiers changed from: package-private */
    public void G(MapView.r rVar) {
        this.f145860h.remove(rVar);
    }

    public void a(String str, String str2) {
        try {
            if (!this.f145875w.isEmpty()) {
                for (MapView.B a10 : this.f145875w) {
                    a10.a(str, str2);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteLoaded", th2);
            throw th2;
        }
    }

    public void b(int i10, int i11, String str) {
        try {
            if (!this.f145870r.isEmpty()) {
                for (MapView.y b10 : this.f145870r) {
                    b10.b(i10, i11, str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onShaderCompileFailed", th2);
            throw th2;
        }
    }

    public void c(boolean z10) {
        try {
            if (!this.f145862j.isEmpty()) {
                for (MapView.s c10 : this.f145862j) {
                    c10.c(z10);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingMap", th2);
            throw th2;
        }
    }

    public void d() {
        try {
            if (!this.f145854b.isEmpty()) {
                for (MapView.k d10 : this.f145854b) {
                    d10.d();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraIsChanging", th2);
            throw th2;
        }
    }

    public void e(String str) {
        try {
            if (!this.f145866n.isEmpty()) {
                for (MapView.D e10 : this.f145866n) {
                    e10.e(str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onStyleImageMissing", th2);
            throw th2;
        }
    }

    public void f(String str, String str2) {
        try {
            if (!this.f145877y.isEmpty()) {
                for (MapView.C f10 : this.f145877y) {
                    f10.f(str, str2);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteRequested", th2);
            throw th2;
        }
    }

    public void g() {
        try {
            if (!this.f145864l.isEmpty()) {
                for (MapView.q g10 : this.f145864l) {
                    g10.g();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingStyle", th2);
            throw th2;
        }
    }

    public void h(String[] strArr, int i10, int i11) {
        try {
            if (!this.f145872t.isEmpty()) {
                for (MapView.t h10 : this.f145872t) {
                    h10.h(strArr, i10, i11);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsError", th2);
            throw th2;
        }
    }

    public void i() {
        try {
            if (!this.f145859g.isEmpty()) {
                for (MapView.G i10 : this.f145859g) {
                    i10.i();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingFrame", th2);
            throw th2;
        }
    }

    public void j(boolean z10) {
        try {
            if (!this.f145853a.isEmpty()) {
                for (MapView.l j10 : this.f145853a) {
                    j10.j(z10);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraWillChange", th2);
            throw th2;
        }
    }

    public void k(String str) {
        try {
            if (!this.f145858f.isEmpty()) {
                for (MapView.o k10 : this.f145858f) {
                    k10.k(str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFailLoadingMap", th2);
            throw th2;
        }
    }

    public void l(String[] strArr, int i10, int i11) {
        try {
            if (!this.f145871s.isEmpty()) {
                for (MapView.u l10 : this.f145871s) {
                    l10.l(strArr, i10, i11);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsLoaded", th2);
            throw th2;
        }
    }

    public void m(String[] strArr, int i10, int i11) {
        try {
            if (!this.f145873u.isEmpty()) {
                for (MapView.v m10 : this.f145873u) {
                    m10.m(strArr, i10, i11);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onGlyphsRequested", th2);
            throw th2;
        }
    }

    public void n(String str, String str2) {
        try {
            if (!this.f145876x.isEmpty()) {
                for (MapView.A n10 : this.f145876x) {
                    n10.n(str, str2);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSpriteError", th2);
            throw th2;
        }
    }

    public void o() {
        try {
            if (!this.f145861i.isEmpty()) {
                for (MapView.H o10 : this.f145861i) {
                    o10.o();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingMap", th2);
            throw th2;
        }
    }

    public void p(boolean z10, double d10, double d11) {
        try {
            if (!this.f145860h.isEmpty()) {
                for (MapView.r p10 : this.f145860h) {
                    p10.p(z10, d10, d11);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingFrame", th2);
            throw th2;
        }
    }

    public void q(boolean z10) {
        try {
            if (!this.f145855c.isEmpty()) {
                for (MapView.j q10 : this.f145855c) {
                    q10.q(z10);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraDidChange", th2);
            throw th2;
        }
    }

    public void r(int i10, int i11, String str) {
        try {
            if (!this.f145869q.isEmpty()) {
                for (MapView.w r10 : this.f145869q) {
                    r10.r(i10, i11, str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onPostCompileShader", th2);
            throw th2;
        }
    }

    public void s(int i10, int i11, String str) {
        try {
            if (!this.f145868p.isEmpty()) {
                for (MapView.x s10 : this.f145868p) {
                    s10.s(i10, i11, str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onPreCompileShader", th2);
            throw th2;
        }
    }

    public boolean t(String str) {
        boolean z10 = true;
        if (this.f145867o.isEmpty()) {
            return true;
        }
        try {
            if (!this.f145867o.isEmpty()) {
                for (MapView.m t10 : this.f145867o) {
                    z10 &= t10.t(str);
                }
            }
            return z10;
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCanRemoveUnusedStyleImage", th2);
            throw th2;
        }
    }

    public void u() {
        try {
            if (!this.f145856d.isEmpty()) {
                for (MapView.F u10 : this.f145856d) {
                    u10.u();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartLoadingMap", th2);
            throw th2;
        }
    }

    public void v() {
        try {
            if (!this.f145863k.isEmpty()) {
                for (MapView.n v10 : this.f145863k) {
                    v10.v();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidBecomeIdle", th2);
            throw th2;
        }
    }

    public void w() {
        try {
            if (!this.f145857e.isEmpty()) {
                for (MapView.p w10 : this.f145857e) {
                    w10.w();
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingMap", th2);
            throw th2;
        }
    }

    public void x(TileOperation tileOperation, int i10, int i11, int i12, int i13, int i14, String str) {
        try {
            if (!this.f145874v.isEmpty()) {
                for (MapView.E x10 : this.f145874v) {
                    x10.x(tileOperation, i10, i11, i12, i13, i14, str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onTileAction", th2);
            throw th2;
        }
    }

    public void y(String str) {
        try {
            if (!this.f145865m.isEmpty()) {
                for (MapView.z a10 : this.f145865m) {
                    a10.a(str);
                }
            }
        } catch (Throwable th2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSourceChanged", th2);
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public void z(MapView.j jVar) {
        this.f145855c.add(jVar);
    }
}
