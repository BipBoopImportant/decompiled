package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.model.response.transaction.AfterpayPacificTransactionResponse;
import java.util.Map;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.provider.parser.transaction.b  reason: case insensitive filesystem */
class C14180b extends C14179a<AfterpayPacificTransactionResponse> {
    C14180b() {
    }

    /* access modifiers changed from: protected */
    public void a(AfterpayPacificTransactionResponse afterpayPacificTransactionResponse, Transaction transaction) {
        Optional.ofNullable(afterpayPacificTransactionResponse.getAdditionalAttributes()).ifPresent(new n(transaction));
        transaction.setTransactionType(TransactionType.ASYNC);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Transaction transaction, AfterpayPacificTransactionResponse.AdditionalAttributes additionalAttributes) {
        Map<String, String> brandSpecificInfo = transaction.getBrandSpecificInfo();
        brandSpecificInfo.put(Transaction.AFTERPAY_PACIFIC_REDIRECT_URL, additionalAttributes.getRedirectCheckoutUrl());
        brandSpecificInfo.put("callbackUrl", additionalAttributes.getCallbackUrl());
        brandSpecificInfo.put("failureCallbackUrl", additionalAttributes.getFailureCallbackUrl());
    }
}
