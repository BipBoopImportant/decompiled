package NK;

import GK.C15774B;
import GK.C15776D;
import GK.C15795n;
import GK.C15802u;
import GK.C15803v;
import GK.z;
import HJ.C15854t;
import HK.C15864d;
import MK.i;
import MK.k;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import WK.C16781p;
import WK.L;
import WK.N;
import WK.O;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 -2\u00020\u0001:\u00070?'+#:/B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010&J\u000f\u00100\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010&J\u001d\u00105\u001a\u00020\u001d2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0019\u0010:\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b<\u0010=R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010>R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010CR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010ER\u0014\u0010I\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010HR\u0018\u0010K\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010JR\u0018\u0010N\u001a\u000207*\u00020)8BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u000207*\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"LNK/b;", "LMK/d;", "LGK/z;", "client", "LLK/f;", "connection", "LWK/g;", "source", "LWK/f;", "sink", "<init>", "(LGK/z;LLK/f;LWK/g;LWK/f;)V", "LWK/L;", "u", "()LWK/L;", "x", "", "length", "LWK/N;", "w", "(J)LWK/N;", "LGK/v;", "url", "v", "(LGK/v;)LWK/N;", "y", "()LWK/N;", "LWK/p;", "timeout", "LXH/N;", "r", "(LWK/p;)V", "LGK/B;", "request", "contentLength", "e", "(LGK/B;J)LWK/L;", "cancel", "()V", "c", "(LGK/B;)V", "LGK/D;", "response", "d", "(LGK/D;)J", "h", "(LGK/D;)LWK/N;", "g", "a", "LGK/u;", "headers", "", "requestLine", "A", "(LGK/u;Ljava/lang/String;)V", "", "expectContinue", "LGK/D$a;", "f", "(Z)LGK/D$a;", "z", "(LGK/D;)V", "LGK/z;", "b", "LLK/f;", "()LLK/f;", "LWK/g;", "LWK/f;", "", "I", "state", "LNK/a;", "LNK/a;", "headersReader", "LGK/u;", "trailers", "t", "(LGK/D;)Z", "isChunked", "s", "(LGK/B;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: NK.b  reason: case insensitive filesystem */
public final class C16125b implements MK.d {

    /* renamed from: h  reason: collision with root package name */
    public static final d f136623h = new d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final z f136624a;

    /* renamed from: b  reason: collision with root package name */
    private final LK.f f136625b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C16772g f136626c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16771f f136627d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f136628e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C16124a f136629f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C15802u f136630g;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LNK/b$a;", "LWK/N;", "<init>", "(LNK/b;)V", "LWK/O;", "y", "()LWK/O;", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LXH/N;", "d", "()V", "LWK/p;", "a", "LWK/p;", "getTimeout", "()LWK/p;", "timeout", "", "b", "Z", "c", "()Z", "e", "(Z)V", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$a */
    private abstract class a implements N {

        /* renamed from: a  reason: collision with root package name */
        private final C16781p f136631a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f136632b;

        public a() {
            this.f136631a = new C16781p(C16125b.this.f136626c.y());
        }

        /* access modifiers changed from: protected */
        public final boolean c() {
            return this.f136632b;
        }

        public final void d() {
            if (C16125b.this.f136628e != 6) {
                if (C16125b.this.f136628e == 5) {
                    C16125b.this.r(this.f136631a);
                    C16125b.this.f136628e = 6;
                    return;
                }
                throw new IllegalStateException("state: " + C16125b.this.f136628e);
            }
        }

        /* access modifiers changed from: protected */
        public final void e(boolean z10) {
            this.f136632b = z10;
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            try {
                return C16125b.this.f136626c.u0(eVar, j10);
            } catch (IOException e10) {
                C16125b.this.b().B();
                d();
                throw e10;
            }
        }

