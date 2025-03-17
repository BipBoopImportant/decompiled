package Pi;

import E1.I;
import G1.C4504g;
import J1.j;
import Mi.C10768c;
import Mi.C10770e;
import Mi.C10777l;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
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
import XH.t;
import Y1.f;
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
import s0.C5862h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LMi/l;", "sectionHeader", "LXH/N;", "b", "(LMi/l;LU0/m;I)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class L {
    public static final void b(C10777l lVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str;
        String str2;
        C10777l lVar2 = lVar;
        int i12 = i10;
        C17542s.j(lVar2, "sectionHeader");
        C4889m k10 = mVar.k(893468171);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(lVar2) : k10.F(lVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(893468171, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.SectionHeaderComposable (SectionHeaderComposable.kt:25)");
            }
            if (lVar2 instanceof C10770e) {
                k10.W(731802629);
                str = j.c(b.f84783s7, new Object[]{((C10770e) lVar2).b()}, k10, 0);
                k10.P();
            } else if (lVar2 instanceof C10768c) {
                k10.W(731807844);
                str = j.b(b.f84805u7, k10, 0);
                k10.P();
            } else {
                C4889m mVar3 = k10;
                mVar3.W(731800999);
                mVar3.P();
                throw new t();
            }
            d.a aVar = d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, aVar);
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
            d.a aVar3 = aVar;
            C4889m mVar4 = k10;
            C13607l.j(str, C13679b.C2857b.C2858b.f116684a, D.k(e.i(aVar), 0.0f, h.B((float) 24), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 48, 0, 262136);
            C4889m mVar5 = mVar4;
            mVar5.W(1850336763);
            if (lVar.a()) {
                if (lVar2 instanceof C10770e) {
                    mVar5.W(1850340098);
                    str2 = j.c(b.f84772r7, new Object[]{((C10770e) lVar2).b()}, mVar5, 0);
                    mVar5.P();
                } else if (lVar2 instanceof C10768c) {
                    mVar5.W(1850346544);
                    str2 = j.b(b.f84794t7, mVar5, 0);
                    mVar5.P();
                } else {
                    C4889m mVar6 = mVar5;
                    mVar6.W(1850338281);
                    mVar6.P();
                    throw new t();
                }
                float f10 = (float) 8;
                C4889m mVar7 = mVar5;
                C13607l.j(str2, C13679b.a.C2856b.f116680a, D.k(e.i(aVar3), 0.0f, h.B(f10), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar7, 48, 0, 262136);
                float f11 = (float) 52;
                C13643u0.c(D.m(J.h(aVar3, 0.0f, 1, (Object) null), h.B(f11), h.B(f10), h.B(f11), 0.0f, 8, (Object) null), 0.0f, 0, mVar7, 0, 6);
                mVar2 = mVar7;
            } else {
                mVar2 = mVar5;
            }
            mVar2.P();
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
            n10.a(new K(lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C10777l lVar, int i10, C4889m mVar, int i11) {
        b(lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
