package Aj;

import E1.I;
import G1.C4504g;
import J1.j;
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
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5844O;
import s0.C5862h;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onRetry", "b", "(LnI/a;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final void b(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(aVar2, "onRetry");
        C4889m k10 = mVar.k(-455116832);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-455116832, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.ProductDetailsGenericError (ProductDetailsGenericError.kt:32)");
            }
            d.a aVar3 = d.f18749a;
            d f10 = J.f(e.i(aVar3), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.b(), C5437c.f24302a.g(), k10, 54);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            d a14 = C5116k1.a(aVar3, "ProductDetailsGenericError.TestTag.GenericError.Title");
            String b11 = j.b(b.f84334B6, k10, 0);
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C4889m mVar3 = k10;
            C13607l.j(b11, C13679b.C2857b.a.f116683a, a14, vVar.a(k10, i13).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262128);
            C13607l.j(j.b(Ez.f.f109688a0, k10, 0), C13679b.a.C2856b.f116680a, C5116k1.a(aVar3, "ProductDetailsGenericError.TestTag.GenericError.Description"), vVar.a(k10, i13).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262128);
            C5844O.a(J.t(aVar3, C18029u.f147649a.d()), k10, 0);
            mVar2 = k10;
            L.b(j.b(b.f84498S0, k10, 0), C5116k1.a(aVar3, "ProductDetailsGenericError.TestTag.GenericError.Button"), false, N.Tertiary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 27) & 1879048192) | 3120, 500);
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
            n10.a(new f(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, int i10, C4889m mVar, int i11) {
        b(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
