package com.oppwa.mobile.connect.checkout.dialog;

import java.util.Map;

public final /* synthetic */ class P1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IdealPaymentInfoFragment f121047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f121048b;

    public /* synthetic */ P1(IdealPaymentInfoFragment idealPaymentInfoFragment, Map map) {
        this.f121047a = idealPaymentInfoFragment;
        this.f121048b = map;
    }

    public final void run() {
        this.f121047a.a(this.f121048b);
    }
}
