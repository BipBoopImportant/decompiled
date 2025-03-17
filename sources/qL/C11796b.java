package ql;

import J1.e;
import J1.j;
import O0.V;
import Oo.b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import c2.h;
import kotlin.Metadata;
import lg.C10027d;
import p1.C5747v0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Landroidx/compose/ui/d;LU0/m;II)V", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ql.b  reason: case insensitive filesystem */
public final class C11796b {
    public static final void b(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(245580835);
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
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(245580835, i12, -1, "com.ingka.ikea.app.uicomposables.bottomsheet.Handle (Handle.kt:24)");
            }
            V.a(e.c(C10027d.f75270a, k10, 0), j.b(b.f84588b, k10, 0), D.k(dVar, 0.0f, h.B((float) 12), 1, (Object) null), C5747v0.f27350b.i(), k10, 3072, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11795a(dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
