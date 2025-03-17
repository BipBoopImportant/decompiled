package androidx.camera.core.impl;

import H2.i;
import I.n;
import androidx.camera.core.impl.H0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

public abstract class b1<T> implements H0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f16847a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Object> f16848b;

    /* renamed from: c  reason: collision with root package name */
    private int f16849c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16850d = false;

    /* renamed from: e  reason: collision with root package name */
    private final Map<H0.a<? super T>, b<T>> f16851e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final CopyOnWriteArraySet<b<T>> f16852f = new CopyOnWriteArraySet<>();

    static abstract class a {
        a() {
        }

        static a b(Throwable th2) {
            return new C5032l(th2);
        }

        public abstract Throwable a();
    }

    private static final class b<T> implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        private static final Object f16853h = new Object();

        /* renamed from: a  reason: collision with root package name */
        private final Executor f16854a;

        /* renamed from: b  reason: collision with root package name */
        private final H0.a<? super T> f16855b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f16856c = new AtomicBoolean(true);

        /* renamed from: d  reason: collision with root package name */
        private final AtomicReference<Object> f16857d;

        /* renamed from: e  reason: collision with root package name */
        private Object f16858e = f16853h;

        /* renamed from: f  reason: collision with root package name */
        private int f16859f = -1;

        /* renamed from: g  reason: collision with root package name */
        private boolean f16860g = false;

        b(AtomicReference<Object> atomicReference, Executor executor, H0.a<? super T> aVar) {
            this.f16857d = atomicReference;
            this.f16854a = executor;
            this.f16855b = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f16856c.set(false);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(int r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.f16856c     // Catch:{ all -> 0x000b }
                boolean r0 = r0.get()     // Catch:{ all -> 0x000b }
                if (r0 != 0) goto L_0x000d
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                return
            L_0x000b:
                r2 = move-exception
                goto L_0x002e
            L_0x000d:
                int r0 = r1.f16859f     // Catch:{ all -> 0x000b }
                if (r2 > r0) goto L_0x0013
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                return
            L_0x0013:
                r1.f16859f = r2     // Catch:{ all -> 0x000b }
                boolean r2 = r1.f16860g     // Catch:{ all -> 0x000b }
                if (r2 == 0) goto L_0x001b
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                return
            L_0x001b:
                r2 = 1
                r1.f16860g = r2     // Catch:{ all -> 0x000b }
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                java.util.concurrent.Executor r2 = r1.f16854a     // Catch:{ all -> 0x0025 }
                r2.execute(r1)     // Catch:{ all -> 0x0025 }
                goto L_0x002a
            L_0x0025:
                monitor-enter(r1)
                r2 = 0
                r1.f16860g = r2     // Catch:{ all -> 0x002b }
                monitor-exit(r1)     // Catch:{ all -> 0x002b }
            L_0x002a:
                return
            L_0x002b:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x002b }
                throw r2
            L_0x002e:
                monitor-exit(r1)     // Catch:{ all -> 0x000b }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.b1.b.b(int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
            if (java.util.Objects.equals(r4.f16858e, r0) != false) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            r4.f16858e = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if ((r0 instanceof androidx.camera.core.impl.b1.a) == false) goto L_0x0033;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            r4.f16855b.onError(((androidx.camera.core.impl.b1.a) r0).a());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
            r4.f16855b.a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            monitor-enter(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
            if (r2 == r4.f16859f) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
            if (r4.f16856c.get() != false) goto L_0x0046;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
            r0 = r4.f16857d.get();
            r2 = r4.f16859f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0052, code lost:
            r4.f16860g = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0054, code lost:
            monitor-exit(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0057, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                monitor-enter(r4)
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.f16856c     // Catch:{ all -> 0x000e }
                boolean r0 = r0.get()     // Catch:{ all -> 0x000e }
                r1 = 0
                if (r0 != 0) goto L_0x0010
                r4.f16860g = r1     // Catch:{ all -> 0x000e }
                monitor-exit(r4)     // Catch:{ all -> 0x000e }
                return
            L_0x000e:
                r0 = move-exception
                goto L_0x0058
            L_0x0010:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.f16857d     // Catch:{ all -> 0x000e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x000e }
                int r2 = r4.f16859f     // Catch:{ all -> 0x000e }
                monitor-exit(r4)     // Catch:{ all -> 0x000e }
            L_0x0019:
                java.lang.Object r3 = r4.f16858e
                boolean r3 = java.util.Objects.equals(r3, r0)
                if (r3 != 0) goto L_0x0038
                r4.f16858e = r0
                boolean r3 = r0 instanceof androidx.camera.core.impl.b1.a
                if (r3 == 0) goto L_0x0033
                androidx.camera.core.impl.H0$a<? super T> r3 = r4.f16855b
                androidx.camera.core.impl.b1$a r0 = (androidx.camera.core.impl.b1.a) r0
                java.lang.Throwable r0 = r0.a()
                r3.onError(r0)
                goto L_0x0038
            L_0x0033:
                androidx.camera.core.impl.H0$a<? super T> r3 = r4.f16855b
                r3.a(r0)
            L_0x0038:
                monitor-enter(r4)
                int r0 = r4.f16859f     // Catch:{ all -> 0x0050 }
                if (r2 == r0) goto L_0x0052
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.f16856c     // Catch:{ all -> 0x0050 }
                boolean r0 = r0.get()     // Catch:{ all -> 0x0050 }
                if (r0 != 0) goto L_0x0046
                goto L_0x0052
            L_0x0046:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.f16857d     // Catch:{ all -> 0x0050 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0050 }
                int r2 = r4.f16859f     // Catch:{ all -> 0x0050 }
                monitor-exit(r4)     // Catch:{ all -> 0x0050 }
                goto L_0x0019
            L_0x0050:
                r0 = move-exception
                goto L_0x0056
            L_0x0052:
                r4.f16860g = r1     // Catch:{ all -> 0x0050 }
                monitor-exit(r4)     // Catch:{ all -> 0x0050 }
                return
            L_0x0056:
                monitor-exit(r4)     // Catch:{ all -> 0x0050 }
                throw r0
            L_0x0058:
                monitor-exit(r4)     // Catch:{ all -> 0x000e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.b1.b.run():void");
        }
    }

    b1(Object obj, boolean z10) {
        if (z10) {
            i.b(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f16848b = new AtomicReference<>(a.b((Throwable) obj));
            return;
        }
        this.f16848b = new AtomicReference<>(obj);
    }

    private void b(H0.a<? super T> aVar) {
        b remove = this.f16851e.remove(aVar);
        if (remove != null) {
            remove.a();
            this.f16852f.remove(remove);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r1.hasNext() == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r1.next().b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r1 = r3.f16847a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r3.f16849c != r4) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r3.f16850d = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r4 = r3.f16852f.iterator();
        r0 = r3.f16849c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        r1 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f16847a
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r3.f16848b     // Catch:{ all -> 0x0011 }
            java.lang.Object r1 = r1.getAndSet(r4)     // Catch:{ all -> 0x0011 }
            boolean r4 = java.util.Objects.equals(r1, r4)     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r4 = move-exception
            goto L_0x0054
        L_0x0013:
            int r4 = r3.f16849c     // Catch:{ all -> 0x0011 }
            r1 = 1
            int r4 = r4 + r1
            r3.f16849c = r4     // Catch:{ all -> 0x0011 }
            boolean r2 = r3.f16850d     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x001f:
            r3.f16850d = r1     // Catch:{ all -> 0x0011 }
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.b1$b<T>> r1 = r3.f16852f     // Catch:{ all -> 0x0011 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
        L_0x0028:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            androidx.camera.core.impl.b1$b r0 = (androidx.camera.core.impl.b1.b) r0
            r0.b(r4)
            goto L_0x0028
        L_0x0038:
            java.lang.Object r1 = r3.f16847a
            monitor-enter(r1)
            int r0 = r3.f16849c     // Catch:{ all -> 0x0044 }
            if (r0 != r4) goto L_0x0046
            r4 = 0
            r3.f16850d = r4     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r4 = move-exception
            goto L_0x0052
        L_0x0046:
            java.util.concurrent.CopyOnWriteArraySet<androidx.camera.core.impl.b1$b<T>> r4 = r3.f16852f     // Catch:{ all -> 0x0044 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0044 }
            int r0 = r3.f16849c     // Catch:{ all -> 0x0044 }
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            r1 = r4
            r4 = r0
            goto L_0x0028
        L_0x0052:
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r4
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.b1.f(java.lang.Object):void");
    }

    public C10101e<T> a() {
        Object obj = this.f16848b.get();
        return obj instanceof a ? n.n(((a) obj).a()) : n.p(obj);
    }

    public void c(Executor executor, H0.a<? super T> aVar) {
        b bVar;
        synchronized (this.f16847a) {
            b(aVar);
            bVar = new b(this.f16848b, executor, aVar);
            this.f16851e.put(aVar, bVar);
            this.f16852f.add(bVar);
        }
        bVar.b(0);
    }

    public void d(H0.a<? super T> aVar) {
        synchronized (this.f16847a) {
            b(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(T t10) {
        f(t10);
    }
}
