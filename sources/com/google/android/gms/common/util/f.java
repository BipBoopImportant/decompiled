package com.google.android.gms.common.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class f {
    @Deprecated
    public static <T> List<T> a(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    public static <T> List<T> b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.emptyList();
    }
}
