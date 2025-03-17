package bF;

import YH.X;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.c;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.capturev2.ArAlignFragment;
import com.sugarcube.app.base.ui.capturev2.ArInitFragment;
import com.sugarcube.app.base.ui.capturev2.ArPanoFragment;
import com.sugarcube.app.base.ui.capturev2.ArScanFragment;
import com.sugarcube.app.base.ui.capturev2.ArStepFragment;
import com.sugarcube.app.base.ui.capturev2.CamPanoFragment;
import com.sugarcube.app.base.ui.capturev2.CaptureLandscapeActivity;
import com.sugarcube.app.base.ui.capturev2.CapturePortraitActivity;
import com.sugarcube.app.base.ui.capturev2.EntryFragment;
import com.sugarcube.app.base.ui.capturev2.PermissionsFragment;
import com.sugarcube.app.base.ui.capturev2.PreviewFragment;
import com.sugarcube.app.base.ui.capturev2.ResultFragment;
import com.sugarcube.app.base.ui.capturev2.RoomFragment;
import com.sugarcube.app.base.ui.capturev2.RoomGuidanceFragment;
import com.sugarcube.app.base.ui.capturev2.StartFlowFragment;
import com.sugarcube.app.base.ui.capturev2.TutorialFragment;
import com.sugarcube.app.base.ui.selection.ChooseRoomFragment;
import com.sugarcube.app.base.ui.selection.ScanOtherRoomTypesGuidanceFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import x4.C8937a;
import x4.C8938b;
import x4.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/y;", "LXH/N;", "a", "(Lx4/y;)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bF.b  reason: case insensitive filesystem */
public final class C14011b {
    public static final void a(y yVar) {
        C17542s.j(yVar, "<this>");
        Class cls = C8937a.class;
        C8938b bVar = new C8938b((C8937a) yVar.l().d(cls), P.b(Kreativ.Capture.V2.Portrait.class), X.j());
        bVar.k(P.b(CapturePortraitActivity.class));
        yVar.k(bVar);
        C8938b bVar2 = new C8938b((C8937a) yVar.l().d(cls), P.b(Kreativ.Capture.V2.Landscape.class), X.j());
        bVar2.k(P.b(CaptureLandscapeActivity.class));
        yVar.k(bVar2);
        Class cls2 = FragmentNavigator.class;
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.h.class), X.j(), P.b(EntryFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.b.class), X.j(), P.b(ArInitFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.a.class), X.j(), P.b(ArAlignFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.c.class), X.j(), P.b(ArPanoFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.d.class), X.j(), P.b(ArScanFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.e.class), X.j(), P.b(ArStepFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.f.class), X.j(), P.b(CamPanoFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.i.class), X.j(), P.b(PermissionsFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.j.class), X.j(), P.b(PreviewFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.k.class), X.j(), P.b(ResultFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.l.class), X.j(), P.b(RoomFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.m.class), X.j(), P.b(RoomGuidanceFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.n.class), X.j(), P.b(StartFlowFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.V2.o.class), X.j(), P.b(TutorialFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.b.class), X.j(), P.b(ScanOtherRoomTypesGuidanceFragment.class)));
        yVar.k(new c((FragmentNavigator) yVar.l().d(cls2), P.b(Kreativ.Capture.c.class), X.j(), P.b(ChooseRoomFragment.class)));
    }
}
