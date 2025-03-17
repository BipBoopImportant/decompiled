package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V0;

final class S3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ V0 f49950a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49951b;

    S3(C7691t3 t3Var, V0 v02) {
        this.f49950a = v02;
        this.f49951b = t3Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0069 A[SYNTHETIC, Splitter:B:12:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.t3 r0 = r7.f49951b
            com.google.android.gms.measurement.internal.c5 r0 = r0.t()
            com.google.android.gms.measurement.internal.s2 r1 = r0.e()
            com.google.android.gms.measurement.internal.q3 r1 = r1.K()
            boolean r1 = r1.x()
            r2 = 0
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.measurement.internal.h2 r0 = r0.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.K()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.a(r1)
        L_0x0022:
            r0 = r2
            goto L_0x0055
        L_0x0024:
            com.google.android.gms.measurement.internal.s2 r1 = r0.e()
            com.google.android.gms.common.util.e r3 = r0.zzb()
            long r3 = r3.a()
            boolean r1 = r1.w(r3)
            if (r1 != 0) goto L_0x0022
            com.google.android.gms.measurement.internal.s2 r1 = r0.e()
            com.google.android.gms.measurement.internal.x2 r1 = r1.f50374s
            long r3 = r1.a()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0047
            goto L_0x0022
        L_0x0047:
            com.google.android.gms.measurement.internal.s2 r0 = r0.e()
            com.google.android.gms.measurement.internal.x2 r0 = r0.f50374s
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0055:
            if (r0 == 0) goto L_0x0069
            com.google.android.gms.measurement.internal.t3 r1 = r7.f49951b
            com.google.android.gms.measurement.internal.P2 r1 = r1.f50228a
            com.google.android.gms.measurement.internal.Q5 r1 = r1.M()
            com.google.android.gms.internal.measurement.V0 r2 = r7.f49950a
            long r3 = r0.longValue()
            r1.O(r2, r3)
            return
        L_0x0069:
            com.google.android.gms.internal.measurement.V0 r0 = r7.f49950a     // Catch:{ RemoteException -> 0x006f }
            r0.o(r2)     // Catch:{ RemoteException -> 0x006f }
            return
        L_0x006f:
            r0 = move-exception
            com.google.android.gms.measurement.internal.t3 r1 = r7.f49951b
            com.google.android.gms.measurement.internal.P2 r1 = r1.f50228a
            com.google.android.gms.measurement.internal.h2 r1 = r1.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.E()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.S3.run():void");
    }
}
