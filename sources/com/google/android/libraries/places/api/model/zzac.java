package com.google.android.libraries.places.api.model;

abstract class zzac extends TimeOfWeek {
    private final LocalDate zza;
    private final DayOfWeek zzb;
    private final LocalTime zzc;
    private final boolean zzd;

    zzac(LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10) {
        this.zza = localDate;
        if (dayOfWeek != null) {
            this.zzb = dayOfWeek;
            if (localTime != null) {
                this.zzc = localTime;
                this.zzd = z10;
                return;
            }
            throw new NullPointerException("Null time");
        }
        throw new NullPointerException("Null day");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TimeOfWeek) {
            TimeOfWeek timeOfWeek = (TimeOfWeek) obj;
            LocalDate localDate = this.zza;
            if (localDate != null ? localDate.equals(timeOfWeek.getDate()) : timeOfWeek.getDate() == null) {
                return this.zzb.equals(timeOfWeek.getDay()) && this.zzc.equals(timeOfWeek.getTime()) && this.zzd == timeOfWeek.isTruncated();
            }
        }
    }

    public final LocalDate getDate() {
        return this.zza;
    }

    public final DayOfWeek getDay() {
        return this.zzb;
    }

    public final LocalTime getTime() {
        return this.zzc;
    }

    public final int hashCode() {
        LocalDate localDate = this.zza;
        return (((((((localDate == null ? 0 : localDate.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode()) * 1000003) ^ (true != this.zzd ? 1237 : 1231);
    }

    public final boolean isTruncated() {
        return this.zzd;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String obj = this.zzb.toString();
        String obj2 = this.zzc.toString();
        boolean z10 = this.zzd;
        return "TimeOfWeek{date=" + valueOf + ", day=" + obj + ", time=" + obj2 + ", truncated=" + z10 + "}";
    }
}
