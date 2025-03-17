package tH;

import GK.C15774B;
import GK.C15776D;
import GK.C15780H;
import GK.C15781I;
import GK.z;
import HJ.C15838d;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16423B;
import SJ.C16426b;
import SJ.C16427c;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import SJ.C16440p;
import VH.C16654a;
import VH.C16655b;
import WK.C16773h;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010 J)\u0010$\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00000-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0-8\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080-8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R&\u0010@\u001a\b\u0012\u0004\u0012\u0002050:8\u0016X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010'\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"LtH/f;", "", "LGK/I;", "LGK/z;", "engine", "LGK/H$a;", "webSocketFactory", "LGK/B;", "engineRequest", "LdI/i;", "coroutineContext", "<init>", "(LGK/z;LGK/H$a;LGK/B;LdI/i;)V", "LGK/H;", "webSocket", "LGK/D;", "response", "LXH/N;", "g", "(LGK/H;LGK/D;)V", "LWK/h;", "bytes", "e", "(LGK/H;LWK/h;)V", "", "text", "f", "(LGK/H;Ljava/lang/String;)V", "", "code", "reason", "a", "(LGK/H;ILjava/lang/String;)V", "b", "", "t", "c", "(LGK/H;Ljava/lang/Throwable;LGK/D;)V", "l", "()V", "LGK/z;", "LGK/H$a;", "LdI/i;", "getCoroutineContext", "()LdI/i;", "LQJ/x;", "d", "LQJ/x;", "self", "j", "()LQJ/x;", "originResponse", "LSJ/j;", "LVH/b;", "LSJ/j;", "_incoming", "LVH/a;", "_closeReason", "LSJ/B;", "h", "LSJ/B;", "k", "()LSJ/B;", "getOutgoing$annotations", "outgoing", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: tH.f  reason: case insensitive filesystem */
public final class C17963f extends C15781I implements Q {

    /* renamed from: a  reason: collision with root package name */
    private final z f147291a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C15780H.a f147292b;

