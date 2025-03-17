package G1;

import E1.H;
import E1.r;
import XH.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LE1/r;", "scope", "", "LE1/H;", "a", "(LE1/r;)Ljava/util/List;", "LG1/G;", "", "b", "(LG1/G;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class U {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6403a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                G1.G$e[] r0 = G1.G.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                G1.G$e r1 = G1.G.e.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                G1.G$e r1 = G1.G.e.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                G1.G$e r1 = G1.G.e.Measuring     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                G1.G$e r1 = G1.G.e.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                G1.G$e r1 = G1.G.e.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f6403a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G1.U.a.<clinit>():void");
        }
    }

    public static final List<List<H>> a(r rVar) {
        C17542s.h(rVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        G P12 = ((T) rVar).P1();
        boolean b10 = b(P12);
        List<G> P10 = P12.P();
        ArrayList arrayList = new ArrayList(P10.size());
        int size = P10.size();
        for (int i10 = 0; i10 < size; i10++) {
            G g10 = P10.get(i10);
            arrayList.add(b10 ? g10.I() : g10.J());
        }
        return arrayList;
    }

    private static final boolean b(G g10) {
        int i10 = a.f6403a[g10.Z().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        if (i10 == 5) {
            G q02 = g10.q0();
            if (q02 != null) {
                return b(q02);
            }
            throw new IllegalArgumentException("no parent for idle node");
        }
        throw new t();
    }
}
