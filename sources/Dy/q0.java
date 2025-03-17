package Dy;

import E1.I;
import G1.C4504g;
import Jy.k;
import L1.i;
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
import Y1.j;
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

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJy/k;", "discount", "Lkotlin/Function0;", "LXH/N;", "onItemClick", "b", "(LJy/k;LnI/a;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {
    public static final void b(k kVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        k kVar2 = kVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(kVar2, "discount");
        C17542s.j(aVar2, "onItemClick");
        C4889m k10 = mVar.k(-23029797);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(kVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-23029797, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.ItemDiscountRow (ItemDiscountRow.kt:26)");
            }
            C5073d.f d10 = C5073d.f18068a.d();
            d.a aVar3 = d.f18749a;
            d d11 = androidx.compose.foundation.d.d(D.j(C5116k1.a(J.h(aVar3, 0.0f, 1, (Object) null), "ItemDiscountRow.Root"), h.B((float) 24), h.B((float) 8)), false, (String) null, (i) null, aVar, 7, (Object) null);
            I b10 = G.b(d10, C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d11);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
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
            F1.c(a12, b10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar4.d());
            C5843N n10 = C5843N.f28726a;
            d a13 = C5116k1.a(aVar3, "ItemDiscountRow.Title");
            String h10 = kVar.h();
            C13679b.a.C2856b bVar = C13679b.a.C2856b.f116680a;
            mVar2 = k10;
            C13607l.j(h10, bVar, a13, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262136);
            C13607l.j(kVar.g(), bVar, C5116k1.a(aVar3, "ItemDiscountRow.Discount"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262136);
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
            n11.a(new p0(kVar2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(k kVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(kVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
