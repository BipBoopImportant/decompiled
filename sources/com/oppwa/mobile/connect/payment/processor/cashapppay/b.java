package com.oppwa.mobile.connect.payment.processor.cashapppay;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f121941a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CashAppPayViewModel f121942b;

    public /* synthetic */ b(String str, CashAppPayViewModel cashAppPayViewModel) {
        this.f121941a = str;
        this.f121942b = cashAppPayViewModel;
    }

    public final void run() {
        CashAppPayViewModel.a(this.f121941a, this.f121942b);
    }
}
