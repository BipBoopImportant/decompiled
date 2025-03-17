package com.oppwa.mobile.connect.payment.processor.cashapppay;

import app.cash.paykit.core.CashAppPayListener;
import app.cash.paykit.core.CashAppPayState;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayViewModel$cashAppPayListener$1", "Lapp/cash/paykit/core/CashAppPayListener;", "Lapp/cash/paykit/core/CashAppPayState;", "newState", "LXH/N;", "cashAppPayStateDidChange", "(Lapp/cash/paykit/core/CashAppPayState;)V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CashAppPayViewModel$cashAppPayListener$1 implements CashAppPayListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CashAppPayViewModel f121940a;

    CashAppPayViewModel$cashAppPayListener$1(CashAppPayViewModel cashAppPayViewModel) {
        this.f121940a = cashAppPayViewModel;
    }

    public void cashAppPayStateDidChange(CashAppPayState cashAppPayState) {
        C17542s.j(cashAppPayState, "newState");
        this.f121940a.cashAppStateChange$oppwa_mobile_6_19_0_release(cashAppPayState);
    }
}
