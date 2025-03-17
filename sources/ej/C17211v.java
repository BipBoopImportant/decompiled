package eJ;

import eJ.C17197h;
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

/* renamed from: eJ.v  reason: case insensitive filesystem */
class C17211v<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f143107a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<C17211v<K, V>.defpackage.c> f143108b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f143109c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f143110d;

    /* renamed from: e  reason: collision with root package name */
    private volatile C17211v<K, V>.defpackage.e f143111e;

    /* renamed from: eJ.v$a */
    static class a extends C17211v<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, (a) null);
        }

        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry k10 = k(i10);
                    if (((C17197h.b) k10.getKey()).e()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((C17197h.b) entry.getKey()).e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C17211v.super.p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C17211v.super.s((C17197h.b) obj, obj2);
        }
    }

    /* renamed from: eJ.v$b */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f143112a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f143113b = new C3487b();

        /* renamed from: eJ.v$b$a */
        static class a implements Iterator<Object> {
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

        /* renamed from: eJ.v$b$b  reason: collision with other inner class name */
        static class C3487b implements Iterable<Object> {
            C3487b() {
            }

            public Iterator<Object> iterator() {
                return b.f143112a;
            }
        }

        static <T> Iterable<T> b() {
            return f143113b;
        }
    }

    /* renamed from: eJ.v$c */
    private class c implements Comparable<C17211v<K, V>.defpackage.c>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f143114a;

        /* renamed from: b  reason: collision with root package name */
        private V f143115b;

        c(C17211v vVar, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(C17211v<K, V>.defpackage.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f143114a, entry.getKey()) && b(this.f143115b, entry.getValue());
        }

        public V getValue() {
            return this.f143115b;
        }

        public int hashCode() {
            K k10 = this.f143114a;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f143115b;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        /* renamed from: j */
        public K getKey() {
            return this.f143114a;
        }

        public V setValue(V v10) {
            C17211v.this.h();
            V v11 = this.f143115b;
            this.f143115b = v10;
            return v11;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f143114a);
            String valueOf2 = String.valueOf(this.f143115b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }

        c(K k10, V v10) {
            this.f143114a = k10;
            this.f143115b = v10;
        }
    }

    /* renamed from: eJ.v$e */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C17211v.this.s((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C17211v.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C17211v.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(C17211v.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C17211v.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C17211v.this.size();
        }

        /* synthetic */ e(C17211v vVar, a aVar) {
            this();
        }
    }

    /* synthetic */ C17211v(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int i10;
        int size = this.f143108b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo(this.f143108b.get(i11).getKey());
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
            int compareTo2 = k10.compareTo(this.f143108b.get(i13).getKey());
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
    public void h() {
        if (this.f143110d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        h();
        if (this.f143108b.isEmpty() && !(this.f143108b instanceof ArrayList)) {
            this.f143108b = new ArrayList(this.f143107a);
        }
    }

    private SortedMap<K, V> n() {
        h();
        if (this.f143109c.isEmpty() && !(this.f143109c instanceof TreeMap)) {
            this.f143109c = new TreeMap();
        }
        return (SortedMap) this.f143109c;
    }

    static <FieldDescriptorType extends C17197h.b<FieldDescriptorType>> C17211v<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public V t(int i10) {
        h();
        V value = this.f143108b.remove(i10).getValue();
        if (!this.f143109c.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f143108b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        h();
        if (!this.f143108b.isEmpty()) {
            this.f143108b.clear();
        }
        if (!this.f143109c.isEmpty()) {
            this.f143109c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f143109c.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f143111e == null) {
            this.f143111e = new e(this, (a) null);
        }
        return this.f143111e;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f143108b.get(f10).getValue() : this.f143109c.get(comparable);
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f143108b.get(i10);
    }

    public int l() {
        return this.f143108b.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f143109c.isEmpty() ? b.b() : this.f143109c.entrySet();
    }

    public boolean o() {
        return this.f143110d;
    }

    public void p() {
        if (!this.f143110d) {
            this.f143109c = this.f143109c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f143109c);
            this.f143110d = true;
        }
    }

    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return t(f10);
        }
        if (this.f143109c.isEmpty()) {
            return null;
        }
        return this.f143109c.remove(comparable);
    }

    public V s(K k10, V v10) {
        h();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f143108b.get(f10).setValue(v10);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f143107a) {
            return n().put(k10, v10);
        }
        int size = this.f143108b.size();
        int i11 = this.f143107a;
        if (size == i11) {
            c remove = this.f143108b.remove(i11 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f143108b.add(i10, new c(k10, v10));
        return null;
    }

    public int size() {
        return this.f143108b.size() + this.f143109c.size();
    }

    /* renamed from: eJ.v$d */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f143117a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f143118b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f143119c;

        private d() {
            this.f143117a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f143119c == null) {
                this.f143119c = C17211v.this.f143109c.entrySet().iterator();
            }
            return this.f143119c;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f143118b = true;
            int i10 = this.f143117a + 1;
            this.f143117a = i10;
            return i10 < C17211v.this.f143108b.size() ? (Map.Entry) C17211v.this.f143108b.get(this.f143117a) : (Map.Entry) a().next();
        }

        public boolean hasNext() {
            return this.f143117a + 1 < C17211v.this.f143108b.size() || a().hasNext();
        }

        public void remove() {
            if (this.f143118b) {
                this.f143118b = false;
                C17211v.this.h();
                if (this.f143117a < C17211v.this.f143108b.size()) {
                    C17211v vVar = C17211v.this;
                    int i10 = this.f143117a;
                    this.f143117a = i10 - 1;
                    Object unused = vVar.t(i10);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ d(C17211v vVar, a aVar) {
            this();
        }
    }

    private C17211v(int i10) {
        this.f143107a = i10;
        this.f143108b = Collections.emptyList();
        this.f143109c = Collections.emptyMap();
    }
}
