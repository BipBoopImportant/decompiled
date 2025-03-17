package C3;

import A3.v1;
import C3.C6407A;
import C3.C6422m;
import C3.t;
import G3.C6477A;
import G3.C6503x;
import J3.j;
import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import q3.C5797h;
import q3.C5803n;
import t3.C5950a;
import t3.C5957h;
import t3.C5958i;
import t3.N;
import t3.q;

/* renamed from: C3.g  reason: case insensitive filesystem */
class C6416g implements C6422m {

    /* renamed from: a  reason: collision with root package name */
    public final List<C5803n.b> f33577a;

    /* renamed from: b  reason: collision with root package name */
    private final C6407A f33578b;

    /* renamed from: c  reason: collision with root package name */
    private final a f33579c;

    /* renamed from: d  reason: collision with root package name */
    private final b f33580d;

    /* renamed from: e  reason: collision with root package name */
    private final int f33581e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f33582f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f33583g;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, String> f33584h;

    /* renamed from: i  reason: collision with root package name */
    private final C5958i<t.a> f33585i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final j f33586j;

    /* renamed from: k  reason: collision with root package name */
    private final v1 f33587k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final M f33588l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final UUID f33589m;

    /* renamed from: n  reason: collision with root package name */
    private final Looper f33590n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final e f33591o;

    /* renamed from: p  reason: collision with root package name */
    private int f33592p;

    /* renamed from: q  reason: collision with root package name */
    private int f33593q;

    /* renamed from: r  reason: collision with root package name */
    private HandlerThread f33594r;

    /* renamed from: s  reason: collision with root package name */
    private c f33595s;

    /* renamed from: t  reason: collision with root package name */
    private y3.b f33596t;

    /* renamed from: u  reason: collision with root package name */
    private C6422m.a f33597u;

    /* renamed from: v  reason: collision with root package name */
    private byte[] f33598v;

    /* renamed from: w  reason: collision with root package name */
    private byte[] f33599w;

    /* renamed from: x  reason: collision with root package name */
    private C6407A.a f33600x;

    /* renamed from: y  reason: collision with root package name */
    private C6407A.d f33601y;

    /* renamed from: C3.g$a */
    public interface a {
        void a(Exception exc, boolean z10);

        void b(C6416g gVar);

        void c();
    }

    /* renamed from: C3.g$b */
    public interface b {
        void a(C6416g gVar, int i10);

