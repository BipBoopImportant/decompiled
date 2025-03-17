package com.oppwa.mobile.connect.checkout.dialog.fragment.card;

import com.oppwa.mobile.connect.checkout.dialog.CardBrandSelectionLayout;

public final /* synthetic */ class h implements CardBrandSelectionLayout.Listener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardPaymentDetailsFragment f121196a;

    public /* synthetic */ h(CardPaymentDetailsFragment cardPaymentDetailsFragment) {
        this.f121196a = cardPaymentDetailsFragment;
    }

    public final void onCardBrandSelected(String str) {
        this.f121196a.b(str);
    }
}
