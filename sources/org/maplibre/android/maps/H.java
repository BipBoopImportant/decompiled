package org.maplibre.android.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.g;
import org.maplibre.android.h;
import org.maplibre.android.i;
import org.maplibre.android.maps.widgets.CompassView;
import org.maplibre.android.utils.a;
import org.maplibre.android.utils.b;
import u2.C6012a;
import w2.C6214h;

public final class H {

    /* renamed from: A  reason: collision with root package name */
    private long f145730A = 150;

    /* renamed from: B  reason: collision with root package name */
    private long f145731B = 1000;

    /* renamed from: C  reason: collision with root package name */
    private PointF f145732C;

    /* renamed from: D  reason: collision with root package name */
    boolean f145733D = false;

    /* renamed from: E  reason: collision with root package name */
    boolean f145734E = false;

    /* renamed from: F  reason: collision with root package name */
    boolean f145735F = false;

    /* renamed from: G  reason: collision with root package name */
    private double f145736G;

    /* renamed from: a  reason: collision with root package name */
    private final C17737f f145737a;

    /* renamed from: b  reason: collision with root package name */
    private final MapView f145738b;

    /* renamed from: c  reason: collision with root package name */
    private final B f145739c;

    /* renamed from: d  reason: collision with root package name */
    CompassView f145740d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f145741e = new int[4];

    /* renamed from: f  reason: collision with root package name */
    ImageView f145742f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f145743g = new int[4];

    /* renamed from: h  reason: collision with root package name */
    private C17735d f145744h;

    /* renamed from: i  reason: collision with root package name */
    ImageView f145745i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f145746j = new int[4];

    /* renamed from: k  reason: collision with root package name */
    private final float f145747k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f145748l = true;

    /* renamed from: m  reason: collision with root package name */
    private boolean f145749m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f145750n = true;

    /* renamed from: o  reason: collision with root package name */
    private boolean f145751o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f145752p = true;

    /* renamed from: q  reason: collision with root package name */
    private boolean f145753q = true;

    /* renamed from: r  reason: collision with root package name */
    private boolean f145754r = true;

    /* renamed from: s  reason: collision with root package name */
    private boolean f145755s = true;

    /* renamed from: t  reason: collision with root package name */
    private boolean f145756t = true;

    /* renamed from: u  reason: collision with root package name */
    private boolean f145757u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f145758v = true;

    /* renamed from: w  reason: collision with root package name */
    private boolean f145759w = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f145760x = true;

    /* renamed from: y  reason: collision with root package name */
    private float f145761y = 1.0f;

    /* renamed from: z  reason: collision with root package name */
    private boolean f145762z = true;

    H(B b10, C17737f fVar, float f10, MapView mapView) {
        this.f145739c = b10;
        this.f145737a = fVar;
        this.f145747k = f10;
        this.f145738b = mapView;
    }

    private void B(Bundle bundle) {
        if (bundle.getBoolean("maplibre_atrrEnabled") && !this.f145734E) {
            this.f145742f = this.f145738b.s();
            this.f145734E = true;
        }
        H(bundle.getBoolean("maplibre_atrrEnabled"));
        I(bundle.getInt("maplibre_attrGravity"));
        J(bundle.getInt("maplibre_attrMarginLeft"), bundle.getInt("maplibre_attrMarginTop"), bundle.getInt("maplibre_attrMarginRight"), bundle.getInt("maplibre_atrrMarginBottom"));
    }

    private void C(Bundle bundle) {
        if (bundle.getBoolean("maplibre_compassEnabled") && !this.f145733D) {
            this.f145740d = this.f145738b.t();
            this.f145733D = true;
        }
        M(bundle.getBoolean("maplibre_compassEnabled"));
        O(bundle.getInt("maplibre_compassGravity"));
        Q(bundle.getInt("maplibre_compassMarginLeft"), bundle.getInt("maplibre_compassMarginTop"), bundle.getInt("maplibre_compassMarginRight"), bundle.getInt("maplibre_compassMarginBottom"));
        N(bundle.getBoolean("maplibre_compassFade"));
        P(a.c(this.f145738b.getContext(), bundle.getByteArray("maplibre_compassImage")));
    }

    private void D(Bundle bundle) {
        R(bundle.getBoolean("maplibre_deselectMarkerOnTap"));
    }

    private void E(Bundle bundle) {
        PointF pointF = (PointF) bundle.getParcelable("maplibre_userFocalPoint");
        if (pointF != null) {
            V(pointF);
        }
    }

