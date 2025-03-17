package Kb;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import d0.i;
import ec.C9632a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import jc.C9896c;
import jc.C9897d;
import mc.C10035a;
import mc.C10036b;

public class n implements C9129d, C9632a {

    /* renamed from: i  reason: collision with root package name */
    private static final C10036b<Set<Object>> f61449i = new j();

    /* renamed from: a  reason: collision with root package name */
    private final Map<C9128c<?>, C10036b<?>> f61450a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<E<?>, C10036b<?>> f61451b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<E<?>, x<?>> f61452c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C10036b<ComponentRegistrar>> f61453d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f61454e;

    /* renamed from: f  reason: collision with root package name */
    private final u f61455f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<Boolean> f61456g;

    /* renamed from: h  reason: collision with root package name */
    private final i f61457h;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f61458a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C10036b<ComponentRegistrar>> f61459b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<C9128c<?>> f61460c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private i f61461d = i.f61442a;

        b(Executor executor) {
            this.f61458a = executor;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C9128c<?> cVar) {
            this.f61460c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f61459b.add(new o(componentRegistrar));
            return this;
        }

        public b d(Collection<C10036b<ComponentRegistrar>> collection) {
            this.f61459b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f61458a, this.f61459b, this.f61460c, this.f61461d);
        }

        public b g(i iVar) {
            this.f61461d = iVar;
            return this;
        }
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<C9128c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C10036b<ComponentRegistrar>> it = this.f61453d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f61457h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<C9128c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f61454e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f61454e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f61450a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f61450a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (C9128c next : list) {
                this.f61450a.put(next, new w(new k(this, next)));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        u();
    }

    private void o(Map<C9128c<?>, C10036b<?>> map, boolean z10) {
        for (Map.Entry next : map.entrySet()) {
            C9128c cVar = (C9128c) next.getKey();
            C10036b bVar = (C10036b) next.getValue();
            if (cVar.n() || (cVar.o() && z10)) {
                bVar.get();
            }
        }
        this.f61455f.d();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(C9128c cVar) {
        return cVar.h().a(new F(cVar, this));
    }

    private void u() {
        Boolean bool = this.f61456g.get();
        if (bool != null) {
            o(this.f61450a, bool.booleanValue());
        }
    }

    private void v() {
        for (C9128c next : this.f61450a.keySet()) {
            Iterator<q> it = next.g().iterator();
            while (true) {
                if (it.hasNext()) {
                    q next2 = it.next();
                    if (next2.g() && !this.f61452c.containsKey(next2.c())) {
                        this.f61452c.put(next2.c(), x.b(Collections.emptySet()));
                    } else if (this.f61451b.containsKey(next2.c())) {
                        continue;
                    } else if (next2.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.c()}));
                    } else if (!next2.g()) {
                        this.f61451b.put(next2.c(), C.e());
                    }
                }
            }
        }
    }

    private List<Runnable> w(List<C9128c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C9128c next : list) {
            if (next.p()) {
                C10036b bVar = this.f61450a.get(next);
                for (E e10 : next.j()) {
                    if (!this.f61451b.containsKey(e10)) {
                        this.f61451b.put(e10, bVar);
                    } else {
                        arrayList.add(new l((C) this.f61451b.get(e10), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f61450a.entrySet()) {
            C9128c cVar = (C9128c) next.getKey();
            if (!cVar.p()) {
                C10036b bVar = (C10036b) next.getValue();
                for (E e10 : cVar.j()) {
                    if (!hashMap.containsKey(e10)) {
                        hashMap.put(e10, new HashSet());
                    }
                    ((Set) hashMap.get(e10)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f61452c.containsKey(entry.getKey())) {
                this.f61452c.put((E) entry.getKey(), x.b((Collection) entry.getValue()));
            } else {
                x xVar = this.f61452c.get(entry.getKey());
                for (C10036b mVar : (Set) entry.getValue()) {
                    arrayList.add(new m(xVar, mVar));
                }
            }
        }
        return arrayList;
    }

    public synchronized <T> C10036b<Set<T>> c(E<T> e10) {
        x xVar = this.f61452c.get(e10);
        if (xVar != null) {
            return xVar;
        }
        return f61449i;
    }

    public synchronized <T> C10036b<T> g(E<T> e10) {
        D.c(e10, "Null interface requested.");
        return this.f61451b.get(e10);
    }

    public <T> C10035a<T> h(E<T> e10) {
        C10036b<T> g10 = g(e10);
        return g10 == null ? C.e() : g10 instanceof C ? (C) g10 : C.i(g10);
    }

    public void p(boolean z10) {
        HashMap hashMap;
        if (i.a(this.f61456g, (Object) null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f61450a);
            }
            o(hashMap, z10);
        }
    }

    private n(Executor executor, Iterable<C10036b<ComponentRegistrar>> iterable, Collection<C9128c<?>> collection, i iVar) {
        this.f61450a = new HashMap();
        this.f61451b = new HashMap();
        this.f61452c = new HashMap();
        this.f61454e = new HashSet();
        this.f61456g = new AtomicReference<>();
        u uVar = new u(executor);
        this.f61455f = uVar;
        this.f61457h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C9128c.s(uVar, u.class, C9897d.class, C9896c.class));
        arrayList.add(C9128c.s(this, C9632a.class, new Class[0]));
        for (C9128c next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f61453d = q(iterable);
        n(arrayList);
    }
}