    /* renamed from: c  reason: collision with root package name */
    private final C17168i f147293c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16339x<C17963f> f147294d = C16343z.b((F0) null, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final C16339x<C15776D> f147295e = C16343z.b((F0) null, 1, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final C16434j<C16655b> f147296f = C16437m.b(0, (C16428d) null, (C17642l) null, 7, (Object) null);

    /* renamed from: g  reason: collision with root package name */
    private final C16339x<C16654a> f147297g = C16343z.b((F0) null, 1, (Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final C16423B<C16655b> f147298h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/c;", "LVH/b;", "LXH/N;", "<anonymous>", "(LSJ/c;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "io.ktor.client.engine.okhttp.OkHttpWebsocketSession$outgoing$1", f = "OkHttpWebsocketSession.kt", l = {62, 66}, m = "invokeSuspend")
    /* renamed from: tH.f$a */
    static final class a extends l implements p<C16427c<C16655b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f147299c;

        /* renamed from: d  reason: collision with root package name */
        Object f147300d;

        /* renamed from: e  reason: collision with root package name */
        int f147301e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f147302f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17963f f147303g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C15774B f147304h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17963f fVar, C15774B b10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f147303g = fVar;
            this.f147304h = b10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f147303g, this.f147304h, eVar);
            aVar.f147302f = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16427c<C16655b> cVar, C17164e<? super C16807N> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: SJ.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0082 A[Catch:{ all -> 0x001e }, RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[Catch:{ all -> 0x001e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f147301e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0039
                if (r1 == r3) goto L_0x0029
                if (r1 != r2) goto L_0x0021
                java.lang.Object r1 = r9.f147300d
                SJ.l r1 = (SJ.C16436l) r1
                java.lang.Object r3 = r9.f147299c
                VH.a r3 = (VH.C16654a) r3
                java.lang.Object r4 = r9.f147302f
                GK.H r4 = (GK.C15780H) r4
                XH.y.b(r10)     // Catch:{ all -> 0x001e }
                goto L_0x0083
            L_0x001e:
                r10 = move-exception
                goto L_0x00ff
            L_0x0021:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0029:
                java.lang.Object r1 = r9.f147300d
                GK.B r1 = (GK.C15774B) r1
                java.lang.Object r3 = r9.f147299c
                GK.H$a r3 = (GK.C15780H.a) r3
                java.lang.Object r4 = r9.f147302f
                SJ.c r4 = (SJ.C16427c) r4
                XH.y.b(r10)
                goto L_0x0061
            L_0x0039:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f147302f
                r4 = r10
                SJ.c r4 = (SJ.C16427c) r4
                tH.f r10 = r9.f147303g
                GK.H$a r10 = r10.f147292b
                GK.B r1 = r9.f147304h
                tH.f r5 = r9.f147303g
                QJ.x r5 = r5.f147294d
                r9.f147302f = r4
                r9.f147299c = r10
                r9.f147300d = r1
                r9.f147301e = r3
                java.lang.Object r3 = r5.f(r9)
                if (r3 != r0) goto L_0x005e
                return r0
            L_0x005e:
                r8 = r3
                r3 = r10
                r10 = r8
            L_0x0061:
                GK.I r10 = (GK.C15781I) r10
                GK.H r10 = r3.a(r1, r10)
                VH.a r3 = tH.C17964g.f147305a
                SJ.j r1 = r4.d()     // Catch:{ all -> 0x00fc }
                SJ.l r1 = r1.iterator()     // Catch:{ all -> 0x00fc }
                r4 = r10
            L_0x0074:
                r9.f147302f = r4     // Catch:{ all -> 0x001e }
                r9.f147299c = r3     // Catch:{ all -> 0x001e }
                r9.f147300d = r1     // Catch:{ all -> 0x001e }
                r9.f147301e = r2     // Catch:{ all -> 0x001e }
                java.lang.Object r10 = r1.a(r9)     // Catch:{ all -> 0x001e }
                if (r10 != r0) goto L_0x0083
                return r0
            L_0x0083:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x001e }
                boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x001e }
                if (r10 == 0) goto L_0x00e9
                java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x001e }
                VH.b r10 = (VH.C16655b) r10     // Catch:{ all -> 0x001e }
                boolean r5 = r10 instanceof VH.C16655b.a     // Catch:{ all -> 0x001e }
                if (r5 == 0) goto L_0x00a9
                WK.h$a r5 = WK.C16773h.f139664d     // Catch:{ all -> 0x001e }
                byte[] r6 = r10.b()     // Catch:{ all -> 0x001e }
                byte[] r10 = r10.b()     // Catch:{ all -> 0x001e }
                int r10 = r10.length     // Catch:{ all -> 0x001e }
                r7 = 0
                WK.h r10 = r5.e(r6, r7, r10)     // Catch:{ all -> 0x001e }
                r4.b(r10)     // Catch:{ all -> 0x001e }
                goto L_0x0074
            L_0x00a9:
                boolean r5 = r10 instanceof VH.C16655b.d     // Catch:{ all -> 0x001e }
                if (r5 == 0) goto L_0x00bc
                java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x001e }
                byte[] r10 = r10.b()     // Catch:{ all -> 0x001e }
                java.nio.charset.Charset r6 = HJ.C15838d.f135279b     // Catch:{ all -> 0x001e }
                r5.<init>(r10, r6)     // Catch:{ all -> 0x001e }
                r4.a(r5)     // Catch:{ all -> 0x001e }
                goto L_0x0074
            L_0x00bc:
                boolean r0 = r10 instanceof VH.C16655b.C3411b     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x00e3
                VH.b$b r10 = (VH.C16655b.C3411b) r10     // Catch:{ all -> 0x001e }
                VH.a r10 = VH.C16656c.a(r10)     // Catch:{ all -> 0x001e }
                kotlin.jvm.internal.C17542s.g(r10)     // Catch:{ all -> 0x001e }
                boolean r0 = tH.C17964g.c(r10)     // Catch:{ all -> 0x001e }
                if (r0 != 0) goto L_0x00d0
                r3 = r10
            L_0x00d0:
                XH.N r10 = XH.C16807N.f139792a     // Catch:{ all -> 0x001e }
                short r0 = r3.a()     // Catch:{ all -> 0x00de }
                java.lang.String r1 = r3.c()     // Catch:{ all -> 0x00de }
                r4.f(r0, r1)     // Catch:{ all -> 0x00de }
                return r10
            L_0x00de:
                r10 = move-exception
                r4.cancel()
                throw r10
            L_0x00e3:
                tH.k r0 = new tH.k     // Catch:{ all -> 0x001e }
                r0.<init>(r10)     // Catch:{ all -> 0x001e }
                throw r0     // Catch:{ all -> 0x001e }
            L_0x00e9:
                short r10 = r3.a()     // Catch:{ all -> 0x00f7 }
                java.lang.String r0 = r3.c()     // Catch:{ all -> 0x00f7 }
                r4.f(r10, r0)     // Catch:{ all -> 0x00f7 }
                XH.N r10 = XH.C16807N.f139792a
                return r10
            L_0x00f7:
                r10 = move-exception
                r4.cancel()
                throw r10
            L_0x00fc:
                r0 = move-exception
                r4 = r10
                r10 = r0
            L_0x00ff:
                short r0 = r3.a()     // Catch:{ all -> 0x010b }
                java.lang.String r1 = r3.c()     // Catch:{ all -> 0x010b }
                r4.f(r0, r1)     // Catch:{ all -> 0x010b }
                throw r10
            L_0x010b:
                r10 = move-exception
                r4.cancel()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tH.C17963f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C17963f(z zVar, C15780H.a aVar, C15774B b10, C17168i iVar) {
        C17542s.j(zVar, "engine");
        C17542s.j(aVar, "webSocketFactory");
        C17542s.j(b10, "engineRequest");
        C17542s.j(iVar, "coroutineContext");
        this.f147291a = zVar;
        this.f147292b = aVar;
        this.f147293c = iVar;
        this.f147298h = C16426b.b(this, (C17168i) null, 0, (T) null, (C17642l) null, new a(this, b10, (C17164e<? super a>) null), 15, (Object) null);
    }

    public void a(C15780H h10, int i10, String str) {
        Object obj;
        C17542s.j(h10, "webSocket");
        C17542s.j(str, "reason");
        super.a(h10, i10, str);
        short s10 = (short) i10;
        this.f147297g.J(new C16654a(s10, str));
        C16423B.a.a(this.f147296f, (Throwable) null, 1, (Object) null);
        C16423B<C16655b> k10 = k();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WebSocket session closed with code ");
        C16654a.C3409a a10 = C16654a.C3409a.Companion.a(s10);
        if (a10 == null || (obj = a10.toString()) == null) {
            obj = Integer.valueOf(i10);
        }
        sb2.append(obj);
        sb2.append('.');
        k10.a(new CancellationException(sb2.toString()));
    }

    public void b(C15780H h10, int i10, String str) {
        C17542s.j(h10, "webSocket");
        C17542s.j(str, "reason");
        super.b(h10, i10, str);
        short s10 = (short) i10;
        this.f147297g.J(new C16654a(s10, str));
        try {
            C16440p.b(k(), new C16655b.C3411b(new C16654a(s10, str)));
        } catch (Throwable unused) {
        }
        C16423B.a.a(this.f147296f, (Throwable) null, 1, (Object) null);
    }

    public void c(C15780H h10, Throwable th2, C15776D d10) {
        C17542s.j(h10, "webSocket");
        C17542s.j(th2, "t");
        super.c(h10, th2, d10);
        this.f147297g.g(th2);
        this.f147295e.g(th2);
        this.f147296f.a(th2);
        k().a(th2);
    }

    public void e(C15780H h10, C16773h hVar) {
        C17542s.j(h10, "webSocket");
        C17542s.j(hVar, "bytes");
        super.e(h10, hVar);
        C16440p.b(this.f147296f, new C16655b.a(true, hVar.b0()));
    }

    public void f(C15780H h10, String str) {
        C17542s.j(h10, "webSocket");
        C17542s.j(str, "text");
        super.f(h10, str);
        C16434j<C16655b> jVar = this.f147296f;
        byte[] bytes = str.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "getBytes(...)");
        C16440p.b(jVar, new C16655b.d(true, bytes));
    }

    public void g(C15780H h10, C15776D d10) {
        C17542s.j(h10, "webSocket");
        C17542s.j(d10, "response");
        super.g(h10, d10);
        this.f147295e.J(d10);
    }

    public C17168i getCoroutineContext() {
        return this.f147293c;
    }

    public final C16339x<C15776D> j() {
        return this.f147295e;
    }

    public C16423B<C16655b> k() {
        return this.f147298h;
    }

    public final void l() {
        this.f147294d.J(this);
    }
}
