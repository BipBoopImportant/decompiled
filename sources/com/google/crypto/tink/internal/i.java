package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.r;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import qb.C10162g;
import qb.C10176u;
import qb.C10180y;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    private static final i f67868b = new i();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<r> f67869a = new AtomicReference<>(new r.b().e());

    public static i a() {
        return f67868b;
    }

    public <SerializationT extends q> boolean b(SerializationT serializationt) {
        return this.f67869a.get().e(serializationt);
    }

    public <SerializationT extends q> C10162g c(SerializationT serializationt, C10180y yVar) {
        return this.f67869a.get().f(serializationt, yVar);
    }

    public C10162g d(o oVar, C10180y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        } else if (b(oVar)) {
            return c(oVar, yVar);
        } else {
            try {
                return new e(oVar, yVar);
            } catch (GeneralSecurityException e10) {
                throw new s("Creating a LegacyProtoKey failed", e10);
            }
        }
    }

    public synchronized <SerializationT extends q> void e(b<SerializationT> bVar) {
        this.f67869a.set(new r.b(this.f67869a.get()).f(bVar).e());
    }

    public synchronized <KeyT extends C10162g, SerializationT extends q> void f(c<KeyT, SerializationT> cVar) {
        this.f67869a.set(new r.b(this.f67869a.get()).g(cVar).e());
    }

    public synchronized <SerializationT extends q> void g(j<SerializationT> jVar) {
        this.f67869a.set(new r.b(this.f67869a.get()).h(jVar).e());
    }

    public synchronized <ParametersT extends C10176u, SerializationT extends q> void h(k<ParametersT, SerializationT> kVar) {
        this.f67869a.set(new r.b(this.f67869a.get()).i(kVar).e());
    }
}
