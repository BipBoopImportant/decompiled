package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.model.response.transaction.AmazonPayTransactionResponse;
import java.util.function.Consumer;

public final /* synthetic */ class o implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14181c f122091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transaction f122092b;

    public /* synthetic */ o(C14181c cVar, Transaction transaction) {
        this.f122091a = cVar;
        this.f122092b = transaction;
    }

    public final void accept(Object obj) {
        this.f122091a.a(this.f122092b, (AmazonPayTransactionResponse.AdditionalAttributes) obj);
    }
}
