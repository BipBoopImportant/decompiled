package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Discount;
import java.util.HashMap;
import java.util.function.BiConsumer;

public final /* synthetic */ class B implements BiConsumer {
    public final void accept(Object obj, Object obj2) {
        ((HashMap) obj).put(((Discount) obj2).displayName(), (Discount) obj2);
    }
}
