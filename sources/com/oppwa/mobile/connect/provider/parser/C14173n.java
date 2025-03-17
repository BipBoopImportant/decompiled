package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.BrandValidation;
import java.util.function.Function;

/* renamed from: com.oppwa.mobile.connect.provider.parser.n  reason: case insensitive filesystem */
public final /* synthetic */ class C14173n implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BrandsValidationResponseParser f122072a;

    public /* synthetic */ C14173n(BrandsValidationResponseParser brandsValidationResponseParser) {
        this.f122072a = brandsValidationResponseParser;
    }

    public final Object apply(Object obj) {
        return this.f122072a.a((BrandValidation) obj);
    }
}
