package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TypeFilter;

public final class zzgn {
    private static final zzkk zza;

    static {
        zzkj zzkj = new zzkj();
        zzkj.zza(TypeFilter.ADDRESS, PlaceTypes.ADDRESS);
        zzkj.zza(TypeFilter.CITIES, PlaceTypes.CITIES);
        zzkj.zza(TypeFilter.ESTABLISHMENT, PlaceTypes.ESTABLISHMENT);
        zzkj.zza(TypeFilter.GEOCODE, PlaceTypes.GEOCODE);
        zzkj.zza(TypeFilter.REGIONS, PlaceTypes.REGIONS);
        zza = zzkj.zzb();
    }

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}
