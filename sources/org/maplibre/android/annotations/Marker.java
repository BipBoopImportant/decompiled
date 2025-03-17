package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.k;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;
import wL.C18566a;
import wL.C18567b;

@Deprecated
public class Marker extends C18566a {

    /* renamed from: d  reason: collision with root package name */
    private String f145460d;

    /* renamed from: e  reason: collision with root package name */
    private C18567b f145461e;

    /* renamed from: f  reason: collision with root package name */
    private String f145462f;

    /* renamed from: g  reason: collision with root package name */
    private c f145463g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f145464h;

    /* renamed from: i  reason: collision with root package name */
    private int f145465i;
    @Keep
    private String iconId;

    /* renamed from: j  reason: collision with root package name */
    private int f145466j;
    @Keep
    private LatLng position;

    Marker() {
    }

    private c C(MapView mapView) {
        if (this.f145463g == null && mapView.getContext() != null) {
            this.f145463g = new c(mapView, k.f145538b, j());
        }
        return this.f145463g;
    }

    private c J(c cVar, MapView mapView) {
        cVar.j(mapView, this, D(), this.f145466j, this.f145465i);
        this.f145464h = true;
        return cVar;
    }

    public C18567b B() {
        return this.f145461e;
    }

    public LatLng D() {
        return this.position;
    }

    public String E() {
        return this.f145460d;
    }

    public String F() {
        return this.f145462f;
    }

    public void G() {
        c cVar = this.f145463g;
        if (cVar != null) {
            cVar.f();
        }
        this.f145464h = false;
    }

    public boolean H() {
        return this.f145464h;
    }

    public void I(int i10) {
        this.f145465i = i10;
    }

    public c K(o oVar, MapView mapView) {
        n(oVar);
        v(mapView);
        j().o();
        c C10 = C(mapView);
        if (mapView.getContext() != null) {
            C10.e(this, oVar, mapView);
        }
        return J(C10, mapView);
    }

    public String toString() {
        return "Marker [position[" + D() + "]]";
    }
}
