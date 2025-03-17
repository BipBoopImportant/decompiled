package kb;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import jb.l;

/* renamed from: kb.U  reason: case insensitive filesystem */
final class C9940U<E> extends C9921A<E> {

    /* renamed from: f  reason: collision with root package name */
    static final C9940U<Comparable> f74906f = new C9940U<>(C9967v.E(), C9935O.d());

    /* renamed from: e  reason: collision with root package name */
    final transient C9967v<E> f74907e;

    C9940U(C9967v<E> vVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f74907e = vVar;
    }

    private int j0(Object obj) {
        return Collections.binarySearch(this.f74907e, obj, k0());
    }

    /* access modifiers changed from: package-private */
    public C9921A<E> P() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.f74857c);
        return isEmpty() ? C9921A.S(reverseOrder) : new C9940U(this.f74907e.L(), reverseOrder);
    }

    /* renamed from: Q */
    public e0<E> descendingIterator() {
        return this.f74907e.L().iterator();
    }

    /* access modifiers changed from: package-private */
    public C9921A<E> V(E e10, boolean z10) {
        return g0(0, h0(e10, z10));
    }

    /* access modifiers changed from: package-private */
    public C9921A<E> Y(E e10, boolean z10, E e11, boolean z11) {
        return b0(e10, z10).V(e11, z11);
    }

    public C9967v<E> b() {
        return this.f74907e;
    }

    /* access modifiers changed from: package-private */
    public C9921A<E> b0(E e10, boolean z10) {
        return g0(i0(e10, z10), size());
    }

    public E ceiling(E e10) {
        int i02 = i0(e10, true);
        if (i02 == size()) {
            return null;
        }
        return this.f74907e.get(i02);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return j0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof C9931K) {
            collection = ((C9931K) collection).I1();
        }
        if (!b0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        e0 q10 = iterator();
        Iterator<?> it = collection.iterator();
        if (!q10.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = q10.next();
        while (true) {
            try {
                int c02 = c0(next2, next);
                if (c02 < 0) {
                    if (!q10.hasNext()) {
                        return false;
                    }
                    next2 = q10.next();
                } else if (c02 == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (c02 > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.f74857c
            boolean r1 = kb.b0.b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            kb.e0 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.c0(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.C9940U.equals(java.lang.Object):boolean");
    }

    public E first() {
        if (!isEmpty()) {
            return this.f74907e.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e10) {
        int h02 = h0(e10, true) - 1;
        if (h02 == -1) {
            return null;
        }
        return this.f74907e.get(h02);
    }

    /* access modifiers changed from: package-private */
    public C9940U<E> g0(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new C9940U<>(this.f74907e.subList(i10, i11), this.f74857c) : C9921A.S(this.f74857c);
    }

    /* access modifiers changed from: package-private */
    public int h0(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f74907e, l.j(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public E higher(E e10) {
        int i02 = i0(e10, false);
        if (i02 == size()) {
            return null;
        }
        return this.f74907e.get(i02);
    }

    /* access modifiers changed from: package-private */
    public int i(Object[] objArr, int i10) {
        return this.f74907e.i(objArr, i10);
    }

    /* access modifiers changed from: package-private */
    public int i0(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f74907e, l.j(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public Object[] j() {
        return this.f74907e.j();
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f74907e.k();
    }

    /* access modifiers changed from: package-private */
    public Comparator<Object> k0() {
        return this.f74857c;
    }

    public E last() {
        if (!isEmpty()) {
            return this.f74907e.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e10) {
        int h02 = h0(e10, false) - 1;
        if (h02 == -1) {
            return null;
        }
        return this.f74907e.get(h02);
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return this.f74907e.m();
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f74907e.p();
    }

    /* renamed from: q */
    public e0<E> iterator() {
        return this.f74907e.iterator();
    }

    public int size() {
        return this.f74907e.size();
    }
}
