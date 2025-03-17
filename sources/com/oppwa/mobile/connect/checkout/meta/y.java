package com.oppwa.mobile.connect.checkout.meta;

import com.samsung.android.sdk.samsungpay.v2.payment.CardInfo;
import java.util.function.Function;

public final /* synthetic */ class y implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f121464a;

    public /* synthetic */ y(a aVar) {
        this.f121464a = aVar;
    }

    public final Object apply(Object obj) {
        return this.f121464a.a((CardInfo) obj);
    }
}
