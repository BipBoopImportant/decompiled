package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import java.util.Locale;
import xa.C8971l;

public final class zzdw implements zzha {
    private final zzhi zza;
    private final zzhm zzb;
    private final zzhb zzc;

    zzdw(zzhm zzhm, zzhi zzhi, zzhb zzhb) {
        this.zzb = zzhm;
        this.zza = zzhi;
        this.zzc = zzhb;
    }

    static final int zzi(C8971l lVar) {
        if (lVar.q()) {
            return 2;
        }
        Exception l10 = lVar.l();
        l10.getClass();
        int b10 = (l10 instanceof b ? (b) l10 : new b(new Status(13, l10.getMessage()))).b();
        if (b10 != 7) {
            return b10 != 15 ? 1 : 3;
        }
        return 4;
    }

    private final zzacl zzj() {
        Locale zzb2 = this.zzc.zzb();
        Locale locale = Locale.getDefault();
        zzacl zza2 = zzacn.zza();
        zza2.zzd(zzb2.toString());
        if (!zzb2.equals(locale)) {
            zza2.zzb(locale.toString());
        }
        return zza2;
    }

    private final void zzk(zzzu zzzu) {
        zzaaw zzb2 = zzhn.zzb(this.zza);
        zzb2.zzl(16);
        zzb2.zze(zzzu);
        zzb2.zza(this.zzc.zza());
        zzl((zzabb) zzb2.zzq());
    }

    private final void zzl(zzabb zzabb) {
        this.zzb.zza(zzhn.zza(zzabb));
    }

    public final void zza(FetchPhotoRequest fetchPhotoRequest) {
        zzacd zza2 = zzacf.zza();
        zza2.zza(2);
        zzaaw zzb2 = zzhn.zzb(this.zza);
        zzb2.zzl(5);
        zzb2.zzg((zzacf) zza2.zzq());
        zzb2.zza(this.zzc.zza());
        zzl((zzabb) zzb2.zzq());
    }

    public final void zzb(C8971l lVar, long j10, long j11) {
        zzzp zza2 = zzzu.zza();
        zza2.zzf(15);
        zza2.zze(zzi(lVar));
        zza2.zzd((int) (j11 - j10));
        zzk((zzzu) zza2.zzq());
    }

    public final void zzc(FetchPlaceRequest fetchPlaceRequest) {
        zzabh zza2 = zzabi.zza();
        zza2.zza(1);
        zzacg zza3 = zzach.zza();
        zza3.zza(zzgm.zzb(fetchPlaceRequest.getPlaceFields()));
        zza2.zzb((zzach) zza3.zzq());
        zzacl zzj = zzj();
        zzj.zze(5);
        zzj.zzc((zzabi) zza2.zzq());
        zzaaw zzb2 = zzhn.zzb(this.zza);
        zzb2.zzl(1);
        zzb2.zzh((zzacn) zzj.zzq());
        zzb2.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzb2.zzj(sessionToken.toString());
        }
        zzl((zzabb) zzb2.zzq());
    }

    public final void zzd(C8971l lVar, long j10, long j11) {
        boolean q10 = lVar.q();
        zzzh zza2 = zzzi.zza();
        zza2.zza(1);
        zza2.zzb(q10 ? 1 : 0);
        zzzp zza3 = zzzu.zza();
        zza3.zzf(8);
        zza3.zzc((zzzi) zza2.zzq());
        zza3.zze(zzi(lVar));
        zza3.zzd((int) (j11 - j10));
        zzk((zzzu) zza3.zzq());
    }

    public final void zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        zzzy zza2 = zzzz.zza();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        if (typeFilter != null) {
            zza2.zza(zzgn.zza(typeFilter));
        }
        zzzz zzzz = (zzzz) zza2.zzq();
        zzaak zza3 = zzaal.zza();
        if (zzzz != null) {
            zza3.zza(zzzz);
        }
        zzacl zzj = zzj();
        zzj.zze(6);
        zzj.zza((zzaal) zza3.zzq());
        zzaaw zzb2 = zzhn.zzb(this.zza);
        zzb2.zzl(1);
        zzb2.zzh((zzacn) zzj.zzq());
        zzb2.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzb2.zzj(sessionToken.toString());
        }
        zzl((zzabb) zzb2.zzq());
    }

    public final void zzf(C8971l lVar, long j10, long j11) {
        int size = lVar.q() ? ((FindAutocompletePredictionsResponse) lVar.m()).getAutocompletePredictions().size() : 0;
        zzzc zza2 = zzzd.zza();
        zza2.zza(size);
        zzzp zza3 = zzzu.zza();
        zza3.zzf(6);
        zza3.zzb((zzzd) zza2.zzq());
        zza3.zze(zzi(lVar));
        zza3.zzd((int) (j11 - j10));
        zzk((zzzu) zza3.zzq());
    }

    public final void zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, C8971l lVar, long j10, long j11) {
        boolean q10 = lVar.q();
        zzabn zza2 = zzabp.zza();
        zzacg zza3 = zzach.zza();
        zza3.zza(zzgm.zzb(findCurrentPlaceRequest.getPlaceFields()));
        zza2.zzb((zzach) zza3.zzq());
        zza2.zza((int) (j11 - j10));
        int i10 = 1;
        if (true == q10) {
            i10 = 2;
        }
        zza2.zzc(i10);
        zzaaw zzb2 = zzhn.zzb(this.zza);
        zzb2.zzl(6);
        zzb2.zzd((zzabp) zza2.zzq());
        zzb2.zza(this.zzc.zza());
        zzl((zzabb) zzb2.zzq());
    }

    public final void zzh(C8971l lVar, long j10, long j11) {
        int size = lVar.q() ? ((FindCurrentPlaceResponse) lVar.m()).getPlaceLikelihoods().size() : 0;
        zzyv zza2 = zzyw.zza();
        zza2.zza(size);
        zzzp zza3 = zzzu.zza();
        zza3.zzf(4);
        zza3.zza((zzyw) zza2.zzq());
        zza3.zze(zzi(lVar));
        zza3.zzd((int) (j11 - j10));
        zzk((zzzu) zza3.zzq());
    }
}
