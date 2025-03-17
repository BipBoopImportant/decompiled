package vK;

import N1.C4669d;
import N1.S;
import N1.T;
import N1.Y;
import S1.C4820m;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.t;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.h;
import c2.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;
import pI.C17752b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u0019\u001a\u00020\u0015\"\n\b\u0000\u0010\u0014*\u0004\u0018\u00010\u0013*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u001d\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"LN1/Y;", "textStyle", "", "e", "(LN1/Y;LU0/m;I)F", "", "measuredHeight", "fontHeightPx", "d", "(IF)I", "", "value", "style", "Lkotlin/Function1;", "Lc2/h;", "LXH/N;", "content", "b", "(Ljava/lang/String;LN1/Y;LnI/q;LU0/m;I)V", "", "T", "Landroidx/compose/ui/d;", "nullable", "Lkotlin/Function2;", "block", "g", "(Landroidx/compose/ui/d;Ljava/lang/Object;LnI/r;LU0/m;I)Landroidx/compose/ui/d;", "", "boolean", "h", "(Landroidx/compose/ui/d;ZLnI/q;LU0/m;I)Landroidx/compose/ui/d;", "f", "(LU0/m;I)Z", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vK.e  reason: case insensitive filesystem */
public final class C18205e {
    public static final void b(String str, Y y10, q<? super h, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        q<? super h, ? super C4889m, ? super Integer, C16807N> qVar2;
        Y y11;
        int i12;
        C4889m mVar2;
        String str2 = str;
        Y y12 = y10;
        q<? super h, ? super C4889m, ? super Integer, C16807N> qVar3 = qVar;
        int i13 = i10;
        C17542s.j(str2, "value");
        C17542s.j(y12, "style");
        C17542s.j(qVar3, "content");
        C4889m k10 = mVar.k(-536667796);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.V(y12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(qVar3) ? 256 : 128;
        }
        int i14 = i11;
        if ((i14 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-536667796, i14, -1, "net.ikea.skapa.ui.MeasureUnconstrainedViewWidth (Util.kt:32)");
            }
            mVar2 = k10;
            i12 = i13;
            y11 = y12;
            qVar2 = qVar;
            qVar2.invoke(h.m(((d) mVar2.Q(C5100f0.e())).H(r.h(S.d(T.a(0, k10, 0, 1), new C4669d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null), y10, t.f14827a.c(), false, 1, (List) null, 0, (c2.t) null, (d) null, (C4820m.b) null, false, 2024, (Object) null).B()))), mVar2, Integer.valueOf((i14 >> 3) & 112));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            i12 = i13;
            y11 = y12;
            qVar2 = qVar3;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C18204d(str2, y11, qVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, Y y10, q qVar, int i10, C4889m mVar, int i11) {
        b(str, y10, qVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final int d(int i10, float f10) {
        return C17752b.e(((((float) i10) + f10) / ((float) 2)) - ((float) 3));
    }

    public static final float e(Y y10, C4889m mVar, int i10) {
        C17542s.j(y10, "textStyle");
        mVar.W(-450423155);
        if (C4895p.J()) {
            C4895p.S(-450423155, i10, -1, "net.ikea.skapa.ui.calculateTextStyleHeightInPx (Util.kt:20)");
        }
        float O02 = ((d) mVar.Q(C5100f0.e())).O0(y10.l());
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return O02;
    }

    public static final boolean f(C4889m mVar, int i10) {
        mVar.W(-1957281945);
        if (C4895p.J()) {
            C4895p.S(-1957281945, i10, -1, "net.ikea.skapa.ui.isRtl (Util.kt:96)");
        }
        boolean z10 = mVar.Q(C5100f0.k()) == c2.t.Rtl;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }

    public static final <T> androidx.compose.ui.d g(androidx.compose.ui.d dVar, T t10, nI.r<? super androidx.compose.ui.d, ? super T, ? super C4889m, ? super Integer, ? extends androidx.compose.ui.d> rVar, C4889m mVar, int i10) {
        androidx.compose.ui.d dVar2;
        C17542s.j(dVar, "<this>");
        C17542s.j(rVar, "block");
        mVar.W(519055186);
        if (C4895p.J()) {
            C4895p.S(519055186, i10, -1, "net.ikea.skapa.ui.thenCheckNull (Util.kt:76)");
        }
        if (t10 == null) {
            dVar2 = null;
        } else {
            dVar2 = dVar.s((androidx.compose.ui.d) rVar.l(androidx.compose.ui.d.f18749a, t10, mVar, Integer.valueOf((i10 & 896) | (((i10 >> 3) & 8) << 3) | 6 | (i10 & 112))));
        }
        if (dVar2 != null) {
            dVar = dVar2;
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return dVar;
    }

    public static final androidx.compose.ui.d h(androidx.compose.ui.d dVar, boolean z10, q<? super androidx.compose.ui.d, ? super C4889m, ? super Integer, ? extends androidx.compose.ui.d> qVar, C4889m mVar, int i10) {
        C17542s.j(dVar, "<this>");
        C17542s.j(qVar, "block");
        mVar.W(1322927308);
        if (C4895p.J()) {
            C4895p.S(1322927308, i10, -1, "net.ikea.skapa.ui.thenCheckTrue (Util.kt:87)");
        }
        if (z10) {
            dVar = dVar.s((androidx.compose.ui.d) qVar.invoke(androidx.compose.ui.d.f18749a, mVar, Integer.valueOf(((i10 >> 3) & 112) | 6)));
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return dVar;
    }
}
