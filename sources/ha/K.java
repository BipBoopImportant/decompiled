package ha;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

abstract class K extends M implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final transient Map f51990c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public transient int f51991d;

    protected K(Map map) {
        C8167w.c(map.isEmpty());
        this.f51990c = map;
    }

    static /* bridge */ /* synthetic */ void l(K k10, Object obj) {
        Object obj2;
        try {
            obj2 = k10.f51990c.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            k10.f51991d -= size;
        }
    }

    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) this.f51990c.get(obj);
        if (collection == null) {
            Collection e10 = e();
            if (e10.add(obj2)) {
                this.f51991d++;
                this.f51990c.put(obj, e10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f51991d++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Map c() {
        return new C(this, this.f51990c);
    }

    /* access modifiers changed from: package-private */
    public final Set d() {
        return new E(this, this.f51990c);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection e();

    /* access modifiers changed from: package-private */
    public abstract Collection f(Object obj, Collection collection);

    public final Collection h(Object obj) {
        Collection collection = (Collection) this.f51990c.get(obj);
        if (collection == null) {
            collection = e();
        }
        return f(obj, collection);
    }

    /* access modifiers changed from: package-private */
    public final List i(Object obj, List list, H h10) {
        return list instanceof RandomAccess ? new F(this, obj, list, h10) : new J(this, obj, list, h10);
    }

    public final void m() {
        for (Collection clear : this.f51990c.values()) {
            clear.clear();
        }
        this.f51990c.clear();
        this.f51991d = 0;
    }
}
