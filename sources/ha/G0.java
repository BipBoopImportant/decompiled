package ha;

import java.util.AbstractSet;
import java.util.Collection;

abstract class G0 extends AbstractSet {
    G0() {
    }

    public boolean removeAll(Collection collection) {
        return H0.c(this, collection);
    }

    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
