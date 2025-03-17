package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.v  reason: case insensitive filesystem */
public final /* synthetic */ class C14185v implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122101a;

    public /* synthetic */ C14185v(CardBrandInfo cardBrandInfo) {
        this.f122101a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122101a.setLuhnCheckRequired(((Boolean) obj).booleanValue());
    }
}
