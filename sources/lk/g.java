package LK;

import GK.C15778F;
import GK.C15782a;
import HK.C15864d;
import KK.C15993a;
import KK.C15996d;
import KK.e;
import LK.e;
import QK.C16354j;
import XH.C16807N;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001+\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/¨\u00061"}, d2 = {"LLK/g;", "", "LKK/e;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(LKK/e;IJLjava/util/concurrent/TimeUnit;)V", "LLK/f;", "connection", "now", "e", "(LLK/f;J)I", "LGK/a;", "address", "LLK/e;", "call", "", "LGK/F;", "routes", "", "requireMultiplexed", "a", "(LGK/a;LLK/e;Ljava/util/List;Z)Z", "LXH/N;", "f", "(LLK/f;)V", "c", "(LLK/f;)Z", "d", "()V", "b", "(J)J", "I", "J", "keepAliveDurationNs", "LKK/d;", "LKK/d;", "cleanupQueue", "LK/g$b", "LLK/g$b;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f136198f = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f136199a;

    /* renamed from: b  reason: collision with root package name */
    private final long f136200b;

    /* renamed from: c  reason: collision with root package name */
    private final C15996d f136201c;

    /* renamed from: d  reason: collision with root package name */
    private final b f136202d = new b(this, C15864d.f135364i + " ConnectionPool");

    /* renamed from: e  reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f136203e = new ConcurrentLinkedQueue<>();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLK/g$a;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LK/g$b", "LKK/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends C15993a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f136204e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, String str) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f136204e = gVar;
        }

        public long f() {
            return this.f136204e.b(System.nanoTime());
        }
    }

    public g(e eVar, int i10, long j10, TimeUnit timeUnit) {
        C17542s.j(eVar, "taskRunner");
        C17542s.j(timeUnit, "timeUnit");
        this.f136199a = i10;
        this.f136200b = timeUnit.toNanos(j10);
        this.f136201c = eVar.i();
        if (j10 <= 0) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
        }
    }

    private final int e(f fVar, long j10) {
        if (!C15864d.f135363h || Thread.holdsLock(fVar)) {
            List<Reference<e>> q10 = fVar.q();
            int i10 = 0;
            while (i10 < q10.size()) {
                Reference reference = q10.get(i10);
                if (reference.get() != null) {
                    i10++;
                } else {
                    C17542s.h(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                    C16354j.f137719a.g().m("A connection to " + fVar.C().a().l() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                    q10.remove(i10);
                    fVar.F(true);
                    if (q10.isEmpty()) {
                        fVar.E(j10 - this.f136200b);
                        return 0;
                    }
                }
            }
            return q10.size();
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    public final boolean a(C15782a aVar, e eVar, List<C15778F> list, boolean z10) {
        C17542s.j(aVar, PlaceTypes.ADDRESS);
        C17542s.j(eVar, "call");
        Iterator<f> it = this.f136203e.iterator();
        while (it.hasNext()) {
            f next = it.next();
            C17542s.i(next, "connection");
            synchronized (next) {
                if (z10) {
                    try {
                        if (next.x()) {
                        }
                        C16807N n10 = C16807N.f139792a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (next.v(aVar, list)) {
                    eVar.c(next);
                    return true;
                }
                C16807N n102 = C16807N.f139792a;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        HK.C15864d.n(r4.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        if (r11.f136203e.isEmpty() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0088, code lost:
        r11.f136201c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(long r12) {
        /*
            r11 = this;
            r0 = 1
            java.util.concurrent.ConcurrentLinkedQueue<LK.f> r1 = r11.f136203e
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = -9223372036854775808
            r5 = r4
            r4 = r3
            r3 = r2
        L_0x000e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r1.next()
            LK.f r7 = (LK.f) r7
            java.lang.String r8 = "connection"
            kotlin.jvm.internal.C17542s.i(r7, r8)
            monitor-enter(r7)
            int r8 = r11.e(r7, r12)     // Catch:{ all -> 0x0039 }
            if (r8 <= 0) goto L_0x0028
            int r3 = r3 + r0
            goto L_0x0037
        L_0x0028:
            int r2 = r2 + r0
            long r8 = r7.r()     // Catch:{ all -> 0x0039 }
            long r8 = r12 - r8
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L_0x0035
            r4 = r7
            r5 = r8
        L_0x0035:
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r7)
            goto L_0x000e
        L_0x0039:
            r12 = move-exception
            monitor-exit(r7)
            throw r12
        L_0x003c:
            long r7 = r11.f136200b
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0051
            int r1 = r11.f136199a
            if (r2 <= r1) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            if (r2 <= 0) goto L_0x004b
            long r7 = r7 - r5
            return r7
        L_0x004b:
            if (r3 <= 0) goto L_0x004e
            return r7
        L_0x004e:
            r12 = -1
            return r12
        L_0x0051:
            kotlin.jvm.internal.C17542s.g(r4)
            monitor-enter(r4)
            java.util.List r1 = r4.q()     // Catch:{ all -> 0x008e }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x008e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x008e }
            r2 = 0
            if (r1 != 0) goto L_0x0065
            monitor-exit(r4)
            return r2
        L_0x0065:
            long r7 = r4.r()     // Catch:{ all -> 0x008e }
            long r7 = r7 + r5
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0070
            monitor-exit(r4)
            return r2
        L_0x0070:
            r4.F(r0)     // Catch:{ all -> 0x008e }
            java.util.concurrent.ConcurrentLinkedQueue<LK.f> r12 = r11.f136203e     // Catch:{ all -> 0x008e }
            r12.remove(r4)     // Catch:{ all -> 0x008e }
            monitor-exit(r4)
            java.net.Socket r12 = r4.c()
            HK.C15864d.n(r12)
            java.util.concurrent.ConcurrentLinkedQueue<LK.f> r12 = r11.f136203e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x008d
            KK.d r12 = r11.f136201c
            r12.a()
        L_0x008d:
            return r2
        L_0x008e:
            r12 = move-exception
            monitor-exit(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: LK.g.b(long):long");
    }

    public final boolean c(f fVar) {
        C17542s.j(fVar, "connection");
        if (C15864d.f135363h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        } else if (fVar.s() || this.f136199a == 0) {
            fVar.F(true);
            this.f136203e.remove(fVar);
            if (this.f136203e.isEmpty()) {
                this.f136201c.a();
            }
            return true;
        } else {
            C15996d.j(this.f136201c, this.f136202d, 0, 2, (Object) null);
            return false;
        }
    }

    public final void d() {
        Socket socket;
        Iterator<f> it = this.f136203e.iterator();
        C17542s.i(it, "connections.iterator()");
        while (it.hasNext()) {
            f next = it.next();
            C17542s.i(next, "connection");
            synchronized (next) {
                if (next.q().isEmpty()) {
                    it.remove();
                    next.F(true);
                    socket = next.c();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                C15864d.n(socket);
            }
        }
        if (this.f136203e.isEmpty()) {
            this.f136201c.a();
        }
    }

    public final void f(f fVar) {
        C17542s.j(fVar, "connection");
        if (!C15864d.f135363h || Thread.holdsLock(fVar)) {
            this.f136203e.add(fVar);
            C15996d.j(this.f136201c, this.f136202d, 0, 2, (Object) null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }
}
