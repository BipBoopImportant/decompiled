package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutButton;

public final class OppLayoutCheckoutPaybuttonBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f121640a;
    public final FrameLayout connectCheckoutInsertPaymentDataFooter;
    public final CheckoutButton paymentButton;

    private OppLayoutCheckoutPaybuttonBinding(FrameLayout frameLayout, FrameLayout frameLayout2, CheckoutButton checkoutButton) {
        this.f121640a = frameLayout;
        this.connectCheckoutInsertPaymentDataFooter = frameLayout2;
        this.paymentButton = checkoutButton;
    }

    public static OppLayoutCheckoutPaybuttonBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i10 = R.id.payment_button;
        CheckoutButton checkoutButton = (CheckoutButton) b.a(view, i10);
        if (checkoutButton != null) {
            return new OppLayoutCheckoutPaybuttonBinding(frameLayout, frameLayout, checkoutButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutCheckoutPaybuttonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutCheckoutPaybuttonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_checkout_paybutton, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.f121640a;
    }
}
