package Hd;

import YH.C16877v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ikea.kompassmap.model.store.map.IconMapping;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.E;
import org.maplibre.android.maps.o;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LHd/e;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lorg/maplibre/android/maps/o;", "mapLibreMap", "", "folderName", "", "Lcom/ikea/kompassmap/model/store/map/IconMapping;", "iconsList", "", "selected", "LXH/N;", "a", "(Landroid/content/Context;Lorg/maplibre/android/maps/o;Ljava/lang/String;[Lcom/ikea/kompassmap/model/store/map/IconMapping;Z)V", "Lorg/maplibre/geojson/Feature;", "feature", "Lorg/maplibre/android/geometry/LatLngBounds;", "c", "(Lorg/maplibre/geojson/Feature;)Lorg/maplibre/android/geometry/LatLngBounds;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f60766a = new e();

    private e() {
    }

    public static /* synthetic */ void b(e eVar, Context context, o oVar, String str, IconMapping[] iconMappingArr, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        eVar.a(context, oVar, str, iconMappingArr, z10);
    }

    public final void a(Context context, o oVar, String str, IconMapping[] iconMappingArr, boolean z10) {
        C17542s.j(context, "context");
        C17542s.j(oVar, "mapLibreMap");
        C17542s.j(str, "folderName");
        C17542s.j(iconMappingArr, "iconsList");
        for (IconMapping iconMapping : iconMappingArr) {
            InputStream open = context.getAssets().open(str + '/' + iconMapping.getIconName() + ".png");
            C17542s.i(open, "open(...)");
            Bitmap decodeStream = BitmapFactory.decodeStream(open);
            E t10 = oVar.t();
            if (t10 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iconMapping.getId());
                sb2.append(z10 ? "_selected" : "");
                t10.a(sb2.toString(), decodeStream);
            }
        }
    }

    public final LatLngBounds c(Feature feature) {
        List<Point> list;
        C17542s.j(feature, "feature");
        Geometry geometry = feature.geometry();
        if (geometry instanceof Polygon) {
            Geometry geometry2 = feature.geometry();
            C17542s.h(geometry2, "null cannot be cast to non-null type org.maplibre.geojson.Polygon");
            List coordinates = ((Polygon) geometry2).coordinates();
            C17542s.i(coordinates, "coordinates(...)");
            list = C16877v.A(coordinates);
        } else if (!(geometry instanceof MultiPolygon)) {
            return null;
        } else {
            Geometry geometry3 = feature.geometry();
            C17542s.h(geometry3, "null cannot be cast to non-null type org.maplibre.geojson.MultiPolygon");
            List coordinates2 = ((MultiPolygon) geometry3).coordinates();
            C17542s.i(coordinates2, "coordinates(...)");
            list = C16877v.A(C16877v.A(coordinates2));
        }
        double d10 = Double.MAX_VALUE;
        double d11 = -1.7976931348623157E308d;
        double d12 = -1.7976931348623157E308d;
        double d13 = Double.MAX_VALUE;
        for (Point point : list) {
            d10 = Math.min(d10, point.latitude());
            d11 = Math.max(d11, point.latitude());
            d13 = Math.min(d13, point.longitude());
            d12 = Math.max(d12, point.longitude());
        }
        return new LatLngBounds.a().b(new LatLng(d10, d13)).b(new LatLng(d11, d12)).a();
    }
}
