package com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.token;

import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.BankAccount;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;
import java.util.Optional;

public class BankAccountTokenUiComponentContainer extends PaymentDetailsUiComponentContainer<BankAccountTokenUiComponent> implements BankAccountTokenUiComponentInteraction {
    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalStateException u() {
        return new IllegalStateException("Missing bank account token.");
    }

    public BankAccount getBankAccount() {
        return (BankAccount) Optional.ofNullable(t().getBankAccount()).orElseThrow(new a());
    }

    public String getBrand() {
        return s();
    }

    /* access modifiers changed from: protected */
    public void i() {
        ((BankAccountTokenUiComponent) j()).onUiComponentCreated(this);
    }

    /* access modifiers changed from: protected */
    public PaymentParams m() {
        return new TokenPaymentParams(getCheckoutSettings().getCheckoutId(), t().getTokenId(), getBrand());
    }

    /* access modifiers changed from: protected */
    public boolean n() {
        return true;
    }
}
