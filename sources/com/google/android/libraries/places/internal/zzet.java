package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import xa.C8970k;
import xa.C8971l;

public final /* synthetic */ class zzet implements C8970k {
    public final /* synthetic */ zzex zza;
    public final /* synthetic */ FindCurrentPlaceRequest zzb;

    public /* synthetic */ zzet(zzex zzex, FindCurrentPlaceRequest findCurrentPlaceRequest, String str) {
        this.zza = zzex;
        this.zzb = findCurrentPlaceRequest;
    }

    public final C8971l then(Object obj) {
        return this.zza.zzb(this.zzb, (String) null, (Location) obj);
    }
}
