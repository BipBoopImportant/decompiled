package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c2  reason: case insensitive filesystem */
public final class C7265c2 {
    public static double a(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == -0.0d) {
            return d10;
        }
        return ((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static int b(C7275d3 d3Var) {
        int i10 = i(d3Var.c("runtime.counter").h().doubleValue() + 1.0d);
        if (i10 <= 1000000) {
            d3Var.h("runtime.counter", new C7334k(Double.valueOf((double) i10)));
            return i10;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static Z c(String str) {
        Z a10 = (str == null || str.isEmpty()) ? null : Z.a(Integer.parseInt(str));
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object d(C7400s sVar) {
        if (C7400s.f49053l0.equals(sVar)) {
            return null;
        }
        if (C7400s.f49052k0.equals(sVar)) {
            return "";
        }
        if (sVar instanceof r) {
            return e((r) sVar);
        }
        if (!(sVar instanceof C7298g)) {
            return !sVar.h().isNaN() ? sVar.h() : sVar.i();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C7400s> it = ((C7298g) sVar).iterator();
        while (it.hasNext()) {
            Object d10 = d(it.next());
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        return arrayList;
    }

    public static Map<String, Object> e(r rVar) {
        HashMap hashMap = new HashMap();
        for (String next : rVar.a()) {
            Object d10 = d(rVar.zza(next));
            if (d10 != null) {
                hashMap.put(next, d10);
            }
        }
        return hashMap;
    }

    public static void f(Z z10, int i10, List<C7400s> list) {
        g(z10.name(), i10, list);
    }

    public static void g(String str, int i10, List<C7400s> list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static boolean h(C7400s sVar, C7400s sVar2) {
        if (!sVar.getClass().equals(sVar2.getClass())) {
            return false;
        }
        if ((sVar instanceof C7456z) || (sVar instanceof C7385q)) {
            return true;
        }
        if (!(sVar instanceof C7334k)) {
            return sVar instanceof C7416u ? sVar.i().equals(sVar2.i()) : sVar instanceof C7307h ? sVar.zzd().equals(sVar2.zzd()) : sVar == sVar2;
        }
        if (Double.isNaN(sVar.h().doubleValue()) || Double.isNaN(sVar2.h().doubleValue())) {
            return false;
        }
        return sVar.h().equals(sVar2.h());
    }

    public static int i(double d10) {
        int i10;
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((long) ((((double) (i10 > 0 ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d));
    }

    public static void j(Z z10, int i10, List<C7400s> list) {
        k(z10.name(), i10, list);
    }

    public static void k(String str, int i10, List<C7400s> list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }

    public static boolean l(C7400s sVar) {
        if (sVar == null) {
            return false;
        }
        Double h10 = sVar.h();
        return !h10.isNaN() && h10.doubleValue() >= 0.0d && h10.equals(Double.valueOf(Math.floor(h10.doubleValue())));
    }

    public static long m(double d10) {
        return ((long) i(d10)) & 4294967295L;
    }

    public static void n(String str, int i10, List<C7400s> list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i10), Integer.valueOf(list.size())}));
        }
    }
}
