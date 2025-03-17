package Rq;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import c2.h;
import kotlin.Metadata;
import s0.C5844O;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006\"\u001a\u0010\f\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0016"}, d2 = {"Lc2/h;", "height", "LXH/N;", "d", "(FLU0/m;I)V", "f", "(LU0/m;I)V", "h", "a", "F", "j", "()F", "EdgePadding", "Landroidx/compose/ui/d;", "b", "Landroidx/compose/ui/d;", "k", "()Landroidx/compose/ui/d;", "EdgePaddingModifier", "c", "l", "HorizontalItemSpacing", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final float f86977a = C18029u.f147649a.d();

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.compose.ui.d f86978b = e.i(androidx.compose.ui.d.f18749a);

    /* renamed from: c  reason: collision with root package name */
    private static final float f86979c = h.B((float) 12);

    public static final void d(float f10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-427130060);
        if ((i10 & 6) == 0) {
            i11 = (k10.c(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-427130060, i11, -1, "com.ingka.ikea.familyrewards.implementation.ContentSpacer (FamilyRewardsDefaults.kt:21)");
            }
            C5844O.a(J.i(androidx.compose.ui.d.f18749a, f10), k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(f10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(float f10, int i10, C4889m mVar, int i11) {
        d(f10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void f(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(910531195);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(910531195, i10, -1, "com.ingka.ikea.familyrewards.implementation.DefaultContentSpacer (FamilyRewardsDefaults.kt:26)");
            }
            C5844O.a(J.i(androidx.compose.ui.d.f18749a, h.B((float) 24)), k10, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, C4889m mVar, int i11) {
        f(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void h(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-1725509643);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1725509643, i10, -1, "com.ingka.ikea.familyrewards.implementation.SmallContentSpacer (FamilyRewardsDefaults.kt:31)");
            }
            C5844O.a(J.i(androidx.compose.ui.d.f18749a, h.B((float) 8)), k10, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(int i10, C4889m mVar, int i11) {
        h(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final float j() {
        return f86977a;
    }

    public static final androidx.compose.ui.d k() {
        return f86978b;
    }

    public static final float l() {
        return f86979c;
    }
}
