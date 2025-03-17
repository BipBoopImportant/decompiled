package ki;

import J1.j;
import Oo.b;
import SC.F0;
import SC.G0;
import SC.H0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import r0.m;
import s0.C5852X;
import uK.C18146a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClicked", "b", "(LnI/a;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.s  reason: case insensitive filesystem */
public final class C9998s {
    public static final void b(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onClicked");
        C4889m k10 = mVar.k(324350727);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(324350727, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.PipBackButton (PipBackButton.kt:19)");
            }
            F0.b(C18146a.f148719y, j.b(b.f84632f, k10, 0), D.m(C5852X.e(d.f18749a), h.B((float) 16), h.B((float) 12), 0.0f, 0.0f, 12, (Object) null), false, H0.PrimaryInverse, G0.Small, (m) null, false, aVar, k10, ((i11 << 24) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, int i10, C4889m mVar, int i11) {
        b(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
