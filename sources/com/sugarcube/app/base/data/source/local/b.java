package com.sugarcube.app.base.data.source.local;

import java.util.function.Predicate;
import nI.C17642l;

public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f122948a;

    public /* synthetic */ b(C17642l lVar) {
        this.f122948a = lVar;
    }

    public final boolean test(Object obj) {
        return CompositionLocalDataSourceImpl.deleteComposition$lambda$1(this.f122948a, obj);
    }
}
