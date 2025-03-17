package E7;

import E7.h;
import E7.p;
import H2.f;
import Y7.k;
import Z7.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

class l<R> implements h.b<R>, a.f {

    /* renamed from: z  reason: collision with root package name */
    private static final c f35138z = new c();

    /* renamed from: a  reason: collision with root package name */
    final e f35139a;

    /* renamed from: b  reason: collision with root package name */
    private final Z7.c f35140b;

    /* renamed from: c  reason: collision with root package name */
    private final p.a f35141c;

    /* renamed from: d  reason: collision with root package name */
    private final f<l<?>> f35142d;

    /* renamed from: e  reason: collision with root package name */
    private final c f35143e;

    /* renamed from: f  reason: collision with root package name */
    private final m f35144f;

    /* renamed from: g  reason: collision with root package name */
    private final H7.a f35145g;

    /* renamed from: h  reason: collision with root package name */
    private final H7.a f35146h;

    /* renamed from: i  reason: collision with root package name */
    private final H7.a f35147i;

    /* renamed from: j  reason: collision with root package name */
    private final H7.a f35148j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f35149k;

    /* renamed from: l  reason: collision with root package name */
    private C7.f f35150l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f35151m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f35152n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f35153o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35154p;

    /* renamed from: q  reason: collision with root package name */
    private v<?> f35155q;

    /* renamed from: r  reason: collision with root package name */
    C7.a f35156r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f35157s;

    /* renamed from: t  reason: collision with root package name */
    q f35158t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f35159u;

    /* renamed from: v  reason: collision with root package name */
    p<?> f35160v;

    /* renamed from: w  reason: collision with root package name */
    private h<R> f35161w;

    /* renamed from: x  reason: collision with root package name */
    private volatile boolean f35162x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f35163y;

    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final U7.h f35164a;

        a(U7.h hVar) {
            this.f35164a = hVar;
        }

        public void run() {
            synchronized (this.f35164a.g()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f35139a.i(this.f35164a)) {
                            l.this.c(this.f35164a);
                        }
                        l.this.h();
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final U7.h f35166a;

        b(U7.h hVar) {
            this.f35166a = hVar;
        }

        public void run() {
            synchronized (this.f35166a.g()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f35139a.i(this.f35166a)) {
                            l.this.f35160v.b();
                            l.this.f(this.f35166a);
                            l.this.r(this.f35166a);
                        }
                        l.this.h();
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public <R> p<R> a(v<R> vVar, boolean z10, C7.f fVar, p.a aVar) {
            return new p(vVar, z10, true, fVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        final U7.h f35168a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f35169b;

        d(U7.h hVar, Executor executor) {
            this.f35168a = hVar;
            this.f35169b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f35168a.equals(((d) obj).f35168a);
            }
            return false;
        }

        public int hashCode() {
            return this.f35168a.hashCode();
        }
    }

    static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f35170a;

        e() {
            this(new ArrayList(2));
        }

        private static d k(U7.h hVar) {
            return new d(hVar, Y7.e.a());
        }

        /* access modifiers changed from: package-private */
        public void b(U7.h hVar, Executor executor) {
            this.f35170a.add(new d(hVar, executor));
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            this.f35170a.clear();
        }

        /* access modifiers changed from: package-private */
        public boolean i(U7.h hVar) {
            return this.f35170a.contains(k(hVar));
        }

        /* access modifiers changed from: package-private */
        public boolean isEmpty() {
            return this.f35170a.isEmpty();
        }

        public Iterator<d> iterator() {
            return this.f35170a.iterator();
        }

        /* access modifiers changed from: package-private */
        public e j() {
            return new e(new ArrayList(this.f35170a));
        }

        /* access modifiers changed from: package-private */
        public void m(U7.h hVar) {
            this.f35170a.remove(k(hVar));
        }

        /* access modifiers changed from: package-private */
        public int size() {
            return this.f35170a.size();
        }

        e(List<d> list) {
            this.f35170a = list;
        }
    }

    l(H7.a aVar, H7.a aVar2, H7.a aVar3, H7.a aVar4, m mVar, p.a aVar5, f<l<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, fVar, f35138z);
    }

