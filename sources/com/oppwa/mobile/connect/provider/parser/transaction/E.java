package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import java.util.function.Function;

public final /* synthetic */ class E implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f122081a;

    public /* synthetic */ E(h hVar) {
        this.f122081a = hVar;
    }

    public final Object apply(Object obj) {
        return this.f122081a.a((Redirect) obj);
    }
}
