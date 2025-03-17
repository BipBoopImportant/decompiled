package LK;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15777E;
import GK.C15799r;
import MK.d;
import MK.h;
import UK.C16637d;
import WK.C16770e;
import WK.C16779n;
import WK.C16780o;
import WK.L;
import WK.N;
import WK.y;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00024-B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u000e¢\u0006\u0004\b+\u0010\u001bJ\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u001bJ\r\u0010-\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u001bJ\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u001bJ9\u00104\u001a\u00028\u0000\"\n\b\u0000\u0010/*\u0004\u0018\u00010\f2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010@R$\u0010E\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0000@BX\u000e¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010DR$\u0010G\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u00158\u0000@BX\u000e¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\bF\u0010DR\u001a\u0010L\u001a\u00020H8\u0000X\u0004¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u00158@X\u0004¢\u0006\u0006\u001a\u0004\bM\u0010D¨\u0006O"}, d2 = {"LLK/c;", "", "LLK/e;", "call", "LGK/r;", "eventListener", "LLK/d;", "finder", "LMK/d;", "codec", "<init>", "(LLK/e;LGK/r;LLK/d;LMK/d;)V", "Ljava/io/IOException;", "e", "LXH/N;", "u", "(Ljava/io/IOException;)V", "LGK/B;", "request", "w", "(LGK/B;)V", "", "duplex", "LWK/L;", "c", "(LGK/B;Z)LWK/L;", "f", "()V", "t", "expectContinue", "LGK/D$a;", "r", "(Z)LGK/D$a;", "LGK/D;", "response", "s", "(LGK/D;)V", "LGK/E;", "q", "(LGK/D;)LGK/E;", "LUK/d$d;", "n", "()LUK/d$d;", "v", "o", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "p", "LLK/e;", "g", "()LLK/e;", "LGK/r;", "i", "()LGK/r;", "LLK/d;", "j", "()LLK/d;", "LMK/d;", "<set-?>", "Z", "m", "()Z", "isDuplex", "k", "hasFailure", "LLK/f;", "LLK/f;", "h", "()LLK/f;", "connection", "l", "isCoalescedConnection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final e f136123a;

    /* renamed from: b  reason: collision with root package name */
    private final C15799r f136124b;

    /* renamed from: c  reason: collision with root package name */
    private final d f136125c;

    /* renamed from: d  reason: collision with root package name */
    private final d f136126d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f136127e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f136128f;

    /* renamed from: g  reason: collision with root package name */
    private final f f136129g;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u0000\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001e"}, d2 = {"LLK/c$a;", "LWK/n;", "LWK/L;", "delegate", "", "contentLength", "<init>", "(LLK/c;LWK/L;J)V", "Ljava/io/IOException;", "E", "e", "c", "(Ljava/io/IOException;)Ljava/io/IOException;", "LWK/e;", "source", "byteCount", "LXH/N;", "s3", "(LWK/e;J)V", "flush", "()V", "close", "b", "J", "", "Z", "completed", "d", "bytesReceived", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends C16779n {

        /* renamed from: b  reason: collision with root package name */
        private final long f136130b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f136131c;

        /* renamed from: d  reason: collision with root package name */
        private long f136132d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f136133e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f136134f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, L l10, long j10) {
            super(l10);
            C17542s.j(l10, "delegate");
            this.f136134f = cVar;
            this.f136130b = j10;
        }

        private final <E extends IOException> E c(E e10) {
            if (this.f136131c) {
                return e10;
            }
            this.f136131c = true;
            return this.f136134f.a(this.f136132d, false, true, e10);
        }

        public void close() {
            if (!this.f136133e) {
                this.f136133e = true;
                long j10 = this.f136130b;
                if (j10 == -1 || this.f136132d == j10) {
                    try {
                        super.close();
                        c((IOException) null);
                    } catch (IOException e10) {
                        throw c(e10);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw c(e10);
            }
        }

        public void s3(C16770e eVar, long j10) {
            C17542s.j(eVar, "source");
            if (!this.f136133e) {
                long j11 = this.f136130b;
                if (j11 == -1 || this.f136132d + j10 <= j11) {
                    try {
                        super.s3(eVar, j10);
                        this.f136132d += j10;
                    } catch (IOException e10) {
                        throw c(e10);
                    }
                } else {
                    throw new ProtocolException("expected " + this.f136130b + " bytes but received " + (this.f136132d + j10));
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u0011*\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"LLK/c$b;", "LWK/o;", "LWK/N;", "delegate", "", "contentLength", "<init>", "(LLK/c;LWK/N;J)V", "LWK/e;", "sink", "byteCount", "u0", "(LWK/e;J)J", "LXH/N;", "close", "()V", "Ljava/io/IOException;", "E", "e", "d", "(Ljava/io/IOException;)Ljava/io/IOException;", "b", "J", "c", "bytesReceived", "", "Z", "invokeStartEvent", "completed", "f", "closed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends C16780o {

        /* renamed from: b  reason: collision with root package name */
        private final long f136135b;

        /* renamed from: c  reason: collision with root package name */
        private long f136136c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f136137d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f136138e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f136139f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ c f136140g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, N n10, long j10) {
            super(n10);
            C17542s.j(n10, "delegate");
            this.f136140g = cVar;
            this.f136135b = j10;
            if (j10 == 0) {
                d((IOException) null);
            }
        }

        public void close() {
            if (!this.f136139f) {
                this.f136139f = true;
                try {
                    super.close();
                    d((IOException) null);
                } catch (IOException e10) {
                    throw d(e10);
                }
            }
        }

        public final <E extends IOException> E d(E e10) {
            if (this.f136138e) {
                return e10;
            }
            this.f136138e = true;
            if (e10 == null && this.f136137d) {
                this.f136137d = false;
                this.f136140g.i().w(this.f136140g.g());
            }
            return this.f136140g.a(this.f136136c, true, false, e10);
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            if (!this.f136139f) {
                try {
                    long u02 = c().u0(eVar, j10);
                    if (this.f136137d) {
                        this.f136137d = false;
                        this.f136140g.i().w(this.f136140g.g());
                    }
                    if (u02 == -1) {
                        d((IOException) null);
                        return -1;
                    }
                    long j11 = this.f136136c + u02;
                    long j12 = this.f136135b;
                    if (j12 != -1) {
                        if (j11 > j12) {
                            throw new ProtocolException("expected " + this.f136135b + " bytes but received " + j11);
                        }
                    }
                    this.f136136c = j11;
                    if (j11 == j12) {
                        d((IOException) null);
                    }
                    return u02;
                } catch (IOException e10) {
                    throw d(e10);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    public c(e eVar, C15799r rVar, d dVar, d dVar2) {
        C17542s.j(eVar, "call");
        C17542s.j(rVar, "eventListener");
        C17542s.j(dVar, "finder");
        C17542s.j(dVar2, "codec");
        this.f136123a = eVar;
        this.f136124b = rVar;
        this.f136125c = dVar;
        this.f136126d = dVar2;
        this.f136129g = dVar2.b();
    }

    private final void u(IOException iOException) {
        this.f136128f = true;
        this.f136125c.h(iOException);
        this.f136126d.b().I(this.f136123a, iOException);
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            u(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.f136124b.s(this.f136123a, e10);
            } else {
                this.f136124b.q(this.f136123a, j10);
            }
        }
        if (z10) {
            if (e10 != null) {
                this.f136124b.x(this.f136123a, e10);
            } else {
                this.f136124b.v(this.f136123a, j10);
            }
        }
        return this.f136123a.y(this, z11, z10, e10);
    }

    public final void b() {
        this.f136126d.cancel();
    }

    public final L c(C15774B b10, boolean z10) {
        C17542s.j(b10, "request");
        this.f136127e = z10;
        C15775C a10 = b10.a();
        C17542s.g(a10);
        long a11 = a10.a();
        this.f136124b.r(this.f136123a);
        return new a(this, this.f136126d.e(b10, a11), a11);
    }

    public final void d() {
        this.f136126d.cancel();
        this.f136123a.y(this, true, true, null);
    }

    public final void e() {
        try {
            this.f136126d.a();
        } catch (IOException e10) {
            this.f136124b.s(this.f136123a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void f() {
        try {
            this.f136126d.g();
        } catch (IOException e10) {
            this.f136124b.s(this.f136123a, e10);
            u(e10);
            throw e10;
        }
    }

    public final e g() {
        return this.f136123a;
    }

    public final f h() {
        return this.f136129g;
    }

    public final C15799r i() {
        return this.f136124b;
    }

    public final d j() {
        return this.f136125c;
    }

    public final boolean k() {
        return this.f136128f;
    }

    public final boolean l() {
        return !C17542s.e(this.f136125c.d().l().i(), this.f136129g.C().a().l().i());
    }

    public final boolean m() {
        return this.f136127e;
    }

    public final C16637d.C3407d n() {
        this.f136123a.G();
        return this.f136126d.b().z(this);
    }

    public final void o() {
        this.f136126d.b().B();
    }

    public final void p() {
        this.f136123a.y(this, true, false, null);
    }

    public final C15777E q(C15776D d10) {
        C17542s.j(d10, "response");
        try {
            String o10 = C15776D.o(d10, "Content-Type", (String) null, 2, (Object) null);
            long d11 = this.f136126d.d(d10);
            return new h(o10, d11, y.d(new b(this, this.f136126d.h(d10), d11)));
        } catch (IOException e10) {
            this.f136124b.x(this.f136123a, e10);
            u(e10);
            throw e10;
        }
    }

    public final C15776D.a r(boolean z10) {
        try {
            C15776D.a f10 = this.f136126d.f(z10);
            if (f10 != null) {
                f10.l(this);
            }
            return f10;
        } catch (IOException e10) {
            this.f136124b.x(this.f136123a, e10);
            u(e10);
            throw e10;
        }
    }

    public final void s(C15776D d10) {
        C17542s.j(d10, "response");
        this.f136124b.y(this.f136123a, d10);
    }

    public final void t() {
        this.f136124b.z(this.f136123a);
    }

    public final void v() {
        a(-1, true, true, (IOException) null);
    }

    public final void w(C15774B b10) {
        C17542s.j(b10, "request");
        try {
            this.f136124b.u(this.f136123a);
            this.f136126d.c(b10);
            this.f136124b.t(this.f136123a, b10);
        } catch (IOException e10) {
            this.f136124b.s(this.f136123a, e10);
            u(e10);
            throw e10;
        }
    }
}
