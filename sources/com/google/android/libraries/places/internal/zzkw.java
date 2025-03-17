package com.google.android.libraries.places.internal;

import java.util.AbstractMap;

final class zzkw extends zzkh {
    final /* synthetic */ zzkx zza;

    zzkw(zzkx zzkx) {
        this.zza = zzkx;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzjp.zza(i10, this.zza.zzc, "index");
        zzkx zzkx = this.zza;
        int i11 = i10 + i10;
        Object obj = zzkx.zzb[i11];
        obj.getClass();
        Object obj2 = zzkx.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }

    public final boolean zzf() {
        return true;
    }
}
