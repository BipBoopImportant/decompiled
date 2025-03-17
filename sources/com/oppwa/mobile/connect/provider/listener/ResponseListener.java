package com.oppwa.mobile.connect.provider.listener;

import com.oppwa.mobile.connect.exception.PaymentError;

@FunctionalInterface
public interface ResponseListener<T> {
    void onResult(T t10, PaymentError paymentError);
}
