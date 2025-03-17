package com.sugarcube.app.base.ui.hybrid;

import QE.M;
import XH.C16807N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.fragment.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sugarcube.app.base.navigation.Kreativ;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/HybridStepFragment;", "Lcom/sugarcube/app/base/ui/hybrid/HybridFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridStepFragment extends Hilt_HybridStepFragment {
    /* access modifiers changed from: private */
    public static final C16807N D0(HybridStepFragment hybridStepFragment) {
        E0 u02 = hybridStepFragment.u0();
        u02.w1().b().captureStepExit(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void E0(HybridStepFragment hybridStepFragment, View view) {
        E0 u02 = hybridStepFragment.u0();
        u02.w1().b().captureStepEnd(u02.y1(), u02.r1(), true, u02.e1(), u02.d1());
        C8951o.f0(a.a(hybridStepFragment), Kreativ.Capture.Hybrid.a.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        M c10 = M.c(layoutInflater, viewGroup, false);
        w0(true);
        E0 u02 = u0();
        u02.c2(true);
        u02.w1().b().captureStepStart(u02.y1(), u02.r1(), u02.e1(), u02.d1());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114406b;
        C17542s.i(floatingActionButton, "cancelButton");
        x0(b10, floatingActionButton, new C14268k0(this));
        c10.f114409e.setOnClickListener(new C14270l0(this));
        u0().X1("STEP");
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }
}
