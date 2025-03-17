package E1;

import kotlin.Metadata;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\b*\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"", "scaleX", "scaleY", "LE1/h0;", "a", "(FF)J", "c", "(F)F", "Lo1/m;", "scaleFactor", "d", "(JJ)J", "size", "e", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i0 {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return h0.a((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    /* access modifiers changed from: private */
    public static final float c(float f10) {
        float f11 = (float) 10;
        float f12 = f10 * f11;
        int i10 = (int) f12;
        if (f12 - ((float) i10) >= 0.5f) {
            i10++;
        }
        return ((float) i10) / f11;
    }

    public static final long d(long j10, long j11) {
        return C5674n.a(C5673m.l(j10) * h0.c(j11), C5673m.i(j10) * h0.d(j11));
    }

    public static final long e(long j10, long j11) {
        return d(j11, j10);
    }
}
