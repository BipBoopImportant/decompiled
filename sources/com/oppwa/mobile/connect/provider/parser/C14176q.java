package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.BrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.q  reason: case insensitive filesystem */
public final /* synthetic */ class C14176q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BrandInfo f122074a;

    public /* synthetic */ C14176q(BrandInfo brandInfo) {
        this.f122074a = brandInfo;
    }

    public final void accept(Object obj) {
        this.f122074a.setLabel((String) obj);
    }
}
