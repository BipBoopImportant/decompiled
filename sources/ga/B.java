package ga;

import java.util.ListIterator;

public abstract class B extends A implements ListIterator {
    protected B() {
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
