package org.maplibre.android.utils;

public class c {
    public static int a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int b(boolean z10, boolean z11) {
        if (z10 == z11) {
            return 0;
        }
        return z10 ? 1 : -1;
    }
}
