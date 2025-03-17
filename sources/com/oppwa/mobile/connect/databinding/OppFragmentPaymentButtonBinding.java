package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.oppwa.mobile.connect.R;

public final class OppFragmentPaymentButtonBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121623a;
    public final GooglepayButtonBinding googlepayLayout;
    public final ProgressBar loadingPanel;
    public final ImageButton paymentButton;

    private OppFragmentPaymentButtonBinding(RelativeLayout relativeLayout, GooglepayButtonBinding googlepayButtonBinding, ProgressBar progressBar, ImageButton imageButton) {
        this.f121623a = relativeLayout;
        this.googlepayLayout = googlepayButtonBinding;
        this.loadingPanel = progressBar;
        this.paymentButton = imageButton;
    }

    public static OppFragmentPaymentButtonBinding bind(View view) {
        int i10 = R.id.googlepay_layout;
        View a10 = b.a(view, i10);
        if (a10 != null) {
            GooglepayButtonBinding bind = GooglepayButtonBinding.bind(a10);
            int i11 = R.id.loading_panel;
            ProgressBar progressBar = (ProgressBar) b.a(view, i11);
            if (progressBar != null) {
                i11 = R.id.payment_button;
                ImageButton imageButton = (ImageButton) b.a(view, i11);
                if (imageButton != null) {
                    return new OppFragmentPaymentButtonBinding((RelativeLayout) view, bind, progressBar, imageButton);
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppFragmentPaymentButtonBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentPaymentButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_payment_button, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121623a;
    }
}