    private void F(Bundle bundle) {
        W(bundle.getBoolean("maplibre_horizontalScrollEnabled"));
        l0(bundle.getBoolean("maplibre_zoomEnabled"));
        h0(bundle.getBoolean("maplibre_scrollEnabled"));
        e0(bundle.getBoolean("maplibre_rotateEnabled"));
        i0(bundle.getBoolean("maplibre_tiltEnabled"));
        T(bundle.getBoolean("maplibre_doubleTapEnabled"));
        g0(bundle.getBoolean("maplibre_scaleAnimationEnabled"));
        f0(bundle.getBoolean("maplibre_rotateAnimationEnabled"));
        U(bundle.getBoolean("maplibre_flingAnimationEnabled"));
        X(bundle.getBoolean("maplibre_increaseRotateThreshold"));
        S(bundle.getBoolean("maplibre_disableRotateWhenScaling"));
        Y(bundle.getBoolean("maplibre_increaseScaleThreshold"));
        d0(bundle.getBoolean("maplibre_quickZoom"));
        m0(bundle.getFloat("maplibre_zoomRate", 1.0f));
    }

    private void G(Bundle bundle) {
        if (bundle.getBoolean("maplibre_logoEnabled") && !this.f145735F) {
            this.f145745i = this.f145738b.u();
            this.f145735F = true;
        }
        Z(bundle.getBoolean("maplibre_logoEnabled"));
        a0(bundle.getInt("maplibre_logoGravity"));
        b0(bundle.getInt("maplibre_logoMarginLeft"), bundle.getInt("maplibre_logoMarginTop"), bundle.getInt("maplibre_logoMarginRight"), bundle.getInt("maplibre_logoMarginBottom"));
    }

    private void K(Context context, int[] iArr) {
        if (iArr != null) {
            J(iArr[0], iArr[1], iArr[2], iArr[3]);
            return;
        }
        Resources resources = context.getResources();
        int dimension = (int) resources.getDimension(h.f145521d);
        J((int) resources.getDimension(h.f145529l), dimension, dimension, dimension);
    }

    private void c0(Resources resources, int[] iArr) {
        if (iArr != null) {
            b0(iArr[0], iArr[1], iArr[2], iArr[3]);
            return;
        }
        int dimension = (int) resources.getDimension(h.f145521d);
        b0(dimension, dimension, dimension, dimension);
    }

    private void j(Context context, p pVar) {
        this.f145734E = true;
        this.f145742f = this.f145738b.s();
        H(pVar.t());
        I(pVar.u());
        K(context, pVar.v());
        int w10 = pVar.w();
        if (w10 == -1) {
            w10 = b.c(context);
        }
        L(w10);
    }

    private void j0(View view, int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i10;
        view.setLayoutParams(layoutParams);
    }

    private void k(p pVar, Resources resources) {
        this.f145733D = true;
        this.f145740d = this.f145738b.t();
        M(pVar.y());
        O(pVar.A());
        int[] C10 = pVar.C();
        if (C10 != null) {
            Q(C10[0], C10[1], C10[2], C10[3]);
        } else {
            int dimension = (int) resources.getDimension(h.f145521d);
            Q(dimension, dimension, dimension, dimension);
        }
        N(pVar.z());
        if (pVar.B() == null) {
            pVar.k(C6214h.e(resources, i.f145532a, (Resources.Theme) null));
        }
        P(pVar.B());
    }

