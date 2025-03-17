package Dy;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.F0;
import SC.G0;
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
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LIC/e;", "title", "Lkotlin/Function0;", "LXH/N;", "onIconClick", "iconContentDescription", "subTitle", "b", "(LIC/e;LnI/a;LIC/e;LIC/e;LU0/m;II)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class H0 {
    public static final void b(C13023e eVar, C17631a<C16807N> aVar, C13023e eVar2, C13023e eVar3, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m mVar2;
        C13023e eVar4;
        C13023e eVar5 = eVar;
        C17631a<C16807N> aVar2 = aVar;
        C13023e eVar6 = eVar2;
        C13023e eVar7 = eVar3;
        int i13 = i10;
        C17542s.j(eVar5, "title");
        C17542s.j(aVar2, "onIconClick");
        C4889m k10 = mVar.k(-735402508);
        if ((i11 & 1) != 0) {
            i12 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i12 = ((i13 & 8) == 0 ? k10.V(eVar5) : k10.F(eVar5) ? 4 : 2) | i13;
        } else {
            i12 = i13;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i13 & 384) == 0) {
            i12 |= (i13 & 512) == 0 ? k10.V(eVar6) : k10.F(eVar6) ? 256 : 128;
        }
        int i14 = i11 & 8;
        if (i14 != 0) {
            i12 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i12 |= (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? k10.V(eVar7) : k10.F(eVar7) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (i14 != 0) {
                eVar7 = null;
            }
            if (C4895p.J()) {
                C4895p.S(-735402508, i12, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.SectionHeader (SectionHeader.kt:34)");
            }
            d.a aVar3 = d.f18749a;
            d h10 = J.h(aVar3, 0.0f, 1, (Object) null);
            C5437c.a aVar4 = C5437c.f24302a;
            C5437c.C0386c i15 = aVar4.i();
            C5073d dVar = C5073d.f18068a;
            I b10 = G.b(dVar.f(), i15, k10, 48);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar5.a();
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
            F1.c(a12, b10, aVar5.c());
            F1.c(a12, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b11 = aVar5.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar5.d());
            d e11 = C5842M.e(C5843N.f28726a, aVar3, 1.0f, false, 2, (Object) null);
            I a13 = C5080k.a(dVar.g(), aVar4.k(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e12 = c.e(k10, e11);
            C17631a<C4504g> a15 = aVar5.a();
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
            F1.c(a16, a13, aVar5.c());
            F1.c(a16, s11, aVar5.e());
            p<C4504g, Integer, C16807N> b12 = aVar5.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e12, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            int i16 = C13023e.f110931a;
            C13607l.j(eVar5.a(k10, (i12 & 14) | i16), C13679b.C2857b.c.f116685a, C5116k1.a(e.i(aVar3), "CartSection.TestTag.Title"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262136);
            k10.W(-2001279102);
            if (eVar7 != null) {
                C5844O.a(J.i(aVar3, h.B((float) 4)), k10, 6);
                C13607l.j(eVar7.a(k10, i16), C13679b.a.C2856b.f116680a, C5116k1.a(e.i(aVar3), "CartSection.TestTag.Title"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262136);
            }
            k10.P();
            k10.x();
            d a17 = C5116k1.a(aVar3, "CartSection.TestTag.IconButton");
            int i17 = C18146a.f148220R5;
            SC.H0 h02 = SC.H0.Tertiary;
            k10.W(1947287430);
            String a18 = eVar6 == null ? null : eVar6.a(k10, i16 | ((i12 >> 6) & 14));
            k10.P();
            mVar2 = k10;
            F0.b(i17, a18, a17, false, h02, (G0) null, (m) null, false, aVar, k10, ((i12 << 21) & 234881024) | 24960, 232);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            eVar4 = eVar7;
        } else {
            k10.L();
            eVar4 = eVar7;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new G0(eVar, aVar, eVar2, eVar4, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, C17631a aVar, C13023e eVar2, C13023e eVar3, int i10, int i11, C4889m mVar, int i12) {
        b(eVar, aVar, eVar2, eVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
