package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5166t;
import androidx.datastore.preferences.protobuf.C5172z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f21365a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final o0<?, ?> f21366b = C();

    /* renamed from: c  reason: collision with root package name */
    private static final o0<?, ?> f21367c = new q0();

    static <UT, UB> UB A(Object obj, int i10, List<Integer> list, C5172z.e eVar, UB ub2, o0<UT, UB> o0Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = J(obj, i10, intValue, ub2, o0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub2 = J(obj, i10, intValue2, ub2, o0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        if (d0.f21299d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static o0<?, ?> C() {
        try {
            Class<?> D10 = D();
            if (D10 == null) {
                return null;
            }
            return (o0) D10.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        if (d0.f21299d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends C5166t.b<FT>> void E(C5163p<FT> pVar, T t10, T t11) {
        C5166t<FT> c10 = pVar.c(t11);
        if (!c10.n()) {
            pVar.d(t10).v(c10);
        }
    }

    static <T> void F(M m10, T t10, T t11, long j10) {
        r0.O(t10, j10, m10.a(r0.z(t10, j10), r0.z(t11, j10)));
    }

    static <T, UT, UB> void G(o0<UT, UB> o0Var, T t10, T t11) {
        o0Var.p(t10, o0Var.k(o0Var.g(t10), o0Var.g(t11)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!C5170x.class.isAssignableFrom(cls) && !d0.f21299d && (cls2 = f21365a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB J(Object obj, int i10, int i11, UB ub2, o0<UT, UB> o0Var) {
        if (ub2 == null) {
            ub2 = o0Var.f(obj);
        }
        o0Var.e(ub2, i10, (long) i11);
        return ub2;
    }

    public static o0<?, ?> K() {
        return f21366b;
    }

    public static o0<?, ?> L() {
        return f21367c;
    }

    public static void M(int i10, List<Boolean> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.A(i10, list, z10);
        }
    }

    public static void N(int i10, List<C5154g> list, u0 u0Var) {
        if (list != null && !list.isEmpty()) {
            u0Var.I(i10, list);
        }
    }

    public static void O(int i10, List<Double> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.G(i10, list, z10);
        }
    }

    public static void P(int i10, List<Integer> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.n(i10, list, z10);
        }
    }

    public static void Q(int i10, List<Integer> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.j(i10, list, z10);
        }
    }

    public static void R(int i10, List<Long> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.y(i10, list, z10);
        }
    }

    public static void S(int i10, List<Float> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.a(i10, list, z10);
        }
    }

    public static void T(int i10, List<?> list, u0 u0Var, h0 h0Var) {
        if (list != null && !list.isEmpty()) {
            u0Var.J(i10, list, h0Var);
        }
    }

    public static void U(int i10, List<Integer> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.g(i10, list, z10);
        }
    }

    public static void V(int i10, List<Long> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.F(i10, list, z10);
        }
    }

    public static void W(int i10, List<?> list, u0 u0Var, h0 h0Var) {
        if (list != null && !list.isEmpty()) {
            u0Var.O(i10, list, h0Var);
        }
    }

    public static void X(int i10, List<Integer> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.z(i10, list, z10);
        }
    }

    public static void Y(int i10, List<Long> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.q(i10, list, z10);
        }
    }

    public static void Z(int i10, List<Integer> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.D(i10, list, z10);
        }
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? C5157j.U(i10) + C5157j.C(size) : size * C5157j.d(i10, true);
    }

    public static void a0(int i10, List<Long> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.l(i10, list, z10);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<String> list, u0 u0Var) {
        if (list != null && !list.isEmpty()) {
            u0Var.d(i10, list);
        }
    }

    static int c(int i10, List<C5154g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U10 = size * C5157j.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U10 += C5157j.h(list.get(i11));
        }
        return U10;
    }

    public static void c0(int i10, List<Integer> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.k(i10, list, z10);
        }
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? C5157j.U(i10) + C5157j.C(e10) : e10 + (size * C5157j.U(i10));
    }

    public static void d0(int i10, List<Long> list, u0 u0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            u0Var.r(i10, list, z10);
        }
    }

    static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.l(yVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C5157j.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? C5157j.U(i10) + C5157j.C(size * 4) : size * C5157j.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? C5157j.U(i10) + C5157j.C(size * 8) : size * C5157j.o(i10, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<S> list, h0 h0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += C5157j.s(i10, list.get(i12), h0Var);
        }
        return i11;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? C5157j.U(i10) + C5157j.C(l10) : l10 + (size * C5157j.U(i10));
    }

    static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.w(yVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C5157j.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z10 ? C5157j.U(i10) + C5157j.C(n10) : n10 + (list.size() * C5157j.U(i10));
    }

    static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i12 = (I) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.y(i12.r(i11));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                i13 = i10 + C5157j.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, h0 h0Var) {
        return obj instanceof D ? C5157j.A(i10, (D) obj) : C5157j.F(i10, (S) obj, h0Var);
    }

    static int p(int i10, List<?> list, h0 h0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U10 = C5157j.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            U10 += obj instanceof D ? C5157j.B((D) obj) : C5157j.H((S) obj, h0Var);
        }
        return U10;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        return z10 ? C5157j.U(i10) + C5157j.C(r10) : r10 + (size * C5157j.U(i10));
    }

    static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.P(yVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C5157j.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        return z10 ? C5157j.U(i10) + C5157j.C(t10) : t10 + (size * C5157j.U(i10));
    }

    static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i12 = (I) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.R(i12.r(i11));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                i13 = i10 + C5157j.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U10 = C5157j.U(i10) * size;
        if (list instanceof E) {
            E e10 = (E) list;
            while (i11 < size) {
                Object n10 = e10.n(i11);
                U10 += n10 instanceof C5154g ? C5157j.h((C5154g) n10) : C5157j.T((String) n10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                U10 += obj instanceof C5154g ? C5157j.h((C5154g) obj) : C5157j.T((String) obj);
                i11++;
            }
        }
        return U10;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        return z10 ? C5157j.U(i10) + C5157j.C(w10) : w10 + (size * C5157j.U(i10));
    }

    static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5171y) {
            C5171y yVar = (C5171y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.W(yVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C5157j.W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        return z10 ? C5157j.U(i10) + C5157j.C(y10) : y10 + (size * C5157j.U(i10));
    }

    static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof I) {
            I i12 = (I) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C5157j.Y(i12.r(i11));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                i13 = i10 + C5157j.Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static <UT, UB> UB z(Object obj, int i10, List<Integer> list, C5172z.d<?> dVar, UB ub2, o0<UT, UB> o0Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = list.get(i12);
                int intValue = num.intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    ub2 = J(obj, i10, intValue, ub2, o0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub2 = J(obj, i10, intValue2, ub2, o0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
