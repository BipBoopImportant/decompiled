package kb;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import jb.l;
import kb.C9965t;

/* renamed from: kb.y  reason: case insensitive filesystem */
public abstract class C9970y<E> extends C9965t<E> implements Set<E> {

    /* renamed from: b  reason: collision with root package name */
    private transient C9967v<E> f75040b;

    /* renamed from: kb.y$a */
    public static class a<E> extends C9965t.a<E> {

        /* renamed from: d  reason: collision with root package name */
        Object[] f75041d;

        /* renamed from: e  reason: collision with root package name */
        private int f75042e;

        public a() {
            super(4);
        }

        private void k(E e10) {
            Objects.requireNonNull(this.f75041d);
            int length = this.f75041d.length - 1;
            int hashCode = e10.hashCode();
            int b10 = C9964s.b(hashCode);
            while (true) {
                int i10 = b10 & length;
                Object[] objArr = this.f75041d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f75042e += hashCode;
                    super.d(e10);
                    return;
                } else if (!obj.equals(e10)) {
                    b10 = i10 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public a<E> a(E e10) {
            l.j(e10);
            if (this.f75041d == null || C9970y.x(this.f75003b) > this.f75041d.length) {
                this.f75041d = null;
                super.d(e10);
                return this;
            }
            k(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            if (this.f75041d != null) {
                for (E h10 : eArr) {
                    a(h10);
                }
            } else {
                super.e(eArr);
            }
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            l.j(iterable);
            if (this.f75041d != null) {
                for (Object h10 : iterable) {
                    a(h10);
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kb.T} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: kb.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: kb.T} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kb.T} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kb.C9970y<E> l() {
            /*
                r8 = this;
                int r0 = r8.f75003b
                if (r0 == 0) goto L_0x005d
                r1 = 1
                if (r0 == r1) goto L_0x0050
                java.lang.Object[] r2 = r8.f75041d
                if (r2 == 0) goto L_0x003c
                int r0 = kb.C9970y.x(r0)
                java.lang.Object[] r2 = r8.f75041d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003c
                int r0 = r8.f75003b
                java.lang.Object[] r2 = r8.f75002a
                int r2 = r2.length
                boolean r0 = kb.C9970y.K(r0, r2)
                if (r0 == 0) goto L_0x0029
                java.lang.Object[] r0 = r8.f75002a
                int r2 = r8.f75003b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            L_0x0027:
                r3 = r0
                goto L_0x002c
            L_0x0029:
                java.lang.Object[] r0 = r8.f75002a
                goto L_0x0027
            L_0x002c:
                kb.T r0 = new kb.T
                int r4 = r8.f75042e
                java.lang.Object[] r5 = r8.f75041d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f75003b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x004a
            L_0x003c:
                int r0 = r8.f75003b
                java.lang.Object[] r2 = r8.f75002a
                kb.y r0 = kb.C9970y.y(r0, r2)
                int r2 = r0.size()
                r8.f75003b = r2
            L_0x004a:
                r8.f75004c = r1
                r1 = 0
                r8.f75041d = r1
                return r0
            L_0x0050:
                java.lang.Object[] r0 = r8.f75002a
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                kb.y r0 = kb.C9970y.F(r0)
                return r0
            L_0x005d:
                kb.y r0 = kb.C9970y.E()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kb.C9970y.a.l():kb.y");
        }

        a(int i10, boolean z10) {
            super(i10);
            if (z10) {
                this.f75041d = new Object[C9970y.x(i10)];
            }
        }
    }

    C9970y() {
    }

    public static <E> C9970y<E> A(Collection<? extends E> collection) {
        if ((collection instanceof C9970y) && !(collection instanceof SortedSet)) {
            C9970y<E> yVar = (C9970y) collection;
            if (!yVar.p()) {
                return yVar;
            }
        }
        Object[] array = collection.toArray();
        return y(array.length, array);
    }

    public static <E> C9970y<E> B(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? y(eArr.length, (Object[]) eArr.clone()) : F(eArr[0]) : E();
    }

    public static <E> C9970y<E> E() {
        return C9939T.f74900i;
    }

    public static <E> C9970y<E> F(E e10) {
        return new C9945Z(e10);
    }

    public static <E> C9970y<E> G(E e10, E e11) {
        return y(2, e10, e11);
    }

    public static <E> C9970y<E> H(E e10, E e11, E e12) {
        return y(3, e10, e11, e12);
    }

    public static <E> C9970y<E> I(E e10, E e11, E e12, E e13, E e14) {
        return y(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> C9970y<E> J(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        l.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return y(length, objArr);
    }

    /* access modifiers changed from: private */
    public static boolean K(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static <E> a<E> t(int i10) {
        C9954i.b(i10, "expectedSize");
        return new a<>(i10, true);
    }

    static int x(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        l.e(z10, "collection too large");
        return CatalogRepository.FETCH_FLAG_SDB;
    }

    /* access modifiers changed from: private */
    public static <E> C9970y<E> y(int i10, Object... objArr) {
        if (i10 == 0) {
            return E();
        }
        if (i10 != 1) {
            int x10 = x(i10);
            Object[] objArr2 = new Object[x10];
            int i11 = x10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = C9934N.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int b10 = C9964s.b(hashCode);
                while (true) {
                    int i15 = b10 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj.equals(a10)) {
                        break;
                    } else {
                        b10++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new C9945Z(obj2);
            } else if (x(i13) < x10 / 2) {
                return y(i13, objArr);
            } else {
                if (K(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new C9939T(objArr, i12, objArr2, i11, i13);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return F(obj3);
        }
    }

    /* access modifiers changed from: package-private */
    public C9967v<E> C() {
        return C9967v.r(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean D() {
        return false;
    }

    public C9967v<E> b() {
        C9967v<E> vVar = this.f75040b;
        if (vVar != null) {
            return vVar;
        }
        C9967v<E> C10 = C();
        this.f75040b = C10;
        return C10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9970y) || !D() || !((C9970y) obj).D() || hashCode() == obj.hashCode()) {
            return C9944Y.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C9944Y.d(this);
    }

    /* renamed from: q */
    public abstract e0<E> iterator();
}
