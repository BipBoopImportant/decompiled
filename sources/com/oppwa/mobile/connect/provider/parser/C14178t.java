package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.t  reason: case insensitive filesystem */
public final /* synthetic */ class C14178t implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122077a;

    public /* synthetic */ C14178t(CardBrandInfo cardBrandInfo) {
        this.f122077a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122077a.setValidation((String) obj);
    }
}
