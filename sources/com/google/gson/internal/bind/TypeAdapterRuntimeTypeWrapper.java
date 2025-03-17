package com.google.gson.internal.bind;

import Tc.a;
import Tc.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Gson f69023a;

    /* renamed from: b  reason: collision with root package name */
    private final TypeAdapter<T> f69024b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f69025c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f69023a = gson;
        this.f69024b = typeAdapter;
        this.f69025c = type;
    }

    private static Type a(Type type, Object obj) {
        return obj != null ? ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type : type;
    }

    private static boolean b(TypeAdapter<?> typeAdapter) {
        TypeAdapter<?> a10;
        while ((typeAdapter instanceof SerializationDelegatingTypeAdapter) && (a10 = ((SerializationDelegatingTypeAdapter) typeAdapter).a()) != typeAdapter) {
            typeAdapter = a10;
        }
        return typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter;
    }

    public T read(a aVar) {
        return this.f69024b.read(aVar);
    }

    public void write(c cVar, T t10) {
        TypeAdapter<T> typeAdapter = this.f69024b;
        Type a10 = a(this.f69025c, t10);
        if (a10 != this.f69025c) {
            typeAdapter = this.f69023a.p(TypeToken.get(a10));
            if ((typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) && !b(this.f69024b)) {
                typeAdapter = this.f69024b;
            }
        }
        typeAdapter.write(cVar, t10);
    }
}
