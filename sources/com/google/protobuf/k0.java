package com.google.protobuf;

import com.google.protobuf.C9587u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class k0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f69329a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<k0<K, V>.defpackage.e> f69330b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f69331c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f69332d;

    /* renamed from: e  reason: collision with root package name */
    private volatile k0<K, V>.defpackage.g f69333e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f69334f;

    /* renamed from: g  reason: collision with root package name */
    private volatile k0<K, V>.defpackage.c f69335g;

    class a extends k0<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, (a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return k0.super.put((Comparable) obj, obj2);
        }

        public void t() {
            if (!s()) {
                for (int i10 = 0; i10 < n(); i10++) {
                    Map.Entry m10 = m(i10);
                    if (((C9587u.b) m10.getKey()).e()) {
                        m10.setValue(Collections.unmodifiableList((List) m10.getValue()));
                    }
                }
                for (Map.Entry entry : p()) {
                    if (((C9587u.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            k0.super.t();
        }
    }

    private class c extends k0<K, V>.defpackage.g {
        private c() {
            super(k0.this, (a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(k0.this, (a) null);
        }

        /* synthetic */ c(k0 k0Var, a aVar) {
            this();
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f69340a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f69341b = new b();

        class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.f69340a;
            }
        }

        static <T> Iterable<T> b() {
            return f69341b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<k0<K, V>.defpackage.e> {

        /* renamed from: a  reason: collision with root package name */
        private final K f69342a;

        /* renamed from: b  reason: collision with root package name */
        private V f69343b;

        e(k0 k0Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(k0<K, V>.defpackage.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f69342a, entry.getKey()) && b(this.f69343b, entry.getValue());
        }

        public V getValue() {
            return this.f69343b;
        }

        public int hashCode() {
            K k10 = this.f69342a;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f69343b;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        /* renamed from: j */
        public K getKey() {
            return this.f69342a;
        }

        public V setValue(V v10) {
            k0.this.i();
            V v11 = this.f69343b;
            this.f69343b = v10;
            return v11;
        }

        public String toString() {
            return this.f69342a + "=" + this.f69343b;
        }

        e(K k10, V v10) {
            this.f69342a = k10;
            this.f69343b = v10;
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            k0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            k0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(k0.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            k0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return k0.this.size();
        }

        /* synthetic */ g(k0 k0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ k0(int i10, a aVar) {
        this(i10);
    }

    private int h(K k10) {
        int i10;
        int size = this.f69330b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo(this.f69330b.get(i11).getKey());
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
            int compareTo2 = k10.compareTo(this.f69330b.get(i13).getKey());
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

    /* access modifiers changed from: private */
    public void i() {
        if (this.f69332d) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        i();
        if (this.f69330b.isEmpty() && !(this.f69330b instanceof ArrayList)) {
            this.f69330b = new ArrayList(this.f69329a);
        }
    }

    private SortedMap<K, V> q() {
        i();
        if (this.f69331c.isEmpty() && !(this.f69331c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f69331c = treeMap;
            this.f69334f = treeMap.descendingMap();
        }
        return (SortedMap) this.f69331c;
    }

    static <FieldDescriptorType extends C9587u.b<FieldDescriptorType>> k0<FieldDescriptorType, Object> u(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public V w(int i10) {
        i();
        V value = this.f69330b.remove(i10).getValue();
        if (!this.f69331c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f69330b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        i();
        if (!this.f69330b.isEmpty()) {
            this.f69330b.clear();
        }
        if (!this.f69331c.isEmpty()) {
            this.f69331c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f69331c.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f69333e == null) {
            this.f69333e = new g(this, (a) null);
        }
        return this.f69333e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return super.equals(obj);
        }
        k0 k0Var = (k0) obj;
        int size = size();
        if (size != k0Var.size()) {
            return false;
        }
        int n10 = n();
        if (n10 != k0Var.n()) {
            return entrySet().equals(k0Var.entrySet());
        }
        for (int i10 = 0; i10 < n10; i10++) {
            if (!m(i10).equals(k0Var.m(i10))) {
                return false;
            }
        }
        if (n10 != size) {
            return this.f69331c.equals(k0Var.f69331c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h10 = h(comparable);
        return h10 >= 0 ? this.f69330b.get(h10).getValue() : this.f69331c.get(comparable);
    }

    public int hashCode() {
        int n10 = n();
        int i10 = 0;
        for (int i11 = 0; i11 < n10; i11++) {
            i10 += this.f69330b.get(i11).hashCode();
        }
        return o() > 0 ? i10 + this.f69331c.hashCode() : i10;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> k() {
        if (this.f69335g == null) {
            this.f69335g = new c(this, (a) null);
        }
        return this.f69335g;
    }

    public Map.Entry<K, V> m(int i10) {
        return this.f69330b.get(i10);
    }

    public int n() {
        return this.f69330b.size();
    }

    public int o() {
        return this.f69331c.size();
    }

    public Iterable<Map.Entry<K, V>> p() {
        return this.f69331c.isEmpty() ? d.b() : this.f69331c.entrySet();
    }

    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int h10 = h(comparable);
        if (h10 >= 0) {
            return w(h10);
        }
        if (this.f69331c.isEmpty()) {
            return null;
        }
        return this.f69331c.remove(comparable);
    }

    public boolean s() {
        return this.f69332d;
    }

    public int size() {
        return this.f69330b.size() + this.f69331c.size();
    }

    public void t() {
        if (!this.f69332d) {
            this.f69331c = this.f69331c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f69331c);
            this.f69334f = this.f69334f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f69334f);
            this.f69332d = true;
        }
    }

    /* renamed from: v */
    public V put(K k10, V v10) {
        i();
        int h10 = h(k10);
        if (h10 >= 0) {
            return this.f69330b.get(h10).setValue(v10);
        }
        l();
        int i10 = -(h10 + 1);
        if (i10 >= this.f69329a) {
            return q().put(k10, v10);
        }
        int size = this.f69330b.size();
        int i11 = this.f69329a;
        if (size == i11) {
            e remove = this.f69330b.remove(i11 - 1);
            q().put(remove.getKey(), remove.getValue());
        }
        this.f69330b.add(i10, new e(k10, v10));
        return null;
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f69336a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f69337b;

        private b() {
            this.f69336a = k0.this.f69330b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f69337b == null) {
                this.f69337b = k0.this.f69334f.entrySet().iterator();
            }
            return this.f69337b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List b10 = k0.this.f69330b;
            int i10 = this.f69336a - 1;
            this.f69336a = i10;
            return (Map.Entry) b10.get(i10);
        }

        public boolean hasNext() {
            int i10 = this.f69336a;
            return (i10 > 0 && i10 <= k0.this.f69330b.size()) || a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(k0 k0Var, a aVar) {
            this();
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f69345a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f69346b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f69347c;

        private f() {
            this.f69345a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f69347c == null) {
                this.f69347c = k0.this.f69331c.entrySet().iterator();
            }
            return this.f69347c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f69346b = true;
            int i10 = this.f69345a + 1;
            this.f69345a = i10;
            return i10 < k0.this.f69330b.size() ? (Map.Entry) k0.this.f69330b.get(this.f69345a) : (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f69345a + 1 >= k0.this.f69330b.size()) {
                return !k0.this.f69331c.isEmpty() && a().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f69346b) {
                this.f69346b = false;
                k0.this.i();
                if (this.f69345a < k0.this.f69330b.size()) {
                    k0 k0Var = k0.this;
                    int i10 = this.f69345a;
                    this.f69345a = i10 - 1;
                    Object unused = k0Var.w(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(k0 k0Var, a aVar) {
            this();
        }
    }

    private k0(int i10) {
        this.f69329a = i10;
        this.f69330b = Collections.emptyList();
        this.f69331c = Collections.emptyMap();
        this.f69334f = Collections.emptyMap();
    }
}
