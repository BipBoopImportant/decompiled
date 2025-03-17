package Ed;

import E1.I;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import p1.C5747v0;
import p1.i1;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Li1/c$b;", "horizontalAlignment", "Lkotlin/Function0;", "LXH/N;", "content", "b", "(Landroidx/compose/foundation/layout/d$m;Li1/c$b;LnI/p;LU0/m;I)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k {
    public static final void b(C5073d.m mVar, C5437c.b bVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar2, int i10) {
        int i11;
        C17542s.j(mVar, "verticalArrangement");
        C17542s.j(bVar, "horizontalAlignment");
        C17542s.j(pVar, "content");
        C4889m k10 = mVar2.k(-1723856264);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(mVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(bVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(pVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1723856264, i11, -1, "com.ikea.kompassmap.ui.components.bottomSheet.OverlayUI (OverlayUI.kt:16)");
            }
            d d10 = b.d(J.f(d.f18749a, 0.0f, 1, (Object) null), C5747v0.f27350b.h(), (i1) null, 2, (Object) null);
            int i12 = i11 << 3;
            I a10 = C5080k.a(mVar, bVar, k10, (((i12 & 896) | ((i12 & 112) | 6)) >> 3) & 126);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            pVar.invoke(k10, Integer.valueOf((i11 >> 6) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(mVar, bVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C5073d.m mVar, C5437c.b bVar, p pVar, int i10, C4889m mVar2, int i11) {
        b(mVar, bVar, pVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
