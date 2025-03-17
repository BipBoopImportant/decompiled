package com.oppwa.mobile.connect.exception;

import java.util.Objects;

public class PaymentException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentError f121666a;

    public PaymentException(PaymentError paymentError) {
        super(paymentError.getErrorCode() + ": " + paymentError.getErrorMessage());
        this.f121666a = paymentError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f121666a.equals(((PaymentException) obj).f121666a);
    }

    public PaymentError getError() {
        return this.f121666a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121666a});
    }

    public PaymentException(PaymentError paymentError, Throwable th2) {
        super(paymentError.getErrorCode() + ": " + paymentError.getErrorMessage(), th2);
        this.f121666a = paymentError;
    }
}
