package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.R;

public final class OppwaAciInstantPayFragmentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121648a;
    public final TextInputEditText accountHolderEditText;
    public final TextInputLayout accountHolderInputLayout;
    public final TextInputEditText accountNumberEditText;
    public final TextInputLayout accountNumberInputLayout;
    public final OppLayoutActionbarBinding header;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final TextInputEditText routingNumberEditText;
    public final TextInputLayout routingNumberInputLayout;

    private OppwaAciInstantPayFragmentBinding(ConstraintLayout constraintLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, OppLayoutActionbarBinding oppLayoutActionbarBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3) {
        this.f121648a = constraintLayout;
        this.accountHolderEditText = textInputEditText;
        this.accountHolderInputLayout = textInputLayout;
        this.accountNumberEditText = textInputEditText2;
        this.accountNumberInputLayout = textInputLayout2;
        this.header = oppLayoutActionbarBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.routingNumberEditText = textInputEditText3;
        this.routingNumberInputLayout = textInputLayout3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppwaAciInstantPayFragmentBinding bind(android.view.View r13) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.account_holder_edit_text
            android.view.View r1 = X4.b.a(r13, r0)
            r4 = r1
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            if (r4 == 0) goto L_0x0070
            int r0 = com.oppwa.mobile.connect.R.id.account_holder_input_layout
            android.view.View r1 = X4.b.a(r13, r0)
            r5 = r1
            com.google.android.material.textfield.TextInputLayout r5 = (com.google.android.material.textfield.TextInputLayout) r5
            if (r5 == 0) goto L_0x0070
            int r0 = com.oppwa.mobile.connect.R.id.account_number_edit_text
            android.view.View r1 = X4.b.a(r13, r0)
            r6 = r1
            com.google.android.material.textfield.TextInputEditText r6 = (com.google.android.material.textfield.TextInputEditText) r6
            if (r6 == 0) goto L_0x0070
            int r0 = com.oppwa.mobile.connect.R.id.account_number_input_layout
            android.view.View r1 = X4.b.a(r13, r0)
            r7 = r1
            com.google.android.material.textfield.TextInputLayout r7 = (com.google.android.material.textfield.TextInputLayout) r7
            if (r7 == 0) goto L_0x0070
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r13, r0)
            if (r1 == 0) goto L_0x0070
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r13, r0)
            if (r1 == 0) goto L_0x0070
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r9 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r13, r0)
            if (r1 == 0) goto L_0x0070
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r10 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.routing_number_edit_text
            android.view.View r1 = X4.b.a(r13, r0)
            r11 = r1
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            if (r11 == 0) goto L_0x0070
            int r0 = com.oppwa.mobile.connect.R.id.routing_number_input_layout
            android.view.View r1 = X4.b.a(r13, r0)
            r12 = r1
            com.google.android.material.textfield.TextInputLayout r12 = (com.google.android.material.textfield.TextInputLayout) r12
            if (r12 == 0) goto L_0x0070
            com.oppwa.mobile.connect.databinding.OppwaAciInstantPayFragmentBinding r0 = new com.oppwa.mobile.connect.databinding.OppwaAciInstantPayFragmentBinding
            r3 = r13
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0070:
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r13 = r13.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r13 = r1.concat(r13)
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppwaAciInstantPayFragmentBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppwaAciInstantPayFragmentBinding");
    }

    public static OppwaAciInstantPayFragmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppwaAciInstantPayFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.oppwa_aci_instant_pay_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121648a;
    }
}
