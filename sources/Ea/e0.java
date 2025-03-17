package ea;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class e0 extends b0 implements List, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final i0 f50950b = new c0(f0.f50951e, 0);

    e0() {
    }

    public static e0 s() {
        return f0.f50951e;
    }

    public static e0 t(Collection collection) {
        if (collection instanceof b0) {
            e0 m10 = ((b0) collection).m();
            if (!m10.p()) {
                return m10;
            }
            Object[] array = m10.toArray();
            return x(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i10 = 0;
        while (i10 < length) {
            if (array2[i10] != null) {
                i10++;
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
        return x(array2, length);
    }

    static e0 x(Object[] objArr, int i10) {
        return i10 == 0 ? f0.f50951e : new f0(objArr, i10);
    }

    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final g0 b() {
        return listIterator(0);
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
                        if (X.a(get(i10), list.get(i10))) {
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
                            if (!X.a(it.next(), it2.next())) {
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

    @Deprecated
    public final e0 m() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int q(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    /* renamed from: r */
    public e0 subList(int i10, int i11) {
        Y.c(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? f0.f50951e : new d0(this, i10, i12);
    }

    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: y */
    public final i0 listIterator(int i10) {
        Y.b(i10, size(), "index");
        return isEmpty() ? f50950b : new c0(this, i10);
    }
}
