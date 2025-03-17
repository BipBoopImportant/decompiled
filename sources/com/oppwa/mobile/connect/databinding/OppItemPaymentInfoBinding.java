package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppItemPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121635a;
    public final ImageView markImageView;
    public final CheckoutTextView textView;

    private OppItemPaymentInfoBinding(RelativeLayout relativeLayout, ImageView imageView, CheckoutTextView checkoutTextView) {
        this.f121635a = relativeLayout;
        this.markImageView = imageView;
        this.textView = checkoutTextView;
    }

    public static OppItemPaymentInfoBinding bind(View view) {
        int i10 = R.id.mark_image_view;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = R.id.text_view;
            CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
            if (checkoutTextView != null) {
                return new OppItemPaymentInfoBinding((RelativeLayout) view, imageView, checkoutTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppItemPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121635a;
    }
}
