package ha;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class D implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    Map.Entry f51832a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Iterator f51833b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ E f51834c;

    D(E e10, Iterator it) {
        this.f51834c = e10;
        this.f51833b = it;
    }

    public final boolean hasNext() {
        return this.f51833b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f51833b.next();
        this.f51832a = entry;
        return entry.getKey();
    }

    public final void remove() {
        C8167w.e(this.f51832a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f51832a.getValue();
        this.f51833b.remove();
        K k10 = this.f51834c.f51862b;
        k10.f51991d = k10.f51991d - collection.size();
        collection.clear();
        this.f51832a = null;
    }
}
