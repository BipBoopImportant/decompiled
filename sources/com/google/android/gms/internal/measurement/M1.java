package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.app.Activity;
import com.google.android.gms.internal.measurement.C7327j1;

final class M1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f48746e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7327j1.b f48747f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    M1(C7327j1.b bVar, Activity activity) {
        super(C7327j1.this);
        this.f48746e = activity;
        this.f48747f = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(C7327j1.this.f48973i)).onActivityStartedByScionActivityInfo(C7309h1.x(this.f48746e), this.f48975b);
    }
}
