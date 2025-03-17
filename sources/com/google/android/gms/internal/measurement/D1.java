package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    private final E f48635a;

    /* renamed from: b  reason: collision with root package name */
    final C7275d3 f48636b;

    /* renamed from: c  reason: collision with root package name */
    final C7275d3 f48637c;

    /* renamed from: d  reason: collision with root package name */
    private final C7295f5 f48638d;

    public D1() {
        E e10 = new E();
        this.f48635a = e10;
        C7275d3 d3Var = new C7275d3((C7275d3) null, e10);
        this.f48637c = d3Var;
        this.f48636b = d3Var.d();
        C7295f5 f5Var = new C7295f5();
        this.f48638d = f5Var;
        d3Var.h("require", new M7(f5Var));
        f5Var.b("internal.platform", new C7291f1());
        d3Var.h("runtime.counter", new C7334k(Double.valueOf(0.0d)));
    }

    public final C7400s a(C7275d3 d3Var, U2... u2Arr) {
        C7400s sVar = C7400s.f49052k0;
        for (U2 a10 : u2Arr) {
            sVar = C7294f4.a(a10);
            C7265c2.b(this.f48637c);
            if ((sVar instanceof C7424v) || (sVar instanceof C7408t)) {
                sVar = this.f48635a.a(d3Var, sVar);
            }
        }
        return sVar;
    }

    public final void b(String str, Callable<? extends C7361n> callable) {
        this.f48638d.b(str, callable);
    }
}
