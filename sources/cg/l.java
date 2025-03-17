package CG;

import BG.m;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;
import m3.a;
import m3.c;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "itemId", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "Lkotlin/Function0;", "onExpandClicked", "b", "(ILnI/l;LnI/a;LU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {
    public static final void b(int i10, C17642l<? super CachedCatalogItem, C16807N> lVar, C17631a<C16807N> aVar, C4889m mVar, int i11) {
        int i12;
        C17542s.j(lVar, "onItemSelected");
        C17542s.j(aVar, "onExpandClicked");
        C4889m k10 = mVar.k(-420896529);
        if ((i11 & 6) == 0) {
            i12 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= k10.F(aVar) ? 256 : 128;
        }
        int i13 = i12;
        if ((i13 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-420896529, i13, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.goeswith.GoesWellWithStripe (GoesWellWithStripe.kt:24)");
            }
            k10.C(1890788296);
            k0 a10 = a.f26247a.a(k10, a.f26249c);
            if (a10 != null) {
                i0.c a11 = f3.a.a(a10, k10, 0);
                k10.C(1729797275);
                f0 b10 = c.b(C15487b.class, a10, (String) null, a11, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, k10, 36936, 0);
                k10.U();
                k10.U();
                m.g((C15487b) b10, i10, lVar, aVar, k10, (i13 << 3) & 8176);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new k(i10, lVar, aVar, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(int i10, C17642l lVar, C17631a aVar, int i11, C4889m mVar, int i12) {
        b(i10, lVar, aVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }
}
