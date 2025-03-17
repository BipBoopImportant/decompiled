package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.u  reason: case insensitive filesystem */
public final /* synthetic */ class C14184u implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122100a;

    public /* synthetic */ C14184u(CardBrandInfo cardBrandInfo) {
        this.f122100a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122100a.setDetection((String) obj);
    }
}
