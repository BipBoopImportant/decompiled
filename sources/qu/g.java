package Qu;

import E1.I;
import G1.C4504g;
import SC.H2;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import s0.C5844O;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroidx/compose/ui/d;LU0/m;II)V", "instorepurchasestatus-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final void b(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(410560353);
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
            dVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(410560353, i12, -1, "com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.compose.InStorePurchaseLoading (InStorePurchaseLoading.kt:23)");
            }
            d f10 = J.f(dVar3, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
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
            d.a aVar2 = d.f18749a;
            float f11 = (float) 48;
            C5844O.a(J.i(aVar2, h.B(f11)), k10, 6);
            float f12 = (float) 24;
            H2.b(J.i(D.m(aVar2, h.B(f12), 0.0f, h.B(f12), 0.0f, 10, (Object) null), h.B((float) 60)), false, k10, 6, 2);
            C5844O.a(J.i(aVar2, h.B(f12)), k10, 6);
            H2.b(J.i(D.m(C5074e.b(J.h(aVar2, 0.0f, 1, (Object) null), 1.25f, false, 2, (Object) null), h.B(f12), 0.0f, h.B(f12), 0.0f, 10, (Object) null), h.B((float) 100)), false, k10, 6, 2);
            C5844O.a(J.i(aVar2, h.B(f11)), k10, 6);
            H2.b(J.i(D.m(aVar2, h.B(f12), 0.0f, h.B(f12), 0.0f, 10, (Object) null), h.B((float) 120)), false, k10, 6, 2);
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
            n10.a(new f(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
