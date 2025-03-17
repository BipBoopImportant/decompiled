package j0;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k0.C5489a;

/* renamed from: j0.a  reason: case insensitive filesystem */
public class C5445a<K, V> extends b0<K, V> implements Map<K, V> {

    /* renamed from: d  reason: collision with root package name */
    C5445a<K, V>.a f24581d;

    /* renamed from: e  reason: collision with root package name */
    C5445a<K, V>.defpackage.c f24582e;

    /* renamed from: f  reason: collision with root package name */
    C5445a<K, V>.defpackage.e f24583f;

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    final class C0389a extends AbstractSet<Map.Entry<K, V>> {
        C0389a() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public int size() {
            return C5445a.this.size();
        }
    }

    /* renamed from: j0.a$b */
    final class b extends C5454j<K> {
        b() {
            super(C5445a.this.size());
        }

        /* access modifiers changed from: protected */
        public K c(int i10) {
            return C5445a.this.h(i10);
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            C5445a.this.k(i10);
        }
    }

    /* renamed from: j0.a$d */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f24587a;

        /* renamed from: b  reason: collision with root package name */
        int f24588b = -1;

        /* renamed from: c  reason: collision with root package name */
        boolean f24589c;

        d() {
            this.f24587a = C5445a.this.size() - 1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f24588b++;
                this.f24589c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f24589c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return C5489a.c(entry.getKey(), C5445a.this.h(this.f24588b)) && C5489a.c(entry.getValue(), C5445a.this.m(this.f24588b));
            }
        }

        public K getKey() {
            if (this.f24589c) {
                return C5445a.this.h(this.f24588b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f24589c) {
                return C5445a.this.m(this.f24588b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f24588b < this.f24587a;
        }

        public int hashCode() {
            if (this.f24589c) {
                Object h10 = C5445a.this.h(this.f24588b);
                Object m10 = C5445a.this.m(this.f24588b);
                int i10 = 0;
                int hashCode = h10 == null ? 0 : h10.hashCode();
                if (m10 != null) {
                    i10 = m10.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f24589c) {
                C5445a.this.k(this.f24588b);
                this.f24588b--;
                this.f24587a--;
                this.f24589c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v10) {
            if (this.f24589c) {
                return C5445a.this.l(this.f24588b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: j0.a$f */
    final class f extends C5454j<V> {
        f() {
            super(C5445a.this.size());
        }

        /* access modifiers changed from: protected */
        public V c(int i10) {
            return C5445a.this.m(i10);
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            C5445a.this.k(i10);
        }
    }

    public C5445a() {
    }

    static <T> boolean o(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C5445a<K, V>.a aVar = this.f24581d;
        if (aVar != null) {
            return aVar;
        }
        C5445a<K, V>.a aVar2 = new C0389a();
        this.f24581d = aVar2;
        return aVar2;
    }

    public V get(Object obj) {
        return super.get(obj);
    }

    public Set<K> keySet() {
        C5445a<K, V>.defpackage.c cVar = this.f24582e;
        if (cVar != null) {
            return cVar;
        }
        C5445a<K, V>.defpackage.c cVar2 = new c();
        this.f24582e = cVar2;
        return cVar2;
    }

    public boolean n(Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public boolean p(Collection<?> collection) {
        int size = size();
        for (Object remove : collection) {
            remove(remove);
        }
        return size != size();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b(size() + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public boolean q(Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(h(size2))) {
                k(size2);
            }
        }
        return size != size();
    }

    public V remove(Object obj) {
        return super.remove(obj);
    }

    public Collection<V> values() {
        C5445a<K, V>.defpackage.e eVar = this.f24583f;
        if (eVar != null) {
            return eVar;
        }
        C5445a<K, V>.defpackage.e eVar2 = new e();
        this.f24583f = eVar2;
        return eVar2;
    }

    public C5445a(int i10) {
        super(i10);
    }

    /* renamed from: j0.a$c */
    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C5445a.this.clear();
        }

        public boolean contains(Object obj) {
            return C5445a.this.containsKey(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return C5445a.this.n(collection);
        }

        public boolean equals(Object obj) {
            return C5445a.o(this, obj);
        }

        public int hashCode() {
            int i10 = 0;
            for (int size = C5445a.this.size() - 1; size >= 0; size--) {
                Object h10 = C5445a.this.h(size);
                i10 += h10 == null ? 0 : h10.hashCode();
            }
            return i10;
        }

        public boolean isEmpty() {
            return C5445a.this.isEmpty();
        }

        public Iterator<K> iterator() {
            return new b();
        }

        public boolean remove(Object obj) {
            int d10 = C5445a.this.d(obj);
            if (d10 < 0) {
                return false;
            }
            C5445a.this.k(d10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C5445a.this.p(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C5445a.this.q(collection);
        }

        public int size() {
            return C5445a.this.size();
        }

        public Object[] toArray() {
            int size = C5445a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C5445a.this.h(i10);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C5445a.this.h(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* renamed from: j0.a$e */
    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C5445a.this.clear();
        }

        public boolean contains(Object obj) {
            return C5445a.this.a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C5445a.this.isEmpty();
        }

        public Iterator<V> iterator() {
            return new f();
        }

        public boolean remove(Object obj) {
            int a10 = C5445a.this.a(obj);
            if (a10 < 0) {
                return false;
            }
            C5445a.this.k(a10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int size = C5445a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C5445a.this.m(i10))) {
                    C5445a.this.k(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            int size = C5445a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C5445a.this.m(i10))) {
                    C5445a.this.k(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public int size() {
            return C5445a.this.size();
        }

        public Object[] toArray() {
            int size = C5445a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C5445a.this.m(i10);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C5445a.this.m(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public C5445a(b0 b0Var) {
        super(b0Var);
    }
}
