package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.oppwa.mobile.connect.R;

public final class OppwaUiComponentContainerFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121660a;
    public final FragmentContainerView uiComponentContainer;

    private OppwaUiComponentContainerFragmentBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.f121660a = constraintLayout;
        this.uiComponentContainer = fragmentContainerView;
    }

    public static OppwaUiComponentContainerFragmentBinding bind(View view) {
        int i10 = R.id.ui_component_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i10);
        if (fragmentContainerView != null) {
            return new OppwaUiComponentContainerFragmentBinding((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppwaUiComponentContainerFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaUiComponentContainerFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_ui_component_container_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121660a;
    }
}
