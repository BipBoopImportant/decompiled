package com.sugarcube.app.base.ui.ultrawide;

import JF.r;
import YE.C13868b;
import YE.e;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5191t;
import com.sugarcube.app.base.capture.a;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.compose.tutorial.data.TutorialStepEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideRoomSelectedFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideRoomSelectedFragment extends Hilt_UltrawideRoomSelectedFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setContent(C14288b.f125589a.a());
        return composeView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        I0 x02 = x0();
        x02.u1().b().captureSelectRoomStart(x02.x1(), x02.p1(), x02.q1(), a.Companion.a(x02.a1()).b(), x02.Z0());
        try {
            if (getActivity() != null) {
                C5191t activity = getActivity();
                Object systemService = activity != null ? activity.getSystemService("camera") : null;
                C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                r.h((CameraManager) systemService, x0().u1());
            }
        } catch (Exception e10) {
            C13868b bVar = C13868b.f118106a;
            bVar.b("trackCameraCharacteristics " + e10, e.Capture);
        }
        x0().X1(true);
        C8951o.f0(androidx.navigation.fragment.a.a(this), !x0().s1() ? new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_GET_READY_1) : new Kreativ.Capture.TutorialStep(TutorialStepEnum.UW_AR_GET_READY_1), (C) null, (I.a) null, 6, (Object) null);
    }
}
