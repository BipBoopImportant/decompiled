package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentAciInstantpayPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f121608a;
    public final InputLayout accountHolderInputLayout;
    public final InputLayout accountNumberInputLayout;
    public final OppLayoutActionbarBinding header;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final InputLayout routingNumberInputLayout;

    private OppFragmentAciInstantpayPaymentInfoBinding(ConstraintLayout constraintLayout, InputLayout inputLayout, InputLayout inputLayout2, OppLayoutActionbarBinding oppLayoutActionbarBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, InputLayout inputLayout3) {
        this.f121608a = constraintLayout;
        this.accountHolderInputLayout = inputLayout;
        this.accountNumberInputLayout = inputLayout2;
        this.header = oppLayoutActionbarBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.routingNumberInputLayout = inputLayout3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentAciInstantpayPaymentInfoBinding bind(android.view.View r10) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.account_holder_input_layout
            android.view.View r1 = X4.b.a(r10, r0)
            r4 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r4 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r4
            if (r4 == 0) goto L_0x004f
            int r0 = com.oppwa.mobile.connect.R.id.account_number_input_layout
            android.view.View r1 = X4.b.a(r10, r0)
            r5 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r5 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r5
            if (r5 == 0) goto L_0x004f
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r6 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.routing_number_input_layout
            android.view.View r1 = X4.b.a(r10, r0)
            r9 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r9 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r9
            if (r9 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppFragmentAciInstantpayPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentAciInstantpayPaymentInfoBinding
            r3 = r10
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x004f:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentAciInstantpayPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentAciInstantpayPaymentInfoBinding");
    }

    public static OppFragmentAciInstantpayPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentAciInstantpayPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_aci_instantpay_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.f121608a;
    }
}
