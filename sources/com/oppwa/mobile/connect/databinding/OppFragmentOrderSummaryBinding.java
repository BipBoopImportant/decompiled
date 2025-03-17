package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;

public final class OppFragmentOrderSummaryBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121622a;
    public final ImageView brandLogo;
    public final TextView cardDescription;
    public final OppLayoutActionbarBinding header;
    public final LinearLayout orderDetailsLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final ScrollView paymentInfoScrollView;
    public final TextView shippingAddress;
    public final LinearLayout shippingAddressLayout;
    public final View totalAmountDivider;
    public final LinearLayout totalAmountLayout;
    public final TextView totalAmountValue;

    private OppFragmentOrderSummaryBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, OppLayoutActionbarBinding oppLayoutActionbarBinding, LinearLayout linearLayout, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, ScrollView scrollView, TextView textView2, LinearLayout linearLayout2, View view, LinearLayout linearLayout3, TextView textView3) {
        this.f121622a = relativeLayout;
        this.brandLogo = imageView;
        this.cardDescription = textView;
        this.header = oppLayoutActionbarBinding;
        this.orderDetailsLayout = linearLayout;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoScrollView = scrollView;
        this.shippingAddress = textView2;
        this.shippingAddressLayout = linearLayout2;
        this.totalAmountDivider = view;
        this.totalAmountLayout = linearLayout3;
        this.totalAmountValue = textView3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r0 = com.oppwa.mobile.connect.R.id.total_amount_divider;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentOrderSummaryBinding bind(android.view.View r15) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.brand_logo
            android.view.View r1 = X4.b.a(r15, r0)
            r4 = r1
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.card_description
            android.view.View r1 = X4.b.a(r15, r0)
            r5 = r1
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r15, r0)
            if (r1 == 0) goto L_0x0082
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.order_details_layout
            android.view.View r1 = X4.b.a(r15, r0)
            r7 = r1
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            if (r7 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r15, r0)
            if (r1 == 0) goto L_0x0082
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r15, r0)
            r9 = r1
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            if (r9 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.shipping_address
            android.view.View r1 = X4.b.a(r15, r0)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.shipping_address_layout
            android.view.View r1 = X4.b.a(r15, r0)
            r11 = r1
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.total_amount_divider
            android.view.View r12 = X4.b.a(r15, r0)
            if (r12 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.total_amount_layout
            android.view.View r1 = X4.b.a(r15, r0)
            r13 = r1
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            if (r13 == 0) goto L_0x0082
            int r0 = com.oppwa.mobile.connect.R.id.total_amount_value
            android.view.View r1 = X4.b.a(r15, r0)
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            if (r14 == 0) goto L_0x0082
            com.oppwa.mobile.connect.databinding.OppFragmentOrderSummaryBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentOrderSummaryBinding
            r3 = r15
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0082:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentOrderSummaryBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentOrderSummaryBinding");
    }

    public static OppFragmentOrderSummaryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentOrderSummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_order_summary, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121622a;
    }
}
