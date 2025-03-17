package vt;

import It.v;
import O0.L0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import sB.C15035a;
import tB.C15062c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LIt/v;", "productWithListInteraction", "LO0/L0;", "snackbarHostState", "Lkotlin/Function0;", "LXH/N;", "onConsumed", "Lkotlin/Function1;", "", "onOpenListClicked", "b", "(LIt/v;LO0/L0;LnI/a;LnI/l;LU0/m;I)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class V {
    public static final void b(v vVar, L0 l02, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C15035a aVar2;
        C17542s.j(l02, "snackbarHostState");
        C17542s.j(aVar, "onConsumed");
        C17542s.j(lVar, "onOpenListClicked");
        C4889m k10 = mVar.k(2041113909);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(vVar) : k10.F(vVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(l02) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(lVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2041113909, i11, -1, "com.ingka.ikea.instore.impl.composables.storeselected.ProductWithListInteractionContent (ProductWithListInteractionContent.kt:18)");
            }
            if (vVar != null) {
                if (vVar instanceof v.a) {
                    v.a aVar3 = (v.a) vVar;
                    aVar2 = new C15035a(C15035a.C3239a.ADD, aVar3.a(), aVar3.b(), aVar3.c());
                } else if (vVar instanceof v.b) {
                    v.b bVar = (v.b) vVar;
                    aVar2 = new C15035a(C15035a.C3239a.REMOVE, bVar.a(), bVar.b(), bVar.c());
                } else {
                    throw new t();
                }
                C15062c.c(l02, aVar2, lVar, aVar, false, k10, ((i11 >> 3) & 910) | ((i11 << 3) & 7168), 16);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new U(vVar, l02, aVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(v vVar, L0 l02, C17631a aVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        b(vVar, l02, aVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
