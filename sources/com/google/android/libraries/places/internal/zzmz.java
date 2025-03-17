package com.google.android.libraries.places.internal;

import java.util.Comparator;

final class zzmz implements Comparator {
    zzmz() {
    }

    public final int compare(Object obj, Object obj2) {
        zzng zza = zzng.zza(obj);
        zzng zza2 = zzng.zza(obj2);
        if (zza != zza2) {
            return zza.compareTo(zza2);
        }
        int ordinal = zza.ordinal();
        if (ordinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (ordinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (ordinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (ordinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
