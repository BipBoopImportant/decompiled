package I;

import H2.i;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ob.C10101e;

class p<V> implements C10101e<List<V>> {

    /* renamed from: a  reason: collision with root package name */
    List<? extends C10101e<? extends V>> f7109a;

    /* renamed from: b  reason: collision with root package name */
    List<V> f7110b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7111c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicInteger f7112d;

    /* renamed from: e  reason: collision with root package name */
    private final C10101e<List<V>> f7113e = androidx.concurrent.futures.c.a(new a());

    /* renamed from: f  reason: collision with root package name */
    c.a<List<V>> f7114f;

    class a implements c.C0320c<List<V>> {
        a() {
        }

        public Object a(c.a<List<V>> aVar) {
            i.j(p.this.f7114f == null, "The result can only set once!");
            p.this.f7114f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            p pVar = p.this;
            pVar.f7110b = null;
            pVar.f7109a = null;
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f7117a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10101e f7118b;

        c(int i10, C10101e eVar) {
            this.f7117a = i10;
            this.f7118b = eVar;
        }

        public void run() {
            p.this.f(this.f7117a, this.f7118b);
        }
    }

    p(List<? extends C10101e<? extends V>> list, boolean z10, Executor executor) {
        this.f7109a = (List) i.g(list);
        this.f7110b = new ArrayList(list.size());
        this.f7111c = z10;
        this.f7112d = new AtomicInteger(list.size());
        e(executor);
    }

