package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.function.Function;

public final /* synthetic */ class u implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentMethod f121239a;

    public /* synthetic */ u(PaymentMethod paymentMethod) {
        this.f121239a = paymentMethod;
    }

    public final Object apply(Object obj) {
        return d.a(this.f121239a, (Token) obj);
    }
}
