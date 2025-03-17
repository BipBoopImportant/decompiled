package com.google.gson.internal.bind;

import Tc.a;
import Tc.b;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.j;
import com.google.gson.internal.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    private final c f68969a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f68970b;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final TypeAdapter<K> f68971a;

        /* renamed from: b  reason: collision with root package name */
        private final TypeAdapter<V> f68972b;

        /* renamed from: c  reason: collision with root package name */
        private final j<? extends Map<K, V>> f68973c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, j<? extends Map<K, V>> jVar) {
            this.f68971a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f68972b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f68973c = jVar;
        }

        private String a(JsonElement jsonElement) {
            if (jsonElement.isJsonPrimitive()) {
                JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    return String.valueOf(asJsonPrimitive.getAsNumber());
                }
                if (asJsonPrimitive.isBoolean()) {
                    return Boolean.toString(asJsonPrimitive.getAsBoolean());
                }
                if (asJsonPrimitive.isString()) {
                    return asJsonPrimitive.getAsString();
                }
                throw new AssertionError();
            } else if (jsonElement.isJsonNull()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        public Map<K, V> read(a aVar) {
            b F10 = aVar.F();
            if (F10 == b.NULL) {
                aVar.x();
                return null;
            }
            Map<K, V> map = (Map) this.f68973c.a();
            if (F10 == b.BEGIN_ARRAY) {
                aVar.d();
                while (aVar.hasNext()) {
                    aVar.d();
                    K read = this.f68971a.read(aVar);
                    if (map.put(read, this.f68972b.read(aVar)) == null) {
                        aVar.i();
                    } else {
                        throw new p("duplicate key: " + read);
                    }
                }
                aVar.i();
            } else {
                aVar.e();
                while (aVar.hasNext()) {
                    e.f69131a.a(aVar);
                    K read2 = this.f68971a.read(aVar);
                    if (map.put(read2, this.f68972b.read(aVar)) != null) {
                        throw new p("duplicate key: " + read2);
                    }
                }
                aVar.l();
            }
            return map;
        }

        /* renamed from: c */
        public void write(Tc.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.v();
            } else if (!MapTypeAdapterFactory.this.f68970b) {
                cVar.f();
                for (Map.Entry next : map.entrySet()) {
                    cVar.t(String.valueOf(next.getKey()));
                    this.f68972b.write(cVar, next.getValue());
                }
                cVar.i();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry next2 : map.entrySet()) {
                    JsonElement jsonTree = this.f68971a.toJsonTree(next2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(next2.getValue());
                    z10 |= jsonTree.isJsonArray() || jsonTree.isJsonObject();
                }
                if (z10) {
                    cVar.e();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.e();
                        n.b((JsonElement) arrayList.get(i10), cVar);
                        this.f68972b.write(cVar, arrayList2.get(i10));
                        cVar.h();
                        i10++;
                    }
                    cVar.h();
                    return;
                }
                cVar.f();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.t(a((JsonElement) arrayList.get(i10)));
                    this.f68972b.write(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.i();
            }
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z10) {
        this.f68969a = cVar;
        this.f68970b = z10;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f69055f : gson.p(TypeToken.get(type));
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j10 = com.google.gson.internal.b.j(type, rawType);
        return new Adapter(gson, j10[0], a(gson, j10[0]), j10[1], gson.p(TypeToken.get(j10[1])), this.f68969a.b(typeToken));
    }
}
