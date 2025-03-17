package kb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kb.C9930J;

/* renamed from: kb.f  reason: case insensitive filesystem */
abstract class C9951f<K, V> implements C9928H<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f74960a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set<K> f74961b;

    /* renamed from: c  reason: collision with root package name */
    private transient Collection<V> f74962c;

    /* renamed from: d  reason: collision with root package name */
    private transient Map<K, Collection<V>> f74963d;

    /* renamed from: kb.f$a */
    class a extends C9930J.b<K, V> {
        a() {
        }

        /* access modifiers changed from: package-private */
        public C9928H<K, V> b() {
            return C9951f.this;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return C9951f.this.i();
        }
    }

    /* renamed from: kb.f$b */
    class b extends C9951f<K, V>.defpackage.a implements Set<Map.Entry<K, V>> {
        b() {
            super();
        }

        public boolean equals(Object obj) {
            return C9944Y.a(this, obj);
        }

        public int hashCode() {
            return C9944Y.d(this);
        }
    }

    /* renamed from: kb.f$c */
    class c extends AbstractCollection<V> {
        c() {
        }

        public void clear() {
            C9951f.this.clear();
        }

        public boolean contains(Object obj) {
            return C9951f.this.d(obj);
        }

        public Iterator<V> iterator() {
            return C9951f.this.k();
        }

        public int size() {
            return C9951f.this.size();
        }
    }

    C9951f() {
    }

    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f74960a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> f10 = f();
        this.f74960a = f10;
        return f10;
    }

    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f74963d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e10 = e();
        this.f74963d = e10;
        return e10;
    }

    public boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        for (Collection contains : b().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract Map<K, Collection<V>> e();

    public boolean equals(Object obj) {
        return C9930J.a(this, obj);
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<Map.Entry<K, V>> f();

    /* access modifiers changed from: package-private */
    public abstract Set<K> g();

    /* access modifiers changed from: package-private */
    public abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<Map.Entry<K, V>> i();

    public Set<K> j() {
        Set<K> set = this.f74961b;
        if (set != null) {
            return set;
        }
        Set<K> g10 = g();
        this.f74961b = g10;
        return g10;
    }

    /* access modifiers changed from: package-private */
    public abstract Iterator<V> k();

    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f74962c;
        if (collection != null) {
            return collection;
        }
        Collection<V> h10 = h();
        this.f74962c = h10;
        return h10;
    }
}
