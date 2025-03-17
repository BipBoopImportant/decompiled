package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.b  reason: case insensitive filesystem */
public final class C7253b {

    /* renamed from: a  reason: collision with root package name */
    private final TreeMap<Integer, C7408t> f48862a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final TreeMap<Integer, C7408t> f48863b = new TreeMap<>();

    private static int a(C7275d3 d3Var, C7408t tVar, C7400s sVar) {
        C7400s a10 = tVar.a(d3Var, Collections.singletonList(sVar));
        if (a10 instanceof C7334k) {
            return C7265c2.i(a10.h().doubleValue());
        }
        return -1;
    }

    public final void b(C7275d3 d3Var, C7271d dVar) {
        C7296f6 f6Var = new C7296f6(dVar);
        for (Integer num : this.f48862a.keySet()) {
            C7280e eVar = (C7280e) dVar.d().clone();
            int a10 = a(d3Var, this.f48862a.get(num), f6Var);
            if (a10 == 2 || a10 == -1) {
                dVar.e(eVar);
            }
        }
        for (Integer num2 : this.f48863b.keySet()) {
            a(d3Var, this.f48863b.get(num2), f6Var);
        }
    }

    public final void c(String str, int i10, C7408t tVar, String str2) {
        TreeMap<Integer, C7408t> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f48863b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f48862a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), tVar);
    }
}
