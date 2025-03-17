package org.maplibre.geojson.gson;

import androidx.annotation.Keep;
import com.google.gson.f;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.GeometryAdapterFactory;

@Keep
public class GeometryGeoJson {
    public static Geometry fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        fVar.e(GeometryAdapterFactory.create());
        return (Geometry) fVar.b().n(str, Geometry.class);
    }
}
