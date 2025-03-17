package com.google.android.libraries.places.internal;

final class zzafv extends zzafx {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = Integer.MAX_VALUE;

    /* synthetic */ zzafv(byte[] bArr, int i10, int i11, boolean z10, zzafu zzafu) {
        super((zzafw) null);
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 > 0) {
            this.zzd = i12;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i11;
    }
}
