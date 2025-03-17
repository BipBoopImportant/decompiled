package com.google.crypto.tink.shaded.protobuf;

public class E {

    /* renamed from: e  reason: collision with root package name */
    private static final C9533p f67917e = C9533p.b();

    /* renamed from: a  reason: collision with root package name */
    private C9525h f67918a;

    /* renamed from: b  reason: collision with root package name */
    private C9533p f67919b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile S f67920c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C9525h f67921d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f67920c = r4;
        r3.f67921d = com.google.crypto.tink.shaded.protobuf.C9525h.f67987b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.crypto.tink.shaded.protobuf.S r4) {
        /*
            r3 = this;
            com.google.crypto.tink.shaded.protobuf.S r0 = r3.f67920c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.crypto.tink.shaded.protobuf.S r0 = r3.f67920c     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r4 = move-exception
            goto L_0x0036
        L_0x000e:
            com.google.crypto.tink.shaded.protobuf.h r0 = r3.f67918a     // Catch:{ B -> 0x002e }
            if (r0 == 0) goto L_0x0027
            com.google.crypto.tink.shaded.protobuf.a0 r0 = r4.getParserForType()     // Catch:{ B -> 0x002e }
            com.google.crypto.tink.shaded.protobuf.h r1 = r3.f67918a     // Catch:{ B -> 0x002e }
            com.google.crypto.tink.shaded.protobuf.p r2 = r3.f67919b     // Catch:{ B -> 0x002e }
            java.lang.Object r0 = r0.b(r1, r2)     // Catch:{ B -> 0x002e }
            com.google.crypto.tink.shaded.protobuf.S r0 = (com.google.crypto.tink.shaded.protobuf.S) r0     // Catch:{ B -> 0x002e }
            r3.f67920c = r0     // Catch:{ B -> 0x002e }
            com.google.crypto.tink.shaded.protobuf.h r0 = r3.f67918a     // Catch:{ B -> 0x002e }
            r3.f67921d = r0     // Catch:{ B -> 0x002e }
            goto L_0x0034
        L_0x0027:
            r3.f67920c = r4     // Catch:{ B -> 0x002e }
            com.google.crypto.tink.shaded.protobuf.h r0 = com.google.crypto.tink.shaded.protobuf.C9525h.f67987b     // Catch:{ B -> 0x002e }
            r3.f67921d = r0     // Catch:{ B -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r3.f67920c = r4     // Catch:{ all -> 0x000c }
            com.google.crypto.tink.shaded.protobuf.h r4 = com.google.crypto.tink.shaded.protobuf.C9525h.f67987b     // Catch:{ all -> 0x000c }
            r3.f67921d = r4     // Catch:{ all -> 0x000c }
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x0036:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.E.a(com.google.crypto.tink.shaded.protobuf.S):void");
    }

    public int b() {
        if (this.f67921d != null) {
            return this.f67921d.size();
        }
        C9525h hVar = this.f67918a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f67920c != null) {
            return this.f67920c.getSerializedSize();
        }
        return 0;
    }

    public S c(S s10) {
        a(s10);
        return this.f67920c;
    }

    public S d(S s10) {
        S s11 = this.f67920c;
        this.f67918a = null;
        this.f67921d = null;
        this.f67920c = s10;
        return s11;
    }

    public C9525h e() {
        if (this.f67921d != null) {
            return this.f67921d;
        }
        C9525h hVar = this.f67918a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f67921d != null) {
                    C9525h hVar2 = this.f67921d;
                    return hVar2;
                }
                if (this.f67920c == null) {
                    this.f67921d = C9525h.f67987b;
                } else {
                    this.f67921d = this.f67920c.toByteString();
                }
                C9525h hVar3 = this.f67921d;
                return hVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        S s10 = this.f67920c;
        S s11 = e10.f67920c;
        return (s10 == null && s11 == null) ? e().equals(e10.e()) : (s10 == null || s11 == null) ? s10 != null ? s10.equals(e10.c(s10.getDefaultInstanceForType())) : c(s11.getDefaultInstanceForType()).equals(s11) : s10.equals(s11);
    }

    public int hashCode() {
        return 1;
    }
}
