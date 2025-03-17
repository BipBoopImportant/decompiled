package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;

final class zzafk extends zzafm {
    final /* synthetic */ zzaft zza;
    private int zzb = 0;
    private final int zzc;

    zzafk(zzaft zzaft) {
        this.zza = zzaft;
        this.zzc = zzaft.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
