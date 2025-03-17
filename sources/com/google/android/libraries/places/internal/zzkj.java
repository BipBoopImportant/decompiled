package com.google.android.libraries.places.internal;

import java.util.Arrays;

public final class zzkj {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzki zzc;

    public final zzkj zza(Object obj, Object obj2) {
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i12);
        }
        zzjw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i13 = this.zzb;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.zzb = i13 + 1;
        return this;
    }

    public final zzkk zzb() {
        zzki zzki = this.zzc;
        if (zzki == null) {
            zzla zzf = zzla.zzf(this.zzb, this.zza, this);
            zzki zzki2 = this.zzc;
            if (zzki2 == null) {
                return zzf;
            }
            throw zzki2.zza();
        }
        throw zzki.zza();
    }
}
