package WK;

import XH.C16807N;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"LWK/c;", "LWK/O;", "<init>", "()V", "", "now", "y", "(J)J", "LXH/N;", "v", "", "w", "()Z", "B", "LWK/L;", "sink", "z", "(LWK/L;)LWK/L;", "LWK/N;", "source", "A", "(LWK/N;)LWK/N;", "Ljava/io/IOException;", "cause", "p", "(Ljava/io/IOException;)Ljava/io/IOException;", "x", "", "f", "I", "state", "g", "LWK/c;", "next", "h", "J", "timeoutAt", "i", "b", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WK.c  reason: case insensitive filesystem */
public class C16768c extends O {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final a f139640i = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final ReentrantLock f139641j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final Condition f139642k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final long f139643l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final long f139644m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static C16768c f139645n;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f139646f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C16768c f139647g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f139648h;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"LWK/c$a;", "", "<init>", "()V", "LWK/c;", "node", "", "timeoutNanos", "", "hasDeadline", "LXH/N;", "f", "(LWK/c;JZ)V", "g", "(LWK/c;)V", "c", "()LWK/c;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "d", "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", "I", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "head", "LWK/c;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void f(C16768c cVar, long j10, boolean z10) {
            if (C16768c.f139645n == null) {
                C16768c.f139645n = new C16768c();
                new b().start();
            }
            long nanoTime = System.nanoTime();
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 != 0 && z10) {
                cVar.f139648h = Math.min(j10, cVar.c() - nanoTime) + nanoTime;
            } else if (i10 != 0) {
                cVar.f139648h = j10 + nanoTime;
            } else if (z10) {
                cVar.f139648h = cVar.c();
            } else {
                throw new AssertionError();
            }
            long q10 = cVar.y(nanoTime);
            C16768c k10 = C16768c.f139645n;
            C17542s.g(k10);
            while (k10.f139647g != null) {
                C16768c o10 = k10.f139647g;
                C17542s.g(o10);
                if (q10 < o10.y(nanoTime)) {
                    break;
                }
                k10 = k10.f139647g;
                C17542s.g(k10);
            }
            cVar.f139647g = k10.f139647g;
            k10.f139647g = cVar;
            if (k10 == C16768c.f139645n) {
                d().signal();
            }
        }

        /* access modifiers changed from: private */
        public final void g(C16768c cVar) {
            for (C16768c k10 = C16768c.f139645n; k10 != null; k10 = k10.f139647g) {
                if (k10.f139647g == cVar) {
                    k10.f139647g = cVar.f139647g;
                    cVar.f139647g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C16768c c() {
            C16768c k10 = C16768c.f139645n;
            C17542s.g(k10);
            C16768c o10 = k10.f139647g;
            if (o10 == null) {
                long nanoTime = System.nanoTime();
                d().await(C16768c.f139643l, TimeUnit.MILLISECONDS);
                C16768c k11 = C16768c.f139645n;
                C17542s.g(k11);
                if (k11.f139647g != null || System.nanoTime() - nanoTime < C16768c.f139644m) {
                    return null;
                }
                return C16768c.f139645n;
            }
            long q10 = o10.y(System.nanoTime());
            if (q10 > 0) {
                d().await(q10, TimeUnit.NANOSECONDS);
                return null;
            }
            C16768c k12 = C16768c.f139645n;
            C17542s.g(k12);
            k12.f139647g = o10.f139647g;
            o10.f139647g = null;
            o10.f139646f = 2;
            return o10;
        }

        public final Condition d() {
            return C16768c.f139642k;
        }

        public final ReentrantLock e() {
            return C16768c.f139641j;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"LWK/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "LXH/N;", "run", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|(5:5|6|7|19|8)(5:10|11|12|13|(2:15|23)(1:22))|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            r0.unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:18:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                WK.c$a r0 = WK.C16768c.f139640i     // Catch:{ InterruptedException -> 0x0000 }
                java.util.concurrent.locks.ReentrantLock r0 = r0.e()     // Catch:{ InterruptedException -> 0x0000 }
                r0.lock()     // Catch:{ InterruptedException -> 0x0000 }
                WK.c$a r1 = WK.C16768c.f139640i     // Catch:{ all -> 0x0024 }
                WK.c r1 = r1.c()     // Catch:{ all -> 0x0024 }
                WK.c r2 = WK.C16768c.f139645n     // Catch:{ all -> 0x0024 }
                if (r1 != r2) goto L_0x0026
                WK.C16768c.a unused = WK.C16768c.f139640i     // Catch:{ all -> 0x0024 }
                r1 = 0
                WK.C16768c.f139645n = r1     // Catch:{ all -> 0x0024 }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0024:
                r1 = move-exception
                goto L_0x0031
            L_0x0026:
                XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0024 }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.B()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0031:
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: WK.C16768c.b.run():void");
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"WK/c$c", "LWK/L;", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "close", "LWK/c;", "c", "()LWK/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.c$c  reason: collision with other inner class name */
    public static final class C3427c implements L {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16768c f139649a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ L f139650b;

        C3427c(C16768c cVar, L l10) {
            this.f139649a = cVar;
            this.f139650b = l10;
        }

        /* renamed from: c */
        public C16768c y() {
            return this.f139649a;
        }

        public void close() {
            C16768c cVar = this.f139649a;
            L l10 = this.f139650b;
            cVar.v();
            try {
                l10.close();
                C16807N n10 = C16807N.f139792a;
                if (cVar.w()) {
                    throw cVar.p((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }

        public void flush() {
            C16768c cVar = this.f139649a;
            L l10 = this.f139650b;
            cVar.v();
            try {
                l10.flush();
                C16807N n10 = C16807N.f139792a;
                if (cVar.w()) {
                    throw cVar.p((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }

        public void s3(C16770e eVar, long j10) {
            C17542s.j(eVar, "source");
            C16767b.b(eVar.size(), 0, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    I i10 = eVar.f139653a;
                    C17542s.g(i10);
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += (long) (i10.f139612c - i10.f139611b);
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            i10 = i10.f139615f;
                            C17542s.g(i10);
                        }
                    }
                    C16768c cVar = this.f139649a;
                    L l10 = this.f139650b;
                    cVar.v();
                    try {
                        l10.s3(eVar, j11);
                        C16807N n10 = C16807N.f139792a;
                        if (!cVar.w()) {
                            j10 -= j11;
                        } else {
                            throw cVar.p((IOException) null);
                        }
                    } catch (IOException e10) {
                        e = e10;
                        if (cVar.w()) {
                            e = cVar.p(e);
                        }
                        throw e;
                    } finally {
                        cVar.w();
                    }
                } else {
                    return;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f139650b + ')';
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"WK/c$d", "LWK/N;", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LXH/N;", "close", "()V", "LWK/c;", "c", "()LWK/c;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: WK.c$d */
    public static final class d implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16768c f139651a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f139652b;

        d(C16768c cVar, N n10) {
            this.f139651a = cVar;
            this.f139652b = n10;
        }

        /* renamed from: c */
        public C16768c y() {
            return this.f139651a;
        }

        public void close() {
            C16768c cVar = this.f139651a;
            N n10 = this.f139652b;
            cVar.v();
            try {
                n10.close();
                C16807N n11 = C16807N.f139792a;
                if (cVar.w()) {
                    throw cVar.p((IOException) null);
                }
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f139652b + ')';
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            C16768c cVar = this.f139651a;
            N n10 = this.f139652b;
            cVar.v();
            try {
                long u02 = n10.u0(eVar, j10);
                if (!cVar.w()) {
                    return u02;
                }
                throw cVar.p((IOException) null);
            } catch (IOException e10) {
                e = e10;
                if (cVar.w()) {
                    e = cVar.p(e);
                }
                throw e;
            } finally {
                cVar.w();
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f139641j = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        C17542s.i(newCondition, "newCondition(...)");
        f139642k = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60);
        f139643l = millis;
        f139644m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* access modifiers changed from: private */
    public final long y(long j10) {
        return this.f139648h - j10;
    }

    public final N A(N n10) {
        C17542s.j(n10, "source");
        return new d(this, n10);
    }

    /* access modifiers changed from: protected */
    public void B() {
    }

    public final IOException p(IOException iOException) {
        return x(iOException);
    }

    public final void v() {
        long h10 = h();
        boolean e10 = e();
        if (h10 != 0 || e10) {
            ReentrantLock reentrantLock = f139641j;
            reentrantLock.lock();
            try {
                if (this.f139646f == 0) {
                    this.f139646f = 1;
                    f139640i.f(this, h10, e10);
                    C16807N n10 = C16807N.f139792a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit");
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean w() {
        ReentrantLock reentrantLock = f139641j;
        reentrantLock.lock();
        try {
            int i10 = this.f139646f;
            boolean z10 = false;
            this.f139646f = 0;
            if (i10 == 1) {
                f139640i.g(this);
                return false;
            }
            if (i10 == 2) {
                z10 = true;
            }
            reentrantLock.unlock();
            return z10;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public IOException x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final L z(L l10) {
        C17542s.j(l10, "sink");
        return new C3427c(this, l10);
    }
}
