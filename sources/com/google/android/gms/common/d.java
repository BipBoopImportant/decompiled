package com.google.android.gms.common;

import G9.C6522c;
import G9.e;
import K9.C6620s;
import S9.c;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.q;
import java.util.concurrent.atomic.AtomicBoolean;

public class d {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f48050a = 12451000;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f48051b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48052c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f48053d = false;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicBoolean f48054e = new AtomicBoolean();

    @Deprecated
    public static void a(Context context, int i10) {
        int h10 = b.f().h(context, i10);
        if (h10 != 0) {
            Intent b10 = b.f().b(context, h10, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + h10);
            if (b10 == null) {
                throw new C6522c(h10);
            }
            throw new G9.d(h10, "Google Play Services not available", b10);
        }
    }

    @Deprecated
    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static String c(int i10) {
        return ConnectionResult.t0(i10);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!f48053d) {
            try {
                PackageInfo e10 = c.a(context).e("com.google.android.gms", 64);
                e.a(context);
                if (e10 == null || e.e(e10, false) || !e.e(e10, true)) {
                    f48052c = false;
                } else {
                    f48052c = true;
                }
                f48053d = true;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e11);
                f48053d = true;
            } catch (Throwable th2) {
                f48053d = true;
                throw th2;
            }
        }
        return f48052c || !i.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = G9.f.f36319a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f48054e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = K9.d0.a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f48050a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = com.google.android.gms.common.util.i.d(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = com.google.android.gms.common.util.i.f(r10)
            if (r1 != 0) goto L_0x004d
            r1 = r3
            goto L_0x004e
        L_0x004d:
            r1 = r4
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r4
        L_0x0053:
            K9.C6620s.a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007b
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007c
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = r7
            goto L_0x0132
        L_0x007b:
            r8 = 0
        L_0x007c:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0125 }
            G9.e.a(r10)
            boolean r10 = G9.e.e(r9, r3)
            if (r10 != 0) goto L_0x0099
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x0099:
            if (r1 == 0) goto L_0x00b2
            K9.C6620s.l(r8)
            boolean r10 = G9.e.e(r8, r3)
            if (r10 != 0) goto L_0x00b2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b2:
            if (r1 == 0) goto L_0x00d2
            if (r8 == 0) goto L_0x00d2
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d2
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d2:
            int r10 = r9.versionCode
            int r10 = com.google.android.gms.common.util.s.a(r10)
            int r1 = com.google.android.gms.common.util.s.a(r11)
            if (r10 >= r1) goto L_0x0106
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0132
        L_0x0106:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x011e
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x010f }
            goto L_0x011e
        L_0x010f:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0132
        L_0x011e:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0124
            r3 = 3
            goto L_0x0132
        L_0x0124:
            return r4
        L_0x0125:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0132:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.d.g(android.content.Context, int):int");
    }

    @Deprecated
    public static boolean h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean i(Context context) {
        Object systemService = context.getSystemService("user");
        C6620s.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean k(Context context, int i10, String str) {
        return q.b(context, i10, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean l(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r6.equals(r0)
            r1 = 0
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch:{ Exception -> 0x0049 }
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch:{ Exception -> 0x0049 }
            java.util.List r2 = r2.getAllSessions()     // Catch:{ Exception -> 0x0049 }
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x002f
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0017
            return r4
        L_0x002f:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r6 = r2.getApplicationInfo(r6, r3)     // Catch:{  }
            if (r0 == 0) goto L_0x003e
            boolean r5 = r6.enabled     // Catch:{  }
            return r5
        L_0x003e:
            boolean r6 = r6.enabled     // Catch:{  }
            if (r6 == 0) goto L_0x0049
            boolean r5 = i(r5)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            return r4
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.d.l(android.content.Context, java.lang.String):boolean");
    }
}
