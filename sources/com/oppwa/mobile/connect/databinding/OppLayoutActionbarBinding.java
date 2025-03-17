package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppLayoutActionbarBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121637a;
    public final ImageButton backButton;
    public final ImageButton closeButton;
    public final CheckoutTextView title;

    private OppLayoutActionbarBinding(RelativeLayout relativeLayout, ImageButton imageButton, ImageButton imageButton2, CheckoutTextView checkoutTextView) {
        this.f121637a = relativeLayout;
        this.backButton = imageButton;
        this.closeButton = imageButton2;
        this.title = checkoutTextView;
    }

    public static OppLayoutActionbarBinding bind(View view) {
        int i10 = R.id.back_button;
        ImageButton imageButton = (ImageButton) b.a(view, i10);
        if (imageButton != null) {
            i10 = R.id.close_button;
            ImageButton imageButton2 = (ImageButton) b.a(view, i10);
            if (imageButton2 != null) {
                i10 = R.id.title;
                CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
                if (checkoutTextView != null) {
                    return new OppLayoutActionbarBinding((RelativeLayout) view, imageButton, imageButton2, checkoutTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutActionbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutActionbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_actionbar, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121637a;
    }
}
