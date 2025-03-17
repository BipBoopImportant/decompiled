package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.j  reason: case insensitive filesystem */
public final /* synthetic */ class C14169j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122068a;

    public /* synthetic */ C14169j(CardBrandInfo cardBrandInfo) {
        this.f122068a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122068a.setPattern((String) obj);
    }
}
