package com.google.android.libraries.places.internal;

import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.ArrayList;
import java.util.List;

public abstract class zzia implements Parcelable {
    public static zzhz zzn(AutocompleteActivityMode autocompleteActivityMode, List list, zzhy zzhy) {
        zzhq zzhq = new zzhq();
        zzhq.zza(new ArrayList());
        zzhq.zzl(new ArrayList());
        zzhq.zzf(autocompleteActivityMode);
        zzhq.zzh(list);
        zzhq.zzg(zzhy);
        zzhq.zzi(0);
        zzhq.zzj(0);
        return zzhq;
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract LocationBias zzc();

    public abstract LocationRestriction zzd();

    @Deprecated
    public abstract TypeFilter zze();

    public abstract zzhy zzf();

    public abstract zzhz zzg();

    public abstract AutocompleteActivityMode zzh();

    public abstract zzkh zzi();

    public abstract zzkh zzj();

    public abstract zzkh zzk();

    public abstract String zzl();

    public abstract String zzm();
}
