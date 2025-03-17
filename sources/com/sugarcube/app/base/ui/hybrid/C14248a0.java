package com.sugarcube.app.base.ui.hybrid;

import java.io.BufferedWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000f\u001a\u00020\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"", "angles", "LXH/N;", "b", "([F[F)V", "dest", "d", "([F[F)[F", "c", "([F)[F", "Ljava/io/BufferedWriter;", "Ljava/lang/StringBuffer;", "sb", "", "buffer", "e", "(Ljava/io/BufferedWriter;Ljava/lang/StringBuffer;[C)V", "a", "[F", "()[F", "rotationTransform", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.hybrid.a0  reason: case insensitive filesystem */
public final class C14248a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f125013a = c(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});

    public static final float[] a() {
        return f125013a;
    }

    public static final void b(float[] fArr, float[] fArr2) {
        double d10;
        double d11;
        double d12;
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        C17542s.j(fArr3, "<this>");
        C17542s.j(fArr4, "angles");
        float f10 = fArr3[0];
        float f11 = fArr3[4];
        double sqrt = Math.sqrt(((double) (f10 * f10)) + (((double) f11) * ((double) f11)));
        if (sqrt < 1.0E-6d) {
            d11 = Math.atan2((double) (-fArr3[6]), (double) fArr3[5]);
            d12 = -Math.atan2((double) (-fArr3[8]), sqrt);
            d10 = 0.0d;
        } else {
            double atan2 = Math.atan2((double) fArr3[9], (double) fArr3[10]);
            d12 = -Math.atan2((double) (-fArr3[8]), sqrt);
            d11 = atan2;
            d10 = -Math.atan2((double) fArr3[4], (double) fArr3[0]);
        }
        if (d11 > 3.141592653589793d) {
            d11 -= 6.283185307179586d;
        }
        if (d11 < -3.141592653589793d) {
            d11 += 6.283185307179586d;
        }
        if (d12 > 3.141592653589793d) {
            d12 -= 6.283185307179586d;
        }
        if (d12 < -3.141592653589793d) {
            d12 += 6.283185307179586d;
        }
        if (d10 > 3.141592653589793d) {
            d10 -= 6.283185307179586d;
        }
        if (d10 < -3.141592653589793d) {
            d10 += 6.283185307179586d;
        }
        fArr4[0] = -((float) Math.toDegrees(d11));
        fArr4[1] = (float) Math.toDegrees(d12);
        fArr4[2] = (float) Math.toDegrees(d10);
    }

    public static final float[] c(float[] fArr) {
        C17542s.j(fArr, "<this>");
        float f10 = fArr[1];
        fArr[1] = fArr[4];
        fArr[4] = f10;
        float f11 = fArr[2];
        fArr[2] = fArr[8];
        fArr[8] = f11;
        float f12 = fArr[3];
        fArr[3] = fArr[12];
        fArr[12] = f12;
        float f13 = fArr[6];
        fArr[6] = fArr[9];
        fArr[9] = f13;
        float f14 = fArr[7];
        fArr[7] = fArr[13];
        fArr[13] = f14;
        float f15 = fArr[11];
        fArr[11] = fArr[14];
        fArr[14] = f15;
        return fArr;
    }

    public static final float[] d(float[] fArr, float[] fArr2) {
        C17542s.j(fArr, "<this>");
        C17542s.j(fArr2, "dest");
        fArr2[0] = fArr[0];
        fArr2[5] = fArr[5];
        fArr2[10] = fArr[10];
        fArr2[15] = fArr[15];
        fArr2[1] = fArr[4];
        fArr2[4] = fArr[1];
        fArr2[2] = fArr[8];
        fArr2[8] = fArr[2];
        fArr2[3] = fArr[12];
        fArr2[12] = fArr[3];
        fArr2[6] = fArr[9];
        fArr2[9] = fArr[6];
        fArr2[7] = fArr[13];
        fArr2[13] = fArr[7];
        fArr2[11] = fArr[14];
        fArr2[14] = fArr[11];
        return fArr2;
    }

    public static final void e(BufferedWriter bufferedWriter, StringBuffer stringBuffer, char[] cArr) {
        C17542s.j(bufferedWriter, "<this>");
        C17542s.j(stringBuffer, "sb");
        C17542s.j(cArr, "buffer");
        int i10 = 0;
        while (i10 < stringBuffer.length()) {
            int min = Math.min(cArr.length + i10, stringBuffer.length());
            stringBuffer.getChars(i10, min, cArr, 0);
            bufferedWriter.write(cArr, 0, min - i10);
            i10 = min;
        }
    }
}
