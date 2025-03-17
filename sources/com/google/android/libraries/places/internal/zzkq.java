package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.RandomAccess;

public final class zzkq {
    public static List zza(List list, zzdl zzdl) {
        return list instanceof RandomAccess ? new zzkn(list, zzdl) : new zzkp(list, zzdl);
    }
}
