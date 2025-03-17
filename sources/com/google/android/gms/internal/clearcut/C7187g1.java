package com.google.android.gms.internal.clearcut;

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

/* renamed from: com.google.android.gms.internal.clearcut.g1  reason: case insensitive filesystem */
class C7187g1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f48395a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<C7208n1> f48396b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f48397c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48398d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C7214p1 f48399e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f48400f;

    /* renamed from: g  reason: collision with root package name */
    private volatile C7196j1 f48401g;

    private C7187g1(int i10) {
        this.f48395a = i10;
        this.f48396b = Collections.emptyList();
        this.f48397c = Collections.emptyMap();
        this.f48400f = Collections.emptyMap();
    }

    private final int b(K k10) {
        int i10;
        int size = this.f48396b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo((Comparable) this.f48396b.get(i11).getKey());
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
            int compareTo2 = k10.compareTo((Comparable) this.f48396b.get(i13).getKey());
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

    static <FieldDescriptorType extends C7166a0<FieldDescriptorType>> C7187g1<FieldDescriptorType, Object> h(int i10) {
        return new C7190h1(i10);
    }

    /* access modifiers changed from: private */
    public final V k(int i10) {
        s();
        V value = this.f48396b.remove(i10).getValue();
        if (!this.f48397c.isEmpty()) {
            Iterator it = t().entrySet().iterator();
            this.f48396b.add(new C7208n1(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void s() {
        if (this.f48398d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> t() {
        s();
        if (this.f48397c.isEmpty() && !(this.f48397c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f48397c = treeMap;
            this.f48400f = treeMap.descendingMap();
        }
        return (SortedMap) this.f48397c;
    }

    public final boolean a() {
        return this.f48398d;
    }

    public void clear() {
        s();
        if (!this.f48396b.isEmpty()) {
            this.f48396b.clear();
        }
        if (!this.f48397c.isEmpty()) {
            this.f48397c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f48397c.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k10, V v10) {
        s();
        int b10 = b(k10);
        if (b10 >= 0) {
            return this.f48396b.get(b10).setValue(v10);
        }
        s();
        if (this.f48396b.isEmpty() && !(this.f48396b instanceof ArrayList)) {
            this.f48396b = new ArrayList(this.f48395a);
        }
        int i10 = -(b10 + 1);
        if (i10 >= this.f48395a) {
            return t().put(k10, v10);
        }
        int size = this.f48396b.size();
        int i11 = this.f48395a;
        if (size == i11) {
            C7208n1 remove = this.f48396b.remove(i11 - 1);
            t().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f48396b.add(i10, new C7208n1(this, k10, v10));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f48399e == null) {
            this.f48399e = new C7214p1(this, (C7190h1) null);
        }
        return this.f48399e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7187g1)) {
            return super.equals(obj);
        }
        C7187g1 g1Var = (C7187g1) obj;
        int size = size();
        if (size != g1Var.size()) {
            return false;
        }
        int o10 = o();
        if (o10 != g1Var.o()) {
            return entrySet().equals(g1Var.entrySet());
        }
        for (int i10 = 0; i10 < o10; i10++) {
            if (!i(i10).equals(g1Var.i(i10))) {
                return false;
            }
        }
        if (o10 != size) {
            return this.f48397c.equals(g1Var.f48397c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        return b10 >= 0 ? this.f48396b.get(b10).getValue() : this.f48397c.get(comparable);
    }

    public int hashCode() {
        int o10 = o();
        int i10 = 0;
        for (int i11 = 0; i11 < o10; i11++) {
            i10 += this.f48396b.get(i11).hashCode();
        }
        return this.f48397c.size() > 0 ? i10 + this.f48397c.hashCode() : i10;
    }

    public final Map.Entry<K, V> i(int i10) {
        return this.f48396b.get(i10);
    }

    public final int o() {
        return this.f48396b.size();
    }

    public final Iterable<Map.Entry<K, V>> p() {
        return this.f48397c.isEmpty() ? C7199k1.a() : this.f48397c.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> q() {
        if (this.f48401g == null) {
            this.f48401g = new C7196j1(this, (C7190h1) null);
        }
        return this.f48401g;
    }

    public V remove(Object obj) {
        s();
        Comparable comparable = (Comparable) obj;
        int b10 = b(comparable);
        if (b10 >= 0) {
            return k(b10);
        }
        if (this.f48397c.isEmpty()) {
            return null;
        }
        return this.f48397c.remove(comparable);
    }

    public int size() {
        return this.f48396b.size() + this.f48397c.size();
    }

    public void u() {
        if (!this.f48398d) {
            this.f48397c = this.f48397c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f48397c);
            this.f48400f = this.f48400f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f48400f);
            this.f48398d = true;
        }
    }

    /* synthetic */ C7187g1(int i10, C7190h1 h1Var) {
        this(i10);
    }
}
