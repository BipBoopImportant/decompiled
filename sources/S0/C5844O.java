package s0;

import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "a", "(Landroidx/compose/ui/d;LU0/m;I)V", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.O  reason: case insensitive filesystem */
public final class C5844O {
    public static final void a(d dVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        C5845P p10 = C5845P.f28727a;
        int a10 = C4883j.a(mVar, 0);
        d e10 = c.e(mVar, dVar);
        C4912y s10 = mVar.s();
        C4504g.a aVar = C4504g.f6515W;
        C17631a<C4504g> a11 = aVar.a();
        if (mVar.m() == null) {
            C4883j.c();
        }
        mVar.I();
        if (mVar.i()) {
            mVar.p(a11);
        } else {
            mVar.t();
        }
        C4889m a12 = F1.a(mVar);
        F1.c(a12, p10, aVar.c());
        F1.c(a12, s10, aVar.e());
        F1.c(a12, e10, aVar.d());
        p<C4504g, Integer, C16807N> b10 = aVar.b();
        if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
            a12.u(Integer.valueOf(a10));
            a12.w(Integer.valueOf(a10), b10);
        }
        mVar.x();
        if (C4895p.J()) {
            C4895p.R();
        }
    }
}
