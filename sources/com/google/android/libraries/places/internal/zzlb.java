package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

public final class zzlb {
    static int zza(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }
}
