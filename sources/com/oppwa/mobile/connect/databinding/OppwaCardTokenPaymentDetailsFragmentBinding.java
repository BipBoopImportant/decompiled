package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaCardTokenPaymentDetailsFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121651a;
    public final TextInputEditText cardExpiryDateEditText;
    public final TextInputLayout cardExpiryDateInputLayout;
    public final TextInputEditText cardHolderEditText;
    public final TextInputLayout cardHolderInputLayout;
    public final TextInputEditText cardNumberEditText;
    public final TextInputLayout cardNumberInputLayout;
    public final TextInputEditText cardSecurityCodeEditText;
    public final TextInputLayout cardSecurityCodeInputLayout;
    public final OppLayoutActionbarBinding header;
    public final Barrier installmentsBarrier;
    public final OppLayoutInstallmentsDropdownBinding numberOfInstallmentsLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;

    private OppwaCardTokenPaymentDetailsFragmentBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout4, OppLayoutActionbarBinding oppLayoutActionbarBinding, Barrier barrier, OppLayoutInstallmentsDropdownBinding oppLayoutInstallmentsDropdownBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding) {
        this.f121651a = constraintLayout;
        this.cardExpiryDateEditText = textInputEditText;
        this.cardExpiryDateInputLayout = textInputLayout;
        this.cardHolderEditText = textInputEditText2;
        this.cardHolderInputLayout = textInputLayout2;
        this.cardNumberEditText = textInputEditText3;
        this.cardNumberInputLayout = textInputLayout3;
        this.cardSecurityCodeEditText = textInputEditText4;
        this.cardSecurityCodeInputLayout = textInputLayout4;
        this.header = oppLayoutActionbarBinding;
        this.installmentsBarrier = barrier;
        this.numberOfInstallmentsLayout = oppLayoutInstallmentsDropdownBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r1 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r1 = com.oppwa.mobile.connect.R.id.number_of_installments_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppwaCardTokenPaymentDetailsFragmentBinding bind(android.view.View r18) {
        /*
            r0 = r18
            int r1 = com.oppwa.mobile.connect.R.id.card_expiry_date_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r5 = r2
            com.google.android.material.textfield.TextInputEditText r5 = (com.google.android.material.textfield.TextInputEditText) r5
            if (r5 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_expiry_date_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r6 = r2
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            if (r6 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_holder_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r7 = r2
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            if (r7 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_holder_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r8 = r2
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            if (r8 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_number_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r9 = r2
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            if (r9 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_number_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r10 = r2
            com.google.android.material.textfield.TextInputLayout r10 = (com.google.android.material.textfield.TextInputLayout) r10
            if (r10 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_security_code_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r11 = r2
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            if (r11 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.card_security_code_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r12 = r2
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            if (r12 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x009f
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r13 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.installments_barrier
            android.view.View r2 = X4.b.a(r0, r1)
            r14 = r2
            androidx.constraintlayout.widget.Barrier r14 = (androidx.constraintlayout.widget.Barrier) r14
            if (r14 == 0) goto L_0x009f
            int r1 = com.oppwa.mobile.connect.R.id.number_of_installments_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x009f
            com.oppwa.mobile.connect.databinding.OppLayoutInstallmentsDropdownBinding r15 = com.oppwa.mobile.connect.databinding.OppLayoutInstallmentsDropdownBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x009f
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r16 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x009f
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r17 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r2)
            com.oppwa.mobile.connect.databinding.OppwaCardTokenPaymentDetailsFragmentBinding r1 = new com.oppwa.mobile.connect.databinding.OppwaCardTokenPaymentDetailsFragmentBinding
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r1
        L_0x009f:
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppwaCardTokenPaymentDetailsFragmentBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppwaCardTokenPaymentDetailsFragmentBinding");
    }

    public static OppwaCardTokenPaymentDetailsFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaCardTokenPaymentDetailsFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_card_token_payment_details_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121651a;
    }
}
