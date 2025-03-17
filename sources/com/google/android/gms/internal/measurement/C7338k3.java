package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.measurement.k3  reason: case insensitive filesystem */
public class C7338k3 {

    /* renamed from: a  reason: collision with root package name */
    private static UserManager f48987a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f48988b = (!a());

    private C7338k3() {
    }

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(android.content.Context r3) {
        /*
            boolean r0 = f48988b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<com.google.android.gms.internal.measurement.k3> r0 = com.google.android.gms.internal.measurement.C7338k3.class
            monitor-enter(r0)
            boolean r2 = f48988b     // Catch:{ all -> 0x000f }
            if (r2 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x000f:
            r3 = move-exception
            goto L_0x001b
        L_0x0011:
            boolean r3 = e(r3)     // Catch:{ all -> 0x000f }
            if (r3 == 0) goto L_0x0019
            f48988b = r3     // Catch:{ all -> 0x000f }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r3
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7338k3.d(android.content.Context):boolean");
    }

    @TargetApi(24)
    private static boolean e(Context context) {
        boolean z10;
        boolean z11 = true;
        int i10 = 1;
        while (true) {
            z10 = false;
            if (i10 > 2) {
                break;
            }
            if (f48987a == null) {
                f48987a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f48987a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z11 = false;
                }
                z10 = z11;
            } catch (NullPointerException e10) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                f48987a = null;
                i10++;
            }
        }
        if (z10) {
            f48987a = null;
        }
        return z10;
    }
}
