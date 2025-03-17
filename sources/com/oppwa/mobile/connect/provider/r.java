package com.oppwa.mobile.connect.provider;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f122111b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String[] f122112c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ITransactionListener f122113d;

    public /* synthetic */ r(OppPaymentProvider oppPaymentProvider, String str, String[] strArr, ITransactionListener iTransactionListener) {
        this.f122110a = oppPaymentProvider;
        this.f122111b = str;
        this.f122112c = strArr;
        this.f122113d = iTransactionListener;
    }

    public final void run() {
        this.f122110a.a(this.f122111b, this.f122112c, this.f122113d);
    }
}
