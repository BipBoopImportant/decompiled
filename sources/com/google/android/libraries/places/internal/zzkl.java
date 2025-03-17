package com.google.android.libraries.places.internal;

import java.util.Set;

public abstract class zzkl extends zzke implements Set {
    private transient zzkh zza;

    zzkl() {
    }

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzlb.zza(this);
    }

    public zzkh zzd() {
        zzkh zzkh = this.zza;
        if (zzkh != null) {
            return zzkh;
        }
        zzkh zzh = zzh();
        this.zza = zzh;
        return zzh;
    }

    /* renamed from: zze */
    public abstract zzle iterator();

    /* access modifiers changed from: package-private */
    public zzkh zzh() {
        Object[] array = toArray();
        int i10 = zzkh.zzd;
        return zzkh.zzi(array, array.length);
    }
}
