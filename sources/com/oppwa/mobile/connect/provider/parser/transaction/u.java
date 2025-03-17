package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.model.response.transaction.CashAppPayTransactionResponse;
import java.util.function.Consumer;

public final /* synthetic */ class u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transaction f122095a;

    public /* synthetic */ u(Transaction transaction) {
        this.f122095a = transaction;
    }

    public final void accept(Object obj) {
        C14183e.a(this.f122095a, (CashAppPayTransactionResponse.AdditionalAttributes) obj);
    }
}
