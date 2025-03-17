package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.List;
import xa.C8960a;

final class zze extends FetchPlaceRequest.Builder {
    private String zza;
    private List zzb;
    private AutocompleteSessionToken zzc;
    private C8960a zzd;

    zze() {
    }

    public final C8960a getCancellationToken() {
        return this.zzd;
    }

    public final AutocompleteSessionToken getSessionToken() {
        return this.zzc;
    }

    public final FetchPlaceRequest.Builder setCancellationToken(C8960a aVar) {
        this.zzd = aVar;
        return this;
    }

    public final FetchPlaceRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = autocompleteSessionToken;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final FetchPlaceRequest.Builder zza(List list) {
        if (list != null) {
            this.zzb = list;
            return this;
        }
        throw new NullPointerException("Null placeFields");
    }

    /* access modifiers changed from: package-private */
    public final FetchPlaceRequest.Builder zzb(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null placeId");
    }

    /* access modifiers changed from: package-private */
    public final FetchPlaceRequest zzc() {
        List list;
        String str = this.zza;
        if (str != null && (list = this.zzb) != null) {
            return new zzg(str, list, this.zzc, this.zzd, (zzf) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" placeId");
        }
        if (this.zzb == null) {
            sb2.append(" placeFields");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
