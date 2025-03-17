package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Comparator;

final class zzjx extends zzks implements Serializable {
    final Comparator zza;

    zzjx(Comparator comparator) {
        this.zza = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjx) {
            return this.zza.equals(((zzjx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
