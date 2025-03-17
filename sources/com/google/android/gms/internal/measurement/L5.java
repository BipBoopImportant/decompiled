package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class L5 {

    /* renamed from: a  reason: collision with root package name */
    private static final Z5<?, ?> f48743a = new C7260b6();

    static int A(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C7405s4.i(i10, 0);
    }

    static int B(List<?> list) {
        return list.size() << 3;
    }

    public static void C(int i10, List<Integer> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.C(i10, list, z10);
        }
    }

    static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * C7405s4.k0(i10));
    }

    static int E(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.T(m42.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.T(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void F(int i10, List<Long> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.B(i10, list, z10);
        }
    }

    static int G(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * C7405s4.k0(i10));
    }

    static int H(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.F(h5Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.F(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void I(int i10, List<Float> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.D(i10, list, z10);
        }
    }

    static int J(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return K(list) + (size * C7405s4.k0(i10));
    }

    static int K(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.g0(m42.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.g0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void L(int i10, List<Integer> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.zzg(i10, list, z10);
        }
    }

    static int M(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * C7405s4.k0(i10));
    }

    static int N(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.e0(h5Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.e0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void O(int i10, List<Long> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.x(i10, list, z10);
        }
    }

    static int P(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * C7405s4.k0(i10));
    }

    static int Q(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.o0(m42.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.o0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void R(int i10, List<Integer> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.zzi(i10, list, z10);
        }
    }

    static int S(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * C7405s4.k0(i10));
    }

    static int T(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7313h5) {
            C7313h5 h5Var = (C7313h5) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.j0(h5Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.j0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void U(int i10, List<Long> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.A(i10, list, z10);
        }
    }

    public static void V(int i10, List<Integer> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.zzk(i10, list, z10);
        }
    }

    public static void W(int i10, List<Long> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.y(i10, list, z10);
        }
    }

    public static void X(int i10, List<Integer> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.zzm(i10, list, z10);
        }
    }

    public static void Y(int i10, List<Long> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.n(i10, list, z10);
        }
    }

    static int a(int i10, Object obj, K5<?> k52) {
        return obj instanceof Z4 ? C7405s4.D(i10, (Z4) obj) : C7405s4.E(i10, (C7406s5) obj, k52);
    }

    static int b(int i10, List<C7276d4> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = size * C7405s4.k0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            k02 += C7405s4.q(list.get(i11));
        }
        return k02;
    }

    static int c(int i10, List<C7406s5> list, K5<?> k52) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += C7405s4.m(i10, list.get(i12), k52);
        }
        return i11;
    }

    static int d(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C7405s4.o(i10, true);
    }

    static int e(List<?> list) {
        return list.size();
    }

    public static Z5<?, ?> f() {
        return f48743a;
    }

    static <UT, UB> UB g(Object obj, int i10, int i11, UB ub2, Z5<UT, UB> z52) {
        if (ub2 == null) {
            ub2 = z52.i(obj);
        }
        z52.f(ub2, i10, (long) i11);
        return ub2;
    }

    static <UT, UB> UB h(Object obj, int i10, List<Integer> list, Q4 q42, UB ub2, Z5<UT, UB> z52) {
        if (q42 == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (q42.c(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = g(obj, i10, intValue, ub2, z52);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!q42.c(intValue2)) {
                    ub2 = g(obj, i10, intValue2, ub2, z52);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void i(int i10, List<C7276d4> list, C7399r6 r6Var) {
        if (list != null && !list.isEmpty()) {
            r6Var.w(i10, list);
        }
    }

    public static void j(int i10, List<?> list, C7399r6 r6Var, K5<?> k52) {
        if (list != null && !list.isEmpty()) {
            r6Var.H(i10, list, k52);
        }
    }

    public static void k(int i10, List<Boolean> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.b(i10, list, z10);
        }
    }

    static <T, FT extends C4<FT>> void l(C7461z4<FT> z4Var, T t10, T t11) {
        A4<FT> b10 = z4Var.b(t11);
        if (!b10.f48533a.isEmpty()) {
            z4Var.f(t10).h(b10);
        }
    }

    static <T> void m(C7383p5 p5Var, T t10, T t11, long j10) {
        C7287e6.j(t10, j10, p5Var.b(C7287e6.B(t10, j10), C7287e6.B(t11, j10)));
    }

    static <T, UT, UB> void n(Z5<UT, UB> z52, T t10, T t11) {
        z52.j(t10, z52.b(z52.k(t10), z52.k(t11)));
    }

    public static void o(Class<?> cls) {
        L4.class.isAssignableFrom(cls);
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int k02 = C7405s4.k0(i10) * size;
        if (list instanceof C7268c5) {
            C7268c5 c5Var = (C7268c5) list;
            while (i11 < size) {
                Object c10 = c5Var.c(i11);
                k02 += c10 instanceof C7276d4 ? C7405s4.q((C7276d4) c10) : C7405s4.u((String) c10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                k02 += obj instanceof C7276d4 ? C7405s4.q((C7276d4) obj) : C7405s4.u((String) obj);
                i11++;
            }
        }
        return k02;
    }

    static int r(int i10, List<?> list, K5<?> k52) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k02 = C7405s4.k0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            k02 += obj instanceof Z4 ? C7405s4.r((Z4) obj) : C7405s4.t((C7406s5) obj, k52);
        }
        return k02;
    }

    static int s(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * C7405s4.k0(i10));
    }

    static int t(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof M4) {
            M4 m42 = (M4) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C7405s4.e(m42.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C7405s4.e(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void u(int i10, List<String> list, C7399r6 r6Var) {
        if (list != null && !list.isEmpty()) {
            r6Var.t(i10, list);
        }
    }

    public static void v(int i10, List<?> list, C7399r6 r6Var, K5<?> k52) {
        if (list != null && !list.isEmpty()) {
            r6Var.E(i10, list, k52);
        }
    }

    public static void w(int i10, List<Double> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.h(i10, list, z10);
        }
    }

    static int x(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C7405s4.A(i10, 0);
    }

    static int y(List<?> list) {
        return list.size() << 2;
    }

    public static void z(int i10, List<Integer> list, C7399r6 r6Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            r6Var.zzc(i10, list, z10);
        }
    }
}
