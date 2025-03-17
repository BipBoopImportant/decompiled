package E1;

import G1.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"LG1/Q;", "a", "(LG1/Q;)LG1/Q;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class G {
    public static final Q a(Q q10) {
        G1.G P12 = q10.P1();
        while (true) {
            G1.G q02 = P12.q0();
            G1.G g10 = null;
            if ((q02 != null ? q02.d0() : null) != null) {
                G1.G q03 = P12.q0();
                if (q03 != null) {
                    g10 = q03.d0();
                }
                C17542s.g(g10);
                if (g10.O0()) {
                    P12 = P12.q0();
                    C17542s.g(P12);
                } else {
                    G1.G q04 = P12.q0();
                    C17542s.g(q04);
                    P12 = q04.d0();
                    C17542s.g(P12);
                }
            } else {
                Q E22 = P12.o0().E2();
                C17542s.g(E22);
                return E22;
            }
        }
    }
}
