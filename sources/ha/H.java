package ha;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class H extends AbstractCollection {

    /* renamed from: a  reason: collision with root package name */
    final Object f51933a;

    /* renamed from: b  reason: collision with root package name */
    Collection f51934b;

    /* renamed from: c  reason: collision with root package name */
    final H f51935c;

    /* renamed from: d  reason: collision with root package name */
    final Collection f51936d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ K f51937e;

    H(K k10, Object obj, Collection collection, H h10) {
        this.f51937e = k10;
        this.f51933a = obj;
        this.f51934b = collection;
        this.f51935c = h10;
        this.f51936d = h10 == null ? null : h10.f51934b;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f51934b.isEmpty();
        boolean add = this.f51934b.add(obj);
        if (add) {
            K k10 = this.f51937e;
            k10.f51991d = k10.f51991d + 1;
            if (isEmpty) {
                b();
                return true;
            }
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f51934b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f51934b.size();
        K k10 = this.f51937e;
        k10.f51991d = k10.f51991d + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        b();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        H h10 = this.f51935c;
        if (h10 != null) {
            h10.b();
        } else {
            this.f51937e.f51990c.put(this.f51933a, this.f51934b);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f51934b.clear();
            K k10 = this.f51937e;
            k10.f51991d = k10.f51991d - size;
            i();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.f51934b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f51934b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f51934b.equals(obj);
    }

    public final int hashCode() {
        zzb();
        return this.f51934b.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        H h10 = this.f51935c;
        if (h10 != null) {
            h10.i();
        } else if (this.f51934b.isEmpty()) {
            this.f51937e.f51990c.remove(this.f51933a);
        }
    }

    public final Iterator iterator() {
        zzb();
        return new G(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f51934b.remove(obj);
        if (remove) {
            K k10 = this.f51937e;
            k10.f51991d = k10.f51991d - 1;
            i();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f51934b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f51934b.size();
            K k10 = this.f51937e;
            k10.f51991d = k10.f51991d + (size2 - size);
            i();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f51934b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f51934b.size();
            K k10 = this.f51937e;
            k10.f51991d = k10.f51991d + (size2 - size);
            i();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f51934b.size();
    }

    public final String toString() {
        zzb();
        return this.f51934b.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        H h10 = this.f51935c;
        if (h10 != null) {
            h10.zzb();
            if (this.f51935c.f51934b != this.f51936d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f51934b.isEmpty() && (collection = (Collection) this.f51937e.f51990c.get(this.f51933a)) != null) {
            this.f51934b = collection;
        }
    }
}
