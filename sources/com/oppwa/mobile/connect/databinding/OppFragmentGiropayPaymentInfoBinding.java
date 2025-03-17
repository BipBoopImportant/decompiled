package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentGiropayPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121615a;
    public final InputLayout bicOrBankCodeInputLayout;
    public final OppLayoutActionbarBinding header;
    public final InputLayout ibanInputLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final ScrollView paymentInfoScrollView;

    private OppFragmentGiropayPaymentInfoBinding(RelativeLayout relativeLayout, InputLayout inputLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, InputLayout inputLayout2, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, ScrollView scrollView) {
        this.f121615a = relativeLayout;
        this.bicOrBankCodeInputLayout = inputLayout;
        this.header = oppLayoutActionbarBinding;
        this.ibanInputLayout = inputLayout2;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = scrollView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentGiropayPaymentInfoBinding bind(android.view.View r10) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.bic_or_bank_code_input_layout
            android.view.View r1 = X4.b.a(r10, r0)
            r4 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r4 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r4
            if (r4 == 0) goto L_0x004f
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r5 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.iban_input_layout
            android.view.View r1 = X4.b.a(r10, r0)
            r6 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r6 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r6
            if (r6 == 0) goto L_0x004f
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r10, r0)
            if (r1 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r10, r0)
            r9 = r1
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            if (r9 == 0) goto L_0x004f
            com.oppwa.mobile.connect.databinding.OppFragmentGiropayPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentGiropayPaymentInfoBinding
            r3 = r10
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentGiropayPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentGiropayPaymentInfoBinding");
    }

    public static OppFragmentGiropayPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentGiropayPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_giropay_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121615a;
    }
}
