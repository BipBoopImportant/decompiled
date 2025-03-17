package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import java.util.List;
import java.util.function.Function;

public final /* synthetic */ class s implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14182d f122093a;

    public /* synthetic */ s(C14182d dVar) {
        this.f122093a = dVar;
    }

    public final Object apply(Object obj) {
        return this.f122093a.a((List<Redirect.Parameter>) (List) obj);
    }
}
