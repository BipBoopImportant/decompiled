package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

public final /* synthetic */ class zzdt implements Comparator {
    public static final /* synthetic */ zzdt zza = new zzdt();

    private /* synthetic */ zzdt() {
    }

    public final int compare(Object obj, Object obj2) {
        int i10 = zzdu.zza;
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
