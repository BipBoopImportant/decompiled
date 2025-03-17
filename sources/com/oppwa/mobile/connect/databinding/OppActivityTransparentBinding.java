package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;

public final class OppActivityTransparentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121606a;

    private OppActivityTransparentBinding(ConstraintLayout constraintLayout) {
        this.f121606a = constraintLayout;
    }

    public static OppActivityTransparentBinding bind(View view) {
        if (view != null) {
            return new OppActivityTransparentBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static OppActivityTransparentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppActivityTransparentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_activity_transparent, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121606a;
    }
}
