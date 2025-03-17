package ci;

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
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroidx/compose/ui/d;LU0/m;II)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K {
    public static final void b(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(1594607287);
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
                C4895p.S(1594607287, i12, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.OnlyInStoreComposable (OnlyInStoreComposable.kt:26)");
            }
            d b10 = J.b(J.h(aVar, 0.0f, 1, (Object) null), 0.0f, h.B((float) 72), 1, (Object) null);
            C18030v vVar = C18030v.f147664a;
            int i16 = C18030v.f147665b;
            d d10 = b.d(b10, vVar.a(k10, i16).l0(), (i1) null, 2, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, h10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            String b12 = j.b(Oo.b.f84715m5, k10, 0);
            C13679b.a.c cVar = C13679b.a.c.f116681a;
            long G02 = vVar.a(k10, i16).G0();
            dVar3 = aVar;
            mVar2 = k10;
            C13607l.j(b12, cVar, D.j(d.f18749a, h.B((float) 24), h.B((float) 8)), G02, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262128);
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
            n10.a(new J(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
