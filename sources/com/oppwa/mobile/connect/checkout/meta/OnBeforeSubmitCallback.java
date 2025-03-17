package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcelable;

public interface OnBeforeSubmitCallback extends Parcelable {

    @FunctionalInterface
    public interface Listener {
        void onComplete(PaymentDetails paymentDetails);
    }

    void onBeforeSubmit(PaymentDetails paymentDetails, Listener listener);
}
