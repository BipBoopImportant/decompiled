package com.oppwa.mobile.connect.provider;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transaction f122036b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f122037c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ITransactionListener f122038d;

    public /* synthetic */ n(OppPaymentProvider oppPaymentProvider, Transaction transaction, String str, ITransactionListener iTransactionListener) {
        this.f122035a = oppPaymentProvider;
        this.f122036b = transaction;
        this.f122037c = str;
        this.f122038d = iTransactionListener;
    }

    public final void run() {
        this.f122035a.a(this.f122036b, this.f122037c, this.f122038d);
    }
}
