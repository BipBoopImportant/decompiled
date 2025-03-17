package p;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: p.b  reason: case insensitive filesystem */
public class C5677b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f26774a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f26775b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f26776c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f26777d = 0;

    /* renamed from: p.b$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f26781d;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f26780c;
        }
    }

    /* renamed from: p.b$b  reason: collision with other inner class name */
    private static class C0430b<K, V> extends e<K, V> {
        C0430b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f26780c;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f26781d;
        }
    }

    /* renamed from: p.b$c */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f26778a;

        /* renamed from: b  reason: collision with root package name */
        final V f26779b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f26780c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f26781d;

        c(K k10, V v10) {
            this.f26778a = k10;
            this.f26779b = v10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f26778a.equals(cVar.f26778a) && this.f26779b.equals(cVar.f26779b);
        }

        public K getKey() {
            return this.f26778a;
        }

        public V getValue() {
            return this.f26779b;
        }

        public int hashCode() {
            return this.f26778a.hashCode() ^ this.f26779b.hashCode();
        }

        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f26778a + "=" + this.f26779b;
        }
    }

    /* renamed from: p.b$d */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f26782a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f26783b = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f26782a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f26781d;
                this.f26782a = cVar3;
                this.f26783b = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (this.f26783b) {
                this.f26783b = false;
                this.f26782a = C5677b.this.f26774a;
            } else {
                c<K, V> cVar = this.f26782a;
                this.f26782a = cVar != null ? cVar.f26780c : null;
            }
            return this.f26782a;
        }

        public boolean hasNext() {
            if (this.f26783b) {
                return C5677b.this.f26774a != null;
            }
            c<K, V> cVar = this.f26782a;
            return (cVar == null || cVar.f26780c == null) ? false : true;
        }
    }

    /* renamed from: p.b$e */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f26785a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f26786b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f26785a = cVar2;
            this.f26786b = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f26786b;
            c<K, V> cVar2 = this.f26785a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.f26785a == cVar && cVar == this.f26786b) {
                this.f26786b = null;
                this.f26785a = null;
            }
            c<K, V> cVar2 = this.f26785a;
            if (cVar2 == cVar) {
                this.f26785a = c(cVar2);
            }
            if (this.f26786b == cVar) {
                this.f26786b = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f26786b;
            this.f26786b = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f26786b != null;
        }
    }

    /* renamed from: p.b$f */
    public static abstract class f<K, V> {
        /* access modifiers changed from: package-private */
        public abstract void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> b() {
        return this.f26774a;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0430b bVar = new C0430b(this.f26775b, this.f26774a);
        this.f26776c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5677b)) {
            return false;
        }
        C5677b bVar = (C5677b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public c<K, V> i(K k10) {
        c<K, V> cVar = this.f26774a;
        while (cVar != null && !cVar.f26778a.equals(k10)) {
            cVar = cVar.f26780c;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f26774a, this.f26775b);
        this.f26776c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public C5677b<K, V>.defpackage.d j() {
        C5677b<K, V>.defpackage.d dVar = new d();
        this.f26776c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> k() {
        return this.f26775b;
    }

    /* access modifiers changed from: package-private */
    public c<K, V> m(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f26777d++;
        c<K, V> cVar2 = this.f26775b;
        if (cVar2 == null) {
            this.f26774a = cVar;
            this.f26775b = cVar;
            return cVar;
        }
        cVar2.f26780c = cVar;
        cVar.f26781d = cVar2;
        this.f26775b = cVar;
        return cVar;
    }

    public V p(K k10, V v10) {
        c i10 = i(k10);
        if (i10 != null) {
            return i10.f26779b;
        }
        m(k10, v10);
        return null;
    }

    public V q(K k10) {
        c i10 = i(k10);
        if (i10 == null) {
            return null;
        }
        this.f26777d--;
        if (!this.f26776c.isEmpty()) {
            for (f<K, V> a10 : this.f26776c.keySet()) {
                a10.a(i10);
            }
        }
        c<K, V> cVar = i10.f26781d;
        if (cVar != null) {
            cVar.f26780c = i10.f26780c;
        } else {
            this.f26774a = i10.f26780c;
        }
        c<K, V> cVar2 = i10.f26780c;
        if (cVar2 != null) {
            cVar2.f26781d = cVar;
        } else {
            this.f26775b = cVar;
        }
        i10.f26780c = null;
        i10.f26781d = null;
        return i10.f26779b;
    }

    public int size() {
        return this.f26777d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
