package G1;

import D1.a;
import E1.C4468a;
import E1.C4483p;
import c2.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LG1/P;", "LE1/a;", "alignmentLine", "", "b", "(LG1/P;LE1/a;)I", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class D {
    /* access modifiers changed from: private */
    public static final int b(P p10, C4468a aVar) {
        P m12 = p10.m1();
        if (!(m12 != null)) {
            a.b("Child of " + p10 + " cannot be null when calculating alignment line");
        }
        if (p10.r1().w().containsKey(aVar)) {
            Integer num = p10.r1().w().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int n02 = m12.n0(aVar);
        if (n02 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        m12.Y1(true);
        p10.X1(true);
        p10.U1();
        m12.Y1(false);
        p10.X1(false);
        return n02 + (aVar instanceof C4483p ? n.i(m12.v1()) : n.h(m12.v1()));
    }
}
