package Kb;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import jc.C9894a;
import jc.C9895b;
import jc.C9896c;
import jc.C9897d;

class u implements C9897d, C9896c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<C9895b<Object>, Executor>> f61474a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Queue<C9894a<?>> f61475b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f61476c;

    u(Executor executor) {
        this.f61476c = executor;
    }

    private synchronized Set<Map.Entry<C9895b<Object>, Executor>> e(C9894a<?> aVar) {
        Map map;
        try {
            map = this.f61474a.get(aVar.b());
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public synchronized <T> void a(Class<T> cls, Executor executor, C9895b<? super T> bVar) {
        try {
            D.b(cls);
            D.b(bVar);
            D.b(executor);
            if (!this.f61474a.containsKey(cls)) {
                this.f61474a.put(cls, new ConcurrentHashMap());
            }
            this.f61474a.get(cls).put(bVar, executor);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public <T> void b(Class<T> cls, C9895b<? super T> bVar) {
        a(cls, this.f61476c, bVar);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        Queue<C9894a<?>> queue;
        synchronized (this) {
            try {
                queue = this.f61475b;
                if (queue != null) {
                    this.f61475b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (queue != null) {
            for (C9894a<?> g10 : queue) {
                g(g10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = e(r5).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(new Kb.t(r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(jc.C9894a<?> r5) {
        /*
            r4 = this;
            Kb.D.b(r5)
            monitor-enter(r4)
            java.util.Queue<jc.a<?>> r0 = r4.f61475b     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000f
            r0.add(r5)     // Catch:{ all -> 0x000d }
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            return
        L_0x000d:
            r5 = move-exception
            goto L_0x0034
        L_0x000f:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            java.util.Set r0 = r4.e(r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            Kb.t r3 = new Kb.t
            r3.<init>(r1, r5)
            r2.execute(r3)
            goto L_0x0018
        L_0x0033:
            return
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x000d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Kb.u.g(jc.a):void");
    }
}
