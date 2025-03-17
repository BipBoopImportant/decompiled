package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;

final class zzhu extends zzib {
    private String zza;
    private zzkh zzb;
    private Place zzc;
    private AutocompletePrediction zzd;
    private Status zze;
    private int zzf;

    zzhu() {
    }

    public final zzib zza(Place place) {
        this.zzc = place;
        return this;
    }

    public final zzib zzb(AutocompletePrediction autocompletePrediction) {
        this.zzd = autocompletePrediction;
        return this;
    }

    public final zzib zzc(List list) {
        this.zzb = zzkh.zzj(list);
        return this;
    }

    public final zzib zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzib zze(Status status) {
        this.zze = status;
        return this;
    }

    public final zzic zzf() {
        int i10 = this.zzf;
        if (i10 != 0) {
            return new zzhw(i10, this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzhv) null);
        }
        throw new IllegalStateException("Missing required properties: type");
    }

    public final zzib zzg(int i10) {
        this.zzf = i10;
        return this;
    }
}
