package com.oppwa.mobile.connect.checkout.dialog;

import android.view.View;

public final /* synthetic */ class g2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodSelectionFragment f121242a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f121243b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C14066f f121244c;

    public /* synthetic */ g2(PaymentMethodSelectionFragment paymentMethodSelectionFragment, View view, C14066f fVar) {
        this.f121242a = paymentMethodSelectionFragment;
        this.f121243b = view;
        this.f121244c = fVar;
    }

    public final void run() {
        this.f121242a.a(this.f121243b, this.f121244c);
    }
}
