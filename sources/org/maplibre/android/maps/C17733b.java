package org.maplibre.android.maps;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import j0.C5468y;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.MapLibre;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.h;
import wL.C18566a;

/* renamed from: org.maplibre.android.maps.b  reason: case insensitive filesystem */
class C17733b {

    /* renamed from: a  reason: collision with root package name */
    private final MapView f145806a;

    /* renamed from: b  reason: collision with root package name */
    private final C17738g f145807b;

    /* renamed from: c  reason: collision with root package name */
    private final j f145808c = new j();

    /* renamed from: d  reason: collision with root package name */
    private final C5468y<C18566a> f145809d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Marker> f145810e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private o f145811f;

    /* renamed from: g  reason: collision with root package name */
    private C17734c f145812g;

    /* renamed from: h  reason: collision with root package name */
    private D f145813h;

    /* renamed from: i  reason: collision with root package name */
    private u f145814i;

    /* renamed from: j  reason: collision with root package name */
    private y f145815j;

    /* renamed from: k  reason: collision with root package name */
    private A f145816k;

    /* renamed from: org.maplibre.android.maps.b$a */
    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final RectF f145817a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final List<Marker> f145818b;

        a(RectF rectF, List<Marker> list) {
            this.f145817a = rectF;
            this.f145818b = list;
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return this.f145817a.centerX();
        }

