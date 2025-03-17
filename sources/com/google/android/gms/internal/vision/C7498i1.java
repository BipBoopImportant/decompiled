package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.i1  reason: case insensitive filesystem */
public class C7498i1 {

    /* renamed from: d  reason: collision with root package name */
    private static final C0 f49339d = C0.b();

    /* renamed from: a  reason: collision with root package name */
    private C7497i0 f49340a;

    /* renamed from: b  reason: collision with root package name */
    private volatile A1 f49341b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C7497i0 f49342c;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.vision.A1 c(com.google.android.gms.internal.vision.A1 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.vision.A1 r0 = r1.f49341b
            if (r0 != 0) goto L_0x001e
            monitor-enter(r1)
            com.google.android.gms.internal.vision.A1 r0 = r1.f49341b     // Catch:{ all -> 0x000b }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001e
        L_0x000b:
            r2 = move-exception
            goto L_0x001c
        L_0x000d:
            r1.f49341b = r2     // Catch:{ Z0 -> 0x0014 }
            com.google.android.gms.internal.vision.i0 r0 = com.google.android.gms.internal.vision.C7497i0.f49335b     // Catch:{ Z0 -> 0x0014 }
            r1.f49342c = r0     // Catch:{ Z0 -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r1.f49341b = r2     // Catch:{ all -> 0x000b }
            com.google.android.gms.internal.vision.i0 r2 = com.google.android.gms.internal.vision.C7497i0.f49335b     // Catch:{ all -> 0x000b }
            r1.f49342c = r2     // Catch:{ all -> 0x000b }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x000b }
            throw r2
        L_0x001e:
            com.google.android.gms.internal.vision.A1 r2 = r1.f49341b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C7498i1.c(com.google.android.gms.internal.vision.A1):com.google.android.gms.internal.vision.A1");
    }

    public final A1 a(A1 a12) {
        A1 a13 = this.f49341b;
        this.f49340a = null;
        this.f49342c = null;
        this.f49341b = a12;
        return a13;
    }

    public final int b() {
        if (this.f49342c != null) {
            return this.f49342c.i();
        }
        if (this.f49341b != null) {
            return this.f49341b.r();
        }
        return 0;
    }

    public final C7497i0 d() {
        if (this.f49342c != null) {
            return this.f49342c;
        }
        synchronized (this) {
            try {
                if (this.f49342c != null) {
                    C7497i0 i0Var = this.f49342c;
                    return i0Var;
                }
                if (this.f49341b == null) {
                    this.f49342c = C7497i0.f49335b;
                } else {
                    this.f49342c = this.f49341b.e();
                }
                C7497i0 i0Var2 = this.f49342c;
                return i0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7498i1)) {
            return false;
        }
        C7498i1 i1Var = (C7498i1) obj;
        A1 a12 = this.f49341b;
        A1 a13 = i1Var.f49341b;
        return (a12 == null && a13 == null) ? d().equals(i1Var.d()) : (a12 == null || a13 == null) ? a12 != null ? a12.equals(i1Var.c(a12.c())) : c(a13.c()).equals(a13) : a12.equals(a13);
    }

    public int hashCode() {
        return 1;
    }
}
