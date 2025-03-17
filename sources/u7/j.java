package U7;

import U7.e;

public class j implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final e f40363a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f40364b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f40365c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f40366d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f40367e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f40368f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f40369g;

    public j(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f40367e = aVar;
        this.f40368f = aVar;
        this.f40364b = obj;
        this.f40363a = eVar;
    }

    private boolean l() {
        e eVar = this.f40363a;
        return eVar == null || eVar.d(this);
    }

    private boolean m() {
        e eVar = this.f40363a;
        return eVar == null || eVar.k(this);
    }

    private boolean n() {
        e eVar = this.f40363a;
        return eVar == null || eVar.e(this);
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f40364b) {
            try {
                if (!this.f40366d.a()) {
                    if (!this.f40365c.a()) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(U7.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f40364b
            monitor-enter(r0)
            U7.d r1 = r2.f40366d     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x0013
            U7.e$a r3 = U7.e.a.SUCCESS     // Catch:{ all -> 0x0011 }
            r2.f40368f = r3     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r3 = move-exception
            goto L_0x002d
        L_0x0013:
            U7.e$a r3 = U7.e.a.SUCCESS     // Catch:{ all -> 0x0011 }
            r2.f40367e = r3     // Catch:{ all -> 0x0011 }
            U7.e r3 = r2.f40363a     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x001e
            r3.b(r2)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            U7.e$a r3 = r2.f40368f     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0011 }
            if (r3 != 0) goto L_0x002b
            U7.d r3 = r2.f40366d     // Catch:{ all -> 0x0011 }
            r3.clear()     // Catch:{ all -> 0x0011 }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.j.b(U7.d):void");
    }

    public void c() {
        synchronized (this.f40364b) {
            try {
                if (!this.f40368f.b()) {
                    this.f40368f = e.a.PAUSED;
                    this.f40366d.c();
                }
                if (!this.f40367e.b()) {
                    this.f40367e = e.a.PAUSED;
                    this.f40365c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clear() {
        synchronized (this.f40364b) {
            this.f40369g = false;
            e.a aVar = e.a.CLEARED;
            this.f40367e = aVar;
            this.f40368f = aVar;
            this.f40366d.clear();
            this.f40365c.clear();
        }
    }

    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f40364b) {
            try {
                z10 = l() && dVar.equals(this.f40365c) && this.f40367e != e.a.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean e(d dVar) {
        boolean z10;
        synchronized (this.f40364b) {
            try {
                if (n()) {
                    if (!dVar.equals(this.f40365c)) {
                        if (this.f40367e != e.a.SUCCESS) {
                        }
                    }
                    z10 = true;
                }
                z10 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f40364b) {
            z10 = this.f40367e == e.a.CLEARED;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(U7.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f40364b
            monitor-enter(r0)
            U7.d r1 = r2.f40365c     // Catch:{ all -> 0x0011 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0011 }
            if (r3 != 0) goto L_0x0013
            U7.e$a r3 = U7.e.a.FAILED     // Catch:{ all -> 0x0011 }
            r2.f40368f = r3     // Catch:{ all -> 0x0011 }
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0011:
            r3 = move-exception
            goto L_0x0020
        L_0x0013:
            U7.e$a r3 = U7.e.a.FAILED     // Catch:{ all -> 0x0011 }
            r2.f40367e = r3     // Catch:{ all -> 0x0011 }
            U7.e r3 = r2.f40363a     // Catch:{ all -> 0x0011 }
            if (r3 == 0) goto L_0x001e
            r3.g(r2)     // Catch:{ all -> 0x0011 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0011 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.j.g(U7.d):void");
    }

    public e getRoot() {
        e root;
        synchronized (this.f40364b) {
            try {
                e eVar = this.f40363a;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f40364b) {
            z10 = this.f40367e == e.a.SUCCESS;
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(U7.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof U7.j
            r1 = 0
            if (r0 == 0) goto L_0x002e
            U7.j r4 = (U7.j) r4
            U7.d r0 = r3.f40365c
            if (r0 != 0) goto L_0x0010
            U7.d r0 = r4.f40365c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            U7.d r0 = r3.f40365c
            U7.d r2 = r4.f40365c
            boolean r0 = r0.i(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            U7.d r0 = r3.f40366d
            if (r0 != 0) goto L_0x0023
            U7.d r4 = r4.f40366d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            U7.d r0 = r3.f40366d
            U7.d r4 = r4.f40366d
            boolean r4 = r0.i(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.j.i(U7.d):boolean");
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f40364b) {
            z10 = this.f40367e == e.a.RUNNING;
        }
        return z10;
    }

    public void j() {
        e.a aVar;
        e.a aVar2;
        synchronized (this.f40364b) {
            try {
                this.f40369g = true;
                if (!(this.f40367e == e.a.SUCCESS || this.f40368f == (aVar2 = e.a.RUNNING))) {
                    this.f40368f = aVar2;
                    this.f40366d.j();
                }
                if (this.f40369g && this.f40367e != (aVar = e.a.RUNNING)) {
                    this.f40367e = aVar;
                    this.f40365c.j();
                }
                this.f40369g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean k(d dVar) {
        boolean z10;
        synchronized (this.f40364b) {
            try {
                z10 = m() && dVar.equals(this.f40365c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void o(d dVar, d dVar2) {
        this.f40365c = dVar;
        this.f40366d = dVar2;
    }
}
