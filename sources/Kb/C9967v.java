package kb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import jb.l;
import kb.C9965t;

/* renamed from: kb.v  reason: case insensitive filesystem */
public abstract class C9967v<E> extends C9965t<E> implements List<E>, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    private static final f0<Object> f75007b = new b(C9937Q.f74882e, 0);

    /* renamed from: kb.v$a */
    public static final class a<E> extends C9965t.a<E> {
        public a() {
            this(4);
        }

        /* renamed from: h */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public C9967v<E> k() {
            this.f75004c = true;
            return C9967v.s(this.f75002a, this.f75003b);
        }

        a(int i10) {
            super(i10);
        }
    }

    /* renamed from: kb.v$b */
    static class b<E> extends C9946a<E> {

        /* renamed from: c  reason: collision with root package name */
        private final C9967v<E> f75008c;

        b(C9967v<E> vVar, int i10) {
            super(vVar.size(), i10);
            this.f75008c = vVar;
        }

        /* access modifiers changed from: protected */
        public E a(int i10) {
            return this.f75008c.get(i10);
        }
    }

    /* renamed from: kb.v$c */
    private static class c<E> extends C9967v<E> {

        /* renamed from: c  reason: collision with root package name */
        private final transient C9967v<E> f75009c;

        c(C9967v<E> vVar) {
            this.f75009c = vVar;
        }

        private int Q(int i10) {
            return (size() - 1) - i10;
        }

        private int R(int i10) {
            return size() - i10;
        }

        public C9967v<E> L() {
            return this.f75009c;
        }

        /* renamed from: O */
        public C9967v<E> subList(int i10, int i11) {
            l.n(i10, i11, size());
            return this.f75009c.subList(R(i11), R(i10)).L();
        }

        public boolean contains(Object obj) {
            return this.f75009c.contains(obj);
        }

        public E get(int i10) {
            l.h(i10, size());
            return this.f75009c.get(Q(i10));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f75009c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return Q(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C9967v.super.iterator();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f75009c.indexOf(obj);
            if (indexOf >= 0) {
                return Q(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C9967v.super.listIterator();
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return this.f75009c.p();
        }

        public int size() {
            return this.f75009c.size();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return C9967v.super.listIterator(i10);
        }
    }

    /* renamed from: kb.v$d */
    class d extends C9967v<E> {

        /* renamed from: c  reason: collision with root package name */
        final transient int f75010c;

        /* renamed from: d  reason: collision with root package name */
        final transient int f75011d;

        d(int i10, int i11) {
            this.f75010c = i10;
            this.f75011d = i11;
        }

        /* renamed from: O */
        public C9967v<E> subList(int i10, int i11) {
            l.n(i10, i11, this.f75011d);
            C9967v vVar = C9967v.this;
            int i12 = this.f75010c;
            return vVar.subList(i10 + i12, i11 + i12);
        }

        public E get(int i10) {
            l.h(i10, this.f75011d);
            return C9967v.this.get(i10 + this.f75010c);
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C9967v.super.iterator();
        }

        /* access modifiers changed from: package-private */
        public Object[] j() {
            return C9967v.this.j();
        }

        /* access modifiers changed from: package-private */
        public int k() {
            return C9967v.this.m() + this.f75010c + this.f75011d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C9967v.super.listIterator();
        }

        /* access modifiers changed from: package-private */
        public int m() {
            return C9967v.this.m() + this.f75010c;
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return true;
        }

        public int size() {
            return this.f75011d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return C9967v.super.listIterator(i10);
        }
    }

    C9967v() {
    }

    public static <E> C9967v<E> A(Collection<? extends E> collection) {
        if (!(collection instanceof C9965t)) {
            return y(collection.toArray());
        }
        C9967v<E> b10 = ((C9965t) collection).b();
        return b10.p() ? r(b10.toArray()) : b10;
    }

    public static <E> C9967v<E> B(E[] eArr) {
        return eArr.length == 0 ? E() : y((Object[]) eArr.clone());
    }

    public static <E> C9967v<E> E() {
        return C9937Q.f74882e;
    }

    public static <E> C9967v<E> F(E e10) {
        return y(e10);
    }

    public static <E> C9967v<E> G(E e10, E e11) {
        return y(e10, e11);
    }

    public static <E> C9967v<E> H(E e10, E e11, E e12) {
        return y(e10, e11, e12);
    }

    public static <E> C9967v<E> I(E e10, E e11, E e12, E e13, E e14) {
        return y(e10, e11, e12, e13, e14);
    }

    public static <E> C9967v<E> J(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return y(e10, e11, e12, e13, e14, e15, e16);
    }

    @SafeVarargs
    public static <E> C9967v<E> K(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        E[] eArr2 = eArr;
        l.e(eArr2.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr2.length + 12)];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr2, 0, objArr, 12, eArr2.length);
        return y(objArr);
    }

    public static <E> C9967v<E> M(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        l.j(comparator);
        Object[] j10 = C9922B.j(iterable);
        C9934N.b(j10);
        Arrays.sort(j10, comparator);
        return r(j10);
    }

    static <E> C9967v<E> r(Object[] objArr) {
        return s(objArr, objArr.length);
    }

    static <E> C9967v<E> s(Object[] objArr, int i10) {
        return i10 == 0 ? E() : new C9937Q(objArr, i10);
    }

    public static <E> a<E> t() {
        return new a<>();
    }

    public static <E> a<E> x(int i10) {
        C9954i.b(i10, "expectedSize");
        return new a<>(i10);
    }

    private static <E> C9967v<E> y(Object... objArr) {
        return r(C9934N.b(objArr));
    }

    /* renamed from: C */
    public f0<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: D */
    public f0<E> listIterator(int i10) {
        l.l(i10, size());
        return isEmpty() ? f75007b : new b(this, i10);
    }

    public C9967v<E> L() {
        return size() <= 1 ? this : new c(this);
    }

    /* renamed from: O */
    public C9967v<E> subList(int i10, int i11) {
        l.n(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? E() : P(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public C9967v<E> P(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final C9967v<E> b() {
        return this;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return C9925E.a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public int i(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C9925E.b(this, obj);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C9925E.d(this, obj);
    }

    /* renamed from: q */
    public e0<E> iterator() {
        return listIterator();
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }
}
