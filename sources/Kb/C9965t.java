package kb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;
import jb.l;

/* renamed from: kb.t  reason: case insensitive filesystem */
public abstract class C9965t<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f75001a = new Object[0];

    /* renamed from: kb.t$a */
    static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f75002a;

        /* renamed from: b  reason: collision with root package name */
        int f75003b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f75004c;

        a(int i10) {
            C9954i.b(i10, "initialCapacity");
            this.f75002a = new Object[i10];
        }

        private void g(int i10) {
            Object[] objArr = this.f75002a;
            int c10 = b.c(objArr.length, this.f75003b + i10);
            if (c10 > objArr.length || this.f75004c) {
                this.f75002a = Arrays.copyOf(this.f75002a, c10);
                this.f75004c = false;
            }
        }

        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(collection.size());
                if (collection instanceof C9965t) {
                    this.f75003b = ((C9965t) collection).i(this.f75002a, this.f75003b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e10) {
            l.j(e10);
            g(1);
            Object[] objArr = this.f75002a;
            int i10 = this.f75003b;
            this.f75003b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void f(Object[] objArr, int i10) {
            C9934N.c(objArr, i10);
            g(i10);
            System.arraycopy(objArr, 0, this.f75002a, this.f75003b, i10);
            this.f75003b += i10;
        }
    }

    /* renamed from: kb.t$b */
    public static abstract class b<E> {
        b() {
        }

        static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            } else if (i11 <= i10) {
                return i10;
            } else {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            for (Object a10 : iterable) {
                a(a10);
            }
            return this;
        }
    }

    C9965t() {
    }

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public C9967v<E> b() {
        return isEmpty() ? C9967v.E() : C9967v.r(toArray());
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public int i(Object[] objArr, int i10) {
        e0 q10 = iterator();
        while (q10.hasNext()) {
            objArr[i10] = q10.next();
            i10++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Object[] j() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int m() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean p();

    /* renamed from: q */
    public abstract e0<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(f75001a);
    }

    public final <T> T[] toArray(T[] tArr) {
        l.j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] j10 = j();
            if (j10 != null) {
                return C9936P.a(j10, m(), k(), tArr);
            }
            tArr = C9934N.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        i(tArr, 0);
        return tArr;
    }
}
