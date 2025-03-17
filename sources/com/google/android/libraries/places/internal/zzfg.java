package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzfg extends zzft {
    zzfg(FetchPlaceRequest fetchPlaceRequest, Locale locale, String str, boolean z10, zzho zzho) {
        super(fetchPlaceRequest, locale, str, false, zzho);
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        return "details/json";
    }

    public final Map zzf() {
        FetchPlaceRequest fetchPlaceRequest = (FetchPlaceRequest) zzb();
        HashMap hashMap = new HashMap();
        zzft.zzg(hashMap, "placeid", fetchPlaceRequest.getPlaceId(), (Object) null);
        zzft.zzg(hashMap, "sessiontoken", fetchPlaceRequest.getSessionToken(), (Object) null);
        zzft.zzg(hashMap, "fields", zzgm.zza(fetchPlaceRequest.getPlaceFields()), (Object) null);
        return hashMap;
    }
}
