package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzfa extends zzft {
    zzfa(FetchPhotoRequest fetchPhotoRequest, String str, boolean z10, zzho zzho) {
        super(fetchPhotoRequest, (Locale) null, str, false, zzho);
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        return "photo";
    }

    public final Map zzf() {
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) zzb();
        PhotoMetadata photoMetadata = fetchPhotoRequest.getPhotoMetadata();
        HashMap hashMap = new HashMap();
        zzft.zzg(hashMap, "maxheight", fetchPhotoRequest.getMaxHeight(), (Object) null);
        zzft.zzg(hashMap, "maxwidth", fetchPhotoRequest.getMaxWidth(), (Object) null);
        hashMap.put("photoreference", photoMetadata.zza());
        return hashMap;
    }
}
