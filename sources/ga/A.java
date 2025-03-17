package ga;

import java.util.Iterator;

public abstract class A implements Iterator {
    protected A() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
