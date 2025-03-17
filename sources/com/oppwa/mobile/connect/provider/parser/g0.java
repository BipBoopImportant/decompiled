package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.ImageDetail;
import java.util.function.Consumer;

public final /* synthetic */ class g0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageDetail f122066a;

    public /* synthetic */ g0(ImageDetail imageDetail) {
        this.f122066a = imageDetail;
    }

    public final void accept(Object obj) {
        this.f122066a.setUrl((String) obj);
    }
}
