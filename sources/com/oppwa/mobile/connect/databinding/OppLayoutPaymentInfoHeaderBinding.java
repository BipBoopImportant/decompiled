package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppLayoutPaymentInfoHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121643a;
    public final RelativeLayout connectCheckoutInsertPaymentDataHeader;
    public final ProgressBar loadingPanelPaymentInfoHeader;
    public final ImageView logo;
    public final CheckoutTextView paymentInfoTitle;

    private OppLayoutPaymentInfoHeaderBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ProgressBar progressBar, ImageView imageView, CheckoutTextView checkoutTextView) {
        this.f121643a = relativeLayout;
        this.connectCheckoutInsertPaymentDataHeader = relativeLayout2;
        this.loadingPanelPaymentInfoHeader = progressBar;
        this.logo = imageView;
        this.paymentInfoTitle = checkoutTextView;
    }

    public static OppLayoutPaymentInfoHeaderBinding bind(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i10 = R.id.loading_panel_payment_info_header;
        ProgressBar progressBar = (ProgressBar) b.a(view, i10);
        if (progressBar != null) {
            i10 = R.id.logo;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = R.id.payment_info_title;
                CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
                if (checkoutTextView != null) {
                    return new OppLayoutPaymentInfoHeaderBinding(relativeLayout, relativeLayout, progressBar, imageView, checkoutTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutPaymentInfoHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutPaymentInfoHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_payment_info_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121643a;
    }
}
