package go;

import E1.I;
import G1.C4504g;
import O0.e1;
import O0.g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import WC.y;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lo.C11556a;
import nI.C17631a;
import nI.p;
import nI.q;
import ol.u;
import ol.v;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llo/a;", "changeDeliveryTimeSlotViewModel", "Lkotlin/Function0;", "LXH/N;", "dismiss", "b", "(Llo/a;LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.h  reason: case insensitive filesystem */
public final class C11324h {
    public static final void b(C11556a aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C11556a aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(aVar3, "changeDeliveryTimeSlotViewModel");
        C17542s.j(aVar4, "dismiss");
        C4889m k10 = mVar.k(-1006577100);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1006577100, i13, -1, "com.ingka.ikea.checkout.impl.delivery.compose.ChangeDeliveryScreen (ChangeDeliveryScreen.kt:21)");
            }
            d f10 = J.f(d.f18749a, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, f10);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar5.a();
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
            F1.c(a13, a10, aVar5.c());
            F1.c(a13, s10, aVar5.e());
            p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar5.d());
            C5862h hVar = C5862h.f28810a;
            ol.p.c(v.CLOSE, aVar2, (d) null, "", (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, (i13 & 112) | 3078, 500);
            y.C(aVar3, (d) null, k10, i13 & 14, 2);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11323g(aVar3, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C11556a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        b(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
