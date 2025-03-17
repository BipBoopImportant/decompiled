package com.ikea.kompassmap.api;

import com.google.gson.JsonElement;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.l;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ikea/kompassmap/api/GeometryDeserializer;", "Lcom/google/gson/i;", "Lorg/maplibre/geojson/Geometry;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/h;", "context", "a", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/h;)Lorg/maplibre/geojson/Geometry;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeometryDeserializer implements i<Geometry> {
    /* renamed from: a */
    public Geometry deserialize(JsonElement jsonElement, Type type, h hVar) {
        C17542s.j(jsonElement, FeatureVariable.JSON_TYPE);
        C17542s.j(type, "typeOfT");
        C17542s.j(hVar, "context");
        String asString = jsonElement.getAsJsonObject().get("type").getAsString();
        if (asString != null) {
            switch (asString.hashCode()) {
                case -2116761119:
                    if (asString.equals("MultiPolygon")) {
                        MultiPolygon fromJson = MultiPolygon.fromJson(jsonElement.toString());
                        C17542s.i(fromJson, "fromJson(...)");
                        return fromJson;
                    }
                    break;
                case 77292912:
                    if (asString.equals("Point")) {
                        Point fromJson2 = Point.fromJson(jsonElement.toString());
                        C17542s.i(fromJson2, "fromJson(...)");
                        return fromJson2;
                    }
                    break;
                case 1267133722:
                    if (asString.equals("Polygon")) {
                        Polygon fromJson3 = Polygon.fromJson(jsonElement.toString());
                        C17542s.i(fromJson3, "fromJson(...)");
                        return fromJson3;
                    }
                    break;
                case 1806700869:
                    if (asString.equals("LineString")) {
                        LineString fromJson4 = LineString.fromJson(jsonElement.toString());
                        C17542s.i(fromJson4, "fromJson(...)");
                        return fromJson4;
                    }
                    break;
            }
        }
        throw new l("Unknown geometry type: " + asString);
    }
}
