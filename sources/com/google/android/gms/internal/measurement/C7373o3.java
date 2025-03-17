package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.o3  reason: case insensitive filesystem */
final class C7373o3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7356m3 f49029a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7373o3(C7356m3 m3Var, Handler handler) {
        super((Handler) null);
        this.f49029a = m3Var;
    }

    public final void onChange(boolean z10) {
        this.f49029a.e();
    }
}
