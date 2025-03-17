package ha;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class B implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    final Iterator f51793a;

    /* renamed from: b  reason: collision with root package name */
    Collection f51794b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C f51795c;

    B(C c10) {
        this.f51795c = c10;
        this.f51793a = c10.f51818c.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f51793a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f51793a.next();
        this.f51794b = (Collection) entry.getValue();
        C c10 = this.f51795c;
        Object key = entry.getKey();
        return new C8019h0(key, c10.f51819d.f(key, (Collection) entry.getValue()));
    }

    public final void remove() {
        C8167w.e(this.f51794b != null, "no calls to next() since the last call to remove()");
        this.f51793a.remove();
        K k10 = this.f51795c.f51819d;
        k10.f51991d = k10.f51991d - this.f51794b.size();
        this.f51794b.clear();
        this.f51794b = null;
    }
}
