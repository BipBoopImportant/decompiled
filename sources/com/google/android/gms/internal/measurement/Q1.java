package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C7327j1;

final class Q1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f48787e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ R0 f48788f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C7327j1.b f48789g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Q1(C7327j1.b bVar, Activity activity, R0 r02) {
        super(C7327j1.this);
        this.f48787e = activity;
        this.f48788f = r02;
        this.f48789g = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(C7327j1.this.f48973i)).onActivitySaveInstanceStateByScionActivityInfo(C7309h1.x(this.f48787e), this.f48788f, this.f48975b);
    }
}
