package ha;

import java.util.Iterator;

abstract class I0 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    final Iterator f51952a;

    I0(Iterator it) {
        it.getClass();
        this.f51952a = it;
    }

    /* access modifiers changed from: package-private */
    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.f51952a.hasNext();
    }

    public final Object next() {
        return a(this.f51952a.next());
    }

    public final void remove() {
        this.f51952a.remove();
    }
}
