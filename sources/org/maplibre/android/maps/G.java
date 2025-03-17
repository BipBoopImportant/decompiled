package org.maplibre.android.maps;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import yL.C18746b;

public final class G implements MapView.j {

    /* renamed from: a  reason: collision with root package name */
    private final v f145722a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final MapView f145723b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f145724c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private CameraPosition f145725d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public C17736e f145726e;

    /* renamed from: f  reason: collision with root package name */
    private final MapView.j f145727f = new a();

    class a implements MapView.j {
        a() {
        }

        public void q(boolean z10) {
            if (z10) {
                G.this.f145726e.c();
                G.this.f145723b.C(this);
            }
        }
    }

    class b implements Runnable {
        b(o.a aVar) {
        }

        public void run() {
        }
    }

    G(MapView mapView, v vVar, C17736e eVar) {
        this.f145723b = mapView;
        this.f145722a = vVar;
        this.f145726e = eVar;
    }

    private boolean k(CameraPosition cameraPosition) {
        return cameraPosition != null && !cameraPosition.equals(this.f145725d);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f145726e.b();
        this.f145722a.q();
        this.f145726e.c();
    }

    /* access modifiers changed from: package-private */
    public final void d(o oVar, C18746b bVar, int i10, boolean z10, o.a aVar) {
        CameraPosition a10 = bVar.a(oVar);
        if (k(a10)) {
            c();
            this.f145726e.d(3);
            this.f145723b.i(this);
            this.f145722a.G(a10.target, a10.zoom, a10.bearing, a10.tilt, a10.padding, (long) i10, z10);
        } else if (aVar != null) {
            aVar.a();
        }
    }

    public final CameraPosition e() {
        if (this.f145725d == null) {
            this.f145725d = j();
        }
        return this.f145725d;
    }

    /* access modifiers changed from: package-private */
    public double f() {
        return this.f145722a.g0();
    }

    /* access modifiers changed from: package-private */
    public double g() {
        return this.f145722a.e0();
    }

    /* access modifiers changed from: package-private */
    public double h() {
        return this.f145722a.I();
    }

    /* access modifiers changed from: package-private */
    public void i(o oVar, p pVar) {
        CameraPosition x10 = pVar.x();
        if (x10 != null && !x10.equals(CameraPosition.f145494b)) {
            m(oVar, org.maplibre.android.camera.a.a(x10), (o.a) null);
        }
        u(pVar.P());
        s(pVar.N());
        t(pVar.O());
        r(pVar.M());
    }

    /* access modifiers changed from: package-private */
    public CameraPosition j() {
        v vVar = this.f145722a;
        if (vVar != null) {
            CameraPosition p10 = vVar.p();
            CameraPosition cameraPosition = this.f145725d;
            if (cameraPosition != null && !cameraPosition.equals(p10)) {
                this.f145726e.a();
            }
            this.f145725d = p10;
        }
        return this.f145725d;
    }

    /* access modifiers changed from: package-private */
    public void l(double d10, double d11, long j10) {
        if (j10 > 0) {
            this.f145723b.i(this.f145727f);
        }
        this.f145722a.c0(d10, d11, j10);
    }

    public final void m(o oVar, C18746b bVar, o.a aVar) {
        CameraPosition a10 = bVar.a(oVar);
        if (k(a10)) {
            c();
            this.f145726e.d(3);
            this.f145722a.X(a10.target, a10.zoom, a10.tilt, a10.bearing, a10.padding);
            j();
            this.f145726e.c();
            this.f145724c.post(new b(aVar));
        } else if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void n(double d10, float f10, float f11) {
        this.f145722a.O(d10, (double) f10, (double) f11, 0);
    }

    /* access modifiers changed from: package-private */
    public void o(double d10, float f10, float f11, long j10) {
        this.f145722a.O(d10, (double) f10, (double) f11, j10);
    }

    /* access modifiers changed from: package-private */
    public void p(boolean z10) {
        this.f145722a.N(z10);
        if (!z10) {
            j();
        }
    }

    public void q(boolean z10) {
        if (z10) {
            j();
            this.f145726e.c();
            this.f145723b.C(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void r(double d10) {
        if (d10 < 0.0d || d10 > 60.0d) {
            Logger.e("Mbgl-Transform", String.format("Not setting maxPitchPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d10)}));
        } else {
            this.f145722a.B(d10);
        }
    }

    /* access modifiers changed from: package-private */
    public void s(double d10) {
        if (d10 < 0.0d || d10 > 25.5d) {
            Logger.e("Mbgl-Transform", String.format("Not setting maxZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d10)}));
        } else {
            this.f145722a.y(d10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(double d10) {
        if (d10 < 0.0d || d10 > 60.0d) {
            Logger.e("Mbgl-Transform", String.format("Not setting minPitchPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d10)}));
        } else {
            this.f145722a.M(d10);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(double d10) {
        if (d10 < 0.0d || d10 > 25.5d) {
            Logger.e("Mbgl-Transform", String.format("Not setting minZoomPreference, value is in unsupported range: %s", new Object[]{Double.valueOf(d10)}));
        } else {
            this.f145722a.b0(d10);
        }
    }

    /* access modifiers changed from: package-private */
    public void v(Double d10) {
        this.f145722a.L(d10.doubleValue(), 0);
    }

    /* access modifiers changed from: package-private */
    public void w(double d10, PointF pointF) {
        this.f145722a.j0(d10, pointF, 0);
    }

    /* access modifiers changed from: package-private */
    public void x(double d10, PointF pointF) {
        w(this.f145722a.e0() + d10, pointF);
    }
}