        /* access modifiers changed from: package-private */
        public float d() {
            return this.f145817a.centerY();
        }
    }

    /* renamed from: org.maplibre.android.maps.b$b  reason: collision with other inner class name */
    private static class C4250b {

        /* renamed from: a  reason: collision with root package name */
        private final B f145819a;

        /* renamed from: b  reason: collision with root package name */
        private final int f145820b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap f145821c;

        /* renamed from: d  reason: collision with root package name */
        private int f145822d;

        /* renamed from: e  reason: collision with root package name */
        private int f145823e;

        /* renamed from: f  reason: collision with root package name */
        private PointF f145824f;

        /* renamed from: g  reason: collision with root package name */
        private Rect f145825g = new Rect();

        /* renamed from: h  reason: collision with root package name */
        private RectF f145826h = new RectF();

        /* renamed from: i  reason: collision with root package name */
        private RectF f145827i = new RectF();

        /* renamed from: j  reason: collision with root package name */
        private long f145828j = -1;

        C4250b(o oVar) {
            this.f145819a = oVar.s();
            this.f145820b = (int) (MapLibre.getApplicationContext().getResources().getDisplayMetrics().density * 32.0f);
        }

        private void b(a aVar, Marker marker, RectF rectF) {
            if (rectF.contains(aVar.c(), aVar.d())) {
                rectF.intersect(aVar.f145817a);
                if (c(rectF)) {
                    this.f145827i = new RectF(rectF);
                    this.f145828j = marker.b();
                }
            }
        }

        private boolean c(RectF rectF) {
            return rectF.width() * rectF.height() > this.f145827i.width() * this.f145827i.height();
        }

        private void d(a aVar, Marker marker) {
            this.f145824f = this.f145819a.e(marker.D());
            Bitmap a10 = marker.B().a();
            this.f145821c = a10;
            int height = a10.getHeight();
            this.f145823e = height;
            int i10 = this.f145820b;
            if (height < i10) {
                this.f145823e = i10;
            }
            int width = this.f145821c.getWidth();
            this.f145822d = width;
            int i11 = this.f145820b;
            if (width < i11) {
                this.f145822d = i11;
            }
            this.f145826h.set(0.0f, 0.0f, (float) this.f145822d, (float) this.f145823e);
            RectF rectF = this.f145826h;
            PointF pointF = this.f145824f;
            rectF.offsetTo(pointF.x - ((float) (this.f145822d / 2)), pointF.y - ((float) (this.f145823e / 2)));
            b(aVar, marker, this.f145826h);
        }

        private void e(a aVar) {
            for (Marker d10 : aVar.f145818b) {
                d(aVar, d10);
            }
        }

        public long a(a aVar) {
            e(aVar);
            return this.f145828j;
        }
    }

    /* renamed from: org.maplibre.android.maps.b$c */
    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final RectF f145829a;

        c(RectF rectF) {
            this.f145829a = rectF;
        }
    }

    /* renamed from: org.maplibre.android.maps.b$d */
    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private D f145830a;

        d(D d10) {
            this.f145830a = d10;
        }

        public C18566a a(c cVar) {
            List<C18566a> a10 = this.f145830a.a(cVar.f145829a);
            if (a10.size() > 0) {
                return a10.get(0);
            }
            return null;
        }
    }

    C17733b(MapView mapView, C5468y<C18566a> yVar, C17738g gVar, C17734c cVar, u uVar, y yVar2, A a10, D d10) {
        this.f145806a = mapView;
        this.f145809d = yVar;
        this.f145807b = gVar;
        this.f145812g = cVar;
        this.f145814i = uVar;
        this.f145815j = yVar2;
        this.f145816k = a10;
        this.f145813h = d10;
    }

    private a g(PointF pointF) {
        int b10 = (int) (((double) this.f145807b.b()) * 1.5d);
        float f10 = pointF.x;
        float a10 = (float) ((int) (((double) this.f145807b.a()) * 1.5d));
        float f11 = pointF.y;
        float f12 = (float) b10;
        RectF rectF = new RectF(f10 - a10, f11 - f12, f10 + a10, f11 + f12);
        return new a(rectF, h(rectF));
    }

    private c i(PointF pointF) {
        float dimension = MapLibre.getApplicationContext().getResources().getDimension(h.f145520c);
        float f10 = pointF.x;
        float f11 = pointF.y;
        return new c(new RectF(f10 - dimension, f11 - dimension, f10 + dimension, f11 + dimension));
    }

    private boolean j(C18566a aVar) {
        boolean z10 = aVar instanceof Polygon;
        boolean z11 = aVar instanceof Polyline;
        return false;
    }

    private boolean k(long j10) {
        Marker marker = (Marker) e(j10);
        if (l(marker)) {
            return true;
        }
        p(marker);
        return true;
    }

    private boolean l(Marker marker) {
        return false;
    }

    private void p(Marker marker) {
        if (!this.f145810e.contains(marker)) {
            o(marker);
        } else {
            c(marker);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(o oVar) {
        int o10 = this.f145809d.o();
        for (int i10 = 0; i10 < o10; i10++) {
            C18566a d10 = this.f145809d.d((long) i10);
            if (d10 instanceof Marker) {
                Marker marker = (Marker) d10;
                marker.I(this.f145807b.c(marker.B()));
            }
        }
        for (Marker next : this.f145810e) {
            if (next.H()) {
                next.G();
                next.K(oVar, this.f145806a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C17733b b(o oVar) {
        this.f145811f = oVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(Marker marker) {
        if (this.f145810e.contains(marker)) {
            if (marker.H()) {
                marker.G();
            }
            this.f145810e.remove(marker);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (!this.f145810e.isEmpty()) {
            for (Marker next : this.f145810e) {
                if (next != null && next.H()) {
                    next.G();
                }
            }
            this.f145810e.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public C18566a e(long j10) {
        return this.f145812g.a(j10);
    }

    /* access modifiers changed from: package-private */
    public j f() {
        return this.f145808c;
    }

    /* access modifiers changed from: package-private */
    public List<Marker> h(RectF rectF) {
        return this.f145814i.a(rectF);
    }

    /* access modifiers changed from: package-private */
    public boolean m(PointF pointF) {
        long a10 = new C4250b(this.f145811f).a(g(pointF));
        if (a10 != -1 && k(a10)) {
            return true;
        }
        C18566a a11 = new d(this.f145813h).a(i(pointF));
        return a11 != null && j(a11);
    }

    /* access modifiers changed from: package-private */
    public void n() {
        this.f145814i.b();
    }

    /* access modifiers changed from: package-private */
    public void o(Marker marker) {
        if (!this.f145810e.contains(marker)) {
            if (!this.f145808c.f()) {
                d();
            }
            if (!this.f145808c.g(marker)) {
                this.f145808c.b();
            } else {
                this.f145808c.a(marker.K(this.f145811f, this.f145806a));
            }
            this.f145810e.add(marker);
        }
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f145808c.h();
    }
}
