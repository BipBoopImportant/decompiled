package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.g  reason: case insensitive filesystem */
public final class C7298g implements C7352m, C7400s, Iterable<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private final SortedMap<Integer, C7400s> f48925a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C7400s> f48926b;

    public C7298g() {
        this.f48925a = new TreeMap();
        this.f48926b = new TreeMap();
    }

    public final boolean A(int i10) {
        if (i10 >= 0 && i10 <= this.f48925a.lastKey().intValue()) {
            return this.f48925a.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
    }

    public final Iterator<Integer> B() {
        return this.f48925a.keySet().iterator();
    }

    public final List<C7400s> C() {
        ArrayList arrayList = new ArrayList(s());
        for (int i10 = 0; i10 < s(); i10++) {
            arrayList.add(p(i10));
        }
        return arrayList;
    }

    public final void D() {
        this.f48925a.clear();
    }

    public final int b() {
        return this.f48925a.size();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7298g)) {
            return false;
        }
        C7298g gVar = (C7298g) obj;
        if (s() != gVar.s()) {
            return false;
        }
        if (this.f48925a.isEmpty()) {
            return gVar.f48925a.isEmpty();
        }
        for (int intValue = this.f48925a.firstKey().intValue(); intValue <= this.f48925a.lastKey().intValue(); intValue++) {
            if (!p(intValue).equals(gVar.p(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final Double h() {
        return this.f48925a.size() == 1 ? p(0).h() : this.f48925a.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f48925a.hashCode() * 31;
    }

    public final String i() {
        return toString();
    }

    public final Iterator<C7400s> iterator() {
        return new C7316i(this);
    }

    public final boolean j(String str) {
        return "length".equals(str) || this.f48926b.containsKey(str);
    }

    public final C7400s k(String str, C7275d3 d3Var, List<C7400s> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || Constants.PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, d3Var, list) : C7377p.a(this, new C7416u(str), d3Var, list);
    }

    public final void m(String str, C7400s sVar) {
        if (sVar == null) {
            this.f48926b.remove(str);
        } else {
            this.f48926b.put(str, sVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r1.f48925a.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C7400s p(int r2) {
        /*
            r1 = this;
            int r0 = r1.s()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.A(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.s> r0 = r1.f48925a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.s r2 = (com.google.android.gms.internal.measurement.C7400s) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.s r2 = com.google.android.gms.internal.measurement.C7400s.f49052k0
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7298g.p(int):com.google.android.gms.internal.measurement.s");
    }

    public final void q(int i10, C7400s sVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i10);
        } else if (i10 >= s()) {
            y(i10, sVar);
        } else {
            for (int intValue = this.f48925a.lastKey().intValue(); intValue >= i10; intValue--) {
                C7400s sVar2 = this.f48925a.get(Integer.valueOf(intValue));
                if (sVar2 != null) {
                    y(intValue + 1, sVar2);
                    this.f48925a.remove(Integer.valueOf(intValue));
                }
            }
            y(i10, sVar);
        }
    }

    public final void r(C7400s sVar) {
        y(s(), sVar);
    }

    public final int s() {
        if (this.f48925a.isEmpty()) {
            return 0;
        }
        return this.f48925a.lastKey().intValue() + 1;
    }

    public final String t(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (!this.f48925a.isEmpty()) {
            for (int i10 = 0; i10 < s(); i10++) {
                C7400s p10 = p(i10);
                sb2.append(str);
                if (!(p10 instanceof C7456z) && !(p10 instanceof C7385q)) {
                    sb2.append(p10.i());
                }
            }
            sb2.delete(0, str.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return t(",");
    }

    public final void x(int i10) {
        int intValue = this.f48925a.lastKey().intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.f48925a.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                int i11 = i10 - 1;
                if (!this.f48925a.containsKey(Integer.valueOf(i11)) && i11 >= 0) {
                    this.f48925a.put(Integer.valueOf(i11), C7400s.f49052k0);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= this.f48925a.lastKey().intValue()) {
                    C7400s sVar = this.f48925a.get(Integer.valueOf(i10));
                    if (sVar != null) {
                        this.f48925a.put(Integer.valueOf(i10 - 1), sVar);
                        this.f48925a.remove(Integer.valueOf(i10));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void y(int i10, C7400s sVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i10 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        } else if (sVar == null) {
            this.f48925a.remove(Integer.valueOf(i10));
        } else {
            this.f48925a.put(Integer.valueOf(i10), sVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = r2.f48926b.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C7400s zza(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.k r3 = new com.google.android.gms.internal.measurement.k
            int r0 = r2.s()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.j(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.s> r0 = r2.f48926b
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.s r3 = (com.google.android.gms.internal.measurement.C7400s) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.s r3 = com.google.android.gms.internal.measurement.C7400s.f49052k0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7298g.zza(java.lang.String):com.google.android.gms.internal.measurement.s");
    }

    public final C7400s zzc() {
        C7298g gVar = new C7298g();
        for (Map.Entry next : this.f48925a.entrySet()) {
            if (next.getValue() instanceof C7352m) {
                gVar.f48925a.put((Integer) next.getKey(), (C7400s) next.getValue());
            } else {
                gVar.f48925a.put((Integer) next.getKey(), ((C7400s) next.getValue()).zzc());
            }
        }
        return gVar;
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Iterator<C7400s> zzh() {
        return new C7289f(this, this.f48925a.keySet().iterator(), this.f48926b.keySet().iterator());
    }

    public C7298g(List<C7400s> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                y(i10, list.get(i10));
            }
        }
    }

    public C7298g(C7400s... sVarArr) {
        this((List<C7400s>) Arrays.asList(sVarArr));
    }
}
