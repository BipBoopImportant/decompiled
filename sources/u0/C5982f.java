package u0;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import v0.C6147m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu0/I;", "state", "Lv0/m;", "a", "(Lu0/I;LU0/m;I)Lv0/m;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.f  reason: case insensitive filesystem */
public final class C5982f {
    public static final C6147m a(C5974I i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(2004349821, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        boolean z10 = (((i11 & 14) ^ 6) > 4 && mVar.V(i10)) || (i11 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new C5983g(i10);
            mVar.u(D10);
        }
        C5983g gVar = (C5983g) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return gVar;
    }
}
