package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, A> f48643a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private U f48644b = new U();

    public E() {
        b(new C7448y());
        b(new D());
        b(new F());
        b(new J());
        b(new L());
        b(new S());
        b(new X());
    }

    private final void b(A a10) {
        for (Z z10 : a10.f48528a) {
            this.f48643a.put(z10.toString(), a10);
        }
    }

    public final C7400s a(C7275d3 d3Var, C7400s sVar) {
        C7265c2.b(d3Var);
        if (!(sVar instanceof C7424v)) {
            return sVar;
        }
        C7424v vVar = (C7424v) sVar;
        ArrayList<C7400s> b10 = vVar.b();
        String a10 = vVar.a();
        return (this.f48643a.containsKey(a10) ? this.f48643a.get(a10) : this.f48644b).b(a10, d3Var, b10);
    }
}
