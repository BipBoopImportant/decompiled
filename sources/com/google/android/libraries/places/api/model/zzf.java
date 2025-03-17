package com.google.android.libraries.places.api.model;

final class zzf extends zzbj {
    private int zza;
    private int zzb;
    private byte zzc;

    zzf() {
    }

    public final zzbj zza(int i10) {
        this.zzb = i10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    public final zzbj zzb(int i10) {
        this.zza = i10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    public final zzbk zzc() {
        if (this.zzc == 3) {
            return new zzak(this.zza, this.zzb);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" offset");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" length");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
