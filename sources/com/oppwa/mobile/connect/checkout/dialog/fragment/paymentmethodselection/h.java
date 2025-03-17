package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import com.oppwa.mobile.connect.checkout.dialog.BaseRecyclerViewAdapter;
import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction;

public final /* synthetic */ class h implements BaseRecyclerViewAdapter.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodSelectionUiComponentInteraction f121232a;

    public /* synthetic */ h(PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
        this.f121232a = paymentMethodSelectionUiComponentInteraction;
    }

    public final void onItemSelected(Object obj) {
        this.f121232a.onPaymentMethodSelected((PaymentMethod) obj);
    }
}
