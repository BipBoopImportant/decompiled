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
import Y1.t;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "designer", "LXH/N;", "b", "(Ljava/lang/String;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final void b(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17542s.j(str2, "designer");
        C4889m k10 = mVar.k(196082847);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(196082847, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.ProductDesignerInfo (ProductDesignerInfo.kt:17)");
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
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
            String b11 = j.b(b.f84635f2, k10, 0);
            t.a aVar3 = t.f14827a;
            int b12 = aVar3.b();
            C18030v vVar = C18030v.f147664a;
            int i12 = C18030v.f147665b;
            C4889m mVar3 = k10;
            C13607l.j(b11, C13679b.C2857b.c.f116685a, (d) null, vVar.a(k10, i12).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, b12, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 3072, 253940);
            C4889m mVar4 = mVar3;
            mVar2 = mVar4;
            String str3 = str;
            C13607l.j(str3, C13679b.a.C2856b.f116680a, (d) null, vVar.a(mVar4, i12).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, aVar3.b(), false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, (i11 & 14) | 48, 3072, 253940);
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
            n10.a(new d(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, int i10, C4889m mVar, int i11) {
        b(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
