package com.oppwa.mobile.connect.checkout.dialog;

public final /* synthetic */ class V1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ KlarnaInlinePaymentInfoFragment f121097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f121098b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f121099c;

    public /* synthetic */ V1(KlarnaInlinePaymentInfoFragment klarnaInlinePaymentInfoFragment, String str, String str2) {
        this.f121097a = klarnaInlinePaymentInfoFragment;
        this.f121098b = str;
        this.f121099c = str2;
    }

    public final void run() {
        this.f121097a.b(this.f121098b, this.f121099c);
    }
}
