package kb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import k.C5487a;
import kb.C9927G;
import kb.C9951f;

/* renamed from: kb.d  reason: case insensitive filesystem */
abstract class C9949d<K, V> extends C9951f<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public transient Map<K, Collection<V>> f74925e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f74926f;

    /* renamed from: kb.d$a */
    class a extends C9949d<K, V>.d<V> {
        a() {
            super();
        }

        /* access modifiers changed from: package-private */
        public V a(K k10, V v10) {
            return v10;
        }
    }

    /* renamed from: kb.d$b */
    class b extends C9949d<K, V>.d<Map.Entry<K, V>> {
        b() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Map.Entry<K, V> a(K k10, V v10) {
            return C9927G.d(k10, v10);
        }
    }

    /* renamed from: kb.d$c */
    private class c extends C9927G.f<K, Collection<V>> {

        /* renamed from: c  reason: collision with root package name */
        final transient Map<K, Collection<V>> f74929c;

        /* renamed from: kb.d$c$a */
        class a extends C9927G.c<K, Collection<V>> {
            a() {
            }

            /* access modifiers changed from: package-private */
            public Map<K, Collection<V>> b() {
                return c.this;
            }

            public boolean contains(Object obj) {
                return C9955j.c(c.this.f74929c.entrySet(), obj);
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                C9949d.this.x(entry.getKey());
                return true;
            }
        }

        /* renamed from: kb.d$c$b */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f74932a;

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f74933b;

            b() {
                this.f74932a = c.this.f74929c.entrySet().iterator();
            }

            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.f74932a.next();
                this.f74933b = (Collection) next.getValue();
                return c.this.f(next);
            }

            public boolean hasNext() {
                return this.f74932a.hasNext();
            }

            public void remove() {
                jb.l.p(this.f74933b != null, "no calls to next() since the last call to remove()");
                this.f74932a.remove();
                C9949d.q(C9949d.this, this.f74933b.size());
                this.f74933b.clear();
                this.f74933b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f74929c = map;
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) C9927G.h(this.f74929c, obj);
            if (collection == null) {
                return null;
            }
            return C9949d.this.z(obj, collection);
        }

        public void clear() {
            if (this.f74929c == C9949d.this.f74925e) {
                C9949d.this.clear();
            } else {
                C9923C.c(new b());
            }
        }

        public boolean containsKey(Object obj) {
            return C9927G.g(this.f74929c, obj);
        }

        /* renamed from: d */
        public Collection<V> remove(Object obj) {
            Collection remove = this.f74929c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> s10 = C9949d.this.s();
            s10.addAll(remove);
            C9949d.q(C9949d.this, remove.size());
            remove.clear();
            return s10;
        }

        public boolean equals(Object obj) {
            return this == obj || this.f74929c.equals(obj);
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C9927G.d(key, C9949d.this.z(key, entry.getValue()));
        }

        public int hashCode() {
            return this.f74929c.hashCode();
        }

        public Set<K> keySet() {
            return C9949d.this.j();
        }

        public int size() {
            return this.f74929c.size();
        }

        public String toString() {
            return this.f74929c.toString();
        }
    }

    /* renamed from: kb.d$d  reason: collision with other inner class name */
    private abstract class C1358d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f74935a;

        /* renamed from: b  reason: collision with root package name */
        K f74936b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection<V> f74937c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator<V> f74938d = C9923C.h();

        C1358d() {
            this.f74935a = C9949d.this.f74925e.entrySet().iterator();
        }

        /* access modifiers changed from: package-private */
        public abstract T a(K k10, V v10);

        public boolean hasNext() {
            return this.f74935a.hasNext() || this.f74938d.hasNext();
        }

        public T next() {
            if (!this.f74938d.hasNext()) {
                Map.Entry next = this.f74935a.next();
                this.f74936b = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f74937c = collection;
                this.f74938d = collection.iterator();
            }
            return a(C9933M.a(this.f74936b), this.f74938d.next());
        }

        public void remove() {
            this.f74938d.remove();
            Collection<V> collection = this.f74937c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f74935a.remove();
            }
            C9949d.o(C9949d.this);
        }
    }

    /* renamed from: kb.d$e */
    private class e extends C9927G.d<K, Collection<V>> {

        /* renamed from: kb.d$e$a */
        class a implements Iterator<K> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f74941a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f74942b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f74943c;

            a(e eVar, Iterator it) {
                this.f74942b = it;
                this.f74943c = eVar;
            }

            public boolean hasNext() {
                return this.f74942b.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f74942b.next();
                this.f74941a = entry;
                return entry.getKey();
            }

            public void remove() {
                jb.l.p(this.f74941a != null, "no calls to next() since the last call to remove()");
                Collection value = this.f74941a.getValue();
                this.f74942b.remove();
                C9949d.q(C9949d.this, value.size());
                value.clear();
                this.f74941a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            C9923C.c(iterator());
        }

        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        public int hashCode() {
            return b().keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new a(this, b().entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) b().remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                C9949d.q(C9949d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* renamed from: kb.d$f */
    private final class f extends C9949d<K, V>.defpackage.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry ceilingEntry = k().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return f(ceilingEntry);
        }

        public K ceilingKey(K k10) {
            return k().ceilingKey(k10);
        }

        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(k().descendingMap());
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = k().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return f(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry floorEntry = k().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return f(floorEntry);
        }

        public K floorKey(K k10) {
            return k().floorKey(k10);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry higherEntry = k().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return f(higherEntry);
        }

        public K higherKey(K k10) {
            return k().higherKey(k10);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public NavigableSet<K> h() {
            return new g(k());
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = k().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return f(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry lowerEntry = k().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return f(lowerEntry);
        }

        public K lowerKey(K k10) {
            return k().lowerKey(k10);
        }

        /* renamed from: m */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        /* renamed from: n */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* access modifiers changed from: package-private */
        public Map.Entry<K, Collection<V>> o(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection s10 = C9949d.this.s();
            s10.addAll((Collection) next.getValue());
            it.remove();
            return C9927G.d(next.getKey(), C9949d.this.y(s10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public NavigableMap<K, Collection<V>> k() {
            return (NavigableMap) super.k();
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return o(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return o(descendingMap().entrySet().iterator());
        }

        /* renamed from: q */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        /* renamed from: s */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(k().headMap(k10, z10));
        }

        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(k().subMap(k10, z10, k11, z11));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(k().tailMap(k10, z10));
        }
    }

    /* renamed from: kb.d$g */
    private final class g extends C9949d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k10) {
            return i().ceilingKey(k10);
        }

        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new g(i().descendingMap());
        }

        public K floor(K k10) {
            return i().floorKey(k10);
        }

        public K higher(K k10) {
            return i().higherKey(k10);
        }

        /* renamed from: j */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        public K lower(K k10) {
            return i().lowerKey(k10);
        }

        /* renamed from: m */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        /* renamed from: p */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        public K pollFirst() {
            return C9923C.o(iterator());
        }

        public K pollLast() {
            return C9923C.o(descendingIterator());
        }

        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(i().headMap(k10, z10));
        }

        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(i().subMap(k10, z10, k11, z11));
        }

        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(i().tailMap(k10, z10));
        }
    }

    /* renamed from: kb.d$h */
    private class h extends C9949d<K, V>.l implements RandomAccess {
        h(K k10, List<V> list, C9949d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* renamed from: kb.d$i */
    private class i extends C9949d<K, V>.defpackage.c implements SortedMap<K, Collection<V>> {

        /* renamed from: e  reason: collision with root package name */
        SortedSet<K> f74947e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return k().comparator();
        }

        public K firstKey() {
            return k().firstKey();
        }

        /* access modifiers changed from: package-private */
        public SortedSet<K> h() {
            return new j(k());
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(k().headMap(k10));
        }

        /* renamed from: i */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f74947e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> h10 = h();
            this.f74947e = h10;
            return h10;
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> k() {
            return (SortedMap) this.f74929c;
        }

        public K lastKey() {
            return k().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(k().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(k().tailMap(k10));
        }
    }

    /* renamed from: kb.d$j */
    private class j extends C9949d<K, V>.defpackage.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        public K first() {
            return i().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(i().headMap(k10));
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> i() {
            return (SortedMap) super.b();
        }

        public K last() {
            return i().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(i().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(i().tailMap(k10));
        }
    }

    protected C9949d(Map<K, Collection<V>> map) {
        jb.l.d(map.isEmpty());
        this.f74925e = map;
    }

    static /* synthetic */ int n(C9949d dVar) {
        int i10 = dVar.f74926f;
        dVar.f74926f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int o(C9949d dVar) {
        int i10 = dVar.f74926f;
        dVar.f74926f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int p(C9949d dVar, int i10) {
        int i11 = dVar.f74926f + i10;
        dVar.f74926f = i11;
        return i11;
    }

    static /* synthetic */ int q(C9949d dVar, int i10) {
        int i11 = dVar.f74926f - i10;
        dVar.f74926f = i11;
        return i11;
    }

    /* access modifiers changed from: private */
    public static <E> Iterator<E> w(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) C9927G.i(this.f74925e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f74926f -= size;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<V> A(K k10, List<V> list, C9949d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k10, list, kVar) : new l(k10, list, kVar);
    }

    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    public void clear() {
        for (Collection<V> clear : this.f74925e.values()) {
            clear.clear();
        }
        this.f74925e.clear();
        this.f74926f = 0;
    }

    /* access modifiers changed from: package-private */
    public Collection<Map.Entry<K, V>> f() {
        return this instanceof C9943X ? new C9951f.b() : new C9951f.a();
    }

    public Collection<V> get(K k10) {
        Collection collection = this.f74925e.get(k10);
        if (collection == null) {
            collection = t(k10);
        }
        return z(k10, collection);
    }

    /* access modifiers changed from: package-private */
    public Collection<V> h() {
        return new C9951f.c();
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> k() {
        return new a();
    }

    public boolean put(K k10, V v10) {
        Collection collection = this.f74925e.get(k10);
        if (collection == null) {
            Collection t10 = t(k10);
            if (t10.add(v10)) {
                this.f74926f++;
                this.f74925e.put(k10, t10);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v10)) {
            return false;
        } else {
            this.f74926f++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Collection<V> s();

    public int size() {
        return this.f74926f;
    }

    /* access modifiers changed from: package-private */
    public Collection<V> t(K k10) {
        return s();
    }

    /* access modifiers changed from: package-private */
    public final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f74925e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f74925e) : map instanceof SortedMap ? new i((SortedMap) this.f74925e) : new c(this.f74925e);
    }

    /* access modifiers changed from: package-private */
    public final Set<K> v() {
        Map<K, Collection<V>> map = this.f74925e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f74925e) : map instanceof SortedMap ? new j((SortedMap) this.f74925e) : new e(this.f74925e);
    }

    public Collection<V> values() {
        return super.values();
    }

    /* access modifiers changed from: package-private */
    public abstract <E> Collection<E> y(Collection<E> collection);

    /* access modifiers changed from: package-private */
    public abstract Collection<V> z(K k10, Collection<V> collection);

    /* renamed from: kb.d$k */
    class k extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f74950a;

        /* renamed from: b  reason: collision with root package name */
        Collection<V> f74951b;

        /* renamed from: c  reason: collision with root package name */
        final C9949d<K, V>.k f74952c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<V> f74953d;

        k(K k10, Collection<V> collection, C9949d<K, V>.k kVar) {
            this.f74950a = k10;
            this.f74951b = collection;
            this.f74952c = kVar;
            this.f74953d = kVar == null ? null : kVar.j();
        }

        public boolean add(V v10) {
            m();
            boolean isEmpty = this.f74951b.isEmpty();
            boolean add = this.f74951b.add(v10);
            if (add) {
                C9949d.n(C9949d.this);
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f74951b.addAll(collection);
            if (addAll) {
                C9949d.p(C9949d.this, this.f74951b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            C9949d<K, V>.k kVar = this.f74952c;
            if (kVar != null) {
                kVar.b();
            } else {
                C9949d.this.f74925e.put(this.f74950a, this.f74951b);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f74951b.clear();
                C9949d.q(C9949d.this, size);
                p();
            }
        }

        public boolean contains(Object obj) {
            m();
            return this.f74951b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            m();
            return this.f74951b.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m();
            return this.f74951b.equals(obj);
        }

        public int hashCode() {
            m();
            return this.f74951b.hashCode();
        }

        /* access modifiers changed from: package-private */
        public C9949d<K, V>.k i() {
            return this.f74952c;
        }

        public Iterator<V> iterator() {
            m();
            return new a();
        }

        /* access modifiers changed from: package-private */
        public Collection<V> j() {
            return this.f74951b;
        }

        /* access modifiers changed from: package-private */
        public K k() {
            return this.f74950a;
        }

        /* access modifiers changed from: package-private */
        public void m() {
            Collection<V> collection;
            C9949d<K, V>.k kVar = this.f74952c;
            if (kVar != null) {
                kVar.m();
                if (this.f74952c.j() != this.f74953d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f74951b.isEmpty() && (collection = (Collection) C9949d.this.f74925e.get(this.f74950a)) != null) {
                this.f74951b = collection;
            }
        }

        /* access modifiers changed from: package-private */
        public void p() {
            C9949d<K, V>.k kVar = this.f74952c;
            if (kVar != null) {
                kVar.p();
            } else if (this.f74951b.isEmpty()) {
                C9949d.this.f74925e.remove(this.f74950a);
            }
        }

        public boolean remove(Object obj) {
            m();
            boolean remove = this.f74951b.remove(obj);
            if (remove) {
                C9949d.o(C9949d.this);
                p();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f74951b.removeAll(collection);
            if (removeAll) {
                C9949d.p(C9949d.this, this.f74951b.size() - size);
                p();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            jb.l.j(collection);
            int size = size();
            boolean retainAll = this.f74951b.retainAll(collection);
            if (retainAll) {
                C9949d.p(C9949d.this, this.f74951b.size() - size);
                p();
            }
            return retainAll;
        }

        public int size() {
            m();
            return this.f74951b.size();
        }

        public String toString() {
            m();
            return this.f74951b.toString();
        }

        /* renamed from: kb.d$k$a */
        class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f74955a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f74956b;

            a() {
                Collection<V> collection = k.this.f74951b;
                this.f74956b = collection;
                this.f74955a = C9949d.w(collection);
            }

            /* access modifiers changed from: package-private */
            public Iterator<V> a() {
                c();
                return this.f74955a;
            }

            /* access modifiers changed from: package-private */
            public void c() {
                k.this.m();
                if (k.this.f74951b != this.f74956b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                c();
                return this.f74955a.hasNext();
            }

            public V next() {
                c();
                return this.f74955a.next();
            }

            public void remove() {
                this.f74955a.remove();
                C9949d.o(C9949d.this);
                k.this.p();
            }

            a(Iterator<V> it) {
                this.f74956b = k.this.f74951b;
                this.f74955a = it;
            }
        }
    }

    /* renamed from: kb.d$l */
    class l extends C9949d<K, V>.k implements List<V> {

        /* renamed from: kb.d$l$a */
        private class a extends C9949d<K, V>.C5487a implements ListIterator<V> {
            a() {
                super();
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [kb.d$l$a, kb.d$k$a] */
            private ListIterator<V> d() {
                return (ListIterator) a();
            }

            public void add(V v10) {
                boolean isEmpty = l.this.isEmpty();
                d().add(v10);
                C9949d.n(C9949d.this);
                if (isEmpty) {
                    l.this.b();
                }
            }

            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            public int nextIndex() {
                return d().nextIndex();
            }

            public V previous() {
                return d().previous();
            }

            public int previousIndex() {
                return d().previousIndex();
            }

            public void set(V v10) {
                d().set(v10);
            }

            public a(int i10) {
                super(l.this.q().listIterator(i10));
            }
        }

        l(K k10, List<V> list, C9949d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        public void add(int i10, V v10) {
            m();
            boolean isEmpty = j().isEmpty();
            q().add(i10, v10);
            C9949d.n(C9949d.this);
            if (isEmpty) {
                b();
            }
        }

        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = q().addAll(i10, collection);
            if (addAll) {
                C9949d.p(C9949d.this, j().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        public V get(int i10) {
            m();
            return q().get(i10);
        }

        public int indexOf(Object obj) {
            m();
            return q().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            m();
            return q().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            m();
            return new a();
        }

        /* access modifiers changed from: package-private */
        public List<V> q() {
            return (List) j();
        }

        public V remove(int i10) {
            m();
            V remove = q().remove(i10);
            C9949d.o(C9949d.this);
            p();
            return remove;
        }

        public V set(int i10, V v10) {
            m();
            return q().set(i10, v10);
        }

        public List<V> subList(int i10, int i11) {
            m();
            return C9949d.this.A(k(), q().subList(i10, i11), i() == null ? this : i());
        }

        public ListIterator<V> listIterator(int i10) {
            m();
            return new a(i10);
        }
    }
}
