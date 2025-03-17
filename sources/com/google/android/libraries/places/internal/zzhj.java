package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

final class zzhj extends LinkedHashMap {
    zzhj(int i10, float f10, boolean z10) {
        super(16, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
