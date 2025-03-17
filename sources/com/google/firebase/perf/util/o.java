package com.google.firebase.perf.util;

import Ac.a;
import GK.C15803v;
import android.content.Context;
import android.content.pm.PackageManager;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f68676a;

    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(Context context) {
        Boolean bool = f68676a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f68676a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            a e11 = a.e();
            e11.a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int c(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static String d(String str) {
        C15803v m10 = C15803v.m(str);
        return m10 != null ? m10.k().B("").n("").r((String) null).h((String) null).toString() : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r0 = r3.lastIndexOf(47, r4 - 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r3, int r4) {
        /*
            int r0 = r3.length()
            if (r0 > r4) goto L_0x0007
            return r3
        L_0x0007:
            char r0 = r3.charAt(r4)
            r1 = 47
            r2 = 0
            if (r0 != r1) goto L_0x0015
            java.lang.String r3 = r3.substring(r2, r4)
            return r3
        L_0x0015:
            GK.v r0 = GK.C15803v.m(r3)
            if (r0 != 0) goto L_0x0020
            java.lang.String r3 = r3.substring(r2, r4)
            return r3
        L_0x0020:
            java.lang.String r0 = r0.d()
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0037
            int r0 = r4 + -1
            int r0 = r3.lastIndexOf(r1, r0)
            if (r0 < 0) goto L_0x0037
            java.lang.String r3 = r3.substring(r2, r0)
            return r3
        L_0x0037:
            java.lang.String r3 = r3.substring(r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.util.o.e(java.lang.String, int):java.lang.String");
    }
}
