package com.google.android.libraries.places.internal;

final class zzjc extends zzjb {
    zzjc(char c10) {
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = 46;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return "CharMatcher.is('" + copyValueOf + "')";
    }
}
