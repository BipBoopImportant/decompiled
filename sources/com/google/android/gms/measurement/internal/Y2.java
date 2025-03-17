package com.google.android.gms.measurement.internal;

final class Y2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7597g f50006a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S2 f50007b;

    Y2(S2 s22, C7597g gVar) {
        this.f50006a = gVar;
        this.f50007b = s22;
    }

    public final void run() {
        this.f50007b.f49947a.K0();
        if (this.f50006a.f50136c.x() == null) {
            this.f50007b.f49947a.t(this.f50006a);
        } else {
            this.f50007b.f49947a.e0(this.f50006a);
        }
    }
}
