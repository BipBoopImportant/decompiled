package kb;

import java.util.Iterator;
import jb.l;

abstract class c0<F, T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    final Iterator<? extends F> f74924a;

    c0(Iterator<? extends F> it) {
        this.f74924a = (Iterator) l.j(it);
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f10);

    public final boolean hasNext() {
        return this.f74924a.hasNext();
    }

    public final T next() {
        return a(this.f74924a.next());
    }

    public final void remove() {
        this.f74924a.remove();
    }
}
