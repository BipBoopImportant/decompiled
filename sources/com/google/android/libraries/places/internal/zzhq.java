package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

final class zzhq extends zzhz {
    private AutocompleteActivityMode zza;
    private zzkh zzb;
    private zzhy zzc;
    private String zzd;
    private String zze;
    private LocationBias zzf;
    private LocationRestriction zzg;
    private zzkh zzh;
    private TypeFilter zzi;
    private zzkh zzj;
    private int zzk;
    private int zzl;
    private byte zzm;

    zzhq() {
    }

    public final zzhz zza(List list) {
        this.zzh = zzkh.zzj(list);
        return this;
    }

    public final zzhz zzb(String str) {
        this.zze = str;
        return this;
    }

    public final zzhz zzc(String str) {
        this.zzd = str;
        return this;
    }

    public final zzhz zzd(LocationBias locationBias) {
        this.zzf = locationBias;
        return this;
    }

    public final zzhz zze(LocationRestriction locationRestriction) {
        this.zzg = locationRestriction;
        return this;
    }

    public final zzhz zzf(AutocompleteActivityMode autocompleteActivityMode) {
        if (autocompleteActivityMode != null) {
            this.zza = autocompleteActivityMode;
            return this;
        }
        throw new NullPointerException("Null mode");
    }

    public final zzhz zzg(zzhy zzhy) {
        if (zzhy != null) {
            this.zzc = zzhy;
            return this;
        }
        throw new NullPointerException("Null origin");
    }

    public final zzhz zzh(List list) {
        this.zzb = zzkh.zzj(list);
        return this;
    }

    public final zzhz zzi(int i10) {
        this.zzk = i10;
        this.zzm = (byte) (this.zzm | 1);
        return this;
    }

    public final zzhz zzj(int i10) {
        this.zzl = i10;
        this.zzm = (byte) (this.zzm | 2);
        return this;
    }

    public final zzhz zzk(TypeFilter typeFilter) {
        this.zzi = typeFilter;
        return this;
    }

    public final zzhz zzl(List list) {
        this.zzj = zzkh.zzj(list);
        return this;
    }

    public final zzia zzm() {
        AutocompleteActivityMode autocompleteActivityMode;
        zzkh zzkh;
        zzhy zzhy;
        zzkh zzkh2;
        zzkh zzkh3;
        if (this.zzm == 3 && (autocompleteActivityMode = this.zza) != null && (zzkh = this.zzb) != null && (zzhy = this.zzc) != null && (zzkh2 = this.zzh) != null && (zzkh3 = this.zzj) != null) {
            return new zzht(autocompleteActivityMode, zzkh, zzhy, this.zzd, this.zze, this.zzf, this.zzg, zzkh2, this.zzi, zzkh3, this.zzk, this.zzl);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" mode");
        }
        if (this.zzb == null) {
            sb2.append(" placeFields");
        }
        if (this.zzc == null) {
            sb2.append(" origin");
        }
        if (this.zzh == null) {
            sb2.append(" countries");
        }
        if (this.zzj == null) {
            sb2.append(" typesFilter");
        }
        if ((this.zzm & 1) == 0) {
            sb2.append(" primaryColor");
        }
        if ((this.zzm & 2) == 0) {
            sb2.append(" primaryColorDark");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    /* synthetic */ zzhq(zzia zzia, zzhp zzhp) {
        this.zza = zzia.zzh();
        this.zzb = zzia.zzj();
        this.zzc = zzia.zzf();
        this.zzd = zzia.zzm();
        this.zze = zzia.zzl();
        this.zzf = zzia.zzc();
        this.zzg = zzia.zzd();
        this.zzh = zzia.zzi();
        this.zzi = zzia.zze();
        this.zzj = zzia.zzk();
        this.zzk = zzia.zza();
        this.zzl = zzia.zzb();
        this.zzm = 3;
    }
}
