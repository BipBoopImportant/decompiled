package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutEditText;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppFragmentBlikPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121610a;
    public final CheckoutEditText blikCode;
    public final CheckoutTextView blikHelperTextView;
    public final CheckoutTextView blikLabelTextView;
    public final ImageView blikLogo;
    public final CheckoutTextView blikTermsAndConditionsTextView;
    public final OppLayoutActionbarBinding header;
    public final View overlapView;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final ScrollView paymentInfoScrollView;
    public final ProgressBar progressBar;
    public final CheckoutTextView progressText;

    private OppFragmentBlikPaymentInfoBinding(ConstraintLayout constraintLayout, CheckoutEditText checkoutEditText, CheckoutTextView checkoutTextView, CheckoutTextView checkoutTextView2, ImageView imageView, CheckoutTextView checkoutTextView3, OppLayoutActionbarBinding oppLayoutActionbarBinding, View view, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, ScrollView scrollView, ProgressBar progressBar2, CheckoutTextView checkoutTextView4) {
        this.f121610a = constraintLayout;
        this.blikCode = checkoutEditText;
        this.blikHelperTextView = checkoutTextView;
        this.blikLabelTextView = checkoutTextView2;
        this.blikLogo = imageView;
        this.blikTermsAndConditionsTextView = checkoutTextView3;
        this.header = oppLayoutActionbarBinding;
        this.overlapView = view;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = scrollView;
        this.progressBar = progressBar2;
        this.progressText = checkoutTextView4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        r1 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentBlikPaymentInfoBinding bind(android.view.View r17) {
        /*
            r0 = r17
            int r1 = com.oppwa.mobile.connect.R.id.blik_code
            android.view.View r2 = X4.b.a(r0, r1)
            r5 = r2
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutEditText r5 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutEditText) r5
            if (r5 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.blik_helper_text_view
            android.view.View r2 = X4.b.a(r0, r1)
            r6 = r2
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r6 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r6
            if (r6 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.blik_label_text_view
            android.view.View r2 = X4.b.a(r0, r1)
            r7 = r2
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r7 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r7
            if (r7 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.blik_logo
            android.view.View r2 = X4.b.a(r0, r1)
            r8 = r2
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r8 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.blik_terms_and_conditions_text_view
            android.view.View r2 = X4.b.a(r0, r1)
            r9 = r2
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r9 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r9
            if (r9 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0091
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r10 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.overlap_view
            android.view.View r11 = X4.b.a(r0, r1)
            if (r11 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0091
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r12 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0091
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r13 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r2 = X4.b.a(r0, r1)
            r14 = r2
            android.widget.ScrollView r14 = (android.widget.ScrollView) r14
            if (r14 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.progress_bar
            android.view.View r2 = X4.b.a(r0, r1)
            r15 = r2
            android.widget.ProgressBar r15 = (android.widget.ProgressBar) r15
            if (r15 == 0) goto L_0x0091
            int r1 = com.oppwa.mobile.connect.R.id.progress_text
            android.view.View r2 = X4.b.a(r0, r1)
            r16 = r2
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r16 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r16
            if (r16 == 0) goto L_0x0091
            com.oppwa.mobile.connect.databinding.OppFragmentBlikPaymentInfoBinding r1 = new com.oppwa.mobile.connect.databinding.OppFragmentBlikPaymentInfoBinding
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0091:
            android.content.res.Resources r0 = r17.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentBlikPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentBlikPaymentInfoBinding");
    }

    public static OppFragmentBlikPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentBlikPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_blik_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121610a;
    }
}
