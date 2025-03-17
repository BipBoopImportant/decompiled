package org.maplibre.android.maps;

import LL.C16031a;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.E;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;
import yL.C18746b;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final v f145932a;

    /* renamed from: b  reason: collision with root package name */
    private final H f145933b;

    /* renamed from: c  reason: collision with root package name */
    private final B f145934c;

    /* renamed from: d  reason: collision with root package name */
    private final G f145935d;

    /* renamed from: e  reason: collision with root package name */
    private final C17736e f145936e;

    /* renamed from: f  reason: collision with root package name */
    private final k f145937f;

    /* renamed from: g  reason: collision with root package name */
    private final List<E.b> f145938g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<h> f145939h;

    /* renamed from: i  reason: collision with root package name */
    private E.b f145940i;

    /* renamed from: j  reason: collision with root package name */
    private org.maplibre.android.location.b f145941j;

    /* renamed from: k  reason: collision with root package name */
    private C17733b f145942k;

    /* renamed from: l  reason: collision with root package name */
    private E f145943l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f145944m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f145945n;

    public interface a {
        void a();
    }

    @Deprecated
    public interface b {
    }

    public interface c {
        void c();
    }

    public interface d {
        void b();
    }

    public interface e {
        void a();
    }

    public interface f {
        void d(int i10);
    }

    public interface g {
        void a();

        void b();
    }

    public interface h {
        void a();
    }

    public interface i {
        void a();
    }

    public interface j {
    }

    interface k {
        void a(p pVar);

        void b(C4251o oVar);
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    /* renamed from: org.maplibre.android.maps.o$o  reason: collision with other inner class name */
    public interface C4251o {
        boolean a(LatLng latLng);
    }

    public interface p {
        boolean b(LatLng latLng);
    }

    public interface q {
        void a(CL.d dVar);

        void b(CL.d dVar);

        void c(CL.d dVar);
    }

    public interface r {
        void a(CL.l lVar);

        void b(CL.l lVar);

        void c(CL.l lVar);
    }

    public interface s {
        void a(CL.p pVar);

        void b(CL.p pVar);

        void c(CL.p pVar);
    }

    public interface t {
        void a(CL.m mVar);

        void b(CL.m mVar);

        void c(CL.m mVar);
    }

    o(v vVar, G g10, H h10, B b10, k kVar, C17736e eVar, List<h> list) {
        this.f145932a = vVar;
        this.f145933b = h10;
        this.f145934c = b10;
        this.f145935d = g10;
        this.f145937f = kVar;
        this.f145936e = eVar;
        this.f145939h = list;
    }

    private void D() {
        for (h a10 : this.f145939h) {
            a10.a();
        }
    }

    private void O(p pVar) {
        String s10 = pVar.s();
        if (!TextUtils.isEmpty(s10)) {
            this.f145932a.z(s10);
        }
    }

    private void W(p pVar) {
        if (!pVar.R()) {
            V(0);
        } else {
            V(pVar.Q());
        }
    }

    /* access modifiers changed from: package-private */
    public void A(org.maplibre.android.location.b bVar) {
        this.f145941j = bVar;
    }

    public final void B(C18746b bVar) {
        C(bVar, (a) null);
    }

    public final void C(C18746b bVar, a aVar) {
        D();
        this.f145935d.m(this, bVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public void E() {
        if (!this.f145932a.isDestroyed()) {
            E e10 = this.f145943l;
            if (e10 != null) {
                e10.m();
                this.f145941j.i();
                E.b bVar = this.f145940i;
                if (bVar != null) {
                    bVar.a(this.f145943l);
                }
                for (E.b a10 : this.f145938g) {
                    a10.a(this.f145943l);
                }
            } else {
                org.maplibre.android.c.b("No style to provide.");
            }
            this.f145940i = null;
            this.f145938g.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        this.f145940i = null;
    }

    /* access modifiers changed from: package-private */
    public void G() {
        E();
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f145935d.j();
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.f145935d.j();
        this.f145942k.n();
        this.f145942k.a(this);
    }

    /* access modifiers changed from: package-private */
    public void J(Bundle bundle) {
        CameraPosition cameraPosition = (CameraPosition) bundle.getParcelable("maplibre_cameraPosition");
        this.f145933b.A(bundle);
        if (cameraPosition != null) {
            B(org.maplibre.android.camera.a.a(new CameraPosition.a(cameraPosition).b()));
        }
        this.f145932a.i0(bundle.getBoolean("maplibre_debugActive"));
    }

    /* access modifiers changed from: package-private */
    public void K() {
        this.f145945n = true;
        this.f145941j.l();
    }

    /* access modifiers changed from: package-private */
    public void L() {
        CameraPosition j10 = this.f145935d.j();
        if (j10 != null) {
            this.f145933b.n0(j10);
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        this.f145942k.q();
    }

    public List<Feature> N(PointF pointF, String... strArr) {
        return this.f145932a.Z(pointF, strArr, (C16031a) null);
    }

    public void P(CameraPosition cameraPosition) {
        C(org.maplibre.android.camera.a.a(cameraPosition), (a) null);
    }

    public void Q(boolean z10) {
        this.f145944m = z10;
        this.f145932a.i0(z10);
    }

    public void R(double d10, float f10, float f11, long j10) {
        D();
        this.f145935d.o(d10, f10, f11, j10);
    }

    public void S(LatLngBounds latLngBounds) {
        this.f145932a.a0(latLngBounds);
    }

    public void T(double d10) {
        this.f145935d.s(d10);
    }

    public void U(double d10) {
        this.f145935d.u(d10);
    }

    public void V(int i10) {
        this.f145932a.k0(i10);
    }

    public void X(E.a aVar, E.b bVar) {
        this.f145940i = bVar;
        this.f145941j.m();
        E e10 = this.f145943l;
        if (e10 != null) {
            e10.h();
        }
        this.f145943l = aVar.e(this.f145932a);
        if (!TextUtils.isEmpty(aVar.h())) {
            this.f145932a.f0(aVar.h());
        } else if (!TextUtils.isEmpty(aVar.g())) {
            this.f145932a.v(aVar.g());
        } else {
            this.f145932a.v("{\"version\": 8,\"sources\": {},\"layers\": []}");
        }
    }

    public void a(c cVar) {
        this.f145936e.j(cVar);
    }

    public void b(e eVar) {
        this.f145936e.k(eVar);
    }

    public void c(C4251o oVar) {
        this.f145937f.b(oVar);
    }

    public void d(p pVar) {
        this.f145937f.a(pVar);
    }

    @Deprecated
    public void e(Marker marker) {
        this.f145942k.c(marker);
    }

    public final void f(C18746b bVar) {
        g(bVar, 300);
    }

    public final void g(C18746b bVar, int i10) {
        h(bVar, i10, (a) null);
    }

    public final void h(C18746b bVar, int i10, a aVar) {
        i(bVar, i10, true, aVar);
    }

    public final void i(C18746b bVar, int i10, boolean z10, a aVar) {
        if (i10 > 0) {
            D();
            this.f145935d.d(this, bVar, i10, z10, aVar);
            return;
        }
        throw new IllegalArgumentException("Null duration passed into easeCamera");
    }

    public CameraPosition j(Geometry geometry, int[] iArr, double d10, double d11) {
        return this.f145932a.d0(geometry, iArr, d10, d11);
    }

    public CameraPosition k(LatLngBounds latLngBounds, int[] iArr) {
        return l(latLngBounds, iArr, this.f145935d.f(), this.f145935d.h());
    }

    public CameraPosition l(LatLngBounds latLngBounds, int[] iArr, double d10, double d11) {
        return this.f145932a.u(latLngBounds, iArr, d10, d11);
    }

    public final CameraPosition m() {
        return this.f145935d.e();
    }

    public float n() {
        return this.f145934c.b();
    }

    @Deprecated
    public b o() {
        this.f145942k.f().b();
        return null;
    }

    public l p() {
        this.f145942k.f().c();
        return null;
    }

    public m q() {
        this.f145942k.f().d();
        return null;
    }

    public n r() {
        this.f145942k.f().e();
        return null;
    }

    public B s() {
        return this.f145934c;
    }

    public E t() {
        E e10 = this.f145943l;
        if (e10 == null || !e10.l()) {
            return null;
        }
        return this.f145943l;
    }

    public void u(E.b bVar) {
        E e10 = this.f145943l;
        if (e10 == null || !e10.l()) {
            this.f145938g.add(bVar);
        } else {
            bVar.a(this.f145943l);
        }
    }

    public H v() {
        return this.f145933b;
    }

    public float w() {
        return this.f145934c.d();
    }

    public double x() {
        return this.f145932a.e0();
    }

    /* access modifiers changed from: package-private */
    public void y(Context context, p pVar) {
        this.f145935d.i(this, pVar);
        this.f145933b.i(context, pVar);
        Q(pVar.E());
        O(pVar);
        W(pVar);
    }

    /* access modifiers changed from: package-private */
    public void z(C17733b bVar) {
        this.f145942k = bVar.b(this);
    }
}
