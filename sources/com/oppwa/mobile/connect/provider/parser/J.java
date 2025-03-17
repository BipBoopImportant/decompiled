package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Consumer;

public final /* synthetic */ class J implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfoResponseParser f122055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfo.Builder f122056b;

    public /* synthetic */ J(CheckoutInfoResponseParser checkoutInfoResponseParser, CheckoutInfo.Builder builder) {
        this.f122055a = checkoutInfoResponseParser;
        this.f122056b = builder;
    }

    public final void accept(Object obj) {
        this.f122055a.a(this.f122056b, (CheckoutInfoResponse.Config.WorkflowSpecificConfig) obj);
    }
}
