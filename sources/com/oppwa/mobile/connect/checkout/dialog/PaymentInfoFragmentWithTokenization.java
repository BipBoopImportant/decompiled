package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutStorePaymentDetailsMode;

public abstract class PaymentInfoFragmentWithTokenization extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private CheckBox f121063p;

    private boolean e() {
        return CheckoutConstants.ENDPOINT_REGISTRATION.equals(this.f121053f.getEndpoint()) || CheckoutConstants.ENDPOINT_OMNITOKEN.equals(this.f121053f.getEndpoint());
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        if (e() || this.f121052e.getStorePaymentDetailsMode() != CheckoutStorePaymentDetailsMode.ALWAYS) {
            return this.f121063p.isChecked();
        }
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f121063p = (CheckBox) view.findViewById(R.id.store_payment_info_checkbox);
        if (e()) {
            this.f121060m.setText(R.string.checkout_layout_text_register);
        } else if (this.f121052e.getStorePaymentDetailsMode() == CheckoutStorePaymentDetailsMode.PROMPT && this.f121056i == null) {
            view.findViewById(R.id.store_payment_info_layout).setVisibility(0);
        }
    }
}
