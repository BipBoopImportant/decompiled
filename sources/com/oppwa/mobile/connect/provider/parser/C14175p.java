package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.BrandInfo;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.p  reason: case insensitive filesystem */
public final /* synthetic */ class C14175p implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BrandInfo f122073a;

    public /* synthetic */ C14175p(BrandInfo brandInfo) {
        this.f122073a = brandInfo;
    }

    public final void accept(Object obj) {
        this.f122073a.setCustomUiRequired(((Boolean) obj).booleanValue());
    }
}
