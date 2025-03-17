package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class O5<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f48771a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f48772b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f48773c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48774d;

    /* renamed from: e  reason: collision with root package name */
    private volatile U5 f48775e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f48776f;

    private final int b(K k10) {
        int i10;
        int i11 = this.f48772b;
        int i12 = i11 - 1;
        if (i12 >= 0) {
            int compareTo = k10.compareTo((Comparable) ((S5) this.f48771a[i12]).getKey());
            if (compareTo > 0) {
                i10 = i11 + 1;
                return -i10;
            } else if (compareTo == 0) {
                return i12;
            }
        }
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            int compareTo2 = k10.compareTo((Comparable) ((S5) this.f48771a[i14]).getKey());
            if (compareTo2 < 0) {
                i12 = i14 - 1;
            } else if (compareTo2 <= 0) {
                return i14;
            } else {
                i13 = i14 + 1;
            }
        }
        i10 = i13 + 1;
        return -i10;
    }

    /* access modifiers changed from: private */
    public final V k(int i10) {
        u();
        V value = ((S5) this.f48771a[i10]).getValue();
        Object[] objArr = this.f48771a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f48772b - i10) - 1);
        this.f48772b--;
        if (!this.f48773c.isEmpty()) {
            Iterator it = t().entrySet().iterator();
            this.f48771a[this.f48772b] = new S5(this, (Map.Entry) it.next());
            this.f48772b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap<K, V> t() {
        u();
        if (this.f48773c.isEmpty() && !(this.f48773c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f48773c = treeMap;
            this.f48776f = treeMap.descendingMap();
        }
        return (SortedMap) this.f48773c;
    }

    /* access modifiers changed from: private */
    public final void u() {
        if (this.f48774d) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        u();
        if (this.f48772b != 0) {
            this.f48771a = null;
            this.f48772b = 0;
        }
        if (!this.f48773c.isEmpty()) {
            this.f48773c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f48773c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k10, V v10) {
        u();
        int b10 = b(k10);
        if (b10 >= 0) {
            return ((S5) this.f48771a[b10]).setValue(v10);
        }
        u();
        if (this.f48771a == null) {
            this.f48771a = new Object[16];
        }
        int i10 = -(b10 + 1);
        if (i10 >= 16) {
            return t().put(k10, v10);
        }
        int i11 = this.f48772b;
        if (i11 == 16) {
            S5 s52 = (S5) this.f48771a[15];
            this.f48772b = i11 - 1;
            t().put((Comparable) s52.getKey(), s52.getValue());
        }
        Object[] objArr = this.f48771a;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.f48771a[i10] = new S5(this, k10, v10);
        this.f48772b++;
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f48775e == null) {
            this.f48775e = new U5(this);
        }
        return this.f48775e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O5)) {
            return super.equals(obj);
        }
        O5 o52 = (O5) obj;
        int size = size();
        if (size != o52.size()) {
            return false;
        }
        int i10 = this.f48772b;
        if (i10 != o52.f48772b) {
            return entrySet().equals(o52.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!f(i11).equals(o52.f(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f48773c.equals(o52.f48773c);
        }
        return true;
    }

    public final Map.Entry<K, V> f(int i10) {
        if (i10 < this.f48772b) {
            return (S5) this.f48771a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        return b10 >= 0 ? ((S5) this.f48771a[b10]).getValue() : this.f48773c.get(comparable);
    }

    public void h() {
        if (!this.f48774d) {
            this.f48773c = this.f48773c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f48773c);
            this.f48776f = this.f48776f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f48776f);
            this.f48774d = true;
        }
    }

    public int hashCode() {
        int i10 = this.f48772b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.f48771a[i12].hashCode();
        }
        return this.f48773c.size() > 0 ? i11 + this.f48773c.hashCode() : i11;
    }

    public final int i() {
        return this.f48772b;
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.f48773c.isEmpty() ? Collections.emptySet() : this.f48773c.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> o() {
        return new P5(this);
    }

    public final boolean q() {
        return this.f48774d;
    }

    public V remove(Object obj) {
        u();
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return k(b10);
        }
        if (this.f48773c.isEmpty()) {
            return null;
        }
        return this.f48773c.remove(comparable);
    }

    public int size() {
        return this.f48772b + this.f48773c.size();
    }

    private O5() {
        this.f48773c = Collections.emptyMap();
        this.f48776f = Collections.emptyMap();
    }
}
