package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d  reason: case insensitive filesystem */
final class C7176d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7173c f48351a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7176d(C7173c cVar, Handler handler) {
        super((Handler) null);
        this.f48351a = cVar;
    }

    public final void onChange(boolean z10) {
        this.f48351a.d();
        this.f48351a.f();
    }
}
