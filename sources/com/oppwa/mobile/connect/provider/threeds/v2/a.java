package com.oppwa.mobile.connect.provider.threeds.v2;

import com.oppwa.mobile.connect.exception.PaymentError;
import java.util.concurrent.CountDownLatch;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f122120a = new CountDownLatch(1);

    /* renamed from: b  reason: collision with root package name */
    private PaymentError f122121b;

    public void a() {
        this.f122120a.await();
    }

    public PaymentError b() {
        return this.f122121b;
    }

    public void a(PaymentError paymentError) {
        this.f122121b = paymentError;
        this.f122120a.countDown();
    }
}
