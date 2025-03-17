package ha;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ha.l0  reason: case insensitive filesystem */
public abstract class C8059l0 extends C8009g0 implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final K0 f52627b = new C8039j0(A0.f51772f, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f52628c = 0;

    C8059l0() {
    }

    static C8059l0 q(Object[] objArr, int i10) {
        return i10 == 0 ? A0.f51772f : new A0(objArr, i10);
    }

    public static C8059l0 r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C8198z0.a(objArr, 2);
        return q(objArr, 2);
    }

    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (r.a(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!r.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final J0 k() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: p */
    public C8059l0 subList(int i10, int i11) {
        C8167w.d(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? A0.f51772f : new C8049k0(this, i10, i12);
    }

    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public final K0 listIterator(int i10) {
        C8167w.b(i10, size(), "index");
        return isEmpty() ? f52627b : new C8039j0(this, i10);
    }

    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
