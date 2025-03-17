package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;
import com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView;

public final class OppFragmentBillingAddressBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final LinearLayoutCompat f121609a;
    public final InputLayout cityInputLayout;
    public final AppCompatSpinner countrySpinner;
    public final CheckoutTextView countrySpinnerHelperTextView;
    public final OppLayoutActionbarBinding header;
    public final InputLayout postCodeInputLayout;
    public final InputLayout stateInputLayout;
    public final AppCompatSpinner stateSpinner;
    public final CheckoutTextView stateSpinnerHelperTextView;
    public final InputLayout street1InputLayout;
    public final InputLayout street2InputLayout;

    private OppFragmentBillingAddressBinding(LinearLayoutCompat linearLayoutCompat, InputLayout inputLayout, AppCompatSpinner appCompatSpinner, CheckoutTextView checkoutTextView, OppLayoutActionbarBinding oppLayoutActionbarBinding, InputLayout inputLayout2, InputLayout inputLayout3, AppCompatSpinner appCompatSpinner2, CheckoutTextView checkoutTextView2, InputLayout inputLayout4, InputLayout inputLayout5) {
        this.f121609a = linearLayoutCompat;
        this.cityInputLayout = inputLayout;
        this.countrySpinner = appCompatSpinner;
        this.countrySpinnerHelperTextView = checkoutTextView;
        this.header = oppLayoutActionbarBinding;
        this.postCodeInputLayout = inputLayout2;
        this.stateInputLayout = inputLayout3;
        this.stateSpinner = appCompatSpinner2;
        this.stateSpinnerHelperTextView = checkoutTextView2;
        this.street1InputLayout = inputLayout4;
        this.street2InputLayout = inputLayout5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r0 = com.oppwa.mobile.connect.R.id.header;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentBillingAddressBinding bind(android.view.View r14) {
        /*
            int r0 = com.oppwa.mobile.connect.R.id.city_input_layout
            android.view.View r1 = X4.b.a(r14, r0)
            r4 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r4 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r4
            if (r4 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.country_spinner
            android.view.View r1 = X4.b.a(r14, r0)
            r5 = r1
            androidx.appcompat.widget.AppCompatSpinner r5 = (androidx.appcompat.widget.AppCompatSpinner) r5
            if (r5 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.country_spinner_helper_text_view
            android.view.View r1 = X4.b.a(r14, r0)
            r6 = r1
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r6 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r6
            if (r6 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.header
            android.view.View r1 = X4.b.a(r14, r0)
            if (r1 == 0) goto L_0x0079
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r7 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r1)
            int r0 = com.oppwa.mobile.connect.R.id.post_code_input_layout
            android.view.View r1 = X4.b.a(r14, r0)
            r8 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r8 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r8
            if (r8 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.state_input_layout
            android.view.View r1 = X4.b.a(r14, r0)
            r9 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r9 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r9
            if (r9 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.state_spinner
            android.view.View r1 = X4.b.a(r14, r0)
            r10 = r1
            androidx.appcompat.widget.AppCompatSpinner r10 = (androidx.appcompat.widget.AppCompatSpinner) r10
            if (r10 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.state_spinner_helper_text_view
            android.view.View r1 = X4.b.a(r14, r0)
            r11 = r1
            com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView r11 = (com.oppwa.mobile.connect.checkout.dialog.view.CheckoutTextView) r11
            if (r11 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.street1_input_layout
            android.view.View r1 = X4.b.a(r14, r0)
            r12 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r12 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r12
            if (r12 == 0) goto L_0x0079
            int r0 = com.oppwa.mobile.connect.R.id.street2_input_layout
            android.view.View r1 = X4.b.a(r14, r0)
            r13 = r1
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r13 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r13
            if (r13 == 0) goto L_0x0079
            com.oppwa.mobile.connect.databinding.OppFragmentBillingAddressBinding r0 = new com.oppwa.mobile.connect.databinding.OppFragmentBillingAddressBinding
            r3 = r14
            androidx.appcompat.widget.LinearLayoutCompat r3 = (androidx.appcompat.widget.LinearLayoutCompat) r3
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0079:
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentBillingAddressBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentBillingAddressBinding");
    }

    public static OppFragmentBillingAddressBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentBillingAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_billing_address, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayoutCompat getRoot() {
        return this.f121609a;
    }
}
