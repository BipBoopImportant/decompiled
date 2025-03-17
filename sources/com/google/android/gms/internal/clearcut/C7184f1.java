package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.f1  reason: case insensitive filesystem */
final class C7184f1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f48369a = C();

    /* renamed from: b  reason: collision with root package name */
    private static final C7231v1<?, ?> f48370b = w(false);

    /* renamed from: c  reason: collision with root package name */
    private static final C7231v1<?, ?> f48371c = w(true);

    /* renamed from: d  reason: collision with root package name */
    private static final C7231v1<?, ?> f48372d = new C7237x1();

    public static C7231v1<?, ?> A() {
        return f48371c;
    }

    public static C7231v1<?, ?> B() {
        return f48372d;
    }

    private static Class<?> C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int E(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7189h0) {
            C7189h0 h0Var = (C7189h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.C0(h0Var.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.C0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void F(int i10, List<Long> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.n(i10, list, z10);
        }
    }

    static int G(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7189h0) {
            C7189h0 h0Var = (C7189h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.D0(h0Var.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.D0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void H(int i10, List<Long> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.B(i10, list, z10);
        }
    }

    public static void I(Class<?> cls) {
        Class<?> cls2;
        if (!C7186g0.class.isAssignableFrom(cls) && (cls2 = f48369a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int J(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7189h0) {
            C7189h0 h0Var = (C7189h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.E0(h0Var.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.E0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void K(int i10, List<Long> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.y(i10, list, z10);
        }
    }

    static int L(List<?> list) {
        return list.size() << 2;
    }

    public static void M(int i10, List<Integer> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.b(i10, list, z10);
        }
    }

    static int N(List<?> list) {
        return list.size() << 3;
    }

    public static void O(int i10, List<Integer> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.A(i10, list, z10);
        }
    }

    static int P(List<?> list) {
        return list.size();
    }

    public static void Q(int i10, List<Integer> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.zzm(i10, list, z10);
        }
    }

    public static void R(int i10, List<Integer> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.h(i10, list, z10);
        }
    }

    public static void S(int i10, List<Integer> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.zzk(i10, list, z10);
        }
    }

    public static void T(int i10, List<Integer> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.x(i10, list, z10);
        }
    }

    public static void U(int i10, List<Boolean> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.zzi(i10, list, z10);
        }
    }

    static int V(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * M.B0(i10));
    }

    static int W(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * M.B0(i10));
    }

    static int X(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + (size * M.B0(i10));
    }

    static int Y(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * M.B0(i10));
    }

    static int Z(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * M.B0(i10));
    }

    static int a(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof A0) {
            A0 a02 = (A0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.e0(a02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.e0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int a0(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * M.B0(i10));
    }

    private static <UT, UB> UB b(int i10, int i11, UB ub2, C7231v1<UT, UB> v1Var) {
        if (ub2 == null) {
            ub2 = v1Var.f();
        }
        v1Var.a(ub2, i10, (long) i11);
        return ub2;
    }

    static int b0(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * M.B0(i10));
    }

    static <UT, UB> UB c(int i10, List<Integer> list, C7198k0<?> k0Var, UB ub2, C7231v1<UT, UB> v1Var) {
        if (k0Var == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (k0Var.d(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = b(i10, intValue, ub2, v1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (k0Var.d(intValue2) == null) {
                    ub2 = b(i10, intValue2, ub2, v1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    static int c0(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * M.t0(i10, 0);
    }

    public static void d(int i10, List<String> list, Q1 q12) {
        if (list != null && !list.isEmpty()) {
            q12.w(i10, list);
        }
    }

    static int d0(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * M.k0(i10, 0);
    }

    public static void e(int i10, List<?> list, Q1 q12, C7178d1 d1Var) {
        if (list != null && !list.isEmpty()) {
            q12.F(i10, list, d1Var);
        }
    }

    static int e0(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * M.Q(i10, true);
    }

    public static void f(int i10, List<Double> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.zzg(i10, list, z10);
        }
    }

    static <T, FT extends C7166a0<FT>> void g(T<FT> t10, T t11, T t12) {
        X<FT> b10 = t10.b(t12);
        if (!b10.b()) {
            t10.e(t11).h(b10);
        }
    }

    static <T> void h(H0 h02, T t10, T t11, long j10) {
        C1.i(t10, j10, h02.c(C1.M(t10, j10), C1.M(t11, j10)));
    }

    static <T, UT, UB> void i(C7231v1<UT, UB> v1Var, T t10, T t11) {
        v1Var.g(t10, v1Var.i(v1Var.k(t10), v1Var.k(t11)));
    }

    static int j(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof A0) {
            A0 a02 = (A0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.h0(a02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.h0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void k(int i10, List<A> list, Q1 q12) {
        if (list != null && !list.isEmpty()) {
            q12.t(i10, list);
        }
    }

    public static void l(int i10, List<?> list, Q1 q12, C7178d1 d1Var) {
        if (list != null && !list.isEmpty()) {
            q12.E(i10, list, d1Var);
        }
    }

    public static void m(int i10, List<Float> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.D(i10, list, z10);
        }
    }

    static int n(int i10, Object obj, C7178d1 d1Var) {
        return obj instanceof C7224t0 ? M.d(i10, (C7224t0) obj) : M.B(i10, (M0) obj, d1Var);
    }

    static int o(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int B02 = M.B0(i10) * size;
        if (list instanceof C7230v0) {
            C7230v0 v0Var = (C7230v0) list;
            while (i11 < size) {
                Object n10 = v0Var.n(i11);
                B02 += n10 instanceof A ? M.D((A) n10) : M.q0((String) n10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                B02 += obj instanceof A ? M.D((A) obj) : M.q0((String) obj);
                i11++;
            }
        }
        return B02;
    }

    static int p(int i10, List<?> list, C7178d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B02 = M.B0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            B02 += obj instanceof C7224t0 ? M.e((C7224t0) obj) : M.E((M0) obj, d1Var);
        }
        return B02;
    }

    static int q(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof A0) {
            A0 a02 = (A0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.l0(a02.i(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.l0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void r(int i10, List<Long> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.zzc(i10, list, z10);
        }
    }

    public static boolean s(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = ((long) i11) - ((long) i10);
        long j11 = (long) i12;
        return j10 + 10 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    static int t(int i10, List<A> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int B02 = size * M.B0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            B02 += M.D(list.get(i11));
        }
        return B02;
    }

    static int u(int i10, List<M0> list, C7178d1 d1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += M.P(i10, list.get(i12), d1Var);
        }
        return i11;
    }

    static int v(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7189h0) {
            C7189h0 h0Var = (C7189h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += M.H0(h0Var.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + M.H0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static C7231v1<?, ?> w(boolean z10) {
        try {
            Class<?> D10 = D();
            if (D10 == null) {
                return null;
            }
            return (C7231v1) D10.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void x(int i10, List<Long> list, Q1 q12, boolean z10) {
        if (list != null && !list.isEmpty()) {
            q12.C(i10, list, z10);
        }
    }

    static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static C7231v1<?, ?> z() {
        return f48370b;
    }
}
