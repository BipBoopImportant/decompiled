package ha;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ha.u0  reason: case insensitive filesystem */
final class C8148u0 extends AbstractCollection {

    /* renamed from: a  reason: collision with root package name */
    final Map f52808a;

    C8148u0(Map map) {
        this.f52808a = map;
    }

    public final void clear() {
        this.f52808a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f52808a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f52808a.isEmpty();
    }

    public final Iterator iterator() {
        return new C8118r0(this.f52808a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f52808a.entrySet()) {
                if (r.a(obj, entry.getValue())) {
                    this.f52808a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        if (collection != null) {
            try {
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : this.f52808a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f52808a.keySet().removeAll(hashSet);
            }
        } else {
            throw null;
        }
    }

    public final boolean retainAll(Collection collection) {
        if (collection != null) {
            try {
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : this.f52808a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.f52808a.keySet().retainAll(hashSet);
            }
        } else {
            throw null;
        }
    }

    public final int size() {
        return this.f52808a.size();
    }
}
