package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.model.response.transaction.DefaultTransactionResponse;
import java.util.function.Function;

public final /* synthetic */ class v implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f122096a;

    public /* synthetic */ v(f fVar) {
        this.f122096a = fVar;
    }

    public final Object apply(Object obj) {
        return this.f122096a.a((DefaultTransactionResponse.AdditionalAttributes) obj);
    }
}
