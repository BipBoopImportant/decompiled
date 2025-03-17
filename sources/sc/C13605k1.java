package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import wK.X4;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LSC/i1;", "variant", "LSC/h1;", "size", "LXH/N;", "b", "(Landroidx/compose/ui/d;LSC/i1;LSC/h1;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.k1  reason: case insensitive filesystem */
public final class C13605k1 {
    public static final void b(d dVar, C13597i1 i1Var, C13593h1 h1Var, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-408412561);
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
            i12 |= k10.V(i1Var) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.V(h1Var) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (i14 != 0) {
                i1Var = C13597i1.Emphasised;
            }
            if (i15 != 0) {
                h1Var = C13593h1.Medium;
            }
            if (C4895p.J()) {
                C4895p.S(-408412561, i12, -1, "com.ingka.ikea.ui.skapa.SkapaLoadingBall (SkapaLoading.kt:23)");
            }
            X4.q(dVar, i1Var.b(), h1Var.b(), k10, i12 & 14, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        C13597i1 i1Var2 = i1Var;
        C13593h1 h1Var2 = h1Var;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13601j1(dVar2, i1Var2, h1Var2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, C13597i1 i1Var, C13593h1 h1Var, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, i1Var, h1Var, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
