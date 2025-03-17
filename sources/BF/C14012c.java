package bF;

import A4.b;
import XH.C16807N;
import YH.X;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.disclaimer.AppUpdateDisclaimerFragment;
import com.sugarcube.app.base.ui.disclaimer.DeviceBlacklistDisclaimerFragment;
import com.sugarcube.app.base.ui.disclaimer.UnavailableDisclaimerFragment;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;
import com.sugarcube.app.base.ui.gallery.GalleryDetailFragment;
import com.sugarcube.app.base.ui.gallery.GalleryHomeFragment;
import com.sugarcube.app.base.ui.gallery.GalleryMainBottomSheet;
import com.sugarcube.app.base.ui.gallery.GalleryOverflowSheet;
import com.sugarcube.app.base.ui.gallery.landing.GalleryLandingFragment2;
import com.sugarcube.app.base.ui.interstitial.DesignOptionsFragment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;
import uI.C18055d;
import uI.C18068q;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0003\u001a'\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lx4/y;", "LXH/N;", "c", "(Lx4/y;)V", "a", "l", "k", "h", "f", "e", "i", "b", "j", "Lkotlin/Function1;", "addDestinations", "g", "(Lx4/y;LnI/l;)V", "d", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bF.c  reason: case insensitive filesystem */
public final class C14012c {
    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.a.class), X.j(), P.b(DeviceBlacklistDisclaimerFragment.class)));
    }

    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.DesignOptions.class), X.j(), P.b(DesignOptionsFragment.class)));
    }

    public static final void c(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new A4.c((b) yVar.l().d(b.class), P.b(Kreativ.b.class), X.j(), P.b(FeedbackBottomSheet.class)));
    }

    public static final void d(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), (Object) new Kreativ.Gallery.Home((String) null, 1, (DefaultConstructorMarker) null), (C18055d<?>) P.b(Kreativ.Gallery.class), (Map<C18068q, F<?>>) X.j());
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void e(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.Gallery.Detail.class), X.j(), P.b(GalleryDetailFragment.class)));
    }

    public static final void f(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.Gallery.Home.class), X.j(), P.b(GalleryHomeFragment.class)));
    }

    public static final void g(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), (Object) Kreativ.Gallery.INSTANCE, (C18055d<?>) P.b(Kreativ.class), (Map<C18068q, F<?>>) X.j());
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void h(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.c.class), X.j(), P.b(GalleryLandingFragment2.class)));
    }

    public static final void i(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new A4.c((b) yVar.l().d(b.class), P.b(Kreativ.Gallery.OverflowSheet.class), X.j(), P.b(GalleryOverflowSheet.class)));
    }

    public static final void j(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new A4.c((b) yVar.l().d(b.class), P.b(Kreativ.Gallery.a.class), X.j(), P.b(GalleryMainBottomSheet.class)));
    }

    public static final void k(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.d.class), X.j(), P.b(UnavailableDisclaimerFragment.class)));
    }

    public static final void l(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.e.class), X.j(), P.b(AppUpdateDisclaimerFragment.class)));
    }
}
