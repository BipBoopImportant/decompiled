package com.google.gson.internal.bind;

import Qc.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* renamed from: c  reason: collision with root package name */
    private static final v f68965c = new DummyTypeAdapterFactory();

    /* renamed from: d  reason: collision with root package name */
    private static final v f68966d = new DummyTypeAdapterFactory();

    /* renamed from: a  reason: collision with root package name */
    private final c f68967a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, v> f68968b = new ConcurrentHashMap();

    private static class DummyTypeAdapterFactory implements v {
        private DummyTypeAdapterFactory() {
        }

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }
    }

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f68967a = cVar;
    }

    private static Object a(c cVar, Class<?> cls) {
        return cVar.b(TypeToken.get(cls)).a();
    }

    private static b b(Class<?> cls) {
        return (b) cls.getAnnotation(b.class);
    }

    private v e(Class<?> cls, v vVar) {
        v putIfAbsent = this.f68968b.putIfAbsent(cls, vVar);
        return putIfAbsent != null ? putIfAbsent : vVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: com.google.gson.TypeAdapter<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: com.google.gson.TypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: type inference failed for: r8v2, types: [com.google.gson.TypeAdapter<?>, com.google.gson.TypeAdapter] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.TypeAdapter<?> c(com.google.gson.internal.c r8, com.google.gson.Gson r9, com.google.gson.reflect.TypeToken<?> r10, Qc.b r11, boolean r12) {
        /*
            r7 = this;
            java.lang.Class r0 = r11.value()
            java.lang.Object r8 = a(r8, r0)
            boolean r6 = r11.nullSafe()
            boolean r11 = r8 instanceof com.google.gson.TypeAdapter
            if (r11 == 0) goto L_0x0014
            com.google.gson.TypeAdapter r8 = (com.google.gson.TypeAdapter) r8
            goto L_0x0086
        L_0x0014:
            boolean r11 = r8 instanceof com.google.gson.v
            if (r11 == 0) goto L_0x0029
            com.google.gson.v r8 = (com.google.gson.v) r8
            if (r12 == 0) goto L_0x0024
            java.lang.Class r11 = r10.getRawType()
            com.google.gson.v r8 = r7.e(r11, r8)
        L_0x0024:
            com.google.gson.TypeAdapter r8 = r8.create(r9, r10)
            goto L_0x0086
        L_0x0029:
            boolean r11 = r8 instanceof com.google.gson.o
            if (r11 != 0) goto L_0x0062
            boolean r0 = r8 instanceof com.google.gson.i
            if (r0 == 0) goto L_0x0032
            goto L_0x0062
        L_0x0032:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            r11.append(r12)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x0062:
            r0 = 0
            if (r11 == 0) goto L_0x006a
            r11 = r8
            com.google.gson.o r11 = (com.google.gson.o) r11
            r1 = r11
            goto L_0x006b
        L_0x006a:
            r1 = r0
        L_0x006b:
            boolean r11 = r8 instanceof com.google.gson.i
            if (r11 == 0) goto L_0x0073
            com.google.gson.i r8 = (com.google.gson.i) r8
            r2 = r8
            goto L_0x0074
        L_0x0073:
            r2 = r0
        L_0x0074:
            if (r12 == 0) goto L_0x007a
            com.google.gson.v r8 = f68965c
        L_0x0078:
            r5 = r8
            goto L_0x007d
        L_0x007a:
            com.google.gson.v r8 = f68966d
            goto L_0x0078
        L_0x007d:
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r0 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = 0
        L_0x0086:
            if (r8 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x008e
            com.google.gson.TypeAdapter r8 = r8.nullSafe()
        L_0x008e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.c(com.google.gson.internal.c, com.google.gson.Gson, com.google.gson.reflect.TypeToken, Qc.b, boolean):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        b b10 = b(typeToken.getRawType());
        if (b10 == null) {
            return null;
        }
        return c(this.f68967a, gson, typeToken, b10, true);
    }

    public boolean d(TypeToken<?> typeToken, v vVar) {
        Objects.requireNonNull(typeToken);
        Objects.requireNonNull(vVar);
        if (vVar == f68965c) {
            return true;
        }
        Class<? super Object> rawType = typeToken.getRawType();
        v vVar2 = this.f68968b.get(rawType);
        if (vVar2 != null) {
            return vVar2 == vVar;
        }
        b b10 = b(rawType);
        if (b10 == null) {
            return false;
        }
        Class<?> value = b10.value();
        if (!v.class.isAssignableFrom(value)) {
            return false;
        }
        return e(rawType, (v) a(this.f68967a, value)) == vVar;
    }
}
