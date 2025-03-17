package org.maplibre.android.maps;

import android.graphics.PointF;
import org.maplibre.android.geometry.LatLng;

public class B {

    /* renamed from: a  reason: collision with root package name */
    private final v f145697a;

    /* renamed from: b  reason: collision with root package name */
    private final MapView f145698b;

    B(v vVar, MapView mapView) {
        this.f145697a = vVar;
        this.f145698b = mapView;
    }

    public LatLng a(PointF pointF) {
        return this.f145697a.x(pointF);
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return (float) this.f145698b.getHeight();
    }

    public double c(double d10) {
        return this.f145697a.P(d10);
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return (float) this.f145698b.getWidth();
    }

    public PointF e(LatLng latLng) {
        return this.f145697a.K(latLng);
    }
}
