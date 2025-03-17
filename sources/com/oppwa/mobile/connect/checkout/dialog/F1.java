package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.dialog.C14093o;
import com.oppwa.mobile.connect.provider.OppPaymentProvider;
import com.oppwa.mobile.connect.provider.Transaction;

public final /* synthetic */ class F1 implements C14093o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutViewModel f120920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transaction f120921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f120922c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f120923d;

    public /* synthetic */ F1(CheckoutViewModel checkoutViewModel, Transaction transaction, OppPaymentProvider oppPaymentProvider, String str) {
        this.f120920a = checkoutViewModel;
        this.f120921b = transaction;
        this.f120922c = oppPaymentProvider;
        this.f120923d = str;
    }

    public final void a(String str) {
        this.f120920a.a(this.f120921b, this.f120922c, this.f120923d, str);
    }
}
