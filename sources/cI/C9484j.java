package ci;

import E1.I;
import G1.C4504g;
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
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import com.ingka.ikea.core.model.product.CustomerBenefit;
import ei.C9676q;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5844O;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lei/q;", "model", "Lkotlin/Function0;", "LXH/N;", "onShowMoreButtonClicked", "b", "(Lei/q;LnI/a;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.j  reason: case insensitive filesystem */
public final class C9484j {
    public static final void b(C9676q qVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C9676q qVar2 = qVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(qVar2, "model");
        C17542s.j(aVar2, "onShowMoreButtonClicked");
        C4889m k10 = mVar.k(-1307512854);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(qVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1307512854, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.CustomerBenefitComposable (CustomerBenefitComposable.kt:28)");
            }
            d.a aVar3 = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar3);
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
            k10.W(-1096339657);
            for (CustomerBenefit a14 : qVar.a()) {
                C13607l.j(a14.a(), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262140);
                C5844O.a(J.i(d.f18749a, h.B((float) 24)), k10, 6);
            }
            k10.P();
            String b11 = qVar.b();
            k10.W(-1096331757);
            if (b11 != null) {
                C4889m mVar3 = k10;
                C13607l.j(J1.j.b(b.f84635f2, k10, 0), C13679b.C2857b.f.f116688a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262140);
                C13607l.j(b11, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262140);
                C5844O.a(J.i(d.f18749a, h.B((float) 24)), k10, 6);
            }
            k10.P();
            Integer c10 = qVar.c();
            k10.W(-1096319561);
            if (c10 == null) {
                mVar2 = k10;
            } else {
                mVar2 = k10;
                L.b(J1.j.b(c10.intValue(), k10, 0), (d) null, false, N.Secondary, M.XSmall, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 24) & 1879048192) | 27648, 486);
                C5844O.a(J.i(d.f18749a, h.B((float) 24)), mVar2, 6);
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
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C9483i(qVar, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C9676q qVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(qVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
