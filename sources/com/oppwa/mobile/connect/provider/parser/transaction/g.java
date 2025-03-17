package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.model.response.transaction.KlarnaTransactionResponse;
import java.util.Map;
import java.util.Optional;

class g extends C14179a<KlarnaTransactionResponse> {
    g() {
    }

    /* access modifiers changed from: protected */
    public void a(KlarnaTransactionResponse klarnaTransactionResponse, Transaction transaction) {
        Map<String, String> brandSpecificInfo = transaction.getBrandSpecificInfo();
        Optional.ofNullable(klarnaTransactionResponse.getClientToken()).ifPresent(new z(brandSpecificInfo));
        Optional.ofNullable(klarnaTransactionResponse.getCallbackUrl()).ifPresent(new A(brandSpecificInfo));
        Optional.ofNullable(klarnaTransactionResponse.getFailureCallbackUrl()).ifPresent(new B(brandSpecificInfo));
        Optional.ofNullable(klarnaTransactionResponse.getAdditionalAttributes()).map(new C()).ifPresent(new D(brandSpecificInfo));
        transaction.setTransactionType(TransactionType.ASYNC);
    }
}
