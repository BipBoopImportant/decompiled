package Wq;

import A0.g;
import Rq.d;
import SC.H2;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import kotlin.Metadata;
import m1.e;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "width", "Lc2/h;", "height", "LXH/N;", "b", "(FFLU0/m;I)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final void b(float f10, float f11, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1096332113);
        if ((i10 & 6) == 0) {
            i11 = (k10.c(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.c(f11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1096332113, i11, -1, "com.ingka.ikea.familyrewards.implementation.compose.details.Skeleton (Skeleton.kt:19)");
            }
            H2.b(e.a(J.i(J.g(d.k(), f10), f11), g.a(25)), false, k10, 0, 2);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new q(f10, f11, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(float f10, float f11, int i10, C4889m mVar, int i11) {
        b(f10, f11, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
