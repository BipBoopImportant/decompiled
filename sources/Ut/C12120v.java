package ut;

import J1.j;
import Oo.b;
import SC.C13651w0;
import SC.W1;
import SC.Z1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.compose.ui.window.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import st.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onDismiss", "onLeaveInstoreMode", "c", "(LnI/a;LnI/a;LU0/m;I)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ut.v  reason: case insensitive filesystem */
public final class C12120v {
    public static final void c(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "onDismiss");
        C17542s.j(aVar2, "onLeaveInstoreMode");
        C4889m k10 = mVar.k(974797771);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(974797771, i11, -1, "com.ingka.ikea.instore.impl.composables.DisableStoreModePrompt (DisableStoreModePrompt.kt:22)");
            }
            String b10 = j.b(c.f102763e, k10, 0);
            String b11 = j.b(c.f102757c, k10, 0);
            k10.W(1494166567);
            boolean z10 = true;
            boolean z11 = (i11 & 112) == 32;
            if ((i11 & 14) != 4) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object D10 = k10.D();
            if (z12 || D10 == C4889m.f14007a.a()) {
                D10 = new C12118t(aVar2, aVar);
                k10.u(D10);
            }
            k10.P();
            W1 w12 = new W1(b11, (C17631a) D10);
            W1 w13 = new W1(j.b(b.f84518U0, k10, 0), aVar);
            C13651w0 w0Var = C13651w0.Stacked;
            d a10 = C5116k1.a(d.f18749a, "DisableStoreModePrompt");
            p<C4889m, Integer, C16807N> a11 = C12098f.f104264a.a();
            int i12 = W1.f116045c;
            Z1.c(b10, w12, w13, aVar, a10, w0Var, (h) null, a11, k10, (i12 << 6) | (i12 << 3) | 12804096 | ((i11 << 9) & 7168), 64);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12119u(aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17631a aVar, C17631a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        c(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
