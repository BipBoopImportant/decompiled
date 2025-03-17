package com.google.android.libraries.places.internal;

import java.util.Iterator;

final class zzky extends zzkl {
    private final transient zzkk zza;
    private final transient zzkh zzb;

    zzky(zzkk zzkk, zzkh zzkh) {
        this.zza = zzkk;
        this.zzb = zzkh;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    public final zzkh zzd() {
        return this.zzb;
    }

    public final zzle zze() {
        return this.zzb.listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }
}
