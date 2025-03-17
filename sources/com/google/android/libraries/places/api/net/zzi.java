package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import java.util.List;
import xa.C8960a;

final class zzi extends FindAutocompletePredictionsRequest.Builder {
    private String zza;
    private LocationBias zzb;
    private LocationRestriction zzc;
    private LatLng zzd;
    private List zze;
    private AutocompleteSessionToken zzf;
    private TypeFilter zzg;
    private List zzh;
    private C8960a zzi;

    zzi() {
    }

    public final C8960a getCancellationToken() {
        return this.zzi;
    }

    public final List<String> getCountries() {
        List<String> list = this.zze;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"countries\" has not been set");
    }

    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    public final LatLng getOrigin() {
        return this.zzd;
    }

    public final String getQuery() {
        return this.zza;
    }

    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    public final List<String> getTypesFilter() {
        List<String> list = this.zzh;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("Property \"typesFilter\" has not been set");
    }

    public final FindAutocompletePredictionsRequest.Builder setCancellationToken(C8960a aVar) {
        this.zzi = aVar;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setCountries(List<String> list) {
        if (list != null) {
            this.zze = list;
            return this;
        }
        throw new NullPointerException("Null countries");
    }

    public final FindAutocompletePredictionsRequest.Builder setLocationBias(LocationBias locationBias) {
        this.zzb = locationBias;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setLocationRestriction(LocationRestriction locationRestriction) {
        this.zzc = locationRestriction;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setOrigin(LatLng latLng) {
        this.zzd = latLng;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setQuery(String str) {
        this.zza = str;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken) {
        this.zzf = autocompleteSessionToken;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setTypeFilter(TypeFilter typeFilter) {
        this.zzg = typeFilter;
        return this;
    }

    public final FindAutocompletePredictionsRequest.Builder setTypesFilter(List<String> list) {
        if (list != null) {
            this.zzh = list;
            return this;
        }
        throw new NullPointerException("Null typesFilter");
    }

    /* access modifiers changed from: package-private */
    public final FindAutocompletePredictionsRequest zza() {
        List list;
        List list2 = this.zze;
        if (list2 != null && (list = this.zzh) != null) {
            return new zzk(this.zza, this.zzb, this.zzc, this.zzd, list2, this.zzf, this.zzg, list, this.zzi, (zzj) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zze == null) {
            sb2.append(" countries");
        }
        if (this.zzh == null) {
            sb2.append(" typesFilter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
