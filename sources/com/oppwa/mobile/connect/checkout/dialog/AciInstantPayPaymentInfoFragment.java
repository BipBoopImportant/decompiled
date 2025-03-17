package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.databinding.OppFragmentAciInstantpayPaymentInfoBinding;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;

public class AciInstantPayPaymentInfoFragment extends PaymentInfoFragment {

    /* renamed from: p  reason: collision with root package name */
    private final C14113v f120799p = new C14113v(' ', (String) null);

    /* renamed from: q  reason: collision with root package name */
    private OppFragmentAciInstantpayPaymentInfoBinding f120800q;

    private void e() {
        this.f120800q.accountHolderInputLayout.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.accountHolderMaxLength))});
        this.f120800q.accountHolderInputLayout.getEditText().setInputType(ImageMetadata.LENS_APERTURE);
        this.f120800q.accountHolderInputLayout.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        this.f120800q.accountHolderInputLayout.getEditText().setImeOptions(5);
        this.f120800q.accountHolderInputLayout.setInputValidator(C14099q.b());
    }

    private void f() {
        InputFilter[] inputFilterArr = {new InputFilter.LengthFilter(getResources().getInteger(R.integer.accountNumberMaxLength))};
        this.f120800q.accountNumberInputLayout.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_account_number));
        this.f120800q.accountNumberInputLayout.getEditText().setInputType(ImageMetadata.LENS_APERTURE);
        this.f120800q.accountNumberInputLayout.getEditText().setImeOptions(5);
        this.f120800q.accountNumberInputLayout.getEditText().setFilters(inputFilterArr);
        this.f120800q.accountNumberInputLayout.setInputValidator(C14099q.a(this.f120799p, true));
    }

    private void g() {
        this.f120800q.accountHolderInputLayout.setHint(getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        this.f120800q.accountNumberInputLayout.setHint(getString(R.string.checkout_layout_hint_account_number));
        this.f120800q.routingNumberInputLayout.setHint(getString(R.string.checkout_layout_hint_routing_number));
    }

    private void h() {
        this.f120800q.routingNumberInputLayout.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_routing_number));
        this.f120800q.routingNumberInputLayout.getEditText().setImeOptions(6);
        this.f120800q.routingNumberInputLayout.setInputValidator(C14099q.h());
    }

    private boolean i() {
        boolean validate = this.f120800q.accountHolderInputLayout.validate();
        if (!this.f120800q.accountNumberInputLayout.validate()) {
            validate = false;
        }
        if (!this.f120800q.routingNumberInputLayout.validate()) {
            return false;
        }
        return validate;
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        if (!i()) {
            return null;
        }
        try {
            return BankAccountPaymentParams.createAciInstantPayPaymentParams(this.f121052e.getCheckoutId(), this.f120800q.accountHolderInputLayout.getText(), this.f120800q.accountNumberInputLayout.getText(), this.f120800q.routingNumberInputLayout.getText(), this.f121052e.getAciInstantPayCountry());
        } catch (PaymentException unused) {
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OppFragmentAciInstantpayPaymentInfoBinding inflate = OppFragmentAciInstantpayPaymentInfoBinding.inflate(layoutInflater, viewGroup, false);
        this.f120800q = inflate;
        return inflate.getRoot();
    }

    public void onStart() {
        super.onStart();
        g();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        e();
        f();
        h();
    }
}
