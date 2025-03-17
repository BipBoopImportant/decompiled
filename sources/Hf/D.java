package Hf;

import A0.g;
import E1.I;
import G1.C4504g;
import J1.j;
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
import Y1.f;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import s0.C5843N;
import s0.C5880z;
import tK.C18030v;
import wf.C10366b;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LXH/N;", "b", "(LU0/m;I)V", "browse-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D {
    public static final void b(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(962929133);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(962929133, i11, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.DataEthicsDisclaimer (DataEthicsDisclaimer.kt:28)");
            }
            d.a aVar = d.f18749a;
            float f10 = (float) 24;
            d a10 = x.a(androidx.compose.foundation.layout.D.i(aVar, h.B(f10)), C5880z.Min);
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
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
            C5077h.a(b.d(e.a(J.d(J.y(aVar, h.B((float) 4)), 0.0f, 1, (Object) null), g.e(h.B((float) 8))), C18030v.f147664a.a(k10, C18030v.f147665b).m0(), (i1) null, 2, (Object) null), k10, 0);
            mVar2 = k10;
            C13607l.j(j.b(C10366b.f77655p, k10, 0), C13679b.a.C2856b.f116680a, androidx.compose.foundation.layout.D.m(aVar, h.B(f10), 0.0f, 0.0f, 0.0f, 14, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262136);
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
            n11.a(new C(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C4889m mVar, int i11) {
        b(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
