package Dy;

import By.C12674m;
import Dy.C0;
import J1.j;
import SC.G0;
import SC.H0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import r0.m;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LDy/C0;", "state", "Lkotlin/Function0;", "LXH/N;", "onClick", "c", "(LDy/C0;LnI/a;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class F0 {
    public static final void c(C0 c02, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C0 c03 = c02;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(c03, "state");
        C17542s.j(aVar2, "onClick");
        C4889m k10 = mVar.k(-394294872);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(c03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-394294872, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.ScannerIconButton (ScannerIconButton.kt:25)");
            }
            if (!(c03 instanceof C0.b)) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new D0(c03, aVar2, i12));
                    return;
                }
                return;
            }
            SC.F0.b(C18146a.f148610qa, j.b(C12674m.f108269b, k10, 0), C5116k1.a(d.f18749a, "ScannerIconButton"), false, (H0) null, (G0) null, (m) null, false, aVar, k10, ((i11 << 21) & 234881024) | 384, 248);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new E0(c03, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C0 c02, C17631a aVar, int i10, C4889m mVar, int i11) {
        c(c02, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C0 c02, C17631a aVar, int i10, C4889m mVar, int i11) {
        c(c02, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
