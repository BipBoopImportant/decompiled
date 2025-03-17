package com.google.android.libraries.places.internal;

import java.io.Serializable;

abstract class zzkc implements Comparable, Serializable {
    final Comparable zza;

    zzkc(Comparable comparable) {
        this.zza = comparable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkc) {
            try {
                if (compareTo((zzkc) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    /* renamed from: zza */
    public int compareTo(zzkc zzkc) {
        if (zzkc != zzka.zzb) {
            if (zzkc == zzjy.zzb) {
                return -1;
            }
            Comparable comparable = this.zza;
            Comparable comparable2 = zzkc.zza;
            int i10 = zzkt.zzc;
            int compareTo = comparable.compareTo(comparable2);
            if (compareTo != 0) {
                return compareTo;
            }
            boolean z10 = this instanceof zzjz;
            if (z10 == (zzkc instanceof zzjz)) {
                return 0;
            }
            if (!z10) {
                return -1;
            }
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzc(StringBuilder sb2);

    /* access modifiers changed from: package-private */
    public abstract void zzd(StringBuilder sb2);

    /* access modifiers changed from: package-private */
    public abstract boolean zze(Comparable comparable);
}
