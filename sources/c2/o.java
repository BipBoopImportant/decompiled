package c2;

import kotlin.Metadata;
import o1.C5667g;
import o1.C5668h;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "x", "y", "Lc2/n;", "a", "(II)J", "Lo1/g;", "offset", "c", "(JJ)J", "b", "d", "(J)J", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {
    public static final long a(int i10, int i11) {
        return n.c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10, long j11) {
        return C5668h.a(C5667g.m(j10) - ((float) n.h(j11)), C5667g.n(j10) - ((float) n.i(j11)));
    }

    public static final long c(long j10, long j11) {
        return C5668h.a(C5667g.m(j10) + ((float) n.h(j11)), C5667g.n(j10) + ((float) n.i(j11)));
    }

    public static final long d(long j10) {
        int round = Math.round(C5667g.m(j10));
        return n.c((((long) Math.round(C5667g.n(j10))) & 4294967295L) | (((long) round) << 32));
    }
}
