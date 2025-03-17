package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.oppwa.mobile.connect.R;

public final class OppThreedsWebFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f121646a;
    public final FrameLayout webViewContainer;

    private OppThreedsWebFragmentBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f121646a = frameLayout;
        this.webViewContainer = frameLayout2;
    }

    public static OppThreedsWebFragmentBinding bind(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new OppThreedsWebFragmentBinding(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    public static OppThreedsWebFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppThreedsWebFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_threeds_web_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.f121646a;
    }
}
