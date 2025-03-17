package BG;

import A0.g;
import O0.C4738l;
import O0.C4740m;
import O0.C4744o;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.C5601g;
import nI.C17631a;
import r0.m;
import s0.C5834E;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onButtonClicked", "b", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: BG.d  reason: case insensitive filesystem */
public final class C15453d {
    public static final void b(d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(aVar2, "onButtonClicked");
        C4889m k10 = mVar.k(1833646510);
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
        int i16 = i12;
        if ((i16 & 19) != 18 || !k10.l()) {
            d.a aVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1833646510, i16, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.stripe.MiniCatalogExpandButton (MiniCatalogExpandButton.kt:36)");
            }
            d a10 = C5116k1.a(J.G(aVar3, (C5437c.b) null, false, 3, (Object) null), "EXPAND_BUTTON_TEST_TAG");
            C18030v vVar = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            d dVar3 = aVar3;
            mVar2 = k10;
            C4744o.a(aVar, a10, false, g.e(h.B((float) 25)), new C4738l(vVar.a(k10, i17).F0(), vVar.a(k10, i17).F0(), vVar.a(k10, i17).z0(), vVar.a(k10, i17).z0(), (DefaultConstructorMarker) null), C4740m.f11185a.c(h.B((float) 8), 0.0f, 0.0f, 0.0f, 0.0f, k10, (C4740m.f11199o << 15) | 6, 30), (C5601g) null, (C5834E) null, (m) null, C15450a.f133166a.a(), k10, ((i16 >> 3) & 14) | 805306368, 452);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C15452c(dVar2, aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
