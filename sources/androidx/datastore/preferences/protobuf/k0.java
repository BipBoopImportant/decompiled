package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5166t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class k0<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<k0<K, V>.defpackage.d> f21370a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Map<K, V> f21371b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21372c;

    /* renamed from: d  reason: collision with root package name */
    private volatile k0<K, V>.defpackage.f f21373d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Map<K, V> f21374e;

    /* renamed from: f  reason: collision with root package name */
    private volatile k0<K, V>.defpackage.c f21375f;

    class a extends k0<FieldDescriptorType, Object> {
        a() {
            super((a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return k0.super.put((Comparable) obj, obj2);
        }

        public void t() {
            if (!s()) {
                for (int i10 = 0; i10 < n(); i10++) {
                    Map.Entry m10 = m(i10);
                    if (((C5166t.b) m10.getKey()).e()) {
                        m10.setValue(Collections.unmodifiableList((List) m10.getValue()));
                    }
                }
                for (Map.Entry entry : p()) {
                    if (((C5166t.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            k0.super.t();
        }
    }

    private class c extends k0<K, V>.defpackage.f {
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

    private class d implements Map.Entry<K, V>, Comparable<k0<K, V>.defpackage.d> {

        /* renamed from: a  reason: collision with root package name */
        private final K f21380a;

        /* renamed from: b  reason: collision with root package name */
        private V f21381b;

        d(k0 k0Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(k0<K, V>.defpackage.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f21380a, entry.getKey()) && b(this.f21381b, entry.getValue());
        }

        public V getValue() {
            return this.f21381b;
        }

        public int hashCode() {
            K k10 = this.f21380a;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f21381b;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        /* renamed from: j */
        public K getKey() {
            return this.f21380a;
        }

        public V setValue(V v10) {
            k0.this.i();
            V v11 = this.f21381b;
            this.f21381b = v10;
            return v11;
        }

        public String toString() {
            return this.f21380a + "=" + this.f21381b;
        }

        d(K k10, V v10) {
            this.f21380a = k10;
            this.f21381b = v10;
        }
    }

    private class f extends AbstractSet<Map.Entry<K, V>> {
        private f() {
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
            return new e(k0.this, (a) null);
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

        /* synthetic */ f(k0 k0Var, a aVar) {
            this();
        }
    }

    /* synthetic */ k0(a aVar) {
        this();
    }

    private int h(K k10) {
        int i10;
        int size = this.f21370a.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo(this.f21370a.get(i11).getKey());
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
            int compareTo2 = k10.compareTo(this.f21370a.get(i13).getKey());
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
        if (this.f21372c) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        i();
        if (this.f21370a.isEmpty() && !(this.f21370a instanceof ArrayList)) {
            this.f21370a = new ArrayList(16);
        }
    }

    private SortedMap<K, V> q() {
        i();
        if (this.f21371b.isEmpty() && !(this.f21371b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21371b = treeMap;
            this.f21374e = treeMap.descendingMap();
        }
        return (SortedMap) this.f21371b;
    }

    static <FieldDescriptorType extends C5166t.b<FieldDescriptorType>> k0<FieldDescriptorType, Object> u() {
        return new a();
    }

    /* access modifiers changed from: private */
    public V w(int i10) {
        i();
        V value = this.f21370a.remove(i10).getValue();
        if (!this.f21371b.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            this.f21370a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        i();
        if (!this.f21370a.isEmpty()) {
            this.f21370a.clear();
        }
        if (!this.f21371b.isEmpty()) {
            this.f21371b.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f21371b.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f21373d == null) {
            this.f21373d = new f(this, (a) null);
        }
        return this.f21373d;
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
            return this.f21371b.equals(k0Var.f21371b);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h10 = h(comparable);
        return h10 >= 0 ? this.f21370a.get(h10).getValue() : this.f21371b.get(comparable);
    }

    public int hashCode() {
        int n10 = n();
        int i10 = 0;
        for (int i11 = 0; i11 < n10; i11++) {
            i10 += this.f21370a.get(i11).hashCode();
        }
        return o() > 0 ? i10 + this.f21371b.hashCode() : i10;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> k() {
        if (this.f21375f == null) {
            this.f21375f = new c(this, (a) null);
        }
        return this.f21375f;
    }

    public Map.Entry<K, V> m(int i10) {
        return this.f21370a.get(i10);
    }

    public int n() {
        return this.f21370a.size();
    }

    public int o() {
        return this.f21371b.size();
    }

    public Iterable<Map.Entry<K, V>> p() {
        return this.f21371b.isEmpty() ? Collections.emptySet() : this.f21371b.entrySet();
    }

    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int h10 = h(comparable);
        if (h10 >= 0) {
            return w(h10);
        }
        if (this.f21371b.isEmpty()) {
            return null;
        }
        return this.f21371b.remove(comparable);
    }

    public boolean s() {
        return this.f21372c;
    }

    public int size() {
        return this.f21370a.size() + this.f21371b.size();
    }

    public void t() {
        if (!this.f21372c) {
            this.f21371b = this.f21371b.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21371b);
            this.f21374e = this.f21374e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21374e);
            this.f21372c = true;
        }
    }

    /* renamed from: v */
    public V put(K k10, V v10) {
        i();
        int h10 = h(k10);
        if (h10 >= 0) {
            return this.f21370a.get(h10).setValue(v10);
        }
        l();
        int i10 = -(h10 + 1);
        if (i10 >= 16) {
            return q().put(k10, v10);
        }
        if (this.f21370a.size() == 16) {
            d remove = this.f21370a.remove(15);
            q().put(remove.getKey(), remove.getValue());
        }
        this.f21370a.add(i10, new d(k10, v10));
        return null;
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f21376a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f21377b;

        private b() {
            this.f21376a = k0.this.f21370a.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f21377b == null) {
                this.f21377b = k0.this.f21374e.entrySet().iterator();
            }
            return this.f21377b;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return (Map.Entry) a().next();
            }
            List b10 = k0.this.f21370a;
            int i10 = this.f21376a - 1;
            this.f21376a = i10;
            return (Map.Entry) b10.get(i10);
        }

        public boolean hasNext() {
            int i10 = this.f21376a;
            return (i10 > 0 && i10 <= k0.this.f21370a.size()) || a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(k0 k0Var, a aVar) {
            this();
        }
    }

    private class e implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f21383a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f21384b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f21385c;

        private e() {
            this.f21383a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f21385c == null) {
                this.f21385c = k0.this.f21371b.entrySet().iterator();
            }
            return this.f21385c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f21384b = true;
            int i10 = this.f21383a + 1;
            this.f21383a = i10;
            return i10 < k0.this.f21370a.size() ? (Map.Entry) k0.this.f21370a.get(this.f21383a) : (Map.Entry) a().next();
        }

        public boolean hasNext() {
            if (this.f21383a + 1 >= k0.this.f21370a.size()) {
                return !k0.this.f21371b.isEmpty() && a().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f21384b) {
                this.f21384b = false;
                k0.this.i();
                if (this.f21383a < k0.this.f21370a.size()) {
                    k0 k0Var = k0.this;
                    int i10 = this.f21383a;
                    this.f21383a = i10 - 1;
                    Object unused = k0Var.w(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ e(k0 k0Var, a aVar) {
            this();
        }
    }

    private k0() {
        this.f21370a = Collections.emptyList();
        this.f21371b = Collections.emptyMap();
        this.f21374e = Collections.emptyMap();
    }
}
