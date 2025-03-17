package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import qb.C10176u;

public abstract class k<ParametersT extends C10176u, SerializationT extends q> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<ParametersT> f67873a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f67874b;

    class a extends k<ParametersT, SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f67875c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, (a) null);
            this.f67875c = bVar;
        }
    }

    public interface b<ParametersT extends C10176u, SerializationT extends q> {
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends C10176u, SerializationT extends q> k<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f67873a;
    }

    public Class<SerializationT> c() {
        return this.f67874b;
    }

    private k(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f67873a = cls;
        this.f67874b = cls2;
    }
}
