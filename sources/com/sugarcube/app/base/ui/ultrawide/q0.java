package com.sugarcube.app.base.ui.ultrawide;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "([F)[F", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {
    public static final float[] a(float[] fArr) {
        C17542s.j(fArr, "<this>");
        float[] fArr2 = new float[3];
        float f10 = fArr[0];
        if (f10 != Float.NaN) {
            float f11 = fArr[1];
            if (f11 != Float.NaN) {
                float f12 = fArr[2];
                if (f12 != Float.NaN) {
                    float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11) + (f12 * f12)));
                    float f13 = 1.0f;
                    if (sqrt != 0.0f) {
                        f13 = 1.0f / sqrt;
                    }
                    fArr2[0] = (-fArr[0]) * f13;
                    fArr2[1] = (-fArr[1]) * f13;
                    fArr2[2] = (-fArr[2]) * f13;
                    return fArr2;
                }
            }
        }
        fArr2[0] = Float.NaN;
        fArr2[1] = Float.NaN;
        fArr2[2] = Float.NaN;
        return fArr2;
    }
}
