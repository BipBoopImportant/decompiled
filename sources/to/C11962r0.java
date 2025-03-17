package to;

import J1.j;
import SC.X0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import r0.m;
import rv.C11849b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "enabled", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(ZLnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.r0  reason: case insensitive filesystem */
public final class C11962r0 {
    public static final void b(boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onClick");
        C4889m k10 = mVar.k(-750165537);
        if ((i10 & 6) == 0) {
            i11 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-750165537, i11, -1, "com.ingka.ikea.checkout.impl.presentation.compose.GoToPaymentButton (GoToPaymentButton.kt:23)");
            }
            X0.b(j.b(C11849b.f102235S0, k10, 0), D.m(C5116k1.a(d.f18749a, "GoToPaymentButtonTestTags.BUTTON"), 0.0f, h.B((float) 40), 0.0f, 0.0f, 13, (Object) null), z10, true, false, (m) null, aVar, k10, ((i11 << 6) & 896) | 3120 | ((i11 << 15) & 3670016), 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11961q0(z10, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(boolean z10, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(z10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
