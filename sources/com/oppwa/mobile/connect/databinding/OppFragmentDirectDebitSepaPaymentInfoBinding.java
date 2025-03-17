package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentDirectDebitSepaPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121614a;
    public final OppLayoutActionbarBinding header;
    public final InputLayout holderInputLayout;
    public final InputLayout ibanInputLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final LinearLayout paymentInfoLayout;
    public final ScrollView paymentInfoScrollView;
    public final OppLayoutStorePaymentInfoBinding storePaymentInfoLayout;

    private OppFragmentDirectDebitSepaPaymentInfoBinding(RelativeLayout relativeLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, InputLayout inputLayout, InputLayout inputLayout2, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, LinearLayout linearLayout, ScrollView scrollView, OppLayoutStorePaymentInfoBinding oppLayoutStorePaymentInfoBinding) {
        this.f121614a = relativeLayout;
        this.header = oppLayoutActionbarBinding;
        this.holderInputLayout = inputLayout;
        this.ibanInputLayout = inputLayout2;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoLayout = linearLayout;
        this.paymentInfoScrollView = scrollView;
        this.storePaymentInfoLayout = oppLayoutStorePaymentInfoBinding;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        r0 = com.oppwa.mobile.connect.R.id.store_payment_info_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = com.oppwa.mobile.connect.R.id.payment_button_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentDirectDebitSepaPaymentInfoBinding bind(android.view.View r12) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r4 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.holder_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r5 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r5 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r5
            if (r5 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.iban_input_layout
            android.view.View r1 = X4.b.a(r12, r0)
            r6 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r6 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r6
            if (r6 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r8 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_layout
            android.view.View r0 = X4.b.a(r12, r0)
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            int r0 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r1 = X4.b.a(r12, r0)
            r10 = r1
            android.widget.ScrollView r10 = (android.widget.ScrollView) r10
            if (r10 == 0) goto L_0x0064
            int r0 = com.oppwa.mobile.connect.R.id.store_payment_info_layout
            android.view.View r1 = X4.b.a(r12, r0)
            if (r1 == 0) goto L_0x0064
            com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding r11 = com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding.bind(r1)
            com.oppwa.mobile.connect.databinding.OppFragmentDirectDebitSepaPaymentInfoBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentDirectDebitSepaPaymentInfoBinding
            r3 = r12
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0064:
            android.content.res.Resources r12 = r12.getResources()
            java.lang.String r12 = r12.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r12 = r1.concat(r12)
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentDirectDebitSepaPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentDirectDebitSepaPaymentInfoBinding");
    }

    public static OppFragmentDirectDebitSepaPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentDirectDebitSepaPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_direct_debit_sepa_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121614a;
    }
}
