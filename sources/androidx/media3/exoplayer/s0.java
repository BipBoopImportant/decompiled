package androidx.media3.exoplayer;

import android.os.Looper;
import q3.J;
import t3.C5950a;
import t3.C5953d;

public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f22865a;

    /* renamed from: b  reason: collision with root package name */
    private final a f22866b;

    /* renamed from: c  reason: collision with root package name */
    private final C5953d f22867c;

    /* renamed from: d  reason: collision with root package name */
    private final J f22868d;

    /* renamed from: e  reason: collision with root package name */
    private int f22869e;

    /* renamed from: f  reason: collision with root package name */
    private Object f22870f;

    /* renamed from: g  reason: collision with root package name */
    private Looper f22871g;

    /* renamed from: h  reason: collision with root package name */
    private int f22872h;

    /* renamed from: i  reason: collision with root package name */
    private long f22873i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f22874j = true;

    /* renamed from: k  reason: collision with root package name */
    private boolean f22875k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f22876l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f22877m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f22878n;

    public interface a {
        void d(s0 s0Var);
    }

    public interface b {
        void x(int i10, Object obj);
    }

    public s0(a aVar, b bVar, J j10, int i10, C5953d dVar, Looper looper) {
        this.f22866b = aVar;
        this.f22865a = bVar;
        this.f22868d = j10;
        this.f22871g = looper;
        this.f22867c = dVar;
        this.f22872h = i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[SYNTHETIC, Splitter:B:18:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f22875k     // Catch:{ all -> 0x003a }
            t3.C5950a.g(r0)     // Catch:{ all -> 0x003a }
            android.os.Looper r0 = r5.f22871g     // Catch:{ all -> 0x003a }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x003a }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003a }
            if (r0 == r1) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            t3.C5950a.g(r0)     // Catch:{ all -> 0x003a }
            t3.d r0 = r5.f22867c     // Catch:{ all -> 0x003a }
            long r0 = r0.c()     // Catch:{ all -> 0x003a }
            long r0 = r0 + r6
        L_0x001f:
            boolean r2 = r5.f22877m     // Catch:{ all -> 0x003a }
            if (r2 != 0) goto L_0x003c
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x003c
            t3.d r2 = r5.f22867c     // Catch:{ all -> 0x003a }
            r2.f()     // Catch:{ all -> 0x003a }
            r5.wait(r6)     // Catch:{ all -> 0x003a }
            t3.d r6 = r5.f22867c     // Catch:{ all -> 0x003a }
            long r6 = r6.c()     // Catch:{ all -> 0x003a }
            long r6 = r0 - r6
            goto L_0x001f
        L_0x003a:
            r6 = move-exception
            goto L_0x004a
        L_0x003c:
            if (r2 == 0) goto L_0x0042
            boolean r6 = r5.f22876l     // Catch:{ all -> 0x003a }
            monitor-exit(r5)
            return r6
        L_0x0042:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x003a }
            java.lang.String r7 = "Message delivery timed out."
            r6.<init>(r7)     // Catch:{ all -> 0x003a }
            throw r6     // Catch:{ all -> 0x003a }
        L_0x004a:
            monitor-exit(r5)     // Catch:{ all -> 0x003a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.s0.a(long):boolean");
    }

    public boolean b() {
        return this.f22874j;
    }

    public Looper c() {
        return this.f22871g;
    }

    public int d() {
        return this.f22872h;
    }

    public Object e() {
        return this.f22870f;
    }

    public long f() {
        return this.f22873i;
    }

    public b g() {
        return this.f22865a;
    }

    public J h() {
        return this.f22868d;
    }

    public int i() {
        return this.f22869e;
    }

    public synchronized boolean j() {
        return this.f22878n;
    }

    public synchronized void k(boolean z10) {
        this.f22876l = z10 | this.f22876l;
        this.f22877m = true;
        notifyAll();
    }

    public s0 l() {
        C5950a.g(!this.f22875k);
        if (this.f22873i == -9223372036854775807L) {
            C5950a.a(this.f22874j);
        }
        this.f22875k = true;
        this.f22866b.d(this);
        return this;
    }

    public s0 m(Object obj) {
        C5950a.g(!this.f22875k);
        this.f22870f = obj;
        return this;
    }

    public s0 n(int i10) {
        C5950a.g(!this.f22875k);
        this.f22869e = i10;
        return this;
    }
}
