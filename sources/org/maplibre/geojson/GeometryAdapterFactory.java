package org.maplibre.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import org.maplibre.geojson.internal.typeadapters.RuntimeTypeAdapterFactory;

@Keep
public abstract class GeometryAdapterFactory implements v {
    private static v geometryTypeFactory;

    public static v create() {
        if (geometryTypeFactory == null) {
            geometryTypeFactory = RuntimeTypeAdapterFactory.of(Geometry.class, "type", true).registerSubtype(GeometryCollection.class, "GeometryCollection").registerSubtype(Point.class, "Point").registerSubtype(MultiPoint.class, "MultiPoint").registerSubtype(LineString.class, "LineString").registerSubtype(MultiLineString.class, "MultiLineString").registerSubtype(Polygon.class, "Polygon").registerSubtype(MultiPolygon.class, "MultiPolygon");
        }
        return geometryTypeFactory;
    }

    public abstract /* synthetic */ TypeAdapter create(Gson gson, TypeToken typeToken);
}
