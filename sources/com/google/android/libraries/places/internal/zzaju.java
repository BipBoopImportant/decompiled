package com.google.android.libraries.places.internal;

public final class zzaju implements zzajv {
    private static final Object zza = new Object();
    private volatile zzajv zzb;
    private volatile Object zzc = zza;

    private zzaju(zzajv zzajv) {
        this.zzb = zzajv;
    }

    public static zzajv zza(zzajv zzajv) {
        return new zzaju(zzajv);
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        if (this.zzb == null) {
            return this.zzc;
        }
        zzdh zzdh = new zzdh();
        this.zzc = zzdh;
        this.zzb = null;
        return zzdh;
    }
}
