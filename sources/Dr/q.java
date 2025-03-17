package dr;

import E1.I;
import G1.C4504g;
import SC.H2;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final void d(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-96057744);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-96057744, i12, -1, "com.ingka.ikea.familyrewards.implementation.compose.rewards.FullPageLoading (FullPageLoading.kt:22)");
            }
            d a10 = C5116k1.a(dVar, "LOADING_TEST_TAG");
            C5073d.m g10 = C5073d.f18068a.g();
            C5437c.a aVar = C5437c.f24302a;
            I a11 = C5080k.a(g10, aVar.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar3 = d.f18749a;
            I h10 = C5077h.h(aVar.o(), false);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, aVar3);
            C17631a<C4504g> a16 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, h10, aVar2.c());
            F1.c(a17, s11, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e11, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            k10.W(-395637413);
            Object D10 = k10.D();
            C4889m.a aVar4 = C4889m.f14007a;
            if (D10 == aVar4.a()) {
                D10 = new n();
                k10.u(D10);
            }
            C17631a aVar5 = (C17631a) D10;
            k10.P();
            k10.W(-395636105);
            Object D11 = k10.D();
            if (D11 == aVar4.a()) {
                D11 = new o();
                k10.u(D11);
            }
            k10.P();
            C11224D.t(10, aVar5, (C17642l) D11, (d) null, true, k10, 25014, 8);
            k10.x();
            C5844O.a(J.i(aVar3, h.B((float) 56)), k10, 6);
            H2.b(e.i(J.i(aVar3, h.B((float) 32))), false, k10, 0, 2);
            C5844O.a(J.i(aVar3, h.B((float) 24)), k10, 6);
            float f10 = (float) 16;
            H2.b(e.i(J.i(aVar3, h.B(f10))), false, k10, 0, 2);
            C5844O.a(J.i(aVar3, h.B((float) 8)), k10, 6);
            float f11 = (float) 184;
            H2.b(e.i(J.y(J.i(aVar3, h.B(f10)), h.B(f11))), false, k10, 0, 2);
            C5844O.a(J.i(aVar3, h.B((float) 40)), k10, 6);
            H2.b(e.i(J.i(aVar3, h.B(f11))), false, k10, 0, 2);
            float f12 = (float) 12;
            C5844O.a(J.i(aVar3, h.B(f12)), k10, 6);
            H2.b(e.i(J.i(aVar3, h.B(f11))), false, k10, 0, 2);
            C5844O.a(J.i(aVar3, h.B(f12)), k10, 6);
            H2.b(e.i(J.i(aVar3, h.B(f11))), false, k10, 0, 2);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new p(dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final float e() {
        return 1.0f;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(int i10) {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
