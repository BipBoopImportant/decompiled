package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.f4  reason: case insensitive filesystem */
public final class C7294f4 {
    public static C7400s a(U2 u22) {
        if (u22 == null) {
            return C7400s.f49052k0;
        }
        int i10 = E3.f48648a[u22.K().ordinal()];
        if (i10 == 1) {
            return u22.S() ? new C7416u(u22.N()) : C7400s.f49059r0;
        }
        if (i10 == 2) {
            return u22.R() ? new C7334k(Double.valueOf(u22.J())) : new C7334k((Double) null);
        }
        if (i10 == 3) {
            return u22.Q() ? new C7307h(Boolean.valueOf(u22.P())) : new C7307h((Boolean) null);
        }
        if (i10 == 4) {
            List<U2> O10 = u22.O();
            ArrayList arrayList = new ArrayList();
            for (U2 a10 : O10) {
                arrayList.add(a(a10));
            }
            return new C7424v(u22.M(), arrayList);
        } else if (i10 != 5) {
            String valueOf = String.valueOf(u22);
            throw new IllegalStateException("Invalid entity: " + valueOf);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static C7400s b(Object obj) {
        if (obj == null) {
            return C7400s.f49053l0;
        }
        if (obj instanceof String) {
            return new C7416u((String) obj);
        }
        if (obj instanceof Double) {
            return new C7334k((Double) obj);
        }
        if (obj instanceof Long) {
            return new C7334k(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C7334k(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C7307h((Boolean) obj);
        }
        if (obj instanceof Map) {
            r rVar = new r();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                C7400s b10 = b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    rVar.m((String) next, b10);
                }
            }
            return rVar;
        } else if (obj instanceof List) {
            C7298g gVar = new C7298g();
            for (Object b11 : (List) obj) {
                gVar.r(b(b11));
            }
            return gVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
