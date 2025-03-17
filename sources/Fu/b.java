package Fu;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import N1.P;
import O0.e1;
import O0.g1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.I1;
import SC.J0;
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
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
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
import nI.q;
import ol.u;
import ol.v;
import p0.s;
import s0.C5842M;
import s0.C5844O;
import s0.C5848T;
import s0.C5852X;
import s0.C5861g;
import s0.C5862h;
import tK.C18029u;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LDu/b;", "exception", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "b", "(LDu/b;LnI/a;LU0/m;I)V", "wayfinding-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final void b(Du.b bVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        Du.b bVar2 = bVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(bVar2, "exception");
        C17542s.j(aVar2, "onDismiss");
        C4889m k10 = mVar.k(2099826070);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2099826070, i11, -1, "com.ingka.ikea.instore.wayfinding.impl.map.ui.FullscreenError (FullscreenError.kt:41)");
            }
            d.a aVar3 = d.f18749a;
            d e10 = C5852X.e(J.f(C5116k1.a(aVar3, "FullscreenErrorTestTags.CONTENT"), 0.0f, 1, (Object) null));
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar4 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar4.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e11 = c.e(k10, e10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
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
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e11, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            ol.p.c(v.BACK, aVar, (d) null, (String) null, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, (i11 & 112) | 6, 508);
            d.a aVar6 = aVar3;
            d c10 = C5861g.c(hVar, D.i(m.f(J.h(aVar6, 0.0f, 1, (Object) null), m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null), C18029u.f147649a.d()), 1.0f, false, 2, (Object) null);
            I a14 = C5080k.a(dVar.b(), aVar4.g(), k10, 54);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e12 = c.e(k10, c10);
            C17631a<C4504g> a16 = aVar5.a();
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
            F1.c(a17, a14, aVar5.c());
            F1.c(a17, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e12, aVar5.d());
            I1.f(C18146a.f148718xd, (String) null, (d) null, (J0) null, k10, 48, 12);
            C5844O.a(J.i(aVar6, h.B((float) 32)), k10, 6);
            C13023e b12 = bVar.b();
            int i13 = C13023e.f110931a;
            mVar2 = k10;
            C4889m mVar3 = mVar2;
            C13607l.j(b12.a(k10, i13), C13679b.C2857b.a.f116683a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262140);
            C5844O.a(J.i(aVar6, h.B((float) 16)), mVar2, 6);
            C13607l.j(bVar.a().a(mVar2, i13), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262140);
            mVar2.x();
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
            n10.a(new a(bVar, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(Du.b bVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(bVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
