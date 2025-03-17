package t0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import v0.C6147m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt0/A;", "state", "", "beyondBoundsItemCount", "Lv0/m;", "a", "(Lt0/A;ILU0/m;I)Lv0/m;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final C6147m a(C5934A a10, int i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(-1877443446, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z10 = false;
        boolean z11 = (((i11 & 14) ^ 6) > 4 && mVar.V(a10)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) > 32 && mVar.d(i10)) || (i11 & 48) == 32) {
            z10 = true;
        }
        boolean z12 = z11 | z10;
        Object D10 = mVar.D();
        if (z12 || D10 == C4889m.f14007a.a()) {
            D10 = new g(a10, i10);
            mVar.u(D10);
        }
        g gVar = (g) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return gVar;
    }
}
