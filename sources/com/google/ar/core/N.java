package com.google.ar.core;

import java.util.LinkedHashMap;
import java.util.Map;

final class N extends LinkedHashMap {
    N() {
        super(1, 0.75f, true);
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 10;
    }
}
