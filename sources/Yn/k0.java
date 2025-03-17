package Yn;

import B0.C4373q;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import IC.C13026h;
import J1.j;
import KJ.C15988d;
import N1.G;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.s;
import rv.C11849b;
import s0.C5862h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onChangePostalCodeClicked", "onKeepPostalCodeClicked", "b", "(LnI/a;LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k0 {
    public static final void b(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(aVar3, "onChangePostalCodeClicked");
        C17542s.j(aVar4, "onKeepPostalCodeClicked");
        C4889m k10 = mVar.k(1603011013);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1603011013, i13, -1, "com.ingka.ikea.checkout.impl.compose.PostalCodeInfoScreen (PostalCodeInfoScreen.kt:31)");
            }
            d.a aVar5 = d.f18749a;
            d f10 = m.f(e.i(aVar5), m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar6.a();
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
            F1.c(a13, a10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            float f11 = (float) 16;
            C4889m mVar3 = k10;
            C13607l.j(j.b(C11849b.f102253W2, k10, 0), C13679b.C2857b.a.f116683a, D.m(aVar5, 0.0f, h.B(f11), 0.0f, h.B((float) 8), 5, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            Bl.c.c(C13026h.a(C11849b.f102249V2), (d) null, (G) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, (C13679b) null, mVar3, C13023e.f110931a, 0, 262142);
            C4889m mVar4 = k10;
            L.b(j.b(b.f84667i1, k10, 0), D.m(J.h(aVar5, 0.0f, 1, (Object) null), 0.0f, h.B((float) 24), 0.0f, h.B(f11), 5, (Object) null), false, N.Secondary, (M) null, false, (Integer) null, (K0) null, (r0.m) null, aVar, mVar4, ((i13 << 27) & 1879048192) | 3120, 500);
            d m10 = D.m(J.h(aVar5, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, h.B(f11), 7, (Object) null);
            C4889m mVar5 = mVar4;
            mVar2 = mVar5;
            L.b(j.b(C11849b.f102257X2, mVar5, 0), m10, false, (N) null, (M) null, false, (Integer) null, (K0) null, (r0.m) null, aVar2, mVar5, ((i13 << 24) & 1879048192) | 48, 508);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new j0(aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        b(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
