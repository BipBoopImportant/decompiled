package yn;

import An.l;
import An.m;
import E1.I;
import G1.C4504g;
import LC.C13178b;
import MC.C13203i;
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
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mp.C11588a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LAn/m;", "inspirationSingleUiModel", "Lkotlin/Function1;", "Lmp/a;", "LXH/N;", "onInspirationClicked", "e", "(LAn/m;LnI/l;LU0/m;I)V", "LAn/l;", "inspirationPairUiModel", "c", "(LAn/l;LnI/l;LU0/m;I)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class S0 {
    public static final void c(l lVar, C17642l<? super C11588a, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        float f10;
        C5073d dVar;
        l lVar3 = lVar;
        C17642l<? super C11588a, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(lVar3, "inspirationPairUiModel");
        C17542s.j(lVar4, "onInspirationClicked");
        C4889m k10 = mVar.k(1956814472);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(lVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1956814472, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.PlpPairInspiration (PlpInspirationFeed.kt:57)");
            }
            d.a aVar = d.f18749a;
            float f11 = (float) 8;
            d m10 = D.m(e.i(J.h(aVar, 0.0f, 1, (Object) null)), 0.0f, 0.0f, 0.0f, h.B(f11), 7, (Object) null);
            C5073d dVar2 = C5073d.f18068a;
            C5073d.m g10 = dVar2.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, m10);
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
            String h10 = lVar.h();
            k10.W(95039708);
            if (h10 == null || h10.length() == 0) {
                f10 = f11;
                dVar = dVar2;
            } else {
                dVar = dVar2;
                f10 = f11;
                C13607l.j(h10, C13679b.C2857b.C2858b.f116684a, D.k(aVar, 0.0f, h.B((float) 16), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 432, 0, 262136);
            }
            k10.P();
            I b11 = G.b(dVar.n(h.B(f10)), aVar2.l(), k10, 6);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, aVar);
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
            d e12 = C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null);
            C13178b.a aVar4 = C13178b.a.f111818a;
            int i13 = C13178b.a.f111819b;
            int i14 = (i11 << 3) & 896;
            mVar2 = k10;
            C13203i.c(lVar.g().get(0), aVar4, lVar2, e12, (Float) null, k10, (i13 << 3) | i14, 16);
            C13203i.c(lVar.g().get(1), aVar4, lVar2, C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null), (Float) null, mVar2, (i13 << 3) | i14, 16);
            mVar2.x();
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
            n11.a(new Q0(lVar3, lVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        c(lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void e(m mVar, C17642l<? super C11588a, C16807N> lVar, C4889m mVar2, int i10) {
        int i11;
        C4889m mVar3;
        m mVar4 = mVar;
        C17642l<? super C11588a, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(mVar4, "inspirationSingleUiModel");
        C17542s.j(lVar2, "onInspirationClicked");
        C4889m k10 = mVar2.k(188504392);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(mVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(188504392, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.PlpSingleInspiration (PlpInspirationFeed.kt:27)");
            }
            d.a aVar = d.f18749a;
            d m10 = D.m(e.i(J.h(aVar, 0.0f, 1, (Object) null)), 0.0f, 0.0f, 0.0f, h.B((float) 8), 7, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, m10);
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
            String h10 = mVar.h();
            k10.W(-1686681477);
            if (!(h10 == null || h10.length() == 0)) {
                C13607l.j(h10, C13679b.C2857b.C2858b.f116684a, D.k(e.i(aVar), 0.0f, h.B((float) 16), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262136);
            }
            k10.P();
            mVar3 = k10;
            C13203i.c(mVar.g(), C13178b.a.f111818a, lVar, (d) null, (Float) null, k10, (C13178b.a.f111819b << 3) | ((i11 << 3) & 896), 24);
            mVar3.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar3 = k10;
        }
        Y0 n10 = mVar3.n();
        if (n10 != null) {
            n10.a(new R0(mVar4, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(m mVar, C17642l lVar, int i10, C4889m mVar2, int i11) {
        e(mVar, lVar, mVar2, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