    private H7.a i() {
        return this.f35152n ? this.f35147i : this.f35153o ? this.f35148j : this.f35146h;
    }

    private boolean m() {
        return this.f35159u || this.f35157s || this.f35162x;
    }

    private synchronized void q() {
        if (this.f35150l != null) {
            this.f35139a.clear();
            this.f35150l = null;
            this.f35160v = null;
            this.f35155q = null;
            this.f35159u = false;
            this.f35162x = false;
            this.f35157s = false;
            this.f35163y = false;
            this.f35161w.R(false);
            this.f35161w = null;
            this.f35158t = null;
            this.f35156r = null;
            this.f35142d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(U7.h hVar, Executor executor) {
        try {
            this.f35140b.c();
            this.f35139a.b(hVar, executor);
            if (this.f35157s) {
                k(1);
                executor.execute(new b(hVar));
            } else if (this.f35159u) {
                k(1);
                executor.execute(new a(hVar));
            } else {
                k.a(!this.f35162x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void b(q qVar) {
        synchronized (this) {
            this.f35158t = qVar;
        }
        n();
    }

    /* access modifiers changed from: package-private */
    public void c(U7.h hVar) {
        try {
            hVar.b(this.f35158t);
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    public void d(v<R> vVar, C7.a aVar, boolean z10) {
        synchronized (this) {
            this.f35155q = vVar;
            this.f35156r = aVar;
            this.f35163y = z10;
        }
        o();
    }

    public void e(h<?> hVar) {
        i().execute(hVar);
    }

    /* access modifiers changed from: package-private */
    public void f(U7.h hVar) {
        try {
            hVar.d(this.f35160v, this.f35156r, this.f35163y);
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        if (!m()) {
            this.f35162x = true;
            this.f35161w.a();
            this.f35144f.c(this, this.f35150l);
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f35140b.c();
                k.a(m(), "Not yet complete!");
                int decrementAndGet = this.f35149k.decrementAndGet();
                k.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f35160v;
                    q();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    public Z7.c j() {
        return this.f35140b;
    }

    /* access modifiers changed from: package-private */
    public synchronized void k(int i10) {
        p<?> pVar;
        k.a(m(), "Not yet complete!");
        if (this.f35149k.getAndAdd(i10) == 0 && (pVar = this.f35160v) != null) {
            pVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized l<R> l(C7.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f35150l = fVar;
        this.f35151m = z10;
        this.f35152n = z11;
        this.f35153o = z12;
        this.f35154p = z13;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r4.f35144f.d(r4, r1, (E7.p<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r0.hasNext() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = r0.next();
        r1.f35169b.execute(new E7.l.a(r4, r1.f35168a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r4 = this;
            monitor-enter(r4)
            Z7.c r0 = r4.f35140b     // Catch:{ all -> 0x000f }
            r0.c()     // Catch:{ all -> 0x000f }
            boolean r0 = r4.f35162x     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x0011
            r4.q()     // Catch:{ all -> 0x000f }
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            return
        L_0x000f:
            r0 = move-exception
            goto L_0x0068
        L_0x0011:
            E7.l$e r0 = r4.f35139a     // Catch:{ all -> 0x000f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r4.f35159u     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0058
            r0 = 1
            r4.f35159u = r0     // Catch:{ all -> 0x000f }
            C7.f r1 = r4.f35150l     // Catch:{ all -> 0x000f }
            E7.l$e r2 = r4.f35139a     // Catch:{ all -> 0x000f }
            E7.l$e r2 = r2.j()     // Catch:{ all -> 0x000f }
            int r3 = r2.size()     // Catch:{ all -> 0x000f }
            int r3 = r3 + r0
            r4.k(r3)     // Catch:{ all -> 0x000f }
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            E7.m r0 = r4.f35144f
            r3 = 0
            r0.d(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r0.next()
            E7.l$d r1 = (E7.l.d) r1
            java.util.concurrent.Executor r2 = r1.f35169b
            E7.l$a r3 = new E7.l$a
            U7.h r1 = r1.f35168a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x003b
        L_0x0054:
            r4.h()
            return
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x0068:
            monitor-exit(r4)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.l.n():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r5.f35144f.d(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r0.hasNext() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        r1 = r0.next();
        r1.f35169b.execute(new E7.l.b(r5, r1.f35168a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o() {
        /*
            r5 = this;
            monitor-enter(r5)
            Z7.c r0 = r5.f35140b     // Catch:{ all -> 0x0014 }
            r0.c()     // Catch:{ all -> 0x0014 }
            boolean r0 = r5.f35162x     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0016
            E7.v<?> r0 = r5.f35155q     // Catch:{ all -> 0x0014 }
            r0.c()     // Catch:{ all -> 0x0014 }
            r5.q()     // Catch:{ all -> 0x0014 }
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r0 = move-exception
            goto L_0x007e
        L_0x0016:
            E7.l$e r0 = r5.f35139a     // Catch:{ all -> 0x0014 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0076
            boolean r0 = r5.f35157s     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x006e
            E7.l$c r0 = r5.f35143e     // Catch:{ all -> 0x0014 }
            E7.v<?> r1 = r5.f35155q     // Catch:{ all -> 0x0014 }
            boolean r2 = r5.f35151m     // Catch:{ all -> 0x0014 }
            C7.f r3 = r5.f35150l     // Catch:{ all -> 0x0014 }
            E7.p$a r4 = r5.f35141c     // Catch:{ all -> 0x0014 }
            E7.p r0 = r0.a(r1, r2, r3, r4)     // Catch:{ all -> 0x0014 }
            r5.f35160v = r0     // Catch:{ all -> 0x0014 }
            r0 = 1
            r5.f35157s = r0     // Catch:{ all -> 0x0014 }
            E7.l$e r1 = r5.f35139a     // Catch:{ all -> 0x0014 }
            E7.l$e r1 = r1.j()     // Catch:{ all -> 0x0014 }
            int r2 = r1.size()     // Catch:{ all -> 0x0014 }
            int r2 = r2 + r0
            r5.k(r2)     // Catch:{ all -> 0x0014 }
            C7.f r0 = r5.f35150l     // Catch:{ all -> 0x0014 }
            E7.p<?> r2 = r5.f35160v     // Catch:{ all -> 0x0014 }
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            E7.m r3 = r5.f35144f
            r3.d(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x0051:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r0.next()
            E7.l$d r1 = (E7.l.d) r1
            java.util.concurrent.Executor r2 = r1.f35169b
            E7.l$b r3 = new E7.l$b
            U7.h r1 = r1.f35168a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0051
        L_0x006a:
            r5.h()
            return
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x0076:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            throw r0     // Catch:{ all -> 0x0014 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.l.o():void");
    }

    /* access modifiers changed from: package-private */
    public boolean p() {
        return this.f35154p;
    }

    /* access modifiers changed from: package-private */
    public synchronized void r(U7.h hVar) {
        try {
            this.f35140b.c();
            this.f35139a.m(hVar);
            if (this.f35139a.isEmpty()) {
                g();
                if (!this.f35157s) {
                    if (this.f35159u) {
                    }
                }
                if (this.f35149k.get() == 0) {
                    q();
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        try {
            this.f35161w = hVar;
            (hVar.Y() ? this.f35145g : i()).execute(hVar);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    l(H7.a aVar, H7.a aVar2, H7.a aVar3, H7.a aVar4, m mVar, p.a aVar5, f<l<?>> fVar, c cVar) {
        this.f35139a = new e();
        this.f35140b = Z7.c.a();
        this.f35149k = new AtomicInteger();
        this.f35145g = aVar;
        this.f35146h = aVar2;
        this.f35147i = aVar3;
        this.f35148j = aVar4;
        this.f35144f = mVar;
        this.f35141c = aVar5;
        this.f35142d = fVar;
        this.f35143e = cVar;
    }
}
