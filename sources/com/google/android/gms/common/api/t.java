package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.n;

final class t<R extends n> extends BasePendingResult<R> {

    /* renamed from: p  reason: collision with root package name */
    private final n f48046p;

    public t(g gVar, n nVar) {
        super(gVar);
        this.f48046p = nVar;
    }

    /* access modifiers changed from: protected */
    public final R c(Status status) {
        return this.f48046p;
    }
}
