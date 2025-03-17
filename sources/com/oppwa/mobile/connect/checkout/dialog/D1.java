package com.oppwa.mobile.connect.checkout.dialog;

import androidx.lifecycle.L;

public final /* synthetic */ class D1 implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutViewModel f120910a;

    public /* synthetic */ D1(CheckoutViewModel checkoutViewModel) {
        this.f120910a = checkoutViewModel;
    }

    public final void onChanged(Object obj) {
        this.f120910a.a((TransactionResult) obj);
    }
}
