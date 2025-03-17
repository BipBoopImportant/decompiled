package com.google.gson.internal.bind;

import Tc.a;
import Tc.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    private final c f68957a;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final TypeAdapter<E> f68958a;

        /* renamed from: b  reason: collision with root package name */
        private final j<? extends Collection<E>> f68959b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, j<? extends Collection<E>> jVar) {
            this.f68958a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f68959b = jVar;
        }

        /* renamed from: a */
        public Collection<E> read(a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.x();
                return null;
            }
            Collection<E> collection = (Collection) this.f68959b.a();
            aVar.d();
            while (aVar.hasNext()) {
                collection.add(this.f68958a.read(aVar));
            }
            aVar.i();
            return collection;
        }

        /* renamed from: b */
        public void write(Tc.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.v();
                return;
            }
            cVar.e();
            for (E write : collection) {
                this.f68958a.write(cVar, write);
            }
            cVar.h();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f68957a = cVar;
    }

    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = com.google.gson.internal.b.h(type, rawType);
        return new Adapter(gson, h10, gson.p(TypeToken.get(h10)), this.f68957a.b(typeToken));
    }
}
