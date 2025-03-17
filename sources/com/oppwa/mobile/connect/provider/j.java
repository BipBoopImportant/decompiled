package com.oppwa.mobile.connect.provider;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String[] f122017b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ITransactionListener f122018c;

    public /* synthetic */ j(OppPaymentProvider oppPaymentProvider, String[] strArr, ITransactionListener iTransactionListener) {
        this.f122016a = oppPaymentProvider;
        this.f122017b = strArr;
        this.f122018c = iTransactionListener;
    }

    public final void run() {
        this.f122016a.a(this.f122017b, this.f122018c);
    }
}
