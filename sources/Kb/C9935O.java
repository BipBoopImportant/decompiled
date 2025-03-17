package kb;

import java.util.Comparator;
import java.util.Map;
import jb.f;
import jb.l;

/* renamed from: kb.O  reason: case insensitive filesystem */
public abstract class C9935O<T> implements Comparator<T> {
    protected C9935O() {
    }

    public static <T> C9935O<T> b(Comparator<T> comparator) {
        return comparator instanceof C9935O ? (C9935O) comparator : new C9958m(comparator);
    }

    public static <C extends Comparable> C9935O<C> d() {
        return C9932L.f74881a;
    }

    public <U extends T> C9935O<U> a(Comparator<? super U> comparator) {
        return new C9960o(this, (Comparator) l.j(comparator));
    }

    public <E extends T> C9967v<E> c(Iterable<E> iterable) {
        return C9967v.M(this, iterable);
    }

    public abstract int compare(T t10, T t11);

    /* access modifiers changed from: package-private */
    public <T2 extends T> C9935O<Map.Entry<T2, ?>> e() {
        return f(C9927G.e());
    }

    public <F> C9935O<F> f(f<F, ? extends T> fVar) {
        return new C9953h(fVar, this);
    }

    public <S extends T> C9935O<S> g() {
        return new C9942W(this);
    }
}
