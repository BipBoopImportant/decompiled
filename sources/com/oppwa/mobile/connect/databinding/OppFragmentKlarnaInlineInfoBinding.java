package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppFragmentKlarnaInlineInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121618a;
    public final OppLayoutActionbarBinding header;
    public final View overlapView;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final RelativeLayout paymentInfo;
    public final ScrollView paymentInfoScrollView;
    public final ProgressBar progressBar;
    public final CheckoutTextView progressText;
    public final RelativeLayout progressView;

    private OppFragmentKlarnaInlineInfoBinding(RelativeLayout relativeLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, View view, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, RelativeLayout relativeLayout2, ScrollView scrollView, ProgressBar progressBar2, CheckoutTextView checkoutTextView, RelativeLayout relativeLayout3) {
        this.f121618a = relativeLayout;
        this.header = oppLayoutActionbarBinding;
        this.overlapView = view;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfo = relativeLayout2;
        this.paymentInfoScrollView = scrollView;
        this.progressBar = progressBar2;
        this.progressText = checkoutTextView;
        this.progressView = relativeLayout3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentKlarnaInlineInfoBinding bind(android.view.View r12) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0061
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r4 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.overlap_view
            android.view.View r5 = X4.b.a(r12, r0)
            if (r5 == 0) goto L_0x0061
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0061
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info
            android.view.View r1 = X4.b.a(r12, r0)
            r7 = r1
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            if (r7 == 0) goto L_0x0061
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r12, r0)
            r8 = r1
            android.widget.ScrollView r8 = (android.widget.ScrollView) r8
            if (r8 == 0) goto L_0x0061
            int r0 = com.oppwa.mobile.connect.R.id.progress_bar
            android.view.View r1 = X4.b.a(r12, r0)
            r9 = r1
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            if (r9 == 0) goto L_0x0061
            int r0 = com.oppwa.mobile.connect.R.id.progress_text
            android.view.View r1 = X4.b.a(r12, r0)
            r10 = r1
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r10 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r10
            if (r10 == 0) goto L_0x0061
            int r0 = com.oppwa.mobile.connect.R.id.progress_view
            android.view.View r1 = X4.b.a(r12, r0)
            r11 = r1
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            if (r11 == 0) goto L_0x0061
            com.oppwa.mobile.connect.databinding.OppFragmentKlarnaInlineInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentKlarnaInlineInfoBinding
            r3 = r12
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0061:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentKlarnaInlineInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentKlarnaInlineInfoBinding");
    }

    public static OppFragmentKlarnaInlineInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentKlarnaInlineInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_klarna_inline_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121618a;
    }
}
