package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

final class zzkx extends zzkl {
    private final transient zzkk zza;
    /* access modifiers changed from: private */
    public final transient Object[] zzb;
    /* access modifiers changed from: private */
    public final transient int zzc;

    zzkx(zzkk zzkk, Object[] objArr, int i10, int i11) {
        this.zza = zzkk;
        this.zzb = objArr;
        this.zzc = i11;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.zza.get(key));
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    public final int size() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i10) {
        return zzd().zza(objArr, 0);
    }

    public final zzle zze() {
        return zzd().listIterator(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final zzkh zzh() {
        return new zzkw(this);
    }
}
