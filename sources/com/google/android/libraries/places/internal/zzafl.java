package com.google.android.libraries.places.internal;

import java.util.Comparator;

final class zzafl implements Comparator {
    zzafl() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaft zzaft = (zzaft) obj;
        zzaft zzaft2 = (zzaft) obj2;
        zzafk zzafk = new zzafk(zzaft);
        zzafk zzafk2 = new zzafk(zzaft2);
        while (zzafk.hasNext() && zzafk2.hasNext()) {
            int compareTo = Integer.valueOf(zzafk.zza() & 255).compareTo(Integer.valueOf(zzafk2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzaft.zzd()).compareTo(Integer.valueOf(zzaft2.zzd()));
    }
}
