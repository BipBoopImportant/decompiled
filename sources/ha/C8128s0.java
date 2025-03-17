package ha;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ha.s0  reason: case insensitive filesystem */
abstract class C8128s0 extends G0 {
    C8128s0() {
    }

    /* access modifiers changed from: package-private */
    public abstract Map b();

    public final void clear() {
        b().clear();
    }

    public abstract boolean contains(Object obj);

    public final boolean isEmpty() {
        return b().isEmpty();
    }

    public final boolean removeAll(Collection collection) {
        if (collection != null) {
            try {
                return H0.c(this, collection);
            } catch (UnsupportedOperationException unused) {
                return H0.d(this, collection.iterator());
            }
        } else {
            throw null;
        }
    }

    public final boolean retainAll(Collection collection) {
        int i10;
        if (collection != null) {
            try {
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                if (size < 3) {
                    Q.a(size, "expectedSize");
                    i10 = size + 1;
                } else {
                    i10 = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
                }
                HashSet hashSet = new HashSet(i10);
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        hashSet.add(((Map.Entry) next).getKey());
                    }
                }
                return ((C) b()).f51819d.o().retainAll(hashSet);
            }
        } else {
            throw null;
        }
    }

    public final int size() {
        return b().size();
    }
}
