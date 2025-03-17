package bL;

import U0.C4889m;
import U0.C4895p;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/k0;", "viewModelStoreOwner", "Ll3/a;", "a", "(Landroidx/lifecycle/k0;LU0/m;I)Ll3/a;", "koin-androidx-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: bL.a  reason: case insensitive filesystem */
public final class C17057a {
    public static final a a(k0 k0Var, C4889m mVar, int i10) {
        C17542s.j(k0Var, "viewModelStoreOwner");
        mVar.C(19932612);
        if (C4895p.J()) {
            C4895p.S(19932612, i10, -1, "org.koin.androidx.compose.defaultExtras (ViewModelInternals.kt:41)");
        }
        a defaultViewModelCreationExtras = k0Var instanceof C5212o ? ((C5212o) k0Var).getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return defaultViewModelCreationExtras;
    }
}
