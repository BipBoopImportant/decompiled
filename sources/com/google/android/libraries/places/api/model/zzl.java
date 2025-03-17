package com.google.android.libraries.places.api.model;

abstract class zzl extends LocalTime {
    private final int zza;
    private final int zzb;

    zzl(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            return this.zza == localTime.getHours() && this.zzb == localTime.getMinutes();
        }
    }

    public final int getHours() {
        return this.zza;
    }

    public final int getMinutes() {
        return this.zzb;
    }

    public final int hashCode() {
        return ((this.zza ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        return "LocalTime{hours=" + i10 + ", minutes=" + i11 + "}";
    }
}
