package com.google.android.gms.internal.vision;

final class R0 implements B1 {

    /* renamed from: a  reason: collision with root package name */
    private static final R0 f49263a = new R0();

    private R0() {
    }

    public static R0 a() {
        return f49263a;
    }

    public final boolean zza(Class<?> cls) {
        return Q0.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.vision.C7551y1 zzb(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.vision.Q0> r0 = com.google.android.gms.internal.vision.Q0.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            int r1 = r5.length()
            java.lang.String r2 = "Unsupported message type: "
            if (r1 == 0) goto L_0x001b
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.internal.vision.Q0 r0 = com.google.android.gms.internal.vision.Q0.l(r0)     // Catch:{ Exception -> 0x0036 }
            int r1 = com.google.android.gms.internal.vision.Q0.f.f49253c     // Catch:{ Exception -> 0x0036 }
            r2 = 0
            java.lang.Object r0 = r0.n(r1, r2, r2)     // Catch:{ Exception -> 0x0036 }
            com.google.android.gms.internal.vision.y1 r0 = (com.google.android.gms.internal.vision.C7551y1) r0     // Catch:{ Exception -> 0x0036 }
            return r0
        L_0x0036:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            int r2 = r5.length()
            java.lang.String r3 = "Unable to get message info for "
            if (r2 == 0) goto L_0x004a
            java.lang.String r5 = r3.concat(r5)
            goto L_0x004f
        L_0x004a:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r3)
        L_0x004f:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.R0.zzb(java.lang.Class):com.google.android.gms.internal.vision.y1");
    }
}
