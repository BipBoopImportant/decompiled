package T;

import C.H0;
import H2.i;
import J.f;
import androidx.camera.core.impl.V0;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.M;
import androidx.lifecycle.r;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13468a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<a, b> f13469b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<b, Set<a>> f13470c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<C5221y> f13471d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    D.a f13472e;

    static abstract class a {
        a() {
        }

        static a a(C5221y yVar, f.b bVar) {
            return new a(yVar, bVar);
        }

        public abstract f.b b();

        public abstract C5221y c();
    }

    private static class b implements C5220x {

        /* renamed from: a  reason: collision with root package name */
        private final c f13473a;

        /* renamed from: b  reason: collision with root package name */
        private final C5221y f13474b;

        b(C5221y yVar, c cVar) {
            this.f13474b = yVar;
            this.f13473a = cVar;
        }

        /* access modifiers changed from: package-private */
        public C5221y a() {
            return this.f13474b;
        }

        @M(r.a.ON_DESTROY)
        public void onDestroy(C5221y yVar) {
            this.f13473a.m(yVar);
        }

        @M(r.a.ON_START)
        public void onStart(C5221y yVar) {
            this.f13473a.h(yVar);
        }

        @M(r.a.ON_STOP)
        public void onStop(C5221y yVar) {
            this.f13473a.i(yVar);
        }
    }

    c() {
    }

    private b d(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                for (b next : this.f13470c.keySet()) {
                    if (yVar.equals(next.a())) {
                        return next;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean f(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                b d10 = d(yVar);
                if (d10 == null) {
                    return false;
                }
                for (a aVar : this.f13470c.get(d10)) {
                    if (!((b) i.g(this.f13469b.get(aVar))).v().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(b bVar) {
        synchronized (this.f13468a) {
            try {
                C5221y t10 = bVar.t();
                a a10 = a.a(t10, f.B((V0) bVar.b(), (V0) bVar.u()));
                b d10 = d(t10);
                Set hashSet = d10 != null ? this.f13470c.get(d10) : new HashSet();
                hashSet.add(a10);
                this.f13469b.put(a10, bVar);
                if (d10 == null) {
                    b bVar2 = new b(t10, this);
                    this.f13470c.put(bVar2, hashSet);
                    t10.getLifecycle().c(bVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void j(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                b d10 = d(yVar);
                if (d10 != null) {
                    for (a aVar : this.f13470c.get(d10)) {
                        ((b) i.g(this.f13469b.get(aVar))).x();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                for (a aVar : this.f13470c.get(d(yVar))) {
                    b bVar = this.f13469b.get(aVar);
                    if (!((b) i.g(bVar)).v().isEmpty()) {
                        bVar.A();
                    }
                }
            } finally {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(T.b r5, C.J0 r6, java.util.List<C.C4404l> r7, java.util.Collection<C.H0> r8, D.a r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13468a
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x001a }
            r1 = r1 ^ 1
            H2.i.a(r1)     // Catch:{ all -> 0x001a }
            r4.f13472e = r9     // Catch:{ all -> 0x001a }
            androidx.lifecycle.y r9 = r5.t()     // Catch:{ all -> 0x001a }
            T.c$b r1 = r4.d(r9)     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r5 = move-exception
            goto L_0x0094
        L_0x001d:
            java.util.Map<T.c$b, java.util.Set<T.c$a>> r2 = r4.f13470c     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x001a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x001a }
            D.a r2 = r4.f13472e     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0030
            int r2 = r2.c()     // Catch:{ all -> 0x001a }
            r3 = 2
            if (r2 == r3) goto L_0x0067
        L_0x0030:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001a }
        L_0x0034:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x001a }
            T.c$a r2 = (T.c.a) r2     // Catch:{ all -> 0x001a }
            java.util.Map<T.c$a, T.b> r3 = r4.f13469b     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x001a }
            T.b r2 = (T.b) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = H2.i.g(r2)     // Catch:{ all -> 0x001a }
            T.b r2 = (T.b) r2     // Catch:{ all -> 0x001a }
            boolean r3 = r2.equals(r5)     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x0034
            java.util.List r2 = r2.v()     // Catch:{ all -> 0x001a }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x005f
            goto L_0x0034
        L_0x005f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r5.<init>(r6)     // Catch:{ all -> 0x001a }
            throw r5     // Catch:{ all -> 0x001a }
        L_0x0067:
            J.f r1 = r5.s()     // Catch:{ a -> 0x008d }
            r1.d0(r6)     // Catch:{ a -> 0x008d }
            J.f r6 = r5.s()     // Catch:{ a -> 0x008d }
            r6.b0(r7)     // Catch:{ a -> 0x008d }
            r5.k(r8)     // Catch:{ a -> 0x008d }
            androidx.lifecycle.r r5 = r9.getLifecycle()     // Catch:{ all -> 0x001a }
            androidx.lifecycle.r$b r5 = r5.d()     // Catch:{ all -> 0x001a }
            androidx.lifecycle.r$b r6 = androidx.lifecycle.r.b.STARTED     // Catch:{ all -> 0x001a }
            boolean r5 = r5.b(r6)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x008b
            r4.h(r9)     // Catch:{ all -> 0x001a }
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x008d:
            r5 = move-exception
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            r6.<init>(r5)     // Catch:{ all -> 0x001a }
            throw r6     // Catch:{ all -> 0x001a }
        L_0x0094:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T.c.a(T.b, C.J0, java.util.List, java.util.Collection, D.a):void");
    }

    /* access modifiers changed from: package-private */
    public b b(C5221y yVar, f fVar) {
        synchronized (this.f13468a) {
            try {
                i.b(this.f13469b.get(a.a(yVar, fVar.D())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                b bVar = new b(yVar, fVar);
                if (fVar.J().isEmpty()) {
                    bVar.x();
                }
                if (yVar.getLifecycle().d() == r.b.DESTROYED) {
                    return bVar;
                }
                g(bVar);
                return bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public b c(C5221y yVar, f.b bVar) {
        b bVar2;
        synchronized (this.f13468a) {
            bVar2 = this.f13469b.get(a.a(yVar, bVar));
        }
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<b> e() {
        Collection<b> unmodifiableCollection;
        synchronized (this.f13468a) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.f13469b.values());
        }
        return unmodifiableCollection;
    }

    /* access modifiers changed from: package-private */
    public void h(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                if (f(yVar)) {
                    if (this.f13471d.isEmpty()) {
                        this.f13471d.push(yVar);
                    } else {
                        D.a aVar = this.f13472e;
                        if (aVar == null || aVar.c() != 2) {
                            C5221y peek = this.f13471d.peek();
                            if (!yVar.equals(peek)) {
                                j(peek);
                                this.f13471d.remove(yVar);
                                this.f13471d.push(yVar);
                            }
                        }
                    }
                    n(yVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                this.f13471d.remove(yVar);
                j(yVar);
                if (!this.f13471d.isEmpty()) {
                    n(this.f13471d.peek());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Collection<H0> collection) {
        synchronized (this.f13468a) {
            try {
                for (a aVar : this.f13469b.keySet()) {
                    b bVar = this.f13469b.get(aVar);
                    boolean isEmpty = bVar.v().isEmpty();
                    bVar.y(collection);
                    if (!isEmpty && bVar.v().isEmpty()) {
                        i(bVar.t());
                    }
                }
            } finally {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        synchronized (this.f13468a) {
            try {
                for (a aVar : this.f13469b.keySet()) {
                    b bVar = this.f13469b.get(aVar);
                    bVar.z();
                    i(bVar.t());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(C5221y yVar) {
        synchronized (this.f13468a) {
            try {
                b d10 = d(yVar);
                if (d10 != null) {
                    i(yVar);
                    for (a remove : this.f13470c.get(d10)) {
                        this.f13469b.remove(remove);
                    }
                    this.f13470c.remove(d10);
                    d10.a().getLifecycle().g(d10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
