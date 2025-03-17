package Bn;

import A4.b;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.browseandsearch.plp.impl.ui.AvailabilityBottomSheetFragment;
import com.ingka.ikea.browseandsearch.plp.impl.ui.PlpFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "r", "(Lx4/y;LnI/l;)V", "i", "(Lx4/y;)V", "s", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final void i(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "browse/plp/plp?id={id}&useIdAsGroupParameter={useIdAsGroupParameter}&fallbackTitle={fallbackTitle}&type={type}&component={component}&preAppliedFilters={preAppliedFilters}&includedProductNos={includedProductNos}&prioritiser={prioritiser}", P.b(PlpFragment.class));
        cVar.a("id", new b());
        cVar.a("fallbackTitle", new c());
        cVar.a("type", new d());
        cVar.a("component", new e());
        cVar.a("preAppliedFilters", new f());
        cVar.a("includedProductNos", new g());
        cVar.a("prioritiser", new h());
        cVar.a("useIdAsGroupParameter", new i());
        cVar.d("ikea://navigation/browse/plp/plp?id={id}&useIdAsGroupParameter={useIdAsGroupParameter}&fallbackTitle={fallbackTitle}&type={type}&component={component}&preAppliedFilters={preAppliedFilters}&includedProductNos={includedProductNos}&prioritiser={prioritiser}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        jVar.b(Boolean.FALSE);
        return C16807N.f139792a;
    }

    public static final void r(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "browse/plp/plp?id={id}&useIdAsGroupParameter={useIdAsGroupParameter}&fallbackTitle={fallbackTitle}&type={type}&component={component}&preAppliedFilters={preAppliedFilters}&includedProductNos={includedProductNos}&prioritiser={prioritiser}", "browse/plp");
        i(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void s(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((b) yVar.l().d(b.class), "browseAndSearch/availability", P.b(AvailabilityBottomSheetFragment.class));
        cVar.d("ikea://navigation/browseAndSearch/availability");
        yVar.k(cVar);
    }
}
