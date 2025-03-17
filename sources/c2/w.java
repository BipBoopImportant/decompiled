package c2;

import e2.C5295b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001a\u001a\u00020\u0016*\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u001e\u0010\"\u001a\u00020\u0004*\u00020\u00008FX\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001c\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020#8FX\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010&\u001a\u0004\b$\u0010%\"\u001e\u0010\"\u001a\u00020\u0004*\u00020#8FX\u0004¢\u0006\f\u0012\u0004\b!\u0010&\u001a\u0004\b'\u0010%\"\u001e\u0010\u001f\u001a\u00020\u0004*\u00020(8FX\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010+\u001a\u0004\b)\u0010*\"\u001e\u0010\"\u001a\u00020\u0004*\u00020(8FX\u0004¢\u0006\f\u0012\u0004\b!\u0010+\u001a\u0004\b,\u0010*\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"", "value", "Lc2/x;", "type", "Lc2/v;", "a", "(FJ)J", "", "unitType", "v", "l", "(JF)J", "LXH/N;", "b", "(J)V", "c", "(JJ)V", "start", "stop", "fraction", "k", "(JJF)J", "", "j", "(J)Z", "isUnspecified--R2X_6o$annotations", "isUnspecified", "h", "(F)J", "getSp$annotations", "(F)V", "sp", "e", "getEm$annotations", "em", "", "g", "(D)J", "(D)V", "d", "", "i", "(I)J", "(I)V", "f", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class w {
    public static final long a(float f10, long j10) {
        return l(j10, f10);
    }

    public static final void b(long j10) {
        if (j(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j10, long j11) {
        if (j(j10) || j(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        } else if (!x.g(v.g(j10), v.g(j11))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + x.i(v.g(j10)) + " and " + x.i(v.g(j11))).toString());
        }
    }

    public static final long d(double d10) {
        return l(8589934592L, (float) d10);
    }

    public static final long e(float f10) {
        return l(8589934592L, f10);
    }

    public static final long f(int i10) {
        return l(8589934592L, (float) i10);
    }

    public static final long g(double d10) {
        return l(4294967296L, (float) d10);
    }

    public static final long h(float f10) {
        return l(4294967296L, f10);
    }

    public static final long i(int i10) {
        return l(4294967296L, (float) i10);
    }

    public static final boolean j(long j10) {
        return v.f(j10) == 0;
    }

    public static final long k(long j10, long j11, float f10) {
        c(j10, j11);
        return l(v.f(j10), C5295b.b(v.h(j10), v.h(j11), f10));
    }

    public static final long l(long j10, float f10) {
        return v.c(j10 | (((long) Float.floatToIntBits(f10)) & 4294967295L));
    }
}
