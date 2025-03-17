package androidx.datastore.preferences.protobuf;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private C5154g f21243a;

    /* renamed from: b  reason: collision with root package name */
    private C5162o f21244b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile S f21245c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C5154g f21246d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f21245c = r4;
        r3.f21246d = androidx.datastore.preferences.protobuf.C5154g.f21312b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.datastore.preferences.protobuf.S r4) {
        /*
            r3 = this;
            androidx.datastore.preferences.protobuf.S r0 = r3.f21245c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            androidx.datastore.preferences.protobuf.S r0 = r3.f21245c     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r4 = move-exception
            goto L_0x0036
        L_0x000e:
            androidx.datastore.preferences.protobuf.g r0 = r3.f21243a     // Catch:{ A -> 0x002e }
            if (r0 == 0) goto L_0x0027
            androidx.datastore.preferences.protobuf.a0 r0 = r4.getParserForType()     // Catch:{ A -> 0x002e }
            androidx.datastore.preferences.protobuf.g r1 = r3.f21243a     // Catch:{ A -> 0x002e }
            androidx.datastore.preferences.protobuf.o r2 = r3.f21244b     // Catch:{ A -> 0x002e }
            java.lang.Object r0 = r0.a(r1, r2)     // Catch:{ A -> 0x002e }
            androidx.datastore.preferences.protobuf.S r0 = (androidx.datastore.preferences.protobuf.S) r0     // Catch:{ A -> 0x002e }
            r3.f21245c = r0     // Catch:{ A -> 0x002e }
            androidx.datastore.preferences.protobuf.g r0 = r3.f21243a     // Catch:{ A -> 0x002e }
            r3.f21246d = r0     // Catch:{ A -> 0x002e }
            goto L_0x0034
        L_0x0027:
            r3.f21245c = r4     // Catch:{ A -> 0x002e }
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.C5154g.f21312b     // Catch:{ A -> 0x002e }
            r3.f21246d = r0     // Catch:{ A -> 0x002e }
            goto L_0x0034
        L_0x002e:
            r3.f21245c = r4     // Catch:{ all -> 0x000c }
            androidx.datastore.preferences.protobuf.g r4 = androidx.datastore.preferences.protobuf.C5154g.f21312b     // Catch:{ all -> 0x000c }
            r3.f21246d = r4     // Catch:{ all -> 0x000c }
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x0036:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.D.a(androidx.datastore.preferences.protobuf.S):void");
    }

    public int b() {
        if (this.f21246d != null) {
            return this.f21246d.size();
        }
        C5154g gVar = this.f21243a;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.f21245c != null) {
            return this.f21245c.getSerializedSize();
        }
        return 0;
    }

    public S c(S s10) {
        a(s10);
        return this.f21245c;
    }

    public S d(S s10) {
        S s11 = this.f21245c;
        this.f21243a = null;
        this.f21246d = null;
        this.f21245c = s10;
        return s11;
    }

    public C5154g e() {
        if (this.f21246d != null) {
            return this.f21246d;
        }
        C5154g gVar = this.f21243a;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f21246d != null) {
                    C5154g gVar2 = this.f21246d;
                    return gVar2;
                }
                if (this.f21245c == null) {
                    this.f21246d = C5154g.f21312b;
                } else {
                    this.f21246d = this.f21245c.toByteString();
                }
                C5154g gVar3 = this.f21246d;
                return gVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        S s10 = this.f21245c;
        S s11 = d10.f21245c;
        return (s10 == null && s11 == null) ? e().equals(d10.e()) : (s10 == null || s11 == null) ? s10 != null ? s10.equals(d10.c(s10.getDefaultInstanceForType())) : c(s11.getDefaultInstanceForType()).equals(s11) : s10.equals(s11);
    }

    public int hashCode() {
        return 1;
    }
}
