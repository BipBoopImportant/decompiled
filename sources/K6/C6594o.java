package K6;

import java.util.Arrays;

/* renamed from: K6.o  reason: case insensitive filesystem */
public final class C6594o {
    private static char a(char c10) {
        if (c10 == '\\') {
            return '.';
        }
        if (c10 == '.') {
            return '\\';
        }
        return c10;
    }

    static float b(float[] fArr, float f10) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(Math.abs(fArr[i10]));
        }
        Arrays.sort(fArr2);
        float floatValue = fArr2[(int) Math.floor((double) (((float) (length - 1)) * f10))].floatValue();
        for (int i11 = 0; i11 < length; i11++) {
            if (Math.abs(fArr[i11]) < floatValue) {
                fArr[i11] = 0.0f;
            }
        }
        return floatValue;
    }

    public static long c(long j10) {
        if (j10 == 0) {
            return 0;
        }
        long j11 = j10 | (j10 >>> 1);
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        return j15 - (j15 >>> 1);
    }

    static String d(float[] fArr, float f10, float f11) {
        int length = fArr.length;
        StringBuilder sb2 = new StringBuilder();
        float f12 = (f11 - f10) / 60.0f;
        for (int i10 = 0; i10 < length; i10++) {
            char floor = (char) (((int) Math.floor((double) ((fArr[i10] - f10) / f12))) + 65);
            if (fArr[i10] == f11) {
                floor = '}';
            }
            sb2.append(a(floor));
        }
        return sb2.toString();
    }
}
