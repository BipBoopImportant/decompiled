package kb;

import java.util.ListIterator;

abstract class d0<F, T> extends c0<F, T> implements ListIterator<T> {
    d0(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> c() {
        return (ListIterator) this.f74924a;
    }

    public void add(T t10) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    public final int nextIndex() {
        return c().nextIndex();
    }

    public final T previous() {
        return a(c().previous());
    }

    public final int previousIndex() {
        return c().previousIndex();
    }

    public void set(T t10) {
        throw new UnsupportedOperationException();
    }
}
