package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;

public abstract class j<SerializationT extends q> {

    /* renamed from: a  reason: collision with root package name */
    private final Eb.a f67870a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f67871b;

    class a extends j<SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f67872c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Eb.a aVar, Class cls, b bVar) {
            super(aVar, cls, (a) null);
            this.f67872c = bVar;
        }
    }

    public interface b<SerializationT extends q> {
    }

    /* synthetic */ j(Eb.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> j<SerializationT> a(b<SerializationT> bVar, Eb.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final Eb.a b() {
        return this.f67870a;
    }

    public final Class<SerializationT> c() {
        return this.f67871b;
    }

    private j(Eb.a aVar, Class<SerializationT> cls) {
        this.f67870a = aVar;
        this.f67871b = cls;
    }
}
