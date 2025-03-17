package com.oppwa.mobile.connect.databinding;

import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.dialog.BillingAddressLayout;
import com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout;
import com.oppwa.mobile.connect.checkout.dialog.CardNumberInputLayout;
import com.oppwa.mobile.connect.checkout.dialog.DateInputLayout;
import com.oppwa.mobile.connect.checkout.dialog.InputLayout;

public final class OppFragmentCardPaymentInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RelativeLayout f121611a;
    public final BillingAddressLayout billingAddressLayout;
    public final LinearLayout brandSelectionAndCvvLayout;
    public final CardBrandSelectionLayout cardBrandSelectionLayout;
    public final LinearLayout cardDataLayout;
    public final ImageView cardScanButton;
    public final LinearLayout countryCodeAndPhoneNumber;
    public final InputLayout countryCodeInputLayout;
    public final InputLayout cvvInputLayout;
    public final LinearLayout expiryDateAndCvv;
    public final DateInputLayout expiryDateInputLayout;
    public final OppLayoutActionbarBinding header;
    public final InputLayout holderInputLayout;
    public final OppItemCardBrandsBinding icBrand;
    public final CardNumberInputLayout numberInputLayout;
    public final RelativeLayout numberInputWrapperLayout;
    public final FrameLayout numberOfInstallmentsFrame;
    public final OppLayoutInstallmentsDropdownBinding numberOfInstallmentsLayout;
    public final OppLayoutCheckoutPaybuttonBinding paymentButtonLayout;
    public final OppLayoutPaymentInfoHeaderBinding paymentInfoHeader;
    public final ScrollView paymentInfoScrollView;
    public final InputLayout phoneNumberInputLayout;
    public final OppLayoutStorePaymentInfoBinding storePaymentInfoLayout;
    public final FrameLayout storePaymentInfoLayoutFrame;

    private OppFragmentCardPaymentInfoBinding(RelativeLayout relativeLayout, BillingAddressLayout billingAddressLayout2, LinearLayout linearLayout, CardBrandSelectionLayout cardBrandSelectionLayout2, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, InputLayout inputLayout, InputLayout inputLayout2, LinearLayout linearLayout4, DateInputLayout dateInputLayout, OppLayoutActionbarBinding oppLayoutActionbarBinding, InputLayout inputLayout3, OppItemCardBrandsBinding oppItemCardBrandsBinding, CardNumberInputLayout cardNumberInputLayout, RelativeLayout relativeLayout2, FrameLayout frameLayout, OppLayoutInstallmentsDropdownBinding oppLayoutInstallmentsDropdownBinding, OppLayoutCheckoutPaybuttonBinding oppLayoutCheckoutPaybuttonBinding, OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding, ScrollView scrollView, InputLayout inputLayout4, OppLayoutStorePaymentInfoBinding oppLayoutStorePaymentInfoBinding, FrameLayout frameLayout2) {
        this.f121611a = relativeLayout;
        this.billingAddressLayout = billingAddressLayout2;
        this.brandSelectionAndCvvLayout = linearLayout;
        this.cardBrandSelectionLayout = cardBrandSelectionLayout2;
        this.cardDataLayout = linearLayout2;
        this.cardScanButton = imageView;
        this.countryCodeAndPhoneNumber = linearLayout3;
        this.countryCodeInputLayout = inputLayout;
        this.cvvInputLayout = inputLayout2;
        this.expiryDateAndCvv = linearLayout4;
        this.expiryDateInputLayout = dateInputLayout;
        this.header = oppLayoutActionbarBinding;
        this.holderInputLayout = inputLayout3;
        this.icBrand = oppItemCardBrandsBinding;
        this.numberInputLayout = cardNumberInputLayout;
        this.numberInputWrapperLayout = relativeLayout2;
        this.numberOfInstallmentsFrame = frameLayout;
        this.numberOfInstallmentsLayout = oppLayoutInstallmentsDropdownBinding;
        this.paymentButtonLayout = oppLayoutCheckoutPaybuttonBinding;
        this.paymentInfoHeader = oppLayoutPaymentInfoHeaderBinding;
        this.paymentInfoScrollView = scrollView;
        this.phoneNumberInputLayout = inputLayout4;
        this.storePaymentInfoLayout = oppLayoutStorePaymentInfoBinding;
        this.storePaymentInfoLayoutFrame = frameLayout2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r1 = com.oppwa.mobile.connect.R.id.header;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0082, code lost:
        r1 = com.oppwa.mobile.connect.R.id.ic_brand;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b2, code lost:
        r1 = com.oppwa.mobile.connect.R.id.number_of_installments_layout;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        r1 = com.oppwa.mobile.connect.R.id.store_payment_info_layout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.oppwa.mobile.connect.databinding.OppFragmentCardPaymentInfoBinding bind(android.view.View r28) {
        /*
            r0 = r28
            int r1 = com.oppwa.mobile.connect.R.id.billing_address_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r5 = r2
            com.oppwa.mobile.connect.checkout.dialog.BillingAddressLayout r5 = (com.oppwa.mobile.connect.checkout.dialog.BillingAddressLayout) r5
            if (r5 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.brand_selection_and_cvv_layout
            android.view.View r1 = X4.b.a(r0, r1)
            r6 = r1
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            int r1 = com.oppwa.mobile.connect.R.id.card_brand_selection_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r7 = r2
            com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout r7 = (com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout) r7
            if (r7 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.card_data_layout
            android.view.View r1 = X4.b.a(r0, r1)
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            int r1 = com.oppwa.mobile.connect.R.id.card_scan_button
            android.view.View r2 = X4.b.a(r0, r1)
            r9 = r2
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.country_code_and_phone_number
            android.view.View r2 = X4.b.a(r0, r1)
            r10 = r2
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            if (r10 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.country_code_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r11 = r2
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r11 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r11
            if (r11 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.cvv_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r12 = r2
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r12 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r12
            if (r12 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.expiry_date_and_cvv
            android.view.View r1 = X4.b.a(r0, r1)
            r13 = r1
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            int r1 = com.oppwa.mobile.connect.R.id.expiry_date_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r14 = r2
            com.oppwa.mobile.connect.checkout.dialog.DateInputLayout r14 = (com.oppwa.mobile.connect.checkout.dialog.DateInputLayout) r14
            if (r14 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding r15 = com.oppwa.mobile.connect.databinding.OppLayoutActionbarBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.holder_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r16 = r2
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r16 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r16
            if (r16 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.ic_brand
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppItemCardBrandsBinding r17 = com.oppwa.mobile.connect.databinding.OppItemCardBrandsBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.number_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r18 = r2
            com.oppwa.mobile.connect.checkout.dialog.CardNumberInputLayout r18 = (com.oppwa.mobile.connect.checkout.dialog.CardNumberInputLayout) r18
            if (r18 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.number_input_wrapper_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r19 = r2
            android.widget.RelativeLayout r19 = (android.widget.RelativeLayout) r19
            if (r19 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.number_of_installments_frame
            android.view.View r2 = X4.b.a(r0, r1)
            r20 = r2
            android.widget.FrameLayout r20 = (android.widget.FrameLayout) r20
            if (r20 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.number_of_installments_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppLayoutInstallmentsDropdownBinding r21 = com.oppwa.mobile.connect.databinding.OppLayoutInstallmentsDropdownBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_button_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding r22 = com.oppwa.mobile.connect.databinding.OppLayoutCheckoutPaybuttonBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_info_header
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding r23 = com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.payment_info_scroll_view
            android.view.View r2 = X4.b.a(r0, r1)
            r24 = r2
            android.widget.ScrollView r24 = (android.widget.ScrollView) r24
            if (r24 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.phone_number_input_layout
            android.view.View r2 = X4.b.a(r0, r1)
            r25 = r2
            com.oppwa.mobile.connect.checkout.dialog.InputLayout r25 = (com.oppwa.mobile.connect.checkout.dialog.InputLayout) r25
            if (r25 == 0) goto L_0x0110
            int r1 = com.oppwa.mobile.connect.R.id.store_payment_info_layout
            android.view.View r2 = X4.b.a(r0, r1)
            if (r2 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding r26 = com.oppwa.mobile.connect.databinding.OppLayoutStorePaymentInfoBinding.bind(r2)
            int r1 = com.oppwa.mobile.connect.R.id.store_payment_info_layout_frame
            android.view.View r2 = X4.b.a(r0, r1)
            r27 = r2
            android.widget.FrameLayout r27 = (android.widget.FrameLayout) r27
            if (r27 == 0) goto L_0x0110
            com.oppwa.mobile.connect.databinding.OppFragmentCardPaymentInfoBinding r1 = new com.oppwa.mobile.connect.databinding.OppFragmentCardPaymentInfoBinding
            r3 = r1
            r4 = r0
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x0110:
            android.content.res.Resources r0 = r28.getResources()
            java.lang.String r0 = r0.getResourceName(r1)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Missing required view with ID: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.databinding.OppFragmentCardPaymentInfoBinding.bind(android.view.View):com.oppwa.mobile.connect.databinding.OppFragmentCardPaymentInfoBinding");
    }

    public static OppFragmentCardPaymentInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static OppFragmentCardPaymentInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.opp_fragment_card_payment_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.f121611a;
    }
}
