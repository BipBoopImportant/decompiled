package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class D implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122080a;

    public /* synthetic */ D(Map map) {
        this.f122080a = map;
    }

    public final void accept(Object obj) {
        this.f122080a.put(Transaction.KLARNA_INLINE_INITIAL_TRANSACTION_ID, (String) obj);
    }
}
