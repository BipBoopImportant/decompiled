package ha;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class G implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    final Iterator f51912a;

    /* renamed from: b  reason: collision with root package name */
    final Collection f51913b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ H f51914c;

    G(H h10, Iterator it) {
        this.f51914c = h10;
        this.f51913b = h10.f51934b;
        this.f51912a = it;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f51914c.zzb();
        if (this.f51914c.f51934b != this.f51913b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        a();
        return this.f51912a.hasNext();
    }

    public final Object next() {
        a();
        return this.f51912a.next();
    }

    public final void remove() {
        this.f51912a.remove();
        K k10 = this.f51914c.f51937e;
        k10.f51991d = k10.f51991d - 1;
        this.f51914c.i();
    }

    G(H h10) {
        Iterator it;
        this.f51914c = h10;
        Collection collection = h10.f51934b;
        this.f51913b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f51912a = it;
    }
}
