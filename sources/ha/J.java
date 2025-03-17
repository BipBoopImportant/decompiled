package ha;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class J extends H implements List {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ K f51965f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    J(K k10, Object obj, List list, H h10) {
        super(k10, obj, list, h10);
        this.f51965f = k10;
    }

    public final void add(int i10, Object obj) {
        zzb();
        boolean isEmpty = this.f51934b.isEmpty();
        ((List) this.f51934b).add(i10, obj);
        K k10 = this.f51965f;
        k10.f51991d = k10.f51991d + 1;
        if (isEmpty) {
            b();
        }
    }

    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f51934b).addAll(i10, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f51934b.size();
        K k10 = this.f51965f;
        k10.f51991d = k10.f51991d + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        b();
        return true;
    }

    public final Object get(int i10) {
        zzb();
        return ((List) this.f51934b).get(i10);
    }

    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f51934b).indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f51934b).lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        zzb();
        return new I(this);
    }

    public final Object remove(int i10) {
        zzb();
        Object remove = ((List) this.f51934b).remove(i10);
        K k10 = this.f51965f;
        k10.f51991d = k10.f51991d - 1;
        i();
        return remove;
    }

    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.f51934b).set(i10, obj);
    }

    public final List subList(int i10, int i11) {
        zzb();
        K k10 = this.f51965f;
        Object obj = this.f51933a;
        List subList = ((List) this.f51934b).subList(i10, i11);
        H h10 = this.f51935c;
        if (h10 == null) {
            h10 = this;
        }
        return k10.i(obj, subList, h10);
    }

    public final ListIterator listIterator(int i10) {
        zzb();
        return new I(this, i10);
    }
}
