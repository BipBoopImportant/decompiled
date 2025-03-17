package KL;

import CL.c;
import android.graphics.PointF;
import com.google.gson.JsonObject;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.B;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.Point;

public class k extends C15997a<Point> {

    /* renamed from: d  reason: collision with root package name */
    private final C15999c<?, k, ?, ?, ?, ?> f135980d;

    k(long j10, C15999c<?, k, ?, ?, ?, ?> cVar, JsonObject jsonObject, Point point) {
        super(j10, jsonObject, point);
        this.f135980d = cVar;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return "Symbol";
    }

    /* access modifiers changed from: package-private */
    public Geometry e(B b10, c cVar, float f10, float f11) {
        LatLng a10 = b10.a(new PointF(cVar.b() - f10, cVar.c() - f11));
        if (a10.a() > 85.05112877980659d || a10.a() < -85.05112877980659d) {
            return null;
        }
        return Point.fromLngLat(a10.b(), a10.a());
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!(this.f135938a.get("symbol-sort-key") instanceof com.google.gson.k)) {
            this.f135980d.i("symbol-sort-key");
        }
        if (!(this.f135938a.get("icon-size") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-size");
        }
        if (!(this.f135938a.get("icon-image") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-image");
        }
        if (!(this.f135938a.get("icon-rotate") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-rotate");
        }
        if (!(this.f135938a.get("icon-offset") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-offset");
        }
        if (!(this.f135938a.get("icon-anchor") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-anchor");
        }
        if (!(this.f135938a.get("text-field") instanceof com.google.gson.k)) {
            this.f135980d.i("text-field");
        }
        if (!(this.f135938a.get("text-font") instanceof com.google.gson.k)) {
            this.f135980d.i("text-font");
        }
        if (!(this.f135938a.get("text-size") instanceof com.google.gson.k)) {
            this.f135980d.i("text-size");
        }
        if (!(this.f135938a.get("text-max-width") instanceof com.google.gson.k)) {
            this.f135980d.i("text-max-width");
        }
        if (!(this.f135938a.get("text-letter-spacing") instanceof com.google.gson.k)) {
            this.f135980d.i("text-letter-spacing");
        }
        if (!(this.f135938a.get("text-justify") instanceof com.google.gson.k)) {
            this.f135980d.i("text-justify");
        }
        if (!(this.f135938a.get("text-radial-offset") instanceof com.google.gson.k)) {
            this.f135980d.i("text-radial-offset");
        }
        if (!(this.f135938a.get("text-anchor") instanceof com.google.gson.k)) {
            this.f135980d.i("text-anchor");
        }
        if (!(this.f135938a.get("text-rotate") instanceof com.google.gson.k)) {
            this.f135980d.i("text-rotate");
        }
        if (!(this.f135938a.get("text-transform") instanceof com.google.gson.k)) {
            this.f135980d.i("text-transform");
        }
        if (!(this.f135938a.get("text-offset") instanceof com.google.gson.k)) {
            this.f135980d.i("text-offset");
        }
        if (!(this.f135938a.get("icon-opacity") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-opacity");
        }
        if (!(this.f135938a.get("icon-color") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-color");
        }
        if (!(this.f135938a.get("icon-halo-color") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-halo-color");
        }
        if (!(this.f135938a.get("icon-halo-width") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-halo-width");
        }
        if (!(this.f135938a.get("icon-halo-blur") instanceof com.google.gson.k)) {
            this.f135980d.i("icon-halo-blur");
        }
        if (!(this.f135938a.get("text-opacity") instanceof com.google.gson.k)) {
            this.f135980d.i("text-opacity");
        }
        if (!(this.f135938a.get("text-color") instanceof com.google.gson.k)) {
            this.f135980d.i("text-color");
        }
        if (!(this.f135938a.get("text-halo-color") instanceof com.google.gson.k)) {
            this.f135980d.i("text-halo-color");
        }
        if (!(this.f135938a.get("text-halo-width") instanceof com.google.gson.k)) {
            this.f135980d.i("text-halo-width");
        }
        if (!(this.f135938a.get("text-halo-blur") instanceof com.google.gson.k)) {
            this.f135980d.i("text-halo-blur");
        }
    }
}
