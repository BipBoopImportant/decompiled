package T9;

import java.util.Iterator;

final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f40134a;

    f(a aVar) {
        this.f40134a = aVar;
    }

    public final void a(c cVar) {
        this.f40134a.f40129a = cVar;
        Iterator it = this.f40134a.f40131c.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this.f40134a.f40129a);
        }
        this.f40134a.f40131c.clear();
        this.f40134a.f40130b = null;
    }
}
