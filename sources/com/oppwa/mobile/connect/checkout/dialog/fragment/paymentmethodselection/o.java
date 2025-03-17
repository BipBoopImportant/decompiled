package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import java.util.function.Predicate;

public final /* synthetic */ class o implements Predicate {
    public final boolean test(Object obj) {
        return ((PaymentMethod) obj).isToken();
    }
}
