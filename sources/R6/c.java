package R6;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "d", "(J)I", "", "a", "(D)I", "c", "(J)D", "b", "(D)J", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class c {
    public static final int a(double d10) {
        int i10 = (int) d10;
        if (((double) i10) == d10) {
            return i10;
        }
        throw new IllegalStateException((d10 + " cannot be converted to Int").toString());
    }

    public static final long b(double d10) {
        long j10 = (long) d10;
        if (((double) j10) == d10) {
            return j10;
        }
        throw new IllegalStateException((d10 + " cannot be converted to Long").toString());
    }

    public static final double c(long j10) {
        double d10 = (double) j10;
        if (((long) d10) == j10) {
            return d10;
        }
        throw new IllegalStateException((j10 + " cannot be converted to Double").toString());
    }

    public static final int d(long j10) {
        int i10 = (int) j10;
        if (((long) i10) == j10) {
            return i10;
        }
        throw new IllegalStateException((j10 + " cannot be converted to Int").toString());
    }
}
