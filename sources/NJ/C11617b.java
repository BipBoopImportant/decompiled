package nj;

import E1.I;
import Ez.f;
import G1.C4504g;
import J1.j;
import N1.P;
import O0.V;
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
import nj.C11608B;
import s0.C5862h;
import tK.C18029u;
import uK.C18146a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LXH/N;", "b", "(LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nj.b  reason: case insensitive filesystem */
public final class C11617b {
    public static final void b(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-866749589);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-866749589, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.ConsecutiveFailureContent (ConsecutiveFailureContent.kt:28)");
            }
            d.a aVar = d.f18749a;
            d k11 = D.k(e.i(aVar), 0.0f, C18029u.f147649a.d(), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
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
            C11608B.a aVar3 = C11608B.a.f99717a;
            d m10 = D.m(aVar, 0.0f, 0.0f, 0.0f, aVar3.a(), 7, (Object) null);
            V.a(J1.e.c(C18146a.f148718xd, k10, 0), (String) null, m10, aVar3.b(k10, 6), k10, 432, 0);
            String b11 = j.b(f.f109663C, k10, 0);
            C13679b.C2857b.c cVar = C13679b.C2857b.c.f116685a;
            j.a aVar4 = Y1.j.f14783b;
            int a14 = aVar4.a();
            C4889m mVar3 = k10;
            C13607l.j(b11, cVar, D.m(aVar, 0.0f, 0.0f, 0.0f, h.B((float) 12), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(a14), (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 261112);
            C4889m mVar4 = mVar3;
            mVar2 = mVar4;
            C13607l.j(J1.j.b(f.f109662B, mVar4, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, Y1.j.h(aVar4.a()), (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 261116);
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
            n10.a(new C11616a(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C4889m mVar, int i11) {
        b(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
