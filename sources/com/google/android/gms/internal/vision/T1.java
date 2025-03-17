package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class T1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f49271a = F();

    /* renamed from: b  reason: collision with root package name */
    private static final C7503j2<?, ?> f49272b = g(false);

    /* renamed from: c  reason: collision with root package name */
    private static final C7503j2<?, ?> f49273c = g(true);

    /* renamed from: d  reason: collision with root package name */
    private static final C7503j2<?, ?> f49274d = new C7511l2();

    static int A(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7518n1) {
            C7518n1 n1Var = (C7518n1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.n0(n1Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.n0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static C7503j2<?, ?> B() {
        return f49274d;
    }

    public static void C(int i10, List<Long> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.zzc(i10, list, z10);
        }
    }

    static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * C7547x0.g0(i10));
    }

    static int E(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S0) {
            S0 s02 = (S0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.B0(s02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.B0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i10, List<Long> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.C(i10, list, z10);
        }
    }

    static int H(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * C7547x0.g0(i10));
    }

    static int I(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S0) {
            S0 s02 = (S0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.k0(s02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.k0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i10, List<Long> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.n(i10, list, z10);
        }
    }

    static int L(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * C7547x0.g0(i10));
    }

    static int M(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S0) {
            S0 s02 = (S0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.o0(s02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.o0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void N(int i10, List<Long> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.B(i10, list, z10);
        }
    }

    static int O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * C7547x0.g0(i10));
    }

    static int P(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof S0) {
            S0 s02 = (S0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.s0(s02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.s0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void Q(int i10, List<Long> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.y(i10, list, z10);
        }
    }

    static int R(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C7547x0.x0(i10, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    public static void T(int i10, List<Integer> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.b(i10, list, z10);
        }
    }

    static int U(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C7547x0.q0(i10, 0);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    public static void W(int i10, List<Integer> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.A(i10, list, z10);
        }
    }

    static int X(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C7547x0.H(i10, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    public static void Z(int i10, List<Integer> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.zzm(i10, list, z10);
        }
    }

    static int a(int i10, Object obj, S1 s12) {
        return obj instanceof C7498i1 ? C7547x0.c(i10, (C7498i1) obj) : C7547x0.F(i10, (A1) obj, s12);
    }

    public static void a0(int i10, List<Integer> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.h(i10, list, z10);
        }
    }

    static int b(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int g02 = C7547x0.g0(i10) * size;
        if (list instanceof C7506k1) {
            C7506k1 k1Var = (C7506k1) list;
            while (i11 < size) {
                Object d10 = k1Var.d(i11);
                g02 += d10 instanceof C7497i0 ? C7547x0.I((C7497i0) d10) : C7547x0.K((String) d10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                g02 += obj instanceof C7497i0 ? C7547x0.I((C7497i0) obj) : C7547x0.K((String) obj);
                i11++;
            }
        }
        return g02;
    }

    public static void b0(int i10, List<Integer> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.zzk(i10, list, z10);
        }
    }

    static int c(int i10, List<?> list, S1 s12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = C7547x0.g0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            g02 += obj instanceof C7498i1 ? C7547x0.d((C7498i1) obj) : C7547x0.e((A1) obj, s12);
        }
        return g02;
    }

    public static void c0(int i10, List<Integer> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.x(i10, list, z10);
        }
    }

    static int d(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * C7547x0.g0(i10));
    }

    public static void d0(int i10, List<Boolean> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.zzi(i10, list, z10);
        }
    }

    static int e(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7518n1) {
            C7518n1 n1Var = (C7518n1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.d0(n1Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.d0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static C7503j2<?, ?> f() {
        return f49272b;
    }

    private static C7503j2<?, ?> g(boolean z10) {
        try {
            Class<?> J10 = J();
            if (J10 == null) {
                return null;
            }
            return (C7503j2) J10.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB h(int i10, int i11, UB ub2, C7503j2<UT, UB> j2Var) {
        if (ub2 == null) {
            ub2 = j2Var.a();
        }
        j2Var.b(ub2, i10, (long) i11);
        return ub2;
    }

    static <UT, UB> UB i(int i10, List<Integer> list, V0 v02, UB ub2, C7503j2<UT, UB> j2Var) {
        if (v02 == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (v02.c(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = h(i10, intValue, ub2, j2Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!v02.c(intValue2)) {
                    ub2 = h(i10, intValue2, ub2, j2Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void j(int i10, List<String> list, H2 h22) {
        if (list != null && !list.isEmpty()) {
            h22.w(i10, list);
        }
    }

    public static void k(int i10, List<?> list, H2 h22, S1 s12) {
        if (list != null && !list.isEmpty()) {
            h22.I(i10, list, s12);
        }
    }

    public static void l(int i10, List<Double> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.zzg(i10, list, z10);
        }
    }

    static <T, FT extends K0<FT>> void m(E0<FT> e02, T t10, T t11) {
        I0<FT> b10 = e02.b(t11);
        if (!b10.f49209a.isEmpty()) {
            e02.f(t10).f(b10);
        }
    }

    static <T> void n(C7548x1 x1Var, T t10, T t11, long j10) {
        q2.j(t10, j10, x1Var.b(q2.F(t10, j10), q2.F(t11, j10)));
    }

    static <T, UT, UB> void o(C7503j2<UT, UB> j2Var, T t10, T t11) {
        j2Var.e(t10, j2Var.i(j2Var.f(t10), j2Var.f(t11)));
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!Q0.class.isAssignableFrom(cls) && (cls2 = f49271a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int r(int i10, List<C7497i0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = size * C7547x0.g0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            g02 += C7547x0.I(list.get(i11));
        }
        return g02;
    }

    static int s(int i10, List<A1> list, S1 s12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += C7547x0.U(i10, list.get(i12), s12);
        }
        return i11;
    }

    static int t(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * C7547x0.g0(i10));
    }

    static int u(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7518n1) {
            C7518n1 n1Var = (C7518n1) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7547x0.i0(n1Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7547x0.i0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static C7503j2<?, ?> v() {
        return f49273c;
    }

    public static void w(int i10, List<C7497i0> list, H2 h22) {
        if (list != null && !list.isEmpty()) {
            h22.t(i10, list);
        }
    }

    public static void x(int i10, List<?> list, H2 h22, S1 s12) {
        if (list != null && !list.isEmpty()) {
            h22.F(i10, list, s12);
        }
    }

    public static void y(int i10, List<Float> list, H2 h22, boolean z10) {
        if (list != null && !list.isEmpty()) {
            h22.D(i10, list, z10);
        }
    }

    static int z(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * C7547x0.g0(i10));
    }
}
