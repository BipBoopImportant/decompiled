package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.c3  reason: case insensitive filesystem */
final class C7266c3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7248a3 f48868a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7266c3(C7248a3 a3Var, Handler handler) {
        super((Handler) null);
        this.f48868a = a3Var;
    }

    public final void onChange(boolean z10) {
        this.f48868a.f48850a.set(true);
    }
}
