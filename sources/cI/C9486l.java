package ci;

import E1.I;
import G1.C4504g;
import KJ.C15987c;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKJ/c;", "", "footerTexts", "", "addBottomMargin", "LXH/N;", "b", "(LKJ/c;ZLU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.l  reason: case insensitive filesystem */
public final class C9486l {
    public static final void b(C15987c<String> cVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C15987c<String> cVar2 = cVar;
        boolean z11 = z10;
        int i12 = i10;
        C17542s.j(cVar2, "footerTexts");
        C4889m k10 = mVar.k(1775879832);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1775879832, i11, -1, "com.ingka.ikea.app.productinformationpage.v2.compose.DisclaimerComposable (DisclaimerComposable.kt:23)");
            }
            d m10 = D.m(e.i(d.f18749a), 0.0f, h.B((float) 48), 0.0f, h.B((float) (z11 ? 104 : 40)), 5, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, m10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
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
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(-973866074);
            for (String j10 : cVar) {
                C4889m mVar3 = k10;
                C13607l.j(j10, C13679b.a.C2856b.f116680a, D.m(d.f18749a, 0.0f, 0.0f, 0.0f, h.B((float) 24), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
                k10 = mVar3;
            }
            mVar2 = k10;
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
            n10.a(new C9485k(cVar2, z11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C15987c cVar, boolean z10, int i10, C4889m mVar, int i11) {
        b(cVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
