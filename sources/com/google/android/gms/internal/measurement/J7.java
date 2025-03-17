package com.google.android.gms.internal.measurement;

import java.util.List;

public final class J7 extends C7361n {

    /* renamed from: c  reason: collision with root package name */
    private C7253b f48699c;

    public J7(C7253b bVar) {
        super("internal.registerCallback");
        this.f48699c = bVar;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        C7265c2.g(this.f49017a, 3, list);
        String i10 = d3Var.b(list.get(0)).i();
        C7400s b10 = d3Var.b(list.get(1));
        if (b10 instanceof C7408t) {
            C7400s b11 = d3Var.b(list.get(2));
            if (b11 instanceof r) {
                r rVar = (r) b11;
                if (rVar.j("type")) {
                    this.f48699c.c(i10, rVar.j("priority") ? C7265c2.i(rVar.zza("priority").h().doubleValue()) : 1000, (C7408t) b10, rVar.zza("type").i());
                    return C7400s.f49052k0;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
