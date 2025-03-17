package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5172z;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.c  reason: case insensitive filesystem */
abstract class C5150c<E> extends AbstractList<E> implements C5172z.i<E> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f21294a;

    C5150c(boolean z10) {
        this.f21294a = z10;
    }

    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.f21294a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final void o() {
        if (this.f21294a) {
            this.f21294a = false;
        }
    }

    public abstract E remove(int i10);

    public boolean remove(Object obj) {
        b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        b();
        return super.retainAll(collection);
    }

    public boolean u() {
        return this.f21294a;
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        b();
        return super.addAll(i10, collection);
    }
}
