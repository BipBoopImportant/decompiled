package com.sugarcube.app.base.ui.hybrid;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "b", "(F)F", "", "a", "([F)[F", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.hybrid.j0  reason: case insensitive filesystem */
public final class C14266j0 {
    public static final float[] a(float[] fArr) {
        C17542s.j(fArr, "<this>");
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11) + (f12 * f12)));
        float f13 = 1.0f;
        if (sqrt != 0.0f) {
            f13 = 1.0f / sqrt;
        }
        return new float[]{(-fArr[0]) * f13, (-fArr[1]) * f13, (-fArr[2]) * f13};
    }

    public static final float b(float f10) {
        return (float) Math.toDegrees((double) f10);
    }
}
