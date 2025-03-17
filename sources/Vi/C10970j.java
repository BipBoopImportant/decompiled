package Vi;

import B0.C4373q;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15988d;
import N1.G;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
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
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LVi/k;", "model", "LXH/N;", "b", "(LVi/k;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vi.j  reason: case insensitive filesystem */
public final class C10970j {
    public static final void b(C10971k kVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10971k kVar2 = kVar;
        int i12 = i10;
        C17542s.j(kVar2, "model");
        C4889m k10 = mVar.k(-1319142961);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(kVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1319142961, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.adapter.delegate.CheckoutTitleAndDescription (CheckoutTitleAndDescriptionDelegate.kt:52)");
            }
            d.a aVar = d.f18749a;
            d i13 = e.i(aVar);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, i13);
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
            float f10 = (float) 48;
            mVar2 = k10;
            C4889m mVar3 = mVar2;
            C13607l.j(kVar.b(), C13679b.C2857b.a.f116683a, D.m(aVar, 0.0f, h.B(f10), 0.0f, h.B((float) 16), 5, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            C13023e.b bVar = r4;
            C13023e.b bVar2 = new C13023e.b(kVar.a());
            Bl.c.c(bVar, D.m(aVar, 0.0f, 0.0f, 0.0f, h.B(f10), 7, (Object) null), (G) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, C13679b.a.C2856b.f116680a, mVar3, C13023e.b.f110934c | 48, 12582912, 131068);
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
            n10.a(new C10969i(kVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C10971k kVar, int i10, C4889m mVar, int i11) {
        b(kVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
