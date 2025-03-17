package com.optimizely.ab.config.audience.match;

import FE.C12869a;

public class NumberComparator {
    public static int compare(Object obj, Object obj2) {
        if (C12869a.a(obj) && C12869a.a(obj2)) {
            return compareUnsafe(obj, obj2);
        }
        throw new UnknownValueTypeException();
    }

    static int compareUnsafe(Object obj, Object obj2) {
        return Double.compare(((Number) obj).doubleValue(), ((Number) obj2).doubleValue());
    }
}
