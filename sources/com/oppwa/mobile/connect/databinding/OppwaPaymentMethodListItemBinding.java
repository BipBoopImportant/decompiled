package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppwaPaymentMethodListItemBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121656a;
    public final ImageView listDisclosureImage;
    public final ProgressBar loadingPanel;
    public final RelativeLayout loadingPanelLayout;
    public final ImageView paymentBrandImage;
    public final TextView paymentBrandTitle;

    private OppwaPaymentMethodListItemBinding(LinearLayout linearLayout, ImageView imageView, ProgressBar progressBar, RelativeLayout relativeLayout, ImageView imageView2, TextView textView) {
        this.f121656a = linearLayout;
        this.listDisclosureImage = imageView;
        this.loadingPanel = progressBar;
        this.loadingPanelLayout = relativeLayout;
        this.paymentBrandImage = imageView2;
        this.paymentBrandTitle = textView;
    }

    public static OppwaPaymentMethodListItemBinding bind(View view) {
        int i10 = R.id.list_disclosure_image;
        ImageView imageView = (ImageView) b.a(view, i10);
        if (imageView != null) {
            i10 = R.id.loading_panel;
            ProgressBar progressBar = (ProgressBar) b.a(view, i10);
            if (progressBar != null) {
                i10 = R.id.loadingPanelLayout;
                RelativeLayout relativeLayout = (RelativeLayout) b.a(view, i10);
                if (relativeLayout != null) {
                    i10 = R.id.payment_brand_image;
                    ImageView imageView2 = (ImageView) b.a(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.payment_brand_title;
                        TextView textView = (TextView) b.a(view, i10);
                        if (textView != null) {
                            return new OppwaPaymentMethodListItemBinding((LinearLayout) view, imageView, progressBar, relativeLayout, imageView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppwaPaymentMethodListItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaPaymentMethodListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_payment_method_list_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121656a;
    }
}
