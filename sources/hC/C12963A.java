package HC;

import HJ.C15854t;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import ZC.C13902y;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "url", "contentDescription", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "commercial_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: HC.A  reason: case insensitive filesystem */
public final class C12963A {
    public static final void b(String str, String str2, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(str, "url");
        C17542s.j(str2, "contentDescription");
        C4889m k10 = mVar.k(1420958044);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(str2) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(dVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1420958044, i12, -1, "com.ingka.ikea.ui.commercial.ReferenceMediaVideo (ReferenceMediaVideo.kt:23)");
            }
            C13902y.q(str, str2, C5074e.b(dVar, C15854t.d0(str, "4x5", false, 2, (Object) null) ? 0.8f : 0.75f, false, 2, (Object) null), (C5437c) null, k10, i12 & 126, 8);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new z(str, str2, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, String str2, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(str, str2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
