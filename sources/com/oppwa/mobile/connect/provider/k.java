package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.provider.listener.ResponseListener;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f122020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ResponseListener f122021c;

    public /* synthetic */ k(OppPaymentProvider oppPaymentProvider, String str, ResponseListener responseListener) {
        this.f122019a = oppPaymentProvider;
        this.f122020b = str;
        this.f122021c = responseListener;
    }

    public final void run() {
        this.f122019a.a(this.f122020b, this.f122021c);
    }
}
