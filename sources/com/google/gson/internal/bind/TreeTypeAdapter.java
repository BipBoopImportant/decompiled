package com.google.gson.internal.bind;

import Tc.c;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o<T> f69009a;

    /* renamed from: b  reason: collision with root package name */
    private final i<T> f69010b;

    /* renamed from: c  reason: collision with root package name */
    final Gson f69011c;

    /* renamed from: d  reason: collision with root package name */
    private final TypeToken<T> f69012d;

    /* renamed from: e  reason: collision with root package name */
    private final v f69013e;

    /* renamed from: f  reason: collision with root package name */
    private final TreeTypeAdapter<T>.defpackage.b f69014f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f69015g;

    /* renamed from: h  reason: collision with root package name */
    private volatile TypeAdapter<T> f69016h;

    private static final class SingleTypeFactory implements v {

        /* renamed from: a  reason: collision with root package name */
        private final TypeToken<?> f69017a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f69018b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<?> f69019c;

        /* renamed from: d  reason: collision with root package name */
        private final o<?> f69020d;

        /* renamed from: e  reason: collision with root package name */
        private final i<?> f69021e;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z10, Class<?> cls) {
            i<?> iVar = null;
            o<?> oVar = obj instanceof o ? (o) obj : null;
            this.f69020d = oVar;
            iVar = obj instanceof i ? (i) obj : iVar;
            this.f69021e = iVar;
            com.google.gson.internal.a.a((oVar == null && iVar == null) ? false : true);
            this.f69017a = typeToken;
            this.f69018b = z10;
            this.f69019c = cls;
        }

        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.f69017a;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f69018b && this.f69017a.getType() == typeToken.getRawType()) : this.f69019c.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.f69020d, this.f69021e, gson, typeToken, this);
            }
            return null;
        }
    }

    private final class b implements n, h {
        private b() {
        }

        public <R> R a(JsonElement jsonElement, Type type) {
            return TreeTypeAdapter.this.f69011c.j(jsonElement, type);
        }
    }

    public TreeTypeAdapter(o<T> oVar, i<T> iVar, Gson gson, TypeToken<T> typeToken, v vVar, boolean z10) {
        this.f69014f = new b();
        this.f69009a = oVar;
        this.f69010b = iVar;
        this.f69011c = gson;
        this.f69012d = typeToken;
        this.f69013e = vVar;
        this.f69015g = z10;
    }

    private TypeAdapter<T> b() {
        TypeAdapter<T> typeAdapter = this.f69016h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> r10 = this.f69011c.r(this.f69013e, this.f69012d);
        this.f69016h = r10;
        return r10;
    }

    public static v c(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), (Class<?>) null);
    }

    public TypeAdapter<T> a() {
        return this.f69009a != null ? this : b();
    }

    public T read(Tc.a aVar) {
        if (this.f69010b == null) {
            return b().read(aVar);
        }
        JsonElement a10 = com.google.gson.internal.n.a(aVar);
        if (!this.f69015g || !a10.isJsonNull()) {
            return this.f69010b.deserialize(a10, this.f69012d.getType(), this.f69014f);
        }
        return null;
    }

    public void write(c cVar, T t10) {
        o<T> oVar = this.f69009a;
        if (oVar == null) {
            b().write(cVar, t10);
        } else if (!this.f69015g || t10 != null) {
            com.google.gson.internal.n.b(oVar.a(t10, this.f69012d.getType(), this.f69014f), cVar);
        } else {
            cVar.v();
        }
    }

    public TreeTypeAdapter(o<T> oVar, i<T> iVar, Gson gson, TypeToken<T> typeToken, v vVar) {
        this(oVar, iVar, gson, typeToken, vVar, true);
    }
}
