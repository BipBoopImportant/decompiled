package XH;

import HJ.C15835a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "v1", "v2", "a", "(II)I", "", "b", "(JJ)I", "value", "", "c", "(J)D", "base", "", "d", "(JI)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: XH.P  reason: case insensitive filesystem */
public final class C16809P {
    public static final int a(int i10, int i11) {
        return C17542s.l(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j10, long j11) {
        return C17542s.m(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double c(long j10) {
        return (((double) (j10 >>> 11)) * ((double) RecyclerView.n.FLAG_MOVED)) + ((double) (j10 & 2047));
    }

    public static final String d(long j10, int i10) {
        if (j10 >= 0) {
            String l10 = Long.toString(j10, C15835a.a(i10));
            C17542s.i(l10, "toString(...)");
            return l10;
        }
        long j11 = (long) i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l11 = Long.toString(j12, C15835a.a(i10));
        C17542s.i(l11, "toString(...)");
        sb2.append(l11);
        String l12 = Long.toString(j13, C15835a.a(i10));
        C17542s.i(l12, "toString(...)");
        sb2.append(l12);
        return sb2.toString();
    }
}
