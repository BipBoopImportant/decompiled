package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.model.response.transaction.KlarnaTransactionResponse;
import java.util.function.Function;

public final /* synthetic */ class C implements Function {
    public final Object apply(Object obj) {
        return ((KlarnaTransactionResponse.AdditionalAttributes) obj).getConnectorId();
    }
}
