package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.t0  reason: case insensitive filesystem */
public class C7224t0 {

    /* renamed from: d  reason: collision with root package name */
    private static final S f48483d = S.b();

    /* renamed from: a  reason: collision with root package name */
    private A f48484a;

    /* renamed from: b  reason: collision with root package name */
    private volatile M0 f48485b;

    /* renamed from: c  reason: collision with root package name */
    private volatile A f48486c;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.clearcut.M0 b(com.google.android.gms.internal.clearcut.M0 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.clearcut.M0 r0 = r1.f48485b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.clearcut.M0 r0 = r1.f48485b     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x000d
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001d
        L_0x000b:
            r2 = move-exception
            goto L_0x001b
        L_0x000d:
            r1.f48485b = r2     // Catch:{ m0 -> 0x0014 }
            com.google.android.gms.internal.clearcut.A r0 = com.google.android.gms.internal.clearcut.A.f48133b     // Catch:{ m0 -> 0x0014 }
            r1.f48486c = r0     // Catch:{ m0 -> 0x0014 }
            goto L_0x0009
        L_0x0014:
            r1.f48485b = r2     // Catch:{ all -> 0x000b }
            com.google.android.gms.internal.clearcut.A r2 = com.google.android.gms.internal.clearcut.A.f48133b     // Catch:{ all -> 0x000b }
            r1.f48486c = r2     // Catch:{ all -> 0x000b }
            goto L_0x0009
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.clearcut.M0 r2 = r1.f48485b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C7224t0.b(com.google.android.gms.internal.clearcut.M0):com.google.android.gms.internal.clearcut.M0");
    }

    public final int a() {
        if (this.f48486c != null) {
            return this.f48486c.size();
        }
        if (this.f48485b != null) {
            return this.f48485b.y();
        }
        return 0;
    }

    public final M0 c(M0 m02) {
        M0 m03 = this.f48485b;
        this.f48484a = null;
        this.f48486c = null;
        this.f48485b = m02;
        return m03;
    }

    public final A d() {
        if (this.f48486c != null) {
            return this.f48486c;
        }
        synchronized (this) {
            try {
                if (this.f48486c != null) {
                    A a10 = this.f48486c;
                    return a10;
                }
                this.f48486c = this.f48485b == null ? A.f48133b : this.f48485b.c();
                A a11 = this.f48486c;
                return a11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7224t0)) {
            return false;
        }
        C7224t0 t0Var = (C7224t0) obj;
        M0 m02 = this.f48485b;
        M0 m03 = t0Var.f48485b;
        return (m02 == null && m03 == null) ? d().equals(t0Var.d()) : (m02 == null || m03 == null) ? m02 != null ? m02.equals(t0Var.b(m02.z())) : b(m03.z()).equals(m03) : m02.equals(m03);
    }

    public int hashCode() {
        return 1;
    }
}
