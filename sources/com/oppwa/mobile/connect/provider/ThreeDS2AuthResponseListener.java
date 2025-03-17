package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.exception.PaymentError;

@FunctionalInterface
public interface ThreeDS2AuthResponseListener {
    void onResult(Transaction transaction, PaymentError paymentError);
}
