package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class r implements C7352m, C7400s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C7400s> f49048a = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.f49048a.keySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f49048a.equals(((r) obj).f49048a);
    }

    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public int hashCode() {
        return this.f49048a.hashCode();
    }

    public final String i() {
        return "[object Object]";
    }

    public final boolean j(String str) {
        return this.f49048a.containsKey(str);
    }

    public C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        return "toString".equals(str) ? new C7416u(toString()) : C7377p.a(this, new C7416u(str), d3Var, list);
    }

    public final void m(String str, C7400s sVar) {
        if (sVar == null) {
            this.f49048a.remove(str);
        } else {
            this.f49048a.put(str, sVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f49048a.isEmpty()) {
            for (String next : this.f49048a.keySet()) {
                sb2.append(String.format("%s: %s,", new Object[]{next, this.f49048a.get(next)}));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }

    public final C7400s zza(String str) {
        return this.f49048a.containsKey(str) ? this.f49048a.get(str) : C7400s.f49052k0;
    }

    public final C7400s zzc() {
        r rVar = new r();
        for (Map.Entry next : this.f49048a.entrySet()) {
            if (next.getValue() instanceof C7352m) {
                rVar.f49048a.put((String) next.getKey(), (C7400s) next.getValue());
            } else {
                rVar.f49048a.put((String) next.getKey(), ((C7400s) next.getValue()).zzc());
            }
        }
        return rVar;
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Iterator<C7400s> zzh() {
        return C7377p.b(this.f49048a);
    }
}
