package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppItemPaymentTokenBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121636a;
    public final ProgressBar loadingPanel;
    public final ImageView paymentTokenImage;
    public final TextView paymentTokenTitle;

    private OppItemPaymentTokenBinding(LinearLayout linearLayout, ProgressBar progressBar, ImageView imageView, TextView textView) {
        this.f121636a = linearLayout;
        this.loadingPanel = progressBar;
        this.paymentTokenImage = imageView;
        this.paymentTokenTitle = textView;
    }

    public static OppItemPaymentTokenBinding bind(View view) {
        int i10 = R.id.loading_panel;
        ProgressBar progressBar = (ProgressBar) b.a(view, i10);
        if (progressBar != null) {
            i10 = R.id.payment_token_image;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = R.id.payment_token_title;
                TextView textView = (TextView) b.a(view, i10);
                if (textView != null) {
                    return new OppItemPaymentTokenBinding((LinearLayout) view, progressBar, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppItemPaymentTokenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppItemPaymentTokenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_item_payment_token, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121636a;
    }
}
