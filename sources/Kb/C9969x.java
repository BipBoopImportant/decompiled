package kb;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kb.C9965t;

/* renamed from: kb.x  reason: case insensitive filesystem */
public abstract class C9969x<K, V> extends C9952g<K, V> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    final transient C9968w<K, ? extends C9965t<V>> f75025e;

    /* renamed from: f  reason: collision with root package name */
    final transient int f75026f;

    /* renamed from: kb.x$a */
    class a extends e0<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends C9965t<V>>> f75027a;

        /* renamed from: b  reason: collision with root package name */
        K f75028b = null;

        /* renamed from: c  reason: collision with root package name */
        Iterator<V> f75029c = C9923C.f();

        a() {
            this.f75027a = C9969x.this.f75025e.entrySet().iterator();
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f75029c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f75027a.next();
                this.f75028b = entry.getKey();
                this.f75029c = ((C9965t) entry.getValue()).iterator();
            }
            K k10 = this.f75028b;
            Objects.requireNonNull(k10);
            return C9927G.d(k10, this.f75029c.next());
        }

        public boolean hasNext() {
            return this.f75029c.hasNext() || this.f75027a.hasNext();
        }
    }

    /* renamed from: kb.x$b */
    class b extends e0<V> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<? extends C9965t<V>> f75031a;

        /* renamed from: b  reason: collision with root package name */
        Iterator<V> f75032b = C9923C.f();

        b() {
            this.f75031a = C9969x.this.f75025e.values().iterator();
        }

        public boolean hasNext() {
            return this.f75032b.hasNext() || this.f75031a.hasNext();
        }

        public V next() {
            if (!this.f75032b.hasNext()) {
                this.f75032b = ((C9965t) this.f75031a.next()).iterator();
            }
            return this.f75032b.next();
        }
    }

    /* renamed from: kb.x$c */
    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Map<K, C9965t.b<V>> f75034a;

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f75035b;

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f75036c;

        /* renamed from: d  reason: collision with root package name */
        int f75037d = 4;
    }

    /* renamed from: kb.x$d */
    private static class d<K, V> extends C9965t<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        final C9969x<K, V> f75038b;

        d(C9969x<K, V> xVar) {
            this.f75038b = xVar;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f75038b.c(entry.getKey(), entry.getValue());
        }

        /* renamed from: q */
        public e0<Map.Entry<K, V>> iterator() {
            return this.f75038b.i();
        }

        public int size() {
            return this.f75038b.size();
        }
    }

    /* renamed from: kb.x$e */
    private static final class e<K, V> extends C9965t<V> {

        /* renamed from: b  reason: collision with root package name */
        private final transient C9969x<K, V> f75039b;

        e(C9969x<K, V> xVar) {
            this.f75039b = xVar;
        }

        public boolean contains(Object obj) {
            return this.f75039b.d(obj);
        }

        /* access modifiers changed from: package-private */
        public int i(Object[] objArr, int i10) {
            e0<? extends C9965t<V>> q10 = this.f75039b.f75025e.values().iterator();
            while (q10.hasNext()) {
                i10 = ((C9965t) q10.next()).i(objArr, i10);
            }
            return i10;
        }

        /* renamed from: q */
        public e0<V> iterator() {
            return this.f75039b.k();
        }

        public int size() {
            return this.f75039b.size();
        }
    }

    C9969x(C9968w<K, ? extends C9965t<V>> wVar, int i10) {
        this.f75025e = wVar;
        this.f75026f = i10;
    }

    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public Set<K> g() {
        throw new AssertionError("unreachable");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: l */
    public C9968w<K, Collection<V>> b() {
        return this.f75025e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C9965t<Map.Entry<K, V>> f() {
        return new d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C9965t<V> h() {
        return new e(this);
    }

    /* renamed from: o */
    public C9965t<Map.Entry<K, V>> a() {
        return (C9965t) super.a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public e0<Map.Entry<K, V>> i() {
        return new a();
    }

    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public abstract C9965t<V> get(K k10);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public e0<V> k() {
        return new b();
    }

    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public C9965t<V> values() {
        return (C9965t) super.values();
    }

    public int size() {
        return this.f75026f;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
