package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import wK.L9;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "", "loading", "LXH/N;", "b", "(Landroidx/compose/ui/d;ZLU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class H2 {
    public static final void b(d dVar, boolean z10, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-808053478);
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
            i12 |= k10.b(z10) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                z10 = true;
            }
            if (C4895p.J()) {
                C4895p.S(-808053478, i12, -1, "com.ingka.ikea.ui.skapa.SkapaSkeleton (SkapaSkeleton.kt:19)");
            }
            L9.c(dVar, z10, k10, i12 & 126, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new G2(dVar, z10, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
