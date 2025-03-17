package defpackage;

import U0.C4877g1;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00018\n@\nX\u0002"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "content", "b", "(LnI/q;LU0/m;I)V", "orientation", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: h  reason: default package */
public final class h {
    public static final void b(q<? super Integer, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(qVar, "content");
        C4889m k10 = mVar.k(1977230274);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1977230274, i11, -1, "OrientationObserver (OrientationViewModel.kt:9)");
            }
            Configuration configuration = (Configuration) k10.Q(AndroidCompositionLocals_androidKt.f());
            k10.W(-796440161);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = C4877g1.a(configuration.orientation);
                k10.u(D10);
            }
            C4894o0 o0Var = (C4894o0) D10;
            k10.P();
            d(o0Var, configuration.orientation);
            qVar.invoke(Integer.valueOf(c(o0Var)), k10, Integer.valueOf((i11 << 3) & 112));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new g(qVar, i10));
        }
    }

    private static final int c(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void d(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(q qVar, int i10, C4889m mVar, int i11) {
        b(qVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
