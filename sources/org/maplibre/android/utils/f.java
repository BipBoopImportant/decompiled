package org.maplibre.android.utils;

public class f {
    public static double a(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static double c(double d10, double d11, double d12, double d13, double d14) {
        return (((d10 - d11) / (d12 - d11)) * (d14 - d13)) + d13;
    }
}
