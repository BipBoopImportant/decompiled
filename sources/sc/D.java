package SC;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wK.C18240I;
import wK.C18244M;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LSC/F;", "variant", "LSC/B;", "color", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LSC/F;LSC/B;Landroidx/compose/ui/d;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class D {
    public static final void b(F f10, B b10, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(f10, "variant");
        C17542s.j(b10, "color");
        C4889m k10 = mVar.k(-29047412);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(b10) ? 32 : 16;
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
                C4895p.S(-29047412, i12, -1, "com.ingka.ikea.ui.skapa.SkapaBadge (SkapaBadge.kt:27)");
            }
            C18240I.b(f10.a(), b10.b(), dVar, k10, C18244M.f149800b | (i12 & 896), 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C(f10, b10, dVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(F f10, B b10, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(f10, b10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
