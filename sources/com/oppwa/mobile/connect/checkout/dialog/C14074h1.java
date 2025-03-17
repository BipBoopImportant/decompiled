package com.oppwa.mobile.connect.checkout.dialog;

import android.view.View;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.h1  reason: case insensitive filesystem */
public final /* synthetic */ class C14074h1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardPaymentInfoFragment f121250a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f121251b;

    public /* synthetic */ C14074h1(CardPaymentInfoFragment cardPaymentInfoFragment, View view) {
        this.f121250a = cardPaymentInfoFragment;
        this.f121251b = view;
    }

    public final void run() {
        this.f121250a.f(this.f121251b);
    }
}
