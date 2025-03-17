package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;

public final class OppWebviewCheckoutBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121647a;
    public final OppLayoutActionbarBinding header;
    public final FrameLayout headerLayout;

    private OppWebviewCheckoutBinding(RelativeLayout relativeLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, FrameLayout frameLayout) {
        this.f121647a = relativeLayout;
        this.header = oppLayoutActionbarBinding;
        this.headerLayout = frameLayout;
    }

    public static OppWebviewCheckoutBinding bind(View view) {
        int i10 = R.id.header;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            OppLayoutActionbarBinding bind = OppLayoutActionbarBinding.bind(a10);
            int i11 = R.id.header_layout;
            FrameLayout frameLayout = (FrameLayout) b.a(view, i11);
            if (frameLayout != null) {
                return new OppWebviewCheckoutBinding((RelativeLayout) view, bind, frameLayout);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppWebviewCheckoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppWebviewCheckoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_webview_checkout, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121647a;
    }
}
