package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import java.util.function.Consumer;

public final /* synthetic */ class P implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f121045a;

    public /* synthetic */ P(Bundle bundle) {
        this.f121045a = bundle;
    }

    public final void accept(Object obj) {
        this.f121045a.putParcelable("checkoutInfo", (CheckoutInfo) obj);
    }
}
