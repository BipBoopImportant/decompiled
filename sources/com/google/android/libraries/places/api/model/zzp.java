package com.google.android.libraries.places.api.model;

abstract class zzp extends Period {
    private final TimeOfWeek zza;
    private final TimeOfWeek zzb;

    zzp(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        this.zza = timeOfWeek;
        this.zzb = timeOfWeek2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Period) {
            Period period = (Period) obj;
            TimeOfWeek timeOfWeek = this.zza;
            if (timeOfWeek != null ? timeOfWeek.equals(period.getOpen()) : period.getOpen() == null) {
                TimeOfWeek timeOfWeek2 = this.zzb;
                if (timeOfWeek2 != null ? timeOfWeek2.equals(period.getClose()) : period.getClose() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    public final int hashCode() {
        TimeOfWeek timeOfWeek = this.zza;
        int i10 = 0;
        int hashCode = timeOfWeek == null ? 0 : timeOfWeek.hashCode();
        TimeOfWeek timeOfWeek2 = this.zzb;
        if (timeOfWeek2 != null) {
            i10 = timeOfWeek2.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return "Period{open=" + valueOf + ", close=" + valueOf2 + "}";
    }
}
