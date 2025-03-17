package ha;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class E extends C8138t0 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ K f51862b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    E(K k10, Map map) {
        super(map);
        this.f51862b = k10;
    }

    public final void clear() {
        C8099p0.a(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.f52789a.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f52789a.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f52789a.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new D(this, this.f52789a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f52789a.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        K k10 = this.f51862b;
        k10.f51991d = k10.f51991d - size;
        return size > 0;
    }
}
