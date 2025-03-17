package LK;

import GK.C15774B;
import GK.C15776D;
import GK.C15782a;
import GK.C15786e;
import GK.C15787f;
import GK.C15788g;
import GK.C15797p;
import GK.C15799r;
import GK.C15803v;
import GK.z;
import HK.C15864d;
import MK.g;
import QK.C16354j;
import WK.C16768c;
import XH.C16807N;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001W\u0018\u00002\u00020\u0001:\u0002FJB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\fJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\"H\u0000¢\u0006\u0004\b)\u0010$J\u001d\u0010,\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J;\u0010:\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u00107\u001a\u0002002\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00010\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b<\u0010\u0010J\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\n¢\u0006\u0004\b@\u0010\fJ\u0017\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010!J\u000f\u0010E\u001a\u00020\u0018H\u0000¢\u0006\u0004\bE\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010M\u001a\u0004\bN\u0010!R\u0014\u0010Q\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010PR\u001a\u0010V\u001a\u00020R8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010a\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR(\u00104\u001a\u0004\u0018\u0001032\b\u0010f\u001a\u0004\u0018\u0001038\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010MR(\u0010n\u001a\u0004\u0018\u0001002\b\u0010f\u001a\u0004\u0018\u0001008\u0000@BX\u000e¢\u0006\f\n\u0004\bB\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010o\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010MR\u0016\u0010p\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010MR\u0016\u0010q\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010MR\u0016\u0010r\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bN\u0010MR\u0018\u00107\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010kR$\u0010u\u001a\u0004\u0018\u0001038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bl\u0010g\u001a\u0004\bt\u0010i\"\u0004\b\u000e\u00106¨\u0006v"}, d2 = {"LLK/e;", "LGK/e;", "LGK/z;", "client", "LGK/B;", "originalRequest", "", "forWebSocket", "<init>", "(LGK/z;LGK/B;Z)V", "LXH/N;", "e", "()V", "Ljava/io/IOException;", "E", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "H", "LGK/v;", "url", "LGK/a;", "j", "(LGK/v;)LGK/a;", "", "I", "()Ljava/lang/String;", "f", "()LLK/e;", "t", "()LGK/B;", "cancel", "J", "()Z", "LGK/D;", "execute", "()LGK/D;", "LGK/f;", "responseCallback", "N0", "(LGK/f;)V", "v", "request", "newExchangeFinder", "k", "(LGK/B;Z)V", "LMK/g;", "chain", "LLK/c;", "w", "(LMK/g;)LLK/c;", "LLK/f;", "connection", "c", "(LLK/f;)V", "exchange", "requestDone", "responseDone", "y", "(LLK/c;ZZLjava/io/IOException;)Ljava/io/IOException;", "z", "Ljava/net/Socket;", "C", "()Ljava/net/Socket;", "G", "closeExchange", "l", "(Z)V", "D", "A", "a", "LGK/z;", "m", "()LGK/z;", "b", "LGK/B;", "u", "Z", "p", "LLK/g;", "LLK/g;", "connectionPool", "LGK/r;", "LGK/r;", "o", "()LGK/r;", "eventListener", "LK/e$c", "LLK/e$c;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "h", "Ljava/lang/Object;", "callStackTrace", "LLK/d;", "i", "LLK/d;", "exchangeFinder", "<set-?>", "LLK/f;", "n", "()LLK/f;", "timeoutEarlyExit", "LLK/c;", "r", "()LLK/c;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "canceled", "q", "getConnectionToCancel", "connectionToCancel", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements C15786e {

    /* renamed from: a  reason: collision with root package name */
    private final z f136151a;

    /* renamed from: b  reason: collision with root package name */
    private final C15774B f136152b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f136153c;

    /* renamed from: d  reason: collision with root package name */
    private final g f136154d;

    /* renamed from: e  reason: collision with root package name */
    private final C15799r f136155e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final c f136156f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f136157g = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    private Object f136158h;

    /* renamed from: i  reason: collision with root package name */
    private d f136159i;

    /* renamed from: j  reason: collision with root package name */
    private f f136160j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f136161k;

    /* renamed from: l  reason: collision with root package name */
    private c f136162l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f136163m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f136164n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f136165o = true;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f136166p;

    /* renamed from: q  reason: collision with root package name */
    private volatile c f136167q;

    /* renamed from: r  reason: collision with root package name */
    private volatile f f136168r;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"LLK/e$a;", "Ljava/lang/Runnable;", "LGK/f;", "responseCallback", "<init>", "(LLK/e;LGK/f;)V", "LLK/e;", "other", "LXH/N;", "e", "(LLK/e$a;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "a", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "LGK/f;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "d", "()Ljava/lang/String;", "host", "()LLK/e;", "call", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C15787f f136169a;

        /* renamed from: b  reason: collision with root package name */
        private volatile AtomicInteger f136170b = new AtomicInteger(0);

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f136171c;

        public a(e eVar, C15787f fVar) {
            C17542s.j(fVar, "responseCallback");
            this.f136171c = eVar;
            this.f136169a = fVar;
        }

        public final void a(ExecutorService executorService) {
            C17542s.j(executorService, "executorService");
            C15797p u10 = this.f136171c.m().u();
            if (!C15864d.f135363h || !Thread.holdsLock(u10)) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f136171c.z(interruptedIOException);
                    this.f136169a.c(this.f136171c, interruptedIOException);
                    this.f136171c.m().u().f(this);
                } catch (Throwable th2) {
                    this.f136171c.m().u().f(this);
                    throw th2;
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + u10);
            }
        }

        public final e b() {
            return this.f136171c;
        }

        public final AtomicInteger c() {
            return this.f136170b;
        }

        public final String d() {
            return this.f136171c.u().k().i();
        }

        public final void e(a aVar) {
            C17542s.j(aVar, "other");
            this.f136170b = aVar.f136170b;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009b A[Catch:{ all -> 0x0072, all -> 0x0043 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                LK.e r1 = r8.f136171c
                java.lang.String r1 = r1.A()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                LK.e r1 = r8.f136171c
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r3 = r2.getName()
                r2.setName(r0)
                LK.e$c r0 = r1.f136156f     // Catch:{ all -> 0x0043 }
                r0.v()     // Catch:{ all -> 0x0043 }
                r0 = 0
                GK.D r0 = r1.v()     // Catch:{ IOException -> 0x0075, all -> 0x004a }
                r4 = 1
                GK.f r5 = r8.f136169a     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
                r5.e(r1, r0)     // Catch:{ IOException -> 0x0048, all -> 0x0046 }
                GK.z r0 = r1.m()     // Catch:{ all -> 0x0043 }
                GK.p r0 = r0.u()     // Catch:{ all -> 0x0043 }
            L_0x003e:
                r0.f(r8)     // Catch:{ all -> 0x0043 }
                goto L_0x00a9
            L_0x0043:
                r0 = move-exception
                goto L_0x00b9
            L_0x0046:
                r0 = move-exception
                goto L_0x004e
            L_0x0048:
                r0 = move-exception
                goto L_0x0079
            L_0x004a:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x004e:
                r1.cancel()     // Catch:{ all -> 0x0072 }
                if (r4 != 0) goto L_0x0074
                java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
                r5.<init>()     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "canceled due to "
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                r5.append(r0)     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
                r4.<init>(r5)     // Catch:{ all -> 0x0072 }
                XH.C16816g.a(r4, r0)     // Catch:{ all -> 0x0072 }
                GK.f r5 = r8.f136169a     // Catch:{ all -> 0x0072 }
                r5.c(r1, r4)     // Catch:{ all -> 0x0072 }
                goto L_0x0074
            L_0x0072:
                r0 = move-exception
                goto L_0x00ad
            L_0x0074:
                throw r0     // Catch:{ all -> 0x0072 }
            L_0x0075:
                r4 = move-exception
                r7 = r4
                r4 = r0
                r0 = r7
            L_0x0079:
                if (r4 == 0) goto L_0x009b
                QK.j$a r4 = QK.C16354j.f137719a     // Catch:{ all -> 0x0072 }
                QK.j r4 = r4.g()     // Catch:{ all -> 0x0072 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
                r5.<init>()     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = r1.I()     // Catch:{ all -> 0x0072 }
                r5.append(r6)     // Catch:{ all -> 0x0072 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
                r6 = 4
                r4.k(r5, r6, r0)     // Catch:{ all -> 0x0072 }
                goto L_0x00a0
            L_0x009b:
                GK.f r4 = r8.f136169a     // Catch:{ all -> 0x0072 }
                r4.c(r1, r0)     // Catch:{ all -> 0x0072 }
            L_0x00a0:
                GK.z r0 = r1.m()     // Catch:{ all -> 0x0043 }
                GK.p r0 = r0.u()     // Catch:{ all -> 0x0043 }
                goto L_0x003e
            L_0x00a9:
                r2.setName(r3)
                return
            L_0x00ad:
                GK.z r1 = r1.m()     // Catch:{ all -> 0x0043 }
                GK.p r1 = r1.u()     // Catch:{ all -> 0x0043 }
                r1.f(r8)     // Catch:{ all -> 0x0043 }
                throw r0     // Catch:{ all -> 0x0043 }
            L_0x00b9:
                r2.setName(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: LK.e.a.run():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"LLK/e$b;", "Ljava/lang/ref/WeakReference;", "LLK/e;", "referent", "", "callStackTrace", "<init>", "(LLK/e;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f136172a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            C17542s.j(eVar, "referent");
            this.f136172a = obj;
        }

        public final Object a() {
            return this.f136172a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LK/e$c", "LWK/c;", "LXH/N;", "B", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends C16768c {

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ e f136173o;

        c(e eVar) {
            this.f136173o = eVar;
        }

        /* access modifiers changed from: protected */
        public void B() {
            this.f136173o.cancel();
        }
    }

    public e(z zVar, C15774B b10, boolean z10) {
        C17542s.j(zVar, "client");
        C17542s.j(b10, "originalRequest");
        this.f136151a = zVar;
        this.f136152b = b10;
        this.f136153c = z10;
        this.f136154d = zVar.o().b();
        this.f136155e = zVar.w().a(this);
        c cVar = new c(this);
        cVar.g((long) zVar.k(), TimeUnit.MILLISECONDS);
        this.f136156f = cVar;
    }

    private final <E extends IOException> E H(E e10) {
        if (this.f136161k || !this.f136156f.w()) {
            return e10;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e10 != null) {
            interruptedIOException.initCause(e10);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    public final String I() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(J() ? "canceled " : "");
        sb2.append(this.f136153c ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(A());
        return sb2.toString();
    }

    private final <E extends IOException> E d(E e10) {
        Socket C10;
        boolean z10 = C15864d.f135363h;
        if (!z10 || !Thread.holdsLock(this)) {
            f fVar = this.f136160j;
            if (fVar != null) {
                if (!z10 || !Thread.holdsLock(fVar)) {
                    synchronized (fVar) {
                        C10 = C();
                    }
                    if (this.f136160j == null) {
                        if (C10 != null) {
                            C15864d.n(C10);
                        }
                        this.f136155e.l(this, fVar);
                    } else if (C10 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
                }
            }
            E H10 = H(e10);
            if (e10 != null) {
                C15799r rVar = this.f136155e;
                C17542s.g(H10);
                rVar.e(this, H10);
            } else {
                this.f136155e.d(this);
            }
            return H10;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    private final void e() {
        this.f136158h = C16354j.f137719a.g().i("response.body().close()");
        this.f136155e.f(this);
    }

    private final C15782a j(C15803v vVar) {
        C15788g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (vVar.j()) {
            sSLSocketFactory = this.f136151a.R();
            hostnameVerifier = this.f136151a.C();
            gVar = this.f136151a.m();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        return new C15782a(vVar.i(), vVar.o(), this.f136151a.v(), this.f136151a.Q(), sSLSocketFactory, hostnameVerifier, gVar, this.f136151a.M(), this.f136151a.L(), this.f136151a.K(), this.f136151a.p(), this.f136151a.N());
    }

    public final String A() {
        return this.f136152b.k().r();
    }

    public final Socket C() {
        f fVar = this.f136160j;
        C17542s.g(fVar);
        if (!C15864d.f135363h || Thread.holdsLock(fVar)) {
            List<Reference<e>> q10 = fVar.q();
            Iterator<Reference<e>> it = q10.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i10 = -1;
                    break;
                } else if (C17542s.e(it.next().get(), this)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                q10.remove(i10);
                this.f136160j = null;
                if (q10.isEmpty()) {
                    fVar.E(System.nanoTime());
                    if (this.f136154d.c(fVar)) {
                        return fVar.c();
                    }
                }
                return null;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    public final boolean D() {
        d dVar = this.f136159i;
        C17542s.g(dVar);
        return dVar.e();
    }

    public final void E(f fVar) {
        this.f136168r = fVar;
    }

    public final void G() {
        if (!this.f136161k) {
            this.f136161k = true;
            this.f136156f.w();
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public boolean J() {
        return this.f136166p;
    }

    public void N0(C15787f fVar) {
        C17542s.j(fVar, "responseCallback");
        if (this.f136157g.compareAndSet(false, true)) {
            e();
            this.f136151a.u().a(new a(this, fVar));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void c(f fVar) {
        C17542s.j(fVar, "connection");
        if (C15864d.f135363h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        } else if (this.f136160j == null) {
            this.f136160j = fVar;
            fVar.q().add(new b(this, this.f136158h));
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public void cancel() {
        if (!this.f136166p) {
            this.f136166p = true;
            c cVar = this.f136167q;
            if (cVar != null) {
                cVar.b();
            }
            f fVar = this.f136168r;
            if (fVar != null) {
                fVar.g();
            }
            this.f136155e.g(this);
        }
    }

    public C15776D execute() {
        if (this.f136157g.compareAndSet(false, true)) {
            this.f136156f.v();
            e();
            try {
                this.f136151a.u().b(this);
                return v();
            } finally {
                this.f136151a.u().g(this);
            }
        } else {
            throw new IllegalStateException("Already Executed");
        }
    }

    /* renamed from: f */
    public e clone() {
        return new e(this.f136151a, this.f136152b, this.f136153c);
    }

    public final void k(C15774B b10, boolean z10) {
        C17542s.j(b10, "request");
        if (this.f136162l == null) {
            synchronized (this) {
                if (this.f136164n) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                } else if (!this.f136163m) {
                    C16807N n10 = C16807N.f139792a;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (z10) {
                this.f136159i = new d(this.f136154d, j(b10.k()), this, this.f136155e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void l(boolean z10) {
        c cVar;
        synchronized (this) {
            if (this.f136165o) {
                C16807N n10 = C16807N.f139792a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z10 && (cVar = this.f136167q) != null) {
            cVar.d();
        }
        this.f136162l = null;
    }

    public final z m() {
        return this.f136151a;
    }

    public final f n() {
        return this.f136160j;
    }

    public final C15799r o() {
        return this.f136155e;
    }

    public final boolean p() {
        return this.f136153c;
    }

    public final c r() {
        return this.f136162l;
    }

    public C15774B t() {
        return this.f136152b;
    }

    public final C15774B u() {
        return this.f136152b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final GK.C15776D v() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            GK.z r0 = r11.f136151a
            java.util.List r0 = r0.D()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            YH.C16877v.E(r2, r0)
            MK.j r0 = new MK.j
            GK.z r1 = r11.f136151a
            r0.<init>(r1)
            r2.add(r0)
            MK.a r0 = new MK.a
            GK.z r1 = r11.f136151a
            GK.n r1 = r1.r()
            r0.<init>(r1)
            r2.add(r0)
            JK.a r0 = new JK.a
            GK.z r1 = r11.f136151a
            GK.c r1 = r1.j()
            r0.<init>(r1)
            r2.add(r0)
            LK.a r0 = LK.C16029a.f136118a
            r2.add(r0)
            boolean r0 = r11.f136153c
            if (r0 != 0) goto L_0x004a
            GK.z r0 = r11.f136151a
            java.util.List r0 = r0.G()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            YH.C16877v.E(r2, r0)
        L_0x004a:
            MK.b r0 = new MK.b
            boolean r1 = r11.f136153c
            r0.<init>(r1)
            r2.add(r0)
            MK.g r9 = new MK.g
            GK.B r5 = r11.f136152b
            GK.z r0 = r11.f136151a
            int r6 = r0.n()
            GK.z r0 = r11.f136151a
            int r7 = r0.O()
            GK.z r0 = r11.f136151a
            int r8 = r0.T()
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            GK.B r2 = r11.f136152b     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            GK.D r2 = r9.b(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            boolean r3 = r11.J()     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            if (r3 != 0) goto L_0x0083
            r11.z(r0)
            return r2
        L_0x0083:
            HK.C15864d.m(r2)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0090, all -> 0x008e }
            throw r2     // Catch:{ IOException -> 0x0090, all -> 0x008e }
        L_0x008e:
            r2 = move-exception
            goto L_0x00a0
        L_0x0090:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r11.z(r1)     // Catch:{ all -> 0x009c }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.C17542s.h(r1, r3)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            r10 = r2
            r2 = r1
            r1 = r10
        L_0x00a0:
            if (r1 != 0) goto L_0x00a5
            r11.z(r0)
        L_0x00a5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: LK.e.v():GK.D");
    }

    public final c w(g gVar) {
        C17542s.j(gVar, "chain");
        synchronized (this) {
            if (!this.f136165o) {
                throw new IllegalStateException("released");
            } else if (this.f136164n) {
                throw new IllegalStateException("Check failed.");
            } else if (!this.f136163m) {
                C16807N n10 = C16807N.f139792a;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        d dVar = this.f136159i;
        C17542s.g(dVar);
        c cVar = new c(this, this.f136155e, dVar, dVar.a(this.f136151a, gVar));
        this.f136162l = cVar;
        this.f136167q = cVar;
        synchronized (this) {
            this.f136163m = true;
            this.f136164n = true;
        }
        if (!this.f136166p) {
            return cVar;
        }
        throw new IOException("Canceled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0030 A[Catch:{ all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[Catch:{ all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E y(LK.c r2, boolean r3, boolean r4, E r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            LK.c r0 = r1.f136167q
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r0)
            if (r2 != 0) goto L_0x000e
            return r5
        L_0x000e:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L_0x0019
            boolean r0 = r1.f136163m     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0019
        L_0x0017:
            r2 = move-exception
            goto L_0x0059
        L_0x0019:
            if (r4 == 0) goto L_0x0041
            boolean r0 = r1.f136164n     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0041
        L_0x001f:
            if (r3 == 0) goto L_0x0023
            r1.f136163m = r2     // Catch:{ all -> 0x0017 }
        L_0x0023:
            if (r4 == 0) goto L_0x0027
            r1.f136164n = r2     // Catch:{ all -> 0x0017 }
        L_0x0027:
            boolean r3 = r1.f136163m     // Catch:{ all -> 0x0017 }
            r4 = 1
            if (r3 != 0) goto L_0x0032
            boolean r0 = r1.f136164n     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0032
            r0 = r4
            goto L_0x0033
        L_0x0032:
            r0 = r2
        L_0x0033:
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f136164n     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            boolean r3 = r1.f136165o     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x003e
            r2 = r4
        L_0x003e:
            r3 = r2
            r2 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x0017 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0051
            r2 = 0
            r1.f136167q = r2
            LK.f r2 = r1.f136160j
            if (r2 == 0) goto L_0x0051
            r2.u()
        L_0x0051:
            if (r3 == 0) goto L_0x0058
            java.io.IOException r2 = r1.d(r5)
            return r2
        L_0x0058:
            return r5
        L_0x0059:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: LK.e.y(LK.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException z(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f136165o) {
                    this.f136165o = false;
                    if (!this.f136163m && !this.f136164n) {
                        z10 = true;
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10 ? d(iOException) : iOException;
    }
}
