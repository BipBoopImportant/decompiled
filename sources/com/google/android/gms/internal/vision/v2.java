package com.google.android.gms.internal.vision;

final class v2 {
    /* access modifiers changed from: private */
    public static void f(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (o(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || o(b12) || o(b13)) {
            throw Z0.f();
        }
        byte b14 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((b14 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((b14 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    public static void g(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (o(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || o(b12)))) {
            throw Z0.f();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    /* access modifiers changed from: private */
    public static void h(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 < -62 || o(b11)) {
            throw Z0.f();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    /* access modifiers changed from: private */
    public static void i(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    /* access modifiers changed from: private */
    public static boolean l(byte b10) {
        return b10 >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean m(byte b10) {
        return b10 < -32;
    }

    /* access modifiers changed from: private */
    public static boolean n(byte b10) {
        return b10 < -16;
    }

    private static boolean o(byte b10) {
        return b10 > -65;
    }
}
