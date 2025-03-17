package Sj;

import E1.I;
import G1.C4504g;
import J1.j;
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
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nj.C11622g;
import nj.C11624i;
import s0.C5862h;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "icon", "title", "description", "Lkotlin/Function0;", "LXH/N;", "onPrimaryButtonClick", "c", "(IIILnI/a;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sj.i  reason: case insensitive filesystem */
public final class C10922i {
    public static final void c(int i10, int i11, int i12, C17631a<C16807N> aVar, C4889m mVar, int i13) {
        int i14;
        int i15 = i10;
        int i16 = i11;
        int i17 = i12;
        C17631a<C16807N> aVar2 = aVar;
        int i18 = i13;
        C17542s.j(aVar2, "onPrimaryButtonClick");
        C4889m k10 = mVar.k(2031387150);
        if ((i18 & 6) == 0) {
            i14 = (k10.d(i15) ? 4 : 2) | i18;
        } else {
            i14 = i18;
        }
        if ((i18 & 48) == 0) {
            i14 |= k10.d(i16) ? 32 : 16;
        }
        if ((i18 & 384) == 0) {
            i14 |= k10.d(i17) ? 256 : 128;
        }
        if ((i18 & 3072) == 0) {
            i14 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i14 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2031387150, i14, -1, "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetScreen (UpptackaGenericErrorBottomSheetScreen.kt:31)");
            }
            d.a aVar3 = d.f18749a;
            d h10 = J.h(aVar3, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
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
            C11622g.i(new oj.d(i15, j.b(i17, k10, (i14 >> 6) & 14), j.b(i16, k10, (i14 >> 3) & 14)), k10, 0);
            d a14 = C5116k1.a(e.i(aVar3), "UpptackaGenericErrorBottomSheetScreen.TestTag.PrimaryButton");
            C18029u uVar = C18029u.f147649a;
            d m10 = D.m(a14, 0.0f, uVar.a(), 0.0f, uVar.e(), 5, (Object) null);
            k10.W(-1350958250);
            boolean z10 = (i14 & 7168) == 2048;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C10920g(aVar2);
                k10.u(D10);
            }
            k10.P();
            C11624i.b(m10, (C17631a) D10, k10, 0, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10921h(i10, i11, i12, aVar, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(int i10, int i11, int i12, C17631a aVar, int i13, C4889m mVar, int i14) {
        c(i10, i11, i12, aVar, mVar, M0.a(i13 | 1));
        return C16807N.f139792a;
    }
}
