package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.Period;

final class zzo extends Period.Builder {
    private TimeOfWeek zza;
    private TimeOfWeek zzb;

    zzo() {
    }

    public final Period build() {
        return new zzau(this.zza, this.zzb);
    }

    public final TimeOfWeek getClose() {
        return this.zzb;
    }

    public final TimeOfWeek getOpen() {
        return this.zza;
    }

    public final Period.Builder setClose(TimeOfWeek timeOfWeek) {
        this.zzb = timeOfWeek;
        return this;
    }

    public final Period.Builder setOpen(TimeOfWeek timeOfWeek) {
        this.zza = timeOfWeek;
        return this;
    }
}
