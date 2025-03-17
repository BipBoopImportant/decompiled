package com.google.android.libraries.places.internal;

import android.content.Context;
import java.util.concurrent.TimeUnit;

public final class zzdu {
    public static final /* synthetic */ int zza = 0;
    private static final long zzb = TimeUnit.MINUTES.toMicros(1);
    private final zzde zzc;
    private final Context zzd;

    zzdu(Context context, zzde zzde) {
        this.zzd = context;
        this.zzc = zzde;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r10.contains("_optout") == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.places.internal.zzkh zza(java.lang.String r14) {
        /*
            r13 = this;
            android.content.Context r14 = r13.zzd
            java.lang.String r0 = "wifi"
            java.lang.Object r14 = r14.getSystemService(r0)
            android.net.wifi.WifiManager r14 = (android.net.wifi.WifiManager) r14
            if (r14 == 0) goto L_0x00a5
            boolean r0 = r14.isWifiEnabled()
            if (r0 != 0) goto L_0x0014
            goto L_0x00a5
        L_0x0014:
            java.util.List r0 = r14.getScanResults()
            if (r0 == 0) goto L_0x00a0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0022
            goto L_0x00a0
        L_0x0022:
            com.google.android.libraries.places.internal.zzdt r1 = com.google.android.libraries.places.internal.zzdt.zza
            com.google.android.libraries.places.internal.zzks r1 = com.google.android.libraries.places.internal.zzks.zza(r1)
            com.google.android.libraries.places.internal.zzkh r0 = com.google.android.libraries.places.internal.zzkh.zzo(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.net.wifi.WifiInfo r14 = r14.getConnectionInfo()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L_0x003b:
            if (r4 >= r2) goto L_0x009b
            java.lang.Object r5 = r0.get(r4)
            android.net.wifi.ScanResult r5 = (android.net.wifi.ScanResult) r5
            if (r5 == 0) goto L_0x0098
            java.lang.String r6 = r5.SSID
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x004e
            goto L_0x0098
        L_0x004e:
            com.google.android.libraries.places.internal.zzde r6 = r13.zzc
            long r6 = r6.zza()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r8 = r5.timestamp
            long r6 = r6 - r8
            long r8 = zzb
            java.lang.String r10 = r5.SSID
            if (r10 == 0) goto L_0x0090
            r11 = 95
            int r11 = r10.indexOf(r11)
            if (r11 >= 0) goto L_0x006a
        L_0x0068:
            r12 = r3
            goto L_0x0081
        L_0x006a:
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "_nomap"
            boolean r11 = r10.contains(r11)
            r12 = 1
            if (r11 != 0) goto L_0x0081
            java.lang.String r11 = "_optout"
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0068
        L_0x0081:
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0098
            if (r12 != 0) goto L_0x0098
            com.google.android.libraries.places.internal.zzds r6 = new com.google.android.libraries.places.internal.zzds
            r6.<init>(r14, r5)
            r1.add(r6)
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Null SSID."
            r14.<init>(r0)
            throw r14
        L_0x0098:
            int r4 = r4 + 1
            goto L_0x003b
        L_0x009b:
            com.google.android.libraries.places.internal.zzkh r14 = com.google.android.libraries.places.internal.zzkh.zzj(r1)
            return r14
        L_0x00a0:
            com.google.android.libraries.places.internal.zzkh r14 = com.google.android.libraries.places.internal.zzkh.zzl()
            return r14
        L_0x00a5:
            com.google.android.libraries.places.internal.zzkh r14 = com.google.android.libraries.places.internal.zzkh.zzl()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzdu.zza(java.lang.String):com.google.android.libraries.places.internal.zzkh");
    }
}
