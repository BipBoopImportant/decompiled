package vk;

import O0.L0;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import pk.s;
import sB.C15035a;
import tB.C15062c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpk/s$b;", "addRemoveItemResult", "LO0/L0;", "snackbarHostState", "Lkotlin/Function0;", "LXH/N;", "onConsumed", "b", "(Lpk/s$b;LO0/L0;LnI/a;LU0/m;I)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vk.z  reason: case insensitive filesystem */
public final class C12184z {
    public static final void b(s.b bVar, L0 l02, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C15035a aVar2;
        C17542s.j(l02, "snackbarHostState");
        C17542s.j(aVar, "onConsumed");
        C4889m k10 = mVar.k(1209497597);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(bVar) : k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(l02) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1209497597, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.HandleItemAddedOrRemovedToShoppingList (HandleItemAddedOrRemovedToShoppingList.kt:17)");
            }
            if (bVar != null) {
                if (bVar instanceof s.b.a) {
                    s.b.a aVar3 = (s.b.a) bVar;
                    aVar2 = new C15035a(C15035a.C3239a.ADD, aVar3.a(), aVar3.b(), aVar3.c());
                } else if (bVar instanceof s.b.C2377b) {
                    s.b.C2377b bVar2 = (s.b.C2377b) bVar;
                    aVar2 = new C15035a(C15035a.C3239a.REMOVE, bVar2.a(), bVar2.b(), bVar2.c());
                } else {
                    throw new t();
                }
                C15062c.c(l02, aVar2, (C17642l<? super String, C16807N>) null, aVar, false, k10, ((i11 >> 3) & 14) | 24960 | ((i11 << 3) & 7168), 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12182y(bVar, l02, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(s.b bVar, L0 l02, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(bVar, l02, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
