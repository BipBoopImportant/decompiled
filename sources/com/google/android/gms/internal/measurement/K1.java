package com.google.android.gms.internal.measurement;

import K9.C6620s;
import com.google.android.gms.internal.measurement.C7327j1;

final class K1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7327j1.c f48702e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f48703f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    K1(C7327j1 j1Var, C7327j1.c cVar) {
        super(j1Var);
        this.f48702e = cVar;
        this.f48703f = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f48703f.f48973i)).registerOnMeasurementEventListener(this.f48702e);
    }
}
