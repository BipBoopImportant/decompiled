package com.google.android.gms.internal.measurement;

final class J4 implements C7414t5 {

    /* renamed from: a  reason: collision with root package name */
    private static final J4 f48693a = new J4();

    private J4() {
    }

    public static J4 a() {
        return f48693a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C7391q5 zza(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.android.gms.internal.measurement.L4> r0 = com.google.android.gms.internal.measurement.L4.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L_0x0033
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x001a }
            com.google.android.gms.internal.measurement.L4 r0 = com.google.android.gms.internal.measurement.L4.o(r0)     // Catch:{ Exception -> 0x001a }
            int r1 = com.google.android.gms.internal.measurement.L4.f.f48737c     // Catch:{ Exception -> 0x001a }
            r2 = 0
            java.lang.Object r0 = r0.r(r1, r2, r2)     // Catch:{ Exception -> 0x001a }
            com.google.android.gms.internal.measurement.q5 r0 = (com.google.android.gms.internal.measurement.C7391q5) r0     // Catch:{ Exception -> 0x001a }
            return r0
        L_0x001a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to get message info for "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L_0x0033:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported message type: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.J4.zza(java.lang.Class):com.google.android.gms.internal.measurement.q5");
    }

    public final boolean zzb(Class<?> cls) {
        return L4.class.isAssignableFrom(cls);
    }
}
