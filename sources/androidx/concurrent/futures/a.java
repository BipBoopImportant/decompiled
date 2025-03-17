package androidx.concurrent.futures;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import ob.C10101e;

public abstract class a<V> implements C10101e<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f19966d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f19967e;

    /* renamed from: f  reason: collision with root package name */
    static final b f19968f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f19969g = new Object();

    /* renamed from: a  reason: collision with root package name */
    volatile Object f19970a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f19971b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f19972c;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f19973c;

        /* renamed from: d  reason: collision with root package name */
        static final c f19974d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f19975a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f19976b;

        static {
            if (a.f19966d) {
                f19974d = null;
                f19973c = null;
                return;
            }
            f19974d = new c(false, (Throwable) null);
            f19973c = new c(true, (Throwable) null);
        }

        c(boolean z10, Throwable th2) {
            this.f19975a = z10;
            this.f19976b = th2;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f19977b = new d(new C0319a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f19978a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        class C0319a extends Throwable {
            C0319a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th2) {
            this.f19978a = (Throwable) a.n(th2);
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f19979d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f19980a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f19981b;

        /* renamed from: c  reason: collision with root package name */
        e f19982c;

        e(Runnable runnable, Executor executor) {
            this.f19980a = runnable;
            this.f19981b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f19983a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f19984b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f19985c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f19986d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f19987e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f19983a = atomicReferenceFieldUpdater;
            this.f19984b = atomicReferenceFieldUpdater2;
            this.f19985c = atomicReferenceFieldUpdater3;
            this.f19986d = atomicReferenceFieldUpdater4;
            this.f19987e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return b.a(this.f19986d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return b.a(this.f19987e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return b.a(this.f19985c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f19984b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f19983a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f19988a;

        /* renamed from: b  reason: collision with root package name */
        final C10101e<? extends V> f19989b;

        public void run() {
            if (this.f19988a.f19970a == this) {
                if (a.f19968f.b(this.f19988a, this, a.E(this.f19989b))) {
                    a.B(this.f19988a);
                }
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f19971b != eVar) {
                        return false;
                    }
                    aVar.f19971b = eVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f19970a != obj) {
                        return false;
                    }
                    aVar.f19970a = obj2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f19972c != iVar) {
                        return false;
                    }
                    aVar.f19972c = iVar2;
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f19992b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f19991a = thread;
        }
    }

    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f19990c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f19991a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f19992b;

        i(boolean z10) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f19968f.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f19991a;
            if (thread != null) {
                this.f19991a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f19968f.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.concurrent.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<androidx.concurrent.futures.a$i> r2 = androidx.concurrent.futures.a.i.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f19966d = r3
            java.lang.Class<androidx.concurrent.futures.a> r3 = androidx.concurrent.futures.a.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            f19967e = r4
            androidx.concurrent.futures.a$f r4 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.a.e.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            androidx.concurrent.futures.a$h r4 = new androidx.concurrent.futures.a$h
            r4.<init>()
        L_0x004a:
            f19968f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = f19967e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f19969g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    static void B(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.I();
            aVar2.j();
            e v10 = aVar2.v(eVar);
            while (true) {
                if (v10 != null) {
                    eVar = v10.f19982c;
                    Runnable runnable = v10.f19980a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f19988a;
                        if (aVar3.f19970a == gVar) {
                            if (f19968f.b(aVar3, gVar, E(gVar.f19989b))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        C(runnable, v10.f19981b);
                    }
                    v10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void C(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f19967e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private V D(Object obj) {
        if (obj instanceof c) {
            throw m("Task was cancelled.", ((c) obj).f19976b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f19978a);
        } else if (obj == f19969g) {
            return null;
        } else {
            return obj;
        }
    }

    static Object E(C10101e<?> eVar) {
        if (eVar instanceof a) {
            Object obj = ((a) eVar).f19970a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f19975a ? cVar.f19976b != null ? new c(false, cVar.f19976b) : c.f19974d : obj;
        }
        boolean isCancelled = eVar.isCancelled();
        if ((!f19966d) && isCancelled) {
            return c.f19974d;
        }
        try {
            Object F10 = F(eVar);
            return F10 == null ? f19969g : F10;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e11));
        } catch (Throwable th2) {
            return new d(th2);
        }
    }

    static <V> V F(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void I() {
        i iVar;
        do {
            iVar = this.f19972c;
        } while (!f19968f.c(this, iVar, i.f19990c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f19992b;
        }
    }

    private void J(i iVar) {
        iVar.f19991a = null;
        while (true) {
            i iVar2 = this.f19972c;
            if (iVar2 != i.f19990c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f19992b;
                    if (iVar2.f19991a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f19992b = iVar4;
                        if (iVar3.f19991a == null) {
                        }
                    } else if (!f19968f.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    private String M(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void b(StringBuilder sb2) {
        try {
            Object F10 = F(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(M(F10));
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    private static CancellationException m(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    static <T> T n(T t10) {
        t10.getClass();
        return t10;
    }

    private e v(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f19971b;
        } while (!f19968f.a(this, eVar2, e.f19979d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f19982c;
            eVar5.f19982c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* access modifiers changed from: protected */
    public void G() {
    }

    /* access modifiers changed from: protected */
    public String H() {
        Object obj = this.f19970a;
        if (obj instanceof g) {
            return "setFuture=[" + M(((g) obj).f19989b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean K(V v10) {
        if (v10 == null) {
            v10 = f19969g;
        }
        if (!f19968f.b(this, (Object) null, v10)) {
            return false;
        }
        B(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean L(Throwable th2) {
        if (!f19968f.b(this, (Object) null, new d((Throwable) n(th2)))) {
            return false;
        }
        B(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean N() {
        Object obj = this.f19970a;
        return (obj instanceof c) && ((c) obj).f19975a;
    }

    public final void a(Runnable runnable, Executor executor) {
        n(runnable);
        n(executor);
        e eVar = this.f19971b;
        if (eVar != e.f19979d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f19982c = eVar;
                if (!f19968f.a(this, eVar, eVar2)) {
                    eVar = this.f19971b;
                } else {
                    return;
                }
            } while (eVar != e.f19979d);
        }
        C(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [ob.e<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f19970a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f19966d
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.a$c r3 = new androidx.concurrent.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f19973c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f19974d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.concurrent.futures.a$b r6 = f19968f
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.G()
        L_0x0035:
            B(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.a$g r0 = (androidx.concurrent.futures.a.g) r0
            ob.e<? extends V> r0 = r0.f19989b
            boolean r4 = r0 instanceof androidx.concurrent.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.a r4 = (androidx.concurrent.futures.a) r4
            java.lang.Object r0 = r4.f19970a
            if (r0 != 0) goto L_0x004d
            r5 = r1
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = r1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f19970a
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = r2
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.cancel(boolean):boolean");
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f19970a;
            if ((obj != null) && (!(obj instanceof g))) {
                return D(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f19972c;
                if (iVar != i.f19990c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f19968f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f19970a;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return D(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    J(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            J(iVar2);
                        } else {
                            iVar = this.f19972c;
                        }
                    } while (iVar != i.f19990c);
                }
                return D(this.f19970a);
            }
            while (nanos > 0) {
                Object obj3 = this.f19970a;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return D(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f19970a instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f19970a;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = H();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f19970a;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return D(obj2);
            }
            i iVar = this.f19972c;
            if (iVar != i.f19990c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f19968f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f19970a;
                            } else {
                                J(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return D(obj);
                    }
                    iVar = this.f19972c;
                } while (iVar != i.f19990c);
            }
            return D(this.f19970a);
        }
        throw new InterruptedException();
    }
}
