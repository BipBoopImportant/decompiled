package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

public final class zziz implements zziy {
    private final zzhi zza;
    private final zzhm zzb;

    public zziz(zzhm zzhm, zzhi zzhi) {
        this.zzb = zzhm;
        this.zza = zzhi;
    }

    public final void zza(zzix zzix) {
        zzaan zza2 = zzaaq.zza();
        zza2.zzg(zzix.zzz());
        zza2.zzd(zzix.zzx());
        zza2.zze(zzix.zzy());
        zza2.zzj(zzix.zzd());
        zza2.zzc(zzix.zzb());
        zza2.zzb(zzix.zza());
        zza2.zzk(zzix.zze());
        zza2.zzh(zzix.zzk().length());
        zza2.zzl(zzix.zzg());
        zza2.zzf(zzix.zzc());
        zza2.zzi(zzix.zzA());
        zza2.zza(zzix.zzf());
        if (zzix.zzi() == zzhy.FRAGMENT) {
            zza2.zzn(2);
        } else if (zzix.zzi() == zzhy.INTENT) {
            zza2.zzn(3);
        } else {
            zza2.zzn(1);
        }
        if (zzix.zzj() == AutocompleteActivityMode.FULLSCREEN) {
            zza2.zzm(2);
        } else if (zzix.zzj() == AutocompleteActivityMode.OVERLAY) {
            zza2.zzm(1);
        }
        zzaaw zzb2 = zzhn.zzb(this.zza);
        zzb2.zzl(10);
        zzb2.zzc((zzaaq) zza2.zzq());
        this.zzb.zza(zzhn.zza((zzabb) zzb2.zzq()));
    }
}
