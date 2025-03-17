package com.oppwa.mobile.connect.provider.parser;

import java.util.function.Function;

/* renamed from: com.oppwa.mobile.connect.provider.parser.d  reason: case insensitive filesystem */
public final /* synthetic */ class C14163d implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractResponseParser f122063a;

    public /* synthetic */ C14163d(AbstractResponseParser abstractResponseParser) {
        this.f122063a = abstractResponseParser;
    }

    public final Object apply(Object obj) {
        return this.f122063a.a((Class<?>) (Class) obj);
    }
}
