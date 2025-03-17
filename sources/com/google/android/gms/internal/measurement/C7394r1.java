package com.google.android.gms.internal.measurement;

import K9.C6620s;
import com.google.android.gms.internal.measurement.C7327j1;

/* renamed from: com.google.android.gms.internal.measurement.r1  reason: case insensitive filesystem */
final class C7394r1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Boolean f49049e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f49050f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7394r1(C7327j1 j1Var, Boolean bool) {
        super(j1Var);
        this.f49049e = bool;
        this.f49050f = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f49049e != null) {
            ((Q0) C6620s.l(this.f49050f.f48973i)).setMeasurementEnabled(this.f49049e.booleanValue(), this.f48974a);
        } else {
            ((Q0) C6620s.l(this.f49050f.f48973i)).clearMeasurementEnabled(this.f48974a);
        }
    }
}
