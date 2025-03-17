package Qw;

import E1.I;
import G1.C4504g;
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
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import r0.m;
import rv.C11849b;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "title", "description", "Lkotlin/Function0;", "LXH/N;", "onConfirm", "onDismiss", "b", "(Ljava/lang/String;Ljava/lang/String;LnI/a;LnI/a;LU0/m;I)V", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class U {
    public static final void b(String str, String str2, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C4889m mVar3;
        d.a aVar3;
        String str3 = str;
        String str4 = str2;
        C17631a<C16807N> aVar4 = aVar;
        C17631a<C16807N> aVar5 = aVar2;
        int i12 = i10;
        C17542s.j(str3, "title");
        C17542s.j(aVar4, "onConfirm");
        C17542s.j(aVar5, "onDismiss");
        C4889m k10 = mVar.k(-798795310);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar5) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i13 = i11;
        if ((i13 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-798795310, i13, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentOptionConfirmationContent (PaymentOptionConfirmationContent.kt:30)");
            }
            d.a aVar6 = d.f18749a;
            d k11 = D.k(aVar6, 0.0f, h.B((float) 12), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar7.a();
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
            F1.c(a13, a10, aVar7.c());
            F1.c(a13, s10, aVar7.e());
            p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar7.d());
            C5862h hVar = C5862h.f28810a;
            float f10 = (float) 8;
            float f11 = f10;
            d.a aVar8 = aVar6;
            int i14 = i13;
            C4889m mVar4 = k10;
            C13607l.j(str, C13679b.C2857b.a.f116683a, D.m(e.i(aVar6), 0.0f, 0.0f, 0.0f, h.B(f10), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, (i13 & 14) | 48, 0, 262136);
            C4889m mVar5 = mVar4;
            mVar5.W(-937082357);
            if (str2 == null) {
                mVar3 = mVar5;
                aVar3 = aVar8;
            } else {
                d.a aVar9 = aVar8;
                aVar3 = aVar9;
                mVar3 = mVar5;
                C13607l.j(str2, C13679b.a.C2856b.f116680a, e.i(D.k(aVar9, 0.0f, h.B(f11), 1, (Object) null)), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
            }
            mVar3.P();
            d.a aVar10 = aVar3;
            float f12 = (float) 16;
            C4889m mVar6 = mVar3;
            float f13 = f12;
            L.b(J1.j.b(C11849b.f102189G2, mVar6, 0), D.m(J.h(aVar10, 0.0f, 1, (Object) null), h.B(f12), h.B(f12), h.B(f12), 0.0f, 8, (Object) null), false, N.Emphasised, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, mVar6, ((i14 << 21) & 1879048192) | 3120, 500);
            d m10 = D.m(J.h(aVar10, 0.0f, 1, (Object) null), h.B(f13), h.B(f11), h.B(f13), 0.0f, 8, (Object) null);
            mVar2 = mVar3;
            L.b(J1.j.b(b.f84518U0, mVar2, 0), m10, false, N.Tertiary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar2, mVar2, ((i14 << 18) & 1879048192) | 3120, 500);
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
            n10.a(new T(str, str2, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, String str2, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        b(str, str2, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
