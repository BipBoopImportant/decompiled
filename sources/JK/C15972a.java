package JK;

import GK.C15773A;
import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15784c;
import GK.C15786e;
import GK.C15799r;
import GK.C15802u;
import GK.C15804w;
import HJ.C15854t;
import HK.C15864d;
import JK.C15974c;
import LK.e;
import MK.f;
import MK.h;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import WK.L;
import WK.N;
import WK.O;
import WK.y;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\nB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LJK/a;", "LGK/w;", "LGK/c;", "cache", "<init>", "(LGK/c;)V", "LJK/b;", "cacheRequest", "LGK/D;", "response", "a", "(LJK/b;LGK/D;)LGK/D;", "LGK/w$a;", "chain", "intercept", "(LGK/w$a;)LGK/D;", "LGK/c;", "getCache$okhttp", "()LGK/c;", "b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: JK.a  reason: case insensitive filesystem */
public final class C15972a implements C15804w {

    /* renamed from: b  reason: collision with root package name */
    public static final C3340a f135811b = new C3340a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15784c f135812a;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"LJK/a$a;", "", "<init>", "()V", "LGK/D;", "response", "f", "(LGK/D;)LGK/D;", "LGK/u;", "cachedHeaders", "networkHeaders", "c", "(LGK/u;LGK/u;)LGK/u;", "", "fieldName", "", "e", "(Ljava/lang/String;)Z", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.a$a  reason: collision with other inner class name */
    public static final class C3340a {
        public /* synthetic */ C3340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final C15802u c(C15802u uVar, C15802u uVar2) {
            C15802u.a aVar = new C15802u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String k10 = uVar.k(i10);
                String t10 = uVar.t(i10);
                if ((!C15854t.H("Warning", k10, true) || !C15854t.W(t10, "1", false, 2, (Object) null)) && (d(k10) || !e(k10) || uVar2.b(k10) == null)) {
                    aVar.d(k10, t10);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String k11 = uVar2.k(i11);
                if (!d(k11) && e(k11)) {
                    aVar.d(k11, uVar2.t(i11));
                }
            }
            return aVar.f();
        }

