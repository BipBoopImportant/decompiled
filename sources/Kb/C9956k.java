package kb;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import jb.j;
import jb.l;
import nb.C10076f;

/* renamed from: kb.k  reason: case insensitive filesystem */
class C9956k<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Object f74971j = new Object();

    /* renamed from: a  reason: collision with root package name */
    private transient Object f74972a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f74973b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f74974c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f74975d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public transient int f74976e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f74977f;

    /* renamed from: g  reason: collision with root package name */
    private transient Set<K> f74978g;

    /* renamed from: h  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f74979h;

    /* renamed from: i  reason: collision with root package name */
    private transient Collection<V> f74980i;

    /* renamed from: kb.k$a */
    class a extends C9956k<K, V>.defpackage.e<K> {
        a() {
            super(C9956k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public K c(int i10) {
            return C9956k.this.L(i10);
        }
    }

    /* renamed from: kb.k$b */
    class b extends C9956k<K, V>.defpackage.e<Map.Entry<K, V>> {
        b() {
            super(C9956k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    /* renamed from: kb.k$c */
    class c extends C9956k<K, V>.defpackage.e<V> {
        c() {
            super(C9956k.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public V c(int i10) {
            return C9956k.this.b0(i10);
        }
    }

    /* renamed from: kb.k$d */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        public void clear() {
            C9956k.this.clear();
        }

        public boolean contains(Object obj) {
            Map B10 = C9956k.this.B();
            if (B10 != null) {
                return B10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int l10 = C9956k.this.I(entry.getKey());
            return l10 != -1 && j.a(C9956k.this.b0(l10), entry.getValue());
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C9956k.this.D();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = kb.C9956k.n(r9.f74984a);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                kb.k r0 = kb.C9956k.this
                java.util.Map r0 = r0.B()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                kb.k r0 = kb.C9956k.this
                boolean r0 = r0.O()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                kb.k r0 = kb.C9956k.this
                int r0 = r0.G()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                kb.k r10 = kb.C9956k.this
                java.lang.Object r5 = r10.S()
                kb.k r10 = kb.C9956k.this
                int[] r6 = r10.Q()
                kb.k r10 = kb.C9956k.this
                java.lang.Object[] r7 = r10.R()
                kb.k r10 = kb.C9956k.this
                java.lang.Object[] r8 = r10.T()
                r4 = r0
                int r10 = kb.C9957l.f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                kb.k r1 = kb.C9956k.this
                r1.N(r10, r0)
                kb.k r10 = kb.C9956k.this
                kb.C9956k.f(r10)
                kb.k r10 = kb.C9956k.this
                r10.H()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kb.C9956k.d.remove(java.lang.Object):boolean");
        }

        public int size() {
            return C9956k.this.size();
        }
    }

    /* renamed from: kb.k$f */
    class f extends AbstractSet<K> {
        f() {
        }

        public void clear() {
            C9956k.this.clear();
        }

        public boolean contains(Object obj) {
            return C9956k.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return C9956k.this.M();
        }

        public boolean remove(Object obj) {
            Map B10 = C9956k.this.B();
            return B10 != null ? B10.keySet().remove(obj) : C9956k.this.P(obj) != C9956k.f74971j;
        }

        public int size() {
            return C9956k.this.size();
        }
    }

    /* renamed from: kb.k$g */
    final class g extends C9950e<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f74990a;

        /* renamed from: b  reason: collision with root package name */
        private int f74991b;

        g(int i10) {
            this.f74990a = C9956k.this.L(i10);
            this.f74991b = i10;
        }

        private void a() {
            int i10 = this.f74991b;
            if (i10 == -1 || i10 >= C9956k.this.size() || !j.a(this.f74990a, C9956k.this.L(this.f74991b))) {
                this.f74991b = C9956k.this.I(this.f74990a);
            }
        }

        public K getKey() {
            return this.f74990a;
        }

        public V getValue() {
            Map B10 = C9956k.this.B();
            if (B10 != null) {
                return C9933M.a(B10.get(this.f74990a));
            }
            a();
            int i10 = this.f74991b;
            return i10 == -1 ? C9933M.b() : C9956k.this.b0(i10);
        }

        public V setValue(V v10) {
            Map B10 = C9956k.this.B();
            if (B10 != null) {
                return C9933M.a(B10.put(this.f74990a, v10));
            }
            a();
            int i10 = this.f74991b;
            if (i10 == -1) {
                C9956k.this.put(this.f74990a, v10);
                return C9933M.b();
            }
            V m10 = C9956k.this.b0(i10);
            C9956k.this.a0(this.f74991b, v10);
            return m10;
        }
    }

    /* renamed from: kb.k$h */
    class h extends AbstractCollection<V> {
        h() {
        }

        public void clear() {
            C9956k.this.clear();
        }

        public Iterator<V> iterator() {
            return C9956k.this.c0();
        }

        public int size() {
            return C9956k.this.size();
        }
    }

    C9956k(int i10) {
        J(i10);
    }

    public static <K, V> C9956k<K, V> A(int i10) {
        return new C9956k<>(i10);
    }

    private int C(int i10) {
        return Q()[i10];
    }

    /* access modifiers changed from: private */
    public int G() {
        return (1 << (this.f74976e & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int I(Object obj) {
        if (O()) {
            return -1;
        }
        int c10 = C9964s.c(obj);
        int G10 = G();
        int h10 = C9957l.h(S(), c10 & G10);
        if (h10 == 0) {
            return -1;
        }
        int b10 = C9957l.b(c10, G10);
        do {
            int i10 = h10 - 1;
            int C10 = C(i10);
            if (C9957l.b(C10, G10) == b10 && j.a(obj, L(i10))) {
                return i10;
            }
            h10 = C9957l.c(C10, G10);
        } while (h10 != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    public K L(int i10) {
        return R()[i10];
    }

    /* access modifiers changed from: private */
    public Object P(Object obj) {
        if (O()) {
            return f74971j;
        }
        int G10 = G();
        int f10 = C9957l.f(obj, (Object) null, G10, S(), Q(), R(), (Object[]) null);
        if (f10 == -1) {
            return f74971j;
        }
        Object b02 = b0(f10);
        N(f10, G10);
        this.f74977f--;
        H();
        return b02;
    }

    /* access modifiers changed from: private */
    public int[] Q() {
        int[] iArr = this.f74973b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] R() {
        Object[] objArr = this.f74974c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object S() {
        Object obj = this.f74972a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f74975d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void V(int i10) {
        int min;
        int length = Q().length;
        if (i10 > length && (min = Math.min(CatalogRepository.FETCH_FLAG_ALL, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            U(min);
        }
    }

    private int W(int i10, int i11, int i12, int i13) {
        Object a10 = C9957l.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C9957l.i(a10, i12 & i14, i13 + 1);
        }
        Object S10 = S();
        int[] Q10 = Q();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = C9957l.h(S10, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = Q10[i16];
                int b10 = C9957l.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = C9957l.h(a10, i18);
                C9957l.i(a10, i18, h10);
                Q10[i16] = C9957l.d(b10, h11, i14);
                h10 = C9957l.c(i17, i10);
            }
        }
        this.f74972a = a10;
        Y(i14);
        return i14;
    }

    private void X(int i10, int i11) {
        Q()[i10] = i11;
    }

    private void Y(int i10) {
        this.f74976e = C9957l.d(this.f74976e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void Z(int i10, K k10) {
        R()[i10] = k10;
    }

    /* access modifiers changed from: private */
    public void a0(int i10, V v10) {
        T()[i10] = v10;
    }

    /* access modifiers changed from: private */
    public V b0(int i10) {
        return T()[i10];
    }

    static /* synthetic */ int f(C9956k kVar) {
        int i10 = kVar.f74977f;
        kVar.f74977f = i10 - 1;
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> B() {
        Object obj = this.f74972a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> D() {
        Map B10 = B();
        return B10 != null ? B10.entrySet().iterator() : new b();
    }

    /* access modifiers changed from: package-private */
    public int E() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    public int F(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f74977f) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f74976e += 32;
    }

    /* access modifiers changed from: package-private */
    public void J(int i10) {
        l.e(i10 >= 0, "Expected size must be >= 0");
        this.f74976e = C10076f.e(i10, 1, CatalogRepository.FETCH_FLAG_ALL);
    }

    /* access modifiers changed from: package-private */
    public void K(int i10, K k10, V v10, int i11, int i12) {
        X(i10, C9957l.d(i11, 0, i12));
        Z(i10, k10);
        a0(i10, v10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<K> M() {
        Map B10 = B();
        return B10 != null ? B10.keySet().iterator() : new a();
    }

    /* access modifiers changed from: package-private */
    public void N(int i10, int i11) {
        Object S10 = S();
        int[] Q10 = Q();
        Object[] R10 = R();
        Object[] T10 = T();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj = R10[i12];
            R10[i10] = obj;
            T10[i10] = T10[i12];
            R10[i12] = null;
            T10[i12] = null;
            Q10[i10] = Q10[i12];
            Q10[i12] = 0;
            int c10 = C9964s.c(obj) & i11;
            int h10 = C9957l.h(S10, c10);
            if (h10 == size) {
                C9957l.i(S10, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = Q10[i13];
                int c11 = C9957l.c(i14, i11);
                if (c11 == size) {
                    Q10[i13] = C9957l.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            R10[i10] = null;
            T10[i10] = null;
            Q10[i10] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean O() {
        return this.f74972a == null;
    }

    /* access modifiers changed from: package-private */
    public void U(int i10) {
        this.f74973b = Arrays.copyOf(Q(), i10);
        this.f74974c = Arrays.copyOf(R(), i10);
        this.f74975d = Arrays.copyOf(T(), i10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> c0() {
        Map B10 = B();
        return B10 != null ? B10.values().iterator() : new c();
    }

    public void clear() {
        if (!O()) {
            H();
            Map B10 = B();
            if (B10 != null) {
                this.f74976e = C10076f.e(size(), 3, CatalogRepository.FETCH_FLAG_ALL);
                B10.clear();
                this.f74972a = null;
                this.f74977f = 0;
                return;
            }
            Arrays.fill(R(), 0, this.f74977f, (Object) null);
            Arrays.fill(T(), 0, this.f74977f, (Object) null);
            C9957l.g(S());
            Arrays.fill(Q(), 0, this.f74977f, 0);
            this.f74977f = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map B10 = B();
        return B10 != null ? B10.containsKey(obj) : I(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f74977f; i10++) {
            if (j.a(obj, b0(i10))) {
                return true;
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f74979h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> v10 = v();
        this.f74979h = v10;
        return v10;
    }

    public V get(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.get(obj);
        }
        int I10 = I(obj);
        if (I10 == -1) {
            return null;
        }
        q(I10);
        return b0(I10);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f74978g;
        if (set != null) {
            return set;
        }
        Set<K> x10 = x();
        this.f74978g = x10;
        return x10;
    }

    public V put(K k10, V v10) {
        int i10;
        int W10;
        if (O()) {
            t();
        }
        Map B10 = B();
        if (B10 != null) {
            return B10.put(k10, v10);
        }
        int[] Q10 = Q();
        Object[] R10 = R();
        V[] T10 = T();
        int i11 = this.f74977f;
        int i12 = i11 + 1;
        int c10 = C9964s.c(k10);
        int G10 = G();
        int i13 = c10 & G10;
        int h10 = C9957l.h(S(), i13);
        if (h10 != 0) {
            int b10 = C9957l.b(c10, G10);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = Q10[i15];
                if (C9957l.b(i16, G10) != b10 || !j.a(k10, R10[i15])) {
                    int c11 = C9957l.c(i16, G10);
                    i14++;
                    if (c11 != 0) {
                        h10 = c11;
                    } else if (i14 >= 9) {
                        return u().put(k10, v10);
                    } else {
                        if (i12 > G10) {
                            W10 = W(G10, C9957l.e(G10), c10, i11);
                        } else {
                            Q10[i15] = C9957l.d(i16, i12, G10);
                        }
                    }
                } else {
                    V v11 = T10[i15];
                    T10[i15] = v10;
                    q(i15);
                    return v11;
                }
            }
            i10 = G10;
            V(i12);
            K(i11, k10, v10, c10, i10);
            this.f74977f = i12;
            H();
            return null;
        } else if (i12 > G10) {
            W10 = W(G10, C9957l.e(G10), c10, i11);
        } else {
            C9957l.i(S(), i13, i12);
            i10 = G10;
            V(i12);
            K(i11, k10, v10, c10, i10);
            this.f74977f = i12;
            H();
            return null;
        }
        i10 = W10;
        V(i12);
        K(i11, k10, v10, c10, i10);
        this.f74977f = i12;
        H();
        return null;
    }

    /* access modifiers changed from: package-private */
    public void q(int i10) {
    }

    public V remove(Object obj) {
        Map B10 = B();
        if (B10 != null) {
            return B10.remove(obj);
        }
        V P10 = P(obj);
        if (P10 == f74971j) {
            return null;
        }
        return P10;
    }

    /* access modifiers changed from: package-private */
    public int s(int i10, int i11) {
        return i10 - 1;
    }

    public int size() {
        Map B10 = B();
        return B10 != null ? B10.size() : this.f74977f;
    }

    /* access modifiers changed from: package-private */
    public int t() {
        l.p(O(), "Arrays already allocated");
        int i10 = this.f74976e;
        int j10 = C9957l.j(i10);
        this.f74972a = C9957l.a(j10);
        Y(j10 - 1);
        this.f74973b = new int[i10];
        this.f74974c = new Object[i10];
        this.f74975d = new Object[i10];
        return i10;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> u() {
        Map<K, V> w10 = w(G() + 1);
        int E10 = E();
        while (E10 >= 0) {
            w10.put(L(E10), b0(E10));
            E10 = F(E10);
        }
        this.f74972a = w10;
        this.f74973b = null;
        this.f74974c = null;
        this.f74975d = null;
        H();
        return w10;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> v() {
        return new d();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f74980i;
        if (collection != null) {
            return collection;
        }
        Collection<V> z10 = z();
        this.f74980i = z10;
        return z10;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> w(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public Set<K> x() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public Collection<V> z() {
        return new h();
    }

    /* renamed from: kb.k$e */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        int f74985a;

        /* renamed from: b  reason: collision with root package name */
        int f74986b;

        /* renamed from: c  reason: collision with root package name */
        int f74987c;

        private e() {
            this.f74985a = C9956k.this.f74976e;
            this.f74986b = C9956k.this.E();
            this.f74987c = -1;
        }

        private void a() {
            if (C9956k.this.f74976e != this.f74985a) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract T c(int i10);

        /* access modifiers changed from: package-private */
        public void d() {
            this.f74985a += 32;
        }

        public boolean hasNext() {
            return this.f74986b >= 0;
        }

        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f74986b;
                this.f74987c = i10;
                T c10 = c(i10);
                this.f74986b = C9956k.this.F(this.f74986b);
                return c10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            a();
            C9954i.c(this.f74987c >= 0);
            d();
            C9956k kVar = C9956k.this;
            kVar.remove(kVar.L(this.f74987c));
            this.f74986b = C9956k.this.s(this.f74986b, this.f74987c);
            this.f74987c = -1;
        }

        /* synthetic */ e(C9956k kVar, a aVar) {
            this();
        }
    }
}
