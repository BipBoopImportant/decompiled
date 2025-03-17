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

public final class OppwaPaymentMethodTokenListItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121658a;
    public final ProgressBar loadingPanel;
    public final TextView paymentTokenErroredTitle;
    public final ImageView paymentTokenImage;
    public final TextView paymentTokenTitle;

    private OppwaPaymentMethodTokenListItemBinding(LinearLayout linearLayout, ProgressBar progressBar, TextView textView, ImageView imageView, TextView textView2) {
        this.f121658a = linearLayout;
        this.loadingPanel = progressBar;
        this.paymentTokenErroredTitle = textView;
        this.paymentTokenImage = imageView;
        this.paymentTokenTitle = textView2;
    }

    public static OppwaPaymentMethodTokenListItemBinding bind(View view) {
        int i10 = R.id.loading_panel;
        ProgressBar progressBar = (ProgressBar) b.a(view, i10);
        if (progressBar != null) {
            i10 = R.id.payment_token_errored_title;
            TextView textView = (TextView) b.a(view, i10);
            if (textView != null) {
                i10 = R.id.payment_token_image;
                ImageView imageView = (ImageView) b.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.payment_token_title;
                    TextView textView2 = (TextView) b.a(view, i10);
                    if (textView2 != null) {
                        return new OppwaPaymentMethodTokenListItemBinding((LinearLayout) view, progressBar, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppwaPaymentMethodTokenListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaPaymentMethodTokenListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_payment_method_token_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121658a;
    }
}
