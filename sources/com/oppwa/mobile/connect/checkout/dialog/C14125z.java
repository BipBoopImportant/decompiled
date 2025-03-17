package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.PaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.z  reason: case insensitive filesystem */
class C14125z {

    /* renamed from: a  reason: collision with root package name */
    private final PaymentParams f121359a;

    C14125z(PaymentParams paymentParams) {
        this.f121359a = paymentParams;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f121359a.setShopperResultUrl(str);
    }

    /* access modifiers changed from: package-private */
    public PaymentParams b() {
        return this.f121359a;
    }

    /* access modifiers changed from: package-private */
    public void a(r rVar) {
        this.f121359a.addParam("customParameters[SHOPPER_MSDKIntegrationType]", rVar.a());
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f121359a.addParam("customParameters[SHOPPER_TOUCHID]", "SUCCESS");
    }
}
