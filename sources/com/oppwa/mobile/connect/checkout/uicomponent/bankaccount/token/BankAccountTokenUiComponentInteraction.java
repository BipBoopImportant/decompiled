package com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.token;

import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.payment.token.BankAccount;

public interface BankAccountTokenUiComponentInteraction extends PaymentDetailsUiComponentInteraction {
    BankAccount getBankAccount();

    String getBrand();
}
