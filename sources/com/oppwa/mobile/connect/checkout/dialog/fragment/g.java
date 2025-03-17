package com.oppwa.mobile.connect.checkout.dialog.fragment;

import android.graphics.Bitmap;
import com.oppwa.mobile.connect.databinding.OppLayoutPaymentInfoHeaderBinding;
import java.util.function.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OppLayoutPaymentInfoHeaderBinding f121230a;

    public /* synthetic */ g(OppLayoutPaymentInfoHeaderBinding oppLayoutPaymentInfoHeaderBinding) {
        this.f121230a = oppLayoutPaymentInfoHeaderBinding;
    }

    public final void accept(Object obj) {
        PaymentDetailsFragment.a(this.f121230a, (Bitmap) obj);
    }
}
