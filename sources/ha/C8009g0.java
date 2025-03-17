package ha;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: ha.g0  reason: case insensitive filesystem */
public abstract class C8009g0 extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f52530a = new Object[0];

    C8009g0() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int b(Object[] objArr, int i10) {
        throw null;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public abstract J0 iterator();

    /* access modifiers changed from: package-private */
    public Object[] m() {
        return null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f52530a);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] m10 = m();
            if (m10 != null) {
                return Arrays.copyOfRange(m10, j(), i(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        b(objArr, 0);
        return objArr;
    }
}
