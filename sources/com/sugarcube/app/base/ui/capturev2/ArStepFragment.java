package com.sugarcube.app.base.ui.capturev2;

import QE.C13437n;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import hF.C14540b;
import hF.C14541c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0014X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ArStepFragment;", "Lcom/sugarcube/app/base/ui/capturev2/BaseFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LhF/b;", "M", "LhF/b;", "q0", "()LhF/b;", "trackEnum", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ArStepFragment extends Hilt_ArStepFragment {

    /* renamed from: M  reason: collision with root package name */
    private final C14540b f123357M = C14540b.Step;

    /* access modifiers changed from: private */
    public static final void F0(ArStepFragment arStepFragment, View view) {
        arStepFragment.n0().N1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13437n c10 = C13437n.c(layoutInflater, viewGroup, false);
        t0(true);
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        FloatingActionButton floatingActionButton = c10.f114659b;
        C17542s.i(floatingActionButton, "cancelButton");
        u0(b10, floatingActionButton);
        c10.f114663f.setOnClickListener(new C14220m(this));
        n0().a2(C14541c.STEP);
        ConstraintLayout b11 = c10.getRoot();
        C17542s.i(b11, "getRoot(...)");
        return b11;
    }

    /* access modifiers changed from: protected */
    public C14540b q0() {
        return this.f123357M;
    }
}
