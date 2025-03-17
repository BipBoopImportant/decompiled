package com.google.android.gms.internal.measurement;

import K9.C6620s;
import com.google.android.gms.internal.measurement.C7327j1;

/* renamed from: com.google.android.gms.internal.measurement.w1  reason: case insensitive filesystem */
final class C7434w1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Runnable f49110e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f49111f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7434w1(C7327j1 j1Var, Runnable runnable) {
        super(j1Var);
        this.f49110e = runnable;
        this.f49111f = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f49111f.f48973i)).retrieveAndUploadBatches(new C7458z1(this, this.f49110e));
    }
}
