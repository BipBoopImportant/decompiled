package e2;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001a%\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "start", "stop", "fraction", "b", "(FFF)F", "", "c", "(IIF)I", "x", "a", "(F)F", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e2.b  reason: case insensitive filesystem */
public final class C5295b {
    public static final float a(float f10) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f10)) & 8589934591L) / ((long) 3))) + 709952852);
        float f11 = intBitsToFloat - ((intBitsToFloat - (f10 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final float b(float f10, float f11, float f12) {
        return ((((float) 1) - f12) * f10) + (f12 * f11);
    }

    public static final int c(int i10, int i11, float f10) {
        return i10 + ((int) Math.round(((double) (i11 - i10)) * ((double) f10)));
    }
}
