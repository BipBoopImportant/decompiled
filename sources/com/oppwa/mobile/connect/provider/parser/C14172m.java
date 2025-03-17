package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.m  reason: case insensitive filesystem */
public final /* synthetic */ class C14172m implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122071a;

    public /* synthetic */ C14172m(CardBrandInfo cardBrandInfo) {
        this.f122071a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122071a.setExpiryDateOptional(((Boolean) obj).booleanValue());
    }
}
