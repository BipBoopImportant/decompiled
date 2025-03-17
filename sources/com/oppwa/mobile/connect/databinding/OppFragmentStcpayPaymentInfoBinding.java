package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentStcpayPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121627a;
    public final RelativeLayout editTextsContainer;
    public final RelativeLayout formTypeMethodGroup;
    public final RadioGroup formTypeRadioGroup;
    public final OppLayoutActionbarBinding header;
    public final TextView methodSelectTextView;
    public final InputLayout mobilePhoneInputLayout;
    public final RadioButton mobilePhoneRadioButton;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final ScrollView paymentInfoScrollView;
    public final RadioButton qrcodeRadioButton;

    private OppFragmentStcpayPaymentInfoBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RadioGroup radioGroup, OppLayoutActionbarBinding oppLayoutActionbarBinding, TextView textView, InputLayout inputLayout, RadioButton radioButton, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, ScrollView scrollView, RadioButton radioButton2) {
        this.f121627a = relativeLayout;
        this.editTextsContainer = relativeLayout2;
        this.formTypeMethodGroup = relativeLayout3;
        this.formTypeRadioGroup = radioGroup;
        this.header = oppLayoutActionbarBinding;
        this.methodSelectTextView = textView;
        this.mobilePhoneInputLayout = inputLayout;
        this.mobilePhoneRadioButton = radioButton;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = scrollView;
        this.qrcodeRadioButton = radioButton2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentStcpayPaymentInfoBinding bind(android.view.View r15) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.edit_texts_container
            android.view.View r1 = X4.b.a(r15, r0)
            r4 = r1
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            if (r4 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.form_type_method_group
            android.view.View r1 = X4.b.a(r15, r0)
            r5 = r1
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            if (r5 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.form_type_radio_group
            android.view.View r1 = X4.b.a(r15, r0)
            r6 = r1
            android.widget.RadioGroup r6 = (android.widget.RadioGroup) r6
            if (r6 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r15, r0)
            if (r1 == 0) goto L_0x0086
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.method_select_text_view
            android.view.View r1 = X4.b.a(r15, r0)
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.mobile_phone_input_layout
            android.view.View r1 = X4.b.a(r15, r0)
            r9 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r9 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r9
            if (r9 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.mobile_phone_radio_button
            android.view.View r1 = X4.b.a(r15, r0)
            r10 = r1
            android.widget.RadioButton r10 = (android.widget.RadioButton) r10
            if (r10 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r15, r0)
            if (r1 == 0) goto L_0x0086
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r11 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r15, r0)
            if (r1 == 0) goto L_0x0086
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r12 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r15, r0)
            r13 = r1
            android.widget.ScrollView r13 = (android.widget.ScrollView) r13
            if (r13 == 0) goto L_0x0086
            int r0 = com.oppwa.mobile.connect.R.id.qrcode_radio_button
            android.view.View r1 = X4.b.a(r15, r0)
            r14 = r1
            android.widget.RadioButton r14 = (android.widget.RadioButton) r14
            if (r14 == 0) goto L_0x0086
            com.oppwa.mobile.connect.databinding.OppFragmentStcpayPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentStcpayPaymentInfoBinding
            r3 = r15
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0086:
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r15 = r15.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r15 = r1.concat(r15)
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentStcpayPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentStcpayPaymentInfoBinding");
    }

    public static OppFragmentStcpayPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentStcpayPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_stcpay_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121627a;
    }
}
