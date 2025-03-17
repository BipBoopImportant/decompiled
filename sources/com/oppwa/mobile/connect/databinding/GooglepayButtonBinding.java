package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;

public final class GooglepayButtonBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121604a;

    private GooglepayButtonBinding(RelativeLayout relativeLayout) {
        this.f121604a = relativeLayout;
    }

    public static GooglepayButtonBinding bind(View view) {
        if (view != null) {
            return new GooglepayButtonBinding((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    public static GooglepayButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static GooglepayButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.googlepay_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121604a;
    }
}
