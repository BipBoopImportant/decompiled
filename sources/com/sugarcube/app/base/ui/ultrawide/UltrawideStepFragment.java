package com.sugarcube.app.base.ui.ultrawide;

import QE.W;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/UltrawideStepFragment;", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UltrawideStepFragment extends Hilt_UltrawideStepFragment {
    /* access modifiers changed from: private */
    public static final C16807N E0(UltrawideStepFragment ultrawideStepFragment) {
        I0 x02 = ultrawideStepFragment.x0();
        x02.u1().b().captureStepExit(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void F0(UltrawideStepFragment ultrawideStepFragment, View view) {
        I0 x02 = ultrawideStepFragment.x0();
        x02.u1().b().captureStepEnd(x02.x1(), x02.p1(), true, x02.a1(), x02.Z0());
        C8951o.f0(a.a(ultrawideStepFragment), Kreativ.Capture.d.a.INSTANCE, (C) null, (I.a) null, 6, (Object) null);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        W c10 = W.c(layoutInflater, viewGroup, false);
        y0(true);
        I0 x02 = x0();
        x02.W1(true);
        x02.u1().b().captureStepStart(x02.x1(), x02.p1(), x02.a1(), x02.Z0());
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114478b;
        C17542s.i(floatingActionButton, "cancelButton");
        z0(b10, floatingActionButton, new r0(this));
        c10.f114480d.setOnClickListener(new s0(this));
        x0().R1("STEP");
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }
}
