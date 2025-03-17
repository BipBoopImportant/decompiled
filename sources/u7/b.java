package U7;

import U7.e;

public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f40326a;

    /* renamed from: b  reason: collision with root package name */
    private final e f40327b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f40328c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f40329d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f40330e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f40331f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f40330e = aVar;
        this.f40331f = aVar;
        this.f40326a = obj;
        this.f40327b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r3 = r2.f40331f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l(U7.d r3) {
        /*
            r2 = this;
            U7.e$a r0 = r2.f40330e
            U7.e$a r1 = U7.e.a.FAILED
            if (r0 == r1) goto L_0x000d
            U7.d r0 = r2.f40328c
            boolean r3 = r3.equals(r0)
            return r3
        L_0x000d:
            U7.d r0 = r2.f40329d
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x001f
            U7.e$a r3 = r2.f40331f
            U7.e$a r0 = U7.e.a.SUCCESS
            if (r3 == r0) goto L_0x001d
            if (r3 != r1) goto L_0x001f
        L_0x001d:
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.b.l(U7.d):boolean");
    }

    private boolean m() {
        e eVar = this.f40327b;
        return eVar == null || eVar.d(this);
    }

    private boolean n() {
        e eVar = this.f40327b;
        return eVar == null || eVar.k(this);
    }

    private boolean o() {
        e eVar = this.f40327b;
        return eVar == null || eVar.e(this);
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f40326a) {
            try {
                if (!this.f40328c.a()) {
                    if (!this.f40329d.a()) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void b(d dVar) {
        synchronized (this.f40326a) {
            try {
                if (dVar.equals(this.f40328c)) {
                    this.f40330e = e.a.SUCCESS;
                } else if (dVar.equals(this.f40329d)) {
                    this.f40331f = e.a.SUCCESS;
                }
                e eVar = this.f40327b;
                if (eVar != null) {
                    eVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        synchronized (this.f40326a) {
            try {
                e.a aVar = this.f40330e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f40330e = e.a.PAUSED;
                    this.f40328c.c();
                }
                if (this.f40331f == aVar2) {
                    this.f40331f = e.a.PAUSED;
                    this.f40329d.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clear() {
        synchronized (this.f40326a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f40330e = aVar;
                this.f40328c.clear();
                if (this.f40331f != aVar) {
                    this.f40331f = aVar;
                    this.f40329d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f40326a) {
            try {
                z10 = m() && dVar.equals(this.f40328c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean e(d dVar) {
        boolean o10;
        synchronized (this.f40326a) {
            o10 = o();
        }
        return o10;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f40326a) {
            try {
                e.a aVar = this.f40330e;
                e.a aVar2 = e.a.CLEARED;
                z10 = aVar == aVar2 && this.f40331f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(U7.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f40326a
            monitor-enter(r0)
            U7.d r1 = r2.f40329d     // Catch:{ all -> 0x001d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x0021
            U7.e$a r3 = U7.e.a.FAILED     // Catch:{ all -> 0x001d }
            r2.f40330e = r3     // Catch:{ all -> 0x001d }
            U7.e$a r3 = r2.f40331f     // Catch:{ all -> 0x001d }
            U7.e$a r1 = U7.e.a.RUNNING     // Catch:{ all -> 0x001d }
            if (r3 == r1) goto L_0x001f
            r2.f40331f = r1     // Catch:{ all -> 0x001d }
            U7.d r3 = r2.f40329d     // Catch:{ all -> 0x001d }
            r3.j()     // Catch:{ all -> 0x001d }
            goto L_0x001f
        L_0x001d:
            r3 = move-exception
            goto L_0x002e
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0021:
            U7.e$a r3 = U7.e.a.FAILED     // Catch:{ all -> 0x001d }
            r2.f40331f = r3     // Catch:{ all -> 0x001d }
            U7.e r3 = r2.f40327b     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x002c
            r3.g(r2)     // Catch:{ all -> 0x001d }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.b.g(U7.d):void");
    }

    public e getRoot() {
        e root;
        synchronized (this.f40326a) {
            try {
                e eVar = this.f40327b;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f40326a) {
            try {
                e.a aVar = this.f40330e;
                e.a aVar2 = e.a.SUCCESS;
                if (aVar != aVar2) {
                    if (this.f40331f != aVar2) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean i(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        return this.f40328c.i(bVar.f40328c) && this.f40329d.i(bVar.f40329d);
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f40326a) {
            try {
                e.a aVar = this.f40330e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    if (this.f40331f != aVar2) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void j() {
        synchronized (this.f40326a) {
            try {
                e.a aVar = this.f40330e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f40330e = aVar2;
                    this.f40328c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean k(d dVar) {
        boolean z10;
        synchronized (this.f40326a) {
            try {
                z10 = n() && l(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void p(d dVar, d dVar2) {
        this.f40328c = dVar;
        this.f40329d = dVar2;
    }
}
