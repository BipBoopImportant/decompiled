package Aj;

import E1.I;
import G1.C4504g;
import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import tK.C18029u;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LXH/N;", "b", "(LU0/m;I)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final void b(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-473249364);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-473249364, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.productdetails.presentation.ui.composable.ProductDetailsLoading (ProductDetailsLoading.kt:17)");
            }
            d.a aVar = d.f18749a;
            d f10 = J.f(C5116k1.a(aVar, "ProductDetailsScreen.TestTag.Loading"), 0.0f, 1, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
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
            F1.c(a12, h10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            C13605k1.b(D.m(aVar, 0.0f, 0.0f, 0.0f, C18029u.f147649a.e(), 7, (Object) null), (C13597i1) null, (C13593h1) null, k10, 0, 6);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C4889m mVar, int i11) {
        b(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
