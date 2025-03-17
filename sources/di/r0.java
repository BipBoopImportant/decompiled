package DI;

import GJ.C15765h;
import GJ.C15768k;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;
import uJ.y0;

public final class r0 {
    public static final C15553Y d(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        return e(u10, e10 instanceof C15562i ? (C15562i) e10 : null, 0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [DI.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final DI.C15553Y e(uJ.C18096U r5, DI.C15562i r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005a
            boolean r1 = wJ.C18230l.m(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.List r1 = r6.t()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.n()
            if (r2 != 0) goto L_0x003d
            java.util.List r2 = r5.L0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0027
            boolean r1 = gJ.C17278i.E(r6)
        L_0x0027:
            DI.Y r1 = new DI.Y
            java.util.List r2 = r5.L0()
            java.util.List r5 = r5.L0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003d:
            java.util.List r2 = r5.L0()
            java.util.List r7 = r2.subList(r7, r1)
            DI.Y r2 = new DI.Y
            DI.m r3 = r6.b()
            boolean r4 = r3 instanceof DI.C15562i
            if (r4 == 0) goto L_0x0052
            r0 = r3
            DI.i r0 = (DI.C15562i) r0
        L_0x0052:
            DI.Y r5 = e(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: DI.r0.e(uJ.U, DI.i, int):DI.Y");
    }

    private static final C15556c f(n0 n0Var, C15566m mVar, int i10) {
        return new C15556c(n0Var, mVar, i10);
    }

    public static final List<n0> g(C15562i iVar) {
        List<n0> list;
        C15566m mVar;
        y0 k10;
        C17542s.j(iVar, "<this>");
        List<n0> t10 = iVar.t();
        C17542s.i(t10, "getDeclaredTypeParameters(...)");
        if (!iVar.n() && !(iVar.b() instanceof C15554a)) {
            return t10;
        }
        List<R> a02 = C15768k.a0(C15768k.M(C15768k.H(C15768k.Y(C17506e.u(iVar), o0.f133845a), p0.f133846a), q0.f133847a));
        Iterator<C15566m> it = C17506e.u(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = it.next();
            if (mVar instanceof C15558e) {
                break;
            }
        }
        C15558e eVar = (C15558e) mVar;
        if (!(eVar == null || (k10 = eVar.k()) == null)) {
            list = k10.getParameters();
        }
        if (list == null) {
            list = C16877v.n();
        }
        if (!a02.isEmpty() || !list.isEmpty()) {
            Iterable<n0> V02 = C16877v.V0(a02, list);
            ArrayList arrayList = new ArrayList(C16877v.y(V02, 10));
            for (n0 n0Var : V02) {
                C17542s.g(n0Var);
                arrayList.add(f(n0Var, iVar, t10.size()));
            }
            return C16877v.V0(t10, arrayList);
        }
        List<n0> t11 = iVar.t();
        C17542s.i(t11, "getDeclaredTypeParameters(...)");
        return t11;
    }

    /* access modifiers changed from: private */
    public static final boolean h(C15566m mVar) {
        C17542s.j(mVar, "it");
        return mVar instanceof C15554a;
    }

    /* access modifiers changed from: private */
    public static final boolean i(C15566m mVar) {
        C17542s.j(mVar, "it");
        return !(mVar instanceof C15565l);
    }

    /* access modifiers changed from: private */
    public static final C15765h j(C15566m mVar) {
        C17542s.j(mVar, "it");
        List<n0> typeParameters = ((C15554a) mVar).getTypeParameters();
        C17542s.i(typeParameters, "getTypeParameters(...)");
        return C16877v.h0(typeParameters);
    }
}
