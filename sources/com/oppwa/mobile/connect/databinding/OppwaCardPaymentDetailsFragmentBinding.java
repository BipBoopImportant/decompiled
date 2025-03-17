package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.BillingAddressLayout;
import com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout;

public final class OppwaCardPaymentDetailsFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121650a;
    public final Barrier billingAddressBarrier;
    public final BillingAddressLayout billingAddressLayout;
    public final OppItemCardBrandsBinding cardBrandLogoLayout;
    public final CardBrandSelectionLayout cardBrandSelectionLayout;
    public final TextInputEditText cardExpiryDateEditText;
    public final TextInputLayout cardExpiryDateInputLayout;
    public final TextInputEditText cardHolderEditText;
    public final TextInputLayout cardHolderInputLayout;
    public final TextInputEditText cardNumberEditText;
    public final TextInputLayout cardNumberInputLayout;
    public final TextInputEditText cardSecurityCodeEditText;
    public final TextInputLayout cardSecurityCodeInputLayout;
    public final LinearLayoutCompat countryCodeAndPhoneLayout;
    public final OppLayoutActionbarBinding header;
    public final LinearLayoutCompat holderExpiryDateCvvLayout;
    public final OppLayoutInstallmentsDropdownBinding numberOfInstallmentsLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final TextInputEditText phoneCountryCodeEditText;
    public final TextInputLayout phoneCountryCodeInputLayout;
    public final Barrier phoneNumberBarrier;
    public final TextInputEditText phoneNumberEditText;
    public final TextInputLayout phoneNumberInputLayout;
    public final OppLayoutStorePaymentInfoBinding storePaymentDetailsLayout;

    private OppwaCardPaymentDetailsFragmentBinding(ConstraintLayout constraintLayout, Barrier barrier, BillingAddressLayout billingAddressLayout2, OppItemCardBrandsBinding oppItemCardBrandsBinding, CardBrandSelectionLayout cardBrandSelectionLayout2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout4, LinearLayoutCompat linearLayoutCompat, OppLayoutActionbarBinding oppLayoutActionbarBinding, LinearLayoutCompat linearLayoutCompat2, OppLayoutInstallmentsDropdownBinding oppLayoutInstallmentsDropdownBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, TextInputEditText textInputEditText5, TextInputLayout textInputLayout5, Barrier barrier2, TextInputEditText textInputEditText6, TextInputLayout textInputLayout6, OppLayoutStorePaymentInfoBinding oppLayoutStorePaymentInfoBinding) {
        this.f121650a = constraintLayout;
        this.billingAddressBarrier = barrier;
        this.billingAddressLayout = billingAddressLayout2;
        this.cardBrandLogoLayout = oppItemCardBrandsBinding;
        this.cardBrandSelectionLayout = cardBrandSelectionLayout2;
        this.cardExpiryDateEditText = textInputEditText;
        this.cardExpiryDateInputLayout = textInputLayout;
        this.cardHolderEditText = textInputEditText2;
        this.cardHolderInputLayout = textInputLayout2;
        this.cardNumberEditText = textInputEditText3;
        this.cardNumberInputLayout = textInputLayout3;
        this.cardSecurityCodeEditText = textInputEditText4;
        this.cardSecurityCodeInputLayout = textInputLayout4;
        this.countryCodeAndPhoneLayout = linearLayoutCompat;
        this.header = oppLayoutActionbarBinding;
        this.holderExpiryDateCvvLayout = linearLayoutCompat2;
        this.numberOfInstallmentsLayout = oppLayoutInstallmentsDropdownBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.phoneCountryCodeEditText = textInputEditText5;
        this.phoneCountryCodeInputLayout = textInputLayout5;
        this.phoneNumberBarrier = barrier2;
        this.phoneNumberEditText = textInputEditText6;
        this.phoneNumberInputLayout = textInputLayout6;
        this.storePaymentDetailsLayout = oppLayoutStorePaymentInfoBinding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = com.oppwa.mobile.connect.R.id.card_brand_logo_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
        r1 = com.oppwa.mobile.connect.R.id.store_payment_details_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppwaCardPaymentDetailsFragmentBinding bind(android.view.View r27) {
        /*
            r0 = r27
            int r1 = com.oppwa.mobile.connect.R.id.billing_address_barrier
            android.view.View r1 = X4.b.a(r0, r1)
            r4 = r1
            androidx.constraintlayout.widget.Barrier r4 = (androidx.constraintlayout.widget.Barrier) r4
            int r1 = com.oppwa.mobile.connect.R.id.billing_address_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r5 = r2
            com.oppwa.mobile.connect.checkout.dialog.BillingAddressLayout r5 = (com.oppwa.mobile.connect.checkout.dialog.BillingAddressLayout) r5
            if (r5 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_brand_logo_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x010d
            com.oppwa.mobile.connect.databinding.OppItemCardBrandsBinding r6 = com.oppwa.mobile.connect.databinding.OppItemCardBrandsBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.card_brand_selection_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r7 = r2
            com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout r7 = (com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout) r7
            if (r7 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_expiry_date_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r8 = r2
            com.google.android.material.textfield.TextInputEditText r8 = (com.google.android.material.textfield.TextInputEditText) r8
            if (r8 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_expiry_date_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r9 = r2
            com.google.android.material.textfield.TextInputLayout r9 = (com.google.android.material.textfield.TextInputLayout) r9
            if (r9 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_holder_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r10 = r2
            com.google.android.material.textfield.TextInputEditText r10 = (com.google.android.material.textfield.TextInputEditText) r10
            if (r10 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_holder_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r11 = r2
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_number_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r12 = r2
            com.google.android.material.textfield.TextInputEditText r12 = (com.google.android.material.textfield.TextInputEditText) r12
            if (r12 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_number_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r13 = r2
            com.google.android.material.textfield.TextInputLayout r13 = (com.google.android.material.textfield.TextInputLayout) r13
            if (r13 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_security_code_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r14 = r2
            com.google.android.material.textfield.TextInputEditText r14 = (com.google.android.material.textfield.TextInputEditText) r14
            if (r14 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.card_security_code_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r15 = r2
            com.google.android.material.textfield.TextInputLayout r15 = (com.google.android.material.textfield.TextInputLayout) r15
            if (r15 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.country_code_and_phone_layout
            android.view.View r1 = X4.b.a(r0, r1)
            r16 = r1
            androidx.appcompat.widget.LinearLayoutCompat r16 = (androidx.appcompat.widget.LinearLayoutCompat) r16
            int r1 = com.oppwa.mobile.connect.R.id.header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x010d
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r17 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.holder_expiry_date_cvv_layout
            android.view.View r1 = X4.b.a(r0, r1)
            r18 = r1
            androidx.appcompat.widget.LinearLayoutCompat r18 = (androidx.appcompat.widget.LinearLayoutCompat) r18
            int r1 = com.oppwa.mobile.connect.R.id.number_of_installments_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x010d
            com.oppwa.mobile.connect.databinding.OppLayoutInstallmentsDropdownBinding r19 = com.oppwa.mobile.connect.databinding.OppLayoutInstallmentsDropdownBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x010d
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r20 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.phone_country_code_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r21 = r2
            com.google.android.material.textfield.TextInputEditText r21 = (com.google.android.material.textfield.TextInputEditText) r21
            if (r21 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.phone_country_code_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r22 = r2
            com.google.android.material.textfield.TextInputLayout r22 = (com.google.android.material.textfield.TextInputLayout) r22
            if (r22 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.phone_number_barrier
            android.view.View r1 = X4.b.a(r0, r1)
            r23 = r1
            androidx.constraintlayout.widget.Barrier r23 = (androidx.constraintlayout.widget.Barrier) r23
            int r1 = com.oppwa.mobile.connect.R.id.phone_number_edit_text
            android.view.View r2 = X4.b.a(r0, r1)
            r24 = r2
            com.google.android.material.textfield.TextInputEditText r24 = (com.google.android.material.textfield.TextInputEditText) r24
            if (r24 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.phone_number_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r25 = r2
            com.google.android.material.textfield.TextInputLayout r25 = (com.google.android.material.textfield.TextInputLayout) r25
            if (r25 == 0) goto L_0x010d
            int r1 = com.oppwa.mobile.connect.R.id.store_payment_details_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x010d
            com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding r26 = com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding.bind(r2)
            com.oppwa.mobile.connect.databinding.OppwaCardPaymentDetailsFragmentBinding r1 = new com.oppwa.mobile.connect.databinding.OppwaCardPaymentDetailsFragmentBinding
            r2 = r1
            r3 = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r1
        L_0x010d:
            android.content.res.Resources r0 = r27.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppwaCardPaymentDetailsFragmentBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppwaCardPaymentDetailsFragmentBinding");
    }

    public static OppwaCardPaymentDetailsFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaCardPaymentDetailsFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_card_payment_details_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121650a;
    }
}
