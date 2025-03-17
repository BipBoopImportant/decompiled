package Zn;

import E1.I;
import G1.C4504g;
import J1.j;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import p1.i1;
import r0.m;
import rv.C11849b;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J {
    public static final void b(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(aVar2, "onClick");
        C4889m k10 = mVar.k(-2046369906);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2046369906, i11, -1, "com.ingka.ikea.checkout.impl.confirmation.compose.ContactUsFooter (ContactUsFooter.kt:28)");
            }
            d.a aVar3 = d.f18749a;
            d d10 = b.d(androidx.compose.foundation.layout.J.i(androidx.compose.foundation.layout.J.h(aVar3, 0.0f, 1, (Object) null), h.B((float) 96)), C18030v.f147664a.a(k10, C18030v.f147665b).x0(), (i1) null, 2, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar4.d());
            C5079j jVar = C5079j.f18125a;
            L.b(j.b(C11849b.f102240T1, k10, 0), D.k(androidx.compose.foundation.layout.J.h(aVar3, 0.0f, 1, (Object) null), h.B((float) 16), 0.0f, 2, (Object) null), false, N.SecondaryInverseStatic, (M) null, false, Integer.valueOf(C18146a.f147999C9), (K0) null, (m) null, aVar, k10, ((i11 << 27) & 1879048192) | 3120, 436);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new I(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, int i10, C4889m mVar, int i11) {
        b(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
