package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.Image;
import java.util.function.Predicate;

public final /* synthetic */ class X implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImagesResponseParser f122060a;

    public /* synthetic */ X(ImagesResponseParser imagesResponseParser) {
        this.f122060a = imagesResponseParser;
    }

    public final boolean test(Object obj) {
        return this.f122060a.b((Image) obj);
    }
}
