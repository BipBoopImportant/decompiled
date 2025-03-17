package com.google.android.gms.internal.vision;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class W1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f49281a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<C7471b2> f49282b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f49283c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f49284d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C7479d2 f49285e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f49286f;

    /* renamed from: g  reason: collision with root package name */
    private volatile X1 f49287g;

    private W1(int i10) {
        this.f49281a = i10;
        this.f49282b = Collections.emptyList();
        this.f49283c = Collections.emptyMap();
        this.f49286f = Collections.emptyMap();
    }

    private final int a(K k10) {
        int i10;
        int size = this.f49282b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo((Comparable) this.f49282b.get(i11).getKey());
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            } else if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = k10.compareTo((Comparable) this.f49282b.get(i13).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 <= 0) {
                return i13;
            } else {
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    static <FieldDescriptorType extends K0<FieldDescriptorType>> W1<FieldDescriptorType, Object> b(int i10) {
        return new V1(i10);
    }

    /* access modifiers changed from: private */
    public final V n(int i10) {
        t();
        V value = this.f49282b.remove(i10).getValue();
        if (!this.f49283c.isEmpty()) {
            Iterator it = u().entrySet().iterator();
            this.f49282b.add(new C7471b2(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void t() {
        if (this.f49284d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> u() {
        t();
        if (this.f49283c.isEmpty() && !(this.f49283c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f49283c = treeMap;
            this.f49286f = treeMap.descendingMap();
        }
        return (SortedMap) this.f49283c;
    }

    public void clear() {
        t();
        if (!this.f49282b.isEmpty()) {
            this.f49282b.clear();
        }
        if (!this.f49283c.isEmpty()) {
            this.f49283c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f49283c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k10, V v10) {
        t();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f49282b.get(a10).setValue(v10);
        }
        t();
        if (this.f49282b.isEmpty() && !(this.f49282b instanceof ArrayList)) {
            this.f49282b = new ArrayList(this.f49281a);
        }
        int i10 = -(a10 + 1);
        if (i10 >= this.f49281a) {
            return u().put(k10, v10);
        }
        int size = this.f49282b.size();
        int i11 = this.f49281a;
        if (size == i11) {
            C7471b2 remove = this.f49282b.remove(i11 - 1);
            u().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f49282b.add(i10, new C7471b2(this, k10, v10));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f49285e == null) {
            this.f49285e = new C7479d2(this, (V1) null);
        }
        return this.f49285e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return super.equals(obj);
        }
        W1 w12 = (W1) obj;
        int size = size();
        if (size != w12.size()) {
            return false;
        }
        int m10 = m();
        if (m10 != w12.m()) {
            return entrySet().equals(w12.entrySet());
        }
        for (int i10 = 0; i10 < m10; i10++) {
            if (!k(i10).equals(w12.k(i10))) {
                return false;
            }
        }
        if (m10 != size) {
            return this.f49283c.equals(w12.f49283c);
        }
        return true;
    }

    public void f() {
        if (!this.f49284d) {
            this.f49283c = this.f49283c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f49283c);
            this.f49286f = this.f49286f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f49286f);
            this.f49284d = true;
        }
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        return a10 >= 0 ? this.f49282b.get(a10).getValue() : this.f49283c.get(comparable);
    }

    public int hashCode() {
        int m10 = m();
        int i10 = 0;
        for (int i11 = 0; i11 < m10; i11++) {
            i10 += this.f49282b.get(i11).hashCode();
        }
        return this.f49283c.size() > 0 ? i10 + this.f49283c.hashCode() : i10;
    }

    public final Map.Entry<K, V> k(int i10) {
        return this.f49282b.get(i10);
    }

    public final boolean l() {
        return this.f49284d;
    }

    public final int m() {
        return this.f49282b.size();
    }

    public final Iterable<Map.Entry<K, V>> p() {
        return this.f49283c.isEmpty() ? C7467a2.a() : this.f49283c.entrySet();
    }

    public V remove(Object obj) {
        t();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return n(a10);
        }
        if (this.f49283c.isEmpty()) {
            return null;
        }
        return this.f49283c.remove(comparable);
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> s() {
        if (this.f49287g == null) {
            this.f49287g = new X1(this, (V1) null);
        }
        return this.f49287g;
    }

    public int size() {
        return this.f49282b.size() + this.f49283c.size();
    }

    /* synthetic */ W1(int i10, V1 v12) {
        this(i10);
    }
}
