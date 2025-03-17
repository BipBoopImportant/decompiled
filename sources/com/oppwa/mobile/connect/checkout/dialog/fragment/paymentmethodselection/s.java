package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.Card;
import java.util.function.Function;

public final /* synthetic */ class s implements Function {
    public final Object apply(Object obj) {
        return Boolean.valueOf(CardPaymentParams.isCardExpired(((Card) obj).getExpiryMonth(), ((Card) obj).getExpiryYear()));
    }
}
