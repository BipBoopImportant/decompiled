package org.maplibre.geojson.gson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import org.maplibre.geojson.BoundingBox;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.GeometryCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiLineString;
import org.maplibre.geojson.MultiPoint;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

@Keep
public abstract class GeoJsonAdapterFactory implements v {

    public static final class GeoJsonAdapterFactoryIml extends GeoJsonAdapterFactory {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Class<? super T> rawType = typeToken.getRawType();
            if (BoundingBox.class.isAssignableFrom(rawType)) {
                return BoundingBox.typeAdapter(gson);
            }
            if (Feature.class.isAssignableFrom(rawType)) {
                return Feature.typeAdapter(gson);
            }
            if (FeatureCollection.class.isAssignableFrom(rawType)) {
                return FeatureCollection.typeAdapter(gson);
            }
            if (GeometryCollection.class.isAssignableFrom(rawType)) {
                return GeometryCollection.typeAdapter(gson);
            }
            if (LineString.class.isAssignableFrom(rawType)) {
                return LineString.typeAdapter(gson);
            }
            if (MultiLineString.class.isAssignableFrom(rawType)) {
                return MultiLineString.typeAdapter(gson);
            }
            if (MultiPoint.class.isAssignableFrom(rawType)) {
                return MultiPoint.typeAdapter(gson);
            }
            if (MultiPolygon.class.isAssignableFrom(rawType)) {
                return MultiPolygon.typeAdapter(gson);
            }
            if (Polygon.class.isAssignableFrom(rawType)) {
                return Polygon.typeAdapter(gson);
            }
            if (Point.class.isAssignableFrom(rawType)) {
                return Point.typeAdapter(gson);
            }
            return null;
        }
    }

    public static v create() {
        return new GeoJsonAdapterFactoryIml();
    }

    public abstract /* synthetic */ TypeAdapter create(Gson gson, TypeToken typeToken);
}
