package com.google.android.gms.measurement.internal;

final class Y3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C f50008a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f50009b;

    Y3(C7691t3 t3Var, C c10) {
        this.f50008a = c10;
        this.f50009b = t3Var;
    }

    public final void run() {
        if (this.f50009b.e().x(this.f50008a)) {
            this.f50009b.f().I().b("Setting DMA consent(FE)", this.f50008a);
            if (this.f50009b.s().l0()) {
                this.f50009b.s().g0();
            } else {
                this.f50009b.s().Y(false);
            }
        } else {
            this.f50009b.f().H().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.f50008a.a()));
        }
    }
}
