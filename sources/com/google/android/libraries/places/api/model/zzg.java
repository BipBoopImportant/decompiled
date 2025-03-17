package com.google.android.libraries.places.api.model;

abstract class zzg extends zzbk {
    private final int zza;
    private final int zzb;

    zzg(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbk) {
            zzbk zzbk = (zzbk) obj;
            return this.zza == zzbk.zzb() && this.zzb == zzbk.zza();
        }
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        return "SubstringMatch{offset=" + i10 + ", length=" + i11 + "}";
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zza;
    }
}
