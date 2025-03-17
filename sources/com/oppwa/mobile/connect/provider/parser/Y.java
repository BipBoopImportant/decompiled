package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.ImageDetail;
import java.util.Map;
import java.util.function.Predicate;

public final /* synthetic */ class Y implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImagesResponseParser f122061a;

    public /* synthetic */ Y(ImagesResponseParser imagesResponseParser) {
        this.f122061a = imagesResponseParser;
    }

    public final boolean test(Object obj) {
        return this.f122061a.b((Map.Entry<String, ImageDetail>) (Map.Entry) obj);
    }
}
