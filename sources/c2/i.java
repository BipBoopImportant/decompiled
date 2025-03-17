package c2;

import e2.C5295b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Lc2/h;", "start", "stop", "", "fraction", "c", "(FFF)F", "x", "y", "Lc2/j;", "a", "(FF)J", "width", "height", "Lc2/k;", "b", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return j.b((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return k.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final float c(float f10, float f11, float f12) {
        return h.B(C5295b.b(f10, f11, f12));
    }
}
