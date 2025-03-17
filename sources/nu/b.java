package Nu;

import A4.c;
import XH.C16807N;
import com.ingka.ikea.instorepurchasestatus.impl.presentation.ui.InStorePurchaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "b", "(Lx4/y;)V", "instorepurchasestatus-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((A4.b) yVar.l().d(A4.b.class), "inStorePurchasesStatus/status?orderId={orderId}", P.b(InStorePurchaseFragment.class));
        cVar.d("ikea://navigation/inStorePurchasesStatus/status?orderId={orderId}");
        cVar.a("orderId", new a());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }
}
