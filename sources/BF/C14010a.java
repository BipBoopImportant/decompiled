package bF;

import XH.C16807N;
import YH.X;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.capture.CaptureLandingFragment;
import com.sugarcube.app.base.ui.capture.tutorial.TutorialPageFragment;
import com.sugarcube.app.base.ui.capturev2.CaptureActivity;
import com.sugarcube.app.base.ui.hybrid.HybridARPanoFragment;
import com.sugarcube.app.base.ui.hybrid.HybridARScanFragment;
import com.sugarcube.app.base.ui.hybrid.HybridActivity;
import com.sugarcube.app.base.ui.hybrid.HybridAlignFragment;
import com.sugarcube.app.base.ui.hybrid.HybridArInitFragment;
import com.sugarcube.app.base.ui.hybrid.HybridBeginFragment;
import com.sugarcube.app.base.ui.hybrid.HybridDoneFragment;
import com.sugarcube.app.base.ui.hybrid.HybridEndFragment;
import com.sugarcube.app.base.ui.hybrid.HybridPreviewFragment;
import com.sugarcube.app.base.ui.hybrid.HybridStepFragment;
import com.sugarcube.app.base.ui.selection.ChooseRoomFragment;
import com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideARScanFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideActivity;
import com.sugarcube.app.base.ui.ultrawide.UltrawideAlignFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideArInitFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideCamPanoFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideDoneFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideEndFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawidePreviewFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideRoomFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideRoomSelectedFragment;
import com.sugarcube.app.base.ui.ultrawide.UltrawideStepFragment;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import nI.C17642l;
import uI.C18055d;
import uI.C18068q;
import x4.C8937a;
import x4.C8938b;
import x4.F;
import x4.y;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a'\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0002*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\n\u0010\u0005\u001a\u0011\u0010\u000b\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0011\u0010\f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0007\u001a\u0011\u0010\r\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0007\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0007\u001a\u0011\u0010\u000f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0007\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lx4/y;", "Lkotlin/Function1;", "LXH/N;", "addDestinations", "a", "(Lx4/y;LnI/l;)V", "b", "(Lx4/y;)V", "h", "g", "c", "k", "f", "d", "e", "j", "i", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bF.a  reason: case insensitive filesystem */
public final class C14010a {
    public static final void a(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), (Object) Kreativ.Capture.a.INSTANCE, (C18055d<?>) P.b(Kreativ.Capture.class), (Map<C18068q, F<?>>) X.j());
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void b(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.Capture.a.class), X.j(), P.b(CaptureLandingFragment.class)));
    }

    public static final void c(y yVar, C17642l<? super y, C16807N> lVar) {
        C17542s.j(yVar, "<this>");
        C17542s.j(lVar, "addDestinations");
        y yVar2 = new y(yVar.l(), (Object) Kreativ.Capture.c.INSTANCE, (C18055d<?>) P.b(Kreativ.Capture.e.class), (Map<C18068q, F<?>>) X.j());
        lVar.invoke(yVar2);
        yVar.k(yVar2);
    }

    public static final void d(y yVar) {
        C17542s.j(yVar, "<this>");
        C8938b bVar = new C8938b((C8937a) yVar.l().d(C8937a.class), P.b(Kreativ.Capture.V2.class), X.j());
        bVar.k(P.b(CaptureActivity.class));
        yVar.k(bVar);
    }

    public static final void e(y yVar) {
        C17542s.j(yVar, "<this>");
        i(yVar);
        Class cls = FragmentNavigator.class;
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.d.class), X.j(), P.b(HybridBeginFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.h.class), X.j(), P.b(HybridARPanoFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.i.class), X.j(), P.b(HybridPreviewFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.a.class), X.j(), P.b(HybridAlignFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.c.class), X.j(), P.b(HybridARScanFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.j.class), X.j(), P.b(HybridStepFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.g.class), X.j(), P.b(HybridEndFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.f.class), X.j(), P.b(HybridDoneFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.Hybrid.b.class), X.j(), P.b(HybridArInitFragment.class)));
    }

    public static final void f(y yVar) {
        C17542s.j(yVar, "<this>");
        C8938b bVar = new C8938b((C8937a) yVar.l().d(C8937a.class), P.b(Kreativ.Capture.Hybrid.class), X.j());
        bVar.k(P.b(HybridActivity.class));
        yVar.k(bVar);
    }

    public static final void g(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.Capture.b.class), X.j(), P.b(ScanOtherRoomTypesGuidanceFragment.class)));
    }

    public static final void h(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.Capture.c.class), X.j(), P.b(ChooseRoomFragment.class)));
    }

    public static final void i(y yVar) {
        C17542s.j(yVar, "<this>");
        yVar.k(new c((FragmentNavigator) yVar.l().d(FragmentNavigator.class), P.b(Kreativ.Capture.TutorialStep.class), X.j(), P.b(TutorialPageFragment.class)));
    }

    public static final void j(y yVar) {
        C17542s.j(yVar, "<this>");
        i(yVar);
        Class cls = FragmentNavigator.class;
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.h.class), X.j(), P.b(UltrawideRoomFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.b.class), X.j(), P.b(ScanOtherRoomTypesGuidanceFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.i.class), X.j(), P.b(UltrawideRoomSelectedFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.C3033d.class), X.j(), P.b(UltrawideCamPanoFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.g.class), X.j(), P.b(UltrawidePreviewFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.a.class), X.j(), P.b(UltrawideAlignFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.c.class), X.j(), P.b(UltrawideARScanFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.j.class), X.j(), P.b(UltrawideStepFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.f.class), X.j(), P.b(UltrawideEndFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.e.class), X.j(), P.b(UltrawideDoneFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls), P.b(Kreativ.Capture.d.b.class), X.j(), P.b(UltrawideArInitFragment.class)));
    }

    public static final void k(y yVar) {
        C17542s.j(yVar, "<this>");
        C8938b bVar = new C8938b((C8937a) yVar.l().d(C8937a.class), P.b(Kreativ.Capture.d.class), X.j());
        bVar.k(P.b(UltrawideActivity.class));
        yVar.k(bVar);
    }
}
