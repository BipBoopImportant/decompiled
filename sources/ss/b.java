package Ss;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import N1.P;
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
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import com.ingka.ikea.informationmessage.InformationMessageNavigation;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5583F;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.s;
import p1.C5749w0;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "content", "Lkotlin/Function0;", "LXH/N;", "onButtonClicked", "b", "(Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;LnI/a;LU0/m;I)V", "informationmessage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final void b(InformationMessageNavigation.Data.a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        d.a aVar3;
        float f10;
        InformationMessageNavigation.Data.a aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        int i12 = i10;
        C17542s.j(aVar4, "content");
        C17542s.j(aVar5, "onButtonClicked");
        C4889m k10 = mVar.k(-1508168309);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar5) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1508168309, i13, -1, "com.ingka.ikea.informationmessage.impl.compose.InformationBottomSheetContent (InformationBottomSheetContent.kt:33)");
            }
            float f11 = (float) 16;
            C5073d.f n10 = C5073d.f18068a.n(h.B(f11));
            d.a aVar6 = d.f18749a;
            d m10 = D.m(m.f(e.i(aVar6), m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null), 0.0f, h.B(f11), 0.0f, 0.0f, 13, (Object) null);
            C5437c.a aVar7 = C5437c.f24302a;
            I a10 = C5080k.a(n10, aVar7.k(), k10, 6);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, m10);
            C4504g.a aVar8 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar8.a();
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
            F1.c(a13, a10, aVar8.c());
            F1.c(a13, s10, aVar8.e());
            p<C4504g, Integer, C16807N> b10 = aVar8.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar8.d());
            C5862h hVar = C5862h.f28810a;
            InformationMessageNavigation.Data.a.c c10 = aVar.c();
            k10.W(569072805);
            if (c10 == null) {
                aVar3 = aVar6;
                f10 = f11;
            } else {
                aVar3 = aVar6;
                f10 = f11;
                C5583F.a(J1.e.c(c10.b(), k10, 0), c10.a(), J.h(aVar6, 0.0f, 1, (Object) null), aVar7.m(), C4478k.f5915a.e(), 0.0f, (C5749w0) null, k10, 28032, 96);
            }
            k10.P();
            d.a aVar9 = aVar3;
            C4889m mVar3 = k10;
            C13607l.j(aVar.d(), C13679b.C2857b.C2858b.f116684a, J.h(aVar9, 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            C13607l.j(aVar.a(), C13679b.a.C2856b.f116680a, J.h(aVar9, 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            InformationMessageNavigation.Data.a.C2131a b11 = aVar.b();
            k10.W(569093375);
            if (b11 == null) {
                mVar2 = k10;
            } else {
                mVar2 = k10;
                L.b(b11.b(), D.k(J.h(aVar9, 0.0f, 1, (Object) null), 0.0f, h.B(f10), 1, (Object) null), false, N.Primary, (M) null, false, b11.a(), (K0) null, (r0.m) null, aVar2, k10, ((i13 << 24) & 1879048192) | 3120, 436);
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new a(aVar4, aVar5, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(InformationMessageNavigation.Data.a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        b(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
