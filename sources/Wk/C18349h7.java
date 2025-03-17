package wK;

import c2.w;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"LwK/h7;", "", "Lc2/v;", "fontSize", "<init>", "(Ljava/lang/String;IJ)V", "J", "b", "()J", "Small", "Medium", "Large", "Size50", "Size75", "Size100", "Size200", "Size300", "Size400", "Size500", "Size600", "Size700", "Size800", "Size900", "Size1000", "Size1100", "Size1200", "Size1300", "Size1400", "Size1500", "Size1600", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.h7  reason: case insensitive filesystem */
public enum C18349h7 {
    Small(r1.a()),
    Medium(r1.o()),
    Large(r1.s()),
    Size50(w.i(12)),
    Size75(w.i(14)),
    Size100(w.i(16)),
    Size200(w.i(18)),
    Size300(w.i(20)),
    Size400(w.i(22)),
    Size500(w.i(24)),
    Size600(w.i(28)),
    Size700(w.i(32)),
    Size800(w.i(36)),
    Size900(w.i(40)),
    Size1000(w.i(48)),
    Size1100(w.i(52)),
    Size1200(w.i(56)),
    Size1300(w.i(64)),
    Size1400(w.i(72)),
    Size1500(w.i(80)),
    Size1600(w.i(96));
    
    private final long fontSize;

    static {
        C18349h7[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C18349h7(long j10) {
        this.fontSize = j10;
    }

    public final long b() {
        return this.fontSize;
    }
}
