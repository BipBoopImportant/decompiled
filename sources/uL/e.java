package ul;

import E4.a;
import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t0.C5934A;
import t0.C5935B;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "LE4/a;", "Lt0/A;", "a", "(LE4/a;LU0/m;I)Lt0/A;", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final <T> C5934A a(a<T> aVar, C4889m mVar, int i10) {
        C5934A a10;
        C17542s.j(aVar, "<this>");
        mVar.W(2002655936);
        if (C4895p.J()) {
            C4895p.S(2002655936, i10, -1, "com.ingka.ikea.app.uicomposables.extension.rememberLazyListStatePagingWorkaround (LazyPagingItemsExtensions.kt:16)");
        }
        if (aVar.g() == 0) {
            mVar.W(-896040187);
            mVar.W(-860188515);
            boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(aVar)) || (i10 & 6) == 4;
            Object D10 = mVar.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C5934A(0, 0);
                mVar.u(D10);
            }
            a10 = (C5934A) D10;
            mVar.P();
            mVar.P();
        } else {
            mVar.W(-860185010);
            a10 = C5935B.c(0, 0, mVar, 0, 3);
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a10;
    }
}
