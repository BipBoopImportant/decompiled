package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class E4 extends C7361n {

    /* renamed from: c  reason: collision with root package name */
    private final C7271d f48649c;

    public E4(C7271d dVar) {
        super("internal.eventLogger");
        this.f48649c = dVar;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        C7265c2.g(this.f49017a, 3, list);
        String i10 = d3Var.b(list.get(0)).i();
        long a10 = (long) C7265c2.a(d3Var.b(list.get(1)).h().doubleValue());
        C7400s b10 = d3Var.b(list.get(2));
        this.f48649c.c(i10, a10, b10 instanceof r ? C7265c2.e((r) b10) : new HashMap());
        return C7400s.f49052k0;
    }
}
