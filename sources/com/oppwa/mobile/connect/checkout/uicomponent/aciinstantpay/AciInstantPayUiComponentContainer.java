package com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay;

import android.text.InputFilter;
import android.widget.EditText;
import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.checkout.uicomponent.util.filter.AlphaNumericInputFilter;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.AccountHolderValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.AccountNumberValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.RoutingNumberValidator;
import com.oppwa.mobile.connect.checkout.uicomponent.util.view.EditTextWrapper;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;

public class AciInstantPayUiComponentContainer extends PaymentDetailsUiComponentContainer<AciInstantPayUiComponent> implements AciInstantPayUiComponentInteraction {

    /* renamed from: i  reason: collision with root package name */
    private EditTextWrapper f121474i;

    /* renamed from: j  reason: collision with root package name */
    private EditTextWrapper f121475j;

    /* renamed from: k  reason: collision with root package name */
    private EditTextWrapper f121476k;

    /* access modifiers changed from: private */
    public /* synthetic */ void a(EditText editText, String str) {
        ((AciInstantPayUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(EditText editText, String str) {
        ((AciInstantPayUiComponent) j()).onInputValidation(editText, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(EditText editText, String str) {
        ((AciInstantPayUiComponent) j()).onInputValidation(editText, str);
    }

    private void u() {
        EditText accountHolderEditText = ((AciInstantPayUiComponent) j()).getAccountHolderEditText();
        if (this.f121474i == null) {
            this.f121474i = new EditTextWrapper(accountHolderEditText, ImageMetadata.LENS_APERTURE).setInputValidator(new AccountHolderValidator(requireContext(), new b(this, accountHolderEditText))).setMaxLength(getResources().getInteger(R.integer.accountHolderMaxLength));
        }
    }

    private void v() {
        EditText accountNumberEditText = ((AciInstantPayUiComponent) j()).getAccountNumberEditText();
        if (this.f121475j == null) {
            this.f121475j = new EditTextWrapper(accountNumberEditText, ImageMetadata.LENS_APERTURE).setInputValidator(new AccountNumberValidator(requireContext(), new c(this, accountNumberEditText)));
            accountNumberEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new AlphaNumericInputFilter(true), new InputFilter.LengthFilter(getResources().getInteger(R.integer.accountNumberMaxLength))});
        }
    }

    private void w() {
        EditText routingNumberEditText = ((AciInstantPayUiComponent) j()).getRoutingNumberEditText();
        if (this.f121476k == null) {
            this.f121476k = new EditTextWrapper(routingNumberEditText, ImageMetadata.LENS_APERTURE).setInputValidator(new RoutingNumberValidator(requireContext(), new a(this, routingNumberEditText)));
            routingNumberEditText.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new AlphaNumericInputFilter(true), new InputFilter.LengthFilter(getResources().getInteger(R.integer.routingNumberMaxLength))});
        }
    }

    /* access modifiers changed from: protected */
    public void i() {
        u();
        v();
        w();
        ((AciInstantPayUiComponent) j()).onUiComponentCreated(this);
    }

    /* access modifiers changed from: protected */
    public PaymentParams m() {
        return BankAccountPaymentParams.createAciInstantPayPaymentParams(getCheckoutSettings().getCheckoutId(), this.f121474i.getInput(), this.f121475j.getInput(), this.f121476k.getInput(), getCheckoutSettings().getAciInstantPayCountry());
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        this.f121474i.validateInput();
        this.f121475j.validateInput();
        this.f121476k.validateInput();
        return this.f121474i.isInputValid() && this.f121475j.isInputValid() && this.f121476k.isInputValid();
    }
}
