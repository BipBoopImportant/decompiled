package kb;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jb.j;
import jb.l;
import kb.C9944Y;

/* renamed from: kb.G  reason: case insensitive filesystem */
public final class C9927G {

    /* renamed from: kb.G$a */
    class a extends c0<Map.Entry<K, V>, V> {
        a(Iterator it) {
            super(it);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: kb.G$b */
    private enum b implements jb.f<Map.Entry<?, ?>, Object> {
        KEY {
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE {
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
    }

    /* renamed from: kb.G$c */
    static abstract class c<K, V> extends C9944Y.e<Map.Entry<K, V>> {
        c() {
        }

        /* access modifiers changed from: package-private */
        public abstract Map<K, V> b();

        public void clear() {
            b().clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) l.j(collection));
            } catch (UnsupportedOperationException unused) {
                return C9944Y.j(this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) l.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet g10 = C9944Y.g(collection.size());
                for (Object next : collection) {
                    if (contains(next) && (next instanceof Map.Entry)) {
                        g10.add(((Map.Entry) next).getKey());
                    }
                }
                return b().keySet().retainAll(g10);
            }
        }

        public int size() {
            return b().size();
        }
    }

    /* renamed from: kb.G$d */
    static class d<K, V> extends C9944Y.e<K> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f74871a;

        d(Map<K, V> map) {
            this.f74871a = (Map) l.j(map);
        }

        /* access modifiers changed from: package-private */
        public Map<K, V> b() {
            return this.f74871a;
        }

        public boolean contains(Object obj) {
            return b().containsKey(obj);
        }

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public int size() {
            return b().size();
        }
    }

    /* renamed from: kb.G$e */
    static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, V> f74872a;

        e(Map<K, V> map) {
            this.f74872a = (Map) l.j(map);
        }

        /* access modifiers changed from: package-private */
        public final Map<K, V> b() {
            return this.f74872a;
        }

        public void clear() {
            b().clear();
        }

        public boolean contains(Object obj) {
            return b().containsValue(obj);
        }

        public boolean isEmpty() {
            return b().isEmpty();
        }

        public Iterator<V> iterator() {
            return C9927G.l(b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : b().entrySet()) {
                    if (j.a(obj, entry.getValue())) {
                        b().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) l.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = C9944Y.f();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return b().keySet().removeAll(f10);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) l.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet f10 = C9944Y.f();
                for (Map.Entry entry : b().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        f10.add(entry.getKey());
                    }
                }
                return b().keySet().retainAll(f10);
            }
        }

        public int size() {
            return b().size();
        }
    }

    /* renamed from: kb.G$f */
    static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private transient Set<Map.Entry<K, V>> f74873a;

        /* renamed from: b  reason: collision with root package name */
        private transient Collection<V> f74874b;

        f() {
        }

        /* access modifiers changed from: package-private */
        public abstract Set<Map.Entry<K, V>> a();

        /* access modifiers changed from: package-private */
        public Collection<V> b() {
            return new e(this);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f74873a;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> a10 = a();
            this.f74873a = a10;
            return a10;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f74874b;
            if (collection != null) {
                return collection;
            }
            Collection<V> b10 = b();
            this.f74874b = b10;
            return b10;
        }
    }

    static int a(int i10) {
        if (i10 < 3) {
            C9954i.b(i10, "expectedSize");
            return i10 + 1;
        } else if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    static boolean b(Map<?, ?> map, Object obj) {
        return C9923C.d(l(map.entrySet().iterator()), obj);
    }

    static boolean c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> d(K k10, V v10) {
        return new C9966u(k10, v10);
    }

    static <K> jb.f<Map.Entry<K, ?>, K> e() {
        return b.KEY;
    }

    public static <K, V> IdentityHashMap<K, V> f() {
        return new IdentityHashMap<>();
    }

    static boolean g(Map<?, ?> map, Object obj) {
        l.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V h(Map<?, V> map, Object obj) {
        l.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static <V> V i(Map<?, V> map, Object obj) {
        l.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String j(Map<?, ?> map) {
        StringBuilder b10 = C9955j.b(map.size());
        b10.append('{');
        boolean z10 = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z10) {
                b10.append(", ");
            }
            b10.append(next.getKey());
            b10.append('=');
            b10.append(next.getValue());
            z10 = false;
        }
        b10.append('}');
        return b10.toString();
    }

    static <V> jb.f<Map.Entry<?, V>, V> k() {
        return b.VALUE;
    }

    static <K, V> Iterator<V> l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
