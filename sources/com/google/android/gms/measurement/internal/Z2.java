package com.google.android.gms.measurement.internal;

final class Z2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7597g f50022a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f50023b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50024c;

    Z2(S2 s22, C7597g gVar, E5 e52) {
        this.f50022a = gVar;
        this.f50023b = e52;
        this.f50024c = s22;
    }

    public final void run() {
        this.f50024c.f49947a.K0();
        if (this.f50022a.f50136c.x() == null) {
            this.f50024c.f49947a.u(this.f50022a, this.f50023b);
        } else {
            this.f50024c.f49947a.f0(this.f50022a, this.f50023b);
        }
    }
}
