package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.provider.Transaction;

public final /* synthetic */ class I1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutViewModel f120954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f120955b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f120956c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Transaction f120957d;

    public /* synthetic */ I1(CheckoutViewModel checkoutViewModel, String str, String str2, Transaction transaction) {
        this.f120954a = checkoutViewModel;
        this.f120955b = str;
        this.f120956c = str2;
        this.f120957d = transaction;
    }

    public final void run() {
        this.f120954a.a(this.f120955b, this.f120956c, this.f120957d);
    }
}
