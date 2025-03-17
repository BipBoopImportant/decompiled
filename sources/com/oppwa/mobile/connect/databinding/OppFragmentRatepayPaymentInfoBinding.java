package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.DateOfBirthInputLayout;

public final class OppFragmentRatepayPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121626a;
    public final DateOfBirthInputLayout dateOfBirthInputLayout;
    public final OppLayoutActionbarBinding header;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final ScrollView paymentInfoScrollView;

    private OppFragmentRatepayPaymentInfoBinding(RelativeLayout relativeLayout, DateOfBirthInputLayout dateOfBirthInputLayout2, OppLayoutActionbarBinding oppLayoutActionbarBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, ScrollView scrollView) {
        this.f121626a = relativeLayout;
        this.dateOfBirthInputLayout = dateOfBirthInputLayout2;
        this.header = oppLayoutActionbarBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = scrollView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentRatepayPaymentInfoBinding bind(android.view.View r9) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.date_of_birth_input_layout
            android.view.View r1 = X4.b.a(r9, r0)
            r4 = r1
            com.oppwa.mobile.connect.checkout.dialog.DateOfBirthInputLayout r4 = (com.oppwa.mobile.connect.checkout.dialog.DateOfBirthInputLayout) r4
            if (r4 == 0) goto L_0x0044
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r9, r0)
            if (r1 == 0) goto L_0x0044
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r5 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r9, r0)
            if (r1 == 0) goto L_0x0044
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r9, r0)
            if (r1 == 0) goto L_0x0044
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r9, r0)
            r8 = r1
            android.widget.ScrollView r8 = (android.widget.ScrollView) r8
            if (r8 == 0) goto L_0x0044
            com.oppwa.mobile.connect.databinding.OppFragmentRatepayPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentRatepayPaymentInfoBinding
            r3 = r9
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0044:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentRatepayPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentRatepayPaymentInfoBinding");
    }

    public static OppFragmentRatepayPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentRatepayPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_ratepay_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121626a;
    }
}
