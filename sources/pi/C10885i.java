package Pi;

import J1.j;
import Oo.b;
import SC.C13611m;
import SC.C13628q0;
import SC.L0;
import SC.M0;
import SC.R0;
import U0.C4889m;
import U0.C4895p;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onRetryClicked", "Landroidx/compose/ui/d;", "modifier", "b", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pi.i  reason: case insensitive filesystem */
public final class C10885i {
    public static final void b(C17631a<C16807N> aVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "onRetryClicked");
        C4889m k10 = mVar.k(-1206805954);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1206805954, i12, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.PaginationError (RatingsAndReviewsError.kt:19)");
            }
            R0.f(j.b(b.f84812v3, k10, 0), new M0(new L0(j.b(b.f84498S0, k10, 0), aVar), (L0) null, 2, (DefaultConstructorMarker) null), C13611m.WARNING, (C13628q0) null, dVar, (String) null, k10, (M0.f115836c << 3) | 3456 | ((i12 << 9) & 57344), 32);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10884h(aVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(aVar, dVar, mVar, U0.M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
