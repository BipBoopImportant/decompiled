package com.google.android.libraries.places.internal;

final class zzhg extends zzhi {
    private final String zza;
    private final int zzb;
    private final int zzc;

    /* synthetic */ zzhg(String str, int i10, int i11, zzhf zzhf) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhi) {
            zzhi zzhi = (zzhi) obj;
            return this.zza.equals(zzhi.zzb()) && this.zzb == zzhi.zza() && this.zzc == zzhi.zzc();
        }
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        String str = this.zza;
        int i10 = this.zzb;
        String str2 = this.zzc != 1 ? "AUTOCOMPLETE_WIDGET" : "PROGRAMMATIC_API";
        return "ClientProfile{packageName=" + str + ", versionCode=" + i10 + ", requestSource=" + str2 + "}";
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzc;
    }
}
