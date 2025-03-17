package com.oppwa.mobile.connect.provider;

public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f122040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ITransactionListener f122041c;

    public /* synthetic */ o(OppPaymentProvider oppPaymentProvider, String str, ITransactionListener iTransactionListener) {
        this.f122039a = oppPaymentProvider;
        this.f122040b = str;
        this.f122041c = iTransactionListener;
    }

    public final void run() {
        this.f122039a.a(this.f122040b, this.f122041c);
    }
}
