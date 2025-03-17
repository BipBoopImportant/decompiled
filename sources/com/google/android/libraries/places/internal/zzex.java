package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzbq;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import com.google.android.libraries.places.api.net.IsOpenResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xa.C8971l;
import xa.C8972m;

public final class zzex implements PlacesClient {
    private final zzdz zza;
    private final zzdp zzb;
    private final zzdu zzc;
    private final zzha zzd;
    private final zzde zze;

    zzex(zzdz zzdz, zzdp zzdp, zzdu zzdu, zzha zzha, zzde zzde) {
        this.zza = zzdz;
        this.zzb = zzdp;
        this.zzc = zzdu;
        this.zzd = zzha;
        this.zze = zzde;
    }

    private static void zzh(zzdm zzdm, zzdn zzdn) {
        zzdm.zza(zzdm, zzdm.zzb("Duration"));
        zzdj.zza();
        zzdj.zza();
        zzdm.zza(zzdm, zzdm.zzb("Battery"));
        zzdj.zza();
    }

    public final C8971l<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest) {
        try {
            zzjp.zzc(fetchPhotoRequest, "Request must not be null.");
            zzdj.zza();
            return this.zza.zza(fetchPhotoRequest).i(new zzep(this, fetchPhotoRequest, zzdn.zza())).k(zzeq.zza);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final C8971l<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest) {
        try {
            zzjp.zzc(fetchPlaceRequest, "Request must not be null.");
            zzdj.zza();
            return this.zza.zzb(fetchPlaceRequest).i(new zzev(this, fetchPlaceRequest, zzdn.zza())).k(zzeq.zza);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final C8971l<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        try {
            zzjp.zzc(findAutocompletePredictionsRequest, "Request must not be null.");
            zzdj.zza();
            return this.zza.zzc(findAutocompletePredictionsRequest).i(new zzew(this, findAutocompletePredictionsRequest, zzdn.zza())).k(zzeq.zza);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final C8971l<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zza(findCurrentPlaceRequest, (String) null);
    }

    public final C8971l<IsOpenResponse> isOpen(IsOpenRequest isOpenRequest) {
        List list;
        try {
            zzjp.zzc(isOpenRequest, "Request must not be null.");
            Place place = isOpenRequest.getPlace();
            String placeId = isOpenRequest.getPlaceId();
            long utcTimeMillis = isOpenRequest.getUtcTimeMillis();
            C8972m mVar = new C8972m();
            if (place == null) {
                int i10 = zzbq.zza;
                list = Arrays.asList(new Place.Field[]{Place.Field.BUSINESS_STATUS, Place.Field.CURRENT_OPENING_HOURS, Place.Field.OPENING_HOURS, Place.Field.UTC_OFFSET});
            } else {
                list = new ArrayList();
                Place.BusinessStatus businessStatus = place.getBusinessStatus();
                if (businessStatus == null || businessStatus == Place.BusinessStatus.OPERATIONAL) {
                    if (businessStatus == null) {
                        list.add(Place.Field.BUSINESS_STATUS);
                    }
                    if (place.getCurrentOpeningHours() == null) {
                        list.add(Place.Field.CURRENT_OPENING_HOURS);
                    }
                    if (place.getOpeningHours() == null) {
                        list.add(Place.Field.OPENING_HOURS);
                    }
                    if (place.getUtcOffsetMinutes() == null) {
                        list.add(Place.Field.UTC_OFFSET);
                    }
                }
            }
            if (!list.isEmpty()) {
                if (place != null) {
                    placeId = place.getId();
                }
                if (placeId != null) {
                    FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder(placeId, list);
                    builder.setCancellationToken(isOpenRequest.getCancellationToken());
                    FetchPlaceRequest build = builder.build();
                    zzdj.zza();
                    return this.zza.zzb(build).i(new zzer(this, build, zzdn.zza())).s(new zzes(place, utcTimeMillis, mVar)).k(zzeq.zza);
                }
                throw null;
            } else if (place != null) {
                mVar.c(IsOpenResponse.newInstance(zzbq.zza(place, utcTimeMillis)));
                return mVar.a();
            } else {
                throw null;
            }
        } catch (Error e10) {
            e = e10;
            zzhk.zzb(e);
            throw e;
        } catch (RuntimeException e11) {
            e = e11;
            zzhk.zzb(e);
            throw e;
        }
    }

    public final C8971l zza(FindCurrentPlaceRequest findCurrentPlaceRequest, String str) {
        try {
            zzjp.zzc(findCurrentPlaceRequest, "Request must not be null.");
            long zza2 = this.zze.zza();
            zzdj.zza();
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).s(new zzet(this, findCurrentPlaceRequest, (String) null)).i(new zzeu(this, findCurrentPlaceRequest, zza2, zzdn.zza())).k(zzeq.zza);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C8971l zzb(FindCurrentPlaceRequest findCurrentPlaceRequest, String str, Location location) {
        zzjp.zzc(location, "Location must not be null.");
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza((String) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPhotoResponse zzc(FetchPhotoRequest fetchPhotoRequest, zzdn zzdn, C8971l lVar) {
        this.zzd.zza(fetchPhotoRequest);
        zzh(zzdm.zzb("FetchPhoto"), zzdn);
        return (FetchPhotoResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPlaceResponse zzd(FetchPlaceRequest fetchPlaceRequest, zzdn zzdn, C8971l lVar) {
        this.zzd.zzc(fetchPlaceRequest);
        zzh(zzdm.zzb("FetchPlace"), zzdn);
        return (FetchPlaceResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPlaceResponse zze(FetchPlaceRequest fetchPlaceRequest, zzdn zzdn, C8971l lVar) {
        this.zzd.zzc(fetchPlaceRequest);
        zzh(zzdm.zzb("IsOpenFetchPlace"), zzdn);
        return (FetchPlaceResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FindAutocompletePredictionsResponse zzf(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzdn zzdn, C8971l lVar) {
        this.zzd.zze(findAutocompletePredictionsRequest);
        zzh(zzdm.zzb("FindAutocompletePredictions"), zzdn);
        return (FindAutocompletePredictionsResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FindCurrentPlaceResponse zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, long j10, zzdn zzdn, C8971l lVar) {
        this.zzd.zzg(findCurrentPlaceRequest, lVar, j10, this.zze.zza());
        zzh(zzdm.zzb("FindCurrentPlace"), zzdn);
        return (FindCurrentPlaceResponse) lVar.m();
    }
}
