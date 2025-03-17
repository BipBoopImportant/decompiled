package Kb;

import java.util.Set;
import mc.C10035a;
import mc.C10036b;

/* renamed from: Kb.d  reason: case insensitive filesystem */
public interface C9129d {
    <T> T a(Class<T> cls) {
        return b(E.b(cls));
    }

    <T> T b(E<T> e10) {
        C10036b<T> g10 = g(e10);
        if (g10 == null) {
            return null;
        }
        return g10.get();
    }

    <T> C10036b<Set<T>> c(E<T> e10);

    <T> Set<T> d(Class<T> cls) {
        return f(E.b(cls));
    }

    <T> C10036b<T> e(Class<T> cls) {
        return g(E.b(cls));
    }

    <T> Set<T> f(E<T> e10) {
        return c(e10).get();
    }

    <T> C10036b<T> g(E<T> e10);

    <T> C10035a<T> h(E<T> e10);

    <T> C10035a<T> i(Class<T> cls) {
        return h(E.b(cls));
    }
}
