package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import qb.C10162g;
import qb.C10176u;
import qb.C10180y;

public final class r {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<d, c<?, ?>> f67893a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<c, b<?>> f67894b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Map<d, k<?, ?>> f67895c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<c, j<?>> f67896d;

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends q> f67901a;

        /* renamed from: b  reason: collision with root package name */
        private final Eb.a f67902b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f67901a.equals(this.f67901a) && cVar.f67902b.equals(this.f67902b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f67901a, this.f67902b});
        }

        public String toString() {
            return this.f67901a.getSimpleName() + ", object identifier: " + this.f67902b;
        }

        private c(Class<? extends q> cls, Eb.a aVar) {
            this.f67901a = cls;
            this.f67902b = aVar;
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f67903a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<? extends q> f67904b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f67903a.equals(this.f67903a) && dVar.f67904b.equals(this.f67904b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f67903a, this.f67904b});
        }

        public String toString() {
            return this.f67903a.getSimpleName() + " with serialization type: " + this.f67904b.getSimpleName();
        }

        private d(Class<?> cls, Class<? extends q> cls2) {
            this.f67903a = cls;
            this.f67904b = cls2;
        }
    }

    public <SerializationT extends q> boolean e(SerializationT serializationt) {
        return this.f67894b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends q> C10162g f(SerializationT serializationt, C10180y yVar) {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f67894b.containsKey(cVar)) {
            return this.f67894b.get(cVar).d(serializationt, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    private r(b bVar) {
        this.f67893a = new HashMap(bVar.f67897a);
        this.f67894b = new HashMap(bVar.f67898b);
        this.f67895c = new HashMap(bVar.f67899c);
        this.f67896d = new HashMap(bVar.f67900d);
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map<d, c<?, ?>> f67897a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Map<c, b<?>> f67898b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final Map<d, k<?, ?>> f67899c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final Map<c, j<?>> f67900d;

        public b() {
            this.f67897a = new HashMap();
            this.f67898b = new HashMap();
            this.f67899c = new HashMap();
            this.f67900d = new HashMap();
        }

        /* access modifiers changed from: package-private */
        public r e() {
            return new r(this);
        }

        public <SerializationT extends q> b f(b<SerializationT> bVar) {
            c cVar = new c(bVar.c(), bVar.b());
            if (this.f67898b.containsKey(cVar)) {
                b bVar2 = this.f67898b.get(cVar);
                if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f67898b.put(cVar, bVar);
            }
            return this;
        }

        public <KeyT extends C10162g, SerializationT extends q> b g(c<KeyT, SerializationT> cVar) {
            d dVar = new d(cVar.b(), cVar.c());
            if (this.f67897a.containsKey(dVar)) {
                c cVar2 = this.f67897a.get(dVar);
                if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f67897a.put(dVar, cVar);
            }
            return this;
        }

        public <SerializationT extends q> b h(j<SerializationT> jVar) {
            c cVar = new c(jVar.c(), jVar.b());
            if (this.f67900d.containsKey(cVar)) {
                j jVar2 = this.f67900d.get(cVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f67900d.put(cVar, jVar);
            }
            return this;
        }

        public <ParametersT extends C10176u, SerializationT extends q> b i(k<ParametersT, SerializationT> kVar) {
            d dVar = new d(kVar.b(), kVar.c());
            if (this.f67899c.containsKey(dVar)) {
                k kVar2 = this.f67899c.get(dVar);
                if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f67899c.put(dVar, kVar);
            }
            return this;
        }

        public b(r rVar) {
            this.f67897a = new HashMap(rVar.f67893a);
            this.f67898b = new HashMap(rVar.f67894b);
            this.f67899c = new HashMap(rVar.f67895c);
            this.f67900d = new HashMap(rVar.f67896d);
        }
    }
}
