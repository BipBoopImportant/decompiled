package Qu;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import IC.C13026h;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
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
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "tryAgainClick", "b", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "instorepurchasestatus-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final void b(d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(aVar2, "tryAgainClick");
        C4889m k10 = mVar.k(732994069);
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
        if ((2 & i14) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            d.a aVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(732994069, i12, -1, "com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.compose.InStorePurchaseError (InStorePurchaseError.kt:24)");
            }
            float f10 = (float) 16;
            d k11 = D.k(J.h(aVar3, 0.0f, 1, (Object) null), 0.0f, h.B(f10), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
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
            d m10 = D.m(d.f18749a, 0.0f, 0.0f, 0.0f, h.B(f10), 7, (Object) null);
            C13023e a14 = C13026h.a(b.f84843y3);
            C13679b.C2857b.C2858b bVar = C13679b.C2857b.C2858b.f116684a;
            int i16 = C13023e.f110931a;
            C13607l.i(a14, bVar, m10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, i16 | 432, 0, 262136);
            d dVar3 = aVar3;
            mVar2 = k10;
            L.b(C13026h.a(b.f84506S8).a(k10, i16), (d) null, false, N.Primary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i12 << 24) & 1879048192) | 3072, 502);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new d(dVar2, aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
