package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zznd implements Iterator {
    final /* synthetic */ zzne zza;
    private int zzb = 0;

    zznd(zzne zzne) {
        this.zza = zzne;
    }

    public final boolean hasNext() {
        int i10 = this.zzb;
        zzne zzne = this.zza;
        return i10 < zzne.zza() - zzne.zzb();
    }

    public final Object next() {
        int i10 = this.zzb;
        zzne zzne = this.zza;
        if (i10 < zzne.zza() - zzne.zzb()) {
            zzne zzne2 = this.zza;
            Object obj = zzne2.zzb.zzb[zzne2.zzb() + i10];
            this.zzb = i10 + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
