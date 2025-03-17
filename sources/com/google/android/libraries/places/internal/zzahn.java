package com.google.android.libraries.places.internal;

final class zzahn implements zzahu {
    private final zzahu[] zza;

    zzahn(zzahu... zzahuArr) {
        this.zza = zzahuArr;
    }

    public final zzaht zzb(Class cls) {
        zzahu[] zzahuArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzahu zzahu = zzahuArr[i10];
            if (zzahu.zzc(cls)) {
                return zzahu.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean zzc(Class cls) {
        zzahu[] zzahuArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzahuArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
