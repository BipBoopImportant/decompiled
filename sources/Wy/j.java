package wy;

import O0.e1;
import O0.g1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.q;
import ol.p;
import ol.u;
import ol.v;
import s0.C5842M;
import s0.C5848T;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "title", "Lkotlin/Function0;", "LXH/N;", "onNavigationClicked", "b", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "room-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final void b(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(aVar2, "onNavigationClicked");
        C4889m k10 = mVar.k(452641181);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(452641181, i11, -1, "com.ingka.ikea.room.impl.presentation.composables.RoomTopAppBar (RoomTopAppBar.kt:18)");
            }
            p.c(v.BACK, aVar, (d) null, str2 == null ? "" : str2, (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, (i11 & 112) | 6, 500);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new i(str2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
