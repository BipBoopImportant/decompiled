package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7327j1;

/* renamed from: com.google.android.gms.internal.measurement.t1  reason: case insensitive filesystem */
final class C7410t1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f49077e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f49078f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7410t1(C7327j1 j1Var, Bundle bundle) {
        super(j1Var);
        this.f49077e = bundle;
        this.f49078f = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f49078f.f48973i)).setConsentThirdParty(this.f49077e, this.f48974a);
    }
}
