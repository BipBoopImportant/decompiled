package com.google.android.gms.measurement.internal;

final class E3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f49585a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49586b;

    E3(C7691t3 t3Var, boolean z10) {
        this.f49585a = z10;
        this.f49586b = t3Var;
    }

    public final void run() {
        boolean o10 = this.f49586b.f50228a.o();
        boolean n10 = this.f49586b.f50228a.n();
        this.f49586b.f50228a.j(this.f49585a);
        if (n10 == this.f49585a) {
            this.f49586b.f50228a.f().I().b("Default data collection state already set to", Boolean.valueOf(this.f49585a));
        }
        if (this.f49586b.f50228a.o() == o10 || this.f49586b.f50228a.o() != this.f49586b.f50228a.n()) {
            this.f49586b.f50228a.f().K().c("Default data collection is different than actual status", Boolean.valueOf(this.f49585a), Boolean.valueOf(o10));
        }
        this.f49586b.N0();
    }
}
