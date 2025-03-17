package dx;

import A4.c;
import XH.C16807N;
import com.ingka.ikea.populartimes.impl.ui.PopularTimesBottomSheetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "b", "(Lx4/y;)V", "populartimes-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((A4.b) yVar.l().d(A4.b.class), "store/populartimes?storeId={storeId}", P.b(PopularTimesBottomSheetFragment.class));
        cVar.a("storeId", new C14345a());
        cVar.d("ikea://navigation/store/populartimes?storeId={storeId}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }
}
