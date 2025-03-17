package com.google.android.libraries.places.internal;

import java.util.Arrays;

public final class zzdm {
    private final String zza;

    private zzdm(String str) {
        this.zza = str;
    }

    public static zzdm zza(zzdm zzdm, zzdm... zzdmArr) {
        return new zzdm(zzdm.zza.concat(zzjk.zzb("").zze(zzkq.zza(Arrays.asList(zzdmArr), zzdl.zza))));
    }

    public static zzdm zzb(String str) {
        return new zzdm(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdm) {
            return this.zza.equals(((zzdm) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
