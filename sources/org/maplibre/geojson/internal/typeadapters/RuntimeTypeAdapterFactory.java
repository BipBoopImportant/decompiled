package org.maplibre.geojson.internal.typeadapters;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.n;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.LinkedHashMap;
import java.util.Map;

@Keep
public final class RuntimeTypeAdapterFactory<T> implements v {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final boolean maintainType;
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z10) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z10;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z10) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z10);
    }

    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            TypeAdapter r10 = gson.r(this, TypeToken.get((Class) next.getValue()));
            linkedHashMap.put(next.getKey(), r10);
            linkedHashMap2.put(next.getValue(), r10);
        }
        return new TypeAdapter<R>() {
            public R read(a aVar) {
                JsonElement a10 = n.a(aVar);
                JsonElement remove = RuntimeTypeAdapterFactory.this.maintainType ? a10.getAsJsonObject().get(RuntimeTypeAdapterFactory.this.typeFieldName) : a10.getAsJsonObject().remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (remove != null) {
                    String asString = remove.getAsString();
                    TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(asString);
                    if (typeAdapter != null) {
                        return typeAdapter.fromJsonTree(a10);
                    }
                    throw new l("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + asString + "; did you forget to register a subtype?");
                }
                throw new l("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }

            public void write(c cVar, R r10) {
                Class<?> cls = r10.getClass();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter != null) {
                    JsonObject asJsonObject = typeAdapter.toJsonTree(r10).getAsJsonObject();
                    if (RuntimeTypeAdapterFactory.this.maintainType) {
                        n.b(asJsonObject, cVar);
                        return;
                    }
                    JsonObject jsonObject = new JsonObject();
                    if (!asJsonObject.has(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                        jsonObject.add(RuntimeTypeAdapterFactory.this.typeFieldName, new JsonPrimitive((String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls)));
                        for (Map.Entry next : asJsonObject.entrySet()) {
                            jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
                        }
                        n.b(jsonObject, cVar);
                        return;
                    }
                    throw new l("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                throw new l("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