        private final boolean d(String str) {
            return C15854t.H("Content-Length", str, true) || C15854t.H("Content-Encoding", str, true) || C15854t.H("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return !C15854t.H("Connection", str, true) && !C15854t.H("Keep-Alive", str, true) && !C15854t.H("Proxy-Authenticate", str, true) && !C15854t.H("Proxy-Authorization", str, true) && !C15854t.H("TE", str, true) && !C15854t.H("Trailers", str, true) && !C15854t.H("Transfer-Encoding", str, true) && !C15854t.H("Upgrade", str, true);
        }

        /* access modifiers changed from: private */
        public final C15776D f(C15776D d10) {
            return (d10 != null ? d10.c() : null) != null ? d10.u().b((C15777E) null).c() : d10;
        }

        private C3340a() {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"JK/a$b", "LWK/N;", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "LWK/O;", "y", "()LWK/O;", "LXH/N;", "close", "()V", "", "a", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.a$b */
    public static final class b implements N {

        /* renamed from: a  reason: collision with root package name */
        private boolean f135813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16772g f135814b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15973b f135815c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16771f f135816d;

        b(C16772g gVar, C15973b bVar, C16771f fVar) {
            this.f135814b = gVar;
            this.f135815c = bVar;
            this.f135816d = fVar;
        }

        public void close() {
            if (!this.f135813a && !C15864d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f135813a = true;
                this.f135815c.k();
            }
            this.f135814b.close();
        }

        public long u0(C16770e eVar, long j10) {
            C17542s.j(eVar, "sink");
            try {
                long u02 = this.f135814b.u0(eVar, j10);
                if (u02 == -1) {
                    if (!this.f135813a) {
                        this.f135813a = true;
                        this.f135816d.close();
                    }
                    return -1;
                }
                eVar.l(this.f135816d.p(), eVar.size() - u02, u02);
                this.f135816d.n0();
                return u02;
            } catch (IOException e10) {
                if (!this.f135813a) {
                    this.f135813a = true;
                    this.f135815c.k();
                }
                throw e10;
            }
        }

        public O y() {
            return this.f135814b.y();
        }
    }

    public C15972a(C15784c cVar) {
        this.f135812a = cVar;
    }

    private final C15776D a(C15973b bVar, C15776D d10) {
        if (bVar == null) {
            return d10;
        }
        L a10 = bVar.a();
        C15777E c10 = d10.c();
        C17542s.g(c10);
        b bVar2 = new b(c10.k3(), bVar, y.c(a10));
        return d10.u().b(new h(C15776D.o(d10, "Content-Type", (String) null, 2, (Object) null), d10.c().g(), y.d(bVar2))).c();
    }

    public C15776D intercept(C15804w.a aVar) {
        C15799r rVar;
        C15777E c10;
        C15777E c11;
        C17542s.j(aVar, "chain");
        C15786e call = aVar.call();
        C15784c cVar = this.f135812a;
        e eVar = null;
        C15776D d10 = cVar != null ? cVar.d(aVar.t()) : null;
        C15974c b10 = new C15974c.b(System.currentTimeMillis(), aVar.t(), d10).b();
        C15774B b11 = b10.b();
        C15776D a10 = b10.a();
        C15784c cVar2 = this.f135812a;
        if (cVar2 != null) {
            cVar2.o(b10);
        }
        if (call instanceof e) {
            eVar = (e) call;
        }
        if (eVar == null || (rVar = eVar.o()) == null) {
            rVar = C15799r.f135090b;
        }
        if (!(d10 == null || a10 != null || (c11 = d10.c()) == null)) {
            C15864d.m(c11);
        }
        if (b11 == null && a10 == null) {
            C15776D c12 = new C15776D.a().r(aVar.t()).p(C15773A.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(C15864d.f135358c).s(-1).q(System.currentTimeMillis()).c();
            rVar.A(call, c12);
            return c12;
        } else if (b11 == null) {
            C17542s.g(a10);
            C15776D c13 = a10.u().d(f135811b.f(a10)).c();
            rVar.b(call, c13);
            return c13;
        } else {
            if (a10 != null) {
                rVar.a(call, a10);
            } else if (this.f135812a != null) {
                rVar.c(call);
            }
            try {
                C15776D b12 = aVar.b(b11);
                if (!(b12 != null || d10 == null || c10 == null)) {
                }
                if (a10 != null) {
                    if (b12 == null || b12.g() != 304) {
                        C15777E c14 = a10.c();
                        if (c14 != null) {
                            C15864d.m(c14);
                        }
                    } else {
                        C15776D.a u10 = a10.u();
                        C3340a aVar2 = f135811b;
                        C15776D c15 = u10.k(aVar2.c(a10.q(), b12.q())).s(b12.B()).q(b12.x()).d(aVar2.f(a10)).n(aVar2.f(b12)).c();
                        C15777E c16 = b12.c();
                        C17542s.g(c16);
                        c16.close();
                        C15784c cVar3 = this.f135812a;
                        C17542s.g(cVar3);
                        cVar3.n();
                        this.f135812a.q(a10, c15);
                        rVar.b(call, c15);
                        return c15;
                    }
                }
                C17542s.g(b12);
                C15776D.a u11 = b12.u();
                C3340a aVar3 = f135811b;
                C15776D c17 = u11.d(aVar3.f(a10)).n(aVar3.f(b12)).c();
                if (this.f135812a != null) {
                    if (MK.e.b(c17) && C15974c.f135817c.a(c17, b11)) {
                        C15776D a11 = a(this.f135812a.g(c17), c17);
                        if (a10 != null) {
                            rVar.c(call);
                        }
                        return a11;
                    } else if (f.f136460a.a(b11.h())) {
                        try {
                            this.f135812a.h(b11);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c17;
            } finally {
                if (!(d10 == null || (c10 = d10.c()) == null)) {
                    C15864d.m(c10);
                }
            }
        }
    }
}
