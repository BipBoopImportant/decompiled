package KL;

import KL.C15997a;
import KL.C16003g;
import KL.h;
import KL.i;
import KL.j;
import LL.C16031a;
import android.graphics.PointF;
import j0.C5468y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.d;
import org.maplibre.android.style.sources.GeoJsonSource;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;

/* renamed from: KL.c  reason: case insensitive filesystem */
public abstract class C15999c<L extends Layer, T extends C15997a, S extends j<T>, D extends h<T>, U extends C16003g<T>, V extends i<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final MapView f135942a;

    /* renamed from: b  reason: collision with root package name */
    protected final o f135943b;

    /* renamed from: c  reason: collision with root package name */
    protected final C5468y<T> f135944c = new C5468y<>();

    /* renamed from: d  reason: collision with root package name */
    final Map<String, Boolean> f135945d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    final Map<String, d> f135946e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    C16031a f135947f;

    /* renamed from: g  reason: collision with root package name */
    private final List<D> f135948g = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final List<U> f135949h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final List<V> f135950i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private long f135951j;

    /* renamed from: k  reason: collision with root package name */
    protected L f135952k;

    /* renamed from: l  reason: collision with root package name */
    protected GeoJsonSource f135953l;

    /* renamed from: m  reason: collision with root package name */
    private final C15999c<L, T, S, D, U, V>.defpackage.b f135954m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public E f135955n;

    /* renamed from: o  reason: collision with root package name */
    private String f135956o;

    /* renamed from: p  reason: collision with root package name */
    private String f135957p;

    /* renamed from: q  reason: collision with root package name */
    protected C16001e<L> f135958q;

    /* renamed from: r  reason: collision with root package name */
    private C16002f f135959r;

    /* renamed from: s  reason: collision with root package name */
    private AtomicBoolean f135960s = new AtomicBoolean(true);

    /* renamed from: KL.c$a */
    class a implements MapView.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f135961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ org.maplibre.android.style.sources.a f135962b;

        /* renamed from: KL.c$a$a  reason: collision with other inner class name */
        class C3344a implements E.b {
            C3344a() {
            }

            public void a(E e10) {
                E unused = C15999c.this.f135955n = e10;
                a aVar = a.this;
                C15999c.this.p(aVar.f135962b);
            }
        }

        a(o oVar, org.maplibre.android.style.sources.a aVar) {
            this.f135961a = oVar;
        }

        public void g() {
            this.f135961a.u(new C3344a());
        }
    }

    /* renamed from: KL.c$b */
    private class b implements o.C4251o, o.p {
        private b() {
        }

        public boolean a(LatLng latLng) {
            C15997a e10;
            if (!C15999c.this.f135949h.isEmpty() && (e10 = C15999c.this.s(latLng)) != null) {
                for (C16003g a10 : C15999c.this.f135949h) {
                    if (a10.a(e10)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean b(LatLng latLng) {
            C15997a e10;
            if (!C15999c.this.f135950i.isEmpty() && (e10 = C15999c.this.s(latLng)) != null) {
                for (i a10 : C15999c.this.f135950i) {
                    if (a10.a(e10)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* synthetic */ b(C15999c cVar, a aVar) {
            this();
        }
    }

    protected C15999c(MapView mapView, o oVar, E e10, C16001e<L> eVar, C16002f fVar, String str, String str2, org.maplibre.android.style.sources.a aVar) {
        this.f135942a = mapView;
        this.f135943b = oVar;
        this.f135955n = e10;
        this.f135956o = str;
        this.f135957p = str2;
        this.f135958q = eVar;
        this.f135959r = fVar;
        if (e10.l()) {
            C15999c<L, T, S, D, U, V>.defpackage.b bVar = new b(this, (a) null);
            this.f135954m = bVar;
            oVar.c(bVar);
            oVar.d(bVar);
            p(aVar);
            fVar.b(this);
            mapView.m(new a(oVar, aVar));
            return;
        }
        throw new RuntimeException("The style has to be non-null and fully loaded.");
    }

    /* access modifiers changed from: private */
    public void p(org.maplibre.android.style.sources.a aVar) {
        this.f135953l = this.f135958q.c(aVar);
        this.f135952k = this.f135958q.b();
        this.f135955n.g(this.f135953l);
        String str = this.f135956o;
        if (str == null || this.f135957p == null) {
            if (str != null) {
                this.f135955n.f(this.f135952k, str);
            } else {
                String str2 = this.f135957p;
                if (str2 != null) {
                    this.f135955n.d(this.f135952k, str2);
                } else {
                    this.f135955n.c(this.f135952k);
                }
            }
            o();
            this.f135952k.f((d[]) this.f135946e.values().toArray(new d[0]));
            C16031a aVar2 = this.f135947f;
            if (aVar2 != null) {
                u(aVar2);
            }
            v();
            return;
        }
        throw new IllegalArgumentException("At most one of belowLayerId and aboveLayerId can be set, not both!");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f135960s.set(true);
        if (this.f135955n.l()) {
            w();
        }
    }

    /* access modifiers changed from: private */
    public T s(LatLng latLng) {
        return r(this.f135943b.s().e(latLng));
    }

    public T g(S s10) {
        T a10 = s10.a(this.f135951j, this);
        this.f135944c.k(a10.c(), a10);
        this.f135951j++;
        v();
        return a10;
    }

    public void h() {
        this.f135944c.a();
        v();
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
        if (this.f135945d.get(str).equals(Boolean.FALSE)) {
            this.f135945d.put(str, Boolean.TRUE);
            t(str);
        }
    }

    public String j() {
        return this.f135957p;
    }

    /* access modifiers changed from: package-private */
    public abstract String k();

    public String l() {
        return this.f135956o;
    }

    /* access modifiers changed from: package-private */
    public List<D> m() {
        return this.f135948g;
    }

    public String n() {
        return this.f135952k.c();
    }

    /* access modifiers changed from: package-private */
    public abstract void o();

    /* access modifiers changed from: package-private */
    public T r(PointF pointF) {
        List<Feature> N10 = this.f135943b.N(pointF, this.f135958q.a());
        if (N10.isEmpty()) {
            return null;
        }
        return (C15997a) this.f135944c.d(N10.get(0).getProperty(k()).getAsLong());
    }

    /* access modifiers changed from: protected */
    public abstract void t(String str);

    /* access modifiers changed from: package-private */
    public abstract void u(C16031a aVar);

    public void v() {
        if (this.f135960s.compareAndSet(true, false)) {
            this.f135942a.post(new C15998b(this));
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f135944c.o(); i10++) {
            C15997a aVar = (C15997a) this.f135944c.p(i10);
            arrayList.add(Feature.fromGeometry(aVar.b(), aVar.a()));
            aVar.j();
        }
        this.f135953l.a(FeatureCollection.fromFeatures((List<Feature>) arrayList));
    }
}
