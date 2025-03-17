package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;
import xa.C8960a;

final class zzk extends FindAutocompletePredictionsRequest {
    private final String zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final LatLng zzd;
    private final List zze;
    private final AutocompleteSessionToken zzf;
    private final TypeFilter zzg;
    private final List zzh;
    private final C8960a zzi;

    /* synthetic */ zzk(String str, LocationBias locationBias, LocationRestriction locationRestriction, LatLng latLng, List list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, List list2, C8960a aVar, zzj zzj) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = typeFilter;
        this.zzh = list2;
        this.zzi = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.zzf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        r1 = r4.zzg;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        r1 = r4.zzi;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
            r2 = 0
            if (r1 == 0) goto L_0x00b8
            com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest r5 = (com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest) r5
            java.lang.String r1 = r4.zza
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.getQuery()
            if (r1 != 0) goto L_0x00b8
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.getQuery()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
        L_0x0020:
            com.google.android.libraries.places.api.model.LocationBias r1 = r4.zzb
            if (r1 != 0) goto L_0x002b
            com.google.android.libraries.places.api.model.LocationBias r1 = r5.getLocationBias()
            if (r1 != 0) goto L_0x00b8
            goto L_0x0035
        L_0x002b:
            com.google.android.libraries.places.api.model.LocationBias r3 = r5.getLocationBias()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
        L_0x0035:
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r4.zzc
            if (r1 != 0) goto L_0x0040
            com.google.android.libraries.places.api.model.LocationRestriction r1 = r5.getLocationRestriction()
            if (r1 != 0) goto L_0x00b8
            goto L_0x004a
        L_0x0040:
            com.google.android.libraries.places.api.model.LocationRestriction r3 = r5.getLocationRestriction()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
        L_0x004a:
            com.google.android.gms.maps.model.LatLng r1 = r4.zzd
            if (r1 != 0) goto L_0x0055
            com.google.android.gms.maps.model.LatLng r1 = r5.getOrigin()
            if (r1 != 0) goto L_0x00b8
            goto L_0x005f
        L_0x0055:
            com.google.android.gms.maps.model.LatLng r3 = r5.getOrigin()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
        L_0x005f:
            java.util.List r1 = r4.zze
            java.util.List r3 = r5.getCountries()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r4.zzf
            if (r1 != 0) goto L_0x0076
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r1 = r5.getSessionToken()
            if (r1 != 0) goto L_0x00b8
            goto L_0x0080
        L_0x0076:
            com.google.android.libraries.places.api.model.AutocompleteSessionToken r3 = r5.getSessionToken()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
        L_0x0080:
            com.google.android.libraries.places.api.model.TypeFilter r1 = r4.zzg
            if (r1 != 0) goto L_0x008b
            com.google.android.libraries.places.api.model.TypeFilter r1 = r5.getTypeFilter()
            if (r1 != 0) goto L_0x00b8
            goto L_0x0095
        L_0x008b:
            com.google.android.libraries.places.api.model.TypeFilter r3 = r5.getTypeFilter()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
        L_0x0095:
            java.util.List r1 = r4.zzh
            java.util.List r3 = r5.getTypesFilter()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b8
            xa.a r1 = r4.zzi
            if (r1 != 0) goto L_0x00ac
            xa.a r5 = r5.getCancellationToken()
            if (r5 != 0) goto L_0x00b8
            goto L_0x00b7
        L_0x00ac:
            xa.a r5 = r5.getCancellationToken()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            return r0
        L_0x00b8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.net.zzk.equals(java.lang.Object):boolean");
    }

    public final C8960a getCancellationToken() {
        return this.zzi;
    }

    public final List<String> getCountries() {
        return this.zze;
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

    @Deprecated
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    public final List<String> getTypesFilter() {
        return this.zzh;
    }

    public final int hashCode() {
        String str = this.zza;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        LocationBias locationBias = this.zzb;
        int hashCode2 = locationBias == null ? 0 : locationBias.hashCode();
        int i11 = hashCode ^ 1000003;
        LocationRestriction locationRestriction = this.zzc;
        int hashCode3 = ((((i11 * 1000003) ^ hashCode2) * 1000003) ^ (locationRestriction == null ? 0 : locationRestriction.hashCode())) * 1000003;
        LatLng latLng = this.zzd;
        int hashCode4 = (((hashCode3 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003) ^ this.zze.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        int hashCode5 = (hashCode4 ^ (autocompleteSessionToken == null ? 0 : autocompleteSessionToken.hashCode())) * 1000003;
        TypeFilter typeFilter = this.zzg;
        int hashCode6 = (((hashCode5 ^ (typeFilter == null ? 0 : typeFilter.hashCode())) * 1000003) ^ this.zzh.hashCode()) * 1000003;
        C8960a aVar = this.zzi;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode6 ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String obj = this.zze.toString();
        String valueOf4 = String.valueOf(this.zzf);
        String valueOf5 = String.valueOf(this.zzg);
        String obj2 = this.zzh.toString();
        String valueOf6 = String.valueOf(this.zzi);
        return "FindAutocompletePredictionsRequest{query=" + str + ", locationBias=" + valueOf + ", locationRestriction=" + valueOf2 + ", origin=" + valueOf3 + ", countries=" + obj + ", sessionToken=" + valueOf4 + ", typeFilter=" + valueOf5 + ", typesFilter=" + obj2 + ", cancellationToken=" + valueOf6 + "}";
    }
}
