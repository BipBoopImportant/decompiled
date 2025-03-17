package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.DropBoxManager;
import java.util.LinkedHashMap;

public final class zzhk {
    private static DropBoxManager zza;
    private static final LinkedHashMap zzb = new zzhj(16, 0.75f, true);
    private static String zzc;

    public static synchronized void zza(Context context, boolean z10) {
        synchronized (zzhk.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:15|16|(2:18|(3:19|20|(2:22|23)(2:38|24)))(0)|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void zzb(java.lang.Throwable r16) {
        /*
            java.lang.Class<com.google.android.libraries.places.internal.zzhk> r1 = com.google.android.libraries.places.internal.zzhk.class
            monitor-enter(r1)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0026 }
            long r2 = r0.getId()     // Catch:{ all -> 0x0026 }
            int r0 = r16.hashCode()     // Catch:{ all -> 0x0026 }
            java.util.LinkedHashMap r4 = zzb     // Catch:{ all -> 0x0026 }
            java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0026 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0029
            int r4 = r4.intValue()     // Catch:{ all -> 0x0026 }
            if (r4 == r0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            monitor-exit(r1)
            return
        L_0x0026:
            r0 = move-exception
            goto L_0x00b8
        L_0x0029:
            android.os.DropBoxManager r4 = zza     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x00b6
            java.lang.String r5 = "system_app_crash"
            boolean r4 = r4.isTagEnabled(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x00b6
            android.os.DropBoxManager r4 = zza     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r5.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = zzc     // Catch:{ all -> 0x0026 }
            r7 = 46
            com.google.android.libraries.places.internal.zzjt r7 = com.google.android.libraries.places.internal.zzjt.zzb(r7)     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "3.2.0"
            java.util.List r7 = r7.zzc(r8)     // Catch:{ all -> 0x0026 }
            int r8 = r7.size()     // Catch:{ all -> 0x0026 }
            r9 = 3
            r10 = -1
            if (r8 == r9) goto L_0x0054
            goto L_0x0070
        L_0x0054:
            r8 = 0
            r12 = 0
        L_0x0057:
            int r9 = r7.size()     // Catch:{ NumberFormatException -> 0x0070 }
            if (r8 >= r9) goto L_0x006f
            r14 = 100
            long r12 = r12 * r14
            java.lang.Object r9 = r7.get(r8)     // Catch:{ NumberFormatException -> 0x0070 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x0070 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x0070 }
            long r14 = (long) r9
            long r12 = r12 + r14
            int r8 = r8 + 1
            goto L_0x0057
        L_0x006f:
            r10 = r12
        L_0x0070:
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0026 }
            java.lang.String r8 = "3.2.0"
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r8}     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "Package: %s v%d (%s)\n"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ all -> 0x0026 }
            r5.append(r6)     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0026 }
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "Build: %s\n"
            java.lang.String r6 = java.lang.String.format(r7, r6)     // Catch:{ all -> 0x0026 }
            r5.append(r6)     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = android.util.Log.getStackTraceString(r16)     // Catch:{ all -> 0x0026 }
            r5.append(r6)     // Catch:{ all -> 0x0026 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "system_app_crash"
            r4.addText(r6, r5)     // Catch:{ all -> 0x0026 }
            java.util.LinkedHashMap r4 = zzb     // Catch:{ all -> 0x0026 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0026 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0026 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)
            return
        L_0x00b6:
            monitor-exit(r1)
            return
        L_0x00b8:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhk.zzb(java.lang.Throwable):void");
    }
}
