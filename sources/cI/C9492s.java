package ci;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import com.ingka.ikea.core.model.product.GuaranteeInfo;
import gs.C11352b;
import gs.e;
import gs.f;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import s0.C5843N;
import s0.C5880z;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/core/model/product/GuaranteeInfo;", "guaranteeInfo", "LXH/N;", "c", "(Lcom/ingka/ikea/core/model/product/GuaranteeInfo;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.s  reason: case insensitive filesystem */
public final class C9492s {
    public static final void c(GuaranteeInfo guaranteeInfo, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        GuaranteeInfo guaranteeInfo2 = guaranteeInfo;
        int i12 = i10;
        C17542s.j(guaranteeInfo2, "guaranteeInfo");
        C4889m k10 = mVar.k(145603236);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(guaranteeInfo2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(145603236, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.GuaranteeInfoComposable (GuaranteeInfoComposable.kt:32)");
            }
            d.a aVar = d.f18749a;
            C18029u uVar = C18029u.f147649a;
            d a10 = x.a(D.j(aVar, uVar.d(), uVar.j()), C5880z.Min);
            I b10 = G.b(C5073d.f18068a.n(uVar.a()), C5437c.f24302a.i(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, b10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            C13679b.a.C2856b bVar = C13679b.a.C2856b.f116680a;
            k10.W(835831536);
            float q10 = ((c2.d) k10.Q(C5100f0.e())).q(bVar.a(k10, 6).s());
            k10.P();
            d t10 = J.t(aVar, q10);
            k10.W(835837849);
            boolean F10 = k10.F(guaranteeInfo2);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new C9491q(guaranteeInfo2);
                k10.u(D10);
            }
            k10.P();
            e a14 = f.a((C17642l) D10, k10, 0);
            C5942c c10 = J1.e.c(C18146a.f148160N5, k10, 0);
            C5749w0.a aVar3 = C5749w0.f27365b;
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C11352b.b(a14, (String) null, t10, (C5942c) null, c10, (C5942c) null, (C5437c) null, (C4478k) null, 0.0f, C5749w0.a.b(aVar3, vVar.a(k10, i13).G0(), 0, 2, (Object) null), 0, k10, e.f97946h | 48, 0, 1512);
            C4889m mVar3 = k10;
            mVar2 = mVar3;
            C13607l.j(guaranteeInfo.b(), bVar, (d) null, vVar.a(mVar3, i13).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262132);
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
            n11.a(new r(guaranteeInfo2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(GuaranteeInfo guaranteeInfo, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(guaranteeInfo.a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(GuaranteeInfo guaranteeInfo, int i10, C4889m mVar, int i11) {
        c(guaranteeInfo, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
