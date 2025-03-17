package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import qb.C10162g;
import qb.C10178w;

public class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map<c, l<?, ?>> f67880a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, C10178w<?, ?>> f67881b;

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Class<?> f67884a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f67885b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f67884a.equals(this.f67884a) && cVar.f67885b.equals(this.f67885b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f67884a, this.f67885b});
        }

        public String toString() {
            return this.f67884a.getSimpleName() + " with primitive type: " + this.f67885b.getSimpleName();
        }

        private c(Class<?> cls, Class<?> cls2) {
            this.f67884a = cls;
            this.f67885b = cls2;
        }
    }

    public Class<?> c(Class<?> cls) {
        if (this.f67881b.containsKey(cls)) {
            return this.f67881b.get(cls).b();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends C10162g, PrimitiveT> PrimitiveT d(KeyT keyt, Class<PrimitiveT> cls) {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f67880a.containsKey(cVar)) {
            return this.f67880a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [qb.v<InputPrimitiveT>, qb.v] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT e(qb.C10177v<InputPrimitiveT> r3, java.lang.Class<WrapperPrimitiveT> r4) {
        /*
            r2 = this;
            java.util.Map<java.lang.Class<?>, qb.w<?, ?>> r0 = r2.f67881b
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L_0x0039
            java.util.Map<java.lang.Class<?>, qb.w<?, ?>> r0 = r2.f67881b
            java.lang.Object r4 = r0.get(r4)
            qb.w r4 = (qb.C10178w) r4
            java.lang.Class r0 = r3.g()
            java.lang.Class r1 = r4.b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Class r0 = r4.b()
            java.lang.Class r1 = r3.g()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0031
            java.lang.Object r3 = r4.a(r3)
            return r3
        L_0x0031:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet"
            r3.<init>(r4)
            throw r3
        L_0x0039:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No wrapper found for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.internal.n.e(qb.v, java.lang.Class):java.lang.Object");
    }

    private n(b bVar) {
        this.f67880a = new HashMap(bVar.f67882a);
        this.f67881b = new HashMap(bVar.f67883b);
    }

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map<c, l<?, ?>> f67882a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class<?>, C10178w<?, ?>> f67883b;

        public b() {
            this.f67882a = new HashMap();
            this.f67883b = new HashMap();
        }

        /* access modifiers changed from: package-private */
        public n c() {
            return new n(this);
        }

        public <KeyT extends C10162g, PrimitiveT> b d(l<KeyT, PrimitiveT> lVar) {
            if (lVar != null) {
                c cVar = new c(lVar.c(), lVar.d());
                if (this.f67882a.containsKey(cVar)) {
                    l lVar2 = this.f67882a.get(cVar);
                    if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                    }
                } else {
                    this.f67882a.put(cVar, lVar);
                }
                return this;
            }
            throw new NullPointerException("primitive constructor must be non-null");
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(C10178w<InputPrimitiveT, WrapperPrimitiveT> wVar) {
            if (wVar != null) {
                Class<WrapperPrimitiveT> c10 = wVar.c();
                if (this.f67883b.containsKey(c10)) {
                    C10178w wVar2 = this.f67883b.get(c10);
                    if (!wVar2.equals(wVar) || !wVar.equals(wVar2)) {
                        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c10);
                    }
                } else {
                    this.f67883b.put(c10, wVar);
                }
                return this;
            }
            throw new NullPointerException("wrapper must be non-null");
        }

        public b(n nVar) {
            this.f67882a = new HashMap(nVar.f67880a);
            this.f67883b = new HashMap(nVar.f67881b);
        }
    }
}
