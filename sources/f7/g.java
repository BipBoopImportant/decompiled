package F7;

import F7.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g<K extends l, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f35468a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<K, a<K, V>> f35469b = new HashMap();

    private static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f35470a;

        /* renamed from: b  reason: collision with root package name */
        private List<V> f35471b;

        /* renamed from: c  reason: collision with root package name */
        a<K, V> f35472c;

        /* renamed from: d  reason: collision with root package name */
        a<K, V> f35473d;

        a() {
            this((Object) null);
        }

        public void a(V v10) {
            if (this.f35471b == null) {
                this.f35471b = new ArrayList();
            }
            this.f35471b.add(v10);
        }

        public V b() {
            int c10 = c();
            if (c10 > 0) {
                return this.f35471b.remove(c10 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f35471b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k10) {
            this.f35473d = this;
            this.f35472c = this;
            this.f35470a = k10;
        }
    }

    g() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f35468a;
        aVar.f35473d = aVar2;
        aVar.f35472c = aVar2.f35472c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f35468a;
        aVar.f35473d = aVar2.f35473d;
        aVar.f35472c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f35473d;
        aVar2.f35472c = aVar.f35472c;
        aVar.f35472c.f35473d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f35472c.f35473d = aVar;
        aVar.f35473d.f35472c = aVar;
    }

    public V a(K k10) {
        a aVar = this.f35469b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            this.f35469b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k10, V v10) {
        a aVar = this.f35469b.get(k10);
        if (aVar == null) {
            aVar = new a(k10);
            c(aVar);
            this.f35469b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    public V f() {
        for (a<K, V> aVar = this.f35468a.f35473d; !aVar.equals(this.f35468a); aVar = aVar.f35473d) {
            V b10 = aVar.b();
            if (b10 != null) {
                return b10;
            }
            e(aVar);
            this.f35469b.remove(aVar.f35470a);
            ((l) aVar.f35470a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> aVar = this.f35468a.f35472c;
        boolean z10 = false;
        while (!aVar.equals(this.f35468a)) {
            sb2.append('{');
            sb2.append(aVar.f35470a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f35472c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
