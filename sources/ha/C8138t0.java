package ha;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ha.t0  reason: case insensitive filesystem */
class C8138t0 extends G0 {

    /* renamed from: a  reason: collision with root package name */
    final Map f52789a;

    C8138t0(Map map) {
        this.f52789a = map;
    }

    public final boolean contains(Object obj) {
        return this.f52789a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f52789a.isEmpty();
    }

    public Iterator iterator() {
        throw null;
    }

    public final int size() {
        return this.f52789a.size();
    }
}
