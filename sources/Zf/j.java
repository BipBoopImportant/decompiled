package Zf;

import A4.b;
import A4.c;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import com.ingka.coworker.discount.CoWorkerDiscountReadMoreDialog;
import com.ingka.ikea.app.cart.CartAvailabilityBottomSheet;
import com.ingka.ikea.app.cart.CartFragment;
import com.ingka.ikea.app.cart.UnavailabilityItemActionsBottomSheet;
import com.ingka.ikea.app.cart.availability.UnavailableItemsFragment;
import com.ingka.ikea.app.cart.discount.DiscountBottomSheet;
import com.ingka.ikea.app.cart.impl.assembly.AssemblyDetailsBottomSheet;
import com.ingka.ikea.app.cart.impl.presentation.fragment.ReplacementRecommendationsFragment;
import com.ingka.ikea.app.cart.impl.presentation.fragment.YouMayAlsoLikeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0007\u001a\u0011\u0010\r\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0007\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u0011\u0010\u000f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "m", "(Lx4/y;LnI/l;)V", "y", "(Lx4/y;)V", "w", "i", "l", "z", "x", "q", "n", "j", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {
    public static final void i(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((b) yVar.l().d(b.class), "cart/assemblyDetails", P.b(AssemblyDetailsBottomSheet.class)));
    }

    public static final void j(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "cart/cart?view={view}&autoNavigate={autoNavigate}", P.b(CartFragment.class));
        cVar.d("ikea://navigation/cart/cart?view={view}&autoNavigate={autoNavigate}");
        cVar.a("autoNavigate", new g());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57439n);
        jVar.b(Boolean.TRUE);
        return C16807N.f139792a;
    }

    public static final void l(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "cart/availability", P.b(CartAvailabilityBottomSheet.class));
        cVar.d("ikea://navigation/cart/availability");
        yVar.k(cVar);
    }

    public static final void m(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "cart/cart?view={view}&autoNavigate={autoNavigate}", "cart");
        j(yVar2);
        n(yVar2);
        l(yVar2);
        w(yVar2);
        y(yVar2);
        i(yVar2);
        z(yVar2);
        x(yVar2);
        q(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void n(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "cart/cartItemAvailability?menuType={menuType}&itemNo={itemNo}", P.b(UnavailabilityItemActionsBottomSheet.class));
        cVar.d("ikea://navigation/cart/cartItemAvailability?menuType={menuType}&itemNo={itemNo}");
        cVar.a("menuType", new h());
        cVar.a("itemNo", new i());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    public static final void q(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), p.f65244a.a(), P.b(CoWorkerDiscountReadMoreDialog.class));
        cVar.d(o.f65242a.a());
        cVar.a("readMoreBadge", new b());
        cVar.a("readMoreTitle", new c());
        cVar.a("readMoreDescription", new d());
        cVar.a("readMoreImageUrl", new e());
        cVar.a("readMoreImageContentDescription", new f());
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        jVar.c(false);
        return C16807N.f139792a;
    }

    public static final void w(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((b) yVar.l().d(b.class), "cart/discount", P.b(DiscountBottomSheet.class));
        cVar.d("ikea://navigation/cart/discount");
        yVar.k(cVar);
    }

    public static final void x(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "cart/cartItemReplacementRecommendations?itemNo={itemNo}", P.b(ReplacementRecommendationsFragment.class));
        cVar.d("ikea://navigation/cart/cartItemReplacementRecommendations?itemNo={itemNo}");
        yVar.k(cVar);
    }

    public static final void y(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "cart/unavailableItems", P.b(UnavailableItemsFragment.class));
        cVar.d("ikea://navigation/cart/unavailableItems");
        yVar.k(cVar);
    }

    public static final void z(y yVar) {
        C17542s.j(yVar, "<this>");
        androidx.navigation.fragment.c cVar = new androidx.navigation.fragment.c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "cart/cartItemAvailability?itemNo={itemNo}", P.b(YouMayAlsoLikeFragment.class));
        cVar.d("ikea://navigation/cart/cartItemAvailability?itemNo={itemNo}");
        yVar.k(cVar);
    }
}
