package sr;

import A0.g;
import J1.e;
import O0.V;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import c2.h;
import kotlin.Metadata;
import t1.C5942c;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void b(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(930372539);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(930372539, i12, -1, "com.ingka.ikea.familyrewards.presentation.common.FamilyRewardsIcon (FamilyRewardsIcon.kt:24)");
            }
            C5942c c10 = e.c(C18146a.f148445g, k10, 0);
            androidx.compose.ui.d t10 = J.t(dVar, h.B((float) 32));
            C18030v vVar = C18030v.f147664a;
            int i14 = C18030v.f147665b;
            V.a(c10, (String) null, D.i(b.c(t10, vVar.a(k10, i14).B0(), g.h()), h.B((float) 4)), vVar.a(k10, i14).x0(), k10, 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
