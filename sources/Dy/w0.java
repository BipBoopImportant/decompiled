package Dy;

import E1.I;
import G1.C4504g;
import J1.j;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import SC.L1;
import SC.S1;
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
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qx.C14957b;
import s0.C5843N;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkp/d;", "currencyConfig", "", "totalPriceInclTax", "totalPriceExclTax", "", "showTotalPriceInclTax", "LXH/N;", "b", "(Lkp/d;DDZLU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w0 {
    public static final void b(C11522d dVar, double d10, double d11, boolean z10, C4889m mVar, int i10) {
        int i11;
        C11522d dVar2 = dVar;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(dVar2, "currencyConfig");
        C4889m k10 = mVar.k(545779510);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(dVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        double d12 = d10;
        if ((i12 & 48) == 0) {
            i11 |= k10.h(d12) ? 32 : 16;
        }
        double d13 = d11;
        if ((i12 & 384) == 0) {
            i11 |= k10.h(d13) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(545779510, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.ItemTotalPriceRow (ItemTotalPriceRow.kt:35)");
            }
            d.a aVar = d.f18749a;
            float f10 = (float) 24;
            d j10 = D.j(J.h(aVar, 0.0f, 1, (Object) null), h.B(f10), h.B(f10));
            C5073d dVar3 = C5073d.f18068a;
            C5073d.m g10 = dVar3.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, j10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
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
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            C13643u0.c(D.k(aVar, 0.0f, h.B(f10), 1, (Object) null), h.B((float) 2), C18030v.f147664a.a(k10, C18030v.f147665b).p0(), k10, 54, 0);
            C5073d.f d14 = dVar3.d();
            d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            I b11 = G.b(d14, aVar2.l(), k10, 6);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, h10);
            C17631a<C4504g> a15 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar3.c());
            F1.c(a16, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            C13607l.j(j.b(b.f84456N8, k10, 0), C13679b.C2857b.c.f116685a, C5116k1.a(aVar, "ItemTotalPriceRow.TestTag.Label"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 432, 0, 262136);
            L1.c(C14957b.a(z11 ? d10 : d11, dVar2), L1.b(dVar), (d) null, (S1) null, k10, qx.c.f130485c, 12);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new v0(dVar, d10, d11, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C11522d dVar, double d10, double d11, boolean z10, int i10, C4889m mVar, int i11) {
        b(dVar, d10, d11, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
