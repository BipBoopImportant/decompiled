package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;

public interface ITransactionListener {
    void binRequestFailed() {
    }

    void binRequestSucceeded(String[] strArr) {
    }

    void brandsValidationRequestFailed(PaymentError paymentError) {
    }

    void brandsValidationRequestSucceeded(BrandsValidation brandsValidation) {
    }

    void imagesRequestFailed() {
    }

    void imagesRequestSucceeded(ImagesRequest imagesRequest) {
    }

    void paymentConfigRequestFailed(PaymentError paymentError) {
    }

    void paymentConfigRequestSucceeded(CheckoutInfo checkoutInfo) {
    }

    void transactionCompleted(Transaction transaction);

    void transactionFailed(Transaction transaction, PaymentError paymentError);
}