    private void k0(View view, int[] iArr, int i10, int i11, int i12, int i13) {
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i10, i11, i12, i13);
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(i12);
        view.setLayoutParams(layoutParams);
    }

    private void l(p pVar) {
        l0(pVar.Z());
        h0(pVar.V());
        W(pVar.H());
        e0(pVar.U());
        i0(pVar.X());
        T(pVar.F());
        d0(pVar.S());
    }

    private void m(p pVar, Resources resources) {
        this.f145735F = true;
        this.f145745i = this.f145738b.u();
        Z(pVar.J());
        a0(pVar.K());
        c0(resources, pVar.L());
    }

    /* access modifiers changed from: package-private */
    public void A(Bundle bundle) {
        F(bundle);
        C(bundle);
        G(bundle);
        B(bundle);
        D(bundle);
        E(bundle);
    }

    public void H(boolean z10) {
        if (z10 && !this.f145734E) {
            j(this.f145738b.getContext(), this.f145738b.f145770h);
        }
        ImageView imageView = this.f145742f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void I(int i10) {
        ImageView imageView = this.f145742f;
        if (imageView != null) {
            j0(imageView, i10);
        }
    }

    public void J(int i10, int i11, int i12, int i13) {
        ImageView imageView = this.f145742f;
        if (imageView != null) {
            k0(imageView, this.f145743g, i10, i11, i12, i13);
        }
    }

    public void L(int i10) {
        if (this.f145742f != null) {
            if (Color.alpha(i10) == 0) {
                ImageView imageView = this.f145742f;
                b.e(imageView, C6012a.c(imageView.getContext(), g.f145510a));
                return;
            }
            b.e(this.f145742f, i10);
        }
    }

    public void M(boolean z10) {
        if (z10 && !this.f145733D) {
            MapView mapView = this.f145738b;
            k(mapView.f145770h, mapView.getContext().getResources());
        }
        CompassView compassView = this.f145740d;
        if (compassView != null) {
            compassView.setEnabled(z10);
            this.f145740d.i(this.f145736G);
        }
    }

    public void N(boolean z10) {
        CompassView compassView = this.f145740d;
        if (compassView != null) {
            compassView.a(z10);
        }
    }

    public void O(int i10) {
        CompassView compassView = this.f145740d;
        if (compassView != null) {
            j0(compassView, i10);
        }
    }

    public void P(Drawable drawable) {
        CompassView compassView = this.f145740d;
        if (compassView != null) {
            compassView.setCompassImage(drawable);
        }
    }

    public void Q(int i10, int i11, int i12, int i13) {
        CompassView compassView = this.f145740d;
        if (compassView != null) {
            k0(compassView, this.f145741e, i10, i11, i12, i13);
        }
    }

    public void R(boolean z10) {
        this.f145762z = z10;
    }

    public void S(boolean z10) {
        this.f145759w = z10;
    }

    public void T(boolean z10) {
        this.f145753q = z10;
    }

    public void U(boolean z10) {
        this.f145757u = z10;
    }

    public void V(PointF pointF) {
        this.f145732C = pointF;
        this.f145737a.a(pointF);
    }

    public void W(boolean z10) {
        this.f145752p = z10;
    }

    @Deprecated
    public void X(boolean z10) {
        this.f145758v = z10;
    }

    public void Y(boolean z10) {
        this.f145760x = z10;
    }

    public void Z(boolean z10) {
        if (z10 && !this.f145735F) {
            MapView mapView = this.f145738b;
            m(mapView.f145770h, mapView.getContext().getResources());
        }
        ImageView imageView = this.f145745i;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public C17735d a() {
        return this.f145744h;
    }

    public void a0(int i10) {
        ImageView imageView = this.f145745i;
        if (imageView != null) {
            j0(imageView, i10);
        }
    }

    public long b() {
        return this.f145730A;
    }

    public void b0(int i10, int i11, int i12, int i13) {
        ImageView imageView = this.f145745i;
        if (imageView != null) {
            k0(imageView, this.f145746j, i10, i11, i12, i13);
        }
    }

    public long c() {
        return this.f145731B;
    }

    public PointF d() {
        return this.f145732C;
    }

    public void d0(boolean z10) {
        this.f145754r = z10;
    }

    public float e() {
        return this.f145739c.b();
    }

    public void e0(boolean z10) {
        this.f145748l = z10;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f145747k;
    }

    public void f0(boolean z10) {
        this.f145756t = z10;
    }

    public float g() {
        return this.f145739c.d();
    }

    public void g0(boolean z10) {
        this.f145755s = z10;
    }

    public float h() {
        return this.f145761y;
    }

    public void h0(boolean z10) {
        this.f145751o = z10;
    }

    /* access modifiers changed from: package-private */
    public void i(Context context, p pVar) {
        Resources resources = context.getResources();
        l(pVar);
        if (pVar.y()) {
            k(pVar, resources);
        }
        if (pVar.J()) {
            m(pVar, resources);
        }
        if (pVar.t()) {
            j(context, pVar);
        }
    }

    public void i0(boolean z10) {
        this.f145749m = z10;
    }

    public void l0(boolean z10) {
        this.f145750n = z10;
    }

    public void m0(float f10) {
        this.f145761y = f10;
    }

    public boolean n() {
        return this.f145762z;
    }

    /* access modifiers changed from: package-private */
    public void n0(CameraPosition cameraPosition) {
        double d10 = -cameraPosition.bearing;
        this.f145736G = d10;
        CompassView compassView = this.f145740d;
        if (compassView != null) {
            compassView.i(d10);
        }
    }

    public boolean o() {
        return this.f145759w;
    }

    public boolean p() {
        return this.f145753q;
    }

    public boolean q() {
        return this.f145757u;
    }

    public boolean r() {
        return this.f145752p;
    }

    public boolean s() {
        return this.f145760x;
    }

    public boolean t() {
        return this.f145754r;
    }

    public boolean u() {
        return this.f145748l;
    }

    public boolean v() {
        return this.f145756t;
    }

    public boolean w() {
        return this.f145755s;
    }

    public boolean x() {
        return this.f145751o;
    }

    public boolean y() {
        return this.f145749m;
    }

    public boolean z() {
        return this.f145750n;
    }
}
