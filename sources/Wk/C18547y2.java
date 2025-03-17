package wK;

import O0.H;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.C16814e;
import androidx.compose.ui.d;
import kotlin.Metadata;
import tK.C18014e;
import tK.C18030v;
import vK.C18203c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LXH/N;", "d", "(LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "LvK/c;", "orientation", "f", "(Landroidx/compose/ui/d;LvK/c;LU0/m;II)V", "e", "(Landroidx/compose/ui/d;LU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.y2  reason: case insensitive filesystem */
public final class C18547y2 {
    public static final void d(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-177963427);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-177963427, i10, -1, "net.ikea.skapa.ui.components.Divider (Divider.kt:26)");
            }
            f(d.f18749a, C18203c.Horizontal, k10, 54, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18512v2(i10));
        }
    }

    @C16814e
    public static final void e(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-141281004);
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
                C4895p.S(-141281004, i12, -1, "net.ikea.skapa.ui.components.Divider (Divider.kt:57)");
            }
            f(dVar, C18203c.Horizontal, k10, (i12 & 14) | 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18536x2(dVar, i10, i11));
        }
    }

    public static final void f(d dVar, C18203c cVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(1348467224);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(cVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                cVar = C18203c.Horizontal;
            }
            if (C4895p.J()) {
                C4895p.S(1348467224, i12, -1, "net.ikea.skapa.ui.components.Divider (Divider.kt:45)");
            }
            if (cVar == C18203c.Horizontal) {
                k10.W(-183807026);
                H.a(dVar, C18014e.f147445a.b(), C18030v.f147664a.a(k10, C18030v.f147665b).m0(), k10, i12 & 14, 0);
                k10.P();
            } else {
                k10.W(-183662256);
                H.b(dVar, C18014e.f147445a.b(), C18030v.f147664a.a(k10, C18030v.f147665b).m0(), k10, i12 & 14, 0);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18524w2(dVar, cVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, C4889m mVar, int i11) {
        d(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(d dVar, C18203c cVar, int i10, int i11, C4889m mVar, int i12) {
        f(dVar, cVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
