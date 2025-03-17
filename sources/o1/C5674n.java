package o1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001e\u0010\u000e\u001a\u00020\t*\u00020\u00038FX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "width", "height", "Lo1/m;", "a", "(FF)J", "Lo1/i;", "c", "(J)Lo1/i;", "Lo1/g;", "b", "(J)J", "getCenter-uvyYCjk$annotations", "(J)V", "center", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o1.n  reason: case insensitive filesystem */
public final class C5674n {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return C5673m.d((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final long b(long j10) {
        if (j10 == 9205357640488583168L) {
            C5664d.a("Size is unspecified");
        }
        return C5668h.a(Float.intBitsToFloat((int) (j10 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j10 & 4294967295L)) / 2.0f);
    }

    public static final C5669i c(long j10) {
        return C5670j.c(C5667g.f26701b.c(), j10);
    }
}
