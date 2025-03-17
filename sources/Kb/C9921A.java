package kb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import jb.l;

/* renamed from: kb.A  reason: case insensitive filesystem */
public abstract class C9921A<E> extends C9970y<E> implements NavigableSet<E>, a0<E> {

    /* renamed from: c  reason: collision with root package name */
    final transient Comparator<? super E> f74857c;

    /* renamed from: d  reason: collision with root package name */
    transient C9921A<E> f74858d;

    C9921A(Comparator<? super E> comparator) {
        this.f74857c = comparator;
    }

    static <E> C9921A<E> L(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return S(comparator);
        }
        C9934N.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            E e10 = eArr[i12];
            if (comparator.compare(e10, eArr[i11 - 1]) != 0) {
                eArr[i11] = e10;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i11);
        }
        return new C9940U(C9967v.s(eArr, i11), comparator);
    }

    public static <E> C9921A<E> M(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        l.j(comparator);
        if (b0.b(comparator, iterable) && (iterable instanceof C9921A)) {
            C9921A<E> a10 = (C9921A) iterable;
            if (!a10.p()) {
                return a10;
            }
        }
        Object[] j10 = C9922B.j(iterable);
        return L(comparator, j10.length, j10);
    }

    public static <E> C9921A<E> O(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return M(comparator, collection);
    }

    static <E> C9940U<E> S(Comparator<? super E> comparator) {
        return C9935O.d().equals(comparator) ? C9940U.f74906f : new C9940U<>(C9967v.E(), comparator);
    }

    static int d0(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public abstract C9921A<E> P();

    /* renamed from: Q */
    public abstract e0<E> descendingIterator();

    /* renamed from: R */
    public C9921A<E> descendingSet() {
        C9921A<E> a10 = this.f74858d;
        if (a10 != null) {
            return a10;
        }
        C9921A<E> P10 = P();
        this.f74858d = P10;
        P10.f74858d = this;
        return P10;
    }

    /* renamed from: T */
    public C9921A<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* renamed from: U */
    public C9921A<E> headSet(E e10, boolean z10) {
        return V(l.j(e10), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract C9921A<E> V(E e10, boolean z10);

    /* renamed from: W */
    public C9921A<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    /* renamed from: X */
    public C9921A<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        l.j(e10);
        l.j(e11);
        l.d(this.f74857c.compare(e10, e11) <= 0);
        return Y(e10, z10, e11, z11);
    }

    /* access modifiers changed from: package-private */
    public abstract C9921A<E> Y(E e10, boolean z10, E e11, boolean z11);

    /* renamed from: Z */
    public C9921A<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* renamed from: a0 */
    public C9921A<E> tailSet(E e10, boolean z10) {
        return b0(l.j(e10), z10);
    }

    /* access modifiers changed from: package-private */
    public abstract C9921A<E> b0(E e10, boolean z10);

    /* access modifiers changed from: package-private */
    public int c0(Object obj, Object obj2) {
        return d0(this.f74857c, obj, obj2);
    }

    public E ceiling(E e10) {
        return C9922B.c(tailSet(e10, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.f74857c;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return C9923C.l(headSet(e10, true).descendingIterator(), null);
    }

    public E higher(E e10) {
        return C9922B.c(tailSet(e10, false), null);
    }

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        return C9923C.l(headSet(e10, false).descendingIterator(), null);
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public abstract e0<E> iterator();
}
