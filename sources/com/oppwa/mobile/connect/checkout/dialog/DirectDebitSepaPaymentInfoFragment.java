package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;

public class DirectDebitSepaPaymentInfoFragment extends PaymentInfoFragmentWithTokenization {

    /* renamed from: q  reason: collision with root package name */
    private InputLayout f120913q;

    /* renamed from: r  reason: collision with root package name */
    private InputLayout f120914r;

    /* renamed from: s  reason: collision with root package name */
    private final C14113v f120915s = new C14113v(' ', InputFormatter.IBAN_MASK);

    /* renamed from: t  reason: collision with root package name */
    private int f120916t = 0;

    private PaymentParams g() {
        String checkoutId = this.f121052e.getCheckoutId();
        String text = this.f120913q.getText();
        String text2 = this.f120914r.getText();
        if (!m()) {
            return null;
        }
        try {
            return BankAccountPaymentParams.createDirectDebitSepaPaymentParams(checkoutId, text, this.f120915s.a(text2), f());
        } catch (PaymentException unused) {
            return null;
        }
    }

    private PaymentParams h() {
        try {
            return new TokenPaymentParams(this.f121052e.getCheckoutId(), this.f121056i.getTokenId(), this.f121055h);
        } catch (PaymentException unused) {
            return null;
        }
    }

    private void i() {
        this.f120913q.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(getResources().getInteger(R.integer.accountHolderMaxLength))});
        this.f120913q.getEditText().setInputType(528384);
        this.f120913q.setHint(getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        this.f120913q.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        this.f120913q.getEditText().setImeOptions(5);
        this.f120913q.setInputValidator(C14099q.b());
    }

    private void j() {
        this.f120914r.getEditText().setFilters(new InputFilter[]{new InputFilter.AllCaps(), new C14048a(false), new InputFilter.LengthFilter(38)});
        this.f120914r.getEditText().setInputType(524432);
        this.f120914r.setHint(getString(R.string.checkout_layout_hint_direct_debit_sepa_iban));
        this.f120914r.getEditText().setContentDescription(getString(R.string.checkout_layout_hint_direct_debit_sepa_iban));
        this.f120914r.setHelperText(getString(R.string.checkout_helper_iban));
        this.f120914r.getEditText().setImeOptions(6);
        this.f120914r.setInputValidator(C14099q.a(this.f120915s, false));
        if (this.f120916t == 1) {
            this.f120914r.setGravityForRTLLanguages();
        }
        this.f120914r.getEditText().addTextChangedListener(this.f120915s);
    }

    private void k() {
        this.f120913q.setNotEditableText(this.f121056i.getBankAccount().getHolder());
        this.f120913q.setHint(getString(R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
    }

    private void l() {
        this.f120914r.getEditText().addTextChangedListener(this.f120915s);
        this.f120914r.setNotEditableText(this.f121056i.getBankAccount().getIban());
        this.f120914r.setHint(getString(R.string.checkout_layout_hint_direct_debit_sepa_iban));
    }

    private boolean m() {
        boolean validate = this.f120913q.validate();
        if (!this.f120914r.validate()) {
            return false;
        }
        return validate;
    }

    /* access modifiers changed from: protected */
    public PaymentParams b() {
        return this.f121056i == null ? g() : h();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.opp_fragment_direct_debit_sepa_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f120916t = getResources().getConfiguration().getLayoutDirection();
        this.f120913q = (InputLayout) view.findViewById(R.id.holder_input_layout);
        this.f120914r = (InputLayout) view.findViewById(R.id.iban_input_layout);
        if (this.f121056i == null) {
            i();
            j();
            return;
        }
        k();
        l();
    }
}
