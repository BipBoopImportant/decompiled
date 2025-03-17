package com.google.android.libraries.places.internal;

public final class zzdj {
    static zzdj zza;
    private final zzdk zzb;

    private zzdj(zzdk zzdk) {
        this.zzb = zzdk;
    }

    public static zzdj zza() {
        zzdj zzdj = new zzdj(new zzdi());
        zza = zzdj;
        return zzdj;
    }
}
