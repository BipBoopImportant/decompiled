package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n  reason: case insensitive filesystem */
public abstract class C7361n implements C7352m, C7400s {

    /* renamed from: a  reason: collision with root package name */
    protected final String f49017a;

    /* renamed from: b  reason: collision with root package name */
    protected final Map<String, C7400s> f49018b = new HashMap();

    public C7361n(String str) {
        this.f49017a = str;
    }

    public abstract C7400s a(C7275d3 d3Var, List<C7400s> list);

    public final String b() {
        return this.f49017a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7361n)) {
            return false;
        }
        C7361n nVar = (C7361n) obj;
        String str = this.f49017a;
        if (str != null) {
            return str.equals(nVar.f49017a);
        }
        return false;
    }

    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public int hashCode() {
        String str = this.f49017a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String i() {
        return this.f49017a;
    }

    public final boolean j(String str) {
        return this.f49018b.containsKey(str);
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        return "toString".equals(str) ? new C7416u(this.f49017a) : C7377p.a(this, new C7416u(str), d3Var, list);
    }

    public final void m(String str, C7400s sVar) {
        if (sVar == null) {
            this.f49018b.remove(str);
        } else {
            this.f49018b.put(str, sVar);
        }
    }

    public final C7400s zza(String str) {
        return this.f49018b.containsKey(str) ? this.f49018b.get(str) : C7400s.f49052k0;
    }

    public C7400s zzc() {
        return this;
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Iterator<C7400s> zzh() {
        return C7377p.b(this.f49018b);
    }
}
