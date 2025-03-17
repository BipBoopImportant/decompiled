package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

final class zzfo extends zzft {
    private final Location zza;
    private final zzkh zzb;

    zzfo(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzkh zzkh, Locale locale, String str, boolean z10, zzho zzho) {
        super(findCurrentPlaceRequest, locale, str, false, zzho);
        this.zza = location;
        this.zzb = zzkh;
    }

    /* access modifiers changed from: protected */
    public final String zze() {
        return "findplacefromuserlocation/json";
    }

    public final Map zzf() {
        Integer num;
        FindCurrentPlaceRequest findCurrentPlaceRequest = (FindCurrentPlaceRequest) zzb();
        HashMap hashMap = new HashMap();
        zzft.zzg(hashMap, "location", zzgl.zza(this.zza), (Object) null);
        zzft.zzg(hashMap, "wifiaccesspoints", zzgl.zze(this.zzb, 4000), (Object) null);
        Location location = this.zza;
        if (location != null) {
            float accuracy = location.getAccuracy();
            if (location.hasAccuracy() && accuracy > 0.0f) {
                num = Integer.valueOf(Math.round(accuracy * 100.0f));
                zzft.zzg(hashMap, "precision", num, (Object) null);
                zzft.zzg(hashMap, "timestamp", Long.valueOf(this.zza.getTime()), (Object) null);
                zzft.zzg(hashMap, "fields", zzgm.zza(findCurrentPlaceRequest.getPlaceFields()), (Object) null);
                return hashMap;
            }
        }
        num = null;
        zzft.zzg(hashMap, "precision", num, (Object) null);
        zzft.zzg(hashMap, "timestamp", Long.valueOf(this.zza.getTime()), (Object) null);
        zzft.zzg(hashMap, "fields", zzgm.zza(findCurrentPlaceRequest.getPlaceFields()), (Object) null);
        return hashMap;
    }
}
