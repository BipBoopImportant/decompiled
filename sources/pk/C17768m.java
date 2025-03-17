package pK;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import me.saket.telephoto.zoomable.h;
import me.saket.telephoto.zoomable.s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LpK/n;", "zoomableState", "LpK/l;", "a", "(LpK/n;LU0/m;II)LpK/l;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK.m  reason: case insensitive filesystem */
public final class C17768m {
    public static final C17767l a(C17769n nVar, C4889m mVar, int i10, int i11) {
        mVar.C(-447278043);
        boolean z10 = true;
        if ((i11 & 1) != 0) {
            nVar = s.a((C17764i) null, false, (h) null, mVar, 0, 7);
        }
        if (C4895p.J()) {
            C4895p.S(-447278043, i10, -1, "me.saket.telephoto.zoomable.rememberZoomableImageState (ZoomableImageState.kt:15)");
        }
        mVar.C(360359606);
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.V(nVar)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new C17767l(nVar);
            mVar.u(D10);
        }
        C17767l lVar = (C17767l) D10;
        mVar.U();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return lVar;
    }
}
