package org.maplibre.android.location;

import EL.C15675a;
import EL.C15676b;
import android.annotation.SuppressLint;
import android.location.Location;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.G;
import org.maplibre.android.maps.o;

public final class b {

    /* renamed from: A  reason: collision with root package name */
    h f145544A = new i();

    /* renamed from: B  reason: collision with root package name */
    k f145545B = new j();

    /* renamed from: C  reason: collision with root package name */
    private final o.h f145546C;

    /* renamed from: a  reason: collision with root package name */
    private final o f145547a;

    /* renamed from: b  reason: collision with root package name */
    private final G f145548b;

    /* renamed from: c  reason: collision with root package name */
    private E f145549c;

    /* renamed from: d  reason: collision with root package name */
    private e f145550d;

    /* renamed from: e  reason: collision with root package name */
    private C15676b f145551e = new C15676b.a(1000).g(1000).h(0).f();

    /* renamed from: f  reason: collision with root package name */
    private C15675a<Object> f145552f = new l(this);

    /* renamed from: g  reason: collision with root package name */
    private C15675a<Object> f145553g = new m(this);

    /* renamed from: h  reason: collision with root package name */
    private Location f145554h;

    /* renamed from: i  reason: collision with root package name */
    private CameraPosition f145555i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f145556j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f145557k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public boolean f145558l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f145559m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f145560n;

    /* renamed from: o  reason: collision with root package name */
    private final CopyOnWriteArrayList<j> f145561o = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<Object> f145562p = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList<Object> f145563q = new CopyOnWriteArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private final CopyOnWriteArrayList<h> f145564r = new CopyOnWriteArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private final CopyOnWriteArrayList<k> f145565s = new CopyOnWriteArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    private o.e f145566t = new C4248b();

    /* renamed from: u  reason: collision with root package name */
    private o.c f145567u = new c();

    /* renamed from: v  reason: collision with root package name */
    private o.C4251o f145568v = new d();

    /* renamed from: w  reason: collision with root package name */
    private o.p f145569w = new e();

    /* renamed from: x  reason: collision with root package name */
    private j f145570x = new f();

    /* renamed from: y  reason: collision with root package name */
    private g f145571y = new g();

    /* renamed from: z  reason: collision with root package name */
    private a f145572z = new h();

    class a implements o.h {
        a() {
        }

        public void a() {
            if (b.this.f145556j && b.this.f145558l) {
                b.this.n(8);
            }
        }
    }

    /* renamed from: org.maplibre.android.location.b$b  reason: collision with other inner class name */
    class C4248b implements o.e {
        C4248b() {
        }

        public void a() {
            b.this.r(false);
        }
    }

    class c implements o.c {
        c() {
        }

        public void c() {
            b.this.r(false);
        }
    }

    class d implements o.C4251o {
        d() {
        }

        public boolean a(LatLng latLng) {
            if (b.this.f145562p.isEmpty()) {
                return false;
            }
            f unused = b.this.getClass();
            throw null;
        }
    }

    class e implements o.p {
        e() {
        }

        public boolean b(LatLng latLng) {
            if (b.this.f145563q.isEmpty()) {
                return false;
            }
            f unused = b.this.getClass();
            throw null;
        }
    }

    class f implements j {
        f() {
        }
    }

    class g implements g {
        g() {
        }
    }

    class h implements a {
        h() {
        }
    }

    class i implements h {
        i() {
        }
    }

    class j implements k {
        j() {
        }
    }

    private class k implements i {

        /* renamed from: a  reason: collision with root package name */
        private final i f145583a;

        private k(i iVar) {
            this.f145583a = iVar;
        }
    }

    static final class l implements C15675a<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f145585a;

        l(b bVar) {
            this.f145585a = new WeakReference<>(bVar);
        }
    }

    static final class m implements C15675a<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<b> f145586a;

        m(b bVar) {
            this.f145586a = new WeakReference<>(bVar);
        }
    }

    public b(o oVar, G g10, List<o.h> list) {
        a aVar = new a();
        this.f145546C = aVar;
        this.f145547a = oVar;
        this.f145548b = g10;
        list.add(aVar);
    }

    private void g() {
        if (!this.f145556j) {
            throw new d();
        }
    }

    @SuppressLint({"MissingPermission"})
    private void j() {
        if (this.f145556j && this.f145559m && this.f145547a.t() != null) {
            if (!this.f145560n) {
                this.f145560n = true;
                this.f145547a.b(this.f145566t);
                this.f145547a.a(this.f145567u);
                if (this.f145550d.a()) {
                    throw null;
                }
            }
            if (this.f145558l) {
                throw null;
            }
        }
    }

    private void k() {
        if (this.f145556j && this.f145560n && this.f145559m) {
            this.f145560n = false;
            throw null;
        }
    }

    private void q(Location location, boolean z10) {
        if (location != null) {
            if (this.f145557k) {
                location.getAccuracy();
            } else {
                l.a(this.f145547a, location);
            }
        }
        throw null;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void r(boolean z10) {
        if (!this.f145557k) {
            CameraPosition m10 = this.f145547a.m();
            CameraPosition cameraPosition = this.f145555i;
            if (cameraPosition == null || z10) {
                this.f145555i = m10;
                double d10 = m10.bearing;
                throw null;
            } else if (m10.bearing != cameraPosition.bearing) {
                throw null;
            } else if (m10.tilt == cameraPosition.tilt) {
                if (m10.zoom != cameraPosition.zoom) {
                    q(h(), true);
                }
                this.f145555i = m10;
            } else {
                throw null;
            }
        }
    }

    public Location h() {
        g();
        return this.f145554h;
    }

    public void i() {
        if (this.f145556j) {
            this.f145549c = this.f145547a.t();
            throw null;
        }
    }

    public void l() {
        this.f145559m = true;
        j();
    }

    public void m() {
        k();
    }

    public void n(int i10) {
        p(i10, (i) null);
    }

    public void o(int i10, long j10, Double d10, Double d11, Double d12, i iVar) {
        g();
        new k(iVar);
        throw null;
    }

    public void p(int i10, i iVar) {
        o(i10, 750, (Double) null, (Double) null, (Double) null, iVar);
    }
}
