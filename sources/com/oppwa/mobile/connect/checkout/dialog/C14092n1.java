package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.n1  reason: case insensitive filesystem */
public final /* synthetic */ class C14092n1 implements CardBrandSelectionLayout.Listener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardPaymentInfoFragment f121278a;

    public /* synthetic */ C14092n1(CardPaymentInfoFragment cardPaymentInfoFragment) {
        this.f121278a = cardPaymentInfoFragment;
    }

    public final void onCardBrandSelected(String str) {
        this.f121278a.c(str);
    }
}
