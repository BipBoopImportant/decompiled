package ha;

import com.sugarcube.app.base.data.source.CatalogRepository;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: ha.b0  reason: case insensitive filesystem */
final class C7959b0 extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Object f52424j = new Object();

    /* renamed from: a  reason: collision with root package name */
    private transient Object f52425a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f52426b;

    /* renamed from: c  reason: collision with root package name */
    transient Object[] f52427c;

    /* renamed from: d  reason: collision with root package name */
    transient Object[] f52428d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public transient int f52429e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public transient int f52430f;

    /* renamed from: g  reason: collision with root package name */
    private transient Set f52431g;

    /* renamed from: h  reason: collision with root package name */
    private transient Set f52432h;

    /* renamed from: i  reason: collision with root package name */
    private transient Collection f52433i;

    C7959b0(int i10) {
        p(12);
    }

    static /* synthetic */ Object k(C7959b0 b0Var) {
        Object obj = b0Var.f52425a;
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: private */
    public final int t() {
        return (1 << (this.f52429e & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public final int u(Object obj) {
        if (s()) {
            return -1;
        }
        int a10 = C7979d0.a(obj);
        int t10 = t();
        Object obj2 = this.f52425a;
        obj2.getClass();
        int c10 = C7969c0.c(obj2, a10 & t10);
        if (c10 != 0) {
            int i10 = ~t10;
            int i11 = a10 & i10;
            do {
                int i12 = c10 - 1;
                int[] iArr = this.f52426b;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f52427c;
                    objArr.getClass();
                    if (r.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                c10 = i13 & t10;
            } while (c10 != 0);
        }
        return -1;
    }

    private final int v(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object d10 = C7969c0.d(i11);
        if (i13 != 0) {
            C7969c0.e(d10, i12 & i14, i13 + 1);
        }
        Object obj = this.f52425a;
        obj.getClass();
        int[] iArr = this.f52426b;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int c10 = C7969c0.c(obj, i15);
            while (c10 != 0) {
                int i16 = c10 - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int c11 = C7969c0.c(d10, i19);
                C7969c0.e(d10, i19, c10);
                iArr[i16] = ((~i14) & i18) | (c11 & i14);
                c10 = i17 & i10;
            }
        }
        this.f52425a = d10;
        x(i14);
        return i14;
    }

    /* access modifiers changed from: private */
    public final Object w(Object obj) {
        if (s()) {
            return f52424j;
        }
        int t10 = t();
        Object obj2 = this.f52425a;
        obj2.getClass();
        int[] iArr = this.f52426b;
        iArr.getClass();
        Object[] objArr = this.f52427c;
        objArr.getClass();
        int b10 = C7969c0.b(obj, (Object) null, t10, obj2, iArr, objArr, (Object[]) null);
        if (b10 == -1) {
            return f52424j;
        }
        Object[] objArr2 = this.f52428d;
        objArr2.getClass();
        Object obj3 = objArr2[b10];
        q(b10, t10);
        this.f52430f--;
        o();
        return obj3;
    }

    private final void x(int i10) {
        this.f52429e = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f52429e & -32);
    }

    public final void clear() {
        if (!s()) {
            o();
            Map m10 = m();
            if (m10 == null) {
                Object[] objArr = this.f52427c;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.f52430f, (Object) null);
                Object[] objArr2 = this.f52428d;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.f52430f, (Object) null);
                Object obj = this.f52425a;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.f52426b;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.f52430f, 0);
                this.f52430f = 0;
                return;
            }
            this.f52429e = L0.a(size(), 3, CatalogRepository.FETCH_FLAG_ALL);
            m10.clear();
            this.f52425a = null;
            this.f52430f = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map m10 = m();
        return m10 != null ? m10.containsKey(obj) : u(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map m10 = m();
        if (m10 != null) {
            return m10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f52430f; i10++) {
            Object[] objArr = this.f52428d;
            objArr.getClass();
            if (r.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f52432h;
        if (set != null) {
            return set;
        }
        V v10 = new V(this);
        this.f52432h = v10;
        return v10;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return isEmpty() ? -1 : 0;
    }

    public final Object get(Object obj) {
        Map m10 = m();
        if (m10 != null) {
            return m10.get(obj);
        }
        int u10 = u(obj);
        if (u10 == -1) {
            return null;
        }
        Object[] objArr = this.f52428d;
        objArr.getClass();
        return objArr[u10];
    }

    /* access modifiers changed from: package-private */
    public final int h(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f52430f) {
            return i11;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.f52431g;
        if (set != null) {
            return set;
        }
        Y y10 = new Y(this);
        this.f52431g = y10;
        return y10;
    }

    /* access modifiers changed from: package-private */
    public final Map m() {
        Object obj = this.f52425a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        this.f52429e += 32;
    }

    /* access modifiers changed from: package-private */
    public final void p(int i10) {
        this.f52429e = L0.a(12, 1, CatalogRepository.FETCH_FLAG_ALL);
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (s()) {
            C8167w.e(s(), "Arrays already allocated");
            int i10 = this.f52429e;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = CatalogRepository.FETCH_FLAG_SDB;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f52425a = C7969c0.d(max2);
            x(max2 - 1);
            this.f52426b = new int[i10];
            this.f52427c = new Object[i10];
            this.f52428d = new Object[i10];
        }
        Map m10 = m();
        if (m10 != null) {
            return m10.put(obj3, obj4);
        }
        int[] iArr = this.f52426b;
        iArr.getClass();
        Object[] objArr = this.f52427c;
        objArr.getClass();
        Object[] objArr2 = this.f52428d;
        objArr2.getClass();
        int i11 = this.f52430f;
        int i12 = i11 + 1;
        int a10 = C7979d0.a(obj);
        int t10 = t();
        int i13 = a10 & t10;
        Object obj5 = this.f52425a;
        obj5.getClass();
        int c10 = C7969c0.c(obj5, i13);
        if (c10 != 0) {
            int i14 = ~t10;
            int i15 = a10 & i14;
            int i16 = 0;
            while (true) {
                int i17 = c10 - 1;
                int i18 = iArr[i17];
                int i19 = i18 & i14;
                if (i19 != i15 || !r.a(obj3, objArr[i17])) {
                    int i20 = i18 & t10;
                    i16++;
                    if (i20 != 0) {
                        c10 = i20;
                    } else if (i16 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(t() + 1, 1.0f);
                        for (int f10 = f(); f10 >= 0; f10 = h(f10)) {
                            Object[] objArr3 = this.f52427c;
                            objArr3.getClass();
                            Object obj6 = objArr3[f10];
                            Object[] objArr4 = this.f52428d;
                            objArr4.getClass();
                            linkedHashMap.put(obj6, objArr4[f10]);
                        }
                        this.f52425a = linkedHashMap;
                        this.f52426b = null;
                        this.f52427c = null;
                        this.f52428d = null;
                        o();
                        return linkedHashMap.put(obj3, obj4);
                    } else if (i12 > t10) {
                        t10 = v(t10, C7969c0.a(t10), a10, i11);
                    } else {
                        iArr[i17] = (i12 & t10) | i19;
                    }
                } else {
                    Object obj7 = objArr2[i17];
                    objArr2[i17] = obj4;
                    return obj7;
                }
            }
        } else if (i12 > t10) {
            t10 = v(t10, C7969c0.a(t10), a10, i11);
        } else {
            Object obj8 = this.f52425a;
            obj8.getClass();
            C7969c0.e(obj8, i13, i12);
        }
        int[] iArr2 = this.f52426b;
        iArr2.getClass();
        int length = iArr2.length;
        if (i12 > length && (min = Math.min(CatalogRepository.FETCH_FLAG_ALL, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.f52426b;
            iArr3.getClass();
            this.f52426b = Arrays.copyOf(iArr3, min);
            Object[] objArr5 = this.f52427c;
            objArr5.getClass();
            this.f52427c = Arrays.copyOf(objArr5, min);
            Object[] objArr6 = this.f52428d;
            objArr6.getClass();
            this.f52428d = Arrays.copyOf(objArr6, min);
        }
        int[] iArr4 = this.f52426b;
        iArr4.getClass();
        iArr4[i11] = (~t10) & a10;
        Object[] objArr7 = this.f52427c;
        objArr7.getClass();
        objArr7[i11] = obj3;
        Object[] objArr8 = this.f52428d;
        objArr8.getClass();
        objArr8[i11] = obj4;
        this.f52430f = i12;
        o();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void q(int i10, int i11) {
        Object obj = this.f52425a;
        obj.getClass();
        int[] iArr = this.f52426b;
        iArr.getClass();
        Object[] objArr = this.f52427c;
        objArr.getClass();
        Object[] objArr2 = this.f52428d;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 < i12) {
            Object obj2 = objArr[i12];
            objArr[i10] = obj2;
            objArr2[i10] = objArr2[i12];
            objArr[i12] = null;
            objArr2[i12] = null;
            iArr[i10] = iArr[i12];
            iArr[i12] = 0;
            int a10 = C7979d0.a(obj2) & i11;
            int c10 = C7969c0.c(obj, a10);
            if (c10 != size) {
                while (true) {
                    int i13 = c10 - 1;
                    int i14 = iArr[i13];
                    int i15 = i14 & i11;
                    if (i15 != size) {
                        c10 = i15;
                    } else {
                        iArr[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                        return;
                    }
                }
            } else {
                C7969c0.e(obj, a10, i10 + 1);
            }
        } else {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
        }
    }

    public final Object remove(Object obj) {
        Map m10 = m();
        if (m10 != null) {
            return m10.remove(obj);
        }
        Object w10 = w(obj);
        if (w10 == f52424j) {
            return null;
        }
        return w10;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.f52425a == null;
    }

    public final int size() {
        Map m10 = m();
        return m10 != null ? m10.size() : this.f52430f;
    }

    public final Collection values() {
        Collection collection = this.f52433i;
        if (collection != null) {
            return collection;
        }
        C7949a0 a0Var = new C7949a0(this);
        this.f52433i = a0Var;
        return a0Var;
    }
}
