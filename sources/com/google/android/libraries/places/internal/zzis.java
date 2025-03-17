package com.google.android.libraries.places.internal;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import l3.a;
import uI.C18055d;

public final class zzis implements i0.c {
    private final zzih zza;
    private final zzix zzb;
    private final zziy zzc;

    public zzis(zzih zzih, zzix zzix, zziy zziy) {
        this.zza = zzih;
        this.zzb = zzix;
        this.zzc = zziy;
    }

    public /* bridge */ /* synthetic */ f0 create(C18055d dVar, a aVar) {
        return super.create(dVar, aVar);
    }

    public final f0 create(Class cls) {
        zzjp.zze(cls == zziu.class, "This factory can only be used to instantiate its enclosing class.");
        return new zziu(this.zza, this.zzb, this.zzc, (zzit) null);
    }

    public final f0 create(Class cls, a aVar) {
        return create(cls);
    }
}