        void b(C6416g gVar, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: C3.g$c */
    private class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f33602a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, N n10) {
            N n11 = n10;
            d dVar = (d) message.obj;
            if (!dVar.f33605b) {
                return false;
            }
            int i10 = dVar.f33608e + 1;
            dVar.f33608e = i10;
            if (i10 > C6416g.this.f33586j.b(3)) {
                return false;
            }
            long a10 = C6416g.this.f33586j.a(new j.a(new C6503x(dVar.f33604a, n11.f33570a, n11.f33571b, n11.f33572c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f33606c, n11.f33573d), new C6477A(3), n10.getCause() instanceof IOException ? (IOException) n10.getCause() : new f(n10.getCause()), dVar.f33608e));
            if (a10 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f33602a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), a10);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C6503x.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages((Object) null);
            this.f33602a = true;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: C3.N} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: C3.N} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: C3.N} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r6.obj
                C3.g$d r0 = (C3.C6416g.d) r0
                int r1 = r6.what     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                r2 = 1
                if (r1 == r2) goto L_0x002b
                r2 = 2
                if (r1 != r2) goto L_0x0025
                C3.g r1 = C3.C6416g.this     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                C3.M r1 = r1.f33588l     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                C3.g r2 = C3.C6416g.this     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                java.util.UUID r2 = r2.f33589m     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                java.lang.Object r3 = r0.f33607d     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                C3.A$a r3 = (C3.C6407A.a) r3     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                byte[] r1 = r1.b(r2, r3)     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                goto L_0x004f
            L_0x0021:
                r1 = move-exception
                goto L_0x0040
            L_0x0023:
                r1 = move-exception
                goto L_0x0048
            L_0x0025:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                r1.<init>()     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                throw r1     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
            L_0x002b:
                C3.g r1 = C3.C6416g.this     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                C3.M r1 = r1.f33588l     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                C3.g r2 = C3.C6416g.this     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                java.util.UUID r2 = r2.f33589m     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                java.lang.Object r3 = r0.f33607d     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                C3.A$d r3 = (C3.C6407A.d) r3     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                byte[] r1 = r1.a(r2, r3)     // Catch:{ N -> 0x0023, Exception -> 0x0021 }
                goto L_0x004f
            L_0x0040:
                java.lang.String r2 = "DefaultDrmSession"
                java.lang.String r3 = "Key/provisioning request produced an unexpected exception. Not retrying."
                t3.q.i(r2, r3, r1)
                goto L_0x004f
            L_0x0048:
                boolean r2 = r5.a(r6, r1)
                if (r2 == 0) goto L_0x004f
                return
            L_0x004f:
                C3.g r2 = C3.C6416g.this
                J3.j r2 = r2.f33586j
                long r3 = r0.f33604a
                r2.c(r3)
                monitor-enter(r5)
                boolean r2 = r5.f33602a     // Catch:{ all -> 0x0075 }
                if (r2 != 0) goto L_0x0077
                C3.g r2 = C3.C6416g.this     // Catch:{ all -> 0x0075 }
                C3.g$e r2 = r2.f33591o     // Catch:{ all -> 0x0075 }
                int r6 = r6.what     // Catch:{ all -> 0x0075 }
                java.lang.Object r0 = r0.f33607d     // Catch:{ all -> 0x0075 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0075 }
                android.os.Message r6 = r2.obtainMessage(r6, r0)     // Catch:{ all -> 0x0075 }
                r6.sendToTarget()     // Catch:{ all -> 0x0075 }
                goto L_0x0077
            L_0x0075:
                r6 = move-exception
                goto L_0x0079
            L_0x0077:
                monitor-exit(r5)     // Catch:{ all -> 0x0075 }
                return
            L_0x0079:
                monitor-exit(r5)     // Catch:{ all -> 0x0075 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: C3.C6416g.c.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: C3.g$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f33604a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33605b;

        /* renamed from: c  reason: collision with root package name */
        public final long f33606c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f33607d;

        /* renamed from: e  reason: collision with root package name */
        public int f33608e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f33604a = j10;
            this.f33605b = z10;
            this.f33606c = j11;
            this.f33607d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: C3.g$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                C6416g.this.F(obj, obj2);
            } else if (i10 == 2) {
                C6416g.this.z(obj, obj2);
            }
        }
    }

    /* renamed from: C3.g$f */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public C6416g(UUID uuid, C6407A a10, a aVar, b bVar, List<C5803n.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, M m10, Looper looper, j jVar, v1 v1Var) {
        if (i10 == 1 || i10 == 3) {
            C5950a.e(bArr);
        }
        this.f33589m = uuid;
        this.f33579c = aVar;
        this.f33580d = bVar;
        this.f33578b = a10;
        this.f33581e = i10;
        this.f33582f = z10;
        this.f33583g = z11;
        if (bArr != null) {
            this.f33599w = bArr;
            this.f33577a = null;
        } else {
            this.f33577a = Collections.unmodifiableList((List) C5950a.e(list));
        }
        this.f33584h = hashMap;
        this.f33588l = m10;
        this.f33585i = new C5958i<>();
        this.f33586j = jVar;
        this.f33587k = v1Var;
        this.f33592p = 2;
        this.f33590n = looper;
        this.f33591o = new e(looper);
    }

    private void A(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || x.d(th2)) {
            this.f33579c.b(this);
        } else {
            y(th2, z10 ? 1 : 2);
        }
    }

    private void B() {
        if (this.f33581e == 0 && this.f33592p == 4) {
            N.i(this.f33598v);
            s(false);
        }
    }

    /* access modifiers changed from: private */
    public void F(Object obj, Object obj2) {
        if (obj != this.f33601y) {
            return;
        }
        if (this.f33592p == 2 || v()) {
            this.f33601y = null;
            if (obj2 instanceof Exception) {
                this.f33579c.a((Exception) obj2, false);
                return;
            }
            try {
                this.f33578b.f((byte[]) obj2);
                this.f33579c.c();
            } catch (Exception e10) {
                this.f33579c.a(e10, true);
            }
        }
    }

    private boolean G() {
        if (v()) {
            return true;
        }
        try {
            byte[] d10 = this.f33578b.d();
            this.f33598v = d10;
            this.f33578b.h(d10, this.f33587k);
            this.f33596t = this.f33578b.i(this.f33598v);
            this.f33592p = 3;
            r(new C6411b(3));
            C5950a.e(this.f33598v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f33579c.b(this);
            return false;
        } catch (Exception | NoSuchMethodError e10) {
            if (x.d(e10)) {
                this.f33579c.b(this);
                return false;
            }
            y(e10, 1);
            return false;
        }
    }

    private void H(byte[] bArr, int i10, boolean z10) {
        try {
            this.f33600x = this.f33578b.m(bArr, this.f33577a, i10, this.f33584h);
            ((c) N.i(this.f33595s)).b(2, C5950a.e(this.f33600x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            A(e10, true);
        }
    }

    private boolean J() {
        try {
            this.f33578b.e(this.f33598v, this.f33599w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, 1);
            return false;
        }
    }

    private void K() {
        if (Thread.currentThread() != this.f33590n.getThread()) {
            q.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f33590n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(C5957h<t.a> hVar) {
        for (t.a accept : this.f33585i.I1()) {
            hVar.accept(accept);
        }
    }

    private void s(boolean z10) {
        if (!this.f33583g) {
            byte[] bArr = (byte[]) N.i(this.f33598v);
            int i10 = this.f33581e;
            if (i10 == 0 || i10 == 1) {
                if (this.f33599w == null) {
                    H(bArr, 1, z10);
                } else if (this.f33592p == 4 || J()) {
                    long t10 = t();
                    if (this.f33581e == 0 && t10 <= 60) {
                        q.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + t10);
                        H(bArr, 2, z10);
                    } else if (t10 <= 0) {
                        y(new L(), 2);
                    } else {
                        this.f33592p = 4;
                        r(new C6415f());
                    }
                }
            } else if (i10 != 2) {
                if (i10 == 3) {
                    C5950a.e(this.f33599w);
                    C5950a.e(this.f33598v);
                    H(this.f33599w, 3, z10);
                }
            } else if (this.f33599w == null || J()) {
                H(bArr, 2, z10);
            }
        }
    }

    private long t() {
        if (!C5797h.f28132d.equals(this.f33589m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C5950a.e(P.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f33592p;
        return i10 == 3 || i10 == 4;
    }

    private void y(Throwable th2, int i10) {
        this.f33597u = new C6422m.a(th2, x.b(th2, i10));
        q.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            r(new C6414e(th2));
        } else if (!(th2 instanceof Error)) {
            throw new IllegalStateException("Unexpected Throwable subclass", th2);
        } else if (!x.e(th2) && !x.d(th2)) {
            throw ((Error) th2);
        }
        if (this.f33592p != 4) {
            this.f33592p = 1;
        }
    }

    /* access modifiers changed from: private */
    public void z(Object obj, Object obj2) {
        if (obj == this.f33600x && v()) {
            this.f33600x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                A((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f33581e == 3) {
                    this.f33578b.l((byte[]) N.i(this.f33599w), bArr);
                    r(new C6412c());
                    return;
                }
                byte[] l10 = this.f33578b.l(this.f33598v, bArr);
                int i10 = this.f33581e;
                if (!((i10 != 2 && (i10 != 0 || this.f33599w == null)) || l10 == null || l10.length == 0)) {
                    this.f33599w = l10;
                }
                this.f33592p = 4;
                r(new C6413d());
            } catch (Exception e10) {
                e = e10;
                A(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                A(e, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void C(int i10) {
        if (i10 == 2) {
            B();
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        if (G()) {
            s(true);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(Exception exc, boolean z10) {
        y(exc, z10 ? 1 : 3);
    }

    /* access modifiers changed from: package-private */
    public void I() {
        this.f33601y = this.f33578b.c();
        ((c) N.i(this.f33595s)).b(1, C5950a.e(this.f33601y), true);
    }

    public final UUID a() {
        K();
        return this.f33589m;
    }

    public void b(t.a aVar) {
        K();
        boolean z10 = false;
        if (this.f33593q < 0) {
            q.c("DefaultDrmSession", "Session reference count less than zero: " + this.f33593q);
            this.f33593q = 0;
        }
        if (aVar != null) {
            this.f33585i.b(aVar);
        }
        int i10 = this.f33593q + 1;
        this.f33593q = i10;
        if (i10 == 1) {
            if (this.f33592p == 2) {
                z10 = true;
            }
            C5950a.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f33594r = handlerThread;
            handlerThread.start();
            this.f33595s = new c(this.f33594r.getLooper());
            if (G()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f33585i.i(aVar) == 1) {
            aVar.k(this.f33592p);
        }
        this.f33580d.b(this, this.f33593q);
    }

    public void c(t.a aVar) {
        K();
        int i10 = this.f33593q;
        if (i10 <= 0) {
            q.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f33593q = i11;
        if (i11 == 0) {
            this.f33592p = 0;
            ((e) N.i(this.f33591o)).removeCallbacksAndMessages((Object) null);
            ((c) N.i(this.f33595s)).c();
            this.f33595s = null;
            ((HandlerThread) N.i(this.f33594r)).quit();
            this.f33594r = null;
            this.f33596t = null;
            this.f33597u = null;
            this.f33600x = null;
            this.f33601y = null;
            byte[] bArr = this.f33598v;
            if (bArr != null) {
                this.f33578b.k(bArr);
                this.f33598v = null;
            }
        }
        if (aVar != null) {
            this.f33585i.j(aVar);
            if (this.f33585i.i(aVar) == 0) {
                aVar.m();
            }
        }
        this.f33580d.a(this, this.f33593q);
    }

    public boolean d() {
        K();
        return this.f33582f;
    }

    public final C6422m.a f() {
        K();
        if (this.f33592p == 1) {
            return this.f33597u;
        }
        return null;
    }

    public final y3.b g() {
        K();
        return this.f33596t;
    }

    public final int getState() {
        K();
        return this.f33592p;
    }

    public Map<String, String> h() {
        K();
        byte[] bArr = this.f33598v;
        if (bArr == null) {
            return null;
        }
        return this.f33578b.b(bArr);
    }

    public boolean i(String str) {
        K();
        return this.f33578b.j((byte[]) C5950a.i(this.f33598v), str);
    }

    public boolean u(byte[] bArr) {
        K();
        return Arrays.equals(this.f33598v, bArr);
    }
}
