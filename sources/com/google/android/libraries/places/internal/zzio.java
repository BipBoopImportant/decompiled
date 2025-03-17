package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.List;
import xa.C8961b;
import xa.C8971l;
import xa.C8974o;

public final class zzio implements zzih {
    public static final /* synthetic */ int zza = 0;
    private static final zzkh zzb = zzkh.zzn(Place.Field.ID, Place.Field.TYPES);
    private final PlacesClient zzc;
    private final zzia zzd;
    private final AutocompleteSessionToken zze;
    private zzik zzf;
    private zzil zzg;

    public zzio(PlacesClient placesClient, zzia zzia, AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = placesClient;
        this.zzd = zzia;
        this.zze = autocompleteSessionToken;
    }

    public final C8971l zza(AutocompletePrediction autocompletePrediction) {
        if (zzb.containsAll(this.zzd.zzj())) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            builder.setTypes(autocompletePrediction.getPlaceTypes().isEmpty() ? null : autocompletePrediction.getPlaceTypes());
            return C8974o.f(FetchPlaceResponse.newInstance(builder.build()));
        }
        zzil zzil = this.zzg;
        if (zzil != null) {
            if (zzil.zzb().equals(autocompletePrediction.getPlaceId())) {
                C8971l zzc2 = zzil.zzc();
                zzc2.getClass();
                return zzc2;
            }
            zzil.zza().a();
        }
        zzig zzig = new zzig(new C8961b(), autocompletePrediction.getPlaceId());
        this.zzg = zzig;
        PlacesClient placesClient = this.zzc;
        FetchPlaceRequest.Builder builder2 = FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), this.zzd.zzj());
        builder2.setSessionToken(this.zze);
        builder2.setCancellationToken(zzig.zza().b());
        C8971l<TContinuationResult> k10 = placesClient.fetchPlace(builder2.build()).k(new zzii(zzig));
        zzig.zzd(k10);
        return k10;
    }

    public final C8971l zzb(String str) {
        zzjp.zzd(!TextUtils.isEmpty(str));
        zzik zzik = this.zzf;
        if (zzik != null) {
            if (zzik.zzb().equals(str)) {
                C8971l zzc2 = zzik.zzc();
                zzc2.getClass();
                return zzc2;
            }
            zzik.zza().a();
        }
        zzif zzif = new zzif(new C8961b(), str);
        this.zzf = zzif;
        PlacesClient placesClient = this.zzc;
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        builder.setQuery(str);
        builder.setLocationBias(this.zzd.zzc());
        builder.setLocationRestriction(this.zzd.zzd());
        builder.setCountries((List<String>) this.zzd.zzi());
        builder.setTypeFilter(this.zzd.zze());
        builder.setTypesFilter(this.zzd.zzk());
        builder.setSessionToken(this.zze);
        builder.setCancellationToken(zzif.zza().b());
        C8971l<TContinuationResult> k10 = placesClient.findAutocompletePredictions(builder.build()).k(new zzij(zzif));
        zzif.zzd(k10);
        return k10;
    }

    public final void zzc() {
        zzik zzik = this.zzf;
        if (zzik != null) {
            zzik.zza().a();
        }
        zzil zzil = this.zzg;
        if (zzil != null) {
            zzil.zza().a();
        }
        this.zzf = null;
        this.zzg = null;
    }
}
