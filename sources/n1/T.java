package N1;

import S1.C4820m;
import U0.C4889m;
import U0.C4895p;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import c2.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002XD¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "cacheSize", "LN1/S;", "a", "(ILU0/m;II)LN1/S;", "I", "DefaultCacheSize", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class T {

    /* renamed from: a  reason: collision with root package name */
    private static final int f9417a = 8;

    public static final S a(int i10, C4889m mVar, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = f9417a;
        }
        if (C4895p.J()) {
            C4895p.S(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        C4820m.b bVar = (C4820m.b) mVar.Q(C5100f0.g());
        d dVar = (d) mVar.Q(C5100f0.e());
        t tVar = (t) mVar.Q(C5100f0.k());
        boolean V10 = mVar.V(bVar) | mVar.V(dVar) | mVar.V(tVar);
        if ((((i11 & 14) ^ 6) <= 4 || !mVar.d(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = V10 | z10;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new S(bVar, dVar, tVar, i10);
            mVar.u(D10);
        }
        S s10 = (S) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return s10;
    }
}
