package com.google.android.gms.common.util;

import K9.C6620s;
import S9.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import u2.C6012a;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int f48083a = Process.myUid();

    /* renamed from: b  reason: collision with root package name */
    private static final Method f48084b;

    /* renamed from: c  reason: collision with root package name */
    private static final Method f48085c;

    /* renamed from: d  reason: collision with root package name */
    private static final Method f48086d;

    /* renamed from: e  reason: collision with root package name */
    private static final Method f48087e;

    /* renamed from: f  reason: collision with root package name */
    private static final Method f48088f;

    /* renamed from: g  reason: collision with root package name */
    private static final Method f48089g;

    /* renamed from: h  reason: collision with root package name */
    private static final Method f48090h;

    /* renamed from: i  reason: collision with root package name */
    private static final Method f48091i;

    /* renamed from: j  reason: collision with root package name */
    private static Boolean f48092j = null;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0093  */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "add"
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            int r3 = android.os.Process.myUid()
            f48083a = r3
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0018 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Method r4 = r2.getMethod(r1, r4)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r4 = r3
        L_0x0019:
            f48084b = r4
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0026 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r0}     // Catch:{ Exception -> 0x0026 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0027
        L_0x0026:
            r1 = r3
        L_0x0027:
            f48085c = r1
            java.lang.String r1 = "size"
            java.lang.reflect.Method r1 = r2.getMethod(r1, r3)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r1 = r3
        L_0x0031:
            f48086d = r1
            java.lang.String r1 = "get"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0040 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ Exception -> 0x0040 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch:{ Exception -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r1 = r3
        L_0x0041:
            f48087e = r1
            java.lang.String r1 = "getName"
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0050 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ Exception -> 0x0050 }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch:{ Exception -> 0x0050 }
            goto L_0x0051
        L_0x0050:
            r1 = r3
        L_0x0051:
            f48088f = r1
            boolean r1 = com.google.android.gms.common.util.l.f()
            java.lang.String r4 = "WorkSourceUtil"
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "createWorkChain"
            java.lang.reflect.Method r1 = r2.getMethod(r1, r3)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0069
        L_0x0062:
            r1 = move-exception
            java.lang.String r5 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r4, r5, r1)
        L_0x0068:
            r1 = r3
        L_0x0069:
            f48089g = r1
            boolean r1 = com.google.android.gms.common.util.l.f()
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = "android.os.WorkSource$WorkChain"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r5 = "addNode"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0084 }
            java.lang.Class[] r0 = new java.lang.Class[]{r6, r0}     // Catch:{ Exception -> 0x0084 }
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x0084 }
            goto L_0x008b
        L_0x0084:
            r0 = move-exception
            java.lang.String r1 = "Missing WorkChain class"
            android.util.Log.w(r4, r1, r0)
        L_0x008a:
            r0 = r3
        L_0x008b:
            f48090h = r0
            boolean r0 = com.google.android.gms.common.util.l.f()
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = "isEmpty"
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch:{ Exception -> 0x009e }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x009f }
            goto L_0x009f
        L_0x009e:
            r0 = r3
        L_0x009f:
            f48091i = r0
            f48092j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.r.<clinit>():void");
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f48085c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i10), str});
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        } else {
            Method method2 = f48084b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i10)});
                } catch (Exception e11) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
                }
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c10 = c.a(context).c(str, 0);
                if (c10 == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = c10.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        synchronized (r.class) {
            Boolean bool = f48092j;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                return booleanValue;
            }
            boolean z10 = false;
            if (context == null) {
                return false;
            }
            if (C6012a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z10 = true;
            }
            f48092j = Boolean.valueOf(z10);
            return z10;
        }
    }

    public static boolean d(WorkSource workSource) {
        Method method = f48091i;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, (Object[]) null);
                C6620s.l(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) {
        Method method = f48086d;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, (Object[]) null);
            C6620s.l(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
