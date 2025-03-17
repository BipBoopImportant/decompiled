package com.google.android.libraries.places.internal;

import java.io.Serializable;

public final class zzkt extends zzku implements Serializable {
    public static final /* synthetic */ int zzc = 0;
    private static final zzkt zzd = new zzkt(zzka.zzb, zzjy.zzb);
    final zzkc zza;
    final zzkc zzb;

    private zzkt(zzkc zzkc, zzkc zzkc2) {
        this.zza = zzkc;
        this.zzb = zzkc2;
        if (zzkc.compareTo(zzkc2) > 0 || zzkc == zzjy.zzb || zzkc2 == zzka.zzb) {
            throw new IllegalArgumentException("Invalid range: ".concat(zze(zzkc, zzkc2)));
        }
    }

    public static zzkt zza(Comparable comparable) {
        return new zzkt(new zzkb(comparable), zzjy.zzb);
    }

    public static zzkt zzb(Comparable comparable, Comparable comparable2) {
        return new zzkt(new zzkb(comparable), new zzjz(comparable2));
    }

    public static zzkt zzc(Comparable comparable, Comparable comparable2) {
        return new zzkt(new zzkb(comparable), new zzkb(comparable2));
    }

    private static String zze(zzkc zzkc, zzkc zzkc2) {
        StringBuilder sb2 = new StringBuilder(16);
        zzkc.zzc(sb2);
        sb2.append("..");
        zzkc2.zzd(sb2);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkt) {
            zzkt zzkt = (zzkt) obj;
            return this.zza.equals(zzkt.zza) && this.zzb.equals(zzkt.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return zze(this.zza, this.zzb);
    }

    public final boolean zzd(Comparable comparable) {
        comparable.getClass();
        return this.zza.zze(comparable) && !this.zzb.zze(comparable);
    }
}
