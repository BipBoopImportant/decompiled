package Hy;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import J1.e;
import KJ.C15987c;
import N1.P;
import O0.V;
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
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import s0.C5843N;
import s0.C5844O;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKJ/c;", "LHy/b;", "items", "LXH/N;", "b", "(LKJ/c;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final void b(C15987c<C13014b> cVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<C13014b> cVar2 = cVar;
        int i12 = i10;
        C17542s.j(cVar2, "items");
        C4889m k10 = mVar.k(1018632163);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1018632163, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeInformationList (FullServeInformationList.kt:35)");
            }
            int i13 = 0;
            int i14 = 0;
            for (T next : cVar) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C16877v.x();
                }
                C13014b bVar = (C13014b) next;
                d.a aVar = d.f18749a;
                d f10 = J.f(aVar, 0.0f, 1, (Object) null);
                C5073d.e f11 = C5073d.f18068a.f();
                C5437c.a aVar2 = C5437c.f24302a;
                I b10 = G.b(f11, aVar2.l(), k10, i13);
                int a10 = C4883j.a(k10, i13);
                C4912y s10 = k10.s();
                d e10 = c.e(k10, f10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
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
                F1.c(a12, b10, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar3.d());
                C5843N n10 = C5843N.f28726a;
                float f12 = (float) 24;
                V.a(e.c(bVar.a().m(), k10, i13), (String) null, n10.c(J.t(aVar, h.B(f12)), aVar2.i()), C18030v.f147664a.a(k10, C18030v.f147665b).G0(), k10, 48, 0);
                C4889m mVar3 = k10;
                C13607l.i(bVar.b(), C13679b.a.C2855a.f116679a, C5116k1.a(D.m(n10.c(aVar, aVar2.i()), h.B(f12), 0.0f, 0.0f, 0.0f, 14, (Object) null), "ItemTitle" + i14), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, C13023e.f110931a | 48, 0, 262136);
                mVar3.x();
                C4889m mVar4 = mVar3;
                C5844O.a(J.i(aVar, h.B((float) 16)), mVar4, 6);
                k10 = mVar4;
                i14 = i15;
                i13 = 0;
            }
            mVar2 = k10;
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new t(cVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15987c cVar, int i10, C4889m mVar, int i11) {
        b(cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
