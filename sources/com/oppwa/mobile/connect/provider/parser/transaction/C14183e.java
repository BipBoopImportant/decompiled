package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.model.response.transaction.CashAppPayTransactionResponse;
import java.util.Map;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.provider.parser.transaction.e  reason: case insensitive filesystem */
class C14183e extends C14179a<CashAppPayTransactionResponse> {
    C14183e() {
    }

    /* access modifiers changed from: protected */
    public void a(CashAppPayTransactionResponse cashAppPayTransactionResponse, Transaction transaction) {
        Optional.ofNullable(cashAppPayTransactionResponse.getAdditionalAttributes()).ifPresent(new u(transaction));
        transaction.setTransactionType(TransactionType.ASYNC);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Transaction transaction, CashAppPayTransactionResponse.AdditionalAttributes additionalAttributes) {
        Map<String, String> brandSpecificInfo = transaction.getBrandSpecificInfo();
        brandSpecificInfo.put("clientToken", additionalAttributes.getClientToken());
        brandSpecificInfo.put("callbackUrl", additionalAttributes.getCallbackUrl());
        brandSpecificInfo.put("failureCallbackUrl", additionalAttributes.getFailureCallbackUrl());
    }
}
