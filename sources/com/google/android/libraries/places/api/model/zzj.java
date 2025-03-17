package com.google.android.libraries.places.api.model;

abstract class zzj extends LocalDate {
    private final int zza;
    private final int zzb;
    private final int zzc;

    zzj(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalDate) {
            LocalDate localDate = (LocalDate) obj;
            return this.zza == localDate.getYear() && this.zzb == localDate.getMonth() && this.zzc == localDate.getDay();
        }
    }

    public final int getDay() {
        return this.zzc;
    }

    public final int getMonth() {
        return this.zzb;
    }

    public final int getYear() {
        return this.zza;
    }

    public final int hashCode() {
        return ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }
}
