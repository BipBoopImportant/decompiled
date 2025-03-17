package nj;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
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
import Y1.t;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import gs.C11352b;
import gs.e;
import gs.f;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oj.h;
import p1.C5749w0;
import s0.C5843N;
import s0.C5862h;
import t1.C5942c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Loj/h;", "model", "LXH/N;", "g", "(Loj/h;LU0/m;I)V", "", "imageUrl", "altText", "d", "(Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    private static final void d(String str, String str2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        C4889m k10 = mVar.k(1196310381);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str3) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1196310381, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.ProductImage (ProductInfoContent.kt:63)");
            }
            k10.W(-607493357);
            boolean z10 = (i11 & 14) == 4;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new x(str3);
                k10.u(D10);
            }
            k10.P();
            mVar2 = k10;
            C11352b.b(f.a((C17642l) D10, k10, 0), str2, J.t(d.f18749a, C11608B.f99715a.b()), (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, C4478k.f5915a.f(), 0.0f, (C5749w0) null, 0, k10, 12583296 | e.f97946h | (i11 & 112), 0, 1912);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new y(str3, str2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(str);
        aVar.i(Boolean.TRUE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, String str2, int i10, C4889m mVar, int i11) {
        d(str, str2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void g(h hVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        h hVar2 = hVar;
        int i12 = i10;
        C17542s.j(hVar2, "model");
        C4889m k10 = mVar.k(-1505227295);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(hVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1505227295, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.ProductInfoContent (ProductInfoContent.kt:29)");
            }
            C5073d.f a10 = C11608B.f99715a.a(k10, 6);
            d.a aVar = d.f18749a;
            d i13 = TC.e.i(D.k(aVar, 0.0f, c2.h.B((float) 24), 1, (Object) null));
            C5437c.a aVar2 = C5437c.f24302a;
            I b10 = G.b(a10, aVar2.l(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, i13);
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
            F1.c(a13, b10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b11);
            }
            F1.c(a13, e10, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            d(hVar.i(), hVar.g(), k10, 0);
            d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            I a14 = C5080k.a(C5073d.f18068a.g(), aVar2.k(), k10, 0);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e11 = c.e(k10, h10);
            C17631a<C4504g> a16 = aVar3.a();
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
            F1.c(a17, a14, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b12 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b12);
            }
            F1.c(a17, e11, aVar3.d());
            C5862h hVar3 = C5862h.f28810a;
            d h11 = J.h(aVar, 0.0f, 1, (Object) null);
            String j10 = hVar.j();
            t.a aVar4 = t.f14827a;
            mVar2 = k10;
            C4889m mVar3 = mVar2;
            C13607l.j(j10, C13679b.C2857b.f.f116688a, h11, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, aVar4.b(), false, 1, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 199680, 221176);
            C13607l.j(hVar.h(), C13679b.a.C2856b.f116680a, J.h(aVar, 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (Y1.f) null, 0, aVar4.b(), false, 2, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 199680, 221176);
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
            n11.a(new w(hVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(h hVar, int i10, C4889m mVar, int i11) {
        g(hVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
