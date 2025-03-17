package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.List;
import xa.C8960a;

final class zzm extends FindCurrentPlaceRequest.Builder {
    private List zza;
    private C8960a zzb;

    zzm() {
    }

    public final C8960a getCancellationToken() {
        return this.zzb;
    }

    public final FindCurrentPlaceRequest.Builder setCancellationToken(C8960a aVar) {
        this.zzb = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final FindCurrentPlaceRequest.Builder zza(List list) {
        if (list != null) {
            this.zza = list;
            return this;
        }
        throw new NullPointerException("Null placeFields");
    }

    /* access modifiers changed from: package-private */
    public final FindCurrentPlaceRequest zzb() {
        List list = this.zza;
        if (list != null) {
            return new zzo(list, this.zzb, (zzn) null);
        }
        throw new IllegalStateException("Missing required properties: placeFields");
    }
}
