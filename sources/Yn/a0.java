package Yn;

import E1.I;
import G1.C4504g;
import J1.j;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import r0.m;
import rv.C11849b;
import s0.C5862h;
import to.C11968u0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYn/b0;", "uiState", "Lkotlin/Function0;", "LXH/N;", "onGooglePayClick", "onContinueCheckout", "b", "(LYn/b0;LnI/a;LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a0 {
    public static final void b(b0 b0Var, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar3;
        int i12;
        C4889m mVar2;
        b0 b0Var2 = b0Var;
        C17631a<C16807N> aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        int i13 = i10;
        C17542s.j(b0Var2, "uiState");
        C17542s.j(aVar4, "onGooglePayClick");
        C17542s.j(aVar5, "onContinueCheckout");
        C4889m k10 = mVar.k(2113234873);
        if ((i13 & 6) == 0) {
            i11 = ((i13 & 8) == 0 ? k10.V(b0Var2) : k10.F(b0Var2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        int i14 = i11;
        if ((i14 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2113234873, i14, -1, "com.ingka.ikea.checkout.impl.compose.GooglePayExpressContent (GooglePayExpressContent.kt:32)");
            }
            d.a aVar6 = d.f18749a;
            float f10 = (float) 16;
            d k11 = D.k(e.i(J.h(aVar6, 0.0f, 1, (Object) null)), 0.0f, h.B(f10), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar7.a();
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
            F1.c(a13, a10, aVar7.c());
            F1.c(a13, s10, aVar7.e());
            p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar7.d());
            C5862h hVar = C5862h.f28810a;
            C11968u0.c(true, b0Var.a(), aVar, J.h(C5116k1.a(aVar6, "GooglePayExpressTestTags_GOOGLE_PAY_BUTTON"), 0.0f, 1, (Object) null), k10, ((i14 << 3) & 896) | 3078, 0);
            mVar2 = k10;
            i12 = i10;
            aVar3 = aVar5;
            L.b(j.b(C11849b.f102330o2, k10, 0), D.m(J.h(C5116k1.a(aVar6, "GooglePayExpressTestTags_CONTINUE_BUTTON"), 0.0f, 1, (Object) null), 0.0f, h.B(f10), 0.0f, 0.0f, 13, (Object) null), false, N.Emphasised, (M) null, false, (Integer) null, (K0) null, (m) null, aVar2, mVar2, ((i14 << 21) & 1879048192) | 3120, 500);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            i12 = i13;
            aVar3 = aVar5;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Z(b0Var2, aVar4, aVar3, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(b0 b0Var, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        b(b0Var, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
