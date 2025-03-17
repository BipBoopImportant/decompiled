package Kb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class p {

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final C9128c<?> f61463a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<b> f61464b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        private final Set<b> f61465c = new HashSet();

        b(C9128c<?> cVar) {
            this.f61463a = cVar;
        }

        /* access modifiers changed from: package-private */
        public void a(b bVar) {
            this.f61464b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public void b(b bVar) {
            this.f61465c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        public C9128c<?> c() {
            return this.f61463a;
        }

        /* access modifiers changed from: package-private */
        public Set<b> d() {
            return this.f61464b;
        }

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f61464b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f61465c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public void g(b bVar) {
            this.f61465c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final E<?> f61466a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f61467b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f61466a.equals(this.f61466a) && cVar.f61467b == this.f61467b;
        }

        public int hashCode() {
            return ((this.f61466a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f61467b).hashCode();
        }

        private c(E<?> e10, boolean z10) {
            this.f61466a = e10;
            this.f61467b = z10;
        }
    }

    static void a(List<C9128c<?>> list) {
        Set<b> c10 = c(list);
        Set<b> b10 = b(c10);
        int i10 = 0;
        while (!b10.isEmpty()) {
            b next = b10.iterator().next();
            b10.remove(next);
            i10++;
            for (b next2 : next.d()) {
                next2.g(next);
                if (next2.f()) {
                    b10.add(next2);
                }
            }
        }
        if (i10 != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (b next3 : c10) {
                if (!next3.f() && !next3.e()) {
                    arrayList.add(next3.c());
                }
            }
            throw new r(arrayList);
        }
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b next : set) {
            if (next.f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<C9128c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C9128c next : list) {
            b bVar = new b(next);
            Iterator it = next.j().iterator();
            while (true) {
                if (it.hasNext()) {
                    E e10 = (E) it.next();
                    c cVar = new c(e10, !next.p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f61467b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{e10}));
                    }
                }
            }
        }
        for (Set<b> it2 : hashMap.values()) {
            for (b bVar2 : it2) {
                for (q next2 : bVar2.c().g()) {
                    if (next2.e() && (set = (Set) hashMap.get(new c(next2.c(), next2.g()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
