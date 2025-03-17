package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.q;
import qb.C10162g;
import qb.C10180y;

public abstract class b<SerializationT extends q> {

    /* renamed from: a  reason: collision with root package name */
    private final Eb.a f67846a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<SerializationT> f67847b;

    class a extends b<SerializationT> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1173b f67848c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Eb.a aVar, Class cls, C1173b bVar) {
            super(aVar, cls, (a) null);
            this.f67848c = bVar;
        }

        public C10162g d(SerializationT serializationt, C10180y yVar) {
            return this.f67848c.a(serializationt, yVar);
        }
    }

    /* renamed from: com.google.crypto.tink.internal.b$b  reason: collision with other inner class name */
    public interface C1173b<SerializationT extends q> {
        C10162g a(SerializationT serializationt, C10180y yVar);
    }

    /* synthetic */ b(Eb.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends q> b<SerializationT> a(C1173b<SerializationT> bVar, Eb.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final Eb.a b() {
        return this.f67846a;
    }

    public final Class<SerializationT> c() {
        return this.f67847b;
    }

    public abstract C10162g d(SerializationT serializationt, C10180y yVar);

    private b(Eb.a aVar, Class<SerializationT> cls) {
        this.f67846a = aVar;
        this.f67847b = cls;
    }
}
