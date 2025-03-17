package y3;

import java.util.ArrayDeque;
import t3.C5950a;
import y3.e;
import y3.f;
import y3.g;

public abstract class h<I extends f, O extends g, E extends e> implements d<I, O, E> {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f32290a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f32291b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<I> f32292c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayDeque<O> f32293d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    private final I[] f32294e;

    /* renamed from: f  reason: collision with root package name */
    private final O[] f32295f;

    /* renamed from: g  reason: collision with root package name */
    private int f32296g;

    /* renamed from: h  reason: collision with root package name */
    private int f32297h;

    /* renamed from: i  reason: collision with root package name */
    private I f32298i;

    /* renamed from: j  reason: collision with root package name */
    private E f32299j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32300k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f32301l;

    /* renamed from: m  reason: collision with root package name */
    private int f32302m;

    /* renamed from: n  reason: collision with root package name */
    private long f32303n = -9223372036854775807L;

    class a extends Thread {
        a(String str) {
            super(str);
        }

        public void run() {
            h.this.v();
        }
    }

    protected h(I[] iArr, O[] oArr) {
        this.f32294e = iArr;
        this.f32296g = iArr.length;
        for (int i10 = 0; i10 < this.f32296g; i10++) {
            this.f32294e[i10] = i();
        }
        this.f32295f = oArr;
        this.f32297h = oArr.length;
        for (int i11 = 0; i11 < this.f32297h; i11++) {
            this.f32295f[i11] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f32290a = aVar;
        aVar.start();
    }

    private boolean h() {
        return !this.f32292c.isEmpty() && this.f32297h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1.D() == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r3.n(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r3.f32287b = r1.f32281f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.E() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r3.n(134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (p(r1.f32281f) != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r3.f32289d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0 = l(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r0 = k(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r0 = k(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f32291b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.f32301l     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            boolean r1 = r8.h()     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0016
            java.lang.Object r1 = r8.f32291b     // Catch:{ all -> 0x0013 }
            r1.wait()     // Catch:{ all -> 0x0013 }
            goto L_0x0003
        L_0x0013:
            r1 = move-exception
            goto L_0x00a0
        L_0x0016:
            boolean r1 = r8.f32301l     // Catch:{ all -> 0x0013 }
            r2 = 0
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return r2
        L_0x001d:
            java.util.ArrayDeque<I> r1 = r8.f32292c     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0013 }
            y3.f r1 = (y3.f) r1     // Catch:{ all -> 0x0013 }
            O[] r3 = r8.f32295f     // Catch:{ all -> 0x0013 }
            int r4 = r8.f32297h     // Catch:{ all -> 0x0013 }
            r5 = 1
            int r4 = r4 - r5
            r8.f32297h = r4     // Catch:{ all -> 0x0013 }
            r3 = r3[r4]     // Catch:{ all -> 0x0013 }
            boolean r4 = r8.f32300k     // Catch:{ all -> 0x0013 }
            r8.f32300k = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            boolean r0 = r1.D()
            if (r0 == 0) goto L_0x003f
            r0 = 4
            r3.n(r0)
            goto L_0x0074
        L_0x003f:
            long r6 = r1.f32281f
            r3.f32287b = r6
            boolean r0 = r1.E()
            if (r0 == 0) goto L_0x004e
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r3.n(r0)
        L_0x004e:
            long r6 = r1.f32281f
            boolean r0 = r8.p(r6)
            if (r0 != 0) goto L_0x0058
            r3.f32289d = r5
        L_0x0058:
            y3.e r0 = r8.l(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0063, OutOfMemoryError -> 0x005d }
            goto L_0x0068
        L_0x005d:
            r0 = move-exception
            y3.e r0 = r8.k(r0)
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            y3.e r0 = r8.k(r0)
        L_0x0068:
            if (r0 == 0) goto L_0x0074
            java.lang.Object r4 = r8.f32291b
            monitor-enter(r4)
            r8.f32299j = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return r2
        L_0x0071:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r0
        L_0x0074:
            java.lang.Object r4 = r8.f32291b
            monitor-enter(r4)
            boolean r0 = r8.f32300k     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0081
            r3.J()     // Catch:{ all -> 0x007f }
            goto L_0x0099
        L_0x007f:
            r0 = move-exception
            goto L_0x009e
        L_0x0081:
            boolean r0 = r3.f32289d     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x008e
            int r0 = r8.f32302m     // Catch:{ all -> 0x007f }
            int r0 = r0 + r5
            r8.f32302m = r0     // Catch:{ all -> 0x007f }
            r3.J()     // Catch:{ all -> 0x007f }
            goto L_0x0099
        L_0x008e:
            int r0 = r8.f32302m     // Catch:{ all -> 0x007f }
            r3.f32288c = r0     // Catch:{ all -> 0x007f }
            r8.f32302m = r2     // Catch:{ all -> 0x007f }
            java.util.ArrayDeque<O> r0 = r8.f32293d     // Catch:{ all -> 0x007f }
            r0.addLast(r3)     // Catch:{ all -> 0x007f }
        L_0x0099:
            r8.s(r1)     // Catch:{ all -> 0x007f }
            monitor-exit(r4)     // Catch:{ all -> 0x007f }
            return r5
        L_0x009e:
            monitor-exit(r4)     // Catch:{ all -> 0x007f }
            throw r0
        L_0x00a0:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.h.m():boolean");
    }

    private void q() {
        if (h()) {
            this.f32291b.notify();
        }
    }

    private void r() {
        E e10 = this.f32299j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void s(I i10) {
        i10.v();
        I[] iArr = this.f32294e;
        int i11 = this.f32296g;
        this.f32296g = i11 + 1;
        iArr[i11] = i10;
    }

    private void u(O o10) {
        o10.v();
        O[] oArr = this.f32295f;
        int i10 = this.f32297h;
        this.f32297h = i10 + 1;
        oArr[i10] = o10;
    }

    /* access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m());
    }

    public final void d(long j10) {
        boolean z10;
        synchronized (this.f32291b) {
            try {
                if (this.f32296g != this.f32294e.length) {
                    if (!this.f32300k) {
                        z10 = false;
                        C5950a.g(z10);
                        this.f32303n = j10;
                    }
                }
                z10 = true;
                C5950a.g(z10);
                this.f32303n = j10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void c(I i10) {
        synchronized (this.f32291b) {
            r();
            C5950a.a(i10 == this.f32298i);
            this.f32292c.addLast(i10);
            q();
            this.f32298i = null;
        }
    }

    public final void flush() {
        synchronized (this.f32291b) {
            try {
                this.f32300k = true;
                this.f32302m = 0;
                I i10 = this.f32298i;
                if (i10 != null) {
                    s(i10);
                    this.f32298i = null;
                }
                while (!this.f32292c.isEmpty()) {
                    s((f) this.f32292c.removeFirst());
                }
                while (!this.f32293d.isEmpty()) {
                    ((g) this.f32293d.removeFirst()).J();
                }
            } finally {
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract I i();

    /* access modifiers changed from: protected */
    public abstract O j();

    /* access modifiers changed from: protected */
    public abstract E k(Throwable th2);

    /* access modifiers changed from: protected */
    public abstract E l(I i10, O o10, boolean z10);

    /* renamed from: n */
    public final I e() {
        I i10;
        synchronized (this.f32291b) {
            r();
            C5950a.g(this.f32298i == null);
            int i11 = this.f32296g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f32294e;
                int i12 = i11 - 1;
                this.f32296g = i12;
                i10 = iArr[i12];
            }
            this.f32298i = i10;
        }
        return i10;
    }

    /* renamed from: o */
    public final O a() {
        synchronized (this.f32291b) {
            try {
                r();
                if (this.f32293d.isEmpty()) {
                    return null;
                }
                O o10 = (g) this.f32293d.removeFirst();
                return o10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean p(long j10) {
        boolean z10;
        synchronized (this.f32291b) {
            long j11 = this.f32303n;
            if (j11 != -9223372036854775807L) {
                if (j10 < j11) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public void release() {
        synchronized (this.f32291b) {
            this.f32301l = true;
            this.f32291b.notify();
        }
        try {
            this.f32290a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* access modifiers changed from: protected */
    public void t(O o10) {
        synchronized (this.f32291b) {
            u(o10);
            q();
        }
    }

    /* access modifiers changed from: protected */
    public final void w(int i10) {
        C5950a.g(this.f32296g == this.f32294e.length);
        for (I K10 : this.f32294e) {
            K10.K(i10);
        }
    }
}
