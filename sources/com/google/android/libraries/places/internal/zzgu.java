package com.google.android.libraries.places.internal;

import android.content.Context;

final class zzgu implements zzgy {
    private Context zza;
    private zzhb zzb;
    private zzhi zzc;

    private zzgu() {
    }

    public final /* synthetic */ zzgy zza(zzhb zzhb) {
        this.zzb = zzhb;
        return this;
    }

    public final /* synthetic */ zzgy zzb(zzhi zzhi) {
        this.zzc = zzhi;
        return this;
    }

    public final /* synthetic */ zzgy zzc(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzgz zzd() {
        zzajt.zzb(this.zza, Context.class);
        zzajt.zzb(this.zzb, zzhb.class);
        zzajt.zzb(this.zzc, zzhi.class);
        return new zzgw(this.zza, this.zzb, this.zzc, (zzgv) null);
    }

    /* synthetic */ zzgu(zzgt zzgt) {
    }
}
