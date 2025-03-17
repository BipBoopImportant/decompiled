package com.google.android.libraries.places.internal;

final class zzhe extends zzhh {
    private String zza;
    private int zzb;
    private byte zzc;
    private int zzd;

    zzhe() {
    }

    /* access modifiers changed from: package-private */
    public final zzhh zza(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        throw new NullPointerException("Null packageName");
    }

    /* access modifiers changed from: package-private */
    public final zzhh zzb(int i10) {
        this.zzb = i10;
        this.zzc = 1;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final zzhi zzc() {
        String str;
        int i10;
        if (this.zzc == 1 && (str = this.zza) != null && (i10 = this.zzd) != 0) {
            return new zzhg(str, this.zzb, i10, (zzhf) null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" packageName");
        }
        if (this.zzc == 0) {
            sb2.append(" versionCode");
        }
        if (this.zzd == 0) {
            sb2.append(" requestSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final zzhh zzd(int i10) {
        this.zzd = i10;
        return this;
    }
}
