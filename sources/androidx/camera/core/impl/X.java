package androidx.camera.core.impl;

import G.n;
import java.util.Objects;
import java.util.Set;

public interface X {

    public static abstract class a<T> {
        a() {
        }

        public static <T> a<T> a(String str, Class<?> cls) {
            return b(str, cls, (Object) null);
        }

        public static <T> a<T> b(String str, Class<?> cls, Object obj) {
            return new C5016d(str, cls, obj);
        }

        public abstract String c();

        public abstract Object d();

        public abstract Class<T> e();
    }

    public interface b {
        boolean a(a<?> aVar);
    }

    public enum c {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    static void F(E0 e02, X x10, X x11, a<?> aVar) {
        if (Objects.equals(aVar, C5046s0.f17018v)) {
            e02.o(aVar, x11.h(aVar), n.a((R.c) x10.g(aVar, (Object) null), (R.c) x11.g(aVar, (Object) null)));
            return;
        }
        e02.o(aVar, x11.h(aVar), x11.a(aVar));
    }

    static X O(X x10, X x11) {
        if (x10 == null && x11 == null) {
            return J0.Y();
        }
        E0 c02 = x11 != null ? E0.c0(x11) : E0.b0();
        if (x10 != null) {
            for (a<?> F10 : x10.e()) {
                F(c02, x11, x10, F10);
            }
        }
        return J0.Z(c02);
    }

    static boolean z(c cVar, c cVar2) {
        c cVar3 = c.REQUIRED;
        return cVar == cVar3 && cVar2 == cVar3;
    }

    <ValueT> ValueT a(a<ValueT> aVar);

    boolean b(a<?> aVar);

    void c(String str, b bVar);

    <ValueT> ValueT d(a<ValueT> aVar, c cVar);

    Set<a<?>> e();

    Set<c> f(a<?> aVar);

    <ValueT> ValueT g(a<ValueT> aVar, ValueT valuet);

    c h(a<?> aVar);
}
