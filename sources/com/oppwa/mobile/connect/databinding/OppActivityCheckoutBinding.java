package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;

public final class OppActivityCheckoutBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121605a;
    public final FrameLayout container;

    private OppActivityCheckoutBinding(RelativeLayout relativeLayout, FrameLayout frameLayout) {
        this.f121605a = relativeLayout;
        this.container = frameLayout;
    }

    public static OppActivityCheckoutBinding bind(View view) {
        int i10 = R.id.container;
        FrameLayout frameLayout = (FrameLayout) b.a(view, i10);
        if (frameLayout != null) {
            return new OppActivityCheckoutBinding((RelativeLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppActivityCheckoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppActivityCheckoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_activity_checkout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121605a;
    }
}
