package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import java.util.function.Consumer;

public final /* synthetic */ class t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Transaction f122094a;

    public /* synthetic */ t(Transaction transaction) {
        this.f122094a = transaction;
    }

    public final void accept(Object obj) {
        this.f122094a.getBrandSpecificInfo().put(Transaction.BANCONTACT_LINK_APP_SCHEME_URL_KEY, (String) obj);
    }
}
