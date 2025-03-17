package kb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import kb.C9965t;

/* renamed from: kb.w  reason: case insensitive filesystem */
public abstract class C9968w<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f75013d = new Map.Entry[0];

    /* renamed from: a  reason: collision with root package name */
    private transient C9970y<Map.Entry<K, V>> f75014a;

    /* renamed from: b  reason: collision with root package name */
    private transient C9970y<K> f75015b;

    /* renamed from: c  reason: collision with root package name */
    private transient C9965t<V> f75016c;

    /* renamed from: kb.w$a */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f75017a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f75018b;

        /* renamed from: c  reason: collision with root package name */
        int f75019c;

        /* renamed from: d  reason: collision with root package name */
        boolean f75020d;

        /* renamed from: e  reason: collision with root package name */
        C1359a f75021e;

        /* renamed from: kb.w$a$a  reason: collision with other inner class name */
        static final class C1359a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f75022a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f75023b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f75024c;

            C1359a(Object obj, Object obj2, Object obj3) {
                this.f75022a = obj;
                this.f75023b = obj2;
                this.f75024c = obj3;
            }

            /* access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f75022a + "=" + this.f75023b + " and " + this.f75022a + "=" + this.f75024c);
            }
        }

        public a() {
            this(4);
        }

        private C9968w<K, V> b(boolean z10) {
            Object[] objArr;
            C1359a aVar;
            C1359a aVar2;
            if (!z10 || (aVar2 = this.f75021e) == null) {
                int i10 = this.f75019c;
                if (this.f75017a == null) {
                    objArr = this.f75018b;
                } else {
                    if (this.f75020d) {
                        this.f75018b = Arrays.copyOf(this.f75018b, i10 * 2);
                    }
                    objArr = this.f75018b;
                    if (!z10) {
                        objArr = e(objArr, this.f75019c);
                        if (objArr.length < this.f75018b.length) {
                            i10 = objArr.length >>> 1;
                        }
                    }
                    i(objArr, i10, this.f75017a);
                }
                this.f75020d = true;
                C9938S t10 = C9938S.t(i10, objArr, this);
                if (!z10 || (aVar = this.f75021e) == null) {
                    return t10;
                }
                throw aVar.a();
            }
            throw aVar2.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f75018b;
            if (i11 > objArr.length) {
                this.f75018b = Arrays.copyOf(objArr, C9965t.b.c(objArr.length, i11));
                this.f75020d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i10 - bitSet.cardinality()) * 2)];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, C9935O.b(comparator).f(C9927G.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public C9968w<K, V> a() {
            return c();
        }

        public C9968w<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f75019c + 1);
            C9954i.a(k10, v10);
            Object[] objArr = this.f75018b;
            int i10 = this.f75019c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f75019c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f75019c + ((Collection) iterable).size());
            }
            for (Map.Entry g10 : iterable) {
                g(g10);
            }
            return this;
        }

        a(int i10) {
            this.f75018b = new Object[(i10 * 2)];
            this.f75019c = 0;
            this.f75020d = false;
        }
    }

    C9968w() {
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> a<K, V> b(int i10) {
        C9954i.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> C9968w<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> C9968w<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof C9968w) && !(map instanceof SortedMap)) {
            C9968w<K, V> wVar = (C9968w) map;
            if (!wVar.l()) {
                return wVar;
            }
        }
        return c(map.entrySet());
    }

    public static <K, V> C9968w<K, V> n() {
        return C9938S.f74885h;
    }

    public static <K, V> C9968w<K, V> o(K k10, V v10) {
        C9954i.a(k10, v10);
        return C9938S.s(1, new Object[]{k10, v10});
    }

    public static <K, V> C9968w<K, V> p(K k10, V v10, K k11, V v11) {
        C9954i.a(k10, v10);
        C9954i.a(k11, v11);
        return C9938S.s(2, new Object[]{k10, v10, k11, v11});
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public boolean equals(Object obj) {
        return C9927G.c(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract C9970y<Map.Entry<K, V>> f();

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    /* access modifiers changed from: package-private */
    public abstract C9970y<K> h();

    public int hashCode() {
        return C9944Y.d(entrySet());
    }

    /* access modifiers changed from: package-private */
    public abstract C9965t<V> i();

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public C9970y<Map.Entry<K, V>> entrySet() {
        C9970y<Map.Entry<K, V>> yVar = this.f75014a;
        if (yVar != null) {
            return yVar;
        }
        C9970y<Map.Entry<K, V>> f10 = f();
        this.f75014a = f10;
        return f10;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean l();

    /* renamed from: m */
    public C9970y<K> keySet() {
        C9970y<K> yVar = this.f75015b;
        if (yVar != null) {
            return yVar;
        }
        C9970y<K> h10 = h();
        this.f75015b = h10;
        return h10;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public C9965t<V> values() {
        C9965t<V> tVar = this.f75016c;
        if (tVar != null) {
            return tVar;
        }
        C9965t<V> i10 = i();
        this.f75016c = i10;
        return i10;
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C9927G.j(this);
    }
}
