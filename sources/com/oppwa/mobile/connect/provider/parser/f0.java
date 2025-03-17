package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.Image;
import java.util.List;
import java.util.function.Function;

public final /* synthetic */ class f0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImagesResponseParser f122065a;

    public /* synthetic */ f0(ImagesResponseParser imagesResponseParser) {
        this.f122065a = imagesResponseParser;
    }

    public final Object apply(Object obj) {
        return this.f122065a.a((List<Image>) (List) obj);
    }
}
