package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7327j1;

final class A1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ R0 f48530e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f48531f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    A1(C7327j1 j1Var, R0 r02) {
        super(j1Var);
        this.f48530e = r02;
        this.f48531f = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f48531f.f48973i)).generateEventId(this.f48530e);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f48530e.o((Bundle) null);
    }
}
