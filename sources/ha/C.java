package ha;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class C extends C8158v0 {

    /* renamed from: c  reason: collision with root package name */
    final transient Map f51818c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ K f51819d;

    C(K k10, Map map) {
        this.f51819d = k10;
        this.f51818c = map;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return new A(this);
    }

    /* renamed from: b */
    public final Collection get(Object obj) {
        Collection collection = (Collection) C8168w0.a(this.f51818c, obj);
        if (collection == null) {
            return null;
        }
        return this.f51819d.f(obj, collection);
    }

    public final void clear() {
        Map map = this.f51818c;
        K k10 = this.f51819d;
        if (map == k10.f51990c) {
            k10.m();
        } else {
            C8099p0.a(new B(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return C8168w0.b(this.f51818c, obj);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f51818c.equals(obj);
    }

    public final int hashCode() {
        return this.f51818c.hashCode();
    }

    public final Set keySet() {
        return this.f51819d.o();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f51818c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection e10 = this.f51819d.e();
        e10.addAll(collection);
        K k10 = this.f51819d;
        k10.f51991d = k10.f51991d - collection.size();
        collection.clear();
        return e10;
    }

    public final int size() {
        return this.f51818c.size();
    }

    public final String toString() {
        return this.f51818c.toString();
    }
}
