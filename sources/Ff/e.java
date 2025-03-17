package ff;

import A4.b;
import XH.C16807N;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.ingka.ikea.app.auth.datacontrols.DataControlsLearnMoreFragment;
import com.ingka.ikea.app.auth.datacontrols.DataPreferenceFragment;
import com.ingka.ikea.app.auth.help.HelpFragment;
import com.ingka.ikea.app.auth.legal.AboutFragment;
import com.ingka.ikea.app.auth.login.LoginSignupPromotionBottomSheet;
import com.ingka.ikea.app.auth.opensource.OpenSourceDisclaimerFragment;
import com.ingka.ikea.app.auth.policies.PoliciesFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import x4.C8946j;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0007\u001a\u0011\u0010\r\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "j", "(Lx4/y;LnI/l;)V", "b", "(Lx4/y;)V", "i", "e", "c", "d", "f", "g", "profile-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "about", P.b(AboutFragment.class));
        cVar.d("ikea://navigation/about");
        yVar.k(cVar);
    }

    public static final void c(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "data_preferences", P.b(DataPreferenceFragment.class));
        cVar.d("ikea://navigation/data_preferences");
        yVar.k(cVar);
    }

    public static final void d(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "open_source_disclaimer", P.b(OpenSourceDisclaimerFragment.class)));
    }

    public static final void e(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "help", P.b(HelpFragment.class));
        cVar.d("ikea://navigation/help");
        yVar.k(cVar);
    }

    public static final void f(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new A4.c((b) yVar.l().d(b.class), "data_controls_learn_more", P.b(DataControlsLearnMoreFragment.class)));
    }

    public static final void g(y yVar) {
        C17542s.j(yVar, "<this>");
        A4.c cVar = new A4.c((b) yVar.l().d(b.class), "login_sign_up_promotion?promotion_mode={promotion_mode}", P.b(LoginSignupPromotionBottomSheet.class));
        cVar.a("promotion_mode", new d());
        cVar.d("ikea://navigation/login_sign_up_promotion?promotion_mode={promotion_mode}");
        yVar.k(cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C8946j jVar) {
        C17542s.j(jVar, "$this$argument");
        jVar.d(F.f57442q);
        return C16807N.f139792a;
    }

    public static final void i(y yVar) {
        C17542s.j(yVar, "<this>");
        c cVar = new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), "policies", P.b(PoliciesFragment.class));
        cVar.d("ikea://navigation/policies");
        yVar.k(cVar);
    }

    public static final void j(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), "help", "profile");
        e(yVar2);
        b(yVar2);
        i(yVar2);
        c(yVar2);
        d(yVar2);
        f(yVar2);
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }
}
