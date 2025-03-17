package com.google.android.libraries.places.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import java.util.List;
import xa.C8971l;

public final class zziu extends f0 {
    private final zzih zza;
    private final zzix zzb;
    private final zziy zzc;
    private final Handler zzd = new Handler(Looper.getMainLooper());
    private Runnable zze;
    private final K zzf = new K();

    /* synthetic */ zziu(zzih zzih, zzix zzix, zziy zziy, zzit zzit) {
        this.zza = zzih;
        this.zzb = zzix;
        this.zzc = zziy;
    }

    private static Status zzn(Exception exc) {
        return exc instanceof b ? ((b) exc).a() : new Status(13, exc.getMessage());
    }

    private final void zzo(zzic zzic) {
        if (!zzic.equals(this.zzf.getValue())) {
            this.zzf.setValue(zzic);
        }
    }

    private static boolean zzp(Status status) {
        return status.t0() || status.F() == 9012 || status.F() == 9011;
    }

    /* access modifiers changed from: protected */
    public final void onCleared() {
        try {
            this.zza.zzc();
            this.zzd.removeCallbacks(this.zze);
            this.zzb.zzo();
            this.zzc.zza(this.zzb);
        } catch (Error | RuntimeException e10) {
            zzhk.zzb(e10);
            throw e10;
        }
    }

    public final F zza() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(String str, C8971l lVar) {
        if (!lVar.o()) {
            Exception l10 = lVar.l();
            if (l10 == null) {
                this.zzb.zzp();
                List<AutocompletePrediction> autocompletePredictions = ((FindAutocompletePredictionsResponse) lVar.m()).getAutocompletePredictions();
                if (autocompletePredictions.isEmpty()) {
                    zzo(zzic.zzh(str));
                } else {
                    zzo(zzic.zzj(autocompletePredictions));
                }
            } else {
                this.zzb.zzr();
                Status zzn = zzn(l10);
                if (zzp(zzn)) {
                    zzo(zzic.zzq(zzn));
                } else {
                    zzo(zzic.zzi(str, zzn));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(AutocompletePrediction autocompletePrediction, C8971l lVar) {
        if (!lVar.o()) {
            Exception l10 = lVar.l();
            if (l10 == null) {
                this.zzb.zzq();
                zzo(zzic.zzn(((FetchPlaceResponse) lVar.m()).getPlace()));
                return;
            }
            this.zzb.zzs();
            Status zzn = zzn(l10);
            if (zzp(zzn)) {
                zzo(zzic.zzq(zzn));
            } else {
                zzo(zzic.zzm(autocompletePrediction, zzn));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str) {
        this.zza.zzb(str).c(new zziq(this, str));
    }

    public final void zze(Bundle bundle) {
        if (bundle == null) {
            this.zzf.setValue(zzic.zzo());
        }
    }

    public final void zzf(AutocompletePrediction autocompletePrediction, int i10) {
        this.zzb.zzu(i10);
        C8971l zza2 = this.zza.zza(autocompletePrediction);
        if (!zza2.p()) {
            zzo(zzic.zzg());
        }
        zza2.c(new zzip(this, autocompletePrediction));
    }

    public final void zzg() {
        this.zzb.zzv();
    }

    public final void zzh() {
        this.zzb.zzl();
    }

    public final void zzi() {
        this.zzb.zzm();
    }

    public final void zzj() {
        this.zzb.zzn();
        zzo(zzic.zzl());
    }

    public final void zzk() {
        this.zzb.zzw();
        zzm("");
    }

    public final void zzl(String str) {
        this.zza.zzc();
        zzm(str);
        zzo(zzic.zzp());
    }

    public final void zzm(String str) {
        this.zzb.zzt(str);
        this.zzd.removeCallbacks(this.zze);
        if (str.isEmpty()) {
            this.zza.zzc();
            zzo(zzic.zzk());
            return;
        }
        zzir zzir = new zzir(this, str);
        this.zze = zzir;
        this.zzd.postDelayed(zzir, 100);
        zzo(zzic.zzg());
    }
}