    private void b() {
        List<? extends C10101e<? extends V>> list = this.f7109a;
        if (list != null && !isDone()) {
            for (C10101e eVar : list) {
                while (true) {
                    if (!eVar.isDone()) {
                        try {
                            eVar.get();
                        } catch (Error e10) {
                            throw e10;
                        } catch (InterruptedException e11) {
                            throw e11;
                        } catch (Throwable unused) {
                            if (this.f7111c) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void e(Executor executor) {
        a(new b(), H.a.a());
        if (this.f7109a.isEmpty()) {
            this.f7114f.c(new ArrayList(this.f7110b));
            return;
        }
        for (int i10 = 0; i10 < this.f7109a.size(); i10++) {
            this.f7110b.add((Object) null);
        }
        List<? extends C10101e<? extends V>> list = this.f7109a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            C10101e eVar = (C10101e) list.get(i11);
            eVar.a(new c(i11, eVar), executor);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        this.f7113e.a(runnable, executor);
    }

    /* renamed from: c */
    public List<V> get() {
        b();
        return this.f7113e.get();
    }

    public boolean cancel(boolean z10) {
        List<? extends C10101e<? extends V>> list = this.f7109a;
        if (list != null) {
            for (C10101e cancel : list) {
                cancel.cancel(z10);
            }
        }
        return this.f7113e.cancel(z10);
    }

    /* renamed from: d */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f7113e.get(j10, timeUnit);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00be */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(int r7, java.util.concurrent.Future<? extends V> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "Less than 0 remaining futures"
            java.util.List<V> r1 = r6.f7110b
            boolean r2 = r6.isDone()
            if (r2 != 0) goto L_0x0108
            if (r1 != 0) goto L_0x000e
            goto L_0x0108
        L_0x000e:
            r2 = 1
            r3 = 0
            boolean r4 = r8.isDone()     // Catch:{ CancellationException -> 0x00be, ExecutionException -> 0x004f, RuntimeException -> 0x004d, Error -> 0x004b }
            java.lang.String r5 = "Tried to set value from future which is not done"
            H2.i.j(r4, r5)     // Catch:{ CancellationException -> 0x00be, ExecutionException -> 0x004f, RuntimeException -> 0x004d, Error -> 0x004b }
            java.lang.Object r8 = I.n.m(r8)     // Catch:{ CancellationException -> 0x00be, ExecutionException -> 0x004f, RuntimeException -> 0x004d, Error -> 0x004b }
            r1.set(r7, r8)     // Catch:{ CancellationException -> 0x00be, ExecutionException -> 0x004f, RuntimeException -> 0x004d, Error -> 0x004b }
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f7112d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            H2.i.j(r2, r0)
            if (r7 != 0) goto L_0x00e1
            java.util.List<V> r7 = r6.f7110b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
        L_0x003a:
            r8.c(r0)
            goto L_0x00e1
        L_0x003f:
            boolean r7 = r6.isDone()
            H2.i.i(r7)
            goto L_0x00e1
        L_0x0048:
            r7 = move-exception
            goto L_0x00e2
        L_0x004b:
            r7 = move-exception
            goto L_0x0051
        L_0x004d:
            r7 = move-exception
            goto L_0x0071
        L_0x004f:
            r7 = move-exception
            goto L_0x0095
        L_0x0051:
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f     // Catch:{ all -> 0x0048 }
            r8.f(r7)     // Catch:{ all -> 0x0048 }
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f7112d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r3
        L_0x0060:
            H2.i.j(r2, r0)
            if (r7 != 0) goto L_0x00e1
            java.util.List<V> r7 = r6.f7110b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x0071:
            boolean r8 = r6.f7111c     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x007a
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f     // Catch:{ all -> 0x0048 }
            r8.f(r7)     // Catch:{ all -> 0x0048 }
        L_0x007a:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f7112d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r3
        L_0x0084:
            H2.i.j(r2, r0)
            if (r7 != 0) goto L_0x00e1
            java.util.List<V> r7 = r6.f7110b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x0095:
            boolean r8 = r6.f7111c     // Catch:{ all -> 0x0048 }
            if (r8 == 0) goto L_0x00a2
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ all -> 0x0048 }
            r8.f(r7)     // Catch:{ all -> 0x0048 }
        L_0x00a2:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f7112d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r2 = r3
        L_0x00ac:
            H2.i.j(r2, r0)
            if (r7 != 0) goto L_0x00e1
            java.util.List<V> r7 = r6.f7110b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x00be:
            boolean r7 = r6.f7111c     // Catch:{ all -> 0x0048 }
            if (r7 == 0) goto L_0x00c5
            r6.cancel(r3)     // Catch:{ all -> 0x0048 }
        L_0x00c5:
            java.util.concurrent.atomic.AtomicInteger r7 = r6.f7112d
            int r7 = r7.decrementAndGet()
            if (r7 < 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r2 = r3
        L_0x00cf:
            H2.i.j(r2, r0)
            if (r7 != 0) goto L_0x00e1
            java.util.List<V> r7 = r6.f7110b
            if (r7 == 0) goto L_0x003f
            androidx.concurrent.futures.c$a<java.util.List<V>> r8 = r6.f7114f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            goto L_0x003a
        L_0x00e1:
            return
        L_0x00e2:
            java.util.concurrent.atomic.AtomicInteger r8 = r6.f7112d
            int r8 = r8.decrementAndGet()
            if (r8 < 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r2 = r3
        L_0x00ec:
            H2.i.j(r2, r0)
            if (r8 != 0) goto L_0x0107
            java.util.List<V> r8 = r6.f7110b
            if (r8 == 0) goto L_0x0100
            androidx.concurrent.futures.c$a<java.util.List<V>> r0 = r6.f7114f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r8)
            r0.c(r1)
            goto L_0x0107
        L_0x0100:
            boolean r8 = r6.isDone()
            H2.i.i(r8)
        L_0x0107:
            throw r7
        L_0x0108:
            boolean r7 = r6.f7111c
            java.lang.String r8 = "Future was done before all dependencies completed"
            H2.i.j(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I.p.f(int, java.util.concurrent.Future):void");
    }

    public boolean isCancelled() {
        return this.f7113e.isCancelled();
    }

    public boolean isDone() {
        return this.f7113e.isDone();
    }
}
