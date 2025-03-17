package com.google.gson.internal.bind;

import Tc.a;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final v f68954c = new v() {
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = b.g(type);
            return new ArrayTypeAdapter(gson, gson.p(TypeToken.get(g10)), b.k(g10));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f68955a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<E> f68956b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f68956b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f68955a = cls;
    }

    public Object read(a aVar) {
        if (aVar.F() == Tc.b.NULL) {
            aVar.x();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.hasNext()) {
            arrayList.add(this.f68956b.read(aVar));
        }
        aVar.i();
        int size = arrayList.size();
        if (!this.f68955a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f68955a, size));
        }
        Object newInstance = Array.newInstance(this.f68955a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void write(c cVar, Object obj) {
        if (obj == null) {
            cVar.v();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f68956b.write(cVar, Array.get(obj, i10));
        }
        cVar.h();
    }
}
