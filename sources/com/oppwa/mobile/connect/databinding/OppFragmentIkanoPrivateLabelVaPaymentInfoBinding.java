package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.CardNumberInputLayout;
import com.oppwa.mobile.connect.checkout.dialog.DateInputLayout;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentIkanoPrivateLabelVaPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121617a;
    public final LinearLayout expiryDateAndVerification;
    public final DateInputLayout expiryDateInputLayout;
    public final OppLayoutActionbarBinding header;
    public final CardNumberInputLayout numberInputLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final ScrollView paymentInfoScrollView;
    public final InputLayout verificationInputLayout;

    private OppFragmentIkanoPrivateLabelVaPaymentInfoBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, DateInputLayout dateInputLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, CardNumberInputLayout cardNumberInputLayout, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, ScrollView scrollView, InputLayout inputLayout) {
        this.f121617a = relativeLayout;
        this.expiryDateAndVerification = linearLayout;
        this.expiryDateInputLayout = dateInputLayout;
        this.header = oppLayoutActionbarBinding;
        this.numberInputLayout = cardNumberInputLayout;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = scrollView;
        this.verificationInputLayout = inputLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentIkanoPrivateLabelVaPaymentInfoBinding bind(android.view.View r12) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.expiry_date_and_verification
            android.view.View r1 = X4.b.a(r12, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L_0x0065
            int r0 = com.oppwa.mobile.connect.R.id.expiry_date_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r5 = r1
            com.oppwa.mobile.connect.checkout.dialog.DateInputLayout r5 = (com.oppwa.mobile.connect.checkout.dialog.DateInputLayout) r5
            if (r5 == 0) goto L_0x0065
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0065
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.number_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r7 = r1
            com.oppwa.mobile.connect.checkout.dialog.CardNumberInputLayout r7 = (com.oppwa.mobile.connect.checkout.dialog.CardNumberInputLayout) r7
            if (r7 == 0) goto L_0x0065
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0065
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0065
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r9 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r12, r0)
            r10 = r1
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            if (r10 == 0) goto L_0x0065
            int r0 = com.oppwa.mobile.connect.R.id.verification_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r11 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r11 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r11
            if (r11 == 0) goto L_0x0065
            com.oppwa.mobile.connect.databinding.OppFragmentIkanoPrivateLabelVaPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentIkanoPrivateLabelVaPaymentInfoBinding
            r3 = r12
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0065:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentIkanoPrivateLabelVaPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentIkanoPrivateLabelVaPaymentInfoBinding");
    }

    public static OppFragmentIkanoPrivateLabelVaPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentIkanoPrivateLabelVaPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_ikano_private_label_va_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121617a;
    }
}
