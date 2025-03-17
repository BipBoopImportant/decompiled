package com.oppwa.mobile.connect.provider.listener;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.model.BinInfo;

@FunctionalInterface
public interface BinInfoListener {
    void onResult(BinInfo binInfo, PaymentError paymentError);
}
