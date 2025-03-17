package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaBankAccountTokenPaymentDetailsFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121649a;
    public final TextInputEditText accountHolderEditText;
    public final TextInputLayout accountHolderInputLayout;
    public final OppLayoutActionbarBinding header;
    public final TextInputEditText ibanEditText;
    public final TextInputLayout ibanInputLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;

    private OppwaBankAccountTokenPaymentDetailsFragmentBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding) {
        this.f121649a = constraintLayout;
        this.accountHolderEditText = textInputEditText;
        this.accountHolderInputLayout = textInputLayout;
        this.header = oppLayoutActionbarBinding;
        this.ibanEditText = textInputEditText2;
        this.ibanInputLayout = textInputLayout2;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppwaBankAccountTokenPaymentDetailsFragmentBinding bind(android.view.View r11) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.account_holder_edit_text
            android.view.View r1 = X4.b.a(r11, r0)
            r4 = r1
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            if (r4 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.account_holder_input_layout
            android.view.View r1 = X4.b.a(r11, r0)
            r5 = r1
            com.google.android.material.textfield.TextInputLayout r5 = (com.google.android.material.textfield.TextInputLayout) r5
            if (r5 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r11, r0)
            if (r1 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.iban_edit_text
            android.view.View r1 = X4.b.a(r11, r0)
            r7 = r1
            com.google.android.material.textfield.TextInputEditText r7 = (com.google.android.material.textfield.TextInputEditText) r7
            if (r7 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.iban_input_layout
            android.view.View r1 = X4.b.a(r11, r0)
            r8 = r1
            com.google.android.material.textfield.TextInputLayout r8 = (com.google.android.material.textfield.TextInputLayout) r8
            if (r8 == 0) goto L_0x005a
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r11, r0)
            if (r1 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r9 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r11, r0)
            if (r1 == 0) goto L_0x005a
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r10 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            com.oppwa.mobile.connect.databinding.OppwaBankAccountTokenPaymentDetailsFragmentBinding r0 = new com.oppwa.mobile.connect.databinding.OppwaBankAccountTokenPaymentDetailsFragmentBinding
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
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppwaBankAccountTokenPaymentDetailsFragmentBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppwaBankAccountTokenPaymentDetailsFragmentBinding");
    }

    public static OppwaBankAccountTokenPaymentDetailsFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaBankAccountTokenPaymentDetailsFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_bank_account_token_payment_details_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121649a;
    }
}
