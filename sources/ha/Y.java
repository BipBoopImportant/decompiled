package ha;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class Y extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C7959b0 f52369a;

    Y(C7959b0 b0Var) {
        this.f52369a = b0Var;
    }

    public final void clear() {
        this.f52369a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f52369a.containsKey(obj);
    }

    public final Iterator iterator() {
        C7959b0 b0Var = this.f52369a;
        Map m10 = b0Var.m();
        return m10 != null ? m10.keySet().iterator() : new S(b0Var);
    }

    public final boolean remove(Object obj) {
        Map m10 = this.f52369a.m();
        return m10 != null ? m10.keySet().remove(obj) : this.f52369a.w(obj) != C7959b0.f52424j;
    }

    public final int size() {
        return this.f52369a.size();
    }
}
