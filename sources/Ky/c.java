package Ky;

import A4.b;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import com.ingka.ikea.scanandgo.cart.impl.ScanAndGoCartFragment;
import com.ingka.ikea.scanandgo.cart.impl.dialog.CombinedCartOnboardingDialog;
import com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.FullServeInfoDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lx4/y;", "LXH/N;", "d", "(Lx4/y;)V", "b", "c", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((b) yVar.l().d(b.class), "cart/scanandgo/onboarding", P.b(CombinedCartOnboardingDialog.class));
        cVar.d("ikea://navigation/cart/scanandgo/onboarding");
        yVar.k(cVar);
    }

    public static final void c(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((b) yVar.l().d(b.class), "cart/scanandgo/fullServe/info", P.b(FullServeInfoDialog.class));
        cVar.d("ikea://navigation/cart/scanandgo/fullServe/info");
        yVar.k(cVar);
    }

    public static final void d(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "cart/scanandgo/cart?shownAsCombinedCart={shownAsCombinedCart}", P.b(ScanAndGoCartFragment.class));
        cVar.d("ikea://navigation/cart/scanandgo/cart?shownAsCombinedCart={shownAsCombinedCart}");
        cVar.a("shownAsCombinedCart", new b());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        jVar.b(Boolean.FALSE);
        return C16807N.f139792a;
    }
}
