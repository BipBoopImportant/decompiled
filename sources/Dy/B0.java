package Dy;

import By.C12674m;
import J1.j;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.k;
import androidx.compose.ui.d;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "estimatedWaitingTime", "LXH/N;", "b", "(Ljava/lang/Integer;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class B0 {
    public static final void b(Integer num, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str;
        Integer num2 = num;
        int i12 = i10;
        C4889m k10 = mVar.k(2051482382);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(num2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2051482382, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.OrderEstimatedWaitingTime (OrderEstimatedWaitingTime.kt:18)");
            }
            if (num2 == null) {
                k10.W(2013716850);
                str = j.b(C12674m.f108265Y, k10, 0);
                k10.P();
            } else {
                k10.W(2013812795);
                str = j.c(C12674m.f108266Z, new Object[]{num}, k10, 0);
                k10.P();
            }
            mVar2 = k10;
            C13607l.j(str, C13679b.a.C2856b.f116680a, e.i(d.f18749a), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new A0(num2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(Integer num, int i10, C4889m mVar, int i11) {
        b(num, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
