package kb;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb.l;
import jb.r;

/* renamed from: kb.J  reason: case insensitive filesystem */
public final class C9930J {

    /* renamed from: kb.J$a */
    private static class a<K, V> extends C9948c<K, V> {

        /* renamed from: g  reason: collision with root package name */
        transient r<? extends List<V>> f74880g;

        a(Map<K, Collection<V>> map, r<? extends List<V>> rVar) {
            super(map);
            this.f74880g = (r) l.j(rVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public List<V> s() {
            return (List) this.f74880g.get();
        }

        /* access modifiers changed from: package-private */
        public Map<K, Collection<V>> e() {
            return u();
        }

        /* access modifiers changed from: package-private */
        public Set<K> g() {
            return v();
        }
    }

    /* renamed from: kb.J$b */
    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract C9928H<K, V> b();

        public void clear() {
            b().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().c(entry.getKey(), entry.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        public int size() {
            return b().size();
        }
    }

    static boolean a(C9928H<?, ?> h10, Object obj) {
        if (obj == h10) {
            return true;
        }
        if (obj instanceof C9928H) {
            return h10.b().equals(((C9928H) obj).b());
        }
        return false;
    }

    public static <K, V> C9924D<K, V> b(Map<K, Collection<V>> map, r<? extends List<V>> rVar) {
        return new a(map, rVar);
    }
}
