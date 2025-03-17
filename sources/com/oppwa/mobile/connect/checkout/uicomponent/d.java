package com.oppwa.mobile.connect.checkout.uicomponent;

import android.os.Bundle;
import java.util.function.Consumer;

public final /* synthetic */ class d implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f121534a;

    public /* synthetic */ d(Bundle bundle) {
        this.f121534a = bundle;
    }

    public final void accept(Object obj) {
        this.f121534a.putBoolean(PaymentDetailsUiComponentContainer.RESULT_TOKENIZED, true);
    }
}
