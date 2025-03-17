package com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection;

import android.os.Bundle;
import android.view.View;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import com.oppwa.mobile.connect.exception.PaymentError;
import java.util.Optional;

public class PaymentMethodSelectionUiComponentContainer extends UiComponentContainer<PaymentMethodSelectionUiComponent> implements PaymentMethodSelectionUiComponentInteraction {
    public static final String ARG_PAYMENT_METHODS = "paymentMethods";
    public static final String RESULT_PAYMENT_METHOD = "paymentMethod";

    /* renamed from: e  reason: collision with root package name */
    private PaymentMethod[] f121539e;

    public static String getRequestKey() {
        return PaymentMethodSelectionUiComponentContainer.class.getName();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException m() {
        return new IllegalStateException("Missing payment methods.");
    }

    private PaymentMethod[] n() {
        return (PaymentMethod[]) Optional.ofNullable(this.f121539e).orElseThrow(new a());
    }

    public void closeCheckout() {
        l();
    }

    public PaymentMethod[] getPaymentMethods() {
        return n();
    }

    /* access modifiers changed from: protected */
    public void i() {
        if (this.f121539e == null) {
            a(PaymentError.getUiComponentError("Missing payment methods."));
        } else {
            ((PaymentMethodSelectionUiComponent) j()).onUiComponentCreated(this);
        }
    }

    public void onPaymentMethodSelected(PaymentMethod paymentMethod) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(RESULT_PAYMENT_METHOD, paymentMethod);
        a(getRequestKey(), bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121539e = (PaymentMethod[]) requireArguments().getParcelableArray(ARG_PAYMENT_METHODS);
    }
}
