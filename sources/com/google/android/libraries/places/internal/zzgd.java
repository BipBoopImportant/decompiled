package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;
import java.util.Locale;
import xa.C8971l;
import xa.C8974o;

public final class zzgd implements zzdz {
    private final zzho zza;
    private final zzee zzb;
    private final zzek zzc;
    private final zzha zzd;
    private final zzde zze;
    private final zzfe zzf;
    private final zzfi zzg;
    private final zzfm zzh;
    private final zzfq zzi;
    private final zzhb zzj;

    zzgd(zzhb zzhb, zzho zzho, zzee zzee, zzek zzek, zzha zzha, zzde zzde, zzfe zzfe, zzfi zzfi, zzfm zzfm, zzfq zzfq) {
        this.zzj = zzhb;
        this.zza = zzho;
        this.zzb = zzee;
        this.zzc = zzek;
        this.zzd = zzha;
        this.zze = zzde;
        this.zzf = zzfe;
        this.zzg = zzfi;
        this.zzh = zzfm;
        this.zzi = zzfq;
    }

    static final /* synthetic */ FetchPlaceResponse zzi(C8971l lVar) {
        zzfh zzfh = (zzfh) lVar.m();
        int zza2 = zzgk.zza(zzfh.status);
        if (!PlacesStatusCodes.isError(zza2)) {
            zzgj zzgj = zzfh.result;
            String[] strArr = zzfh.htmlAttributions;
            return FetchPlaceResponse.newInstance(zzgg.zzf(zzgj, strArr != null ? zzkh.zzk(strArr) : null));
        }
        throw new b(new Status(zza2, zzgk.zzb(zzfh.status, zzfh.errorMessage)));
    }

    static final /* synthetic */ FindCurrentPlaceResponse zzj(C8971l lVar) {
        zzfp zzfp = (zzfp) lVar.m();
        int zza2 = zzgk.zza(zzfp.status);
        if (!PlacesStatusCodes.isError(zza2)) {
            ArrayList arrayList = new ArrayList();
            zzgi[] zzgiArr = zzfp.predictions;
            if (zzgiArr != null) {
                int i10 = 0;
                while (i10 < zzgiArr.length) {
                    zzgi zzgi = zzgiArr[i10];
                    if (zzgi.zza() != null) {
                        Double zzb2 = zzgi.zzb();
                        if (zzb2 != null) {
                            zzgj zza3 = zzgi.zza();
                            String[] strArr = zzfp.htmlAttributions;
                            arrayList.add(PlaceLikelihood.newInstance(zzgg.zzf(zza3, strArr != null ? zzkh.zzk(strArr) : null), zzb2.doubleValue()));
                            i10++;
                        } else {
                            throw new b(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                        }
                    } else {
                        throw new b(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                    }
                }
            }
            return FindCurrentPlaceResponse.newInstance(arrayList);
        }
        throw new b(new Status(zza2, zzgk.zzb(zzfp.status, zzfp.errorMessage)));
    }

    public final C8971l zza(FetchPhotoRequest fetchPhotoRequest) {
        Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            return C8974o.e(new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
        }
        if (maxWidth != null && maxWidth.intValue() <= 0) {
            return C8974o.e(new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, String.format("Max Width must not be < 1, but was: %d.", new Object[]{maxWidth}))));
        }
        if (maxHeight != null && maxHeight.intValue() <= 0) {
            return C8974o.e(new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, String.format("Max Height must not be < 1, but was: %d.", new Object[]{maxHeight}))));
        }
        String zza2 = this.zzj.zza();
        this.zzj.zze();
        return this.zzc.zzb(new zzfa(fetchPhotoRequest, zza2, false, this.zza), new zzfb()).i(new zzgb(this)).i(new zzgc(this, this.zze.zza()));
    }

    public final C8971l zzb(FetchPlaceRequest fetchPlaceRequest) {
        if (TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return C8974o.e(new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            return C8974o.e(new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        Locale zzb2 = this.zzj.zzb();
        String zza2 = this.zzj.zza();
        this.zzj.zze();
        return this.zzb.zza(new zzfg(fetchPlaceRequest, zzb2, zza2, false, this.zza), zzfh.class).i(new zzfx(this)).i(new zzfy(this, this.zze.zza()));
    }

    public final C8971l zzc(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null || TextUtils.isEmpty(query.trim())) {
            return C8974o.f(FindAutocompletePredictionsResponse.newInstance(zzkh.zzl()));
        }
        Locale zzb2 = this.zzj.zzb();
        String zza2 = this.zzj.zza();
        this.zzj.zze();
        return this.zzb.zza(new zzfk(findAutocompletePredictionsRequest, zzb2, zza2, false, this.zza), zzfl.class).i(new zzfv(this)).i(new zzfw(this, this.zze.zza()));
    }

    public final C8971l zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzkh zzkh) {
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            return C8974o.e(new b(new Status((int) PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        Locale zzb2 = this.zzj.zzb();
        String zza2 = this.zzj.zza();
        this.zzj.zze();
        return this.zzb.zza(new zzfo(findCurrentPlaceRequest, location, zzkh, zzb2, zza2, false, this.zza), zzfp.class).i(new zzfz(this)).i(new zzga(this, this.zze.zza()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPhotoResponse zze(long j10, C8971l lVar) {
        this.zzd.zzb(lVar, j10, this.zze.zza());
        return (FetchPhotoResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPlaceResponse zzf(long j10, C8971l lVar) {
        this.zzd.zzd(lVar, j10, this.zze.zza());
        return (FetchPlaceResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FindAutocompletePredictionsResponse zzg(long j10, C8971l lVar) {
        this.zzd.zzf(lVar, j10, this.zze.zza());
        return (FindAutocompletePredictionsResponse) lVar.m();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FindCurrentPlaceResponse zzh(long j10, C8971l lVar) {
        this.zzd.zzh(lVar, j10, this.zze.zza());
        return (FindCurrentPlaceResponse) lVar.m();
    }
}
