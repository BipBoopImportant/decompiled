package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

final class zzne extends AbstractSet {
    final int zza = -1;
    final /* synthetic */ zznf zzb;

    zzne(zznf zznf, int i10) {
        this.zzb = zznf;
    }

    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb, zzb(), zza(), obj, this.zza == -1 ? zznf.zza : zznh.zza) >= 0;
    }

    public final Iterator iterator() {
        return new zznd(this);
    }

    public final int size() {
        return zza() - zzb();
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzb.zzc[this.zza + 1];
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        if (this.zza == -1) {
            return 0;
        }
        return this.zzb.zzc[0];
    }
}
