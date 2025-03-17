package tH;

import AH.C15413d;
import AH.C15416g;
import EH.C15638w;
import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15797p;
import GK.z;
import JH.n;
import LH.C16012b;
import QJ.C16283A;
import QJ.C16310i;
import QJ.C16342y0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YH.g0;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.net.Proxy;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import sH.C17899c;
import sH.C17901e;
import vH.C18184w;
import zH.C18750a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u0001:\u0001<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000fH@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0)8\u0016X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00106\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u00105R\"\u0010:\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0006078\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"LtH/d;", "LsH/c;", "LtH/c;", "config", "<init>", "(LtH/c;)V", "LGK/z;", "engine", "LGK/B;", "engineRequest", "LdI/i;", "callContext", "LAH/g;", "t", "(LGK/z;LGK/B;LdI/i;LdI/e;)Ljava/lang/Object;", "LAH/d;", "requestData", "s", "(LGK/z;LGK/B;LdI/i;LAH/d;LdI/e;)Ljava/lang/Object;", "LGK/D;", "response", "LLH/b;", "requestTime", "", "body", "o", "(LGK/D;LLH/b;Ljava/lang/Object;LdI/i;)LAH/g;", "LvH/w$a;", "timeoutExtension", "q", "(LvH/w$a;)LGK/z;", "data", "O1", "(LAH/d;LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "e", "LtH/c;", "u", "()LtH/c;", "", "LsH/e;", "f", "Ljava/util/Set;", "b2", "()Ljava/util/Set;", "supportedCapabilities", "g", "LdI/i;", "requestsJob", "h", "getCoroutineContext", "()LdI/i;", "coroutineContext", "", "i", "Ljava/util/Map;", "clientCache", "j", "c", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: tH.d  reason: case insensitive filesystem */
public final class C17961d extends C17899c {

    /* renamed from: j  reason: collision with root package name */
    private static final c f147240j = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final C16824o<z> f147241k = C16825p.b(b.f147249c);

    /* renamed from: e  reason: collision with root package name */
    private final C17960c f147242e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<C17901e<?>> f147243f = g0.h(C18184w.f149015d, C18750a.f152799a);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C17168i f147244g;

    /* renamed from: h  reason: collision with root package name */
    private final C17168i f147245h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Map<C18184w.a, z> f147246i = JH.g.a(new C4281d(this), e.f147250c, getConfig().b());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine$1", f = "OkHttpEngine.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: tH.d$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f147247c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17961d f147248d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17961d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f147248d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f147248d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f147247c;
            if (i10 == 0) {
                y.b(obj);
                C17168i.b bVar = this.f147248d.f147244g.get(F0.f137562d0);
                C17542s.g(bVar);
                this.f147247c = 1;
                if (((F0) bVar).j0(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    for (Map.Entry value : this.f147248d.f147246i.entrySet()) {
                        z zVar = (z) value.getValue();
                        zVar.o().a();
                        zVar.u().c().shutdown();
                    }
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            for (Map.Entry value2 : this.f147248d.f147246i.entrySet()) {
                z zVar2 = (z) value2.getValue();
                zVar2.o().a();
                zVar2.u().c().shutdown();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LGK/z;", "b", "()LGK/z;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tH.d$b */
    static final class b extends C17544u implements C17631a<z> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f147249c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final z invoke() {
            return new z.a().c();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LtH/d$c;", "", "<init>", "()V", "LGK/z;", "okHttpClientPrototype$delegate", "LXH/o;", "a", "()LGK/z;", "okHttpClientPrototype", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tH.d$c */
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a() {
            return (z) C17961d.f147241k.getValue();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: tH.d$d  reason: collision with other inner class name */
    /* synthetic */ class C4281d extends C17540p implements C17642l<C18184w.a, z> {
        C4281d(Object obj) {
            super(1, obj, C17961d.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeout$HttpTimeoutCapabilityConfiguration;)Lokhttp3/OkHttpClient;", 0);
        }

        /* renamed from: t */
        public final z invoke(C18184w.a aVar) {
            return ((C17961d) this.receiver).q(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGK/z;", "it", "LXH/N;", "a", "(LGK/z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tH.d$e */
    static final class e extends C17544u implements C17642l<z, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final e f147250c = new e();

        e() {
            super(1);
        }

        public final void a(z zVar) {
            C17542s.j(zVar, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {61, 68, 70}, m = "execute")
    /* renamed from: tH.d$f */
    static final class f extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f147251c;

        /* renamed from: d  reason: collision with root package name */
        Object f147252d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f147253e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17961d f147254f;

        /* renamed from: g  reason: collision with root package name */
        int f147255g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17961d dVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f147254f = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147253e = obj;
            this.f147255g |= Integer.MIN_VALUE;
            return this.f147254f.O1((C15413d) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {103}, m = "executeHttpRequest")
    /* renamed from: tH.d$g */
    static final class g extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f147256c;

        /* renamed from: d  reason: collision with root package name */
        Object f147257d;

        /* renamed from: e  reason: collision with root package name */
        Object f147258e;

        /* renamed from: f  reason: collision with root package name */
        Object f147259f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f147260g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17961d f147261h;

        /* renamed from: i  reason: collision with root package name */
        int f147262i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C17961d dVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f147261h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147260g = obj;
            this.f147262i |= Integer.MIN_VALUE;
            return this.f147261h.s((z) null, (C15774B) null, (C17168i) null, (C15413d) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: tH.d$h */
    static final class h extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15777E f147263c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C15777E e10) {
            super(1);
            this.f147263c = e10;
        }

        public final void a(Throwable th2) {
            C15777E e10 = this.f147263c;
            if (e10 != null) {
                e10.close();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {92}, m = "executeWebSocketRequest")
    /* renamed from: tH.d$i */
    static final class i extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f147264c;

        /* renamed from: d  reason: collision with root package name */
        Object f147265d;

        /* renamed from: e  reason: collision with root package name */
        Object f147266e;

        /* renamed from: f  reason: collision with root package name */
        Object f147267f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f147268g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17961d f147269h;

        /* renamed from: i  reason: collision with root package name */
        int f147270i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C17961d dVar, C17164e<? super i> eVar) {
            super(eVar);
            this.f147269h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f147268g = obj;
            this.f147270i |= Integer.MIN_VALUE;
            return this.f147269h.t((z) null, (C15774B) null, (C17168i) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17961d(C17960c cVar) {
        super("ktor-okhttp");
        C17542s.j(cVar, "config");
        this.f147242e = cVar;
        C17168i.b bVar = super.getCoroutineContext().get(F0.f137562d0);
        C17542s.g(bVar);
        C17168i a10 = n.a((F0) bVar);
        this.f147244g = a10;
        this.f147245h = super.getCoroutineContext().plus(a10);
        C16310i.c(C16342y0.f137687a, super.getCoroutineContext(), T.ATOMIC, new a(this, (C17164e<? super a>) null));
    }

    private final C15416g o(C15776D d10, C16012b bVar, Object obj, C17168i iVar) {
        return new C15416g(new C15638w(d10.g(), d10.s()), bVar, h.c(d10.q()), h.d(d10.w()), obj, iVar);
    }

    /* access modifiers changed from: private */
    public final z q(C18184w.a aVar) {
        z d10 = getConfig().d();
        if (d10 == null) {
            d10 = f147240j.a();
        }
        z.a H10 = d10.H();
        H10.h(new C15797p());
        getConfig().c().invoke(H10);
        Proxy a10 = getConfig().a();
        if (a10 != null) {
            H10.Q(a10);
        }
        if (aVar != null) {
            z.a unused = C17962e.h(H10, aVar);
        }
        return H10.c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: AH.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: dI.i} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(GK.z r6, GK.C15774B r7, dI.C17168i r8, AH.C15413d r9, dI.C17164e<? super AH.C15416g> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof tH.C17961d.g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            tH.d$g r0 = (tH.C17961d.g) r0
            int r1 = r0.f147262i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f147262i = r1
            goto L_0x0018
        L_0x0013:
            tH.d$g r0 = new tH.d$g
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f147260g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f147262i
            r3 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r6 = r0.f147259f
            LH.b r6 = (LH.C16012b) r6
            java.lang.Object r7 = r0.f147258e
            r9 = r7
            AH.d r9 = (AH.C15413d) r9
            java.lang.Object r7 = r0.f147257d
            r8 = r7
            dI.i r8 = (dI.C17168i) r8
            java.lang.Object r7 = r0.f147256c
            tH.d r7 = (tH.C17961d) r7
            XH.y.b(r10)
            goto L_0x0060
        L_0x003b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0043:
            XH.y.b(r10)
            r10 = 0
            LH.b r10 = LH.C16011a.b(r10, r3, r10)
            r0.f147256c = r5
            r0.f147257d = r8
            r0.f147258e = r9
            r0.f147259f = r10
            r0.f147262i = r3
            java.lang.Object r6 = tH.h.b(r6, r7, r9, r0)
            if (r6 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L_0x0060:
            GK.D r10 = (GK.C15776D) r10
            GK.E r0 = r10.c()
            QJ.F0$b r1 = QJ.F0.f137562d0
            dI.i$b r1 = r8.get(r1)
            kotlin.jvm.internal.C17542s.g(r1)
            QJ.F0 r1 = (QJ.F0) r1
            tH.d$h r2 = new tH.d$h
            r2.<init>(r0)
            r1.s(r2)
            if (r0 == 0) goto L_0x0087
            WK.g r0 = r0.k3()
            if (r0 == 0) goto L_0x0087
            io.ktor.utils.io.g r9 = tH.C17962e.i(r0, r8, r9)
            if (r9 != 0) goto L_0x008d
        L_0x0087:
            io.ktor.utils.io.g$a r9 = io.ktor.utils.io.g.f143712a
            io.ktor.utils.io.g r9 = r9.a()
        L_0x008d:
            AH.g r6 = r7.o(r10, r6, r9, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tH.C17961d.s(GK.z, GK.B, dI.i, AH.d, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(GK.z r6, GK.C15774B r7, dI.C17168i r8, dI.C17164e<? super AH.C15416g> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof tH.C17961d.i
            if (r0 == 0) goto L_0x0013
            r0 = r9
            tH.d$i r0 = (tH.C17961d.i) r0
            int r1 = r0.f147270i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f147270i = r1
            goto L_0x0018
        L_0x0013:
            tH.d$i r0 = new tH.d$i
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f147268g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f147270i
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r6 = r0.f147267f
            tH.f r6 = (tH.C17963f) r6
            java.lang.Object r7 = r0.f147266e
            LH.b r7 = (LH.C16012b) r7
            java.lang.Object r8 = r0.f147265d
            dI.i r8 = (dI.C17168i) r8
            java.lang.Object r0 = r0.f147264c
            tH.d r0 = (tH.C17961d) r0
            XH.y.b(r9)
            goto L_0x0075
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r9)
            r9 = 0
            LH.b r9 = LH.C16011a.b(r9, r3, r9)
            tH.f r2 = new tH.f
            tH.c r4 = r5.getConfig()
            GK.H$a r4 = r4.e()
            if (r4 != 0) goto L_0x0056
            r4 = r6
        L_0x0056:
            r2.<init>(r6, r4, r7, r8)
            r2.l()
            QJ.x r6 = r2.j()
            r0.f147264c = r5
            r0.f147265d = r8
            r0.f147266e = r9
            r0.f147267f = r2
            r0.f147270i = r3
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r0 = r5
            r7 = r9
            r9 = r6
            r6 = r2
        L_0x0075:
            GK.D r9 = (GK.C15776D) r9
            AH.g r6 = r0.o(r9, r7, r6, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tH.C17961d.t(GK.z, GK.B, dI.i, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object O1(AH.C15413d r10, dI.C17164e<? super AH.C15416g> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof tH.C17961d.f
            if (r0 == 0) goto L_0x0014
            r0 = r11
            tH.d$f r0 = (tH.C17961d.f) r0
            int r1 = r0.f147255g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f147255g = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            tH.d$f r0 = new tH.d$f
            r0.<init>(r9, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r11 = r6.f147253e
            java.lang.Object r0 = eI.C17187b.f()
            int r1 = r6.f147255g
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r4) goto L_0x003d
            if (r1 == r3) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            XH.y.b(r11)
            goto L_0x0097
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0039:
            XH.y.b(r11)
            goto L_0x0087
        L_0x003d:
            java.lang.Object r10 = r6.f147252d
            AH.d r10 = (AH.C15413d) r10
            java.lang.Object r1 = r6.f147251c
            tH.d r1 = (tH.C17961d) r1
            XH.y.b(r11)
        L_0x0048:
            r5 = r10
            goto L_0x005c
        L_0x004a:
            XH.y.b(r11)
            r6.f147251c = r9
            r6.f147252d = r10
            r6.f147255g = r4
            java.lang.Object r11 = sH.m.b(r6)
            if (r11 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r1 = r9
            goto L_0x0048
        L_0x005c:
            r4 = r11
            dI.i r4 = (dI.C17168i) r4
            GK.B r10 = tH.C17962e.f(r5, r4)
            java.util.Map<vH.w$a, GK.z> r11 = r1.f147246i
            vH.w$b r7 = vH.C18184w.f149015d
            java.lang.Object r7 = r5.c(r7)
            java.lang.Object r11 = r11.get(r7)
            GK.z r11 = (GK.z) r11
            if (r11 == 0) goto L_0x0098
            boolean r7 = AH.C15414e.a(r5)
            r8 = 0
            if (r7 == 0) goto L_0x0088
            r6.f147251c = r8
            r6.f147252d = r8
            r6.f147255g = r3
            java.lang.Object r11 = r1.t(r11, r10, r4, r6)
            if (r11 != r0) goto L_0x0087
            return r0
        L_0x0087:
            return r11
        L_0x0088:
            r6.f147251c = r8
            r6.f147252d = r8
            r6.f147255g = r2
            r2 = r11
            r3 = r10
            java.lang.Object r11 = r1.s(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x0097
            return r0
        L_0x0097:
            return r11
        L_0x0098:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "OkHttpClient can't be constructed because HttpTimeout plugin is not installed"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tH.C17961d.O1(AH.d, dI.e):java.lang.Object");
    }

    public Set<C17901e<?>> b2() {
        return this.f147243f;
    }

    public void close() {
        super.close();
        C17168i.b bVar = this.f147244g.get(F0.f137562d0);
        C17542s.h(bVar, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((C16283A) bVar).l();
    }

    public C17168i getCoroutineContext() {
        return this.f147245h;
    }

    /* renamed from: u */
    public C17960c getConfig() {
        return this.f147242e;
    }
}
