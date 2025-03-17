package Pi;

import E1.I;
import G1.C4504g;
import Mi.C10776k;
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
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMi/k;", "reviewResponse", "", "overrideWithTranslatedResponse", "LXH/N;", "b", "(LMi/k;Ljava/lang/String;LU0/m;I)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class J {
    public static final void b(C10776k kVar, String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10776k kVar2 = kVar;
        String str2 = str;
        int i12 = i10;
        C17542s.j(kVar2, "reviewResponse");
        C4889m k10 = mVar.k(-658962960);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(kVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-658962960, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.ReviewResponseItem (ReviewResponse.kt:31)");
            }
            d.a aVar = d.f18749a;
            float f10 = (float) 16;
            d h10 = androidx.compose.foundation.layout.J.h(D.k(e.i(aVar), 0.0f, h.B(f10), 1, (Object) null), 0.0f, 1, (Object) null);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
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
            d h11 = androidx.compose.foundation.layout.J.h(aVar, 0.0f, 1, (Object) null);
            I b11 = G.b(dVar.c(), aVar2.i(), k10, 54);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, h11);
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
            C4889m mVar3 = k10;
            C4889m mVar4 = mVar3;
            C13607l.j(kVar.b(), C13679b.C2857b.f.f116688a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 48, 0, 262140);
            C13607l.j(kVar.a(), C13679b.a.c.f116681a, C5842M.e(n10, aVar, 1.0f, false, 2, (Object) null), C18030v.f147664a.a(mVar3, C18030v.f147665b).H0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.b()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 48, 0, 261104);
            mVar3.x();
            C4889m mVar5 = mVar3;
            C5844O.a(androidx.compose.foundation.layout.J.i(aVar, h.B(f10)), mVar5, 6);
            mVar2 = mVar5;
            C13607l.j(str2 == null ? kVar.c() : str2, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262140);
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
            n11.a(new I(kVar2, str2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C10776k kVar, String str, int i10, C4889m mVar, int i11) {
        b(kVar, str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
