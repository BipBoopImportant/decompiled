package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;

public final class zzds {
    private final String zza;
    private final int zzb;
    private final zzdr zzc;
    private final boolean zzd;
    private final int zze;

    public zzds(WifiInfo wifiInfo, ScanResult scanResult) {
        zzdr zzdr;
        String str = scanResult.BSSID;
        String str2 = scanResult.capabilities;
        int i10 = scanResult.level;
        int i11 = scanResult.frequency;
        if (TextUtils.isEmpty(str2)) {
            zzdr = zzdr.OTHER;
        } else {
            String upperCase = str2.toUpperCase();
            zzdr = (upperCase.equals("[ESS]") || upperCase.equals("[IBSS]")) ? zzdr.NONE : upperCase.matches(".*WPA[0-9]*-PSK.*") ? zzdr.PSK : upperCase.matches(".*WPA[0-9]*-EAP.*") ? zzdr.EAP : zzdr.OTHER;
        }
        boolean z10 = false;
        if (wifiInfo != null && !TextUtils.isEmpty(str) && str.equalsIgnoreCase(wifiInfo.getBSSID())) {
            z10 = true;
        }
        this.zza = str;
        this.zzb = i10;
        this.zzc = zzdr;
        this.zzd = z10;
        this.zze = i11;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzdr zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
