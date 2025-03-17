package Hd;

import Jd.i;
import U0.A1;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;

public final /* synthetic */ class j implements o.C4251o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f60782a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f60783b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MapView f60784c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ A1 f60785d;

    public /* synthetic */ j(o oVar, i iVar, MapView mapView, A1 a12) {
        this.f60782a = oVar;
        this.f60783b = iVar;
        this.f60784c = mapView;
        this.f60785d = a12;
    }

    public final boolean a(LatLng latLng) {
        return l.k(this.f60782a, this.f60783b, this.f60784c, this.f60785d, latLng);
    }
}
