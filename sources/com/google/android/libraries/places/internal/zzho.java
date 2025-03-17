package com.google.android.libraries.places.internal;

import android.content.Context;

public final class zzho {
    private final Context zza;

    public zzho(Context context) {
        zzjp.zzc(context, "Context must not be null.");
        this.zza = context;
    }

    public final zzkk zza() {
        String packageName = this.zza.getPackageName();
        String zza2 = zzhd.zza(this.zza.getPackageManager(), packageName);
        zzkj zzkj = new zzkj();
        if (packageName != null) {
            zzkj.zza("X-Android-Package", packageName);
        }
        if (zza2 != null) {
            zzkj.zza("X-Android-Cert", zza2);
        }
        return zzkj.zzb();
    }
}
