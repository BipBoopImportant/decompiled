package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.model.response.transaction.TransactionResponse;
import java.util.function.Consumer;

public final /* synthetic */ class m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14179a f122088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transaction f122089b;

    public /* synthetic */ m(C14179a aVar, Transaction transaction) {
        this.f122088a = aVar;
        this.f122089b = transaction;
    }

    public final void accept(Object obj) {
        this.f122088a.a(this.f122089b, (TransactionResponse) obj);
    }
}
