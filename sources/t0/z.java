package t0;

import U0.C4889m;
import U0.C4895p;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt0/A;", "state", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "a", "(Lt0/A;ZLU0/m;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {
    public static final LazyLayoutSemanticState a(C5934A a10, boolean z10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(596174919, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazyListSemantics.kt:26)");
        }
        boolean z11 = false;
        boolean z12 = (((i10 & 14) ^ 6) > 4 && mVar.V(a10)) || (i10 & 6) == 4;
        if ((((i10 & 112) ^ 48) > 32 && mVar.b(z10)) || (i10 & 48) == 32) {
            z11 = true;
        }
        boolean z13 = z12 | z11;
        Object D10 = mVar.D();
        if (z13 || D10 == C4889m.f14007a.a()) {
            D10 = C5939d.a(a10, z10);
            mVar.u(D10);
        }
        LazyLayoutSemanticState lazyLayoutSemanticState = (LazyLayoutSemanticState) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return lazyLayoutSemanticState;
    }
}
