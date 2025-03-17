package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.model.response.transaction.AfterpayPacificTransactionResponse;
import java.util.function.Consumer;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transaction f122090a;

    public /* synthetic */ n(Transaction transaction) {
        this.f122090a = transaction;
    }

    public final void accept(Object obj) {
        C14180b.a(this.f122090a, (AfterpayPacificTransactionResponse.AdditionalAttributes) obj);
    }
}
