package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaDirectDebitSepaFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121652a;
    public final OppLayoutActionbarBinding header;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final TextInputEditText sepaAccountHolderEditText;
    public final TextInputLayout sepaAccountHolderInputLayout;
    public final TextInputEditText sepaIbanEditText;
    public final TextInputLayout sepaIbanInputLayout;
    public final OppLayoutStorePaymentInfoBinding storePaymentDetailsLayout;

    private OppwaDirectDebitSepaFragmentBinding(ConstraintLayout constraintLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, OppLayoutStorePaymentInfoBinding oppLayoutStorePaymentInfoBinding) {
        this.f121652a = constraintLayout;
        this.header = oppLayoutActionbarBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.sepaAccountHolderEditText = textInputEditText;
        this.sepaAccountHolderInputLayout = textInputLayout;
        this.sepaIbanEditText = textInputEditText2;
        this.sepaIbanInputLayout = textInputLayout2;
        this.storePaymentDetailsLayout = oppLayoutStorePaymentInfoBinding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r0 = com.oppwa.mobile.connect.R.id.store_payment_details_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppwaDirectDebitSepaFragmentBinding bind(android.view.View r12) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0066
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r4 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0066
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r5 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0066
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.sepa_account_holder_edit_text
            android.view.View r1 = X4.b.a(r12, r0)
            r7 = r1
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            if (r7 == 0) goto L_0x0066
            int r0 = com.oppwa.mobile.connect.R.id.sepa_account_holder_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r8 = r1
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            if (r8 == 0) goto L_0x0066
            int r0 = com.oppwa.mobile.connect.R.id.sepa_iban_edit_text
            android.view.View r1 = X4.b.a(r12, r0)
            r9 = r1
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9
            if (r9 == 0) goto L_0x0066
            int r0 = com.oppwa.mobile.connect.R.id.sepa_iban_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r10 = r1
            com.google.android.material.textfield.TextInputLayout r10 = (com.google.android.material.textfield.TextInputLayout) r10
            if (r10 == 0) goto L_0x0066
            int r0 = com.oppwa.mobile.connect.R.id.store_payment_details_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0066
            com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding r11 = com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding.bind(r1)
            com.oppwa.mobile.connect.databinding.OppwaDirectDebitSepaFragmentBinding r0 = new com.oppwa.mobile.connect.databinding.OppwaDirectDebitSepaFragmentBinding
            r3 = r12
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0066:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppwaDirectDebitSepaFragmentBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppwaDirectDebitSepaFragmentBinding");
    }

    public static OppwaDirectDebitSepaFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaDirectDebitSepaFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_direct_debit_sepa_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121652a;
    }
}
