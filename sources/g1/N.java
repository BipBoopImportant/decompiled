package G1;

import G1.G;
import G1.S;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"LG1/N;", "", "LG1/G;", "root", "LG1/o;", "relayoutNodes", "", "LG1/S$a;", "postponedMeasureRequests", "<init>", "(LG1/G;LG1/o;Ljava/util/List;)V", "node", "", "c", "(LG1/G;)Z", "b", "", "f", "(LG1/G;)Ljava/lang/String;", "d", "()Ljava/lang/String;", "LXH/N;", "a", "()V", "LG1/G;", "LG1/o;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final G f6360a;

    /* renamed from: b  reason: collision with root package name */
    private final C4512o f6361b;

    /* renamed from: c  reason: collision with root package name */
    private final List<S.a> f6362c;

    public N(G g10, C4512o oVar, List<S.a> list) {
        this.f6360a = g10;
        this.f6361b = oVar;
        this.f6362c = list;
    }

    private final boolean b(G g10) {
        S.a aVar;
        G q02 = g10.q0();
        S.a aVar2 = null;
        G.e Z10 = q02 != null ? q02.Z() : null;
        if (g10.p() || !(g10.r0() == Integer.MAX_VALUE || q02 == null || !q02.p())) {
            if (g10.g0()) {
                List<S.a> list = this.f6362c;
                int size = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        aVar = null;
                        break;
                    }
                    aVar = list.get(i10);
                    S.a aVar3 = aVar;
                    if (C17542s.e(aVar3.a(), g10) && !aVar3.c()) {
                        break;
                    }
                    i10++;
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (g10.g0()) {
                return this.f6361b.d(g10) || g10.Z() == G.e.LookaheadMeasuring || (q02 != null && q02.g0()) || ((q02 != null && q02.b0()) || Z10 == G.e.Measuring);
            }
            if (g10.Y()) {
                return this.f6361b.d(g10) || q02 == null || q02.g0() || q02.Y() || Z10 == G.e.Measuring || Z10 == G.e.LayingOut;
            }
        }
        if (C17542s.e(g10.N0(), Boolean.TRUE)) {
            if (g10.b0()) {
                List<S.a> list2 = this.f6362c;
                int size2 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    S.a aVar4 = list2.get(i11);
                    S.a aVar5 = aVar4;
                    if (C17542s.e(aVar5.a(), g10) && aVar5.c()) {
                        aVar2 = aVar4;
                        break;
                    }
                    i11++;
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (g10.b0()) {
                return this.f6361b.e(g10, true) || (q02 != null && q02.b0()) || Z10 == G.e.LookaheadMeasuring || (q02 != null && q02.g0() && C17542s.e(g10.d0(), g10));
            }
            if (g10.a0()) {
                return this.f6361b.e(g10, true) || q02 == null || q02.b0() || q02.a0() || Z10 == G.e.LookaheadMeasuring || Z10 == G.e.LookaheadLayingOut || (q02.Y() && C17542s.e(g10.d0(), g10));
            }
        }
        return true;
    }

    private final boolean c(G g10) {
        if (!b(g10)) {
            return false;
        }
        List<G> K10 = g10.K();
        int size = K10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!c(K10.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        C17542s.i(sb2, "append(value)");
        sb2.append(10);
        C17542s.i(sb2, "append('\\n')");
        e(this, sb2, this.f6360a, 0);
        return sb2.toString();
    }

    private static final void e(N n10, StringBuilder sb2, G g10, int i10) {
        String f10 = n10.f(g10);
        if (f10.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(f10);
            C17542s.i(sb2, "append(value)");
            sb2.append(10);
            C17542s.i(sb2, "append('\\n')");
            i10++;
        }
        List<G> K10 = g10.K();
        int size = K10.size();
        for (int i12 = 0; i12 < size; i12++) {
            e(n10, sb2, K10.get(i12), i10);
        }
    }

    private final String f(G g10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(g10.Z());
        sb3.append(']');
        sb2.append(sb3.toString());
        if (!g10.p()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + g10.i0() + ']');
        if (!b(g10)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void a() {
        if (!c(this.f6360a)) {
            System.out.println(d());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
