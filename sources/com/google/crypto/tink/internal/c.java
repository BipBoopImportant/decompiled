package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import qb.C10162g;

public abstract class c<KeyT extends C10162g, SerializationT extends q> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyT> f67849a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f67850b;

    class a extends c<KeyT, SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f67851c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, (a) null);
            this.f67851c = bVar;
        }
    }

    public interface b<KeyT extends C10162g, SerializationT extends q> {
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends C10162g, SerializationT extends q> c<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f67849a;
    }

    public Class<SerializationT> c() {
        return this.f67850b;
    }

    private c(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f67849a = cls;
        this.f67850b = cls2;
    }
}
