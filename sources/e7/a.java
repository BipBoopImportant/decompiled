package E7;

import C7.f;
import E7.p;
import Y7.k;
import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f35015a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f35016b;

    /* renamed from: c  reason: collision with root package name */
    final Map<f, c> f35017c;

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<p<?>> f35018d;

    /* renamed from: e  reason: collision with root package name */
    private p.a f35019e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f35020f;

    /* renamed from: E7.a$a  reason: collision with other inner class name */
    class C0560a implements ThreadFactory {

        /* renamed from: E7.a$a$a  reason: collision with other inner class name */
        class C0561a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f35021a;

            C0561a(Runnable runnable) {
                this.f35021a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f35021a.run();
            }
        }

        C0560a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C0561a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference<p<?>> {

        /* renamed from: a  reason: collision with root package name */
        final f f35024a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f35025b;

        /* renamed from: c  reason: collision with root package name */
        v<?> f35026c;

        c(f fVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f35024a = (f) k.d(fVar);
            this.f35026c = (!pVar.f() || !z10) ? null : (v) k.d(pVar.e());
            this.f35025b = pVar.f();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f35026c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new C0560a()));
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(f fVar, p<?> pVar) {
        c put = this.f35017c.put(fVar, new c(fVar, pVar, this.f35018d, this.f35015a));
        if (put != null) {
            put.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        while (!this.f35020f) {
            try {
                c((c) this.f35018d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(c cVar) {
        synchronized (this) {
            this.f35017c.remove(cVar.f35024a);
            if (cVar.f35025b) {
                v<?> vVar = cVar.f35026c;
                if (vVar != null) {
                    this.f35019e.a(cVar.f35024a, new p(vVar, true, false, cVar.f35024a, this.f35019e));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(f fVar) {
        c remove = this.f35017c.remove(fVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized E7.p<?> e(C7.f r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<C7.f, E7.a$c> r0 = r1.f35017c     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001a }
            E7.a$c r2 = (E7.a.c) r2     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001a }
            E7.p r0 = (E7.p) r0     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            r1.c(r2)     // Catch:{ all -> 0x001a }
            goto L_0x001c
        L_0x001a:
            r2 = move-exception
            goto L_0x001e
        L_0x001c:
            monitor-exit(r1)
            return r0
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.a.e(C7.f):E7.p");
    }

    /* access modifiers changed from: package-private */
    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f35019e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f35017c = new HashMap();
        this.f35018d = new ReferenceQueue<>();
        this.f35015a = z10;
        this.f35016b = executor;
        executor.execute(new b());
    }
}
