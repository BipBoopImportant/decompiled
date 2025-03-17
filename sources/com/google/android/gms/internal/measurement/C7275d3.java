package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d3  reason: case insensitive filesystem */
public final class C7275d3 {

    /* renamed from: a  reason: collision with root package name */
    private final C7275d3 f48888a;

    /* renamed from: b  reason: collision with root package name */
    private E f48889b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, C7400s> f48890c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Boolean> f48891d = new HashMap();

    public C7275d3(C7275d3 d3Var, E e10) {
        this.f48888a = d3Var;
        this.f48889b = e10;
    }

    public final C7400s a(C7298g gVar) {
        C7400s sVar = C7400s.f49052k0;
        Iterator<Integer> B10 = gVar.B();
        while (B10.hasNext()) {
            sVar = this.f48889b.a(this, gVar.p(B10.next().intValue()));
            if (sVar instanceof C7343l) {
                break;
            }
        }
        return sVar;
    }

    public final C7400s b(C7400s sVar) {
        return this.f48889b.a(this, sVar);
    }

    public final C7400s c(String str) {
        C7275d3 d3Var = this;
        while (!d3Var.f48890c.containsKey(str)) {
            d3Var = d3Var.f48888a;
            if (d3Var == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
            }
        }
        return d3Var.f48890c.get(str);
    }

    public final C7275d3 d() {
        return new C7275d3(this, this.f48889b);
    }

    public final void e(String str, C7400s sVar) {
        if (this.f48891d.containsKey(str)) {
            return;
        }
        if (sVar == null) {
            this.f48890c.remove(str);
        } else {
            this.f48890c.put(str, sVar);
        }
    }

    public final void f(String str, C7400s sVar) {
        e(str, sVar);
        this.f48891d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        C7275d3 d3Var = this;
        while (!d3Var.f48890c.containsKey(str)) {
            d3Var = d3Var.f48888a;
            if (d3Var == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, C7400s sVar) {
        C7275d3 d3Var = this;
        while (!d3Var.f48890c.containsKey(str) && (r1 = d3Var.f48888a) != null && r1.g(str)) {
            d3Var = d3Var.f48888a;
        }
        if (d3Var.f48891d.containsKey(str)) {
            return;
        }
        if (sVar == null) {
            d3Var.f48890c.remove(str);
        } else {
            d3Var.f48890c.put(str, sVar);
        }
    }
}
