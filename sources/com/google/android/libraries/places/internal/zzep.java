package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import xa.C8962c;
import xa.C8971l;

public final /* synthetic */ class zzep implements C8962c {
    public final /* synthetic */ zzex zza;
    public final /* synthetic */ FetchPhotoRequest zzb;
    public final /* synthetic */ zzdn zzc;

    public /* synthetic */ zzep(zzex zzex, FetchPhotoRequest fetchPhotoRequest, zzdn zzdn) {
        this.zza = zzex;
        this.zzb = fetchPhotoRequest;
        this.zzc = zzdn;
    }

    public final Object then(C8971l lVar) {
        return this.zza.zzc(this.zzb, this.zzc, lVar);
    }
}
