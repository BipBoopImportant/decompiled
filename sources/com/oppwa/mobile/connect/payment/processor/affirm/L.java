package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Item;
import java.util.function.Consumer;

public final /* synthetic */ class L implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Item.Builder f121906a;

    public /* synthetic */ L(Item.Builder builder) {
        this.f121906a = builder;
    }

    public final void accept(Object obj) {
        Item.Builder unused = this.f121906a.setQty((Integer) obj);
    }
}
