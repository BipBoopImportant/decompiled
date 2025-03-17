package com.oppwa.mobile.connect.databinding;

import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppLayoutTermsAgreementBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayout f121645a;
    public final AppCompatCheckBox agreementCheckbox;
    public final ImageView agreementImage;
    public final CheckoutTextView agreementLink;
    public final CheckoutTextView agreementText;

    private OppLayoutTermsAgreementBinding(LinearLayout linearLayout, AppCompatCheckBox appCompatCheckBox, ImageView imageView, CheckoutTextView checkoutTextView, CheckoutTextView checkoutTextView2) {
        this.f121645a = linearLayout;
        this.agreementCheckbox = appCompatCheckBox;
        this.agreementImage = imageView;
        this.agreementLink = checkoutTextView;
        this.agreementText = checkoutTextView2;
    }

    public static OppLayoutTermsAgreementBinding bind(View view) {
        int i10 = R.id.agreement_checkbox;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) b.a(view, i10);
        if (appCompatCheckBox != null) {
            i10 = R.id.agreement_image;
            ImageView imageView = (ImageView) b.a(view, i10);
            if (imageView != null) {
                i10 = R.id.agreement_link;
                CheckoutTextView checkoutTextView = (CheckoutTextView) b.a(view, i10);
                if (checkoutTextView != null) {
                    i10 = R.id.agreement_text;
                    CheckoutTextView checkoutTextView2 = (CheckoutTextView) b.a(view, i10);
                    if (checkoutTextView2 != null) {
                        return new OppLayoutTermsAgreementBinding((LinearLayout) view, appCompatCheckBox, imageView, checkoutTextView, checkoutTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OppLayoutTermsAgreementBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppLayoutTermsAgreementBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_layout_terms_agreement, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.f121645a;
    }
}
