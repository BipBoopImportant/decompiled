package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.k  reason: case insensitive filesystem */
public final /* synthetic */ class C14170k implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122069a;

    public /* synthetic */ C14170k(CardBrandInfo cardBrandInfo) {
        this.f122069a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122069a.setCvvLength(((Integer) obj).intValue());
    }
}
