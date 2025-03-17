package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.Image;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class k0 implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImagesResponseParser f122070a;

    public /* synthetic */ k0(ImagesResponseParser imagesResponseParser) {
        this.f122070a = imagesResponseParser;
    }

    public final Object apply(Object obj) {
        return this.f122070a.a((Map.Entry<String, List<Image>>) (Map.Entry) obj);
    }
}
