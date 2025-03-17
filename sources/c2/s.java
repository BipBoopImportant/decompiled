package c2;

import kotlin.Metadata;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\t\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\"\u001e\u0010\u000e\u001a\u00020\n*\u00020\u00038FX\u0004¢\u0006\f\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"", "width", "height", "Lc2/r;", "a", "(II)J", "Lo1/m;", "d", "(J)J", "c", "Lc2/n;", "b", "getCenter-ozmzZPI$annotations", "(J)V", "center", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    public static final long a(int i10, int i11) {
        return r.c((((long) i11) & 4294967295L) | (((long) i10) << 32));
    }

    public static final long b(long j10) {
        return n.c((((j10 << 32) >> 33) & 4294967295L) | ((j10 >> 33) << 32));
    }

    public static final long c(long j10) {
        int round = Math.round(C5673m.l(j10));
        return r.c((((long) Math.round(C5673m.i(j10))) & 4294967295L) | (((long) round) << 32));
    }

    public static final long d(long j10) {
        return C5674n.a((float) r.h(j10), (float) r.g(j10));
    }
}
