package o1;

import e2.C5295b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\"\u001e\u0010\u0010\u001a\u00020\u000b*\u00020\u00038FX\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\"\u001e\u0010\u0013\u001a\u00020\u000b*\u00020\u00038FX\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\r\"\u001e\u0010\u0016\u001a\u00020\u000b*\u00020\u00038FX\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"", "x", "y", "Lo1/g;", "a", "(FF)J", "start", "stop", "fraction", "e", "(JJF)J", "", "b", "(J)Z", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite", "c", "isSpecified-k-4lQ0M$annotations", "isSpecified", "d", "isUnspecified-k-4lQ0M$annotations", "isUnspecified", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o1.h  reason: case insensitive filesystem */
public final class C5668h {
    public static final long a(float f10, float f11) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f10);
        return C5667g.e((((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (floatToRawIntBits << 32));
    }

    public static final boolean b(long j10) {
        long j11 = (j10 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j11) & (j11 - 4294967297L)) & -9223372034707292160L) == 0;
    }

    public static final boolean c(long j10) {
        return (j10 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean d(long j10) {
        return (j10 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static final long e(long j10, long j11, float f10) {
        return C5667g.e((((long) Float.floatToRawIntBits(C5295b.b(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 >> 32)), f10))) << 32) | (((long) Float.floatToRawIntBits(C5295b.b(Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f10))) & 4294967295L));
    }
}
