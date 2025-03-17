package Dv;

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
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import p1.i1;
import s0.C5844O;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroidx/compose/ui/d;LU0/m;II)V", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void b(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-2098769362);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            dVar3 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-2098769362, i12, -1, "com.ingka.ikea.membership.impl.compose.common.settings.SectionSpacer (SectionSpacer.kt:20)");
            }
            androidx.compose.ui.d k11 = D.k(dVar3, 0.0f, h.B((float) 24), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, k11);
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
            C5844O.a(b.d(J.i(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), h.B((float) 12)), C18030v.f147664a.a(k10, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
