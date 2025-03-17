package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentMbwayPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121621a;
    public final InputLayout countryCodeInputLayout;
    public final OppLayoutActionbarBinding header;
    public final InputLayout mobilePhoneInputLayout;
    public final TextView notificationTextView;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final NestedScrollView paymentInfoScrollView;

    private OppFragmentMbwayPaymentInfoBinding(ConstraintLayout constraintLayout, InputLayout inputLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, InputLayout inputLayout2, TextView textView, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, NestedScrollView nestedScrollView) {
        this.f121621a = constraintLayout;
        this.countryCodeInputLayout = inputLayout;
        this.header = oppLayoutActionbarBinding;
        this.mobilePhoneInputLayout = inputLayout2;
        this.notificationTextView = textView;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = nestedScrollView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentMbwayPaymentInfoBinding bind(android.view.View r11) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.country_code_input_layout
            android.view.View r1 = X4.b.a(r11, r0)
            r4 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r4 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r4
            if (r4 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r11, r0)
            if (r1 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r5 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.mobile_phone_input_layout
            android.view.View r1 = X4.b.a(r11, r0)
            r6 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r6 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r6
            if (r6 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.notification_text_view
            android.view.View r1 = X4.b.a(r11, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r11, r0)
            if (r1 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r11, r0)
            if (r1 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r9 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r11, r0)
            r10 = r1
            androidx.core.widget.NestedScrollView r10 = (androidx.core.widget.NestedScrollView) r10
            if (r10 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppFragmentMbwayPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentMbwayPaymentInfoBinding
            r3 = r11
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x005a:
            android.content.res.Resources r11 = r11.getResources()
            java.lang.String r11 = r11.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r11 = r1.concat(r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentMbwayPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentMbwayPaymentInfoBinding");
    }

    public static OppFragmentMbwayPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentMbwayPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_mbway_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121621a;
    }
}
