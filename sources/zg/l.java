package zG;

import E1.I;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import p1.i1;
import s0.C5862h;
import wK.I4;
import wK.J4;
import wK.X4;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lp1/v0;", "backgroundColor", "LXH/N;", "b", "(JLU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final void b(long j10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(465526655);
        if ((i10 & 6) == 0) {
            i11 = (k10.e(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(465526655, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.LoadingScreen (LoadingScreen.kt:24)");
            }
            d.a aVar = d.f18749a;
            d d10 = b.d(J.f(aVar, 0.0f, 1, (Object) null), j10, (i1) null, 2, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.b(), C5437c.f24302a.g(), k10, 54);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
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
            X4.q(C5116k1.a(aVar, "LOADING_BALL_TEST_TAG"), (J4) null, (I4) null, k10, 6, 6);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new k(j10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(long j10, int i10, C4889m mVar, int i11) {
        b(j10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
