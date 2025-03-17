package KK;

import HK.C15864d;
import XH.C16807N;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0003\u001a\u001f\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,¨\u0006."}, d2 = {"LKK/e;", "", "LKK/e$a;", "backend", "<init>", "(LKK/e$a;)V", "LKK/a;", "task", "LXH/N;", "e", "(LKK/a;)V", "j", "", "delayNanos", "c", "(LKK/a;J)V", "LKK/d;", "taskQueue", "h", "(LKK/d;)V", "d", "()LKK/a;", "i", "()LKK/d;", "f", "()V", "a", "LKK/e$a;", "g", "()LKK/e$a;", "", "b", "I", "nextQueueName", "", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: h  reason: collision with root package name */
    public static final b f135926h = new b((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final e f135927i = new e(new c(C15864d.O(C15864d.f135364i + " TaskRunner", true)));
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f135928j;

    /* renamed from: a  reason: collision with root package name */
    private final a f135929a;

    /* renamed from: b  reason: collision with root package name */
    private int f135930b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private boolean f135931c;

    /* renamed from: d  reason: collision with root package name */
    private long f135932d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C15996d> f135933e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<C15996d> f135934f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f135935g = new d(this);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LKK/e$a;", "", "", "b", "()J", "LKK/e;", "taskRunner", "LXH/N;", "c", "(LKK/e;)V", "nanos", "d", "(LKK/e;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        long b();

        void c(e eVar);

        void d(e eVar, long j10);

        void execute(Runnable runnable);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKK/e$b;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "LKK/e;", "INSTANCE", "LKK/e;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return e.f135928j;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LKK/e$c;", "LKK/e$a;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", "b", "()J", "LKK/e;", "taskRunner", "LXH/N;", "c", "(LKK/e;)V", "nanos", "d", "(LKK/e;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadPoolExecutor f135936a;

        public c(ThreadFactory threadFactory) {
            C17542s.j(threadFactory, "threadFactory");
            this.f135936a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public long b() {
            return System.nanoTime();
        }

        public void c(e eVar) {
            C17542s.j(eVar, "taskRunner");
            eVar.notify();
        }

        public void d(e eVar, long j10) {
            C17542s.j(eVar, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                eVar.wait(j11, (int) j12);
            }
        }

        public void execute(Runnable runnable) {
            C17542s.j(runnable, "runnable");
            this.f135936a.execute(runnable);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"KK/e$d", "Ljava/lang/Runnable;", "LXH/N;", "run", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f135937a;

        d(e eVar) {
            this.f135937a = eVar;
        }

        public void run() {
            C15993a d10;
            long j10;
            while (true) {
                e eVar = this.f135937a;
                synchronized (eVar) {
                    d10 = eVar.d();
                }
                if (d10 != null) {
                    C15996d d11 = d10.d();
                    C17542s.g(d11);
                    e eVar2 = this.f135937a;
                    boolean isLoggable = e.f135926h.a().isLoggable(Level.FINE);
                    if (isLoggable) {
                        j10 = d11.h().g().b();
                        C15994b.c(d10, d11, "starting");
                    } else {
                        j10 = -1;
                    }
                    try {
                        eVar2.j(d10);
                        C16807N n10 = C16807N.f139792a;
                        if (isLoggable) {
                            long b10 = d11.h().g().b() - j10;
                            C15994b.c(d10, d11, "finished run in " + C15994b.b(b10));
                        }
                    } catch (Throwable th2) {
                        if (isLoggable) {
                            C15994b.c(d10, d11, "failed a run in " + C15994b.b(d11.h().g().b() - j10));
                        }
                        throw th2;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        C17542s.i(logger, "getLogger(TaskRunner::class.java.name)");
        f135928j = logger;
    }

    public e(a aVar) {
        C17542s.j(aVar, "backend");
        this.f135929a = aVar;
    }

    private final void c(C15993a aVar, long j10) {
        if (!C15864d.f135363h || Thread.holdsLock(this)) {
            C15996d d10 = aVar.d();
            C17542s.g(d10);
            if (d10.c() == aVar) {
                boolean d11 = d10.d();
                d10.m(false);
                d10.l((C15993a) null);
                this.f135933e.remove(d10);
                if (j10 != -1 && !d11 && !d10.g()) {
                    d10.k(aVar, j10, true);
                }
                if (!d10.e().isEmpty()) {
                    this.f135934f.add(d10);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void e(C15993a aVar) {
        if (!C15864d.f135363h || Thread.holdsLock(this)) {
            aVar.g(-1);
            C15996d d10 = aVar.d();
            C17542s.g(d10);
            d10.e().remove(aVar);
            this.f135934f.remove(d10);
            d10.l(aVar);
            this.f135933e.add(d10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* access modifiers changed from: private */
    public final void j(C15993a aVar) {
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(aVar.b());
            try {
                long f10 = aVar.f();
                synchronized (this) {
                    c(aVar, f10);
                    C16807N n10 = C16807N.f139792a;
                }
                currentThread.setName(name);
            } catch (Throwable th2) {
                synchronized (this) {
                    c(aVar, -1);
                    C16807N n11 = C16807N.f139792a;
                    currentThread.setName(name);
                    throw th2;
                }
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final KK.C15993a d() {
        /*
            r14 = this;
            boolean r0 = HK.C15864d.f135363h
            if (r0 == 0) goto L_0x0032
            boolean r0 = java.lang.Thread.holdsLock(r14)
            if (r0 == 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0032:
            java.util.List<KK.d> r0 = r14.f135934f
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            KK.e$a r0 = r14.f135929a
            long r2 = r0.b()
            java.util.List<KK.d> r0 = r14.f135934f
            java.util.Iterator r0 = r0.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r1
        L_0x004e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x0080
            java.lang.Object r7 = r0.next()
            KK.d r7 = (KK.C15996d) r7
            java.util.List r7 = r7.e()
            java.lang.Object r7 = r7.get(r9)
            KK.a r7 = (KK.C15993a) r7
            long r10 = r7.c()
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x007a
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x004e
        L_0x007a:
            if (r6 == 0) goto L_0x007e
            r0 = r8
            goto L_0x0081
        L_0x007e:
            r6 = r7
            goto L_0x004e
        L_0x0080:
            r0 = r9
        L_0x0081:
            if (r6 == 0) goto L_0x009e
            r14.e(r6)
            if (r0 != 0) goto L_0x0096
            boolean r0 = r14.f135931c
            if (r0 != 0) goto L_0x009d
            java.util.List<KK.d> r0 = r14.f135934f
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009d
        L_0x0096:
            KK.e$a r0 = r14.f135929a
            java.lang.Runnable r1 = r14.f135935g
            r0.execute(r1)
        L_0x009d:
            return r6
        L_0x009e:
            boolean r0 = r14.f135931c
            if (r0 == 0) goto L_0x00af
            long r6 = r14.f135932d
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ae
            KK.e$a r0 = r14.f135929a
            r0.c(r14)
        L_0x00ae:
            return r1
        L_0x00af:
            r14.f135931c = r8
            long r2 = r2 + r4
            r14.f135932d = r2
            KK.e$a r0 = r14.f135929a     // Catch:{ InterruptedException -> 0x00bf }
            r0.d(r14, r4)     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b9:
            r14.f135931c = r9
            goto L_0x0032
        L_0x00bd:
            r0 = move-exception
            goto L_0x00c3
        L_0x00bf:
            r14.f()     // Catch:{ all -> 0x00bd }
            goto L_0x00b9
        L_0x00c3:
            r14.f135931c = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: KK.e.d():KK.a");
    }

    public final void f() {
        int size = this.f135933e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            this.f135933e.get(size).b();
        }
        for (int size2 = this.f135934f.size() - 1; -1 < size2; size2--) {
            C15996d dVar = this.f135934f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f135934f.remove(size2);
            }
        }
    }

    public final a g() {
        return this.f135929a;
    }

    public final void h(C15996d dVar) {
        C17542s.j(dVar, "taskQueue");
        if (!C15864d.f135363h || Thread.holdsLock(this)) {
            if (dVar.c() == null) {
                if (!dVar.e().isEmpty()) {
                    C15864d.c(this.f135934f, dVar);
                } else {
                    this.f135934f.remove(dVar);
                }
            }
            if (this.f135931c) {
                this.f135929a.c(this);
            } else {
                this.f135929a.execute(this.f135935g);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
    }

    public final C15996d i() {
        int i10;
        synchronized (this) {
            i10 = this.f135930b;
            this.f135930b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new C15996d(this, sb2.toString());
    }
}
