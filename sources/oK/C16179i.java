package OK;

import GK.C15802u;
import HK.C15864d;
import WK.C16768c;
import WK.C16770e;
import WK.C16772g;
import WK.L;
import WK.N;
import WK.O;
import XH.C16807N;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 T2\u00020\u0001:\u0004.*0\u001eB3\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010!J\u000f\u0010*\u001a\u00020\u001dH\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001dH\u0000¢\u0006\u0004\b0\u0010+J\u000f\u00101\u001a\u00020\u001dH\u0000¢\u0006\u0004\b1\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u00105\u001a\u0004\b6\u00107R*\u0010=\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b0\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010/R*\u0010@\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010/R*\u0010C\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\bA\u0010;\"\u0004\bB\u0010/R*\u0010F\u001a\u00020,2\u0006\u00108\u001a\u00020,8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010/R\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0G8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010#\u001a\u00060MR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010V\u001a\u00060RR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b3\u0010S\u001a\u0004\bT\u0010UR\u001e\u0010[\u001a\u00060WR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b>\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010]\u001a\u00060WR\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b:\u0010X\u001a\u0004\b\\\u0010ZR$\u0010\u000e\u001a\u0004\u0018\u00010\r8@@\u0000X\u000e¢\u0006\u0012\n\u0004\bY\u0010^\u001a\u0004\bJ\u0010_\"\u0004\b`\u0010!R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010a\u001a\u0004\bN\u0010b\"\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0011\u0010i\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010f¨\u0006j"}, d2 = {"LOK/i;", "", "", "id", "LOK/f;", "connection", "", "outFinished", "inFinished", "LGK/u;", "headers", "<init>", "(ILOK/f;ZZLGK/u;)V", "LOK/b;", "errorCode", "Ljava/io/IOException;", "errorException", "e", "(LOK/b;Ljava/io/IOException;)Z", "C", "()LGK/u;", "LWK/O;", "v", "()LWK/O;", "E", "LWK/L;", "n", "()LWK/L;", "rstStatusCode", "LXH/N;", "d", "(LOK/b;Ljava/io/IOException;)V", "f", "(LOK/b;)V", "LWK/g;", "source", "length", "w", "(LWK/g;I)V", "x", "(LGK/u;Z)V", "y", "b", "()V", "", "delta", "a", "(J)V", "c", "D", "I", "j", "()I", "LOK/f;", "g", "()LOK/f;", "<set-?>", "J", "l", "()J", "A", "readBytesTotal", "k", "z", "readBytesAcknowledged", "r", "B", "writeBytesTotal", "q", "setWriteBytesMaximum$okhttp", "writeBytesMaximum", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "headersQueue", "h", "Z", "hasResponseHeaders", "LOK/i$c;", "i", "LOK/i$c;", "p", "()LOK/i$c;", "LOK/i$b;", "LOK/i$b;", "o", "()LOK/i$b;", "sink", "LOK/i$d;", "LOK/i$d;", "m", "()LOK/i$d;", "readTimeout", "s", "writeTimeout", "LOK/b;", "()LOK/b;", "setErrorCode$okhttp", "Ljava/io/IOException;", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "u", "()Z", "isOpen", "t", "isLocallyInitiated", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OK.i  reason: case insensitive filesystem */
public final class C16179i {

    /* renamed from: o  reason: collision with root package name */
    public static final a f137074o = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f137075a;

    /* renamed from: b  reason: collision with root package name */
    private final C16176f f137076b;

    /* renamed from: c  reason: collision with root package name */
    private long f137077c;

    /* renamed from: d  reason: collision with root package name */
    private long f137078d;

    /* renamed from: e  reason: collision with root package name */
    private long f137079e;

    /* renamed from: f  reason: collision with root package name */
    private long f137080f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<C15802u> f137081g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f137082h;

    /* renamed from: i  reason: collision with root package name */
    private final c f137083i;

    /* renamed from: j  reason: collision with root package name */
    private final b f137084j;

    /* renamed from: k  reason: collision with root package name */
    private final d f137085k = new d();

    /* renamed from: l  reason: collision with root package name */
    private final d f137086l = new d();

    /* renamed from: m  reason: collision with root package name */
    private C16172b f137087m;

    /* renamed from: n  reason: collision with root package name */
    private IOException f137088n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LOK/i$a;", "", "<init>", "()V", "", "EMIT_BUFFER_SIZE", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\tR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010'\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\t¨\u0006("}, d2 = {"LOK/i$b;", "LWK/L;", "", "finished", "<init>", "(LOK/i;Z)V", "outFinishedOnLastFrame", "LXH/N;", "c", "(Z)V", "LWK/e;", "source", "", "byteCount", "s3", "(LWK/e;J)V", "flush", "()V", "LWK/O;", "y", "()LWK/O;", "close", "a", "Z", "e", "()Z", "setFinished", "b", "LWK/e;", "sendBuffer", "LGK/u;", "LGK/u;", "getTrailers", "()LGK/u;", "setTrailers", "(LGK/u;)V", "trailers", "d", "setClosed", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.i$b */
    public final class b implements L {

        /* renamed from: a  reason: collision with root package name */
        private boolean f137089a;

        /* renamed from: b  reason: collision with root package name */
        private final C16770e f137090b = new C16770e();

        /* renamed from: c  reason: collision with root package name */
        private C15802u f137091c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f137092d;

        public b(boolean z10) {
            this.f137089a = z10;
        }

        private final void c(boolean z10) {
            long min;
            boolean z11;
            C16179i iVar = C16179i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f137089a && !this.f137092d && iVar.h() == null) {
                        iVar.D();
                    }
                    iVar.s().C();
                    iVar.c();
                    min = Math.min(iVar.q() - iVar.r(), this.f137090b.size());
                    iVar.B(iVar.r() + min);
                    z11 = z10 && min == this.f137090b.size();
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C16179i.this.s().v();
            try {
                C16179i.this.g().a1(C16179i.this.j(), z11, this.f137090b, min);
            } finally {
                C16179i.this.s().C();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
            if (r10.f137093e.o().f137089a != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
            if (r10.f137090b.size() <= 0) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
            if (r10.f137091c == null) goto L_0x008f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
            if (r10.f137090b.size() <= 0) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0072, code lost:
            c(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
            r0 = r10.f137093e.g();
            r2 = r10.f137093e.j();
            r4 = r10.f137091c;
            kotlin.jvm.internal.C17542s.g(r4);
            r0.b1(r2, r1, HK.C15864d.Q(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            if (r0 == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
            if (r10.f137090b.size() <= 0) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
            c(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
            if (r1 == false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
            r10.f137093e.g().a1(r10.f137093e.j(), true, (WK.C16770e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
            r0 = r10.f137093e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b6, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r10.f137092d = true;
            r1 = XH.C16807N.f139792a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bb, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
            r10.f137093e.g().flush();
            r10.f137093e.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r10 = this;
                OK.i r0 = OK.C16179i.this
                boolean r1 = HK.C15864d.f135363h
                if (r1 == 0) goto L_0x0034
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L_0x000d
                goto L_0x0034
            L_0x000d:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Thread "
                r2.append(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L_0x0034:
                OK.i r0 = OK.C16179i.this
                monitor-enter(r0)
                boolean r1 = r10.f137092d     // Catch:{ all -> 0x00ce }
                if (r1 == 0) goto L_0x003d
                monitor-exit(r0)
                return
            L_0x003d:
                OK.b r1 = r0.h()     // Catch:{ all -> 0x00ce }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0047
                r1 = r3
                goto L_0x0048
            L_0x0047:
                r1 = r2
            L_0x0048:
                XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x00ce }
                monitor-exit(r0)
                OK.i r0 = OK.C16179i.this
                OK.i$b r0 = r0.o()
                boolean r0 = r0.f137089a
                if (r0 != 0) goto L_0x00b4
                WK.e r0 = r10.f137090b
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0063
                r0 = r3
                goto L_0x0064
            L_0x0063:
                r0 = r2
            L_0x0064:
                GK.u r4 = r10.f137091c
                if (r4 == 0) goto L_0x008f
            L_0x0068:
                WK.e r0 = r10.f137090b
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0076
                r10.c(r2)
                goto L_0x0068
            L_0x0076:
                OK.i r0 = OK.C16179i.this
                OK.f r0 = r0.g()
                OK.i r2 = OK.C16179i.this
                int r2 = r2.j()
                GK.u r4 = r10.f137091c
                kotlin.jvm.internal.C17542s.g(r4)
                java.util.List r4 = HK.C15864d.Q(r4)
                r0.b1(r2, r1, r4)
                goto L_0x00b4
            L_0x008f:
                if (r0 == 0) goto L_0x009f
            L_0x0091:
                WK.e r0 = r10.f137090b
                long r0 = r0.size()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00b4
                r10.c(r3)
                goto L_0x0091
            L_0x009f:
                if (r1 == 0) goto L_0x00b4
                OK.i r0 = OK.C16179i.this
                OK.f r4 = r0.g()
                OK.i r0 = OK.C16179i.this
                int r5 = r0.j()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.a1(r5, r6, r7, r8)
            L_0x00b4:
                OK.i r0 = OK.C16179i.this
                monitor-enter(r0)
                r10.f137092d = r3     // Catch:{ all -> 0x00cb }
                XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x00cb }
                monitor-exit(r0)
                OK.i r0 = OK.C16179i.this
                OK.f r0 = r0.g()
                r0.flush()
                OK.i r0 = OK.C16179i.this
                r0.b()
                return
            L_0x00cb:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00ce:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: OK.C16179i.b.close():void");
        }

        public final boolean d() {
            return this.f137092d;
        }

        public final boolean e() {
            return this.f137089a;
        }

        public void flush() {
            C16179i iVar = C16179i.this;
            if (!C15864d.f135363h || !Thread.holdsLock(iVar)) {
                C16179i iVar2 = C16179i.this;
                synchronized (iVar2) {
                    iVar2.c();
                    C16807N n10 = C16807N.f139792a;
                }
                while (this.f137090b.size() > 0) {
                    c(false);
                    C16179i.this.g().flush();
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public void s3(C16770e eVar, long j10) {
            C17542s.j(eVar, "source");
            C16179i iVar = C16179i.this;
            if (!C15864d.f135363h || !Thread.holdsLock(iVar)) {
                this.f137090b.s3(eVar, j10);
                while (this.f137090b.size() >= 16384) {
                    c(false);
                }
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public O y() {
            return C16179i.this.s();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010(\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b'\u0010%R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00101\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b0\u0010!¨\u00062"}, d2 = {"LOK/i$c;", "LWK/N;", "", "maxByteCount", "", "finished", "<init>", "(LOK/i;JZ)V", "read", "LXH/N;", "h", "(J)V", "LWK/e;", "sink", "byteCount", "u0", "(LWK/e;J)J", "LWK/g;", "source", "e", "(LWK/g;J)V", "LWK/O;", "y", "()LWK/O;", "close", "()V", "a", "J", "b", "Z", "d", "()Z", "f", "(Z)V", "c", "LWK/e;", "getReceiveBuffer", "()LWK/e;", "receiveBuffer", "getReadBuffer", "readBuffer", "LGK/u;", "LGK/u;", "getTrailers", "()LGK/u;", "g", "(LGK/u;)V", "trailers", "setClosed$okhttp", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.i$c */
    public final class c implements N {

        /* renamed from: a  reason: collision with root package name */
        private final long f137094a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f137095b;

        /* renamed from: c  reason: collision with root package name */
        private final C16770e f137096c = new C16770e();

        /* renamed from: d  reason: collision with root package name */
        private final C16770e f137097d = new C16770e();

        /* renamed from: e  reason: collision with root package name */
        private C15802u f137098e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f137099f;

        public c(long j10, boolean z10) {
            this.f137094a = j10;
            this.f137095b = z10;
        }

        private final void h(long j10) {
            C16179i iVar = C16179i.this;
            if (!C15864d.f135363h || !Thread.holdsLock(iVar)) {
                C16179i.this.g().Y0(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final boolean c() {
            return this.f137099f;
        }

        public void close() {
            long size;
            C16179i iVar = C16179i.this;
            synchronized (iVar) {
                this.f137099f = true;
                size = this.f137097d.size();
                this.f137097d.c();
                C17542s.h(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                C16807N n10 = C16807N.f139792a;
            }
            if (size > 0) {
                h(size);
            }
            C16179i.this.b();
        }

        public final boolean d() {
            return this.f137095b;
        }

        public final void e(C16772g gVar, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            C17542s.j(gVar, "source");
            C16179i iVar = C16179i.this;
            if (!C15864d.f135363h || !Thread.holdsLock(iVar)) {
                long j11 = j10;
                while (j11 > 0) {
                    synchronized (C16179i.this) {
                        z10 = this.f137095b;
                        z11 = false;
                        z12 = this.f137097d.size() + j11 > this.f137094a;
                        C16807N n10 = C16807N.f139792a;
                    }
                    if (z12) {
                        gVar.M(j11);
                        C16179i.this.f(C16172b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z10) {
                        gVar.M(j11);
                        return;
                    } else {
                        long u02 = gVar.u0(this.f137096c, j11);
                        if (u02 != -1) {
                            j11 -= u02;
                            C16179i iVar2 = C16179i.this;
                            synchronized (iVar2) {
                                try {
                                    if (this.f137099f) {
                                        this.f137096c.c();
                                    } else {
                                        if (this.f137097d.size() == 0) {
                                            z11 = true;
                                        }
                                        this.f137097d.Y(this.f137096c);
                                        if (z11) {
                                            C17542s.h(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                            iVar2.notifyAll();
                                        }
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                h(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }

        public final void f(boolean z10) {
            this.f137095b = z10;
        }

        public final void g(C15802u uVar) {
            this.f137098e = uVar;
        }

        /* JADX INFO: finally extract failed */
        public long u0(C16770e eVar, long j10) {
            Throwable th2;
            boolean z10;
            long j11;
            C16770e eVar2 = eVar;
            long j12 = j10;
            C17542s.j(eVar2, "sink");
            long j13 = 0;
            if (j12 >= 0) {
                while (true) {
                    C16179i iVar = C16179i.this;
                    synchronized (iVar) {
                        iVar.m().v();
                        try {
                            if (iVar.h() == null || this.f137095b) {
                                th2 = null;
                            } else {
                                th2 = iVar.i();
                                if (th2 == null) {
                                    C16172b h10 = iVar.h();
                                    C17542s.g(h10);
                                    th2 = new n(h10);
                                }
                            }
                            if (!this.f137099f) {
                                z10 = false;
                                if (this.f137097d.size() > j13) {
                                    C16770e eVar3 = this.f137097d;
                                    j11 = eVar3.u0(eVar2, Math.min(j12, eVar3.size()));
                                    iVar.A(iVar.l() + j11);
                                    long l10 = iVar.l() - iVar.k();
                                    if (th2 == null && l10 >= ((long) (iVar.g().h0().c() / 2))) {
                                        iVar.g().y1(iVar.j(), l10);
                                        iVar.z(iVar.l());
                                    }
                                } else {
                                    if (!this.f137095b && th2 == null) {
                                        iVar.D();
                                        z10 = true;
                                    }
                                    j11 = -1;
                                }
                                iVar.m().C();
                                C16807N n10 = C16807N.f139792a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th3) {
                            iVar.m().C();
                            throw th3;
                        }
                    }
                    if (z10) {
                        j13 = 0;
                    } else if (j11 != -1) {
                        return j11;
                    } else {
                        if (th2 == null) {
                            return -1;
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
            }
        }

        public O y() {
            return C16179i.this.m();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LOK/i$d;", "LWK/c;", "<init>", "(LOK/i;)V", "LXH/N;", "B", "()V", "Ljava/io/IOException;", "cause", "x", "(Ljava/io/IOException;)Ljava/io/IOException;", "C", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.i$d */
    public final class d extends C16768c {
        public d() {
        }

        /* access modifiers changed from: protected */
        public void B() {
            C16179i.this.f(C16172b.CANCEL);
            C16179i.this.g().Q0();
        }

        public final void C() {
            if (w()) {
                throw x((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public C16179i(int i10, C16176f fVar, boolean z10, boolean z11, C15802u uVar) {
        C17542s.j(fVar, "connection");
        this.f137075a = i10;
        this.f137076b = fVar;
        this.f137080f = (long) fVar.i0().c();
        ArrayDeque<C15802u> arrayDeque = new ArrayDeque<>();
        this.f137081g = arrayDeque;
        this.f137083i = new c((long) fVar.h0().c(), z11);
        this.f137084j = new b(z10);
        if (uVar != null) {
            if (!t()) {
                arrayDeque.add(uVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!t()) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean e(C16172b bVar, IOException iOException) {
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f137087m != null) {
                    return false;
                }
                this.f137087m = bVar;
                this.f137088n = iOException;
                C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                if (this.f137083i.d() && this.f137084j.e()) {
                    return false;
                }
                C16807N n10 = C16807N.f139792a;
                this.f137076b.P0(this.f137075a);
                return true;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void A(long j10) {
        this.f137077c = j10;
    }

    public final void B(long j10) {
        this.f137079e = j10;
    }

    /* JADX INFO: finally extract failed */
    public final synchronized C15802u C() {
        C15802u removeFirst;
        this.f137085k.v();
        while (this.f137081g.isEmpty() && this.f137087m == null) {
            try {
                D();
            } catch (Throwable th2) {
                this.f137085k.C();
                throw th2;
            }
        }
        this.f137085k.C();
        if (!this.f137081g.isEmpty()) {
            removeFirst = this.f137081g.removeFirst();
            C17542s.i(removeFirst, "headersQueue.removeFirst()");
        } else {
            Throwable th3 = this.f137088n;
            if (th3 == null) {
                C16172b bVar = this.f137087m;
                C17542s.g(bVar);
                th3 = new n(bVar);
            }
            throw th3;
        }
        return removeFirst;
    }

    public final void D() {
        try {
            C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final O E() {
        return this.f137086l;
    }

    public final void a(long j10) {
        this.f137080f += j10;
        if (j10 > 0) {
            C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z10;
        boolean u10;
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (!this.f137083i.d() && this.f137083i.c()) {
                        if (!this.f137084j.e()) {
                            if (this.f137084j.d()) {
                            }
                        }
                        z10 = true;
                        u10 = u();
                        C16807N n10 = C16807N.f139792a;
                    }
                    z10 = false;
                    u10 = u();
                    C16807N n102 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                d(C16172b.CANCEL, (IOException) null);
            } else if (!u10) {
                this.f137076b.P0(this.f137075a);
            }
        } else {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
    }

    public final void c() {
        if (this.f137084j.d()) {
            throw new IOException("stream closed");
        } else if (this.f137084j.e()) {
            throw new IOException("stream finished");
        } else if (this.f137087m != null) {
            Throwable th2 = this.f137088n;
            if (th2 == null) {
                C16172b bVar = this.f137087m;
                C17542s.g(bVar);
                th2 = new n(bVar);
            }
            throw th2;
        }
    }

    public final void d(C16172b bVar, IOException iOException) {
        C17542s.j(bVar, "rstStatusCode");
        if (e(bVar, iOException)) {
            this.f137076b.k1(this.f137075a, bVar);
        }
    }

    public final void f(C16172b bVar) {
        C17542s.j(bVar, "errorCode");
        if (e(bVar, (IOException) null)) {
            this.f137076b.o1(this.f137075a, bVar);
        }
    }

    public final C16176f g() {
        return this.f137076b;
    }

    public final synchronized C16172b h() {
        return this.f137087m;
    }

    public final IOException i() {
        return this.f137088n;
    }

    public final int j() {
        return this.f137075a;
    }

    public final long k() {
        return this.f137078d;
    }

    public final long l() {
        return this.f137077c;
    }

    public final d m() {
        return this.f137085k;
    }

    public final L n() {
        synchronized (this) {
            try {
                if (!this.f137082h) {
                    if (!t()) {
                        throw new IllegalStateException("reply before requesting the sink");
                    }
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f137084j;
    }

    public final b o() {
        return this.f137084j;
    }

    public final c p() {
        return this.f137083i;
    }

    public final long q() {
        return this.f137080f;
    }

    public final long r() {
        return this.f137079e;
    }

    public final d s() {
        return this.f137086l;
    }

    public final boolean t() {
        return this.f137076b.J() == ((this.f137075a & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean u() {
        /*
            r2 = this;
            monitor-enter(r2)
            OK.b r0 = r2.f137087m     // Catch:{ all -> 0x0019 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            OK.i$c r0 = r2.f137083i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x001b
            OK.i$c r0 = r2.f137083i     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.c()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            goto L_0x001b
        L_0x0019:
            r0 = move-exception
            goto L_0x0034
        L_0x001b:
            OK.i$b r0 = r2.f137084j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.e()     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x002b
            OK.i$b r0 = r2.f137084j     // Catch:{ all -> 0x0019 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
        L_0x002b:
            boolean r0 = r2.f137082h     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0031
            monitor-exit(r2)
            return r1
        L_0x0031:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0034:
            monitor-exit(r2)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OK.C16179i.u():boolean");
    }

    public final O v() {
        return this.f137085k;
    }

    public final void w(C16772g gVar, int i10) {
        C17542s.j(gVar, "source");
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            this.f137083i.e(gVar, (long) i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[Catch:{ all -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(GK.C15802u r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            boolean r0 = HK.C15864d.f135363h
            if (r0 == 0) goto L_0x0037
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L_0x0010
            goto L_0x0037
        L_0x0010:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Thread "
            r4.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0037:
            monitor-enter(r2)
            boolean r0 = r2.f137082h     // Catch:{ all -> 0x0046 }
            r1 = 1
            if (r0 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0040
            goto L_0x0048
        L_0x0040:
            OK.i$c r0 = r2.f137083i     // Catch:{ all -> 0x0046 }
            r0.g(r3)     // Catch:{ all -> 0x0046 }
            goto L_0x004f
        L_0x0046:
            r3 = move-exception
            goto L_0x006f
        L_0x0048:
            r2.f137082h = r1     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque<GK.u> r0 = r2.f137081g     // Catch:{ all -> 0x0046 }
            r0.add(r3)     // Catch:{ all -> 0x0046 }
        L_0x004f:
            if (r4 == 0) goto L_0x0056
            OK.i$c r3 = r2.f137083i     // Catch:{ all -> 0x0046 }
            r3.f(r1)     // Catch:{ all -> 0x0046 }
        L_0x0056:
            boolean r3 = r2.u()     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.C17542s.h(r2, r4)     // Catch:{ all -> 0x0046 }
            r2.notifyAll()     // Catch:{ all -> 0x0046 }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x006e
            OK.f r3 = r2.f137076b
            int r4 = r2.f137075a
            r3.P0(r4)
        L_0x006e:
            return
        L_0x006f:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: OK.C16179i.x(GK.u, boolean):void");
    }

    public final synchronized void y(C16172b bVar) {
        C17542s.j(bVar, "errorCode");
        if (this.f137087m == null) {
            this.f137087m = bVar;
            C17542s.h(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j10) {
        this.f137078d = j10;
    }
}
