package Of;

import E1.I;
import G1.C4504g;
import J1.j;
import KJ.C15985a;
import KJ.C15987c;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13643u0;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import hg.n;
import i1.C5437c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import p1.i1;
import r0.m;
import rv.C11849b;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKJ/c;", "Lhg/n$c$a;", "items", "Lkotlin/Function0;", "LXH/N;", "onManageItemsClicked", "b", "(LKJ/c;LnI/a;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d2 {
    public static final void b(C15987c<n.c.a> cVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<n.c.a> cVar2 = cVar;
        C17631a<C16807N> aVar2 = aVar;
        C17542s.j(cVar2, "items");
        C17542s.j(aVar2, "onManageItemsClicked");
        C4889m k10 = mVar.k(487176724);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(cVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(487176724, i11, -1, "com.ingka.ikea.app.cart.compose.UnavailableItemsSection (UnavailableItemsSection.kt:34)");
            }
            d.a aVar3 = d.f18749a;
            d k11 = D.k(b.d(J.h(aVar3, 0.0f, 1, (Object) null), C18030v.f147664a.a(k10, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), 0.0f, h.B((float) 16), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
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
            d.a aVar5 = aVar3;
            mVar2 = k10;
            C13585f1.c(j.b(C11849b.f102281d, k10, 0), aVar, (d) null, j.b(C11849b.f102276c, k10, 0), (C13573c1) null, C13569b1.d.f116148b, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, (C13589g1) null, 0.0f, true, false, (m) null, mVar2, (i11 & 112) | (C13569b1.d.f116149c << 15), 6, 7124);
            C13643u0.c(e.i(aVar5), 0.0f, 0, mVar2, 0, 6);
            d m10 = D.m(e.i(aVar5), 0.0f, h.B((float) 8), 0.0f, 0.0f, 13, (Object) null);
            ArrayList arrayList = new ArrayList(C16877v.y(cVar2, 10));
            for (n.c.a aVar6 : cVar) {
                arrayList.add(new Dl.b(aVar6.c(), aVar6.b(), aVar6.a(), 0, 8, (DefaultConstructorMarker) null));
            }
            Dl.m.n(C15985a.h(arrayList), m10, 0.0f, 0.0f, (Dl.n) null, mVar2, Dl.b.f79786f, 28);
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
            n10.a(new c2(cVar2, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15987c cVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(cVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
