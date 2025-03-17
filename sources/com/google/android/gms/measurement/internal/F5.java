package com.google.android.gms.measurement.internal;

import K9.C6620s;
import java.util.concurrent.Callable;

final class F5 implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49626a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7728y5 f49627b;

    F5(C7728y5 y5Var, E5 e52) {
        this.f49626a = e52;
        this.f49627b = y5Var;
    }

    public final /* synthetic */ Object call() {
        if (!this.f49627b.b0((String) C6620s.l(this.f49626a.f49596a)).x() || !C7671q3.p(this.f49626a.f49616u).x()) {
            this.f49627b.f().I().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        C7676r2 g10 = this.f49627b.g(this.f49626a);
        if (g10 != null) {
            return g10.m();
        }
        this.f49627b.f().J().a("App info was null when attempting to get app instance id");
        return null;
    }
}
