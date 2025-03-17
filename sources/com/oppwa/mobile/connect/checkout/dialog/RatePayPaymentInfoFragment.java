package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.ratepay.RatePayPaymentParams;

public class RatePayPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private DateOfBirthInputLayout f121079p;

    private void d(View view) {
        this.f121079p = (DateOfBirthInputLayout) view.findViewById(R.id.date_of_birth_input_layout);
        f();
    }

    private PaymentParams e() {
        if (this.f121079p.validate() && this.f121079p.getDateOfBirth() != null) {
            try {
                return new RatePayPaymentParams(this.f121052e.getCheckoutId(), this.f121079p.getDateOfBirth());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void f() {
        this.f121079p.setHint(getString(R.string.checkout_layout_hint_date_of_birth));
        this.f121079p.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_date_of_birth));
        this.f121079p.setHelperText(getString(R.string.checkout_helper_birth_date));
        this.f121079p.getEditText().setImeOptions(6);
        this.f121079p.setInputValidator();
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_ratepay_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        d(view);
    }
}
