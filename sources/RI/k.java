package RI;

import DI.C15558e;
import DI.C15561h;
import HJ.C15854t;
import YH.C16877v;
import fJ.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nJ.C17656k;
import org.slf4j.Marker;
import uJ.C18087K;
import uJ.C18096U;
import uJ.C18111e0;
import uJ.C18113f0;
import uJ.D0;
import uJ.E0;
import uJ.u0;
import vJ.e;
import vJ.g;

public final class k extends C18087K implements C18111e0 {
    private k(C18113f0 f0Var, C18113f0 f0Var2, boolean z10) {
        super(f0Var, f0Var2);
        if (!z10) {
            e.f149048a.d(f0Var, f0Var2);
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence b1(String str) {
        C17542s.j(str, "it");
        return "(raw) " + str;
    }

    private static final boolean c1(String str, String str2) {
        return C17542s.e(str, C15854t.O0(str2, "out ")) || C17542s.e(str2, Marker.ANY_MARKER);
    }

    private static final List<String> d1(n nVar, C18096U u10) {
        Iterable<E0> L02 = u10.L0();
        ArrayList arrayList = new ArrayList(C16877v.y(L02, 10));
        for (E0 T10 : L02) {
            arrayList.add(nVar.T(T10));
        }
        return arrayList;
    }

    private static final String e1(String str, String str2) {
        if (!C15854t.c0(str, '<', false, 2, (Object) null)) {
            return str;
        }
        return C15854t.s1(str, '<', (String) null, 2, (Object) null) + '<' + str2 + '>' + C15854t.o1(str, '>', (String) null, 2, (Object) null);
    }

    public C18113f0 U0() {
        return V0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String X0(fJ.n r13, fJ.w r14) {
        /*
            r12 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            uJ.f0 r0 = r12.V0()
            java.lang.String r0 = r13.S(r0)
            uJ.f0 r1 = r12.W0()
            java.lang.String r1 = r13.S(r1)
            boolean r14 = r14.i()
            if (r14 == 0) goto L_0x003f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "raw ("
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = ".."
            r13.append(r14)
            r13.append(r1)
            r14 = 41
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            return r13
        L_0x003f:
            uJ.f0 r14 = r12.W0()
            java.util.List r14 = r14.L0()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0056
            AI.j r14 = zJ.C18755d.n(r12)
            java.lang.String r13 = r13.P(r0, r1, r14)
            return r13
        L_0x0056:
            uJ.f0 r14 = r12.V0()
            java.util.List r14 = d1(r13, r14)
            uJ.f0 r2 = r12.W0()
            java.util.List r2 = d1(r13, r2)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            RI.j r9 = RI.j.f138015a
            r10 = 30
            r11 = 0
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r14
            java.lang.String r3 = YH.C16877v.G0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r14 = YH.C16877v.D1(r14, r2)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            boolean r2 = r14 instanceof java.util.Collection
            if (r2 == 0) goto L_0x008e
            r2 = r14
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x008e
            goto L_0x00b1
        L_0x008e:
            java.util.Iterator r14 = r14.iterator()
        L_0x0092:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r14.next()
            XH.v r2 = (XH.v) r2
            java.lang.Object r4 = r2.c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.d()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = c1(r4, r2)
            if (r2 != 0) goto L_0x0092
            goto L_0x00b5
        L_0x00b1:
            java.lang.String r1 = e1(r1, r3)
        L_0x00b5:
            java.lang.String r14 = e1(r0, r3)
            boolean r0 = kotlin.jvm.internal.C17542s.e(r14, r1)
            if (r0 == 0) goto L_0x00c0
            return r14
        L_0x00c0:
            AI.j r0 = zJ.C18755d.n(r12)
            java.lang.String r13 = r13.P(r14, r1, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: RI.k.X0(fJ.n, fJ.w):java.lang.String");
    }

    /* renamed from: Z0 */
    public k R0(boolean z10) {
        return new k(V0().U0(z10), W0().U0(z10));
    }

    /* renamed from: a1 */
    public C18087K S0(g gVar) {
        C17542s.j(gVar, "kotlinTypeRefiner");
        C18096U h10 = gVar.h(V0());
        C17542s.h(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        C18096U h11 = gVar.h(W0());
        C17542s.h(h11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new k((C18113f0) h10, (C18113f0) h11, true);
    }

    /* renamed from: f1 */
    public k T0(u0 u0Var) {
        C17542s.j(u0Var, "newAttributes");
        return new k(V0().V0(u0Var), W0().V0(u0Var));
    }

    public C17656k q() {
        C15561h e10 = N0().e();
        C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
        if (eVar != null) {
            C17656k B10 = eVar.B(new i((D0) null, 1, (DefaultConstructorMarker) null));
            C17542s.i(B10, "getMemberScope(...)");
            return B10;
        }
        throw new IllegalStateException(("Incorrect classifier: " + N0().e()).toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(C18113f0 f0Var, C18113f0 f0Var2) {
        this(f0Var, f0Var2, false);
        C17542s.j(f0Var, "lowerBound");
        C17542s.j(f0Var2, "upperBound");
    }
}
