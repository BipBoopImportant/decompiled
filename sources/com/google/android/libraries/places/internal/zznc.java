package com.google.android.libraries.places.internal;

import java.util.Comparator;
import java.util.Map;

final class zznc implements Comparator {
    zznc() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
