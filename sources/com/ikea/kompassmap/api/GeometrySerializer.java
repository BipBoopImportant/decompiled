package com.ikea.kompassmap.api;

import com.google.gson.JsonElement;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.geojson.Geometry;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ikea/kompassmap/api/GeometrySerializer;", "Lcom/google/gson/o;", "Lorg/maplibre/geojson/Geometry;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/n;", "context", "Lcom/google/gson/JsonElement;", "b", "(Lorg/maplibre/geojson/Geometry;Ljava/lang/reflect/Type;Lcom/google/gson/n;)Lcom/google/gson/JsonElement;", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeometrySerializer implements o<Geometry> {
    /* renamed from: b */
    public JsonElement a(Geometry geometry, Type type, n nVar) {
        C17542s.j(geometry, "src");
        C17542s.j(type, "typeOfSrc");
        C17542s.j(nVar, "context");
        JsonElement d10 = m.d(geometry.toJson());
        C17542s.i(d10, "parseString(...)");
        return d10;
    }
}
