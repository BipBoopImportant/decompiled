package mb;

import jb.l;

/* renamed from: mb.b  reason: case insensitive filesystem */
final class C10031b {
    static long a(double d10) {
        l.e(b(d10), "not a normal value");
        int exponent = Math.getExponent(d10);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d10) {
        return Math.getExponent(d10) <= 1023;
    }

    static boolean c(double d10) {
        return Math.getExponent(d10) >= -1022;
    }

    static double d(double d10) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d10) & 4503599627370495L) | 4607182418800017408L);
    }
}
