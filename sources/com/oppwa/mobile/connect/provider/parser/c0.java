package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.Image;
import java.util.function.Function;

public final /* synthetic */ class c0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImagesResponseParser f122062a;

    public /* synthetic */ c0(ImagesResponseParser imagesResponseParser) {
        this.f122062a = imagesResponseParser;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(this.f122062a.a((Image) obj));
    }
}
