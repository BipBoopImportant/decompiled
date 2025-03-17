package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C9537u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f68026a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final o0<?, ?> f68027b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final o0<?, ?> f68028c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final o0<?, ?> f68029d = new q0();

    static <UT, UB> UB A(Object obj, int i10, List<Integer> list, A.e eVar, UB ub2, o0<UT, UB> o0Var) {
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
                    ub2 = L(obj, i10, intValue, ub2, o0Var);
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
                    ub2 = L(obj, i10, intValue2, ub2, o0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static o0<?, ?> C(boolean z10) {
        try {
            Class<?> D10 = D();
            if (D10 == null) {
                return null;
            }
            return (o0) D10.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends C9537u.b<FT>> void E(C9534q<FT> qVar, T t10, T t11) {
        C9537u<FT> c10 = qVar.c(t11);
        if (!c10.m()) {
            qVar.d(t10).u(c10);
        }
    }

    static <T> void F(M m10, T t10, T t11, long j10) {
        s0.R(t10, j10, m10.a(s0.C(t10, j10), s0.C(t11, j10)));
    }

    static <T, UT, UB> void G(o0<UT, UB> o0Var, T t10, T t11) {
        o0Var.p(t10, o0Var.k(o0Var.g(t10), o0Var.g(t11)));
    }

    public static o0<?, ?> H() {
        return f68027b;
    }

    public static o0<?, ?> I() {
        return f68028c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!C9541y.class.isAssignableFrom(cls) && (cls2 = f68026a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(Object obj, int i10, int i11, UB ub2, o0<UT, UB> o0Var) {
        if (ub2 == null) {
            ub2 = o0Var.f(obj);
        }
        o0Var.e(ub2, i10, (long) i11);
        return ub2;
    }

    public static o0<?, ?> M() {
        return f68029d;
    }

    public static void N(int i10, List<Boolean> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.A(i10, list, z10);
        }
    }

    public static void O(int i10, List<C9525h> list, v0 v0Var) {
        if (list != null && !list.isEmpty()) {
            v0Var.I(i10, list);
        }
    }

    public static void P(int i10, List<Double> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.G(i10, list, z10);
        }
    }

    public static void Q(int i10, List<Integer> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.n(i10, list, z10);
        }
    }

    public static void R(int i10, List<Integer> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.j(i10, list, z10);
        }
    }

    public static void S(int i10, List<Long> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.y(i10, list, z10);
        }
    }

    public static void T(int i10, List<Float> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.a(i10, list, z10);
        }
    }

    public static void U(int i10, List<?> list, v0 v0Var, h0 h0Var) {
        if (list != null && !list.isEmpty()) {
            v0Var.O(i10, list, h0Var);
        }
    }

    public static void V(int i10, List<Integer> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.g(i10, list, z10);
        }
    }

    public static void W(int i10, List<Long> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.F(i10, list, z10);
        }
    }

    public static void X(int i10, List<?> list, v0 v0Var, h0 h0Var) {
        if (list != null && !list.isEmpty()) {
            v0Var.L(i10, list, h0Var);
        }
    }

    public static void Y(int i10, List<Integer> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.z(i10, list, z10);
        }
    }

    public static void Z(int i10, List<Long> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.q(i10, list, z10);
        }
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? C9528k.T(i10) + C9528k.C(size) : size * C9528k.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.D(i10, list, z10);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.l(i10, list, z10);
        }
    }

    static int c(int i10, List<C9525h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T10 = size * C9528k.T(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            T10 += C9528k.h(list.get(i11));
        }
        return T10;
    }

    public static void c0(int i10, List<String> list, v0 v0Var) {
        if (list != null && !list.isEmpty()) {
            v0Var.d(i10, list);
        }
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        return z10 ? C9528k.T(i10) + C9528k.C(e10) : e10 + (size * C9528k.T(i10));
    }

    public static void d0(int i10, List<Integer> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.k(i10, list, z10);
        }
    }

    static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C9528k.l(zVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C9528k.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, v0 v0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            v0Var.r(i10, list, z10);
        }
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? C9528k.T(i10) + C9528k.C(size * 4) : size * C9528k.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? C9528k.T(i10) + C9528k.C(size * 8) : size * C9528k.o(i10, 0);
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
            i11 += C9528k.s(i10, list.get(i12), h0Var);
        }
        return i11;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        return z10 ? C9528k.T(i10) + C9528k.C(l10) : l10 + (size * C9528k.T(i10));
    }

    static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C9528k.w(zVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C9528k.w(list.get(i11).intValue());
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
        return z10 ? C9528k.T(i10) + C9528k.C(n10) : n10 + (list.size() * C9528k.T(i10));
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
                i10 += C9528k.y(i12.r(i11));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                i13 = i10 + C9528k.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, h0 h0Var) {
        return obj instanceof E ? C9528k.A(i10, (E) obj) : C9528k.F(i10, (S) obj, h0Var);
    }

    static int p(int i10, List<?> list, h0 h0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int T10 = C9528k.T(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            T10 += obj instanceof E ? C9528k.B((E) obj) : C9528k.H((S) obj, h0Var);
        }
        return T10;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        return z10 ? C9528k.T(i10) + C9528k.C(r10) : r10 + (size * C9528k.T(i10));
    }

    static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C9528k.O(zVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C9528k.O(list.get(i11).intValue());
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
        return z10 ? C9528k.T(i10) + C9528k.C(t10) : t10 + (size * C9528k.T(i10));
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
                i10 += C9528k.Q(i12.r(i11));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                i13 = i10 + C9528k.Q(list.get(i11).longValue());
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
        int T10 = C9528k.T(i10) * size;
        if (list instanceof G) {
            G g10 = (G) list;
            while (i11 < size) {
                Object n10 = g10.n(i11);
                T10 += n10 instanceof C9525h ? C9528k.h((C9525h) n10) : C9528k.S((String) n10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                T10 += obj instanceof C9525h ? C9528k.h((C9525h) obj) : C9528k.S((String) obj);
                i11++;
            }
        }
        return T10;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        return z10 ? C9528k.T(i10) + C9528k.C(w10) : w10 + (size * C9528k.T(i10));
    }

    static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C9542z) {
            C9542z zVar = (C9542z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C9528k.V(zVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C9528k.V(list.get(i11).intValue());
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
        return z10 ? C9528k.T(i10) + C9528k.C(y10) : y10 + (size * C9528k.T(i10));
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
                i10 += C9528k.X(i12.r(i11));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                i13 = i10 + C9528k.X(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static <UT, UB> UB z(Object obj, int i10, List<Integer> list, A.d<?> dVar, UB ub2, o0<UT, UB> o0Var) {
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
                    ub2 = L(obj, i10, intValue, ub2, o0Var);
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
                    ub2 = L(obj, i10, intValue2, ub2, o0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
