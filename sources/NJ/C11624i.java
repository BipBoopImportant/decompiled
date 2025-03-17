package nj;

import Ez.f;
import J1.j;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import r0.m;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nj.i  reason: case insensitive filesystem */
public final class C11624i {
    public static final void b(d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(aVar2, "onClick");
        C4889m k10 = mVar.k(-612608050);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i14 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            d.a aVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-612608050, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.GotItButton (GotItButton.kt:19)");
            }
            mVar2 = k10;
            L.b(j.b(f.f109674N, k10, 0), J.h(D.m(aVar3, 0.0f, C18029u.f147649a.a(), 0.0f, 0.0f, 13, (Object) null), 0.0f, 1, (Object) null), false, N.Primary, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i12 << 24) & 1879048192) | 3072, 500);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar3;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11623h(dVar2, aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
