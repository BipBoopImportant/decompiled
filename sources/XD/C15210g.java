package xD;

import A0.g;
import E1.I;
import G1.C4504g;
import J1.e;
import J1.j;
import N1.P;
import O0.V;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13575d;
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
import Y1.f;
import Y1.k;
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
import nI.C17642l;
import nI.p;
import s0.C5844O;
import s0.C5862h;
import t1.C5942c;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroidx/compose/ui/d;LU0/m;II)V", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xD.g  reason: case insensitive filesystem */
public final class C15210g {
    public static final void b(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        d dVar3;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1312105702);
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
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1312105702, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.common.ExpiredContent (ExpiredContent.kt:34)");
            }
            d f10 = J.f(C5116k1.a(aVar, "WalletTestTags-Expired"), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.b(), C5437c.f24302a.g(), k10, 54);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
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
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            String b11 = j.b(b.f84679j2, k10, 0);
            C5942c c10 = e.c(C18146a.f148718xd, k10, 0);
            d.a aVar3 = d.f18749a;
            V.a(c10, b11, D.i(androidx.compose.foundation.b.c(J.t(aVar3, h.B((float) 40)), C13575d.a(k10, 0).e0(), g.h()), h.B((float) 8)), 0, k10, 0, 8);
            C5844O.a(J.i(aVar3, h.B((float) 12)), k10, 6);
            dVar3 = aVar;
            mVar2 = k10;
            C13607l.j(b11, C13679b.C2857b.c.f116685a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(Y1.j.f14783b.a()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 261116);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C15209f(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
