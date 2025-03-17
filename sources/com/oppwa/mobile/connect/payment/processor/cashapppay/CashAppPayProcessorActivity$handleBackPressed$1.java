package com.oppwa.mobile.connect.payment.processor.cashapppay;

import androidx.activity.v;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.Transaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayProcessorActivity$handleBackPressed$1", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CashAppPayProcessorActivity$handleBackPressed$1 extends v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CashAppPayProcessorActivity f121926a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CashAppPayProcessorActivity$handleBackPressed$1(CashAppPayProcessorActivity cashAppPayProcessorActivity) {
        super(true);
        this.f121926a = cashAppPayProcessorActivity;
    }

    public void handleOnBackPressed() {
        CashAppPayProcessorActivity cashAppPayProcessorActivity = this.f121926a;
        Transaction transaction = cashAppPayProcessorActivity.getCashAppPayViewModel$oppwa_mobile_6_19_0_release().getTransaction();
        PaymentError cashAppPayError = PaymentError.getCashAppPayError("Transaction state is unknown, request payment status to get the actual state.");
        C17542s.i(cashAppPayError, "getCashAppPayError(\n    …e.\"\n                    )");
        cashAppPayProcessorActivity.onError$oppwa_mobile_6_19_0_release(transaction, cashAppPayError);
    }
}
