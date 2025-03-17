package com.google.android.libraries.places.api.model;

final class zzi extends zzbm {
    private int zza;
    private int zzb;
    private int zzc;
    private byte zzd;

    zzi() {
    }

    /* access modifiers changed from: package-private */
    public final zzbm zza(int i10) {
        this.zzc = i10;
        this.zzd = (byte) (this.zzd | 4);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzbm zzb(int i10) {
        this.zzb = i10;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzbm zzc(int i10) {
        this.zza = i10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final LocalDate zzd() {
        if (this.zzd == 7) {
            return new zzao(this.zza, this.zzb, this.zzc);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb2.append(" year");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" month");
        }
        if ((this.zzd & 4) == 0) {
            sb2.append(" day");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
