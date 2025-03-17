package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p  reason: case insensitive filesystem */
public final /* synthetic */ class C7377p {
    public static C7400s a(C7352m mVar, C7400s sVar, C7275d3 d3Var, List<C7400s> list) {
        if (mVar.j(sVar.i())) {
            C7400s zza = mVar.zza(sVar.i());
            if (zza instanceof C7361n) {
                return ((C7361n) zza).a(d3Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{sVar.i()}));
        } else if ("hasOwnProperty".equals(sVar.i())) {
            C7265c2.g("hasOwnProperty", 1, list);
            return mVar.j(d3Var.b(list.get(0)).i()) ? C7400s.f49057p0 : C7400s.f49058q0;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{sVar.i()}));
        }
    }

    public static Iterator<C7400s> b(Map<String, C7400s> map) {
        return new C7369o(map.keySet().iterator());
    }
}
