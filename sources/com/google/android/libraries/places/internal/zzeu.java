package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import xa.C8962c;
import xa.C8971l;

public final /* synthetic */ class zzeu implements C8962c {
    public final /* synthetic */ zzex zza;
    public final /* synthetic */ FindCurrentPlaceRequest zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ zzdn zzd;

    public /* synthetic */ zzeu(zzex zzex, FindCurrentPlaceRequest findCurrentPlaceRequest, long j10, zzdn zzdn) {
        this.zza = zzex;
        this.zzb = findCurrentPlaceRequest;
        this.zzc = j10;
        this.zzd = zzdn;
    }

    public final Object then(C8971l lVar) {
        return this.zza.zzg(this.zzb, this.zzc, this.zzd, lVar);
    }
}
