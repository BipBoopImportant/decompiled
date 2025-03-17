package yn;

import An.s;
import J1.j;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import wn.C12289d;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LAn/s;", "uiModel", "Lkotlin/Function1;", "", "LXH/N;", "onSuggestionClicked", "c", "(LAn/s;LnI/l;LU0/m;I)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h2 {
    public static final void c(s sVar, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(sVar, "uiModel");
        C17542s.j(lVar, "onSuggestionClicked");
        C4889m k10 = mVar.k(1366750687);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(sVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1366750687, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.Suggestions (PlpSuggestions.kt:17)");
            }
            if (sVar.g().isEmpty()) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new f2(sVar, lVar, i10));
                    return;
                }
                return;
            }
            k10.W(-1543470200);
            String h10 = sVar.h();
            if (h10.length() == 0) {
                h10 = j.b(C12289d.f105897q, k10, 0);
            }
            k10.P();
            q2.b(h10, sVar.g(), lVar, (d) null, k10, (i11 << 3) & 896, 8);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new g2(sVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(s sVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        c(sVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(s sVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        c(sVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
