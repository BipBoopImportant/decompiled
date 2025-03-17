package oq;

import A4.b;
import A4.c;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import com.ingka.ikea.energylabel.impl.EnergyLabelDialog;
import com.ingka.ikea.energylabel.impl.TechnicalInfoFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Lx4/y;", "LXH/N;", "d", "(Lx4/y;)V", "g", "energylabel-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void d(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "energy/label?productNo={productNo}&viewFilter={viewFilter}", P.b(EnergyLabelDialog.class));
        cVar.a("productNo", new C11706b());
        cVar.a("viewFilter", new C11707c());
        cVar.d("ikea://navigation/energy/label?productNo={productNo}&viewFilter={viewFilter}");
        cVar.d("ikea://pip/productfiche/?productNo={productNo}&viewFilter={viewFilter}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        jVar.b((Object) null);
        return C16807N.f139792a;
    }

    public static final void g(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "energy/information?productNo={productNo}", P.b(TechnicalInfoFragment.class));
        cVar.a("productNo", new C11705a());
        cVar.d("ikea://navigation/energy/information?productNo={productNo}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }
}
