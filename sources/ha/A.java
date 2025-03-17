package ha;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class A extends C8128s0 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C f51771a;

    A(C c10) {
        this.f51771a = c10;
    }

    /* access modifiers changed from: package-private */
    public final Map b() {
        return this.f51771a;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f51771a.f51818c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Iterator iterator() {
        return new B(this.f51771a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        K.l(this.f51771a.f51819d, entry.getKey());
        return true;
    }
}