        public O y() {
            return this.f136631a;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LNK/b$b;", "LWK/L;", "<init>", "(LNK/b;)V", "LWK/O;", "y", "()LWK/O;", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "close", "LWK/p;", "a", "LWK/p;", "timeout", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$b  reason: collision with other inner class name */
    private final class C3359b implements L {

        /* renamed from: a  reason: collision with root package name */
        private final C16781p f136634a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f136635b;

        public C3359b() {
            this.f136634a = new C16781p(C16125b.this.f136627d.y());
        }

        public synchronized void close() {
            if (!this.f136635b) {
                this.f136635b = true;
                C16125b.this.f136627d.D0("0\r\n\r\n");
                C16125b.this.r(this.f136634a);
                C16125b.this.f136628e = 3;
            }
        }

        public synchronized void flush() {
            if (!this.f136635b) {
                C16125b.this.f136627d.flush();
            }
        }

        public void s3(C16770e eVar, long j10) {
            C17542s.j(eVar, "source");
            if (this.f136635b) {
                throw new IllegalStateException("closed");
            } else if (j10 != 0) {
                C16125b.this.f136627d.D2(j10);
                C16125b.this.f136627d.D0("\r\n");
                C16125b.this.f136627d.s3(eVar, j10);
                C16125b.this.f136627d.D0("\r\n");
            }
        }

        public O y() {
            return this.f136634a;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0019"}, d2 = {"LNK/b$c;", "LNK/b$a;", "LNK/b;", "LGK/v;", "url", "<init>", "(LNK/b;LGK/v;)V", "LXH/N;", "f", "()V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "close", "d", "LGK/v;", "e", "J", "bytesRemainingInChunk", "", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$c */
    private final class c extends a {

        /* renamed from: d  reason: collision with root package name */
        private final C15803v f136637d;

        /* renamed from: e  reason: collision with root package name */
        private long f136638e = -1;

        /* renamed from: f  reason: collision with root package name */
        private boolean f136639f = true;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C16125b f136640g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C16125b bVar, C15803v vVar) {
            super();
            C17542s.j(vVar, "url");
            this.f136640g = bVar;
            this.f136637d = vVar;
        }

        private final void f() {
            if (this.f136638e != -1) {
                this.f136640g.f136626c.Z0();
            }
            try {
                this.f136638e = this.f136640g.f136626c.p3();
                String obj = C15854t.z1(this.f136640g.f136626c.Z0()).toString();
                if (this.f136638e < 0 || (obj.length() > 0 && !C15854t.W(obj, ";", false, 2, (Object) null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f136638e + obj + '\"');
                } else if (this.f136638e == 0) {
                    this.f136639f = false;
                    C16125b bVar = this.f136640g;
                    bVar.f136630g = bVar.f136629f.a();
                    z j10 = this.f136640g.f136624a;
                    C17542s.g(j10);
                    C15795n r10 = j10.r();
                    C15803v vVar = this.f136637d;
                    C15802u o10 = this.f136640g.f136630g;
                    C17542s.g(o10);
                    MK.e.f(r10, vVar, o10);
                    d();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        public void close() {
            if (!c()) {
                if (this.f136639f && !C15864d.s(this, 100, TimeUnit.MILLISECONDS)) {
                    this.f136640g.b().B();
                    d();
                }
                e(true);
            }
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (c()) {
                throw new IllegalStateException("closed");
            } else if (!this.f136639f) {
                return -1;
            } else {
                long j11 = this.f136638e;
                if (j11 == 0 || j11 == -1) {
                    f();
                    if (!this.f136639f) {
                        return -1;
                    }
                }
                long u02 = super.u0(eVar, Math.min(j10, this.f136638e));
                if (u02 != -1) {
                    this.f136638e -= u02;
                    return u02;
                }
                this.f136640g.b().B();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"LNK/b$d;", "", "<init>", "()V", "", "NO_CHUNK_YET", "J", "", "STATE_CLOSED", "I", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LNK/b$e;", "LNK/b$a;", "LNK/b;", "", "bytesRemaining", "<init>", "(LNK/b;J)V", "LWK/e;", "sink", "byteCount", "u0", "(LWK/e;J)J", "LXH/N;", "close", "()V", "d", "J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$e */
    private final class e extends a {

        /* renamed from: d  reason: collision with root package name */
        private long f136641d;

        public e(long j10) {
            super();
            this.f136641d = j10;
            if (j10 == 0) {
                d();
            }
        }

        public void close() {
            if (!c()) {
                if (this.f136641d != 0 && !C15864d.s(this, 100, TimeUnit.MILLISECONDS)) {
                    C16125b.this.b().B();
                    d();
                }
                e(true);
            }
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (!c()) {
                long j11 = this.f136641d;
                if (j11 == 0) {
                    return -1;
                }
                long u02 = super.u0(eVar, Math.min(j11, j10));
                if (u02 != -1) {
                    long j12 = this.f136641d - u02;
                    this.f136641d = j12;
                    if (j12 == 0) {
                        d();
                    }
                    return u02;
                }
                C16125b.this.b().B();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                d();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LNK/b$f;", "LWK/L;", "<init>", "(LNK/b;)V", "LWK/O;", "y", "()LWK/O;", "LWK/e;", "source", "", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "close", "LWK/p;", "a", "LWK/p;", "timeout", "", "b", "Z", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$f */
    private final class f implements L {

        /* renamed from: a  reason: collision with root package name */
        private final C16781p f136643a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f136644b;

        public f() {
            this.f136643a = new C16781p(C16125b.this.f136627d.y());
        }

        public void close() {
            if (!this.f136644b) {
                this.f136644b = true;
                C16125b.this.r(this.f136643a);
                C16125b.this.f136628e = 3;
            }
        }

        public void flush() {
            if (!this.f136644b) {
                C16125b.this.f136627d.flush();
            }
        }

        public void s3(C16770e eVar, long j10) {
            C17542s.j(eVar, "source");
            if (!this.f136644b) {
                C15864d.l(eVar.size(), 0, j10);
                C16125b.this.f136627d.s3(eVar, j10);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public O y() {
            return this.f136643a;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LNK/b$g;", "LNK/b$a;", "LNK/b;", "<init>", "(LNK/b;)V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LXH/N;", "close", "()V", "", "d", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NK.b$g */
    private final class g extends a {

        /* renamed from: d  reason: collision with root package name */
        private boolean f136646d;

        public g() {
            super();
        }

        public void close() {
            if (!c()) {
                if (!this.f136646d) {
                    d();
                }
                e(true);
            }
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            } else if (c()) {
                throw new IllegalStateException("closed");
            } else if (this.f136646d) {
                return -1;
            } else {
                long u02 = super.u0(eVar, j10);
                if (u02 != -1) {
                    return u02;
                }
                this.f136646d = true;
                d();
                return -1;
            }
        }
    }

    public C16125b(z zVar, LK.f fVar, C16772g gVar, C16771f fVar2) {
        C17542s.j(fVar, "connection");
        C17542s.j(gVar, "source");
        C17542s.j(fVar2, "sink");
        this.f136624a = zVar;
        this.f136625b = fVar;
        this.f136626c = gVar;
        this.f136627d = fVar2;
        this.f136629f = new C16124a(gVar);
    }

    /* access modifiers changed from: private */
    public final void r(C16781p pVar) {
        O i10 = pVar.i();
        pVar.j(O.f139626e);
        i10.a();
        i10.b();
    }

    private final boolean s(C15774B b10) {
        return C15854t.H("chunked", b10.d("Transfer-Encoding"), true);
    }

    private final boolean t(C15776D d10) {
        return C15854t.H("chunked", C15776D.o(d10, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final L u() {
        if (this.f136628e == 1) {
            this.f136628e = 2;
            return new C3359b();
        }
        throw new IllegalStateException(("state: " + this.f136628e).toString());
    }

    private final N v(C15803v vVar) {
        if (this.f136628e == 4) {
            this.f136628e = 5;
            return new c(this, vVar);
        }
        throw new IllegalStateException(("state: " + this.f136628e).toString());
    }

    private final N w(long j10) {
        if (this.f136628e == 4) {
            this.f136628e = 5;
            return new e(j10);
        }
        throw new IllegalStateException(("state: " + this.f136628e).toString());
    }

    private final L x() {
        if (this.f136628e == 1) {
            this.f136628e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f136628e).toString());
    }

    private final N y() {
        if (this.f136628e == 4) {
            this.f136628e = 5;
            b().B();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f136628e).toString());
    }

    public final void A(C15802u uVar, String str) {
        C17542s.j(uVar, "headers");
        C17542s.j(str, "requestLine");
        if (this.f136628e == 0) {
            this.f136627d.D0(str).D0("\r\n");
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f136627d.D0(uVar.k(i10)).D0(": ").D0(uVar.t(i10)).D0("\r\n");
            }
            this.f136627d.D0("\r\n");
            this.f136628e = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f136628e).toString());
    }

    public void a() {
        this.f136627d.flush();
    }

    public LK.f b() {
        return this.f136625b;
    }

    public void c(C15774B b10) {
        C17542s.j(b10, "request");
        i iVar = i.f136473a;
        Proxy.Type type = b().C().b().type();
        C17542s.i(type, "connection.route().proxy.type()");
        A(b10.e(), iVar.a(b10, type));
    }

    public void cancel() {
        b().g();
    }

    public long d(C15776D d10) {
        C17542s.j(d10, "response");
        if (!MK.e.b(d10)) {
            return 0;
        }
        if (t(d10)) {
            return -1;
        }
        return C15864d.v(d10);
    }

    public L e(C15774B b10, long j10) {
        C17542s.j(b10, "request");
        if (b10.a() != null && b10.a().f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (s(b10)) {
            return u();
        } else {
            if (j10 != -1) {
                return x();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public C15776D.a f(boolean z10) {
        int i10 = this.f136628e;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            try {
                k a10 = k.f136476d.a(this.f136629f.b());
                C15776D.a k10 = new C15776D.a().p(a10.f136477a).g(a10.f136478b).m(a10.f136479c).k(this.f136629f.a());
                if (z10 && a10.f136478b == 100) {
                    return null;
                }
                int i11 = a10.f136478b;
                if (i11 == 100) {
                    this.f136628e = 3;
                    return k10;
                } else if (102 > i11 || i11 >= 200) {
                    this.f136628e = 4;
                    return k10;
                } else {
                    this.f136628e = 3;
                    return k10;
                }
            } catch (EOFException e10) {
                String r10 = b().C().a().l().r();
                throw new IOException("unexpected end of stream on " + r10, e10);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f136628e).toString());
        }
    }

    public void g() {
        this.f136627d.flush();
    }

    public N h(C15776D d10) {
        C17542s.j(d10, "response");
        if (!MK.e.b(d10)) {
            return w(0);
        }
        if (t(d10)) {
            return v(d10.z().k());
        }
        long v10 = C15864d.v(d10);
        return v10 != -1 ? w(v10) : y();
    }

    public final void z(C15776D d10) {
        C17542s.j(d10, "response");
        long v10 = C15864d.v(d10);
        if (v10 != -1) {
            N w10 = w(v10);
            C15864d.N(w10, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            w10.close();
        }
    }
}
