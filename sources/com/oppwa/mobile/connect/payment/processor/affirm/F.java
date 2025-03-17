package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Item;
import java.util.HashMap;
import java.util.function.BiConsumer;

public final /* synthetic */ class F implements BiConsumer {
    public final void accept(Object obj, Object obj2) {
        ((HashMap) obj).put(((Item) obj2).sku(), (Item) obj2);
    }
}
