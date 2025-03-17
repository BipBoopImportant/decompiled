package com.google.firebase.perf.metrics;

import Ec.a;
import Gc.k;
import Gc.m;
import java.util.Arrays;
import java.util.List;

class b {

    /* renamed from: a  reason: collision with root package name */
    private final Trace f68607a;

    b(Trace trace) {
        this.f68607a = trace;
    }

    /* access modifiers changed from: package-private */
    public m a() {
        m.b P10 = m.O().Q(this.f68607a.e()).O(this.f68607a.g().e()).P(this.f68607a.g().d(this.f68607a.d()));
        for (a next : this.f68607a.c().values()) {
            P10.M(next.b(), next.a());
        }
        List<Trace> h10 = this.f68607a.h();
        if (!h10.isEmpty()) {
            for (Trace bVar : h10) {
                P10.I(new b(bVar).a());
            }
        }
        P10.L(this.f68607a.getAttributes());
        k[] b10 = a.b(this.f68607a.f());
        if (b10 != null) {
            P10.E(Arrays.asList(b10));
        }
        return (m) P10.g();
    }
}
