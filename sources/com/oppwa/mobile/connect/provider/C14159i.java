package com.oppwa.mobile.connect.provider;

/* renamed from: com.oppwa.mobile.connect.provider.i  reason: case insensitive filesystem */
public final /* synthetic */ class C14159i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppPaymentProvider f122013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f122014b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IdealBanksListener f122015c;

    public /* synthetic */ C14159i(OppPaymentProvider oppPaymentProvider, String str, IdealBanksListener idealBanksListener) {
        this.f122013a = oppPaymentProvider;
        this.f122014b = str;
        this.f122015c = idealBanksListener;
    }

    public final void run() {
        this.f122013a.a(this.f122014b, this.f122015c);
    }
}
