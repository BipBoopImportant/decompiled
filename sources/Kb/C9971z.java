package kb;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import jb.h;
import kb.C9965t;
import kb.C9968w;
import kb.C9969x;
import kb.C9970y;

/* renamed from: kb.z  reason: case insensitive filesystem */
public class C9971z<K, V> extends C9969x<K, V> implements C9943X<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private final transient C9970y<V> f75043g;

    /* renamed from: h  reason: collision with root package name */
    private transient C9970y<Map.Entry<K, V>> f75044h;

    /* renamed from: kb.z$a */
    public static final class a<K, V> extends C9969x.c<K, V> {
        public C9971z<K, V> a() {
            Map map = this.f75034a;
            if (map == null) {
                return C9971z.x();
            }
            Collection entrySet = map.entrySet();
            Comparator comparator = this.f75035b;
            if (comparator != null) {
                entrySet = C9935O.b(comparator).e().c(entrySet);
            }
            return C9971z.v(entrySet, this.f75036c);
        }
    }

    /* renamed from: kb.z$b */
    private static final class b<K, V> extends C9970y<Map.Entry<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        private final transient C9971z<K, V> f75045c;

        b(C9971z<K, V> zVar) {
            this.f75045c = zVar;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f75045c.c(entry.getKey(), entry.getValue());
        }

        /* access modifiers changed from: package-private */
        public boolean p() {
            return false;
        }

        /* renamed from: q */
        public e0<Map.Entry<K, V>> iterator() {
            return this.f75045c.i();
        }

        public int size() {
            return this.f75045c.size();
        }
    }

    C9971z(C9968w<K, C9970y<V>> wVar, int i10, Comparator<? super V> comparator) {
        super(wVar, i10);
        this.f75043g = t(comparator);
    }

    private static <V> C9970y<V> t(Comparator<? super V> comparator) {
        return comparator == null ? C9970y.E() : C9921A.S(comparator);
    }

    static <K, V> C9971z<K, V> v(Collection<? extends Map.Entry<K, C9965t.b<V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return x();
        }
        C9968w.a aVar = new C9968w.a(collection.size());
        int i10 = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            C9970y<V> y10 = y(comparator, ((C9970y.a) entry.getValue()).l());
            if (!y10.isEmpty()) {
                aVar.f(key, y10);
                i10 += y10.size();
            }
        }
        return new C9971z<>(aVar.c(), i10, comparator);
    }

    public static <K, V> C9971z<K, V> x() {
        return C9961p.f75000i;
    }

    private static <V> C9970y<V> y(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? C9970y.A(collection) : C9921A.O(comparator, collection);
    }

    /* renamed from: u */
    public C9970y<Map.Entry<K, V>> o() {
        C9970y<Map.Entry<K, V>> yVar = this.f75044h;
        if (yVar != null) {
            return yVar;
        }
        b bVar = new b(this);
        this.f75044h = bVar;
        return bVar;
    }

    /* renamed from: w */
    public C9970y<V> q(K k10) {
        return (C9970y) h.a((C9970y) this.f75025e.get(k10), this.f75043g);
    }
}
