package com.oppwa.mobile.connect.checkout.uicomponent;

import android.os.Bundle;
import android.view.View;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponent;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Optional;

public abstract class PaymentDetailsUiComponentContainer<T extends UiComponent<?>> extends UiComponentContainer<T> implements PaymentDetailsUiComponentInteraction {
    public static final String ARG_BRANDS_VALIDATION = "brandsValidation";
    public static final String ARG_PAYMENT_BRAND = "paymentBrand";
    public static final String ARG_PAYMENT_TOKEN = "paymentToken";
    public static final String ARG_SKIP_PAYMENT_METHOD_SELECTION = "skipPaymentMethodSelection";
    public static final String RESULT_PAYMENT_PARAMS = "paymentParams";
    public static final String RESULT_TOKENIZED = "tokenized";

    /* renamed from: e  reason: collision with root package name */
    protected boolean f121465e;

    /* renamed from: f  reason: collision with root package name */
    private BrandsValidation f121466f;

    /* renamed from: g  reason: collision with root package name */
    private String f121467g;

    /* renamed from: h  reason: collision with root package name */
    private Token f121468h;

    public static String getRequestKey() {
        return PaymentDetailsUiComponentContainer.class.getName();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException o() {
        return new IllegalStateException("Missing brands validation.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException p() {
        return new IllegalStateException("Missing payment brand.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException q() {
        return new IllegalStateException("Missing payment token.");
    }

    public void closeCheckout() {
        l();
    }

    public boolean isRegistrationOnly() {
        String endpoint = getCheckoutInfo().getEndpoint();
        return CheckoutConstants.ENDPOINT_REGISTRATION.equals(endpoint) || CheckoutConstants.ENDPOINT_OMNITOKEN.equals(endpoint);
    }

    /* access modifiers changed from: protected */
    public abstract PaymentParams m();

    /* access modifiers changed from: protected */
    public abstract boolean n();

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121466f = (BrandsValidation) requireArguments().getParcelable("brandsValidation");
        Token token = (Token) requireArguments().getParcelable(ARG_PAYMENT_TOKEN);
        this.f121468h = token;
        this.f121467g = (String) Optional.ofNullable(token).map(new e()).orElse(requireArguments().getString(ARG_PAYMENT_BRAND));
        this.f121465e = requireArguments().getBoolean(ARG_SKIP_PAYMENT_METHOD_SELECTION);
    }

    /* access modifiers changed from: protected */
    public BrandsValidation r() {
        return (BrandsValidation) Optional.ofNullable(this.f121466f).orElseThrow(new c());
    }

    /* access modifiers changed from: protected */
    public String s() {
        return (String) Optional.ofNullable(this.f121467g).orElseThrow(new a());
    }

    public boolean shouldSkipPaymentMethodSelection() {
        return this.f121465e;
    }

    public void submitPaymentDetails() {
        if (n()) {
            Bundle bundle = new Bundle();
            try {
                bundle.putParcelable(RESULT_PAYMENT_PARAMS, m());
                Optional.ofNullable(this.f121468h).ifPresent(new d(bundle));
            } catch (PaymentException e10) {
                bundle.putParcelable(UiComponentContainer.RESULT_ERROR, e10.getError());
            }
            a(getRequestKey(), bundle);
        }
    }

    /* access modifiers changed from: protected */
    public Token t() {
        return (Token) Optional.ofNullable(this.f121468h).orElseThrow(new b());
    }
}
