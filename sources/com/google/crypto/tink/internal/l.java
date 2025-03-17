package com.google.crypto.tink.internal;

import qb.C10162g;

public abstract class l<KeyT extends C10162g, PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyT> f67876a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f67877b;

    class a extends l<KeyT, PrimitiveT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f67878c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, (a) null);
            this.f67878c = bVar;
        }

        public PrimitiveT a(KeyT keyt) {
            return this.f67878c.a(keyt);
        }
    }

    public interface b<KeyT extends C10162g, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends C10162g, PrimitiveT> l<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract PrimitiveT a(KeyT keyt);

    public Class<KeyT> c() {
        return this.f67876a;
    }

    public Class<PrimitiveT> d() {
        return this.f67877b;
    }

    private l(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f67876a = cls;
        this.f67877b = cls2;
    }
}
