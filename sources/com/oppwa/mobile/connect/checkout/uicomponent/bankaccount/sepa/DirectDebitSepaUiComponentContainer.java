package com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa;

import android.text.InputFilter;
import android.widget.EditText;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.util.InputFormatter;
import com.oppwa.mobile.connect.checkout.uicomponent.util.filter.AlphaNumericInputFilter;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.AccountHolderValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.IbanValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.view.EditTextWrapper;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import java.util.Optional;

public class DirectDebitSepaUiComponentContainer extends PaymentDetailsUiComponentContainer<DirectDebitSepaUiComponent> implements DirectDebitSepaUiComponentInteraction {

    /* renamed from: i  reason: collision with root package name */
    private boolean f121483i;

    /* renamed from: j  reason: collision with root package name */
    private EditTextWrapper f121484j;

    /* renamed from: k  reason: collision with root package name */
    private EditTextWrapper f121485k;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(EditText editText, String str) {
        ((DirectDebitSepaUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(EditText editText, String str) {
        ((DirectDebitSepaUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException u() {
        return new PaymentException(PaymentError.getUiComponentError("Missing account holder."));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PaymentException v() {
        return new PaymentException(PaymentError.getUiComponentError("Missing iban."));
    }

    private String w() {
        return (String) Optional.ofNullable(this.f121484j.getInput()).orElseThrow(new a());
    }

    private String x() {
        return (String) Optional.ofNullable(this.f121485k.getInput()).orElseThrow(new d());
    }

    private void y() {
        EditText accountHolderEditText = ((DirectDebitSepaUiComponent) j()).getAccountHolderEditText();
        if (this.f121484j == null) {
            this.f121484j = new EditTextWrapper(accountHolderEditText, 528384).setInputValidator(new AccountHolderValidator(requireContext(), new b(this, accountHolderEditText))).setMaxLength(getResources().getInteger(R.integer.accountHolderMaxLength));
        }
    }

    private void z() {
        EditText ibanEditText = ((DirectDebitSepaUiComponent) j()).getIbanEditText();
        if (this.f121485k == null) {
            this.f121485k = new EditTextWrapper(ibanEditText, 524432).setInputMask(InputFormatter.IBAN_MASK).setInputValidator(new IbanValidator(requireContext(), new c(this, ibanEditText)));
            ibanEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new AlphaNumericInputFilter(true), new InputFilter.LengthFilter(38)});
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        y();
        z();
        ((DirectDebitSepaUiComponent) j()).onUiComponentCreated(this);
    }

    /* access modifiers changed from: protected */
    public PaymentParams m() {
        return BankAccountPaymentParams.createDirectDebitSepaPaymentParams(getCheckoutSettings().getCheckoutId(), w(), x(), this.f121483i);
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        this.f121484j.validateInput();
        this.f121485k.validateInput();
        return this.f121484j.isInputValid() && this.f121485k.isInputValid();
    }

    public void setTokenizationEnabled(boolean z10) {
        this.f121483i = z10;
    }
}
