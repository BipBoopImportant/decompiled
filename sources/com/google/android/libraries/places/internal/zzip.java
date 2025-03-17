package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import xa.C8965f;
import xa.C8971l;

public final /* synthetic */ class zzip implements C8965f {
    public final /* synthetic */ zziu zza;
    public final /* synthetic */ AutocompletePrediction zzb;

    public /* synthetic */ zzip(zziu zziu, AutocompletePrediction autocompletePrediction) {
        this.zza = zziu;
        this.zzb = autocompletePrediction;
    }

    public final void onComplete(C8971l lVar) {
        this.zza.zzc(this.zzb, lVar);
    }
}
