package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.chinaunionpay.ChinaUnionPayPaymentParams;

public class ChinaUnionPayPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private InputLayout f120909p;

    private PaymentParams e() {
        String checkoutId = this.f121052e.getCheckoutId();
        if (!g()) {
            return null;
        }
        try {
            return new ChinaUnionPayPaymentParams(checkoutId, this.f120909p.getText());
        } catch (PaymentException unused) {
            return null;
        }
    }

    private void f() {
        this.f120909p.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.cardHolderMaxLength))});
        this.f120909p.getEditText().setInputType(528384);
        this.f120909p.getEditText().setImeOptions(6);
        this.f120909p.setHint(getString(R.string.checkout_layout_hint_card_holder));
        this.f120909p.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_card_holder));
        this.f120909p.setHelperText(getString(R.string.checkout_helper_card_holder));
        this.f120909p.setInputValidator(C14099q.e());
        this.f120909p.setOptional(true);
    }

    private boolean g() {
        return this.f120909p.validate();
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_china_union_pay_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120909p = (InputLayout) view.findViewById(R.id.holder_text_input_layout);
        f();
    }
}
