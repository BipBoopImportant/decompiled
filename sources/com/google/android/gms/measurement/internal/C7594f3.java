package com.google.android.gms.measurement.internal;

import K9.C6620s;

/* renamed from: com.google.android.gms.measurement.internal.f3  reason: case insensitive filesystem */
final class C7594f3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f50130a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S2 f50131b;

    C7594f3(S2 s22, E5 e52) {
        this.f50130a = e52;
        this.f50131b = s22;
    }

    public final void run() {
        this.f50131b.f49947a.K0();
        C7728y5 J32 = this.f50131b.f49947a;
        E5 e52 = this.f50130a;
        J32.q().k();
        J32.L0();
        C6620s.f(e52.f49596a);
        J32.y0(e52);
        J32.v0(e52);
    }
}
