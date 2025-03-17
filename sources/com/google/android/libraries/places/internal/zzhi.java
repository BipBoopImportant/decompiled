package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;

public abstract class zzhi {
    public static zzhh zzd(Context context) {
        String packageName = context.getPackageName();
        int i10 = 0;
        try {
            i10 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzhe zzhe = new zzhe();
        zzhe.zza(packageName);
        zzhe.zzb(i10);
        zzhe.zzd(1);
        return zzhe;
    }

    public abstract int zza();

    public abstract String zzb();

    public abstract int zzc();
}
