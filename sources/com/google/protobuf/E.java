package com.google.protobuf;

public class E {

    /* renamed from: e  reason: collision with root package name */
    private static final C9583p f69197e = C9583p.b();

    /* renamed from: a  reason: collision with root package name */
    private C9575h f69198a;

    /* renamed from: b  reason: collision with root package name */
    private C9583p f69199b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile S f69200c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C9575h f69201d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f69200c = r4;
        r3.f69201d = com.google.protobuf.C9575h.f69286b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.protobuf.S r4) {
        /*
            r3 = this;
            com.google.protobuf.S r0 = r3.f69200c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.S r0 = r3.f69200c     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r4 = move-exception
            goto L_0x0036
        L_0x000e:
            com.google.protobuf.h r0 = r3.f69198a     // Catch:{ B -> 0x002e }
            if (r0 == 0) goto L_0x0027
            com.google.protobuf.a0 r0 = r4.getParserForType()     // Catch:{ B -> 0x002e }
            com.google.protobuf.h r1 = r3.f69198a     // Catch:{ B -> 0x002e }
            com.google.protobuf.p r2 = r3.f69199b     // Catch:{ B -> 0x002e }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ B -> 0x002e }
            com.google.protobuf.S r0 = (com.google.protobuf.S) r0     // Catch:{ B -> 0x002e }
            r3.f69200c = r0     // Catch:{ B -> 0x002e }
            com.google.protobuf.h r0 = r3.f69198a     // Catch:{ B -> 0x002e }
            r3.f69201d = r0     // Catch:{ B -> 0x002e }
            goto L_0x0034
        L_0x0027:
            r3.f69200c = r4     // Catch:{ B -> 0x002e }
            com.google.protobuf.h r0 = com.google.protobuf.C9575h.f69286b     // Catch:{ B -> 0x002e }
            r3.f69201d = r0     // Catch:{ B -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r3.f69200c = r4     // Catch:{ all -> 0x000c }
            com.google.protobuf.h r4 = com.google.protobuf.C9575h.f69286b     // Catch:{ all -> 0x000c }
            r3.f69201d = r4     // Catch:{ all -> 0x000c }
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x0036:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.E.a(com.google.protobuf.S):void");
    }

    public int b() {
        if (this.f69201d != null) {
            return this.f69201d.size();
        }
        C9575h hVar = this.f69198a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f69200c != null) {
            return this.f69200c.getSerializedSize();
        }
        return 0;
    }

    public S c(S s10) {
        a(s10);
        return this.f69200c;
    }

    public S d(S s10) {
        S s11 = this.f69200c;
        this.f69198a = null;
        this.f69201d = null;
        this.f69200c = s10;
        return s11;
    }

    public C9575h e() {
        if (this.f69201d != null) {
            return this.f69201d;
        }
        C9575h hVar = this.f69198a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            try {
                if (this.f69201d != null) {
                    C9575h hVar2 = this.f69201d;
                    return hVar2;
                }
                if (this.f69200c == null) {
                    this.f69201d = C9575h.f69286b;
                } else {
                    this.f69201d = this.f69200c.toByteString();
                }
                C9575h hVar3 = this.f69201d;
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
        S s10 = this.f69200c;
        S s11 = e10.f69200c;
        return (s10 == null && s11 == null) ? e().equals(e10.e()) : (s10 == null || s11 == null) ? s10 != null ? s10.equals(e10.c(s10.getDefaultInstanceForType())) : c(s11.getDefaultInstanceForType()).equals(s11) : s10.equals(s11);
    }

    public int hashCode() {
        return 1;
    }
}
