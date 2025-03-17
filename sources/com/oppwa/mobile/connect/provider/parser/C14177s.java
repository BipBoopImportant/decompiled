package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CardBrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.s  reason: case insensitive filesystem */
public final /* synthetic */ class C14177s implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardBrandInfo f122076a;

    public /* synthetic */ C14177s(CardBrandInfo cardBrandInfo) {
        this.f122076a = cardBrandInfo;
    }

    public final void accept(Object obj) {
        this.f122076a.setMobilePhoneRequired(((Boolean) obj).booleanValue());
    }
}
