package wy;

import SC.C13593h1;
import SC.C13597i1;
import SC.C13605k1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"LXH/N;", "b", "(LU0/m;I)V", "room-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void b(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1534562758);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1534562758, i10, -1, "com.ingka.ikea.room.impl.presentation.composables.Loading (Loading.kt:14)");
            }
            C13605k1.b((androidx.compose.ui.d) null, C13597i1.Primary, C13593h1.Large, k10, 432, 1);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C4889m mVar, int i11) {
        b(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
