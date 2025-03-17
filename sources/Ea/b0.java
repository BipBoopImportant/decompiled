package ea;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

public abstract class b0 extends AbstractCollection implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f50945a = new Object[0];

    b0() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract g0 iterator();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public Object[] i() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw null;
    }

    public e0 m() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean p();

    /* access modifiers changed from: package-private */
    public int q(Object[] objArr, int i10) {
        throw null;
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

    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(f50945a);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] i10 = i();
            if (i10 != null) {
                return Arrays.copyOfRange(i10, j(), k(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        q(objArr, 0);
        return objArr;
    }
}
