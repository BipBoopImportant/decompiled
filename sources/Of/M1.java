package Of;

import IC.C13023e;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
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
import nI.p;
import r0.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LIC/e;", "text", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(LIC/e;LnI/a;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class M1 {
    public static final void b(C13023e eVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C13023e eVar2 = eVar;
        C17631a<C16807N> aVar2 = aVar;
        C17542s.j(eVar2, "text");
        C17542s.j(aVar2, "onClick");
        C4889m k10 = mVar.k(2092011089);
        if ((i10 & 6) == 0) {
            i11 = i10 | ((i10 & 8) == 0 ? k10.V(eVar2) : k10.F(eVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2092011089, i12, -1, "com.ingka.ikea.app.cart.compose.PostalCodeEntry (PostalCodeEntry.kt:21)");
            }
            mVar2 = k10;
            C13585f1.c(eVar2.a(k10, C13023e.f110931a | (i12 & 14)), aVar, C5116k1.a(d.f18749a, "PostalCodeEntryTestTags_CONTENT"), (String) null, (C13573c1) null, C13569b1.d.f116148b, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, (C13589g1) null, 0.0f, false, false, (m) null, mVar2, (i12 & 112) | 384 | (C13569b1.d.f116149c << 15), 0, 8152);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new L1(eVar2, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C13023e eVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(eVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
