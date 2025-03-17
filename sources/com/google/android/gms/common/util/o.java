package com.google.android.gms.common.util;

import android.os.Process;
import ca.C7108b;
import ca.C7109c;
import ca.h;
import ca.j;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static String f48079a;

    /* renamed from: b  reason: collision with root package name */
    private static int f48080b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f48081c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a() {
        /*
            java.lang.String r0 = f48079a
            if (r0 != 0) goto L_0x0067
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0011
            java.lang.String r0 = android.app.Application.getProcessName()
            f48079a = r0
            goto L_0x0067
        L_0x0011:
            int r0 = f48080b
            if (r0 != 0) goto L_0x001b
            int r0 = android.os.Process.myPid()
            f48080b = r0
        L_0x001b:
            r1 = 0
            if (r0 > 0) goto L_0x001f
            goto L_0x0065
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            r2.<init>()     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            r2.append(r0)     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            java.lang.String r0 = "/cmdline"
            r2.append(r0)     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x005a }
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x005a }
            r4.<init>(r0)     // Catch:{ all -> 0x005a }
            r3.<init>(r4)     // Catch:{ all -> 0x005a }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            java.lang.String r0 = r3.readLine()     // Catch:{ IOException -> 0x0051, all -> 0x0055 }
            K9.C6620s.l(r0)     // Catch:{ IOException -> 0x0051, all -> 0x0055 }
            java.lang.String r1 = r0.trim()     // Catch:{ IOException -> 0x0051, all -> 0x0055 }
        L_0x0051:
            com.google.android.gms.common.util.k.a(r3)
            goto L_0x0065
        L_0x0055:
            r0 = move-exception
            r1 = r3
            goto L_0x005f
        L_0x0058:
            r0 = move-exception
            goto L_0x005f
        L_0x005a:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
            throw r0     // Catch:{ IOException -> 0x0063, all -> 0x0058 }
        L_0x005f:
            com.google.android.gms.common.util.k.a(r1)
            throw r0
        L_0x0063:
            r3 = r1
            goto L_0x0051
        L_0x0065:
            f48079a = r1
        L_0x0067:
            java.lang.String r0 = f48079a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.o.a():java.lang.String");
    }

    public static boolean b() {
        Boolean bool = f48081c;
        if (bool == null) {
            if (l.f()) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object a10 = j.a(Process.class, "isIsolated", new h[0]);
                    Object[] objArr = new Object[0];
                    if (a10 != null) {
                        bool = (Boolean) a10;
                    } else {
                        throw new C7109c(C7108b.a("expected a non-null reference", objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f48081c = bool;
        }
        return bool.booleanValue();
    }
}
